// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.browse.volley;

import android.content.Context;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
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
import com.netflix.mediaclient.util.StringUtils;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.netflix.mediaclient.service.browse.volley:
//            FetchCWVideosRequest

public class RefreshCWRequest extends FalcorVolleyWebClientRequest
{

    private static final String FIELD_LOLOMOS = "lolomos";
    private static final String FIELD_VALUE = "value";
    private static final String TAG = "nf_service_browse_refreshcwrequest";
    private boolean canMakeRequest;
    private final List cwKeysCache;
    private final String cwLoMoId;
    private final String cwLoMoIndex;
    private final int fromSimilars = 0;
    private final int fromVideo;
    private final HardCache hardCache;
    private final String lolomoId;
    private final boolean lolomoIdInCache;
    private final String pqlQuery;
    private long rDurationInMs;
    private long rEnd;
    private final long rStart = System.nanoTime();
    private final BrowseAgentCallback responseCallback;
    private final SoftCache softCache;
    private final int toSimilars;
    private final int toVideo;
    private final boolean userConnectedToFacebook;
    private final SoftCache weakSeasonsCache;

    public RefreshCWRequest(Context context, com.netflix.mediaclient.service.ServiceAgent.ConfigurationAgentInterface configurationagentinterface, HardCache hardcache, SoftCache softcache, SoftCache softcache1, List list, int i, 
            int j, int k, boolean flag, BrowseAgentCallback browseagentcallback)
    {
        boolean flag1 = true;
        super(context, configurationagentinterface);
        canMakeRequest = true;
        responseCallback = browseagentcallback;
        fromVideo = i;
        toVideo = j;
        toSimilars = k;
        hardCache = hardcache;
        softCache = softcache;
        weakSeasonsCache = softcache1;
        cwKeysCache = list;
        userConnectedToFacebook = flag;
        cwLoMoId = BrowseAgent.getCWLoMoId(hardcache);
        lolomoId = BrowseAgent.getLoLoMoId(hardcache);
        if (StringUtils.isNotEmpty(lolomoId))
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        lolomoIdInCache = flag;
        if (!lolomoIdInCache)
        {
            canMakeRequest = false;
        }
        cwLoMoIndex = BrowseAgent.getCWLoMoIndex(hardcache);
        if (StringUtils.isEmpty(cwLoMoIndex) || StringUtils.isEmpty(cwLoMoId))
        {
            canMakeRequest = false;
        }
        pqlQuery = (new StringBuilder("['lolomos','")).append(lolomoId).append("','refreshList']").toString();
        if (Log.isLoggable("nf_service_browse_refreshcwrequest", 2))
        {
            Log.v("nf_service_browse_refreshcwrequest", (new StringBuilder()).append("PQL = ").append(pqlQuery).toString());
        }
    }

    static void updateCWLoMoSummaryObject(HardCache hardcache, ListOfMoviesSummary listofmoviessummary)
    {
        com/netflix/mediaclient/service/browse/volley/RefreshCWRequest;
        JVM INSTR monitorenter ;
        if (listofmoviessummary != null) goto _L2; else goto _L1
_L1:
        com/netflix/mediaclient/service/browse/volley/RefreshCWRequest;
        JVM INSTR monitorexit ;
        return;
_L2:
        ListOfMoviesSummary listofmoviessummary2;
        Log.d("nf_service_browse_refreshcwrequest", (new StringBuilder()).append("updateCWLoMoSummaryObject newList id:").append(listofmoviessummary.getId()).append(" length:").append(listofmoviessummary.getLength()).toString());
        listofmoviessummary2 = BrowseAgent.getCWLoMoSummary(hardcache);
        ListOfMoviesSummary listofmoviessummary1;
        listofmoviessummary1 = listofmoviessummary2;
        if (listofmoviessummary2 != null)
        {
            break MISSING_BLOCK_LABEL_94;
        }
        if (Log.isLoggable("nf_service_browse_refreshcwrequest", 3))
        {
            throw new IllegalStateException("failed to get CW LoMo from cache");
        }
        break MISSING_BLOCK_LABEL_87;
        hardcache;
        com/netflix/mediaclient/service/browse/volley/RefreshCWRequest;
        JVM INSTR monitorexit ;
        throw hardcache;
        BrowseAgent.putCWLoMoSummary(hardcache, listofmoviessummary);
        listofmoviessummary1 = listofmoviessummary;
        Log.d("nf_service_browse_refreshcwrequest", (new StringBuilder()).append("updateCWLoMoSummaryObject oldList id:").append(listofmoviessummary1.getId()).append(" length:").append(listofmoviessummary1.getLength()).toString());
        listofmoviessummary1.setId(listofmoviessummary.getId());
        listofmoviessummary1.setLength(listofmoviessummary.getLength());
          goto _L1
    }

