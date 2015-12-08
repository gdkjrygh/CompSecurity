// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.browse.volley;

import android.content.Context;
import com.google.gson.JsonObject;
import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.service.browse.BrowseAgent;
import com.netflix.mediaclient.service.browse.BrowseAgentCallback;
import com.netflix.mediaclient.service.browse.BrowseVideoSentinels;
import com.netflix.mediaclient.service.browse.cache.HardCache;
import com.netflix.mediaclient.service.browse.cache.SoftCache;
import com.netflix.mediaclient.service.webclient.model.CWVideo;
import com.netflix.mediaclient.service.webclient.model.MovieDetails;
import com.netflix.mediaclient.service.webclient.model.ShowDetails;
import com.netflix.mediaclient.service.webclient.model.leafs.SocialEvidence;
import com.netflix.mediaclient.service.webclient.model.leafs.TrackableListSummary;
import com.netflix.mediaclient.service.webclient.volley.FalcorParseException;
import com.netflix.mediaclient.service.webclient.volley.FalcorParseUtils;
import com.netflix.mediaclient.service.webclient.volley.FalcorServerException;
import com.netflix.mediaclient.service.webclient.volley.FalcorVolleyWebClientRequest;
import com.netflix.mediaclient.servicemgr.VideoType;
import com.netflix.mediaclient.util.StringUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

// Referenced classes of package com.netflix.mediaclient.service.browse.volley:
//            PrefetchHomeLoLoMoRequest

public class FetchCWVideosRequest extends FalcorVolleyWebClientRequest
{

    private static final int BOOKMARK_MARGIN_MS = 0x15f90;
    private static final String BOOKMARK_TAG = "nf_bookmark";
    private static final String FIELD_CW = "continueWatching";
    private static final String FIELD_LISTS = "lists";
    private static final String FIELD_LOLOMO = "lolomo";
    private static final String FIELD_LOLOMOS = "lolomos";
    private static final String TAG = "nf_service_browse_fetchcwvideosrequest";
    private final String cwId;
    private final boolean cwIdInCache;
    private final int fromSimilars = 0;
    private final int fromVideo;
    private final HardCache hardCache;
    private final String lolomoId;
    private final boolean lolomoIdInCache;
    private final String pqlQuery;
    private final String pqlQuery2;
    private final String pqlQuery3;
    private final String pqlQuery4;
    private final BrowseAgentCallback responseCallback;
    private final SoftCache softCache;
    private final int toSimilars;
    private final int toVideo;
    private final boolean userConnectedToFacebook;
    private final SoftCache weakSeasonsCache;

