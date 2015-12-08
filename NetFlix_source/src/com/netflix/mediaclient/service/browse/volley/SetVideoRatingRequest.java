// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.browse.volley;

import android.content.Context;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.service.browse.BrowseAgent;
import com.netflix.mediaclient.service.browse.BrowseAgentCallback;
import com.netflix.mediaclient.service.browse.cache.HardCache;
import com.netflix.mediaclient.service.browse.cache.SoftCache;
import com.netflix.mediaclient.service.webclient.model.MovieDetails;
import com.netflix.mediaclient.service.webclient.model.ShowDetails;
import com.netflix.mediaclient.service.webclient.volley.FalcorParseException;
import com.netflix.mediaclient.service.webclient.volley.FalcorParseUtils;
import com.netflix.mediaclient.service.webclient.volley.FalcorServerException;
import com.netflix.mediaclient.service.webclient.volley.FalcorVolleyWebClientRequest;
import java.util.Arrays;
import java.util.List;

public class SetVideoRatingRequest extends FalcorVolleyWebClientRequest
{

    private static final String FIELD_PATH = "path";
    private static final String FIELD_VALUE = "value";
    private static final String FIELD_VIDEOS = "videos";
    private static final String TAG = "nf_service_browse_setvideoratingrequest";
    private final HardCache cache;
    private final int mNewRating;
    private final String mVideoId;
    private final String pqlQuery;
    private final BrowseAgentCallback responseCallback;
    private final SoftCache secondaryCache;
    private final int trackId;

    public SetVideoRatingRequest(Context context, com.netflix.mediaclient.service.ServiceAgent.ConfigurationAgentInterface configurationagentinterface, HardCache hardcache, SoftCache softcache, String s, int i, int j, 
            BrowseAgentCallback browseagentcallback)
    {
        super(context, configurationagentinterface);
        responseCallback = browseagentcallback;
        cache = hardcache;
        secondaryCache = softcache;
        mVideoId = s;
        mNewRating = i;
        trackId = j;
        pqlQuery = (new StringBuilder("['videos','")).append(mVideoId).append("','setRating']").toString();
        if (Log.isLoggable("nf_service_browse_setvideoratingrequest", 2))
        {
            Log.v("nf_service_browse_setvideoratingrequest", (new StringBuilder()).append("PQL = ").append(pqlQuery).toString());
        }
    }

    public static void updateMdpWithNewRating(HardCache hardcache, SoftCache softcache, String s, String s1, float f)
    {
        com/netflix/mediaclient/service/browse/volley/SetVideoRatingRequest;
        JVM INSTR monitorenter ;
        if (!s1.equals("movies")) goto _L2; else goto _L1
_L1:
        hardcache = (MovieDetails)BrowseAgent.getFromCaches(hardcache, softcache, BrowseAgent.buildBrowseCacheKey(BrowseAgent.CACHE_KEY_PREFIX_MDP, s, "0", "0"));
        if (hardcache == null)
        {
            break MISSING_BLOCK_LABEL_52;
        }
        if (((MovieDetails) (hardcache)).rating != null)
        {
            ((MovieDetails) (hardcache)).rating.userRating = f;
        }
_L4:
        com/netflix/mediaclient/service/browse/volley/SetVideoRatingRequest;
        JVM INSTR monitorexit ;
        return;
_L2:
        hardcache = (ShowDetails)BrowseAgent.getFromCaches(hardcache, softcache, BrowseAgent.buildBrowseCacheKey(BrowseAgent.CACHE_KEY_PREFIX_SDP, s, "0", "0"));
        if (hardcache == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (((ShowDetails) (hardcache)).rating != null)
        {
            ((ShowDetails) (hardcache)).rating.userRating = f;
        }
        if (true) goto _L4; else goto _L3
_L3:
        hardcache;
        throw hardcache;
    }

    protected String getMethodType()
    {
        return FalcorParseUtils.getMethodNameCall();
    }

    protected String getOptionalParams()
    {
        String s = (new StringBuilder("&")).append(FalcorParseUtils.getParamNameParam()).append("=").toString();
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append(s).append(mNewRating);
        stringbuilder.append(s).append(trackId);
        Log.d("nf_service_browse_setvideoratingrequest", (new StringBuilder()).append(" getOptionalParams: ").append(stringbuilder.toString()).toString());
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
            Log.d("nf_service_browse_setvideoratingrequest", (new StringBuilder()).append("SetVideoRatingRequest6 finished onFailure statusCode=").append(i).toString());
            responseCallback.onVideoRatingSet(i);
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
            Log.d("nf_service_browse_setvideoratingrequest", "SetVideoRatingRequest6 finished onSuccess");
            responseCallback.onVideoRatingSet(0);
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
        if (Log.isLoggable("nf_service_browse_setvideoratingrequest", 2))
        {
            Log.v("nf_service_browse_setvideoratingrequest", (new StringBuilder()).append("String response to parse = ").append(s).toString());
        }
        Object obj;
        JsonObject jsonobject;
        try
        {
            obj = (new JsonParser()).parse(s).getAsJsonObject();
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            Log.v("nf_service_browse_setvideoratingrequest", (new StringBuilder()).append("String response to parse = ").append(s).toString());
            throw new FalcorParseException("Error in creating JsonObject", ((Throwable) (obj)));
        }
        jsonobject = ((JsonObject) (obj)).getAsJsonObject("value");
        if (FalcorParseUtils.isEmpty(jsonobject))
        {
            throw new FalcorParseException("setRating failed ?");
        }
        if (FalcorParseUtils.containsErrors(((JsonObject) (obj))))
        {
            throw new FalcorServerException(FalcorParseUtils.getErrorMessage(((JsonObject) (obj))));
        }
        try
        {
            jsonobject = jsonobject.getAsJsonObject("videos").getAsJsonObject(mVideoId);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            Log.v("nf_service_browse_setvideoratingrequest", (new StringBuilder()).append("String response to parse = ").append(s).toString());
            throw new FalcorParseException("response missing expected json objects", ((Throwable) (obj)));
        }
        try
        {
            s = jsonobject.getAsJsonArray("path").get(0).getAsString();
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            Log.v("nf_service_browse_setvideoratingrequest", (new StringBuilder()).append("setRating PathObj missing in: ").append(((JsonObject) (obj)).toString()).toString());
            throw new FalcorParseException("Missing setRatingPathObj", s);
        }
        obj = (com.netflix.mediaclient.service.webclient.model.branches.Video.Rating)FalcorParseUtils.getPropertyObject(jsonobject, "rating", com/netflix/mediaclient/service/webclient/model/branches/Video$Rating);
        Log.d("nf_service_browse_setvideoratingrequest", String.format("VideoId:%s, videoType: %s, newRating:%f", new Object[] {
            mVideoId, s, Float.valueOf(((com.netflix.mediaclient.service.webclient.model.branches.Video.Rating) (obj)).userRating)
        }));
        updateMdpWithNewRating(cache, secondaryCache, mVideoId, s, ((com.netflix.mediaclient.service.webclient.model.branches.Video.Rating) (obj)).userRating);
        return Integer.toString(0);
    }
}
