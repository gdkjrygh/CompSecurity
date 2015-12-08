// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.sync;

import android.app.Service;
import android.content.AbstractThreadedSyncAdapter;
import android.content.ContentResolver;
import android.content.Intent;
import android.content.SyncResult;
import android.content.SyncStats;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import com.soundcloud.android.SoundCloudApplication;
import com.soundcloud.android.accounts.AccountOperations;
import com.soundcloud.android.api.legacy.model.ContentStats;
import com.soundcloud.android.api.oauth.Token;
import com.soundcloud.android.model.Urn;
import com.soundcloud.android.playlists.PlaylistStorage;
import com.soundcloud.android.storage.LegacyUserAssociationStorage;
import com.soundcloud.android.storage.provider.Content;
import com.soundcloud.android.sync.likes.MyLikesStateProvider;
import dagger.b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

// Referenced classes of package com.soundcloud.android.sync:
//            ApiSyncService, SyncConfig, SyncContent, SyncStateManager

public class SyncAdapterService extends Service
{

    public static final int CLEAR_ALL = 1;
    private static final boolean DEBUG_CANCEL = Boolean.valueOf(System.getProperty("syncadapter.debug.cancel", null)).booleanValue();
    public static final String EXTRA_SYNC_PUSH = "syncPush";
    public static final String EXTRA_SYNC_PUSH_URI = "syncPushUri";
    public static final int REWIND_LAST_DAY = 2;
    public static final String SYNC_FINISHED = (new StringBuilder()).append(com/soundcloud/android/sync/SyncAdapterService.getName()).append(".syncFinished").toString();
    static final String TAG = com/soundcloud/android/sync/SyncAdapterService.getSimpleName();
    AccountOperations accountOperations;
    MyLikesStateProvider myLikesStateProvider;
    PlaylistStorage playlistStorage;
    private AbstractThreadedSyncAdapter syncAdapter;
    SyncServiceResultReceiver.Factory syncServiceResultReceiverFactory;

    public SyncAdapterService()
    {
        SoundCloudApplication.getObjectGraph().a(this);
    }

    private static Intent getSyncIntent(SoundCloudApplication soundcloudapplication, Bundle bundle, SyncStateManager syncstatemanager, PlaylistStorage playliststorage, MyLikesStateProvider mylikesstateprovider)
    {
        Intent intent = new Intent(soundcloudapplication, com/soundcloud/android/sync/ApiSyncService);
        if (bundle.getBoolean("syncPush"))
        {
            intent.setData(Uri.parse(bundle.getString("syncPushUri")));
            intent.setAction("com.soundcloud.android.sync.action.PUSH");
            return intent;
        }
        boolean flag = bundle.getBoolean("force", false);
        bundle = new ArrayList();
        if (SyncConfig.shouldUpdateDashboard(soundcloudapplication))
        {
            if (SyncConfig.isIncomingEnabled(soundcloudapplication) && (flag || syncstatemanager.isContentDueForSync(SyncContent.MySoundStream)))
            {
                bundle.add(Content.ME_SOUND_STREAM.uri);
            }
            if (SyncConfig.isActivitySyncEnabled(soundcloudapplication) && (flag || syncstatemanager.isContentDueForSync(SyncContent.MyActivities)))
            {
                bundle.add(Content.ME_ACTIVITIES.uri);
            }
        }
        if (flag || SyncConfig.shouldSyncCollections(soundcloudapplication))
        {
            syncstatemanager = syncstatemanager.getCollectionsDueForSync(SyncContent.NON_ACTIVITIES, flag);
            (new StringBuilder("collection due for sync:")).append(syncstatemanager);
            bundle.addAll(syncstatemanager);
        }
        if ((new LegacyUserAssociationStorage(soundcloudapplication)).hasFollowingsNeedingSync())
        {
            bundle.add(Content.ME_FOLLOWINGS.uri);
        }
        if (mylikesstateprovider.hasLocalChanges())
        {
            bundle.add(Content.ME_LIKES.uri);
        }
        if (playliststorage.hasLocalPlaylists())
        {
            bundle.add(Content.ME_PLAYLISTS.uri);
        }
        syncstatemanager = playliststorage.getPlaylistsDueForSync();
        if (syncstatemanager != null)
        {
            for (syncstatemanager = syncstatemanager.iterator(); syncstatemanager.hasNext(); bundle.add(Content.PLAYLIST.forId(playliststorage.getNumericId())))
            {
                playliststorage = (Urn)syncstatemanager.next();
            }

        }
        if (SyncConfig.shouldSync(soundcloudapplication, "lastUserSync", 0x2932e00L) || flag)
        {
            bundle.add(Content.ME.uri);
        }
        if (!bundle.isEmpty())
        {
            intent.putParcelableArrayListExtra("com.soundcloud.android.sync.extra.SYNC_URIS", bundle);
        }
        return intent;
    }

