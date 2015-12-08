// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.collections;

import com.soundcloud.android.events.EventQueue;
import com.soundcloud.android.likes.LoadLikedTrackUrnsCommand;
import com.soundcloud.android.likes.PlaylistLikesStorage;
import com.soundcloud.android.playlists.PlaylistItem;
import com.soundcloud.android.playlists.PlaylistPostStorage;
import com.soundcloud.android.properties.FeatureFlags;
import com.soundcloud.android.properties.Flag;
import com.soundcloud.android.rx.RxUtils;
import com.soundcloud.android.stations.StationsOperations;
import com.soundcloud.android.storage.provider.Content;
import com.soundcloud.android.sync.SyncContent;
import com.soundcloud.android.sync.SyncInitiator;
import com.soundcloud.android.sync.SyncStateStorage;
import com.soundcloud.rx.eventbus.EventBus;
import rx.R;
import rx.b;
import rx.b.f;
import rx.b.g;
import rx.b.h;
import rx.g.m;

// Referenced classes of package com.soundcloud.android.collections:
//            PlaylistsOptions, CollectionsOptionsStorage

public class CollectionsOperations
{

    private static g COMBINE_POSTED_AND_LIKED = new _cls4();
    public static final f IS_COLLECTION_CHANGE_FILTER = new _cls8();
    private static final f IS_COLLECTION_SYNC_EVENT = new _cls7();
    static final int PLAYLIST_LIMIT = 1000;
    private static final f REMOVE_DUPLICATE_PLAYLISTS = new _cls3();
    private static final f SORT_BY_CREATION = new _cls1();
    private static final f SORT_BY_TITLE = new _cls2();
    private static final h TO_MY_COLLECTIONS = new _cls5();
    private static final h TO_MY_COLLECTIONS_OR_ERROR = new _cls6();
    private final CollectionsOptionsStorage collectionsOptionsStorage;
    private final EventBus eventBus;
    private final FeatureFlags featureFlags;
    private final LoadLikedTrackUrnsCommand loadLikedTrackUrnsCommand;
    private final PlaylistLikesStorage playlistLikesStorage;
    private final PlaylistPostStorage playlistPostStorage;
    private final R scheduler;
    private final StationsOperations stationsOperations;
    private final SyncInitiator syncInitiator;
    private final SyncStateStorage syncStateStorage;

    CollectionsOperations(EventBus eventbus, R r, SyncStateStorage syncstatestorage, PlaylistPostStorage playlistpoststorage, PlaylistLikesStorage playlistlikesstorage, LoadLikedTrackUrnsCommand loadlikedtrackurnscommand, SyncInitiator syncinitiator, 
            StationsOperations stationsoperations, FeatureFlags featureflags, CollectionsOptionsStorage collectionsoptionsstorage)
    {
        eventBus = eventbus;
        scheduler = r;
        syncStateStorage = syncstatestorage;
        playlistPostStorage = playlistpoststorage;
        playlistLikesStorage = playlistlikesstorage;
        loadLikedTrackUrnsCommand = loadlikedtrackurnscommand;
        syncInitiator = syncinitiator;
        stationsOperations = stationsoperations;
        featureFlags = featureflags;
        collectionsOptionsStorage = collectionsoptionsstorage;
    }

    private b loadPlaylists(PlaylistsOptions playlistsoptions)
    {
        b b1 = unsortedPlaylists(playlistsoptions);
        if (playlistsoptions.sortByTitle())
        {
            playlistsoptions = SORT_BY_TITLE;
        } else
        {
            playlistsoptions = SORT_BY_CREATION;
        }
        return b1.map(playlistsoptions).map(REMOVE_DUPLICATE_PLAYLISTS).map(PlaylistItem.fromPropertySets()).subscribeOn(scheduler);
    }

    private b loadTracksLiked()
    {
        return loadLikedTrackUrnsCommand.toObservable().subscribeOn(scheduler);
    }

    private b myPlaylists(final PlaylistsOptions options)
    {
        return syncStateStorage.hasSyncedBefore(SyncContent.MyPlaylists.content.uri).flatMap(new _cls9()).subscribeOn(scheduler);
    }

    private b recentStations()
    {
        b b1;
        if (featureFlags.isEnabled(Flag.STATIONS_SOFT_LAUNCH))
        {
            b1 = stationsOperations.collection(0);
        } else
        {
            b1 = b.empty();
        }
        return b1.toList();
    }