    static void updateCWVideoLists(HardCache hardcache, SoftCache softcache, List list, int i, int j, ListOfMoviesSummary listofmoviessummary, List list1)
    {
        com/netflix/mediaclient/service/browse/volley/RefreshCWRequest;
        JVM INSTR monitorenter ;
        listofmoviessummary = list.iterator();
        do
        {
            if (!listofmoviessummary.hasNext())
            {
                break;
            }
            String s = (String)listofmoviessummary.next();
            Log.d("nf_service_browse_refreshcwrequest", (new StringBuilder()).append("removing entry for key:").append(s).toString());
            if (softcache.remove(s) == null)
            {
                hardcache.remove(s);
            }
        } while (true);
        break MISSING_BLOCK_LABEL_88;
        hardcache;
        throw hardcache;
        list.clear();
        softcache = BrowseAgent.buildBrowseCacheKey(BrowseAgent.CACHE_KEY_PREFIX_CW_VIDEOS, "continueWatching", String.valueOf(i), String.valueOf(j));
        hardcache.remove(softcache);
        BrowseAgent.putInBrowseCache(hardcache, softcache, list1);
        com/netflix/mediaclient/service/browse/volley/RefreshCWRequest;
        JVM INSTR monitorexit ;
    }

    public boolean canProceed()
    {
        return canMakeRequest;
    }

    protected String getMethodType()
    {
        return FalcorParseUtils.getMethodNameCall();
    }

    protected String getOptionalParams()
    {
        String s = (new StringBuilder("[{'to':")).append(toVideo).append(",'from':").append(fromVideo).append("},['summary','detail','rating', 'inQueue', 'bookmark', 'bookmarkStill', 'socialEvidence']]").toString();
        String s1 = (new StringBuilder("[{'to':")).append(toVideo).append(",'from':").append(fromVideo).append("},'episodes', 'current', ['detail', 'bookmark']]").toString();
        String s2 = (new StringBuilder("['summary']")).toString();
        String s3 = (new StringBuilder("[{'to':")).append(toVideo).append(",'from':").append(fromVideo).append("}, 'similars',").append("{'to':").append(toSimilars).append(",'from':").append(fromSimilars).append("}, 'summary']").toString();
        String s4 = (new StringBuilder("[{'to':")).append(toVideo).append(",'from':").append(fromVideo).append("}, 'similars', 'summary']").toString();
        String s5 = (new StringBuilder("'")).append(cwLoMoId).append("'").toString();
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append(urlEncodPQLParam(FalcorParseUtils.getParamNameParam(), s5));
        stringbuilder.append(urlEncodPQLParam(FalcorParseUtils.getParamNameParam(), cwLoMoIndex));
        stringbuilder.append(urlEncodPQLParam(FalcorParseUtils.getParamNameParam(), "'continueWatching'"));
        stringbuilder.append(urlEncodPQLParam("pathSuffix", s));
        stringbuilder.append(urlEncodPQLParam("pathSuffix", s1));
        stringbuilder.append(urlEncodPQLParam("pathSuffix", s2));
        stringbuilder.append(urlEncodPQLParam("pathSuffix", s3));
        stringbuilder.append(urlEncodPQLParam("pathSuffix", s4));
        Log.d("nf_service_browse_refreshcwrequest", (new StringBuilder()).append(" getOptionalParams: ").append(stringbuilder.toString()).toString());
        return stringbuilder.toString();
    }

