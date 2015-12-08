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
import com.netflix.mediaclient.servicemgr.ShowDetails;
import com.netflix.mediaclient.util.StringUtils;
import java.util.Arrays;
import java.util.List;

public class FetchShowDetailsRequest extends FalcorVolleyWebClientRequest
{

    private static final String FIELD_VIDEOS = "videos";
    private static final String TAG = "nf_service_browse_fetchshowdetailsrequest";
    private final boolean isCurrentEpisodeLocal;
    private final String mReqEpisodeId;
    private final String mShowId;
    private final String pqlQuery;
    private final String pqlQuery2;
    private final BrowseAgentCallback responseCallback;
    private final boolean userConnectedToFacebook;

    public FetchShowDetailsRequest(Context context, com.netflix.mediaclient.service.ServiceAgent.ConfigurationAgentInterface configurationagentinterface, String s, String s1, boolean flag, BrowseAgentCallback browseagentcallback)
    {
        super(context, configurationagentinterface);
        responseCallback = browseagentcallback;
        mShowId = s;
        mReqEpisodeId = s1;
        isCurrentEpisodeLocal = StringUtils.isNotEmpty(mReqEpisodeId);
        userConnectedToFacebook = flag;
        pqlQuery = (new StringBuilder("['videos','")).append(mShowId).append("',['summary','detail', 'rating', 'inQueue', 'socialEvidence']]").toString();
        if (isCurrentEpisodeLocal)
        {
            pqlQuery2 = (new StringBuilder("['episodes','")).append(mReqEpisodeId).append("', ['detail', 'bookmark']]").toString();
        } else
        {
            pqlQuery2 = (new StringBuilder("['videos','")).append(mShowId).append("','episodes', 'current', ['detail', 'bookmark']]").toString();
        }
        if (Log.isLoggable("nf_service_browse_fetchshowdetailsrequest", 2))
        {
            Log.v("nf_service_browse_fetchshowdetailsrequest", (new StringBuilder()).append("PQL = ").append(pqlQuery).append(pqlQuery2).toString());
        }
    }

    protected List getPQLQueries()
    {
        return Arrays.asList(new String[] {
            pqlQuery, pqlQuery2
        });
    }

    protected void onFailure(int i)
    {
        if (responseCallback != null)
        {
            responseCallback.onShowDetailsFetched(null, i);
        }
    }

    protected void onSuccess(ShowDetails showdetails)
    {
        if (responseCallback != null)
        {
            responseCallback.onShowDetailsFetched(showdetails, 0);
        }
    }

    protected volatile void onSuccess(Object obj)
    {
        onSuccess((ShowDetails)obj);
    }

    protected ShowDetails parseFalcorResponse(String s)
        throws FalcorParseException, FalcorServerException
    {
        Object obj;
        JsonObject jsonobject;
        if (Log.isLoggable("nf_service_browse_fetchshowdetailsrequest", 2))
        {
            Log.v("nf_service_browse_fetchshowdetailsrequest", (new StringBuilder()).append("String response to parse = ").append(s).toString());
        }
        obj = new com.netflix.mediaclient.service.webclient.model.ShowDetails();
        jsonobject = FalcorParseUtils.getDataObj("nf_service_browse_fetchshowdetailsrequest", s);
        if (FalcorParseUtils.isEmpty(jsonobject))
        {
            throw new FalcorParseException("ShowDetails empty!!!");
        }
        JsonObject jsonobject1;
        try
        {
            jsonobject1 = jsonobject.getAsJsonObject("videos").getAsJsonObject(mShowId);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            Log.v("nf_service_browse_fetchshowdetailsrequest", (new StringBuilder()).append("String response to parse = ").append(s).toString());
            throw new FalcorParseException("response missing expected json objects", ((Throwable) (obj)));
        }
        obj.summary = (com.netflix.mediaclient.service.webclient.model.branches.Video.Summary)FalcorParseUtils.getPropertyObject(jsonobject1, "summary", com/netflix/mediaclient/service/webclient/model/branches/Video$Summary);
        obj.detail = (com.netflix.mediaclient.service.webclient.model.branches.Video.Detail)FalcorParseUtils.getPropertyObject(jsonobject1, "detail", com/netflix/mediaclient/service/webclient/model/branches/Video$Detail);
        obj.rating = (com.netflix.mediaclient.service.webclient.model.branches.Video.Rating)FalcorParseUtils.getPropertyObject(jsonobject1, "rating", com/netflix/mediaclient/service/webclient/model/branches/Video$Rating);
        obj.inQueue = (com.netflix.mediaclient.service.webclient.model.branches.Video.InQueue)FalcorParseUtils.getPropertyObject(jsonobject1, "inQueue", com/netflix/mediaclient/service/webclient/model/branches/Video$InQueue);
        obj.socialEvidence = (SocialEvidence)FalcorParseUtils.getPropertyObject(jsonobject1, "socialEvidence", com/netflix/mediaclient/service/webclient/model/leafs/SocialEvidence);
        if (isCurrentEpisodeLocal) goto _L2; else goto _L1
_L1:
        if (jsonobject1.has("episodes"))
        {
            s = jsonobject1.getAsJsonObject("episodes");
            if (s.has("current"))
            {
                s = s.getAsJsonObject("current");
                obj.currentEpisode = (com.netflix.mediaclient.service.webclient.model.branches.Episode.Detail)FalcorParseUtils.getPropertyObject(s, "detail", com/netflix/mediaclient/service/webclient/model/branches/Episode$Detail);
                obj.currentEpisodeBookmark = (com.netflix.mediaclient.service.webclient.model.branches.Video.Bookmark)FalcorParseUtils.getPropertyObject(s, "bookmark", com/netflix/mediaclient/service/webclient/model/branches/Video$Bookmark);
            }
        }
_L4:
        obj.userConnectedToFacebook = userConnectedToFacebook;
        return ((ShowDetails) (obj));
_L2:
        if (jsonobject.has("episodes"))
        {
            jsonobject = jsonobject.getAsJsonObject("episodes");
            try
            {
                jsonobject = jsonobject.getAsJsonObject(mReqEpisodeId);
            }
            catch (Exception exception)
            {
                Log.v("nf_service_browse_fetchshowdetailsrequest", (new StringBuilder()).append("String response to parse = ").append(s).toString());
                throw new FalcorParseException("response missing expected json objects", exception);
            }
            obj.currentEpisode = (com.netflix.mediaclient.service.webclient.model.branches.Episode.Detail)FalcorParseUtils.getPropertyObject(jsonobject, "detail", com/netflix/mediaclient/service/webclient/model/branches/Episode$Detail);
            obj.currentEpisodeBookmark = (com.netflix.mediaclient.service.webclient.model.branches.Video.Bookmark)FalcorParseUtils.getPropertyObject(jsonobject, "bookmark", com/netflix/mediaclient/service/webclient/model/branches/Video$Bookmark);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    protected volatile Object parseFalcorResponse(String s)
        throws FalcorParseException, FalcorServerException
    {
        return parseFalcorResponse(s);
    }
}
