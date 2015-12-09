// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.browse.volley;

import android.content.Context;
import com.google.gson.JsonObject;
import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.service.browse.BrowseAgentCallback;
import com.netflix.mediaclient.service.webclient.model.KidsCharacterDetails;
import com.netflix.mediaclient.service.webclient.model.leafs.TrackableListSummary;
import com.netflix.mediaclient.service.webclient.volley.FalcorParseException;
import com.netflix.mediaclient.service.webclient.volley.FalcorParseUtils;
import com.netflix.mediaclient.service.webclient.volley.FalcorServerException;
import com.netflix.mediaclient.service.webclient.volley.FalcorVolleyWebClientRequest;
import com.netflix.mediaclient.servicemgr.VideoType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FetchKidsCharacterDetailsRequest extends FalcorVolleyWebClientRequest
{

    private static final Boolean DATA_CHANGED = Boolean.valueOf(true);
    private static final String FIELD_CHARACTER = "characters";
    private static final String TAG = "nf_kidscharacter";
    private final int MAX_GALLERY_VIDEOS = 100;
    private final String mCharacterId;
    private final String pqlQuery1;
    private final String pqlQuery2;
    private final String pqlQuery3;
    private final String pqlQuery4;
    private final BrowseAgentCallback responseCallback;

    protected FetchKidsCharacterDetailsRequest(Context context, com.netflix.mediaclient.service.ServiceAgent.ConfigurationAgentInterface configurationagentinterface, String s, BrowseAgentCallback browseagentcallback)
    {
        super(context, configurationagentinterface);
        mCharacterId = s;
        responseCallback = browseagentcallback;
        pqlQuery1 = String.format("['characters', '%s', ['summary','detail']]", new Object[] {
            mCharacterId
        });
        pqlQuery2 = String.format("['characters', '%s', 'watchNext', ['summary', 'detail', 'bookmark']]", new Object[] {
            mCharacterId
        });
        pqlQuery3 = String.format("['characters', '%s', 'gallery','summary']", new Object[] {
            mCharacterId
        });
        pqlQuery4 = String.format("['characters', '%s', 'gallery', ['shows', 'movies'], {'to':%d}, 'summary']", new Object[] {
            mCharacterId, Integer.valueOf(100)
        });
        if (Log.isLoggable("nf_kidscharacter", 2))
        {
            Log.v("nf_kidscharacter", (new StringBuilder()).append("PQL = ").append(pqlQuery1).append(" ").append(pqlQuery2).append(" ").append(pqlQuery3).append(" ").append(pqlQuery4).toString());
        }
    }

    private void collectGalleryVideos(List list, List list1, List list2)
    {
        list2.addAll(list1);
        list2.addAll(list);
    }

    private void insertVideoInGallery(com.netflix.mediaclient.service.webclient.model.branches.Video.Summary summary, List list)
    {
        int i = 0;
        do
        {
label0:
            {
                if (i < list.size())
                {
                    com.netflix.mediaclient.service.webclient.model.branches.Video.Summary summary1 = (com.netflix.mediaclient.service.webclient.model.branches.Video.Summary)list.get(i);
                    if (summary.videoYear < summary1.videoYear)
                    {
                        break label0;
                    }
                }
                if (i < list.size())
                {
                    list.add(i, summary);
                    return;
                } else
                {
                    list.add(summary);
                    return;
                }
            }
            i++;
        } while (true);
    }

    protected static void insertWatchNext(JsonObject jsonobject, KidsCharacterDetails kidscharacterdetails)
        throws FalcorParseException, FalcorServerException
    {
        if (jsonobject.has("watchNext"))
        {
            jsonobject = jsonobject.getAsJsonObject("watchNext");
            VideoType videotype = FalcorParseUtils.getTypeFromPath("nf_kidscharacter", jsonobject);
            if (VideoType.EPISODE.equals(videotype))
            {
                kidscharacterdetails.watchNextSummary = (com.netflix.mediaclient.service.webclient.model.branches.Video.Summary)FalcorParseUtils.getPropertyObject(jsonobject, "summary", com/netflix/mediaclient/service/webclient/model/branches/Video$Summary);
                kidscharacterdetails.watchNextEpisodeDetail = (com.netflix.mediaclient.service.webclient.model.branches.Episode.Detail)FalcorParseUtils.getPropertyObject(jsonobject, "detail", com/netflix/mediaclient/service/webclient/model/branches/Episode$Detail);
                kidscharacterdetails.watchNextBookmark = (com.netflix.mediaclient.service.webclient.model.branches.Video.Bookmark)FalcorParseUtils.getPropertyObject(jsonobject, "bookmark", com/netflix/mediaclient/service/webclient/model/branches/Video$Bookmark);
                kidscharacterdetails.watchNextMovieDetail = null;
            }
            if (VideoType.MOVIE.equals(videotype))
            {
                kidscharacterdetails.watchNextSummary = (com.netflix.mediaclient.service.webclient.model.branches.Video.Summary)FalcorParseUtils.getPropertyObject(jsonobject, "summary", com/netflix/mediaclient/service/webclient/model/branches/Video$Summary);
                kidscharacterdetails.watchNextMovieDetail = (com.netflix.mediaclient.service.webclient.model.branches.Video.Detail)FalcorParseUtils.getPropertyObject(jsonobject, "detail", com/netflix/mediaclient/service/webclient/model/branches/Video$Detail);
                kidscharacterdetails.watchNextBookmark = (com.netflix.mediaclient.service.webclient.model.branches.Video.Bookmark)FalcorParseUtils.getPropertyObject(jsonobject, "bookmark", com/netflix/mediaclient/service/webclient/model/branches/Video$Bookmark);
                kidscharacterdetails.watchNextEpisodeDetail = null;
            }
        }
    }

    private void parseGalleryVideos(JsonObject jsonobject, List list)
    {
        if (jsonobject != null)
        {
            int i = 0;
            while (i <= 100) 
            {
                String s = Integer.toString(i);
                if (jsonobject.has(s))
                {
                    insertVideoInGallery((com.netflix.mediaclient.service.webclient.model.branches.Video.Summary)FalcorParseUtils.getPropertyObject(jsonobject.getAsJsonObject(s), "summary", com/netflix/mediaclient/service/webclient/model/branches/Video$Summary), list);
                }
                i++;
            }
        }
    }

    protected List getPQLQueries()
    {
        return Arrays.asList(new String[] {
            pqlQuery1, pqlQuery2, pqlQuery3, pqlQuery4
        });
    }

    protected void onFailure(int i)
    {
        if (responseCallback != null)
        {
            responseCallback.onKidsCharacterDetailsFetched(null, DATA_CHANGED, i);
        }
    }

    protected void onSuccess(com.netflix.mediaclient.servicemgr.KidsCharacterDetails kidscharacterdetails)
    {
        if (responseCallback != null)
        {
            responseCallback.onKidsCharacterDetailsFetched(kidscharacterdetails, DATA_CHANGED, 0);
        }
    }

    protected volatile void onSuccess(Object obj)
    {
        onSuccess((com.netflix.mediaclient.servicemgr.KidsCharacterDetails)obj);
    }

    protected com.netflix.mediaclient.servicemgr.KidsCharacterDetails parseFalcorResponse(String s)
        throws FalcorParseException, FalcorServerException
    {
        KidsCharacterDetails kidscharacterdetails = new KidsCharacterDetails();
        ArrayList arraylist = new ArrayList();
        ArrayList arraylist1 = new ArrayList();
        ArrayList arraylist2 = new ArrayList();
        JsonObject jsonobject = FalcorParseUtils.getDataObj("nf_kidscharacter", s);
        if (FalcorParseUtils.isEmpty(jsonobject))
        {
            throw new FalcorParseException("KidsCharacterDetails empty!!!");
        }
        try
        {
            jsonobject = jsonobject.getAsJsonObject("characters").getAsJsonObject(mCharacterId);
        }
        catch (Exception exception)
        {
            Log.v("nf_kidscharacter", (new StringBuilder()).append("String response to parse = ").append(s).toString());
            throw new FalcorParseException("response missing expected json objects", exception);
        }
        kidscharacterdetails.kidsSummary = (com.netflix.mediaclient.service.webclient.model.branches.KidsCharacter.KidsSummary)FalcorParseUtils.getPropertyObject(jsonobject, "summary", com/netflix/mediaclient/service/webclient/model/branches/KidsCharacter$KidsSummary);
        kidscharacterdetails.kidsDetail = (com.netflix.mediaclient.service.webclient.model.branches.KidsCharacter.KidsDetail)FalcorParseUtils.getPropertyObject(jsonobject, "detail", com/netflix/mediaclient/service/webclient/model/branches/KidsCharacter$KidsDetail);
        insertWatchNext(jsonobject, kidscharacterdetails);
        if (jsonobject.has("gallery"))
        {
            s = jsonobject.getAsJsonObject("gallery");
            if (s.has("shows"))
            {
                parseGalleryVideos(s.getAsJsonObject("shows"), arraylist2);
            }
            if (s.has("movies"))
            {
                parseGalleryVideos(s.getAsJsonObject("movies"), arraylist1);
            }
            collectGalleryVideos(arraylist1, arraylist2, arraylist);
            kidscharacterdetails.galleryListSummary = (TrackableListSummary)FalcorParseUtils.getPropertyObject(s, "summary", com/netflix/mediaclient/service/webclient/model/leafs/TrackableListSummary);
        }
        kidscharacterdetails.galleryVideos = arraylist;
        return kidscharacterdetails;
    }

    protected volatile Object parseFalcorResponse(String s)
        throws FalcorParseException, FalcorServerException
    {
        return parseFalcorResponse(s);
    }

}
