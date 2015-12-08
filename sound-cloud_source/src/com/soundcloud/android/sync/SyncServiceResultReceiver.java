// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.sync;

import android.content.Context;
import android.content.SyncResult;
import android.content.SyncStats;
import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;
import com.soundcloud.android.api.legacy.model.ContentStats;
import com.soundcloud.android.api.legacy.model.activities.Activities;
import com.soundcloud.android.storage.LegacyActivitiesStorage;
import com.soundcloud.android.storage.provider.Content;
import com.soundcloud.android.stream.SoundStreamSyncOperations;

// Referenced classes of package com.soundcloud.android.sync:
//            SyncConfig, SyncAdapterService, SyncContent, NotificationMessage, 
//            SyncStateManager

class SyncServiceResultReceiver extends ResultReceiver
{
    public static class Factory
    {

        private final Context context;
        private final SoundStreamSyncOperations soundStreamSyncOps;
        private final SyncStateManager syncStateManager;

        public SyncServiceResultReceiver create(SyncResult syncresult, OnResultListener onresultlistener)
        {
            return new SyncServiceResultReceiver(context, soundStreamSyncOps, syncStateManager, syncresult, onresultlistener, null);
        }

        public Factory(Context context1, SoundStreamSyncOperations soundstreamsyncoperations, SyncStateManager syncstatemanager)
        {
            context = context1;
            soundStreamSyncOps = soundstreamsyncoperations;
            syncStateManager = syncstatemanager;
        }
    }

    public static interface OnResultListener
    {

        public abstract void onResultReceived();
    }


    private final Context context;
    private final OnResultListener listener;
    private final SyncResult result;
    private final SoundStreamSyncOperations soundStreamSyncOperations;
    private final SyncStateManager syncStateManager;

    private SyncServiceResultReceiver(Context context1, SoundStreamSyncOperations soundstreamsyncoperations, SyncStateManager syncstatemanager, SyncResult syncresult, OnResultListener onresultlistener)
    {
        super(new Handler());
        syncStateManager = syncstatemanager;
        result = syncresult;
        context = context1;
        soundStreamSyncOperations = soundstreamsyncoperations;
        listener = onresultlistener;
    }

    SyncServiceResultReceiver(Context context1, SoundStreamSyncOperations soundstreamsyncoperations, SyncStateManager syncstatemanager, SyncResult syncresult, OnResultListener onresultlistener, _cls1 _pcls1)
    {
        this(context1, soundstreamsyncoperations, syncstatemanager, syncresult, onresultlistener);
    }

    private void createSystemNotification()
    {
        Object obj = new LegacyActivitiesStorage();
        long l = SyncConfig.getNotificationsFrequency(context);
        long l1 = System.currentTimeMillis() - ContentStats.getLastNotified(context, Content.ME_SOUND_STREAM);
        if (SyncConfig.isIncomingEnabled(context))
        {
            if (l1 > l)
            {
                soundStreamSyncOperations.createNotificationForUnseenItems();
            } else
            {
                String s = SyncAdapterService.TAG;
                (new StringBuilder("skipping stream notification, delta ")).append(l1).append(" < frequency=").append(l);
            }
        }
        if (SyncConfig.isActivitySyncEnabled(context))
        {
            l = ContentStats.getLastSeen(context, Content.ME_ACTIVITIES);
            obj = ((LegacyActivitiesStorage) (obj)).getCollectionSince(Content.ME_ACTIVITIES.uri, l);
            maybeNotifyActivity(context, ((Activities) (obj)));
        }
    }

    private Activities getCommentNotifications(Context context1, Activities activities)
    {
        if (SyncConfig.isCommentNotificationsEnabled(context1))
        {
            return activities.comments();
        } else
        {
            return Activities.EMPTY;
        }
    }

    private Activities getFollowersNotifications(Context context1, Activities activities)
    {
        if (SyncConfig.isNewFollowerNotificationsEnabled(context1))
        {
            return activities.followers();
        } else
        {
            return Activities.EMPTY;
        }
    }

    private Activities getLikeNotifications(Context context1, Activities activities)
    {
        if (SyncConfig.isLikeNotificationEnabled(context1))
        {
            return activities.trackLikes();
        } else
        {
            return Activities.EMPTY;
        }
    }

    private Activities getRepostNotifications(Context context1, Activities activities)
    {
        if (SyncConfig.isRepostNotificationsEnabled(context1))
        {
            return activities.trackReposts();
        } else
        {
            return Activities.EMPTY;
        }
    }

    private void handleSyncResult(int i, Bundle bundle)
    {
        i;
        JVM INSTR tableswitch 2 3: default 24
    //                   2 25
    //                   3 81;
           goto _L1 _L2 _L3
_L1:
        return;
_L2:
        bundle = (SyncResult)bundle.getParcelable("com.soundcloud.android.sync.extra.SYNC_RESULT");
        result.stats.numAuthExceptions = ((SyncResult) (bundle)).stats.numAuthExceptions;
        result.stats.numIoExceptions = ((SyncResult) (bundle)).stats.numIoExceptions;
        result.delayUntil = ((SyncResult) (bundle)).delayUntil;
        return;
_L3:
        SyncContent.updateCollections(syncStateManager, bundle);
        if (SyncConfig.shouldUpdateDashboard(context))
        {
            createSystemNotification();
            return;
        }
        if (true) goto _L1; else goto _L4
_L4:
    }

    private boolean maybeNotifyActivity(Context context1, Activities activities)
    {
        if (!activities.isEmpty())
        {
            Object obj = getLikeNotifications(context1, activities);
            Activities activities1 = getCommentNotifications(context1, activities);
            Activities activities2 = getRepostNotifications(context1, activities);
            Activities activities3 = getFollowersNotifications(context1, activities);
            activities = Activities.EMPTY.merge(new Activities[] {
                obj, activities1, activities2, activities3
            });
            if (!activities.isEmpty())
            {
                activities.sort();
                if (activities.newerThan(ContentStats.getLastNotifiedItem(context1, Content.ME_ACTIVITIES)))
                {
                    obj = (new NotificationMessage.Builder(context1.getResources())).setAllActivitiesToNotify(activities).setLikes(((Activities) (obj))).setComments(activities1).setReposts(activities2).setFollowers(activities3).build();
                    NotificationMessage.showDashboardNotification(context1, ((NotificationMessage) (obj)).ticker, ((NotificationMessage) (obj)).title, ((NotificationMessage) (obj)).message, NotificationMessage.createNotificationIntent("com.soundcloud.android.action.ACTIVITY"), 5, activities.getFirstAvailableAvatar());
                    ContentStats.setLastNotifiedItem(context1, Content.ME_ACTIVITIES, activities.getTimestamp());
                    return true;
                }
            }
        }
        return false;
    }

    protected void onReceiveResult(int i, Bundle bundle)
    {
        handleSyncResult(i, bundle);
        if (listener != null)
        {
            listener.onResultReceived();
        }
        return;
        bundle;
        if (listener != null)
        {
            listener.onResultReceived();
        }
        throw bundle;
    }
}
