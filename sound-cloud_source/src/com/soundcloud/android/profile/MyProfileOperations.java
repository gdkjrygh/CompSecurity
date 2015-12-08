// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.profile;

import com.soundcloud.android.playlists.PlaylistPostStorage;
import com.soundcloud.android.rx.OperatorSwitchOnEmptyList;
import com.soundcloud.android.sync.SyncInitiator;
import com.soundcloud.android.sync.SyncStateStorage;
import com.soundcloud.android.users.UserAssociationStorage;
import com.soundcloud.android.utils.NetworkConnectionHelper;
import rx.R;
import rx.b;
import rx.b.f;

// Referenced classes of package com.soundcloud.android.profile:
//            LikesStorage, PostsStorage

public class MyProfileOperations
{

    static final int PAGE_SIZE = 30;
    private final LikesStorage likesStorage;
    private final f loadInitialFollowings = new _cls1();
    private final f loadInitialLikes = new _cls4();
    private final f loadInitialPlaylistPosts = new _cls3();
    private final f loadInitialPosts = new _cls2();
    private final NetworkConnectionHelper networkConnectionHelper;
    private final PlaylistPostStorage playlistPostStorage;
    private final PostsStorage postsStorage;
    private final R scheduler;
    private final SyncInitiator syncInitiator;
    private final rx.b.b syncPlaylistMetadata = new _cls5();
    private final SyncStateStorage syncStateStorage;
    private final UserAssociationStorage userAssociationStorage;

    public MyProfileOperations(LikesStorage likesstorage, PostsStorage postsstorage, PlaylistPostStorage playlistpoststorage, SyncStateStorage syncstatestorage, SyncInitiator syncinitiator, NetworkConnectionHelper networkconnectionhelper, UserAssociationStorage userassociationstorage, 
            R r)
    {
        likesStorage = likesstorage;
        postsStorage = postsstorage;
        playlistPostStorage = playlistpoststorage;
        syncStateStorage = syncstatestorage;
        syncInitiator = syncinitiator;
        networkConnectionHelper = networkconnectionhelper;
        userAssociationStorage = userassociationstorage;
        scheduler = r;
    }

    private b initialPlaylistPage()
    {
        return playlistPostStorage.loadPostedPlaylists(30, 0x7fffffffffffffffL).doOnNext(syncPlaylistMetadata).subscribeOn(scheduler);
    }

    private b likedItems(long l)
    {
        return likesStorage.loadLikes(30, l).subscribeOn(scheduler).lift(new OperatorSwitchOnEmptyList(updatedLikes()));
    }

    private f loadFollowings(final int pageSize, final long fromPosition)
    {
        return new _cls8();
    }

    private b pagedFollowingsFromPosition(long l)
    {
        return userAssociationStorage.loadFollowingsUrns(30, l).flatMap(syncAndReloadFollowings(30, l));
    }

    private b postedItems(final long beforeTime)
    {
        return syncStateStorage.hasSyncedMyPostsBefore().flatMap(new _cls11()).subscribeOn(scheduler);
    }

    private f syncAndReloadFollowings(final int pageSize, final long fromPosition)
    {
        return new _cls7();
    }

    com.soundcloud.rx.Pager.PagingFunction followingsPagingFunction()
    {
        return new _cls6();
    }

    b likesForPlayback()
    {
        return likesStorage.loadLikesForPlayback().subscribeOn(scheduler);
    }

    com.soundcloud.rx.Pager.PagingFunction likesPagingFunction()
    {
        return new _cls9();
    }

    b pagedFollowings()
    {
        return pagedFollowingsFromPosition(-1L).subscribeOn(scheduler).lift(new OperatorSwitchOnEmptyList(updatedFollowings()));
    }

    b pagedLikes()
    {
        return likedItems(0x7fffffffffffffffL);
    }

    b pagedPlaylistItems()
    {
        return initialPlaylistPage().lift(new OperatorSwitchOnEmptyList(updatedPlaylists()));
    }

    b pagedPostItems()
    {
        return postedItems(0x7fffffffffffffffL);
    }

    com.soundcloud.rx.Pager.PagingFunction playlistPagingFunction()
    {
        return new _cls12();
    }

    b postsForPlayback()
    {
        return postsStorage.loadPostsForPlayback().subscribeOn(scheduler);
    }

    com.soundcloud.rx.Pager.PagingFunction postsPagingFunction()
    {
        return new _cls10();
    }

    b updatedFollowings()
    {
        return syncInitiator.refreshFollowings().flatMap(loadInitialFollowings);
    }

    b updatedLikes()
    {
        return syncInitiator.refreshLikes().flatMap(loadInitialLikes);
    }

    b updatedPlaylists()
    {
        return syncInitiator.refreshMyPlaylists().flatMap(loadInitialPlaylistPosts);
    }

    b updatedPosts()
    {
        return syncInitiator.refreshPosts().flatMap(loadInitialPosts);
    }














    private class _cls1
        implements f
    {

        final MyProfileOperations this$0;

        public volatile Object call(Object obj)
        {
            return call((Boolean)obj);
        }

        public b call(Boolean boolean1)
        {
            return pagedFollowingsFromPosition(-1L).subscribeOn(scheduler);
        }

        _cls1()
        {
            this$0 = MyProfileOperations.this;
            super();
        }
    }