    public FetchCWVideosRequest(Context context, com.netflix.mediaclient.service.ServiceAgent.ConfigurationAgentInterface configurationagentinterface, HardCache hardcache, SoftCache softcache, SoftCache softcache1, int i, int j, 
            int k, boolean flag, BrowseAgentCallback browseagentcallback)
    {
        boolean flag1 = true;
        super(context, configurationagentinterface);
        responseCallback = browseagentcallback;
        fromVideo = i;
        toVideo = j;
        toSimilars = k;
        userConnectedToFacebook = flag;
        hardCache = hardcache;
        softCache = softcache;
        weakSeasonsCache = softcache1;
        cwId = BrowseAgent.getCWLoMoId(hardcache);
        if (cwId != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        cwIdInCache = flag;
        lolomoId = BrowseAgent.getLoLoMoId(hardcache);
        if (lolomoId != null)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        lolomoIdInCache = flag;
        if (cwIdInCache)
        {
            context = (new StringBuilder("['lists','")).append(cwId);
        } else
        if (lolomoIdInCache)
        {
            context = (new StringBuilder("['lolomos','")).append(lolomoId).append("','continueWatching");
        } else
        {
            context = (new StringBuilder("['lolomo',")).append("'continueWatching");
        }
        pqlQuery = (new StringBuilder(context)).append("', {'to':").append(j).append(",'from':").append(i).append("},['summary','detail', 'rating', 'inQueue', 'bookmark', 'bookmarkStill', 'socialEvidence']]").toString();
        pqlQuery2 = (new StringBuilder(context)).append("', {'to':").append(j).append(",'from':").append(i).append("},'episodes', 'current', ['detail', 'bookmark']]").toString();
        pqlQuery3 = (new StringBuilder(context)).append("', {'to':").append(j).append(",'from':").append(i).append("}, 'similars',").append("{'to':").append(k).append(",'from':").append(fromSimilars).append("}, 'summary']").toString();
        pqlQuery4 = (new StringBuilder(context)).append("', {'to':").append(j).append(",'from':").append(i).append("}, 'similars', 'summary']").toString();
        if (Log.isLoggable("nf_service_browse_fetchcwvideosrequest", 2))
        {
            Log.v("nf_service_browse_fetchcwvideosrequest", (new StringBuilder()).append("PQL = ").append(pqlQuery).append(" ").append(pqlQuery2).append(" ").append(pqlQuery3).append(" ").append(pqlQuery4).toString());
        }
    }

    public static List buildCWVideoList(JsonObject jsonobject, int i, int j, int k, boolean flag, HardCache hardcache, SoftCache softcache, SoftCache softcache1)
    {
        ArrayList arraylist = new ArrayList();
        int l = 0;
        while (j >= i) 
        {
            Object obj = Integer.toString(j);
            int i1;
            if (jsonobject.has(((String) (obj))))
            {
                i1 = 1;
                CWVideo cwvideo = new CWVideo();
                obj = jsonobject.getAsJsonObject(((String) (obj)));
                cwvideo.summary = (com.netflix.mediaclient.service.webclient.model.branches.Video.Summary)FalcorParseUtils.getPropertyObject(((JsonObject) (obj)), "summary", com/netflix/mediaclient/service/webclient/model/branches/Video$Summary);
                cwvideo.detail = (com.netflix.mediaclient.service.webclient.model.branches.Video.Detail)FalcorParseUtils.getPropertyObject(((JsonObject) (obj)), "detail", com/netflix/mediaclient/service/webclient/model/branches/Video$Detail);
                cwvideo.rating = (com.netflix.mediaclient.service.webclient.model.branches.Video.Rating)FalcorParseUtils.getPropertyObject(((JsonObject) (obj)), "rating", com/netflix/mediaclient/service/webclient/model/branches/Video$Rating);
                cwvideo.inQueue = (com.netflix.mediaclient.service.webclient.model.branches.Video.InQueue)FalcorParseUtils.getPropertyObject(((JsonObject) (obj)), "inQueue", com/netflix/mediaclient/service/webclient/model/branches/Video$InQueue);
                cwvideo.bookmark = (com.netflix.mediaclient.service.webclient.model.branches.Video.Bookmark)FalcorParseUtils.getPropertyObject(((JsonObject) (obj)), "bookmark", com/netflix/mediaclient/service/webclient/model/branches/Video$Bookmark);
                cwvideo.bookmarkStill = (com.netflix.mediaclient.service.webclient.model.branches.Video.BookmarkStill)FalcorParseUtils.getPropertyObject(((JsonObject) (obj)), "bookmarkStill", com/netflix/mediaclient/service/webclient/model/branches/Video$BookmarkStill);
                cwvideo.socialEvidence = (SocialEvidence)FalcorParseUtils.getPropertyObject(((JsonObject) (obj)), "socialEvidence", com/netflix/mediaclient/service/webclient/model/leafs/SocialEvidence);
                if (!VideoType.MOVIE.equals(cwvideo.summary.getType()) && ((JsonObject) (obj)).has("episodes"))
                {
                    JsonObject jsonobject1 = ((JsonObject) (obj)).getAsJsonObject("episodes");
                    if (jsonobject1.has("current"))
                    {
                        jsonobject1 = jsonobject1.getAsJsonObject("current");
                        cwvideo.currentEpisode = (com.netflix.mediaclient.service.webclient.model.branches.Episode.Detail)FalcorParseUtils.getPropertyObject(jsonobject1, "detail", com/netflix/mediaclient/service/webclient/model/branches/Episode$Detail);
                        cwvideo.currentEpisodeBookmark = (com.netflix.mediaclient.service.webclient.model.branches.Video.Bookmark)FalcorParseUtils.getPropertyObject(jsonobject1, "bookmark", com/netflix/mediaclient/service/webclient/model/branches/Video$Bookmark);
                    }
                }
                cwvideo.userConnectedToFacebook = flag;
                ArrayList arraylist1 = new ArrayList();
                if (((JsonObject) (obj)).has("similars"))
                {
                    obj = ((JsonObject) (obj)).getAsJsonObject("similars");
                    for (l = 0; l <= k; l++)
                    {
                        String s = Integer.toString(l);
                        if (((JsonObject) (obj)).has(s))
                        {
                            arraylist1.add((com.netflix.mediaclient.service.webclient.model.branches.Video.Summary)FalcorParseUtils.getPropertyObject(((JsonObject) (obj)).getAsJsonObject(s), "summary", com/netflix/mediaclient/service/webclient/model/branches/Video$Summary));
                        }
                    }

                    cwvideo.similarListSummary = (TrackableListSummary)FalcorParseUtils.getPropertyObject(((JsonObject) (obj)), "summary", com/netflix/mediaclient/service/webclient/model/leafs/TrackableListSummary);
                }
                cwvideo.similarVideos = arraylist1;
                if (VideoType.MOVIE.equals(cwvideo.getType()))
                {
                    mergeWithMDP(hardcache, softcache, softcache1, cwvideo);
                } else
                {
                    mergeWithSDP(hardcache, softcache, softcache1, cwvideo);
                }
                arraylist.add(0, cwvideo);
            } else
            {
                i1 = l;
                if (l != 0)
                {
                    Log.d("nf_service_browse_fetchcwvideosrequest", String.format("Adding sentinel at index %s", new Object[] {
                        obj
                    }));
                    arraylist.add(0, BrowseVideoSentinels.getUnavailableCwVideo());
                    i1 = l;
                }
            }
            j--;
            l = i1;
        }
        return arraylist;
    }

    private static void buildMdpFromCw(SoftCache softcache, String s, CWVideo cwvideo)
    {
        if (cwvideo != null)
        {
            MovieDetails moviedetails = new MovieDetails();
            ArrayList arraylist = new ArrayList();
            if (moviedetails != null && arraylist != null)
            {
                moviedetails.summary = cwvideo.summary;
                moviedetails.detail = cwvideo.detail;
                moviedetails.rating = cwvideo.rating;
                moviedetails.inQueue = cwvideo.inQueue;
                moviedetails.bookmark = cwvideo.bookmark;
                moviedetails.bookmarkStill = cwvideo.bookmarkStill;
                moviedetails.socialEvidence = cwvideo.socialEvidence;
                moviedetails.similarVideos = cwvideo.similarVideos;
                moviedetails.similarListSummary = cwvideo.similarListSummary;
                moviedetails.userConnectedToFacebook = cwvideo.userConnectedToFacebook;
                softcache.put(s, moviedetails);
                Log.d("nf_service_browse_fetchcwvideosrequest", String.format("Created MDP from cw for (%s) %s", new Object[] {
                    moviedetails.getId(), moviedetails.getTitle()
                }));
                return;
            }
        }
    }

    private static void buildSdpFromCw(SoftCache softcache, String s, CWVideo cwvideo)
    {
        if (cwvideo == null)
        {
            return;
        } else
        {
            ShowDetails showdetails = new ShowDetails();
            showdetails.summary = cwvideo.summary;
            showdetails.detail = cwvideo.detail;
            showdetails.rating = cwvideo.rating;
            showdetails.inQueue = cwvideo.inQueue;
            showdetails.bookmark = cwvideo.bookmark;
            showdetails.bookmarkStill = cwvideo.bookmarkStill;
            showdetails.socialEvidence = cwvideo.socialEvidence;
            showdetails.currentEpisode = cwvideo.currentEpisode;
            showdetails.currentEpisodeBookmark = cwvideo.currentEpisodeBookmark;
            showdetails.userConnectedToFacebook = cwvideo.userConnectedToFacebook;
            softcache.put(s, showdetails);
            Log.d("nf_service_browse_fetchcwvideosrequest", String.format("Created SDP from cw for (%s) %s", new Object[] {
                showdetails.getId(), showdetails.getTitle()
            }));
            return;
        }
    }

    public static void mergeWithMDP(HardCache hardcache, SoftCache softcache, SoftCache softcache1, CWVideo cwvideo)
    {
        com/netflix/mediaclient/service/browse/volley/FetchCWVideosRequest;
        JVM INSTR monitorenter ;
        softcache1 = BrowseAgent.buildBrowseCacheKey(BrowseAgent.CACHE_KEY_PREFIX_MDP, cwvideo.getId(), "0", "0");
        hardcache = ((HardCache) (BrowseAgent.getFromCaches(hardcache, softcache, softcache1)));
        if (hardcache == null)
        {
            break MISSING_BLOCK_LABEL_305;
        }
        hardcache = (MovieDetails)hardcache;
        if (((MovieDetails) (hardcache)).bookmark == null) goto _L2; else goto _L1
_L1:
        Log.d("nf_bookmark", String.format("mergeWithMDP: %s - server bookmarkTime %d, bookmark %d : local bookmarkTime %d bookmark %d", new Object[] {
            cwvideo.getId(), Long.valueOf(cwvideo.getBookmarkLastUpdateTime()), Integer.valueOf(cwvideo.getBookmarkPosition()), Long.valueOf(hardcache.getPlayableBookmarkUpdateTime()), Integer.valueOf(hardcache.getBookmarkPosition())
        }));
        if (!useLocalMdpBookmark(cwvideo, hardcache)) goto _L4; else goto _L3
_L3:
        cwvideo.bookmark.setBookmarkPosition(hardcache.getBookmarkPosition());
        cwvideo.bookmark.setLastModified(hardcache.getPlayableBookmarkUpdateTime());
        if (cwvideo.bookmarkStill != null)
        {
            cwvideo.bookmarkStill.stillUrl = BrowseAgent.buildStillUrlFromPos(cwvideo.getBaseUrl(), cwvideo.getPlayableBookmarkPosition(), cwvideo.getEndtime());
        }
        Log.d("nf_bookmark", String.format("mergeWithMDP: %s using local MDP bookmark; new bookmarkTime %d, bookmark %d ", new Object[] {
            cwvideo.getId(), Long.valueOf(cwvideo.getBookmarkLastUpdateTime()), Integer.valueOf(cwvideo.getBookmarkPosition())
        }));
_L6:
        hardcache.userConnectedToFacebook = cwvideo.userConnectedToFacebook;
_L2:
        com/netflix/mediaclient/service/browse/volley/FetchCWVideosRequest;
        JVM INSTR monitorexit ;
        return;
_L4:
        if (cwvideo.getBookmarkPosition() == hardcache.getBookmarkPosition()) goto _L6; else goto _L5
_L5:
        ((MovieDetails) (hardcache)).bookmark.setBookmarkPosition(cwvideo.getBookmarkPosition());
        ((MovieDetails) (hardcache)).bookmark.setLastModified(cwvideo.getBookmarkLastUpdateTime());
        Log.d("nf_bookmark", String.format("mergeWithMDP: %s using CW bookmark; new bookmarkTime %d, bookmark %d  ", new Object[] {
            hardcache.getId(), Long.valueOf(hardcache.getPlayableBookmarkUpdateTime()), Integer.valueOf(hardcache.getBookmarkPosition())
        }));
          goto _L6
        hardcache;
        throw hardcache;
        buildMdpFromCw(softcache, softcache1, cwvideo);
          goto _L2
    }

    public static void mergeWithSDP(HardCache hardcache, SoftCache softcache, SoftCache softcache1, CWVideo cwvideo)
    {
        com/netflix/mediaclient/service/browse/volley/FetchCWVideosRequest;
        JVM INSTR monitorenter ;
        String s;
        s = BrowseAgent.buildBrowseCacheKey(BrowseAgent.CACHE_KEY_PREFIX_SDP, cwvideo.getId(), "0", "0");
        hardcache = ((HardCache) (BrowseAgent.getFromCaches(hardcache, softcache, s)));
        if (hardcache == null)
        {
            break MISSING_BLOCK_LABEL_364;
        }
        hardcache = (ShowDetails)hardcache;
        hardcache.userConnectedToFacebook = cwvideo.userConnectedToFacebook;
        if (((ShowDetails) (hardcache)).currentEpisode == null || ((ShowDetails) (hardcache)).currentEpisodeBookmark == null || cwvideo.currentEpisode == null) goto _L2; else goto _L1
_L1:
        softcache = cwvideo.currentEpisodeBookmark;
        if (softcache != null) goto _L3; else goto _L2
_L2:
        com/netflix/mediaclient/service/browse/volley/FetchCWVideosRequest;
        JVM INSTR monitorexit ;
        return;
_L3:
        Log.d("nf_bookmark", String.format("mergeWithSDP: %s - server ce %s bookmarkTime %d, bookmark %d : local ce %s bookmarkTime %d bookmark %d ", new Object[] {
            cwvideo.getId(), cwvideo.getCurrentEpisodeId(), Long.valueOf(cwvideo.getBookmarkLastUpdateTime()), Integer.valueOf(cwvideo.getBookmarkPosition()), hardcache.getCurrentEpisodeId(), Long.valueOf(hardcache.getBookmarkCreationTime()), Integer.valueOf(hardcache.getBookmarkPosition())
        }));
        if (!useLocalSdpBookmark(cwvideo, hardcache))
        {
            break MISSING_BLOCK_LABEL_274;
        }
        cwvideo.currentEpisode = ((ShowDetails) (hardcache)).currentEpisode;
        cwvideo.currentEpisodeBookmark = ((ShowDetails) (hardcache)).currentEpisodeBookmark;
        if (cwvideo.bookmarkStill != null)
        {
            cwvideo.bookmarkStill.stillUrl = BrowseAgent.buildStillUrlFromPos(cwvideo.currentEpisode.getBaseUrl(), cwvideo.getPlayableBookmarkPosition(), cwvideo.getEndtime());
        }
        Log.d("nf_bookmark", String.format("mergeWithSDP: %s using local SDP; new ce %s bookmarkTime %d, bookmark %d ", new Object[] {
            cwvideo.getId(), cwvideo.getCurrentEpisodeId(), Long.valueOf(cwvideo.getBookmarkLastUpdateTime()), Integer.valueOf(cwvideo.getBookmarkPosition())
        }));
          goto _L2
        hardcache;
        throw hardcache;
        hardcache.currentEpisode = cwvideo.currentEpisode;
        hardcache.currentEpisodeBookmark = cwvideo.currentEpisodeBookmark;
        BrowseAgent.updateSeasonsInformation(softcache1, cwvideo.currentEpisode.getSeasonId(), cwvideo.currentEpisode.getEpisodeNumber());
        Log.d("nf_bookmark", String.format("mergeWithSDP: %s updating local SDP ce %s bookmarkTime %d, bookmark %d  ", new Object[] {
            hardcache.getId(), ((ShowDetails) (hardcache)).currentEpisode.getId(), Long.valueOf(hardcache.getBookmarkCreationTime()), Integer.valueOf(hardcache.getBookmarkPosition())
        }));
          goto _L2
        buildSdpFromCw(softcache, s, cwvideo);
          goto _L2
    }

    private static boolean useLocalMdpBookmark(CWVideo cwvideo, MovieDetails moviedetails)
    {
        return moviedetails.getPlayableBookmarkUpdateTime() != 0L && cwvideo.getBookmarkPosition() != moviedetails.getBookmarkPosition() && cwvideo.getBookmarkLastUpdateTime() < moviedetails.getPlayableBookmarkUpdateTime() + 0x15f90L;
    }

    private static boolean useLocalSdpBookmark(CWVideo cwvideo, ShowDetails showdetails)
    {
        if (showdetails.getBookmarkCreationTime() == 0L)
        {
            return false;
        }
        boolean flag;
        if (StringUtils.safeEquals(cwvideo.getCurrentEpisodeId(), showdetails.getCurrentEpisodeId()))
        {
            if (cwvideo.getBookmarkPosition() != showdetails.getBookmarkPosition() && cwvideo.getBookmarkLastUpdateTime() < showdetails.getBookmarkCreationTime() + 0x15f90L)
            {
                flag = true;
            } else
            {
                flag = false;
            }
        } else
        if (cwvideo.getCurrentSeasonNumber() == showdetails.getCurrentSeasonNumber())
        {
            if (showdetails.getCurrentEpisodeNumber() > cwvideo.getCurrentEpisodeNumber())
            {
                flag = true;
            } else
            {
                flag = false;
            }
        } else
        if (showdetails.getCurrentEpisodeNumber() < cwvideo.getCurrentEpisodeNumber())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Log.v("nf_bookmark", String.format("useLocalSdpBookmark: %s useLocal ? %b, cw-ep %s cw-sn %d, cw-en %d, sdp-ep %s sdp-sn %d, sdp-en %d", new Object[] {
            showdetails.getId(), Boolean.valueOf(flag), cwvideo.getCurrentEpisodeId(), Integer.valueOf(cwvideo.getCurrentSeasonNumber()), Integer.valueOf(cwvideo.getEpisodeNumber()), showdetails.getCurrentEpisodeId(), Integer.valueOf(showdetails.getCurrentSeasonNumber()), Integer.valueOf(showdetails.getCurrentEpisodeNumber())
        }));
        return flag;
    }

    protected List getPQLQueries()
    {
        return Arrays.asList(new String[] {
            pqlQuery, pqlQuery2, pqlQuery3, pqlQuery4
        });
    }

    protected void onFailure(int i)
    {
        if (responseCallback != null)
        {
            responseCallback.onCWVideosFetched(Collections.emptyList(), i);
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
            responseCallback.onCWVideosFetched(list, 0);
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
        if (!Log.isLoggable("nf_service_browse_fetchcwvideosrequest", 2));
        obj = FalcorParseUtils.getDataObj("nf_service_browse_fetchcwvideosrequest", s);
        if (FalcorParseUtils.isEmpty(((JsonObject) (obj))))
        {
            return new ArrayList();
        }
        if (!cwIdInCache) goto _L2; else goto _L1
_L1:
        obj = ((JsonObject) (obj)).getAsJsonObject("lists").getAsJsonObject(cwId);
        s = ((String) (obj));
_L4:
        return buildCWVideoList(s, fromVideo, toVideo, toSimilars, userConnectedToFacebook, hardCache, softCache, weakSeasonsCache);
_L2:
        if (!lolomoIdInCache)
        {
            break MISSING_BLOCK_LABEL_172;
        }
        obj = ((JsonObject) (obj)).getAsJsonObject("lolomos").getAsJsonObject(lolomoId).getAsJsonObject("continueWatching");
        String s1 = FalcorParseUtils.getIdFromPath("nf_service_browse_fetchcwvideosrequest", ((JsonObject) (obj)));
        BrowseAgent.putCWLoMoId(hardCache, s1);
        s = ((String) (obj));
        continue; /* Loop/switch isn't completed */
        try
        {
            JsonObject jsonobject = ((JsonObject) (obj)).getAsJsonObject("lolomo");
            obj = jsonobject.getAsJsonObject("continueWatching");
            String s2 = FalcorParseUtils.getIdFromPath("nf_service_browse_fetchcwvideosrequest", ((JsonObject) (obj)));
            BrowseAgent.putCWLoMoId(hardCache, s2);
            PrefetchHomeLoLoMoRequest.putLoLoMoIdInBrowseCache(hardCache, jsonobject);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            Log.v("nf_service_browse_fetchcwvideosrequest", (new StringBuilder()).append("String response to parse = ").append(s).toString());
            throw new FalcorParseException("response missing expected json objects", ((Throwable) (obj)));
        }
        s = ((String) (obj));
        if (true) goto _L4; else goto _L3
_L3:
    }
}