    protected List getPQLQueries()
    {
        return Arrays.asList(new String[] {
            pqlQuery
        });
    }

    protected void onFailure(int i)
    {
        if (responseCallback != null)
        {
            Log.d("nf_service_browse_refreshcwrequest", (new StringBuilder()).append("RefreshCWRequest finished onFailure statusCode=").append(i).toString());
            responseCallback.onCWListRefresh(i);
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
            Log.d("nf_service_browse_refreshcwrequest", "RefreshCWRequest finished onSuccess");
            responseCallback.onCWListRefresh(0);
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
        Log.d("nf_service_browse_refreshcwrequest", String.format(" request took %d ms ", new Object[] {
            Long.valueOf(rDurationInMs)
        }));
        if (Log.isLoggable("nf_service_browse_refreshcwrequest", 2))
        {
            Log.v("nf_service_browse_refreshcwrequest", (new StringBuilder()).append("String response to parse = ").append(s.substring(0, Math.min(s.length(), 1500))).toString());
        }
        Object obj;
        try
        {
            obj = (new JsonParser()).parse(s).getAsJsonObject();
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            Log.v("nf_service_browse_refreshcwrequest", (new StringBuilder()).append("String response to parse = ").append(s).toString());
            throw new FalcorParseException("Error in creating JsonObject", ((Throwable) (obj)));
        }
        if (FalcorParseUtils.containsErrors(((JsonObject) (obj))))
        {
            throw new FalcorServerException(FalcorParseUtils.getErrorMessage(((JsonObject) (obj))));
        }
        obj = ((JsonObject) (obj)).getAsJsonObject("value");
        if (FalcorParseUtils.isEmpty(((JsonObject) (obj))))
        {
            return Integer.toString(0);
        }
        long l;
        long l1;
        try
        {
            obj = ((JsonObject) (obj)).getAsJsonObject("lolomos").getAsJsonObject(lolomoId).getAsJsonObject(cwLoMoIndex);
        }
        catch (Exception exception)
        {
            Log.v("nf_service_browse_refreshcwrequest", (new StringBuilder()).append("String response to parse = ").append(s).toString());
            throw new FalcorParseException("response missing expected json objects", exception);
        }
        l = System.nanoTime();
        s = FetchCWVideosRequest.buildCWVideoList(((JsonObject) (obj)), fromVideo, toVideo, toSimilars, userConnectedToFacebook, hardCache, softCache, weakSeasonsCache);
        obj = (ListOfMoviesSummary)FalcorParseUtils.getPropertyObject(((JsonObject) (obj)), "summary", com/netflix/mediaclient/service/webclient/model/leafs/ListOfMoviesSummary);
        BrowseAgent.putCWLoMoId(hardCache, ((ListOfMoviesSummary) (obj)).getId());
        updateCWLoMoSummaryObject(hardCache, ((ListOfMoviesSummary) (obj)));
        updateCWVideoLists(hardCache, softCache, cwKeysCache, fromVideo, toVideo, ((ListOfMoviesSummary) (obj)), s);
        l1 = System.nanoTime();
        rEnd = l1;
        l = TimeUnit.MILLISECONDS.convert(l1 - l, TimeUnit.NANOSECONDS);
        rDurationInMs = TimeUnit.MILLISECONDS.convert(rEnd - rStart, TimeUnit.NANOSECONDS);
        Log.d("nf_service_browse_refreshcwrequest", String.format(" parsing  & updating MDPs took took %d ms ", new Object[] {
            Long.valueOf(l)
        }));
        Log.d("nf_service_browse_refreshcwrequest", String.format(" refresh success - took %d ms ", new Object[] {
            Long.valueOf(rDurationInMs)
        }));
        return Integer.toString(0);
    }
}
