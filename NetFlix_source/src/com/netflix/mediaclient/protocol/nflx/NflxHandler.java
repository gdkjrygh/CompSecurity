// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.protocol.nflx;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.support.v4.content.LocalBroadcastManager;
import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.android.app.BackgroundTask;
import com.netflix.mediaclient.service.pushnotification.MessageData;
import com.netflix.mediaclient.service.pushnotification.UserFeedbackOnReceivedPushNotification;
import com.netflix.mediaclient.service.webclient.model.leafs.ListOfGenreSummary;
import com.netflix.mediaclient.servicemgr.ApplicationPerformanceMetricsLogging;
import com.netflix.mediaclient.servicemgr.CmpEventLogging;
import com.netflix.mediaclient.servicemgr.CustomerEventLogging;
import com.netflix.mediaclient.servicemgr.EpisodeDetails;
import com.netflix.mediaclient.servicemgr.IClientLogging;
import com.netflix.mediaclient.servicemgr.IMdx;
import com.netflix.mediaclient.servicemgr.LoLoMo;
import com.netflix.mediaclient.servicemgr.LoMoType;
import com.netflix.mediaclient.servicemgr.MovieDetails;
import com.netflix.mediaclient.servicemgr.Playable;
import com.netflix.mediaclient.servicemgr.ServiceManager;
import com.netflix.mediaclient.servicemgr.SimpleManagerCallback;
import com.netflix.mediaclient.servicemgr.VideoType;
import com.netflix.mediaclient.ui.Asset;
import com.netflix.mediaclient.ui.common.PlayContext;
import com.netflix.mediaclient.ui.common.PlayContextImp;
import com.netflix.mediaclient.ui.common.PlaybackLauncher;
import com.netflix.mediaclient.ui.details.DetailsActivity;
import com.netflix.mediaclient.ui.home.HomeActivity;
import com.netflix.mediaclient.ui.player.PlayerActivity;
import com.netflix.mediaclient.ui.search.SearchActivity;
import com.netflix.mediaclient.util.AndroidUtils;
import com.netflix.mediaclient.util.DataUtil;
import com.netflix.mediaclient.util.LogUtils;
import com.netflix.mediaclient.util.MdxUtils;
import com.netflix.mediaclient.util.StringUtils;
import com.netflix.mediaclient.util.ThreadUtils;
import com.netflix.mediaclient.util.WebApiUtils;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.security.InvalidParameterException;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public class NflxHandler
{
    class _cls1FetchLoLoMoSummaryCallback extends SimpleManagerCallback
    {

        private final NetflixActivity activity;
        private final String genreId;
        final NflxHandler this$0;

        public void onLoLoMoSummaryFetched(LoLoMo lolomo, int i)
        {
            if (i == 0)
            {
                HomeActivity.showGenreList(activity, new ListOfGenreSummary(lolomo.getNumLoMos(), -1, -1, "", lolomo.getTitle(), genreId, false, lolomo.getType().toString()));
            }
            reportDelayedResponseHandled(activity);
        }

        _cls1FetchLoLoMoSummaryCallback(NetflixActivity netflixactivity, String s)
        {
            this$0 = NflxHandler.this;
            super();
            genreId = s;
            activity = netflixactivity;
        }
    }

    class _cls1FetchPlayableCallback extends SimpleManagerCallback
    {

        private final NetflixActivity activity;
        final NflxHandler this$0;
        private final String trackId;
        final IMdx val$mdx;
        final String val$targetDialUuid;

        public void onEpisodeDetailsFetched(EpisodeDetails episodedetails, int i)
        {
            if (i == 0)
            {
                play(activity, mdx, episodedetails, targetDialUuid, getPlayContext(trackId));
            }
            reportDelayedResponseHandled(activity);
        }

        public void onMovieDetailsFetched(MovieDetails moviedetails, int i)
        {
            if (i == 0)
            {
                play(activity, mdx, moviedetails, targetDialUuid, getPlayContext(trackId));
            }
            reportDelayedResponseHandled(activity);
        }

        _cls1FetchPlayableCallback(IMdx imdx, String s1)
        {
            this$0 = NflxHandler.this;
            mdx = imdx;
            targetDialUuid = s1;
            super();
            activity = final_netflixactivity;
            trackId = final_s;
        }
    }

    public static final class Response extends Enum
    {

        private static final Response $VALUES[];
        public static final Response HANDLING;
        public static final Response HANDLING_WITH_DELAY;
        public static final Response NOT_HANDLING;

        public static Response valueOf(String s)
        {
            return (Response)Enum.valueOf(com/netflix/mediaclient/protocol/nflx/NflxHandler$Response, s);
        }

        public static Response[] values()
        {
            return (Response[])$VALUES.clone();
        }

        static 
        {
            HANDLING = new Response("HANDLING", 0);
            NOT_HANDLING = new Response("NOT_HANDLING", 1);
            HANDLING_WITH_DELAY = new Response("HANDLING_WITH_DELAY", 2);
            $VALUES = (new Response[] {
                HANDLING, NOT_HANDLING, HANDLING_WITH_DELAY
            });
        }

        private Response(String s, int i)
        {
            super(s, i);
        }
    }

    private static class VideoInfo
    {

        public static VideoInfo DELAYED;
        private final String mCatalogId;
        private final boolean mHandleWithDelay;
        private final String mShowId;
        private final VideoType mVideoType;

        public static VideoInfo createFromEpisode(String s, String s1)
        {
            if (StringUtils.safeEquals(s, s1))
            {
                return new VideoInfo(false, s);
            } else
            {
                return new VideoInfo(false, s, s1);
            }
        }

        public static VideoInfo createFromMovie(String s)
        {
            return new VideoInfo(false, VideoType.MOVIE, s);
        }

        public static VideoInfo createFromShow(String s)
        {
            return new VideoInfo(false, VideoType.SHOW, s);
        }

        public String getCatalogId()
        {
            return mCatalogId;
        }

        public String getShowId()
        {
            return mShowId;
        }

        public VideoType getVideoType()
        {
            return mVideoType;
        }

        public boolean handleWithDelay()
        {
            return mHandleWithDelay;
        }

        static 
        {
            DELAYED = new VideoInfo(true, VideoType.UNAVAILABLE, null);
        }

        private VideoInfo(boolean flag, VideoType videotype, String s)
        {
            mHandleWithDelay = flag;
            mVideoType = videotype;
            mCatalogId = s;
            mShowId = null;
        }

        private VideoInfo(boolean flag, String s)
        {
            mHandleWithDelay = flag;
            mVideoType = VideoType.SHOW;
            mCatalogId = s;
            mShowId = null;
        }

        private VideoInfo(boolean flag, String s, String s1)
        {
            mHandleWithDelay = flag;
            mVideoType = VideoType.EPISODE;
            mCatalogId = s1;
            mShowId = s;
        }
    }


    public static final String INTENT_RESULT = "com.netflix.mediaclient.intent.action.NFLX_HANDLER_RESULT";
    private static final String JSON_CATALOG_TITLE = "catalog_title";
    private static final String JSON_ID = "id";
    private static final String JSON_TITLE_SERIES = "title_series";
    private static final String NFLX_ACTION_HOME = "home";
    private static final String NFLX_ACTION_PLAY = "play";
    private static final String NFLX_ACTION_SEARCH = "search";
    private static final String NFLX_ACTION_SYNC = "sync";
    private static final String NFLX_ACTION_VIEW_DETAILS = "view_details";
    private static final String NFLX_ACTION_VIEW_GENRE = "g";
    private static final String NFLX_BROWSE_PATH = "/browse";
    private static final String NFLX_HOST = "www.netflix.com";
    private static final String NFLX_PARAM_ACTION = "action";
    private static final String NFLX_PARAM_EPISODE_ID = "episodeid";
    private static final String NFLX_PARAM_EPISODE_ID_URI_PATH_KEY = "programs/";
    private static final String NFLX_PARAM_GENRE_ID = "genreid";
    private static final String NFLX_PARAM_MOVIE_ID = "movieid";
    private static final String NFLX_PARAM_MOVIE_ID_MOVIE_URI_PATH_KEY = "movies/";
    private static final String NFLX_PARAM_MOVIE_ID_SERIES_URI_PATH_KEY = "series/";
    private static final String NFLX_PARAM_QUERY = "query";
    private static final String NFLX_PARAM_TARGET_ID = "targetid";
    private static final String NFLX_PARAM_TARGET_URL = "target_url";
    private static final String NFLX_PARAM_TRACKID = "trkid";
    private static final String NFLX_SCHEME = "nflx";
    public static final String PARAM_STATUS = "status";
    private static final String TAG = "NflxHandler";
    private static final String URN_SUFFIX = "::urn";
    private static final String UUID_PREFIX = "uuid:";
    private static final String WEBAPI_EXPAND_SERVICE = "http://api.netflix.com/catalog/tiny/expand/";

    public NflxHandler()
    {
    }

    private String extractId(String s)
    {
        if (!StringUtils.isEmpty(s))
        {
            int i = s.lastIndexOf("/");
            if (i <= 0)
            {
                Log.d("NflxHandler", "Check if this is simple ID");
                if (StringUtils.isInteger(s))
                {
                    return s.trim();
                }
            } else
            {
                return s.substring(i + 1);
            }
        }
        return null;
    }

    private String extractJustUuid(String s)
    {
        if (StringUtils.isEmpty(s))
        {
            return null;
        }
        int i;
        int j;
        if (s.contains("uuid:"))
        {
            i = s.indexOf("uuid:") + "uuid:".length();
        } else
        {
            i = 0;
        }
        if (s.contains("::urn"))
        {
            j = s.indexOf("::urn");
        } else
        {
            j = s.length();
        }
        return s.substring(i, j);
    }

    private String getEpisodeId(Map map)
    {
        map = (String)map.get("episodeid");
        if (StringUtils.isEmpty(map))
        {
            Log.v("NflxHandler", "episode id uri doesn't exist in params map");
            return null;
        }
        String s = URLDecoder.decode(map, "utf-8");
        map = s;
_L2:
        return getVideoIdFromUri(map, "programs/");
        UnsupportedEncodingException unsupportedencodingexception;
        unsupportedencodingexception;
        Log.e("NflxHandler", "Failed to decode URL", unsupportedencodingexception);
        if (true) goto _L2; else goto _L1
_L1:
    }

    private static String getExpandUrl(String s)
    {
        if (Log.isLoggable("NflxHandler", 3))
        {
            Log.d("NflxHandler", (new StringBuilder()).append("Gets expanded tiny URL ").append(s).toString());
        }
        if (StringUtils.isEmpty(s))
        {
            throw new IllegalArgumentException("Tiny URL can not be empty!");
        }
        String as[] = s.split("/");
        if (as == null || as.length < 2)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Movie ID not found in tiny URL ").append(s).toString());
        }
        s = (new StringBuilder()).append("http://api.netflix.com/catalog/tiny/expand/").append(as[as.length - 1]).append("?output=json").toString();
        if (Log.isLoggable("NflxHandler", 3))
        {
            Log.d("NflxHandler", (new StringBuilder()).append("Expanded tiny URL: ").append(s).toString());
        }
        return s;
    }

    private PlayContext getPlayContext(String s)
    {
        if (!StringUtils.isNotEmpty(s))
        {
            break MISSING_BLOCK_LABEL_45;
        }
        PlayContextImp playcontextimp = new PlayContextImp(null, Integer.parseInt(s), 0, 0);
        return playcontextimp;
        Exception exception;
        exception;
        Log.e("NflxHandler", String.format("Error parsing trackId %s", new Object[] {
            s
        }));
        return PlayContext.NFLX_MDX_CONTEXT;
    }

    private String getSource(Map map)
    {
        String s = (String)map.get("action");
        map = s;
        if (StringUtils.isEmpty(s))
        {
            Log.w("NflxHandler", "Source is empty!");
            map = "uknown";
        }
        return map;
    }

    private String getVideoIdFromUri(String s, String s1)
    {
        String s2;
        int i = s.lastIndexOf(s1);
        if (i <= 0)
        {
            break MISSING_BLOCK_LABEL_113;
        }
        s2 = s.substring(i + s1.length());
        if (Log.isLoggable("NflxHandler", 2))
        {
            Log.v("NflxHandler", (new StringBuilder()).append("Found video id: ").append(s2).append(" for path key: ").append(s1).toString());
        }
        if (!StringUtils.isEmpty(s2)) goto _L2; else goto _L1
_L1:
        Log.v("NflxHandler", "empty video id");
        s = null;
_L4:
        return s;
_L2:
        int j;
        j = s2.indexOf("/");
        s = s2;
        if (j <= 0) goto _L4; else goto _L3
_L3:
        return s2.substring(j + 1);
        return null;
    }

    private VideoInfo getVideoInfo(NetflixActivity netflixactivity, IMdx imdx, String s, Map map)
    {
        String s1 = (String)map.get("movieid");
        String s2 = getEpisodeId(map);
        if (StringUtils.isNotEmpty(s2))
        {
            Log.d("NflxHandler", "Episode ID found, go to SDP for that episode");
            VideoInfo videoinfo = getVideoInfoFromMovieId(s1);
            if (videoinfo != null)
            {
                videoinfo = VideoInfo.createFromEpisode(videoinfo.getCatalogId(), s2);
                if (videoinfo != null)
                {
                    if (Log.isLoggable("NflxHandler", 3))
                    {
                        Log.d("NflxHandler", (new StringBuilder()).append("VideoInfo object found for episode id ").append(s2).append(". Default to SDP ").append(videoinfo).toString());
                    }
                    return videoinfo;
                }
                if (Log.isLoggable("NflxHandler", 5))
                {
                    Log.w("NflxHandler", (new StringBuilder()).append("VideoInfo object not returned for episode id ").append(s2).append(". Default to show").toString());
                }
            } else
            if (Log.isLoggable("NflxHandler", 5))
            {
                Log.e("NflxHandler", (new StringBuilder()).append("This should NOT happen! VideoInfo object not returned for show id ").append(s1).append(". Default to regular workflow").toString());
            }
        }
        if (StringUtils.isEmpty(s1))
        {
            return getVideoInfoFromTinyUrl(netflixactivity, imdx, s, map);
        } else
        {
            return getVideoInfoFromMovieId(s1);
        }
    }

    private VideoInfo getVideoInfoFromMovieId(String s)
    {
        String s1 = URLDecoder.decode(s, "utf-8");
        s = s1;
_L2:
        if (Log.isLoggable("NflxHandler", 3))
        {
            Log.d("NflxHandler", "movie id uri exist in params map");
            Log.d("NflxHandler", (new StringBuilder()).append("Gets video info from ").append(s).toString());
        }
        String s2 = getVideoIdFromUri(s, "series/");
        if (s2 != null)
        {
            return VideoInfo.createFromShow(s2);
        }
        break; /* Loop/switch isn't completed */
        UnsupportedEncodingException unsupportedencodingexception;
        unsupportedencodingexception;
        Log.e("NflxHandler", "Failed to decode URL", unsupportedencodingexception);
        if (true) goto _L2; else goto _L1
_L1:
        s = getVideoIdFromUri(s, "movies/");
        if (s != null)
        {
            return VideoInfo.createFromMovie(s);
        } else
        {
            Log.e("NflxHandler", "Unable to get video id! This should NOT happen!");
            return null;
        }
    }

    private VideoInfo getVideoInfoFromTinyUrl(final NetflixActivity activity, final IMdx mdx, final String action, final Map paramsMap)
    {
        final String tinyUrl = (String)paramsMap.get("target_url");
        if (StringUtils.isEmpty(tinyUrl))
        {
            Log.v("NflxHandler", "movie id uri and tiny url both doesn't exist in params map");
            return null;
        } else
        {
            Log.v("NflxHandler", "movie id uri doesn't exist in params map, but tiny url does. Resolve it");
            (new BackgroundTask()).execute(new Runnable() {

                final NflxHandler this$0;
                final String val$action;
                final NetflixActivity val$activity;
                final IMdx val$mdx;
                final Map val$paramsMap;
                final String val$tinyUrl;

                public void run()
                {
                    Log.d("NflxHandler", "Resolving tiny URL in background");
                    handleTinyUrl(activity, mdx, action, tinyUrl, extractJustUuid((String)paramsMap.get("targetid")), (String)paramsMap.get("trkid"));
                }

            
            {
                this$0 = NflxHandler.this;
                activity = netflixactivity;
                mdx = imdx;
                action = s;
                tinyUrl = s1;
                paramsMap = map;
                super();
            }
            });
            return VideoInfo.DELAYED;
        }
    }

    private Response handleEpisodeFromTinyUrl(NetflixActivity netflixactivity, IMdx imdx, String s, JSONObject jsonobject, String s1, String s2)
        throws JSONException, InvalidParameterException
    {
        Response response = Response.HANDLING;
        if ("play".equalsIgnoreCase(s))
        {
            handleEpisodePlayFromTinyUrl(netflixactivity, imdx, s, jsonobject, s1, s2);
            return Response.HANDLING_WITH_DELAY;
        }
        if ("view_details".equalsIgnoreCase(s))
        {
            handleEpisodeVideoDetailFromTinyUrl(netflixactivity, s, jsonobject, s2);
            return response;
        }
        if (Log.isLoggable("NflxHandler", 6))
        {
            Log.e("NflxHandler", (new StringBuilder()).append("Not supported action for tiny URL, default to LOLOMO: ").append(s).toString());
        }
        handleHomeAction(netflixactivity);
        return response;
    }

    private void handleEpisodePlayFromTinyUrl(NetflixActivity netflixactivity, IMdx imdx, String s, JSONObject jsonobject, String s1, String s2)
        throws JSONException, InvalidParameterException
    {
        if (!jsonobject.has("id"))
        {
            Log.e("NflxHandler", "It should be episode JSON, failed to get title series id! Default to LOLOMO!");
            handleHomeAction(netflixactivity);
            return;
        } else
        {
            playVideo(netflixactivity, imdx, String.valueOf(WebApiUtils.extractIsd(null, jsonobject.getString("id")).episodeId), VideoType.EPISODE, s1, s2);
            return;
        }
    }

    private void handleEpisodeVideoDetailFromTinyUrl(NetflixActivity netflixactivity, String s, JSONObject jsonobject, String s1)
        throws JSONException, InvalidParameterException
    {
        s = jsonobject.optString("id");
        if (StringUtils.isEmpty(s))
        {
            Log.e("NflxHandler", "It should be episode JSON, failed to get id! Default to LOLOMO!");
            handleHomeAction(netflixactivity);
            return;
        }
        jsonobject = jsonobject.optJSONObject("title_series");
        if (jsonobject == null)
        {
            Log.e("NflxHandler", "It should be episode JSON, failed to get title series! Default to LOLOMO!");
            handleHomeAction(netflixactivity);
            return;
        }
        if (!jsonobject.has("id"))
        {
            Log.e("NflxHandler", "It should be episode JSON, failed to get title series id! Default to LOLOMO!");
            handleHomeAction(netflixactivity);
            return;
        }
        jsonobject = jsonobject.getString("id");
        if (StringUtils.isEmpty(jsonobject))
        {
            Log.e("NflxHandler", "It should be episode, failed to get showIdUri! Default to LOLOMO!");
            handleHomeAction(netflixactivity);
            return;
        }
        String s2 = extractId(jsonobject);
        if (StringUtils.isEmpty(s2))
        {
            Log.e("NflxHandler", (new StringBuilder()).append("It should be episode, failed to get show id from url! Default to LOLOMO! Url was: ").append(jsonobject).toString());
            handleHomeAction(netflixactivity);
            return;
        }
        String s3 = extractId(s);
        if (StringUtils.isEmpty(s3))
        {
            Log.e("NflxHandler", (new StringBuilder()).append("It should be episode, failed to get episode id from url! Default to show SDP! Url was: ").append(s).toString());
            DetailsActivity.show(netflixactivity, VideoType.SHOW, s2, "", getPlayContext(s1));
            return;
        }
        if (Log.isLoggable("NflxHandler", 3))
        {
            Log.d("NflxHandler", (new StringBuilder()).append("Handling episode from tiny URL. Expanded to: episodeId ").append(s3).append(" and showId ").append(s2).toString());
            Log.d("NflxHandler", (new StringBuilder()).append("Expanded from: episodeIdUri ").append(s).append(" and shodIdUri ").append(jsonobject).toString());
            Log.v("NflxHandler", "Showing SDP");
        }
        DetailsActivity.showEpisodeDetails(netflixactivity, s2, s3, getPlayContext(s1));
    }

    private Response handleHomeAction(NetflixActivity netflixactivity)
    {
        Log.v("NflxHandler", "Starting home activity");
        netflixactivity.startActivity(HomeActivity.createStartIntent(netflixactivity));
        netflixactivity.overridePendingTransition(0, 0);
        return Response.HANDLING;
    }

    private Response handleMovieFromTinyUrl(NetflixActivity netflixactivity, IMdx imdx, String s, JSONObject jsonobject, String s1, String s2)
        throws JSONException
    {
        if (!jsonobject.has("id"))
        {
            Log.e("NflxHandler", "It should be movie JSON, failed to get ID URL! Default to LOLOMO!");
            handleHomeAction(netflixactivity);
            return Response.HANDLING;
        }
        jsonobject = jsonobject.getString("id");
        String s3 = getVideoIdFromUri(jsonobject, "movies/");
        if (Log.isLoggable("NflxHandler", 3))
        {
            Log.d("NflxHandler", (new StringBuilder()).append("Handling movie from tiny URL. Expanded to: ").append(jsonobject).append(". Extracted video id: ").append(s3).toString());
        }
        if (s3 != null)
        {
            if ("play".equalsIgnoreCase(s))
            {
                playVideo(netflixactivity, imdx, s3, VideoType.MOVIE, s1, s2);
                return Response.HANDLING_WITH_DELAY;
            }
            if ("view_details".equalsIgnoreCase(s))
            {
                if (Log.isLoggable("NflxHandler", 2))
                {
                    Log.v("NflxHandler", (new StringBuilder()).append("Showing MDP for: ").append(s3).toString());
                }
                DetailsActivity.show(netflixactivity, VideoType.MOVIE, s3, "", getPlayContext(s2));
            } else
            {
                if (Log.isLoggable("NflxHandler", 6))
                {
                    Log.e("NflxHandler", (new StringBuilder()).append("Not supported action for tiny URL, default to LOLOMO: ").append(s).toString());
                }
                handleHomeAction(netflixactivity);
            }
        } else
        {
            Log.e("NflxHandler", "Video ID not found, return to LOLOMO");
            handleHomeAction(netflixactivity);
        }
        return Response.HANDLING;
    }

    private Response handleNflxParams(NetflixActivity netflixactivity, IMdx imdx, IClientLogging iclientlogging, Map map, long l)
    {
        if (Log.isLoggable("NflxHandler", 2))
        {
            Log.v("NflxHandler", (new StringBuilder()).append("Params map: ").append(map.toString()).toString());
        }
        if (map.size() > 0) goto _L2; else goto _L1
_L1:
        Object obj;
        Log.w("NflxHandler", "no params exist");
        obj = Response.NOT_HANDLING;
_L4:
        return ((Response) (obj));
_L2:
        obj = (String)map.get("action");
        if (obj == null)
        {
            Log.w("NflxHandler", "Action is null!");
            return Response.NOT_HANDLING;
        }
        String s = ((String) (obj)).toLowerCase(Locale.US);
        obj = Response.NOT_HANDLING;
        Object obj1 = null;
        String s1 = getSource(map);
        boolean flag = false;
        if (iclientlogging != null)
        {
            if (Log.isLoggable("NflxHandler", 3))
            {
                Log.d("NflxHandler", (new StringBuilder()).append("Reporting that application is started from deep link. Source: ").append(s1).append(", action: ").append(s).toString());
            }
            if (iclientlogging != null && iclientlogging.getCustomerEventLogging() != null)
            {
                iclientlogging.getCustomerEventLogging().reportApplicationLaunchedFromDeepLinking(s1, s, map.toString());
            }
        } else
        {
            Log.w("NflxHandler", "Client logging is null. Unable to report deep linking start!");
        }
        if ("home".equalsIgnoreCase(s))
        {
            Log.v("NflxHandler", "handleHomeAction starts...");
            flag = true;
            map = com.netflix.mediaclient.servicemgr.IClientLogging.ModalView.homeScreen;
            imdx = handleHomeAction(netflixactivity);
        } else
        if ("play".equalsIgnoreCase(s))
        {
            obj = com.netflix.mediaclient.servicemgr.IClientLogging.ModalView.playback;
            imdx = handlePlayAction(netflixactivity, imdx, map);
            map = ((Map) (obj));
        } else
        if ("view_details".equalsIgnoreCase(s))
        {
            if (iclientlogging != null && iclientlogging.getCustomerEventLogging() != null)
            {
                iclientlogging.getCustomerEventLogging().reportMdpFromDeepLinking(map.toString());
            }
            imdx = com.netflix.mediaclient.servicemgr.IClientLogging.ModalView.movieDetails;
            obj = handleViewDetailsAction(netflixactivity, map);
            map = imdx;
            imdx = ((IMdx) (obj));
        } else
        if ("g".equalsIgnoreCase(s))
        {
            flag = true;
            imdx = com.netflix.mediaclient.servicemgr.IClientLogging.ModalView.browseTitles;
            obj = handleViewGenreAction(netflixactivity, map);
            map = imdx;
            imdx = ((IMdx) (obj));
        } else
        if ("search".equalsIgnoreCase(s))
        {
            imdx = com.netflix.mediaclient.servicemgr.IClientLogging.ModalView.search;
            obj = handleSearchAction(netflixactivity, map);
            map = imdx;
            imdx = ((IMdx) (obj));
        } else
        if ("sync".equalsIgnoreCase(s))
        {
            flag = true;
            obj = com.netflix.mediaclient.servicemgr.IClientLogging.ModalView.homeScreen;
            imdx = handleSyncAction(netflixactivity, imdx, map);
            map = ((Map) (obj));
        } else
        {
            Log.w("NflxHandler", (new StringBuilder()).append("Unknown Nflx action: ").append(s).toString());
            map = obj1;
            imdx = ((IMdx) (obj));
        }
        obj = imdx;
        if (iclientlogging == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (imdx == Response.HANDLING)
        {
            break; /* Loop/switch isn't completed */
        }
        obj = imdx;
        if (imdx != Response.HANDLING_WITH_DELAY) goto _L4; else goto _L3
_L3:
        iclientlogging.getApplicationPerformanceMetricsLogging().startUiStartupSession(com.netflix.mediaclient.servicemgr.ApplicationPerformanceMetricsLogging.UiStartupTrigger.externalControlProtocol, map, Long.valueOf(l), LogUtils.getDisplay(netflixactivity));
        obj = imdx;
        if (flag)
        {
            iclientlogging.getApplicationPerformanceMetricsLogging().startUiBrowseStartupSession(l);
            return imdx;
        }
        if (true) goto _L4; else goto _L5
_L5:
    }

    private Response handlePlayAction(NetflixActivity netflixactivity, IMdx imdx, Map map)
    {
        Log.v("NflxHandler", "handlePlayAction starts...");
        String s = extractJustUuid((String)map.get("targetid"));
        VideoInfo videoinfo = getVideoInfo(netflixactivity, imdx, "play", map);
        if (videoinfo == null)
        {
            Log.e("NflxHandler", "handlePlayAction fails, no video info found!");
            return Response.NOT_HANDLING;
        }
        if (videoinfo.handleWithDelay())
        {
            Log.v("NflxHandler", "handlePlayAction ends, handling with delay.");
            return Response.HANDLING_WITH_DELAY;
        }
        if (videoinfo != null)
        {
            Log.v("NflxHandler", "handlePlayAction ends, handling.");
            VideoType videotype = videoinfo.getVideoType();
            if (videotype == VideoType.MOVIE)
            {
                playVideo(netflixactivity, imdx, videoinfo.getCatalogId(), VideoType.MOVIE, s, (String)map.get("trkid"));
                return Response.HANDLING_WITH_DELAY;
            }
            if (videotype == VideoType.EPISODE)
            {
                String s1 = getEpisodeId(map);
                if (StringUtils.isEmpty(s1))
                {
                    Log.v("NflxHandler", "no episode id");
                    return Response.NOT_HANDLING;
                } else
                {
                    playVideo(netflixactivity, imdx, s1, VideoType.EPISODE, s, (String)map.get("trkid"));
                    return Response.HANDLING_WITH_DELAY;
                }
            }
            if (Log.isLoggable("NflxHandler", 2))
            {
                Log.v("NflxHandler", (new StringBuilder()).append("Can't play video of type: ").append(videotype).toString());
            }
        }
        return Response.NOT_HANDLING;
    }

    private Response handleSearchAction(NetflixActivity netflixactivity, Map map)
    {
        map = (String)map.get("query");
        if (StringUtils.isEmpty(map))
        {
            Log.v("NflxHandler", "Could not find query param");
            return Response.NOT_HANDLING;
        } else
        {
            SearchActivity.search(netflixactivity, map);
            return Response.HANDLING;
        }
    }

    private Response handleSyncAction(NetflixActivity netflixactivity, IMdx imdx, Map map)
    {
        map = extractJustUuid((String)map.get("targetid"));
        if (imdx == null)
        {
            Log.e("NflxHandler", "Sync action is required, MDX agent is null. This should NOT happen!");
            return Response.NOT_HANDLING;
        }
        if (MdxUtils.isMdxTargetAvailable(netflixactivity.getServiceManager(), map))
        {
            Log.d("NflxHandler", "Sync action is required, target is available, sync");
            boolean flag = imdx.setDialUuidAsCurrentTarget(map);
            if (Log.isLoggable("NflxHandler", 3))
            {
                Log.d("NflxHandler", (new StringBuilder()).append("Set dial uuid as current target was success ").append(flag).toString());
            }
            return Response.NOT_HANDLING;
        } else
        {
            Log.d("NflxHandler", "Sync action is required, target not available, do nothing!");
            return Response.NOT_HANDLING;
        }
    }

    private void handleTinyUrl(NetflixActivity netflixactivity, IMdx imdx, String s, String s1, String s2, String s3)
    {
        Response response;
        ThreadUtils.assertNotOnMain();
        response = Response.HANDLING;
        s1 = StringUtils.getRemoteDataAsString(getExpandUrl(s1));
        if (Log.isLoggable("NflxHandler", 3))
        {
            Log.d("NflxHandler", (new StringBuilder()).append("Received response ").append(s1).toString());
        }
        s1 = new JSONObject(s1);
        if (s1.has("catalog_title")) goto _L2; else goto _L1
_L1:
        Log.e("NflxHandler", "No catalog_title in JSON object! Go to LOLOMO.");
        handleHomeAction(netflixactivity);
        imdx = response;
_L4:
        if (!Response.HANDLING_WITH_DELAY.equals(imdx))
        {
            reportDelayedResponseHandled(netflixactivity);
        }
        return;
_L2:
        s1 = s1.getJSONObject("catalog_title");
        if (!s1.has("title_series"))
        {
            Log.d("NflxHandler", "No title series in JSON object title. It must be movie. ");
            imdx = handleMovieFromTinyUrl(netflixactivity, imdx, s, s1, s2, s3);
            continue; /* Loop/switch isn't completed */
        }
        try
        {
            Log.d("NflxHandler", "Title series in JSON object title. It must be episode. ");
            imdx = handleEpisodeFromTinyUrl(netflixactivity, imdx, s, s1, s2, s3);
        }
        // Misplaced declaration of an exception variable
        catch (IMdx imdx)
        {
            Log.e("NflxHandler", "We failed to get expanded URL ", imdx);
            handleHomeAction(netflixactivity);
            imdx = response;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    private Response handleUriParams(NetflixActivity netflixactivity, IMdx imdx, IClientLogging iclientlogging, String s, long l)
    {
        if (Log.isLoggable("NflxHandler", 2))
        {
            Log.v("NflxHandler", (new StringBuilder()).append("nflx params string: ").append(s).toString());
        }
        s = s.split("[?&]");
        HashMap hashmap = new HashMap();
        int j = s.length;
        int i = 0;
        while (i < j) 
        {
            String s1 = s[i];
            int k = s1.indexOf("=");
            if (k <= 0)
            {
                Log.w("NflxHandler", (new StringBuilder()).append("No params found for: ").append(s1).toString());
            } else
            {
                hashmap.put(s1.substring(0, k), s1.substring(k + 1));
            }
            i++;
        }
        return handleNflxParams(netflixactivity, imdx, iclientlogging, hashmap, l);
    }

    private Response handleViewDetailsAction(NetflixActivity netflixactivity, Map map)
    {
        Log.v("NflxHandler", "handleViewDetailsAction starts...");
        VideoInfo videoinfo = getVideoInfo(netflixactivity, null, "view_details", map);
        if (videoinfo == null)
        {
            Log.e("NflxHandler", "handleViewDetailsAction fails, no video info found!");
            return Response.NOT_HANDLING;
        }
        if (videoinfo.handleWithDelay())
        {
            Log.v("NflxHandler", "handleViewDetailsAction ends, handling with delay.");
            return Response.HANDLING_WITH_DELAY;
        }
        VideoType videotype = videoinfo.getVideoType();
        String s = videoinfo.getCatalogId();
        if (videotype == VideoType.EPISODE)
        {
            if (Log.isLoggable("NflxHandler", 2))
            {
                Log.v("NflxHandler", (new StringBuilder()).append("Showing details for episode: ").append(s).append(", type: ").append(videotype).append(", show: ").append(videoinfo.getShowId()).toString());
            }
            DetailsActivity.showEpisodeDetails(netflixactivity, videoinfo.getShowId(), s, getPlayContext((String)map.get("trkid")));
        } else
        {
            if (Log.isLoggable("NflxHandler", 2))
            {
                Log.v("NflxHandler", (new StringBuilder()).append("Showing details for: ").append(s).append(", type: ").append(videotype).toString());
            }
            DetailsActivity.show(netflixactivity, videotype, s, "", getPlayContext((String)map.get("trkid")));
        }
        return Response.HANDLING;
    }

    private Response handleViewGenreAction(NetflixActivity netflixactivity, Map map)
    {
        map = (String)map.get("genreid");
        if (map == null)
        {
            Log.v("NflxHandler", "Could not find genre ID");
            return Response.NOT_HANDLING;
        } else
        {
            netflixactivity.getServiceManager().fetchLoLoMoSummary(map, new _cls1FetchLoLoMoSummaryCallback(netflixactivity, map));
            return Response.HANDLING_WITH_DELAY;
        }
    }

    private void play(NetflixActivity netflixactivity, IMdx imdx, Playable playable, String s, PlayContext playcontext)
    {
        if (StringUtils.isEmpty(s))
        {
            Log.d("NflxHandler", "Starting local playback");
            PlayerActivity.playVideo(netflixactivity, playable, playcontext);
            return;
        }
        if (Log.isLoggable("NflxHandler", 3))
        {
            Log.d("NflxHandler", (new StringBuilder()).append("Remote play required on target ").append(s).toString());
        }
        if (imdx == null)
        {
            Log.d("NflxHandler", "MDX is null, go local playback");
        } else
        {
            Log.d("NflxHandler", "MDX exist, check if target is available");
            if (imdx.setDialUuidAsCurrentTarget(s))
            {
                handleHomeAction(netflixactivity);
                boolean flag;
                if (!PlayerActivity.PIN_VERIFIED.booleanValue())
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                PlaybackLauncher.startPlaybackForceRemote(netflixactivity, Asset.create(playable, playcontext, flag));
                return;
            }
            Log.d("NflxHandler", "MDX does not know target dial UUID, go local playback");
        }
        PlayerActivity.playVideo(netflixactivity, playable, playcontext);
    }

    private void playVideo(final NetflixActivity final_netflixactivity, IMdx imdx, String s, VideoType videotype, String s1, final String final_s)
    {
        if (Log.isLoggable("NflxHandler", 2))
        {
            Log.v("NflxHandler", (new StringBuilder()).append("Playing video: ").append(s).toString());
        }
        if (VideoType.MOVIE.equals(videotype))
        {
            final_netflixactivity.getServiceManager().fetchMovieDetails(s, new _cls1FetchPlayableCallback(imdx, s1));
        } else
        if (VideoType.EPISODE.equals(videotype))
        {
            final_netflixactivity.getServiceManager().fetchEpisodeDetails(s, new _cls1FetchPlayableCallback(imdx, s1));
            return;
        }
    }

    private void reportDelayedResponseHandled(Activity activity)
    {
        if (AndroidUtils.isActivityFinishedOrDestroyed(activity))
        {
            return;
        } else
        {
            Intent intent = new Intent("com.netflix.mediaclient.intent.action.NFLX_HANDLER_RESULT");
            intent.addCategory("LocalIntentNflxUi");
            LocalBroadcastManager.getInstance(activity).sendBroadcast(intent);
            return;
        }
    }

    private void reportIfSourceIsNotification(IClientLogging iclientlogging, Intent intent)
    {
        if (intent.hasExtra("guid"))
        {
            String s = intent.getStringExtra("guid");
            if (intent.hasExtra("messageGuid"))
            {
                String s1 = intent.getStringExtra("messageGuid");
                intent = intent.getStringExtra("originator");
                if (StringUtils.isEmpty(intent))
                {
                    Log.w("NflxHandler", "Received notification WITHOUT ORIGINATOR! Pass default!");
                }
                intent = new MessageData(s, s1, intent);
                if (Log.isLoggable("NflxHandler", 3))
                {
                    Log.d("NflxHandler", (new StringBuilder()).append("User opened notification ").append(intent).toString());
                }
                if (iclientlogging != null && iclientlogging.getCmpEventLogging() != null)
                {
                    iclientlogging.getCmpEventLogging().reportUserFeedbackOnReceivedPushNotification(intent, UserFeedbackOnReceivedPushNotification.opened);
                }
                return;
            } else
            {
                Log.e("NflxHandler", "Message guid not found, source is not push notification");
                return;
            }
        } else
        {
            Log.e("NflxHandler", "Guid not found, source is not push notification");
            return;
        }
    }

    public Response handleNflxIntent(NetflixActivity netflixactivity, ServiceManager servicemanager, Intent intent, long l)
    {
        Log.d("NflxHandler", "Handle NFLX intent starts...");
        if (intent == null)
        {
            Log.v("NflxHandler", "null intent");
            return Response.NOT_HANDLING;
        }
        IMdx imdx = servicemanager.getMdx();
        servicemanager = servicemanager.getClientLogging();
        reportIfSourceIsNotification(servicemanager, intent);
        if (!"android.intent.action.VIEW".equalsIgnoreCase(intent.getAction()))
        {
            Log.v("NflxHandler", "unknown action");
            return Response.NOT_HANDLING;
        }
        if (intent.getData() == null)
        {
            Log.v("NflxHandler", "no uri");
            return Response.NOT_HANDLING;
        } else
        {
            AndroidUtils.logVerboseIntentInfo("NflxHandler", intent);
            return handleUri(netflixactivity, imdx, servicemanager, intent.getData(), l);
        }
    }

    public Response handleUri(NetflixActivity netflixactivity, IMdx imdx, IClientLogging iclientlogging, Uri uri, long l)
    {
        DataUtil.logVerboseUriInfo("NflxHandler", uri);
        if (!"nflx".equalsIgnoreCase(uri.getScheme()))
        {
            Log.v("NflxHandler", "unknown scheme");
            return Response.NOT_HANDLING;
        }
        if (!"www.netflix.com".equalsIgnoreCase(uri.getHost()))
        {
            Log.v("NflxHandler", "invalid host");
            return Response.NOT_HANDLING;
        }
        if (!"/browse".equalsIgnoreCase(uri.getPath()))
        {
            Log.v("NflxHandler", "invalid path");
            return Response.NOT_HANDLING;
        }
        uri = uri.getQueryParameter("q");
        if (StringUtils.isEmpty(uri))
        {
            Log.v("NflxHandler", "no nflx params");
            return Response.NOT_HANDLING;
        } else
        {
            return handleUriParams(netflixactivity, imdx, iclientlogging, uri, l);
        }
    }





}
