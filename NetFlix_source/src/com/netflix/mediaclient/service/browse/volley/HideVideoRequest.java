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
import com.netflix.mediaclient.service.webclient.model.EpisodeDetails;
import com.netflix.mediaclient.service.webclient.model.MovieDetails;
import com.netflix.mediaclient.service.webclient.model.ShowDetails;
import com.netflix.mediaclient.service.webclient.model.leafs.SocialEvidence;
import com.netflix.mediaclient.service.webclient.volley.FalcorParseException;
import com.netflix.mediaclient.service.webclient.volley.FalcorParseUtils;
import com.netflix.mediaclient.service.webclient.volley.FalcorServerException;
import com.netflix.mediaclient.service.webclient.volley.FalcorVolleyWebClientRequest;
import java.util.Arrays;
import java.util.List;

public class HideVideoRequest extends FalcorVolleyWebClientRequest
{

    private static final String FIELD_PATH = "path";
    private static final String FIELD_VIDEOS = "videos";
    private static final String TAG = "nf_service_browse_hidevideorequest";
    private final HardCache cache;
    private final String mVideoId;
    private final String pqlQuery;
    private final BrowseAgentCallback responseCallback;
    private final SoftCache secondaryCache;

    public HideVideoRequest(Context context, com.netflix.mediaclient.service.ServiceAgent.ConfigurationAgentInterface configurationagentinterface, HardCache hardcache, SoftCache softcache, String s, BrowseAgentCallback browseagentcallback)
    {
        super(context, configurationagentinterface);
        responseCallback = browseagentcallback;
        cache = hardcache;
        secondaryCache = softcache;
        mVideoId = s;
        pqlQuery = (new StringBuilder("['videos','")).append(mVideoId).append("','hideVideoFromSocial']").toString();
        if (Log.isLoggable("nf_service_browse_hidevideorequest", 2))
        {
            Log.v("nf_service_browse_hidevideorequest", (new StringBuilder()).append("PQL = ").append(pqlQuery).toString());
        }
    }

    public static void updateMdpWithSocialEvidence(HardCache hardcache, SoftCache softcache, SocialEvidence socialevidence, String s, String s1)
    {
        com/netflix/mediaclient/service/browse/volley/HideVideoRequest;
        JVM INSTR monitorenter ;
        MovieDetails moviedetails;
        if (!s.equals("movies"))
        {
            break MISSING_BLOCK_LABEL_59;
        }
        moviedetails = (MovieDetails)BrowseAgent.getFromCaches(hardcache, softcache, BrowseAgent.buildBrowseCacheKey(BrowseAgent.CACHE_KEY_PREFIX_MDP, s1, "0", "0"));
        if (moviedetails == null)
        {
            break MISSING_BLOCK_LABEL_59;
        }
        if (moviedetails.socialEvidence != null)
        {
            moviedetails.socialEvidence.setVideoHidden(socialevidence.isVideoHidden());
        }
        if (!s.equals("episodes")) goto _L2; else goto _L1
_L1:
        s = (EpisodeDetails)BrowseAgent.getFromCaches(hardcache, softcache, BrowseAgent.buildBrowseCacheKey(BrowseAgent.CACHE_KEY_PREFIX_EPISODE_DETAILS, s1, "0", "0"));
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_111;
        }
        if (((EpisodeDetails) (s)).showSocialEvidence != null)
        {
            ((EpisodeDetails) (s)).showSocialEvidence.setVideoHidden(socialevidence.isVideoHidden());
        }
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_160;
        }
        hardcache = (ShowDetails)BrowseAgent.getFromCaches(hardcache, softcache, BrowseAgent.buildBrowseCacheKey(BrowseAgent.CACHE_KEY_PREFIX_SDP, s.getParentId(), "0", "0"));
        if (hardcache == null)
        {
            break MISSING_BLOCK_LABEL_160;
        }
        if (((ShowDetails) (hardcache)).socialEvidence != null)
        {
            ((ShowDetails) (hardcache)).socialEvidence.setVideoHidden(socialevidence.isVideoHidden());
        }
_L4:
        com/netflix/mediaclient/service/browse/volley/HideVideoRequest;
        JVM INSTR monitorexit ;
        return;
_L2:
        hardcache = (ShowDetails)BrowseAgent.getFromCaches(hardcache, softcache, BrowseAgent.buildBrowseCacheKey(BrowseAgent.CACHE_KEY_PREFIX_SDP, s1, "0", "0"));
        if (hardcache == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (((ShowDetails) (hardcache)).socialEvidence != null)
        {
            ((ShowDetails) (hardcache)).socialEvidence.setVideoHidden(socialevidence.isVideoHidden());
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
            Log.d("nf_service_browse_hidevideorequest", (new StringBuilder()).append("HideVideoRequest finished onFailure statusCode=").append(i).toString());
            responseCallback.onVideoHide(i);
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
            Log.d("nf_service_browse_hidevideorequest", "HideVideoRequest finished onSuccess");
            responseCallback.onVideoHide(0);
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
        if (Log.isLoggable("nf_service_browse_hidevideorequest", 2))
        {
            Log.v("nf_service_browse_hidevideorequest", (new StringBuilder()).append("String response to parse = ").append(s).toString());
        }
        Object obj = FalcorParseUtils.getDataObj("nf_service_browse_hidevideorequest", s);
        if (FalcorParseUtils.isEmpty(((JsonObject) (obj))))
        {
            throw new FalcorParseException((new StringBuilder()).append("hide response empty!! ").append(mVideoId).toString());
        }
        String s1;
        try
        {
            obj = ((JsonObject) (obj)).getAsJsonObject("videos").getAsJsonObject(mVideoId);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            Log.v("nf_service_browse_hidevideorequest", (new StringBuilder()).append("String response to parse = ").append(s).toString());
            throw new FalcorParseException("response missing expected json objects", ((Throwable) (obj)));
        }
        s = (SocialEvidence)FalcorParseUtils.getPropertyObject(((JsonObject) (obj)), "socialEvidence", com/netflix/mediaclient/service/webclient/model/leafs/SocialEvidence);
        try
        {
            s1 = ((JsonObject) (obj)).getAsJsonArray("path").get(0).getAsString();
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            Log.v("nf_service_browse_hidevideorequest", (new StringBuilder()).append(" PathObj missing in: ").append(((JsonObject) (obj)).toString()).toString());
            throw new FalcorParseException("Missing hideVideoPathObj", s);
        }
        updateMdpWithSocialEvidence(cache, secondaryCache, s, s1, mVideoId);
        return Integer.toString(0);
    }
}
