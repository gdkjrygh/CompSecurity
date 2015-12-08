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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// Referenced classes of package com.netflix.mediaclient.service.browse.volley:
//            FetchIQVideosRequest, AddToQueueRequest

public class RemoveFromQueueRequest extends FalcorVolleyWebClientRequest
{

    private static final String FIELD_LOLOMOS = "lolomos";
    private static final String FIELD_VALUE = "value";
    public static final String TAG = "nf_service_browse_removefromqueuerequest";
    private boolean canMakeRequest;
    private final int fromVideo;
    private final HardCache hardCache;
    private final List iqKeysCache;
    private final String iqLoMoIndex;
    private final String lolomoId;
    private final String mVideoId;
    private final String pqlQuery;
    private final BrowseAgentCallback responseCallback;
    private final SoftCache softCache;
    private final int toVideo;

    public RemoveFromQueueRequest(Context context, com.netflix.mediaclient.service.ServiceAgent.ConfigurationAgentInterface configurationagentinterface, HardCache hardcache, SoftCache softcache, List list, String s, int i, 
            int j, BrowseAgentCallback browseagentcallback)
    {
        boolean flag = true;
        super(context, configurationagentinterface);
        canMakeRequest = true;
        responseCallback = browseagentcallback;
        fromVideo = i;
        toVideo = j;
        hardCache = hardcache;
        softCache = softcache;
        mVideoId = s;
        iqKeysCache = list;
        if (!BrowseAgent.areIqIdsInCache(hardcache))
        {
            flag = false;
        }
        canMakeRequest = flag;
        if (canMakeRequest);
        lolomoId = BrowseAgent.getLoLoMoId(hardcache);
        iqLoMoIndex = BrowseAgent.getIQLoMoIndex(hardcache);
        pqlQuery = (new StringBuilder("['lolomos','")).append(lolomoId).append("','remove']").toString();
        if (Log.isLoggable("nf_service_browse_removefromqueuerequest", 2))
        {
            Log.v("nf_service_browse_removefromqueuerequest", (new StringBuilder()).append("PQL = ").append(pqlQuery).toString());
        }
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
        String s = (new StringBuilder("&")).append(FalcorParseUtils.getParamNameParam()).append("=").toString();
        String s1 = (new StringBuilder("['videos','")).append(mVideoId).append("']").toString();
        String s2 = (new StringBuilder("[{'to':")).append(toVideo).append(",'from':").append(fromVideo).append("},'summary']").toString();
        String s3 = (new StringBuilder("['summary']")).toString();
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append(s).append(iqLoMoIndex);
        stringbuilder.append(urlEncodPQLParam(FalcorParseUtils.getParamNameParam(), s1));
        stringbuilder.append(urlEncodPQLParam("pathSuffix", s2));
        stringbuilder.append(urlEncodPQLParam("pathSuffix", s3));
        Log.d("nf_service_browse_removefromqueuerequest", (new StringBuilder()).append(" getOptionalParams: ").append(stringbuilder.toString()).toString());
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
            Log.d("nf_service_browse_removefromqueuerequest", (new StringBuilder()).append("RemoveFromQueueRequest finished onFailure statusCode=").append(i).toString());
            responseCallback.onQueueRemove(i);
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
            Log.d("nf_service_browse_removefromqueuerequest", "RemoveFromQueueRequest finished onSuccess");
            responseCallback.onQueueRemove(0);
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
        if (Log.isLoggable("nf_service_browse_removefromqueuerequest", 2))
        {
            Log.v("nf_service_browse_removefromqueuerequest", (new StringBuilder()).append("String response to parse = ").append(s).toString());
        }
        Object obj = new ArrayList();
        JsonObject jsonobject;
        try
        {
            jsonobject = (new JsonParser()).parse(s).getAsJsonObject();
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            Log.v("nf_service_browse_removefromqueuerequest", (new StringBuilder()).append("String response to parse = ").append(s).toString());
            throw new FalcorParseException("Error in creating JsonObject", ((Throwable) (obj)));
        }
        if (FalcorParseUtils.containsErrors(jsonobject))
        {
            if (FalcorParseUtils.getErrorMessage(jsonobject).contains("AlreadyInQueue"))
            {
                return Integer.toString(0);
            } else
            {
                throw new FalcorServerException(FalcorParseUtils.getErrorMessage(jsonobject));
            }
        }
        jsonobject = jsonobject.getAsJsonObject("value");
        if (FalcorParseUtils.isEmpty(jsonobject))
        {
            return Integer.toString(0);
        }
        int i;
        try
        {
            jsonobject = jsonobject.getAsJsonObject("lolomos").getAsJsonObject(lolomoId).getAsJsonObject(iqLoMoIndex);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            Log.v("nf_service_browse_removefromqueuerequest", (new StringBuilder()).append("String response to parse = ").append(s).toString());
            throw new FalcorParseException("response missing expected json objects", ((Throwable) (obj)));
        }
        for (i = fromVideo; i <= toVideo; i++)
        {
            s = Integer.toString(i);
            if (jsonobject.has(s))
            {
                s = (com.netflix.mediaclient.service.webclient.model.branches.Video.Summary)FalcorParseUtils.getPropertyObject(jsonobject.getAsJsonObject(s), "summary", com/netflix/mediaclient/service/webclient/model/branches/Video$Summary);
                FetchIQVideosRequest.updateMdpWithIQInfo(hardCache, softCache, s.getId(), true);
                ((List) (obj)).add(s);
            }
        }

        FetchIQVideosRequest.updateMdpWithIQInfo(hardCache, softCache, mVideoId, false);
        s = (ListOfMoviesSummary)FalcorParseUtils.getPropertyObject(jsonobject, "summary", com/netflix/mediaclient/service/webclient/model/leafs/ListOfMoviesSummary);
        BrowseAgent.putIQLoMoId(hardCache, s.getId());
        AddToQueueRequest.updateIQLoMoSummaryObject(hardCache, s);
        AddToQueueRequest.updateIQVideoLists(hardCache, softCache, iqKeysCache, fromVideo, toVideo, s, ((List) (obj)));
        return Integer.toString(0);
    }
}
