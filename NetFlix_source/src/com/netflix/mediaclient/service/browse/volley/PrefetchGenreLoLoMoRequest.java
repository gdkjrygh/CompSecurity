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
import com.netflix.mediaclient.servicemgr.LoMoType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.netflix.mediaclient.service.browse.volley:
//            FetchVideosRequest

public class PrefetchGenreLoLoMoRequest extends FalcorVolleyWebClientRequest
{

    private static final String FIELD_FLATGENRE = "flatGenre";
    private static final String FIELD_PATH = "path";
    private static final String FIELD_TOPGENRE = "topGenre";
    private static final String TAG = "nf_service_browse_prefetchgenrelolomorequest";
    private final HardCache hardCache;
    private final int mFromLoMo;
    private final int mFromVideo;
    private final String mGenreId;
    private final boolean mIsKopExp;
    private final int mToLoMo;
    private final int mToVideo;
    private final String pqlKop;
    private final String pqlQuery;
    private final String pqlQuery2;
    private long rDurationInMs;
    private long rEnd;
    private final long rStart = System.nanoTime();
    private final BrowseAgentCallback responseCallback;
    private final SoftCache softCache;

    public PrefetchGenreLoLoMoRequest(Context context, com.netflix.mediaclient.service.ServiceAgent.ConfigurationAgentInterface configurationagentinterface, boolean flag, HardCache hardcache, SoftCache softcache, String s, int i, 
            int j, int k, int l, BrowseAgentCallback browseagentcallback)
    {
        super(context, configurationagentinterface);
        responseCallback = browseagentcallback;
        mGenreId = s;
        mFromLoMo = i;
        mToLoMo = j;
        mFromVideo = k;
        mToVideo = l;
        hardCache = hardcache;
        softCache = softcache;
        mIsKopExp = flag;
        pqlQuery = (new StringBuilder("['topGenre', '")).append(s).append("',{'from':").append(i).append(",'to':").append(j).append("},'summary']").toString();
        pqlQuery2 = (new StringBuilder("['topGenre','")).append(s).append("',{'from':").append(i).append(",'to':").append(j).append("},{'from':").append(k).append(",'to':").append(l).append("},'summary']").toString();
        pqlKop = String.format("['flatGenre', '%s', {'from':%s, 'to':%s}, 'summary']", new Object[] {
            s, Integer.valueOf(k), Integer.valueOf(l)
        });
        if (Log.isLoggable("nf_service_browse_prefetchgenrelolomorequest", 2))
        {
            if (flag)
            {
                Log.v("nf_service_browse_prefetchgenrelolomorequest", (new StringBuilder()).append("pqlKop= ").append(pqlKop).toString());
            } else
            {
                Log.v("nf_service_browse_prefetchgenrelolomorequest", (new StringBuilder()).append("PQL = ").append(pqlQuery).toString());
                Log.v("nf_service_browse_prefetchgenrelolomorequest", (new StringBuilder()).append("PQL2 = ").append(pqlQuery2).toString());
            }
        }
    }

    public static void putGenreLoLoMoIdInBrowseCache(HardCache hardcache, String s, JsonObject jsonobject)
        throws FalcorParseException
    {
        try
        {
            putGenreLoLoMoIdInBrowseCache(hardcache, s, jsonobject.getAsJsonArray("path").get(1).getAsString());
            return;
        }
        // Misplaced declaration of an exception variable
        catch (HardCache hardcache)
        {
            Log.v("nf_service_browse_prefetchgenrelolomorequest", (new StringBuilder()).append("Genre LoLoMoId path missing in: ").append(jsonobject.toString()).toString());
        }
        throw new FalcorParseException("Missing Genre lolomoId", hardcache);
    }

    private static void putGenreLoLoMoIdInBrowseCache(HardCache hardcache, String s, String s1)
    {
        String s2 = BrowseAgent.buildBrowseGenreLoLoMoCacheKey(s);
        Log.d("nf_service_browse_prefetchgenrelolomorequest", String.format("greneId %s grenreLoLoMoId %s", new Object[] {
            s, s1
        }));
        BrowseAgent.putInBrowseCache(hardcache, s2, s1);
    }

    private void putGenreLoMoInBrowseCache(String s, Object obj)
    {
        s = BrowseAgent.buildBrowseCacheKey(BrowseAgent.CACHE_KEY_PREFIX_GENRE_VIDEOS, s, String.valueOf(mFromVideo), String.valueOf(mToVideo));
        BrowseAgent.putInBrowseCache(softCache, s, obj);
    }

