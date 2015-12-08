// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.browse.volley;

import android.content.Context;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.service.browse.BrowseAgent;
import com.netflix.mediaclient.service.browse.BrowseAgentCallback;
import com.netflix.mediaclient.service.browse.cache.HardCache;
import com.netflix.mediaclient.service.browse.cache.SoftCache;
import com.netflix.mediaclient.service.webclient.model.leafs.ListOfMoviesSummary;
import com.netflix.mediaclient.service.webclient.volley.FalcorParseException;
import com.netflix.mediaclient.service.webclient.volley.FalcorParseUtils;
import com.netflix.mediaclient.service.webclient.volley.FalcorServerException;
import com.netflix.mediaclient.service.webclient.volley.FalcorVolleyWebClientRequest;
import com.netflix.mediaclient.servicemgr.LoMo;
import com.netflix.mediaclient.servicemgr.LoMoType;
import com.netflix.mediaclient.servicemgr.LoMoUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.netflix.mediaclient.service.browse.volley:
//            FetchVideosRequest, FetchCWVideosRequest

public class PrefetchHomeLoLoMoRequest extends FalcorVolleyWebClientRequest
{

    private static final String FIELD_LOLOMO = "lolomo";
    private static final String FIELD_PATH = "path";
    private static final String TAG = "nf_service_browse_prefetchhomelolomorequest";
    private final int fromCWVideo;
    private int fromCharactersVideo;
    private final int fromLoMo;
    private final int fromSimilars = 0;
    private final int fromVideo;
    private final HardCache hardCache;
    private String pqlCharactersQuery;
    private final String pqlQuery;
    private final String pqlQuery2;
    private final String pqlQuery3;
    private final String pqlQuery4;
    private final String pqlQuery5;
    private final String pqlQuery6;
    private long rDurationInMs;
    private long rEnd;
    private final long rStart = System.nanoTime();
    private final BrowseAgentCallback responseCallback;
    private final SoftCache softCache;
    private final int toCWVideo;
    private int toCharactersVideo;
    private final int toLoMo;
    private final int toSimilars;
    private final int toVideo;
    private final boolean userConnectedToFacebook;
    private final SoftCache weakSeasonsCache;

    public PrefetchHomeLoLoMoRequest(Context context, com.netflix.mediaclient.service.ServiceAgent.ConfigurationAgentInterface configurationagentinterface, HardCache hardcache, SoftCache softcache, SoftCache softcache1, int i, int j, 
            int k, int l, int i1, int j1, int k1, boolean flag, boolean flag1, 
            BrowseAgentCallback browseagentcallback)
    {
        super(context, configurationagentinterface);
        fromCharactersVideo = -1;
        toCharactersVideo = -1;
        responseCallback = browseagentcallback;
        fromLoMo = i;
        toLoMo = j;
        fromVideo = k;
        toVideo = l;
        fromCWVideo = i1;
        toCWVideo = j1;
        toSimilars = k1;
        userConnectedToFacebook = flag1;
        hardCache = hardcache;
        softCache = softcache;
        weakSeasonsCache = softcache1;
        pqlQuery = (new StringBuilder("['lolomo'")).append(",{'from':").append(i).append(",'to':").append(j).append("},'summary']").toString();
        pqlQuery2 = (new StringBuilder("['lolomo'")).append(",{'from':").append(i).append(",'to':").append(j).append("},{'from':").append(k).append(",'to':").append(l).append("},['summary','billboardDetail']]").toString();
        pqlQuery3 = (new StringBuilder("['lolomo'")).append(",'continueWatching'").append(",{'from':").append(i1).append(",'to':").append(j1).append("},['summary', 'detail', 'rating', 'inQueue', 'bookmark', 'bookmarkStill', 'socialEvidence']]").toString();
        pqlQuery4 = (new StringBuilder("['lolomo'")).append(",'continueWatching").append("', {'to':").append(j1).append(",'from':").append(i1).append("},'episodes', 'current', ['detail', 'bookmark']]").toString();
        pqlQuery5 = (new StringBuilder("['lolomo'")).append(",'continueWatching").append("', {'to':").append(j1).append(",'from':").append(i1).append("}, 'similars',").append("{'to':").append(k1).append(",'from':").append(fromSimilars).append("}, 'summary']").toString();
        pqlQuery6 = (new StringBuilder("['lolomo'")).append(",'continueWatching").append("', {'to':").append(j1).append(",'from':").append(i1).append("}, 'similars','summary']").toString();
        if (flag)
        {
            fromCharactersVideo = l + 1;
            toCharactersVideo = (l - k) + fromCharactersVideo;
            pqlCharactersQuery = String.format("['lolomo','characters',{'from':%d,'to':%d},['summary']]", new Object[] {
                Integer.valueOf(fromCharactersVideo), Integer.valueOf(toCharactersVideo)
            });
        }
        if (Log.isLoggable("nf_service_browse_prefetchhomelolomorequest", 2))
        {
            Log.v("nf_service_browse_prefetchhomelolomorequest", (new StringBuilder()).append("PQL = ").append(pqlQuery).toString());
            Log.v("nf_service_browse_prefetchhomelolomorequest", (new StringBuilder()).append("PQL2 = ").append(pqlQuery2).toString());
            Log.v("nf_service_browse_prefetchhomelolomorequest", (new StringBuilder()).append("PQL3 = ").append(pqlQuery3).toString());
            Log.v("nf_service_browse_prefetchhomelolomorequest", (new StringBuilder()).append("PQL4 = ").append(pqlQuery4).toString());
            Log.v("nf_service_browse_prefetchhomelolomorequest", (new StringBuilder()).append("PQL5 = ").append(pqlQuery5).toString());
            Log.v("nf_service_browse_prefetchhomelolomorequest", (new StringBuilder()).append("PQL6 = ").append(pqlQuery6).toString());
            Log.v("nf_service_browse_prefetchhomelolomorequest", (new StringBuilder()).append("pqlCharactersQuery = ").append(pqlCharactersQuery).toString());
        }
    }

