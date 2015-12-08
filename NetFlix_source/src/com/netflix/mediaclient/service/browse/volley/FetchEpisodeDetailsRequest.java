// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.browse.volley;

import android.content.Context;
import com.google.gson.JsonObject;
import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.service.browse.BrowseAgentCallback;
import com.netflix.mediaclient.service.webclient.model.leafs.SocialEvidence;
import com.netflix.mediaclient.service.webclient.volley.FalcorParseException;
import com.netflix.mediaclient.service.webclient.volley.FalcorParseUtils;
import com.netflix.mediaclient.service.webclient.volley.FalcorServerException;
import com.netflix.mediaclient.service.webclient.volley.FalcorVolleyWebClientRequest;
import com.netflix.mediaclient.servicemgr.EpisodeDetails;
import java.util.Arrays;
import java.util.List;

public class FetchEpisodeDetailsRequest extends FalcorVolleyWebClientRequest
{

    private static final String FIELD_EPISODES = "episodes";
    private static final String TAG = "nf_service_browse_fetchepisodedetailsrequest";
    private final String mEpisodeId;
    private final String pqlQuery;
    private final BrowseAgentCallback responseCallback;
    private final boolean userConnectedToFacebook;

    public FetchEpisodeDetailsRequest(Context context, com.netflix.mediaclient.service.ServiceAgent.ConfigurationAgentInterface configurationagentinterface, String s, boolean flag, BrowseAgentCallback browseagentcallback)
    {
        super(context, configurationagentinterface);
        responseCallback = browseagentcallback;
        mEpisodeId = s;
        userConnectedToFacebook = flag;
        pqlQuery = (new StringBuilder("['episodes','")).append(mEpisodeId).append("', ['detail', 'summary', 'bookmark', 'socialEvidence', 'rating']]").toString();
        if (Log.isLoggable("nf_service_browse_fetchepisodedetailsrequest", 2))
        {
            Log.v("nf_service_browse_fetchepisodedetailsrequest", (new StringBuilder()).append("PQL = ").append(pqlQuery).toString());
        }
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
            responseCallback.onEpisodeDetailsFetched(null, i);
        }
    }

    protected void onSuccess(EpisodeDetails episodedetails)
    {
        if (responseCallback != null)
        {
            responseCallback.onEpisodeDetailsFetched(episodedetails, 0);
        }
    }

    protected volatile void onSuccess(Object obj)
    {
        onSuccess((EpisodeDetails)obj);
    }

    protected EpisodeDetails parseFalcorResponse(String s)
        throws FalcorParseException, FalcorServerException
    {
        if (Log.isLoggable("nf_service_browse_fetchepisodedetailsrequest", 2))
        {
            Log.v("nf_service_browse_fetchepisodedetailsrequest", (new StringBuilder()).append("String response to parse = ").append(s).toString());
        }
        com.netflix.mediaclient.service.webclient.model.EpisodeDetails episodedetails = new com.netflix.mediaclient.service.webclient.model.EpisodeDetails();
        JsonObject jsonobject = FalcorParseUtils.getDataObj("nf_service_browse_fetchepisodedetailsrequest", s);
        if (FalcorParseUtils.isEmpty(jsonobject))
        {
            throw new FalcorParseException("EpisodeDetails empty!!!");
        }
        try
        {
            jsonobject = jsonobject.getAsJsonObject("episodes").getAsJsonObject(mEpisodeId);
        }
        catch (Exception exception)
        {
            Log.v("nf_service_browse_fetchepisodedetailsrequest", (new StringBuilder()).append("String response to parse = ").append(s).toString());
            throw new FalcorParseException("response missing expected json objects", exception);
        }
        episodedetails.summary = (com.netflix.mediaclient.service.webclient.model.branches.Video.Summary)FalcorParseUtils.getPropertyObject(jsonobject, "summary", com/netflix/mediaclient/service/webclient/model/branches/Video$Summary);
        episodedetails.detail = (com.netflix.mediaclient.service.webclient.model.branches.Episode.Detail)FalcorParseUtils.getPropertyObject(jsonobject, "detail", com/netflix/mediaclient/service/webclient/model/branches/Episode$Detail);
        episodedetails.bookmark = (com.netflix.mediaclient.service.webclient.model.branches.Video.Bookmark)FalcorParseUtils.getPropertyObject(jsonobject, "bookmark", com/netflix/mediaclient/service/webclient/model/branches/Video$Bookmark);
        episodedetails.showSocialEvidence = (SocialEvidence)FalcorParseUtils.getPropertyObject(jsonobject, "socialEvidence", com/netflix/mediaclient/service/webclient/model/leafs/SocialEvidence);
        episodedetails.rating = (com.netflix.mediaclient.service.webclient.model.branches.Video.Rating)FalcorParseUtils.getPropertyObject(jsonobject, "rating", com/netflix/mediaclient/service/webclient/model/branches/Video$Rating);
        episodedetails.userConnectedToFacebook = userConnectedToFacebook;
        return episodedetails;
    }

    protected volatile Object parseFalcorResponse(String s)
        throws FalcorParseException, FalcorServerException
    {
        return parseFalcorResponse(s);
    }
}