    private void putGenreLoMoSummaryInBrowseCache(Object obj)
    {
        String s = BrowseAgent.buildBrowseCacheKey(BrowseAgent.CACHE_KEY_PREFIX_GENRE_LOMO, mGenreId, String.valueOf(mFromLoMo), String.valueOf(mToLoMo));
        BrowseAgent.putInBrowseCache(hardCache, s, obj);
    }

    protected List getPQLQueries()
    {
        if (mIsKopExp)
        {
            return Arrays.asList(new String[] {
                pqlKop
            });
        } else
        {
            return Arrays.asList(new String[] {
                pqlQuery, pqlQuery2
            });
        }
    }

    protected void onFailure(int i)
    {
        if (responseCallback != null)
        {
            Log.d("nf_service_browse_prefetchgenrelolomorequest", (new StringBuilder()).append("prefetchGenreLoLoMo finished onFailure statusCode=").append(i).toString());
            responseCallback.onGenreLoLoMoPrefetched(i);
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
            Log.d("nf_service_browse_prefetchgenrelolomorequest", "prefetchGenreLoLoMo finished onSuccess");
            responseCallback.onGenreLoLoMoPrefetched(0);
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
        Log.d("nf_service_browse_prefetchgenrelolomorequest", String.format("prefetchGenre request took %d ms ", new Object[] {
            Long.valueOf(rDurationInMs)
        }));
        if (!Log.isLoggable("nf_service_browse_prefetchgenrelolomorequest", 2));
        long l = System.nanoTime();
        JsonObject jsonobject = FalcorParseUtils.getDataObj("nf_service_browse_prefetchgenrelolomorequest", s);
        if (FalcorParseUtils.isEmpty(jsonobject))
        {
            throw new FalcorParseException("GenreLoLoMoPrefetch empty!!!");
        }
        Object obj;
        if (mIsKopExp)
        {
            obj = "flatGenre";
        } else
        {
            obj = "topGenre";
        }
        try
        {
            obj = jsonobject.getAsJsonObject(((String) (obj))).getAsJsonObject(mGenreId);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            Log.v("nf_service_browse_prefetchgenrelolomorequest", (new StringBuilder()).append("String response to parse = ").append(s).toString());
            throw new FalcorParseException("response missing expected json objects", ((Throwable) (obj)));
        }
        long l1;
        if (!mIsKopExp)
        {
            s = new ArrayList();
            int i = mFromLoMo;
            while (i <= mToLoMo) 
            {
                Object obj1 = Integer.toString(i);
                if (((JsonObject) (obj)).has(((String) (obj1))))
                {
                    Object obj2 = ((JsonObject) (obj)).getAsJsonObject(((String) (obj1)));
                    obj1 = (ListOfMoviesSummary)FalcorParseUtils.getPropertyObject(((JsonObject) (obj2)), "summary", com/netflix/mediaclient/service/webclient/model/leafs/ListOfMoviesSummary);
                    if (obj1 != null)
                    {
                        ((ListOfMoviesSummary) (obj1)).setListPos(i);
                    }
                    s.add(obj1);
                    LoMoType lomotype = ((ListOfMoviesSummary) (obj1)).getType();
                    int j = mFromVideo;
                    int k = mToVideo;
                    boolean flag;
                    if (!((ListOfMoviesSummary) (obj1)).isBillboard())
                    {
                        flag = true;
                    } else
                    {
                        flag = false;
                    }
                    obj2 = FetchVideosRequest.buildVideoList(lomotype, ((JsonObject) (obj2)), j, k, flag);
                    putGenreLoMoInBrowseCache(((ListOfMoviesSummary) (obj1)).getId(), obj2);
                }
                i++;
            }
            if (s.size() > 0)
            {
                putGenreLoMoSummaryInBrowseCache(s);
                putGenreLoLoMoIdInBrowseCache(hardCache, mGenreId, ((JsonObject) (obj)));
            }
        } else
        {
            s = FetchVideosRequest.buildVideoList(LoMoType.FLAT_GENRE, ((JsonObject) (obj)), mFromVideo, mToVideo, true);
            putGenreLoMoInBrowseCache(mGenreId, s);
        }
        l1 = System.nanoTime();
        rEnd = l1;
        rDurationInMs = TimeUnit.MILLISECONDS.convert(rEnd - rStart, TimeUnit.NANOSECONDS);
        Log.d("nf_service_browse_prefetchgenrelolomorequest", String.format("prefetch pasing took took %d ms ", new Object[] {
            Long.valueOf(TimeUnit.MILLISECONDS.convert(l1 - l, TimeUnit.NANOSECONDS))
        }));
        Log.d("nf_service_browse_prefetchgenrelolomorequest", String.format("prefetch success - took %d ms ", new Object[] {
            Long.valueOf(rDurationInMs)
        }));
        return Integer.toString(0);
    }
}
