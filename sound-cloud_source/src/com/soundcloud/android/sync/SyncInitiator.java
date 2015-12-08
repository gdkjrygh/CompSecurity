// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.sync;

import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.soundcloud.android.accounts.AccountOperations;
import com.soundcloud.android.model.Urn;
import com.soundcloud.android.storage.provider.Content;
import com.soundcloud.android.utils.PropertySets;
import com.soundcloud.java.collections.Lists;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import rx.b;
import rx.b.a;
import rx.b.f;

// Referenced classes of package com.soundcloud.android.sync:
//            SyncContent, ApiSyncService, SyncStateManager, LegacyResultReceiverAdapter

public class SyncInitiator
{

    private static final f LEGACY_RESULT_TO_SYNC_RESULT = new _cls2();
    private final AccountOperations accountOperations;
    private final Context context;
    private final a requestSystemSyncAction = new _cls1();
    private final SyncStateManager syncStateManager;

    public SyncInitiator(Context context1, AccountOperations accountoperations, SyncStateManager syncstatemanager)
    {
        syncStateManager = syncstatemanager;
        context = context1.getApplicationContext();
        accountOperations = accountoperations;
    }

    private b backfillSync(SyncContent synccontent)
    {
        return b.create(new _cls4());
    }

    private Intent createIntent(String s)
    {
        return (new Intent(context, com/soundcloud/android/sync/ApiSyncService)).setAction(s);
    }

    private Intent createIntent(String s, Urn urn)
    {
        return createIntent(s).putExtra("urn", urn);
    }

    private b explicitSync(final SyncContent contentUri, final String syncAction)
    {
        contentUri = contentUri.content.uri;
        return b.create(new _cls3()).doOnNext(resetSyncMissesLegacy(new Uri[] {
            contentUri
        }));
    }

    private Intent getSyncLocalPlaylistsIntent()
    {
        return (new Intent(context, com/soundcloud/android/sync/ApiSyncService)).putExtra("com.soundcloud.android.sync.extra.IS_UI_REQUEST", true).setData(Content.ME_PLAYLISTS.uri);
    }

    private b legacyRequestSyncObservable(String s)
    {
        return requestSyncResultObservable(createIntent(s));
    }

    private b legacyRequestSyncObservable(String s, Urn urn)
    {
        return requestSyncResultObservable(createIntent(s, urn));
    }

    private void requestCollectionsSync(String s, LegacyResultReceiverAdapter legacyresultreceiveradapter)
    {
        ArrayList arraylist = new ArrayList(Arrays.asList(new Uri[] {
            SyncContent.MyLikes.content.uri, SyncContent.MyPlaylists.content.uri
        }));
        context.startService((new Intent(context, com/soundcloud/android/sync/ApiSyncService)).setAction(s).putExtra("com.soundcloud.android.sync.extra.STATUS_RECEIVER", legacyresultreceiveradapter).putExtra("com.soundcloud.android.sync.extra.IS_UI_REQUEST", true).putParcelableArrayListExtra("com.soundcloud.android.sync.extra.SYNC_URIS", arraylist));
    }

    private void requestFollowingsSync(String s, LegacyResultReceiverAdapter legacyresultreceiveradapter)
    {
        context.startService((new Intent(context, com/soundcloud/android/sync/ApiSyncService)).setAction(s).putExtra("com.soundcloud.android.sync.extra.STATUS_RECEIVER", legacyresultreceiveradapter).putExtra("com.soundcloud.android.sync.extra.IS_UI_REQUEST", true).setData(Content.ME_FOLLOWING.uri));
    }

    private void requestLikesSync(String s, LegacyResultReceiverAdapter legacyresultreceiveradapter)
    {
        context.startService((new Intent(context, com/soundcloud/android/sync/ApiSyncService)).setAction(s).putExtra("com.soundcloud.android.sync.extra.STATUS_RECEIVER", legacyresultreceiveradapter).putExtra("com.soundcloud.android.sync.extra.IS_UI_REQUEST", true).setData(Content.ME_LIKES.uri));
    }

    private void requestPostedPlaylistsSync(String s, LegacyResultReceiverAdapter legacyresultreceiveradapter)
    {
        context.startService((new Intent(context, com/soundcloud/android/sync/ApiSyncService)).setAction(s).putExtra("com.soundcloud.android.sync.extra.STATUS_RECEIVER", legacyresultreceiveradapter).putExtra("com.soundcloud.android.sync.extra.IS_UI_REQUEST", true).setData(Content.ME_PLAYLISTS.uri));
    }