    private b refreshAndLoadPlaylists(PlaylistsOptions playlistsoptions)
    {
        return syncInitiator.refreshMyPlaylists().flatMap(RxUtils.continueWith(loadPlaylists(playlistsoptions)));
    }

    private b refreshLikesAndLoadTracksLiked()
    {
        return syncInitiator.refreshLikes().flatMap(RxUtils.continueWith(loadTracksLiked()));
    }

    private b refreshRecentStationsAndLoad()
    {
        return stationsOperations.sync().flatMap(RxUtils.continueWith(recentStations()));
    }

    private b tracksLiked()
    {
        return syncStateStorage.hasSyncedBefore(SyncContent.MyLikes.content.uri).flatMap(new _cls10()).subscribeOn(scheduler);
    }

    private b unsortedPlaylists(PlaylistsOptions playlistsoptions)
    {
        b b1 = playlistLikesStorage.loadLikedPlaylists(1000, 0x7fffffffffffffffL);
        b b2 = playlistPostStorage.loadPostedPlaylists(1000, 0x7fffffffffffffffL);
        if (playlistsoptions.showLikes() && !playlistsoptions.showPosts())
        {
            return b1;
        }
        if (playlistsoptions.showPosts() && !playlistsoptions.showLikes())
        {
            return b2;
        } else
        {
            return b2.zipWith(b1, COMBINE_POSTED_AND_LIKED);
        }
    }

    public void clearData()
    {
        collectionsOptionsStorage.clear();
    }

    b collections(PlaylistsOptions playlistsoptions)
    {
        return b.zip(myPlaylists(playlistsoptions).materialize(), tracksLiked().materialize(), recentStations().materialize(), TO_MY_COLLECTIONS_OR_ERROR).dematerialize();
    }

    public b onCollectionChanged()
    {
        return eventBus.queue(EventQueue.ENTITY_STATE_CHANGED).filter(IS_COLLECTION_CHANGE_FILTER);
    }

    b onCollectionSynced()
    {
        return eventBus.queue(EventQueue.SYNC_RESULT).filter(IS_COLLECTION_SYNC_EVENT);
    }

    b updatedCollections(PlaylistsOptions playlistsoptions)
    {
        return b.zip(refreshAndLoadPlaylists(playlistsoptions), refreshLikesAndLoadTracksLiked(), refreshRecentStationsAndLoad(), TO_MY_COLLECTIONS);
    }






    private class _cls9
        implements f
    {

        final CollectionsOperations this$0;
        final PlaylistsOptions val$options;

        public volatile Object call(Object obj)
        {
            return call((Boolean)obj);
        }

        public b call(Boolean boolean1)
        {
            if (boolean1.booleanValue())
            {
                return loadPlaylists(options);
            } else
            {
                return refreshAndLoadPlaylists(options);
            }
        }

        _cls9()
        {
            this$0 = CollectionsOperations.this;
            options = playlistsoptions;
            super();
        }
    }


    private class _cls10
        implements f
    {

        final CollectionsOperations this$0;

        public volatile Object call(Object obj)
        {
            return call((Boolean)obj);
        }

        public b call(Boolean boolean1)
        {
            if (boolean1.booleanValue())
            {
                return loadTracksLiked();
            } else
            {
                return refreshLikesAndLoadTracksLiked();
            }
        }

        _cls10()
        {
            this$0 = CollectionsOperations.this;
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
            class _cls1
                implements Comparator
            {

                final _cls1 this$0;

                private Date getAssociationDate(PropertySet propertyset)
                {
                    if (propertyset.contains(LikeProperty.CREATED_AT))
                    {
                        return (Date)propertyset.get(LikeProperty.CREATED_AT);
                    } else
                    {
                        return (Date)propertyset.get(PostProperty.CREATED_AT);
                    }
                }

                public int compare(PropertySet propertyset, PropertySet propertyset1)
                {
                    return getAssociationDate(propertyset1).compareTo(getAssociationDate(propertyset));
                }

                public volatile int compare(Object obj, Object obj1)
                {
                    return compare((PropertySet)obj, (PropertySet)obj1);
                }

                _cls1()
                {
                    this$0 = _cls1.this;
                    super();
                }
            }

            Collections.sort(list, new _cls1());
            return list;
        }

        _cls1()
        {
        }
    }