    static boolean performSync(SoundCloudApplication soundcloudapplication, Bundle bundle, SyncResult syncresult, Token token, final Runnable onResult, SyncServiceResultReceiver.Factory factory, MyLikesStateProvider mylikesstateprovider, PlaylistStorage playliststorage)
    {
        if (token == null || !token.valid())
        {
            soundcloudapplication = syncresult.stats;
            soundcloudapplication.numAuthExceptions = ((SyncStats) (soundcloudapplication)).numAuthExceptions + 1L;
        } else
        {
            setContentStatsIfNeverSeen(soundcloudapplication, Content.ME_SOUND_STREAM);
            setContentStatsIfNeverSeen(soundcloudapplication, Content.ME_ACTIVITIES);
            bundle = getSyncIntent(soundcloudapplication, bundle, new SyncStateManager(soundcloudapplication), playliststorage, mylikesstateprovider);
            if (bundle.getData() != null || bundle.hasExtra("com.soundcloud.android.sync.extra.SYNC_URIS"))
            {
                bundle.putExtra("com.soundcloud.android.sync.extra.STATUS_RECEIVER", factory.create(syncresult, new _cls2()));
                soundcloudapplication.startService(bundle);
                return true;
            }
        }
        return false;
    }

    public static void requestNewSync(SoundCloudApplication soundcloudapplication, int i)
    {
        i;
        JVM INSTR tableswitch 1 2: default 24
    //                   1 54
    //                   2 61;
           goto _L1 _L2 _L3
_L1:
        Bundle bundle = new Bundle();
        bundle.putBoolean("force", true);
        ContentResolver.requestSync(soundcloudapplication.getAccountOperations().getSoundCloudAccount(), "com.soundcloud.android.provider.ScContentProvider", bundle);
        return;
_L2:
        ContentStats.clear(soundcloudapplication);
        continue; /* Loop/switch isn't completed */
_L3:
        ContentStats.rewind(soundcloudapplication, 0x5265c00L);
        if (true) goto _L1; else goto _L4
_L4:
    }

    private static void setContentStatsIfNeverSeen(SoundCloudApplication soundcloudapplication, Content content)
    {
        if (ContentStats.getLastSeen(soundcloudapplication, content) <= 0L)
        {
            ContentStats.setLastSeen(soundcloudapplication, content, System.currentTimeMillis());
            ContentStats.setLastNotified(soundcloudapplication, content, System.currentTimeMillis());
        }
    }

    public IBinder onBind(Intent intent)
    {
        return syncAdapter.getSyncAdapterBinder();
    }

    public void onCreate()
    {
        super.onCreate();
        syncAdapter = new _cls1(this, false);
    }



    private class _cls2
        implements SyncServiceResultReceiver.OnResultListener
    {

        final Runnable val$onResult;

        public final void onResultReceived()
        {
            if (onResult != null)
            {
                onResult.run();
            }
        }

        _cls2()
        {
            onResult = runnable;
            super();
        }
    }


    private class _cls1 extends AbstractThreadedSyncAdapter
    {

        private Looper looper;
        final SyncAdapterService this$0;

        public void onPerformSync(Account account, Bundle bundle, String s, ContentProviderClient contentproviderclient, SyncResult syncresult)
        {
            PublicApi.setBackgroundMode(true);
            Looper.prepare();
            looper = Looper.myLooper();
            class _cls1
                implements Runnable
            {

                final _cls1 this$1;

                public void run()
                {
                    String s1 = SyncAdapterService.TAG;
                    sendBroadcast(new Intent(SyncAdapterService.SYNC_FINISHED));
                    looper.quit();
                }

                _cls1()
                {
                    this$1 = _cls1.this;
                    super();
                }
            }

            if (SyncAdapterService.performSync((SoundCloudApplication)getApplication(), bundle, syncresult, accountOperations.getSoundCloudToken(), new _cls1(), syncServiceResultReceiverFactory, myLikesStateProvider, playlistStorage))
            {
                Looper.loop();
            }
            PublicApi.setBackgroundMode(false);
        }

        public void onSyncCanceled()
        {
            if (SyncAdapterService.DEBUG_CANCEL)
            {
                String s = SyncAdapterService.TAG;
                DebugUtils.dumpStack(getContext());
                class _cls2 extends Thread
                {

                    final _cls1 this$1;

                    public void run()
                    {
                        DebugUtils.dumpLog(getContext());
                    }

                _cls2()
                {
                    this$1 = _cls1.this;
                    super();
                }
                }

                (new _cls2()).start();
            }
            if (looper != null)
            {
                looper.quit();
            }
            super.onSyncCanceled();
        }


        _cls1(Context context, boolean flag)
        {
            this$0 = SyncAdapterService.this;
            super(context, flag);
        }
    }

}