    private void requestPostsSync(String s, LegacyResultReceiverAdapter legacyresultreceiveradapter)
    {
        context.startService((new Intent(context, com/soundcloud/android/sync/ApiSyncService)).setAction(s).putExtra("com.soundcloud.android.sync.extra.STATUS_RECEIVER", legacyresultreceiveradapter).putExtra("com.soundcloud.android.sync.extra.IS_UI_REQUEST", true).setData(Content.ME_SOUNDS.uri));
    }

    private b requestSyncResultObservable(final Intent intent)
    {
        return b.create(new _cls11());
    }

    private rx.b.b resetSyncMisses(final Uri uri)
    {
        return new _cls15();
    }

    private transient rx.b.b resetSyncMissesLegacy(final Uri uris[])
    {
        return new _cls14();
    }

    public b backfillTimelineItems(SyncContent synccontent)
    {
        return backfillSync(synccontent);
    }

    public boolean pushFollowingsToApi()
    {
        android.accounts.Account account = accountOperations.getSoundCloudAccount();
        if (account != null)
        {
            Bundle bundle = new Bundle();
            bundle.putBoolean("syncPush", true);
            bundle.putString("syncPushUri", Content.ME_FOLLOWINGS.uri.toString());
            ContentResolver.requestSync(account, "com.soundcloud.android.provider.ScContentProvider", bundle);
            return true;
        } else
        {
            return false;
        }
    }

    public b refreshCollections()
    {
        final Uri collectionUris[] = new Uri[2];
        collectionUris[0] = SyncContent.MyLikes.content.uri;
        collectionUris[1] = SyncContent.MyPlaylists.content.uri;
        return b.create(new _cls9()).doOnNext(resetSyncMissesLegacy(collectionUris));
    }

    public b refreshFollowings()
    {
        final Uri uri = SyncContent.MyFollowings.content.uri;
        return b.create(new _cls6()).doOnNext(resetSyncMissesLegacy(new Uri[] {
            uri
        }));
    }

    public b refreshLikes()
    {
        final Uri uri = SyncContent.MyLikes.content.uri;
        return b.create(new _cls8()).doOnNext(resetSyncMissesLegacy(new Uri[] {
            uri
        }));
    }

    public b refreshMyPlaylists()
    {
        final Uri uri = SyncContent.MyPlaylists.content.uri;
        return b.create(new _cls10()).doOnNext(resetSyncMissesLegacy(new Uri[] {
            uri
        }));
    }

    public b refreshPosts()
    {
        final Uri uri = SyncContent.MySounds.content.uri;
        return b.create(new _cls7()).doOnNext(resetSyncMissesLegacy(new Uri[] {
            uri
        }));
    }

    public b refreshTimelineItems(SyncContent synccontent)
    {
        return explicitSync(synccontent, "com.soundcloud.android.sync.action.HARD_REFRESH");
    }

    public void requestPlaylistSync(List list)
    {
        context.startService((new Intent(context, com/soundcloud/android/sync/ApiSyncService)).setAction("syncPlaylists").putParcelableArrayListExtra("urns", PropertySets.extractUrns(list)));
    }

    public b requestSyncObservable(String s, String s1)
    {
        return requestSyncResultObservable(createIntent(s1).putExtra("com.soundcloud.android.sync.extra.COLLECTION_TYPE", s));
    }

    public boolean requestSystemSync()
    {
        android.accounts.Account account = accountOperations.getSoundCloudAccount();
        if (account != null)
        {
            ContentResolver.requestSync(account, "com.soundcloud.android.provider.ScContentProvider", new Bundle());
            return true;
        } else
        {
            return false;
        }
    }

    public a requestSystemSyncAction()
    {
        return requestSystemSyncAction;
    }

    public void requestTracksSync(List list)
    {
        context.startService((new Intent(context, com/soundcloud/android/sync/ApiSyncService)).setAction("syncTracks").putParcelableArrayListExtra("urns", PropertySets.extractUrns(list)));
    }

    public void syncLocalPlaylists()
    {
        context.startService(getSyncLocalPlaylistsIntent());
    }

    public b syncNewTimelineItems(SyncContent synccontent)
    {
        return explicitSync(synccontent, null);
    }

    public b syncPlaylist(Urn urn)
    {
        if (urn.getNumericId() < 0L)
        {
            return b.create(new _cls12()).map(LEGACY_RESULT_TO_SYNC_RESULT);
        } else
        {
            return legacyRequestSyncObservable("syncPlaylist", urn);
        }
    }

    public b syncPlaylistLikes()
    {
        return legacyRequestSyncObservable("syncPlaylistLikes").doOnNext(resetSyncMisses(SyncContent.MyLikes.content.uri));
    }

    public b syncPlaylistPosts()
    {
        return legacyRequestSyncObservable("syncPlaylists");
    }

