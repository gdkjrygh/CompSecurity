// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.explore;

import com.soundcloud.android.api.ApiClientRx;
import com.soundcloud.android.api.ApiEndpoints;
import com.soundcloud.android.api.ApiRequest;
import com.soundcloud.android.commands.StoreTracksCommand;
import rx.R;
import rx.a.a;
import rx.b;

// Referenced classes of package com.soundcloud.android.explore:
//            SuggestedTracksCollection, ExploreGenresSections, ExploreGenre

class ExploreTracksOperations
{

    private final ApiClientRx apiClientRx;
    private final a pager = new _cls1();
    private final R scheduler;
    private final StoreTracksCommand storeTracksCommand;

    ExploreTracksOperations(StoreTracksCommand storetrackscommand, ApiClientRx apiclientrx, R r)
    {
        storeTracksCommand = storetrackscommand;
        apiClientRx = apiclientrx;
        scheduler = r;
    }

    private b getSuggestedTracks(String s)
    {
        s = ApiRequest.get(s).addQueryParam(com.soundcloud.android.api.ApiRequest.Param.PAGE_SIZE, new Object[] {
            "20"
        }).forPrivateApi(1).build();
        return apiClientRx.mappedResponse(s, com/soundcloud/android/explore/SuggestedTracksCollection).doOnNext(storeTracksCommand.toAction()).subscribeOn(scheduler);
    }

    b getCategories()
    {
        ApiRequest apirequest = ApiRequest.get(ApiEndpoints.EXPLORE_TRACKS_CATEGORIES.path()).forPrivateApi(1).build();
        return apiClientRx.mappedResponse(apirequest, com/soundcloud/android/explore/ExploreGenresSections).subscribeOn(scheduler);
    }

    b getSuggestedTracks(ExploreGenre exploregenre)
    {
        if (exploregenre == ExploreGenre.POPULAR_MUSIC_CATEGORY)
        {
            return getSuggestedTracks(ApiEndpoints.EXPLORE_TRACKS_POPULAR_MUSIC.path());
        }
        if (exploregenre == ExploreGenre.POPULAR_AUDIO_CATEGORY)
        {
            return getSuggestedTracks(ApiEndpoints.EXPLORE_TRACKS_POPULAR_AUDIO.path());
        } else
        {
            return getSuggestedTracks(exploregenre.getSuggestedTracksPath());
        }
    }

    a pager()
    {
        return pager;
    }


    private class _cls1 extends a
    {

        final ExploreTracksOperations this$0;

        public volatile Object call(Object obj)
        {
            return call((SuggestedTracksCollection)obj);
        }

        public b call(SuggestedTracksCollection suggestedtrackscollection)
        {
            suggestedtrackscollection = suggestedtrackscollection.getNextLink();
            if (suggestedtrackscollection.isPresent())
            {
                return getSuggestedTracks(((Link)suggestedtrackscollection.get()).getHref());
            } else
            {
                return a.finish();
            }
        }

        _cls1()
        {
            this$0 = ExploreTracksOperations.this;
            super();
        }
    }

}