    private void handleExtraChacterDataIfAvailable(JsonObject jsonobject)
    {
        if (!jsonobject.has("characters"))
        {
            Log.v("nf_service_browse_prefetchhomelolomorequest", "No extra characters found in lolomo data");
        } else
        {
            Object obj = jsonobject.getAsJsonObject("characters");
            jsonobject = FetchVideosRequest.buildVideoList(LoMoType.CHARACTERS, ((JsonObject) (obj)), fromCharactersVideo, toCharactersVideo, false);
            if (!((JsonObject) (obj)).has("path"))
            {
                Log.w("nf_service_browse_prefetchhomelolomorequest", "Chars json does not have a path field - can't parse list id");
                return;
            }
            obj = ((JsonObject) (obj)).getAsJsonArray("path");
            if (obj == null || ((JsonArray) (obj)).size() < 2)
            {
                Log.w("nf_service_browse_prefetchhomelolomorequest", (new StringBuilder()).append("Invalid path array for characters json [path: ").append(obj).append("]").toString());
                return;
            }
            obj = ((JsonArray) (obj)).get(1).getAsString();
            putLoMoInBrowseCache(((String) (obj)), jsonobject, fromCharactersVideo, toCharactersVideo);
            if (Log.isLoggable("nf_service_browse_prefetchhomelolomorequest", 2))
            {
                Log.v("nf_service_browse_prefetchhomelolomorequest", (new StringBuilder()).append("Found ").append(jsonobject.size()).append(" extra characters in lolomoObj, list id: ").append(((String) (obj))).toString());
                return;
            }
        }
    }

    public static void injectSocialData(LoMo lomo, List list)
    {
        list.remove(0);
        LoMoUtils.injectSocialData(lomo, list);
    }

    public static void putCWIdsInCache(HardCache hardcache, ListOfMoviesSummary listofmoviessummary, String s)
    {
        BrowseAgent.putCWLoMoSummary(hardcache, listofmoviessummary);
        BrowseAgent.putCWLoMoIndex(hardcache, String.valueOf(s));
        BrowseAgent.putCWLoMoId(hardcache, listofmoviessummary.getId());
    }

