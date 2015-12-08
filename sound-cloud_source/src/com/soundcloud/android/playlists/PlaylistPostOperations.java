// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.playlists;

import com.soundcloud.android.rx.OperatorSwitchOnEmptyList;
import com.soundcloud.android.sync.SyncInitiator;
import com.soundcloud.android.utils.NetworkConnectionHelper;
import rx.R;
import rx.b;
import rx.b.f;

// Referenced classes of package com.soundcloud.android.playlists:
//            PlaylistPostStorage

class PlaylistPostOperations
{

    static final int PAGE_SIZE = 30;
    private final f loadInitialPlaylistPosts = new _cls3();
    private final NetworkConnectionHelper networkConnectionHelper;
    private final PlaylistPostStorage playlistPostStorage;
    private final com.soundcloud.rx.Pager.PagingFunction postedPlaylistsPager = new _cls1();
    private final rx.b.b requestPlaylistsSyncAction = new _cls2();
    private final R scheduler;
    private final SyncInitiator syncInitiator;

    PlaylistPostOperations(PlaylistPostStorage playlistpoststorage, SyncInitiator syncinitiator, R r, NetworkConnectionHelper networkconnectionhelper)
    {
        playlistPostStorage = playlistpoststorage;
        syncInitiator = syncinitiator;
        scheduler = r;
        networkConnectionHelper = networkconnectionhelper;
    }

    private b postedPlaylists(long l)
    {
        return playlistPostStorage.loadPostedPlaylists(30, l).doOnNext(requestPlaylistsSyncAction).subscribeOn(scheduler).lift(new OperatorSwitchOnEmptyList(updatedPostedPlaylists()));
    }

    com.soundcloud.rx.Pager.PagingFunction pagingFunction()
    {
        return postedPlaylistsPager;
    }

    b postedPlaylists()
    {
        return postedPlaylists(0x7fffffffffffffffL);
    }

    b updatedPostedPlaylists()
    {
        return syncInitiator.refreshMyPlaylists().flatMap(loadInitialPlaylistPosts);
    }







    private class _cls1
        implements com.soundcloud.rx.Pager.PagingFunction
    {

        final PlaylistPostOperations this$0;

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
                return postedPlaylists(((Date)((PropertySet)Iterables.getLast(list)).get(PostProperty.CREATED_AT)).getTime());
            }
        }

        _cls1()
        {
            this$0 = PlaylistPostOperations.this;
            super();
        }
    }


    private class _cls2
        implements rx.b.b
    {

        final PlaylistPostOperations this$0;

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

        _cls2()
        {
            this$0 = PlaylistPostOperations.this;
            super();
        }
    }


    private class _cls3
        implements f
    {

        final PlaylistPostOperations this$0;

        public volatile Object call(Object obj)
        {
            return call((Boolean)obj);
        }

        public b call(Boolean boolean1)
        {
            return playlistPostStorage.loadPostedPlaylists(30, 0x7fffffffffffffffL).doOnNext(requestPlaylistsSyncAction).subscribeOn(scheduler);
        }

        _cls3()
        {
            this$0 = PlaylistPostOperations.this;
            super();
        }
    }

}