    public b syncRecommendations()
    {
        return legacyRequestSyncObservable("syncRecommendations");
    }

    public b syncTrack(final Urn trackUrn)
    {
        return b.create(new _cls13());
    }

    public b syncTrackLikes()
    {
        return legacyRequestSyncObservable("syncTrackLikes").doOnNext(resetSyncMisses(SyncContent.MyLikes.content.uri));
    }

    public b syncUser(final Urn userUrn)
    {
        return b.create(new _cls5());
    }

    public b syncUsers(List list)
    {
        return requestSyncResultObservable((new Intent(context, com/soundcloud/android/sync/ApiSyncService)).setAction("syncUsers").putParcelableArrayListExtra("urns", Lists.newArrayList(list)));
    }










    private class _cls1
        implements a
    {

        final SyncInitiator this$0;

        public void call()
        {
            requestSystemSync();
        }

        _cls1()
        {
            this$0 = SyncInitiator.this;
            super();
        }
    }


    private class _cls4
        implements rx.b.f
    {

        final SyncInitiator this$0;
        final Uri val$contentUri;

        public volatile void call(Object obj)
        {
            call((X)obj);
        }

        public void call(X x)
        {
            context.startService((new Intent(context, com/soundcloud/android/sync/ApiSyncService)).putExtra("com.soundcloud.android.sync.extra.STATUS_RECEIVER", new LegacyResultReceiverAdapter(x, new Uri[] {
                contentUri
            })).putExtra("com.soundcloud.android.sync.extra.IS_UI_REQUEST", true).setData(contentUri).setAction("com.soundcloud.android.sync.action.APPEND"));
        }

        _cls4()
        {
            this$0 = SyncInitiator.this;
            contentUri = uri;
            super();
        }
    }


    private class _cls3
        implements rx.b.f
    {

        final SyncInitiator this$0;
        final Uri val$contentUri;
        final String val$syncAction;

        public volatile void call(Object obj)
        {
            call((X)obj);
        }

        public void call(X x)
        {
            context.startService((new Intent(context, com/soundcloud/android/sync/ApiSyncService)).setAction(syncAction).putExtra("com.soundcloud.android.sync.extra.STATUS_RECEIVER", new LegacyResultReceiverAdapter(x, new Uri[] {
                contentUri
            })).putExtra("com.soundcloud.android.sync.extra.IS_UI_REQUEST", true).setData(contentUri));
        }

        _cls3()
        {
            this$0 = SyncInitiator.this;
            syncAction = s;
            contentUri = uri;
            super();
        }
    }


    private class _cls11
        implements rx.b.f
    {

        final SyncInitiator this$0;
        final Intent val$intent;

        public volatile void call(Object obj)
        {
            call((X)obj);
        }

        public void call(X x)
        {
            x = new ResultReceiverAdapter(x, Looper.getMainLooper());
            context.startService(intent.putExtra("com.soundcloud.android.sync.extra.STATUS_RECEIVER", x));
        }

        _cls11()
        {
            this$0 = SyncInitiator.this;
            intent = intent1;
            super();
        }
    }


    private class _cls15
        implements rx.b.b
    {

        final SyncInitiator this$0;
        final Uri val$uri;

        public void call(SyncResult syncresult)
        {
            if (syncresult.wasChanged())
            {
                syncStateManager.resetSyncMisses(uri);
            }
        }

        public volatile void call(Object obj)
        {
            call((SyncResult)obj);
        }

        _cls15()
        {
            this$0 = SyncInitiator.this;
            uri = uri1;
            super();
        }
    }


    private class _cls14
        implements rx.b.b
    {

        final SyncInitiator this$0;
        final Uri val$uris[];

        public void call(Boolean boolean1)
        {
            if (boolean1.booleanValue())
            {
                boolean1 = uris;
                int j = boolean1.length;
                for (int i = 0; i < j; i++)
                {
                    Uri uri = boolean1[i];
                    syncStateManager.resetSyncMisses(uri);
                }

            }
        }

        public volatile void call(Object obj)
        {
            call((Boolean)obj);
        }

        _cls14()
        {
            this$0 = SyncInitiator.this;
            uris = auri;
            super();
        }
    }


    private class _cls9
        implements rx.b.f
    {

        final SyncInitiator this$0;
        final Uri val$collectionUris[];

        public volatile void call(Object obj)
        {
            call((X)obj);
        }

        public void call(X x)
        {
            requestCollectionsSync("com.soundcloud.android.sync.action.HARD_REFRESH", new LegacyResultReceiverAdapter(x, collectionUris));
        }

        _cls9()
        {
            this$0 = SyncInitiator.this;
            collectionUris = auri;
            super();
        }
    }