    private void putCWVideosInBrowseCache(Object obj)
    {
        String s = BrowseAgent.buildBrowseCacheKey(BrowseAgent.CACHE_KEY_PREFIX_CW_VIDEOS, "continueWatching", String.valueOf(fromCWVideo), String.valueOf(toCWVideo));
        BrowseAgent.putInBrowseCache(hardCache, s, obj);
    }

    public static void putIQIdsInCache(HardCache hardcache, ListOfMoviesSummary listofmoviessummary, String s)
    {
        BrowseAgent.putIQLoMoSummary(hardcache, listofmoviessummary);
        BrowseAgent.putIQLoMoIndex(hardcache, String.valueOf(s));
        BrowseAgent.putIQLoMoId(hardcache, listofmoviessummary.getId());
    }

    private void putIQVideosInBrowseCache(Object obj)
    {
        String s = BrowseAgent.buildBrowseCacheKey(BrowseAgent.CACHE_KEY_PREFIX_IQ_VIDEOS, "queue", String.valueOf(fromVideo), String.valueOf(toVideo));
        BrowseAgent.putInBrowseCache(hardCache, s, obj);
    }

    public static void putLoLoMoIdInBrowseCache(HardCache hardcache, JsonObject jsonobject)
        throws FalcorParseException
    {
        try
        {
            putLoLoMoIdInBrowseCache(hardcache, jsonobject.getAsJsonArray("path").get(1).getAsString());
            return;
        }
        // Misplaced declaration of an exception variable
        catch (HardCache hardcache)
        {
            Log.v("nf_service_browse_prefetchhomelolomorequest", (new StringBuilder()).append("LoLoMoId path missing in: ").append(jsonobject.toString()).toString());
        }
        throw new FalcorParseException("Missing lolomoId", hardcache);
    }

    private static void putLoLoMoIdInBrowseCache(HardCache hardcache, Object obj)
    {
        BrowseAgent.putInBrowseCache(hardcache, "lolomo_id", obj);
        Log.d("nf_service_browse_prefetchhomelolomorequest", (new StringBuilder()).append("lolomoId =").append(obj).toString());
    }

    private void putLoMoInBrowseCache(String s, Object obj, int i, int j)
    {
        s = BrowseAgent.buildBrowseCacheKey(BrowseAgent.CACHE_KEY_PREFIX_VIDEOS, s, String.valueOf(i), String.valueOf(j));
        BrowseAgent.putInBrowseCache(hardCache, s, obj);
    }

    private void putLoMoSummaryInBrowseCache(Object obj)
    {
        String s = BrowseAgent.buildBrowseCacheKey(BrowseAgent.CACHE_KEY_PREFIX_LOMO, "lolomo", String.valueOf(fromLoMo), String.valueOf(toLoMo));
        BrowseAgent.putInBrowseCache(hardCache, s, obj);
    }

    protected List getPQLQueries()
    {
        ArrayList arraylist = new ArrayList(Arrays.asList(new String[] {
            pqlQuery, pqlQuery2, pqlQuery3, pqlQuery4, pqlQuery5, pqlQuery6
        }));
        if (pqlCharactersQuery != null)
        {
            arraylist.add(pqlCharactersQuery);
        }
        return arraylist;
    }

    protected void onFailure(int i)
    {
        if (responseCallback != null)
        {
            Log.d("nf_service_browse_prefetchhomelolomorequest", "prefetch finished onFailure");
            responseCallback.onLoLoMoPrefetched(i);
        }
    }

    protected volatile void onSuccess(Object obj)
    {
        onSuccess((String)obj);
    }

    protected void onSuccess(String s)
    {
        if (responseCallback != null)
        {
            Log.d("nf_service_browse_prefetchhomelolomorequest", "prefetch finished onSuccess");
            responseCallback.onLoLoMoPrefetched(0);
        }
    }

    protected volatile Object parseFalcorResponse(String s)
        throws FalcorParseException, FalcorServerException
    {
        return parseFalcorResponse(s);
    }

