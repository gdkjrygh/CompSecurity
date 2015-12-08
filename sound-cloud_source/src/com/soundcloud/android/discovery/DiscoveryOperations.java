// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.discovery;

import com.soundcloud.android.search.PlaylistDiscoveryOperations;
import com.soundcloud.android.sync.recommendations.StoreRecommendationsCommand;
import com.soundcloud.android.tracks.TrackItem;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import rx.R;
import rx.b;
import rx.b.f;
import rx.b.g;

// Referenced classes of package com.soundcloud.android.discovery:
//            DiscoverySyncer, RecommendationsStorage, SearchItem, RecommendationItem

public class DiscoveryOperations
{

    private static final b ON_ERROR_EMPTY_ITEM_LIST = b.just(Collections.emptyList());
    private static final g TAGS_TO_DISCOVERY_ITEM_LIST = new _cls3();
    private static final g TO_DISCOVERY_ITEMS_LIST = new _cls2();
    private static final f TO_RECOMMENDATIONS = new _cls1();
    private final DiscoverySyncer discoverySyncer;
    private final PlaylistDiscoveryOperations playlistDiscoveryOperations;
    private final RecommendationsStorage recommendationsStorage;
    private final R scheduler;
    private final StoreRecommendationsCommand storeRecommendationsCommand;
    private final f toRecommendations = new _cls4();

    DiscoveryOperations(DiscoverySyncer discoverysyncer, RecommendationsStorage recommendationsstorage, StoreRecommendationsCommand storerecommendationscommand, PlaylistDiscoveryOperations playlistdiscoveryoperations, R r)
    {
        discoverySyncer = discoverysyncer;
        recommendationsStorage = recommendationsstorage;
        storeRecommendationsCommand = storerecommendationscommand;
        playlistDiscoveryOperations = playlistdiscoveryoperations;
        scheduler = r;
    }

    private b playlistDiscovery()
    {
        return playlistDiscoveryOperations.popularPlaylistTags().zipWith(playlistDiscoveryOperations.recentPlaylistTags(), TAGS_TO_DISCOVERY_ITEM_LIST).onErrorResumeNext(ON_ERROR_EMPTY_ITEM_LIST);
    }

    private b recommendations()
    {
        return discoverySyncer.syncRecommendations().flatMap(toRecommendations).onErrorResumeNext(recommendationsFromStorage());
    }

    private b recommendationsFromStorage()
    {
        return recommendationsStorage.seedTracks().map(TO_RECOMMENDATIONS).onErrorResumeNext(ON_ERROR_EMPTY_ITEM_LIST).subscribeOn(scheduler);
    }

    private b searchItem()
    {
        ArrayList arraylist = new ArrayList(1);
        arraylist.add(new SearchItem());
        return b.just(arraylist);
    }

    private static g toPlaylist(final RecommendationItem recommendationItem)
    {
        return new _cls5();
    }

    public void clearData()
    {
        storeRecommendationsCommand.clearTables();
        discoverySyncer.clearLastSyncTime();
        playlistDiscoveryOperations.clearData();
    }

    b discoveryItems()
    {
        return searchItem().concatWith(playlistDiscovery()).subscribeOn(scheduler);
    }

    b discoveryItemsAndRecommendations()
    {
        return searchItem().concatWith(recommendations().zipWith(playlistDiscovery(), TO_DISCOVERY_ITEMS_LIST)).subscribeOn(scheduler);
    }

    b recommendedTracks()
    {
        return recommendationsStorage.recommendedTracks().subscribeOn(scheduler);
    }

    b recommendedTracksForSeed(long l)
    {
        return recommendationsStorage.recommendedTracksForSeed(l).map(TrackItem.fromPropertySets()).subscribeOn(scheduler);
    }

    b recommendedTracksWithSeed(RecommendationItem recommendationitem)
    {
        return recommendationsStorage.recommendedTracksBeforeSeed(recommendationitem.getSeedTrackLocalId()).zipWith(recommendationsStorage.recommendedTracksAfterSeed(recommendationitem.getSeedTrackLocalId()), toPlaylist(recommendationitem)).subscribeOn(scheduler);
    }



    private class _cls4
        implements f
    {

        final DiscoveryOperations this$0;

        public volatile Object call(Object obj)
        {
            return call((Boolean)obj);
        }

        public b call(Boolean boolean1)
        {
            return recommendationsFromStorage();
        }

        _cls4()
        {
            this$0 = DiscoveryOperations.this;
            super();
        }
    }


    private class _cls5
        implements g
    {

        final RecommendationItem val$recommendationItem;

        public final volatile Object call(Object obj, Object obj1)
        {
            return call((List)obj, (List)obj1);
        }

        public final List call(List list, List list1)
        {
            ArrayList arraylist = new ArrayList(list.size() + list1.size() + 1);
            arraylist.addAll(list);
            arraylist.add(recommendationItem.getSeedTrackUrn());
            arraylist.addAll(list1);
            return arraylist;
        }

        _cls5()
        {
            recommendationItem = recommendationitem;
            super();
        }
    }


    private class _cls1
        implements f
    {

        public final volatile Object call(Object obj)
        {
            return call((List)obj);
        }

        public final List call(List list)
        {
            ArrayList arraylist = new ArrayList(list.size());
            for (list = list.iterator(); list.hasNext(); arraylist.add(new RecommendationItem((PropertySet)list.next()))) { }
            return arraylist;
        }

        _cls1()
        {
        }
    }


    private class _cls2
        implements g
    {

        public final volatile Object call(Object obj, Object obj1)
        {
            return call((List)obj, (List)obj1);
        }

        public final List call(List list, List list1)
        {
            ArrayList arraylist = new ArrayList(list.size() + list1.size());
            arraylist.addAll(list);
            arraylist.addAll(list1);
            return arraylist;
        }

        _cls2()
        {
        }
    }


    private class _cls3
        implements g
    {

        public final volatile Object call(Object obj, Object obj1)
        {
            return call((List)obj, (List)obj1);
        }

        public final List call(List list, List list1)
        {
            return Collections.singletonList(new PlaylistDiscoveryItem(list, list1));
        }

        _cls3()
        {
        }
    }

}
