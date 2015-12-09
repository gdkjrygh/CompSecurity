// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.browse.volley;

import android.content.Context;
import com.google.gson.JsonObject;
import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.service.browse.BrowseAgentCallback;
import com.netflix.mediaclient.service.webclient.model.PostPlayVideo;
import com.netflix.mediaclient.service.webclient.model.leafs.SocialEvidence;
import com.netflix.mediaclient.service.webclient.volley.FalcorParseException;
import com.netflix.mediaclient.service.webclient.volley.FalcorParseUtils;
import com.netflix.mediaclient.service.webclient.volley.FalcorServerException;
import com.netflix.mediaclient.service.webclient.volley.FalcorVolleyWebClientRequest;
import com.netflix.mediaclient.servicemgr.VideoType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FetchPostPlayVideosRequest extends FalcorVolleyWebClientRequest
{

    public static final String FIELD_POSTPLAY = "postplay";
    public static final String FIELD_POSTPLAY_CONTEXT = "postplayContext";
    private static final String TAG = "nf_postplay";
    private final Integer MAX_POSTPLAY_RECOS = Integer.valueOf(3);
    private final String currentPlayId;
    private final String pqlQuery1;
    private final String pqlQuery2;
    private final String pqlQuery3;
    private final BrowseAgentCallback responseCallback;
    private final boolean userConnectedToFacebook;

    protected FetchPostPlayVideosRequest(Context context, com.netflix.mediaclient.service.ServiceAgent.ConfigurationAgentInterface configurationagentinterface, String s, boolean flag, BrowseAgentCallback browseagentcallback)
    {
        super(context, configurationagentinterface);
        responseCallback = browseagentcallback;
        currentPlayId = s;
        userConnectedToFacebook = flag;
        pqlQuery1 = String.format("['videos', '%s', 'postplay', {'to':%d}, 'postplayContext']", new Object[] {
            currentPlayId, MAX_POSTPLAY_RECOS
        });
        pqlQuery2 = String.format("['videos', '%s', 'postplay', {'to':%d}, ['summary','detail', 'rating', 'inQueue', 'bookmark', 'socialEvidence']]", new Object[] {
            currentPlayId, MAX_POSTPLAY_RECOS
        });
        pqlQuery3 = String.format("['videos', '%s', 'postplay', {'to':%d}, 'episodes', 'current', ['detail', 'bookmark']]", new Object[] {
            currentPlayId, MAX_POSTPLAY_RECOS
        });
    }

    protected List getPQLQueries()
    {
        return Arrays.asList(new String[] {
            pqlQuery1, pqlQuery2, pqlQuery3
        });
    }

    protected void onFailure(int i)
    {
        if (responseCallback != null)
        {
            responseCallback.onPostPlayVideosFetched(Collections.emptyList(), i);
        }
    }

    protected volatile void onSuccess(Object obj)
    {
        onSuccess((List)obj);
    }

    protected void onSuccess(List list)
    {
        if (responseCallback != null)
        {
            responseCallback.onPostPlayVideosFetched(list, 0);
        }
    }

    protected volatile Object parseFalcorResponse(String s)
        throws FalcorParseException, FalcorServerException
    {
        return parseFalcorResponse(s);
    }

    protected List parseFalcorResponse(String s)
        throws FalcorParseException, FalcorServerException
    {
        Object obj;
        if (Log.isLoggable("nf_postplay", 2))
        {
            Log.v("nf_postplay", (new StringBuilder()).append("String response to parse = ").append(s).toString());
        }
        obj = FalcorParseUtils.getDataObj("nf_postplay", s);
        if (!FalcorParseUtils.isEmpty(((JsonObject) (obj)))) goto _L2; else goto _L1
_L1:
        obj = new ArrayList();
_L4:
        return ((List) (obj));
_L2:
        int i;
        ArrayList arraylist = new ArrayList();
        JsonObject jsonobject;
        PostPlayVideo postplayvideo;
        JsonObject jsonobject1;
        try
        {
            jsonobject = ((JsonObject) (obj)).getAsJsonObject().getAsJsonObject("videos").getAsJsonObject(currentPlayId).getAsJsonObject("postplay");
            i = MAX_POSTPLAY_RECOS.intValue();
        }
        catch (Exception exception)
        {
            Log.v("nf_postplay", (new StringBuilder()).append("String response to parse = ").append(s).toString());
            throw new FalcorParseException("response missing expected json objects", exception);
        }
_L12:
        obj = arraylist;
        if (i < 0) goto _L4; else goto _L3
_L3:
        obj = Integer.toString(i);
        if (!jsonobject.has(((String) (obj))))
        {
            break MISSING_BLOCK_LABEL_465;
        }
        postplayvideo = new PostPlayVideo();
        jsonobject1 = jsonobject.getAsJsonObject(((String) (obj)));
        postplayvideo.summary = (com.netflix.mediaclient.service.webclient.model.branches.Video.Summary)FalcorParseUtils.getPropertyObject(jsonobject1, "summary", com/netflix/mediaclient/service/webclient/model/branches/Video$Summary);
        if (postplayvideo.summary == null) goto _L6; else goto _L5
_L5:
        obj = postplayvideo.summary.getType();
_L9:
        if (!VideoType.MOVIE.equals(obj) && !VideoType.SHOW.equals(obj)) goto _L8; else goto _L7
_L7:
        postplayvideo.detail = (com.netflix.mediaclient.service.webclient.model.branches.Video.Detail)FalcorParseUtils.getPropertyObject(jsonobject1, "detail", com/netflix/mediaclient/service/webclient/model/branches/Video$Detail);
_L11:
        postplayvideo.rating = (com.netflix.mediaclient.service.webclient.model.branches.Video.Rating)FalcorParseUtils.getPropertyObject(jsonobject1, "rating", com/netflix/mediaclient/service/webclient/model/branches/Video$Rating);
        postplayvideo.inQueue = (com.netflix.mediaclient.service.webclient.model.branches.Video.InQueue)FalcorParseUtils.getPropertyObject(jsonobject1, "inQueue", com/netflix/mediaclient/service/webclient/model/branches/Video$InQueue);
        postplayvideo.bookmark = (com.netflix.mediaclient.service.webclient.model.branches.Video.Bookmark)FalcorParseUtils.getPropertyObject(jsonobject1, "bookmark", com/netflix/mediaclient/service/webclient/model/branches/Video$Bookmark);
        postplayvideo.socialEvidence = (SocialEvidence)FalcorParseUtils.getPropertyObject(jsonobject1, "socialEvidence", com/netflix/mediaclient/service/webclient/model/leafs/SocialEvidence);
        postplayvideo.userConnectedToFacebook = userConnectedToFacebook;
        postplayvideo.postplayContext = (com.netflix.mediaclient.service.webclient.model.PostPlayVideo.PostPlayContext)FalcorParseUtils.getPropertyObject(jsonobject1, "postplayContext", com/netflix/mediaclient/service/webclient/model/PostPlayVideo$PostPlayContext);
        if (VideoType.SHOW.equals(obj) && jsonobject1.has("episodes"))
        {
            obj = jsonobject1.getAsJsonObject("episodes");
            if (((JsonObject) (obj)).has("current"))
            {
                obj = ((JsonObject) (obj)).getAsJsonObject("current");
                postplayvideo.episodeDetail = (com.netflix.mediaclient.service.webclient.model.branches.Episode.Detail)FalcorParseUtils.getPropertyObject(((JsonObject) (obj)), "detail", com/netflix/mediaclient/service/webclient/model/branches/Episode$Detail);
                postplayvideo.bookmark = (com.netflix.mediaclient.service.webclient.model.branches.Video.Bookmark)FalcorParseUtils.getPropertyObject(((JsonObject) (obj)), "bookmark", com/netflix/mediaclient/service/webclient/model/branches/Video$Bookmark);
            }
        }
        arraylist.add(0, postplayvideo);
        break MISSING_BLOCK_LABEL_465;
_L6:
        obj = VideoType.UNKNOWN;
          goto _L9
_L8:
        if (!VideoType.EPISODE.equals(obj)) goto _L11; else goto _L10
_L10:
        postplayvideo.episodeDetail = (com.netflix.mediaclient.service.webclient.model.branches.Episode.Detail)FalcorParseUtils.getPropertyObject(jsonobject1, "detail", com/netflix/mediaclient/service/webclient/model/branches/Episode$Detail);
          goto _L11
        i--;
          goto _L12
    }
}