    private class _cls6
        implements rx.b.f
    {

        final SyncInitiator this$0;
        final Uri val$uri;

        public volatile void call(Object obj)
        {
            call((X)obj);
        }

        public void call(X x)
        {
            requestFollowingsSync("com.soundcloud.android.sync.action.HARD_REFRESH", new LegacyResultReceiverAdapter(x, new Uri[] {
                uri
            }));
        }

        _cls6()
        {
            this$0 = SyncInitiator.this;
            uri = uri1;
            super();
        }
    }


    private class _cls8
        implements rx.b.f
    {

        final SyncInitiator this$0;
        final Uri val$uri;

        public volatile void call(Object obj)
        {
            call((X)obj);
        }

        public void call(X x)
        {
            requestLikesSync("com.soundcloud.android.sync.action.HARD_REFRESH", new LegacyResultReceiverAdapter(x, new Uri[] {
                uri
            }));
        }

        _cls8()
        {
            this$0 = SyncInitiator.this;
            uri = uri1;
            super();
        }
    }


    private class _cls10
        implements rx.b.f
    {

        final SyncInitiator this$0;
        final Uri val$uri;

        public volatile void call(Object obj)
        {
            call((X)obj);
        }

        public void call(X x)
        {
            requestPostedPlaylistsSync("com.soundcloud.android.sync.action.HARD_REFRESH", new LegacyResultReceiverAdapter(x, new Uri[] {
                uri
            }));
        }

        _cls10()
        {
            this$0 = SyncInitiator.this;
            uri = uri1;
            super();
        }
    }


    private class _cls7
        implements rx.b.f
    {

        final SyncInitiator this$0;
        final Uri val$uri;

        public volatile void call(Object obj)
        {
            call((X)obj);
        }

        public void call(X x)
        {
            requestPostsSync("com.soundcloud.android.sync.action.HARD_REFRESH", new LegacyResultReceiverAdapter(x, new Uri[] {
                uri
            }));
        }

        _cls7()
        {
            this$0 = SyncInitiator.this;
            uri = uri1;
            super();
        }
    }


    private class _cls12
        implements rx.b.f
    {

        final SyncInitiator this$0;

        public volatile void call(Object obj)
        {
            call((X)obj);
        }

        public void call(X x)
        {
            x = getSyncLocalPlaylistsIntent().putExtra("com.soundcloud.android.sync.extra.STATUS_RECEIVER", new LegacyResultReceiverAdapter(x, new Uri[] {
                Content.ME_PLAYLISTS.uri
            }));
            context.startService(x);
        }

        _cls12()
        {
            this$0 = SyncInitiator.this;
            super();
        }
    }


    private class _cls13
        implements rx.b.f
    {

        final SyncInitiator this$0;
        final Urn val$trackUrn;

        public volatile void call(Object obj)
        {
            call((X)obj);
        }

        public void call(X x)
        {
            Uri uri = Content.TRACKS.forId(trackUrn.getNumericId());
            x = new LegacyResultReceiverAdapter(x, new Uri[] {
                uri
            });
            context.startService((new Intent(context, com/soundcloud/android/sync/ApiSyncService)).putExtra("com.soundcloud.android.sync.extra.IS_UI_REQUEST", true).putExtra("com.soundcloud.android.sync.extra.STATUS_RECEIVER", x).setData(uri));
        }

        _cls13()
        {
            this$0 = SyncInitiator.this;
            trackUrn = urn;
            super();
        }
    }


    private class _cls5
        implements rx.b.f
    {

        final SyncInitiator this$0;
        final Urn val$userUrn;

        public volatile void call(Object obj)
        {
            call((X)obj);
        }

        public void call(X x)
        {
            x = new ResultReceiverAdapter(x, Looper.getMainLooper());
            context.startService((new Intent(context, com/soundcloud/android/sync/ApiSyncService)).setAction("syncUsers").putExtra("com.soundcloud.android.sync.extra.IS_UI_REQUEST", true).putExtra("com.soundcloud.android.sync.extra.STATUS_RECEIVER", x).putParcelableArrayListExtra("urns", Lists.newArrayList(new Urn[] {
                userUrn
            })));
        }

        _cls5()
        {
            this$0 = SyncInitiator.this;
            userUrn = urn;
            super();
        }
    }


    private class _cls2
        implements f
    {

        public final SyncResult call(Boolean boolean1)
        {
            return SyncResult.success("syncPlaylist", boolean1.booleanValue());
        }

        public final volatile Object call(Object obj)
        {
            return call((Boolean)obj);
        }

        _cls2()
        {
        }
    }

}