    protected String parseFalcorResponse(String s)
        throws FalcorParseException, FalcorServerException
    {
        rEnd = System.nanoTime();
        rDurationInMs = TimeUnit.MILLISECONDS.convert(rEnd - rStart, TimeUnit.NANOSECONDS);
        Log.d("nf_service_browse_prefetchhomelolomorequest", String.format(" prefetch request took %d ms ", new Object[] {
            Long.valueOf(rDurationInMs)
        }));
        if (Log.isLoggable("nf_service_browse_prefetchhomelolomorequest", 2))
        {
            Log.v("nf_service_browse_prefetchhomelolomorequest", (new StringBuilder()).append("String response to parse = ").append(s.substring(0, Math.min(s.length(), 100))).toString());
        }
        long l = System.nanoTime();
        Object obj = FalcorParseUtils.getDataObj("nf_service_browse_prefetchhomelolomorequest", s);
        if (FalcorParseUtils.isEmpty(((JsonObject) (obj))))
        {
            throw new FalcorParseException("HomeLoLoMoPrefetch empty!!!");
        }
        int i;
        try
        {
            obj = ((JsonObject) (obj)).getAsJsonObject("lolomo");
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            Log.v("nf_service_browse_prefetchhomelolomorequest", (new StringBuilder()).append("String response to parse = ").append(s).toString());
            throw new FalcorParseException("response missing expected json objects", ((Throwable) (obj)));
        }
        if (((JsonObject) (obj)).has("continueWatching"))
        {
            putCWVideosInBrowseCache(FetchCWVideosRequest.buildCWVideoList(((JsonObject) (obj)).getAsJsonObject("continueWatching"), fromCWVideo, toCWVideo, toSimilars, userConnectedToFacebook, hardCache, softCache, weakSeasonsCache));
        }
        handleExtraChacterDataIfAvailable(((JsonObject) (obj)));
        s = new ArrayList();
        i = fromLoMo;
        while (i <= toLoMo) 
        {
            String s1 = Integer.toString(i);
            if (((JsonObject) (obj)).has(s1))
            {
                Object obj1 = ((JsonObject) (obj)).getAsJsonObject(s1);
                ListOfMoviesSummary listofmoviessummary = (ListOfMoviesSummary)FalcorParseUtils.getPropertyObject(((JsonObject) (obj1)), "summary", com/netflix/mediaclient/service/webclient/model/leafs/ListOfMoviesSummary);
                if (listofmoviessummary != null)
                {
                    listofmoviessummary.setListPos(i);
                }
                s.add(listofmoviessummary);
                LoMoType lomotype = listofmoviessummary.getType();
                int j = fromVideo;
                int k = toVideo;
                boolean flag;
                if (!listofmoviessummary.isBillboard())
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                obj1 = FetchVideosRequest.buildVideoList(lomotype, ((JsonObject) (obj1)), j, k, flag);
                if (LoMoUtils.shouldInjectSocialData(listofmoviessummary, userConnectedToFacebook))
                {
                    injectSocialData(listofmoviessummary, ((List) (obj1)));
                }
                putLoMoInBrowseCache(listofmoviessummary.getId(), obj1, fromVideo, toVideo);
                if (listofmoviessummary.getType() == LoMoType.CONTINUE_WATCHING)
                {
                    putCWIdsInCache(hardCache, listofmoviessummary, s1);
                }
                if (listofmoviessummary.getType() == LoMoType.INSTANT_QUEUE)
                {
                    putIQIdsInCache(hardCache, listofmoviessummary, s1);
                    putIQVideosInBrowseCache(obj1);
                }
            }
            i++;
        }
        if (s.size() > 0)
        {
            putLoMoSummaryInBrowseCache(s);
        }
        putLoLoMoIdInBrowseCache(hardCache, ((JsonObject) (obj)));
        long l1 = System.nanoTime();
        rEnd = l1;
        l = TimeUnit.MILLISECONDS.convert(l1 - l, TimeUnit.NANOSECONDS);
        rDurationInMs = TimeUnit.MILLISECONDS.convert(rEnd - rStart, TimeUnit.NANOSECONDS);
        Log.d("nf_service_browse_prefetchhomelolomorequest", String.format(" prefetch parsing took took %d ms ", new Object[] {
            Long.valueOf(l)
        }));
        Log.d("nf_service_browse_prefetchhomelolomorequest", String.format(" prefetch success - took %d ms ", new Object[] {
            Long.valueOf(rDurationInMs)
        }));
        return Integer.toString(0);
    }
}