    private class _cls2
        implements f
    {

        final MyProfileOperations this$0;

        public volatile Object call(Object obj)
        {
            return call((Boolean)obj);
        }

        public b call(Boolean boolean1)
        {
            return postsStorage.loadPosts(30, 0x7fffffffffffffffL).subscribeOn(scheduler);
        }

        _cls2()
        {
            this$0 = MyProfileOperations.this;
            super();
        }
    }


    private class _cls3
        implements f
    {

        final MyProfileOperations this$0;

        public volatile Object call(Object obj)
        {
            return call((Boolean)obj);
        }

        public b call(Boolean boolean1)
        {
            return initialPlaylistPage();
        }

        _cls3()
        {
            this$0 = MyProfileOperations.this;
            super();
        }
    }


    private class _cls4
        implements f
    {

        final MyProfileOperations this$0;

        public volatile Object call(Object obj)
        {
            return call((Boolean)obj);
        }

        public b call(Boolean boolean1)
        {
            return likesStorage.loadLikes(30, 0x7fffffffffffffffL).subscribeOn(scheduler);
        }

        _cls4()
        {
            this$0 = MyProfileOperations.this;
            super();
        }
    }


    private class _cls5
        implements rx.b.b
    {

        final MyProfileOperations this$0;

        public volatile void call(Object obj)
        {
            call((List)obj);
        }

        public void call(List list)
        {
            if (networkConnectionHelper.isWifiConnected() && !list.isEmpty())
            {
                syncInitiator.requestPlaylistSync(list);
            }
        }

        _cls5()
        {
            this$0 = MyProfileOperations.this;
            super();
        }
    }


    private class _cls8
        implements f
    {

        final MyProfileOperations this$0;
        final long val$fromPosition;
        final int val$pageSize;

        public volatile Object call(Object obj)
        {
            return call((SyncResult)obj);
        }

        public b call(SyncResult syncresult)
        {
            return userAssociationStorage.loadFollowings(pageSize, fromPosition).subscribeOn(scheduler);
        }

        _cls8()
        {
            this$0 = MyProfileOperations.this;
            pageSize = i;
            fromPosition = l;
            super();
        }
    }


    private class _cls11
        implements f
    {

        final MyProfileOperations this$0;
        final long val$beforeTime;

        public volatile Object call(Object obj)
        {
            return call((Boolean)obj);
        }

        public b call(Boolean boolean1)
        {
            if (boolean1.booleanValue())
            {
                return postsStorage.loadPosts(30, beforeTime);
            } else
            {
                return updatedPosts();
            }
        }

        _cls11()
        {
            this$0 = MyProfileOperations.this;
            beforeTime = l;
            super();
        }
    }


    private class _cls7
        implements f
    {

        final MyProfileOperations this$0;
        final long val$fromPosition;
        final int val$pageSize;

        public volatile Object call(Object obj)
        {
            return call((List)obj);
        }

        public b call(List list)
        {
            if (list.isEmpty())
            {
                return b.just(Collections.emptyList());
            } else
            {
                return syncInitiator.syncUsers(list).flatMap(loadFollowings(pageSize, fromPosition));
            }
        }

        _cls7()
        {
            this$0 = MyProfileOperations.this;
            pageSize = i;
            fromPosition = l;
            super();
        }
    }


    private class _cls6
        implements com.soundcloud.rx.Pager.PagingFunction
    {

        final MyProfileOperations this$0;

        public volatile Object call(Object obj)
        {
            return call((List)obj);
        }

        public b call(List list)
        {
            if (list.size() < 30)
            {
                return Pager.finish();
            } else
            {
                return pagedFollowingsFromPosition(((Long)((PropertySet)Iterables.getLast(list)).get(UserAssociationProperty.POSITION)).longValue()).subscribeOn(scheduler);
            }
        }

        _cls6()
        {
            this$0 = MyProfileOperations.this;
            super();
        }
    }


    private class _cls9
        implements com.soundcloud.rx.Pager.PagingFunction
    {

        final MyProfileOperations this$0;

        public volatile Object call(Object obj)
        {
            return call((List)obj);
        }

        public b call(List list)
        {
            if (list.size() < 30)
            {
                return Pager.finish();
            } else
            {
                return likedItems(((Date)((PropertySet)Iterables.getLast(list)).get(LikeProperty.CREATED_AT)).getTime());
            }
        }

        _cls9()
        {
            this$0 = MyProfileOperations.this;
            super();
        }
    }


    private class _cls12
        implements com.soundcloud.rx.Pager.PagingFunction
    {

        final MyProfileOperations this$0;

        public volatile Object call(Object obj)
        {
            return call((List)obj);
        }

        public b call(List list)
        {
            if (list.size() < 30)
            {
                return Pager.finish();
            } else
            {
                list = (Date)((PropertySet)Iterables.getLast(list)).get(PostProperty.CREATED_AT);
                return playlistPostStorage.loadPostedPlaylists(30, list.getTime()).doOnNext(syncPlaylistMetadata).subscribeOn(scheduler);
            }
        }

        _cls12()
        {
            this$0 = MyProfileOperations.this;
            super();
        }
    }


    private class _cls10
        implements com.soundcloud.rx.Pager.PagingFunction
    {

        final MyProfileOperations this$0;

        public volatile Object call(Object obj)
        {
            return call((List)obj);
        }

        public b call(List list)
        {
            if (list.size() < 30)
            {
                return Pager.finish();
            } else
            {
                return postedItems(((Date)((PropertySet)Iterables.getLast(list)).get(PostProperty.CREATED_AT)).getTime());
            }
        }

        _cls10()
        {
            this$0 = MyProfileOperations.this;
            super();
        }
    }

}