    private class _cls2
        implements f
    {

        public final volatile Object call(Object obj)
        {
            return call((List)obj);
        }

        public final List call(List list)
        {
            class _cls1
                implements Comparator
            {

                final _cls2 this$0;

                public int compare(PropertySet propertyset, PropertySet propertyset1)
                {
                    return ((String)propertyset.get(PlaylistProperty.TITLE)).compareTo((String)propertyset1.get(PlaylistProperty.TITLE));
                }

                public volatile int compare(Object obj, Object obj1)
                {
                    return compare((PropertySet)obj, (PropertySet)obj1);
                }

                _cls1()
                {
                    this$0 = _cls2.this;
                    super();
                }
            }

            Collections.sort(list, new _cls1());
            return list;
        }

        _cls2()
        {
        }
    }


    private class _cls3
        implements f
    {

        public final volatile Object call(Object obj)
        {
            return call((List)obj);
        }

        public final List call(List list)
        {
            java.util.HashSet hashset = Sets.newHashSetWithExpectedSize(list.size());
            for (Iterator iterator = list.iterator(); iterator.hasNext();)
            {
                Urn urn = (Urn)((PropertySet)iterator.next()).get(PlaylistProperty.URN);
                if (hashset.contains(urn))
                {
                    iterator.remove();
                } else
                {
                    hashset.add(urn);
                }
            }

            return list;
        }

        _cls3()
        {
        }
    }


    private class _cls4
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

        _cls4()
        {
        }
    }


    private class _cls5
        implements h
    {

        public final MyCollections call(List list, List list1, List list2)
        {
            return new MyCollections(list1, list, Lists.transform(list2, StationRecord.TO_URN), false);
        }

        public final volatile Object call(Object obj, Object obj1, Object obj2)
        {
            return call((List)obj, (List)obj1, (List)obj2);
        }

        _cls5()
        {
        }
    }


    private class _cls6
        implements h
    {

        public final volatile Object call(Object obj, Object obj1, Object obj2)
        {
            return call((a)obj, (a)obj1, (a)obj2);
        }

        public final a call(a a1, a a2, a a3)
        {
            if (a1.c() && a2.c() && a3.c())
            {
                return a.a();
            }
            List list;
            List list1;
            List list2;
            boolean flag;
            if (a2.b())
            {
                list = Collections.emptyList();
            } else
            {
                list = (List)a2.c;
            }
            if (a1.b())
            {
                list1 = Collections.emptyList();
            } else
            {
                list1 = (List)a1.c;
            }
            if (a3.b())
            {
                list2 = Collections.emptyList();
            } else
            {
                list2 = (List)a3.c;
            }
            list2 = Lists.transform(list2, StationRecord.TO_URN);
            if (a2.b() || a1.b() || a3.b())
            {
                flag = true;
            } else
            {
                flag = false;
            }
            return a.a(new MyCollections(list, list1, list2, flag));
        }

        _cls6()
        {
        }
    }


    private class _cls7
        implements f
    {

        public final Boolean call(SyncResult syncresult)
        {
            String s;
            byte byte0;
            s = syncresult.getAction();
            byte0 = -1;
            s.hashCode();
            JVM INSTR lookupswitch 2: default 36
        //                       1119517830: 79
        //                       1968822650: 65;
               goto _L1 _L2 _L3
_L1:
            break; /* Loop/switch isn't completed */
_L2:
            break MISSING_BLOCK_LABEL_79;
_L4:
            switch (byte0)
            {
            default:
                return Boolean.valueOf(false);

            case 0: // '\0'
            case 1: // '\001'
                return Boolean.valueOf(syncresult.wasChanged());
            }
_L3:
            if (s.equals("syncStations"))
            {
                byte0 = 0;
            }
              goto _L4
            if (s.equals("syncPlaylists"))
            {
                byte0 = 1;
            }
              goto _L4
        }

        public final volatile Object call(Object obj)
        {
            return call((SyncResult)obj);
        }

        _cls7()
        {
        }
    }


    private class _cls8
        implements f
    {

        public final Boolean call(EntityStateChangedEvent entitystatechangedevent)
        {
            switch (entitystatechangedevent.getKind())
            {
            default:
                return Boolean.valueOf(false);

            case 2: // '\002'
            case 8: // '\b'
                return Boolean.valueOf(true);
            }
        }

        public final volatile Object call(Object obj)
        {
            return call((EntityStateChangedEvent)obj);
        }

        _cls8()
        {
        }
    }

}
