// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.bl;

import com.fitbit.util.service.DispatcherService;
import com.fitbit.util.service.IntentMatcher;

// Referenced classes of package com.fitbit.data.bl:
//            ax, ac, ae, j, 
//            fz, at, dy, cq, 
//            bv, bx, fm, bh, 
//            cf, bf, SyncTrackerTask, fj, 
//            ei, cw, cs, cu, 
//            de, bc, cx, da, 
//            dl, bl, ey, em, 
//            SaveGoals, as, z, al, 
//            av, k, n, fy, 
//            aw, cn, fd, cl, 
//            et, ga, fw, au, 
//            ci, eh, SyncFacebookLinkTask, ff

public class SyncService extends DispatcherService
{

    public SyncService()
    {
        super("SyncService");
    }

    public void onCreate()
    {
        super.onCreate();
        b().a(ax.a, com/fitbit/data/bl/ax);
        b().a(ac.a, com/fitbit/data/bl/ac);
        b().a("com.fitbit.data.bl.LogoutTask", com/fitbit/data/bl/ae);
        b().a(j.a, com/fitbit/data/bl/j);
        b().a("com.fitbit.data.bl.UpdateRestrictionsTask.ACTION", com/fitbit/data/bl/fz);
        b().a("com.fitbit.data.bl.SendGCMRegistractionIdTask.ACTION", com/fitbit/data/bl/at);
        b().a("com.fitbit.data.bl.SyncPendingObjectsTask.ACTION", com/fitbit/data/bl/dy);
        b().a("com.fitbit.data.bl.SyncForDayTask.ACTION", com/fitbit/data/bl/cq);
        b().a("com.fitbit.data.bl.SyncDataForLongPeriod.ACTION", com/fitbit/data/bl/bv);
        b().a("com.fitbit.data.bl.SyncDevicesTask.ACTION", com/fitbit/data/bl/bx);
        b().a("com.fitbit.data.bl.SyncTrackerTypesTask.ACTION", com/fitbit/data/bl/fm);
        b().a("com.fitbit.data.bl.SyncAlarmsTask.ACTION", com/fitbit/data/bl/bh);
        b().a("com.fitbit.data.bl.SyncFoodInfoTask.ACTION", com/fitbit/data/bl/cf);
        b().a("com.fitbit.data.bl.SyncActivityUserInfoTask.ACTION", com/fitbit/data/bl/bf);
        b().a("com.fitbit.data.bl.SyncTrackerTask.ACTION", com/fitbit/data/bl/SyncTrackerTask);
        b().a("com.fitbit.data.bl.SyncTrackerInfoTask.ACTION", com/fitbit/data/bl/fj);
        b().a("com.fitbit.data.bl.SyncProfileTask.ACTION", com/fitbit/data/bl/ei);
        b().a("com.fitbit.data.bl.SyncFriendsTask.ACTION", com/fitbit/data/bl/cw);
        b().a("com.fitbit.data.bl.SyncFriendsFromContactsTask.ACTION", com/fitbit/data/bl/cs);
        b().a("com.fitbit.data.bl.SyncFriendsOfFriendTask.ACTION", com/fitbit/data/bl/cu);
        b().a("com.fitbit.data.bl.SyncIntradayGraphTask.ACTION", com/fitbit/data/bl/de);
        b().a("com.fitbit.data.bl.SyncActivityLogsAndIntradayDataTask.ACTION", com/fitbit/data/bl/bc);
        b().a("com.fitbit.data.bl.SyncHeartRateMonthAndIntradayDataTask.ACTION", com/fitbit/data/bl/cx);
        b().a("com.fitbit.data.bl.SyncHeartRateIntradayTimeSeriesAndSummaryTask.ACTION", com/fitbit/data/bl/da);
        b().a("com.fitbit.data.bl.SyncNotificationsTask.ACTION", com/fitbit/data/bl/dl);
        b().a("com.fitbit.data.bl.SyncBluetoothSupportStatusTask.ACTION", com/fitbit/data/bl/bl);
        b().a("com.fitbit.data.bl.SyncSupportedLocalesTask.ACTION", com/fitbit/data/bl/ey);
        b().a("com.fitbit.data.bl.SyncRecommendedLocaleTask.ACTION", com/fitbit/data/bl/em);
        b().a("com.fitbit.data.bl.SaveGoals.ACTION", com/fitbit/data/bl/SaveGoals);
        b().a("com.fitbit.data.bl.SaveFoodPlan.ACTION", com/fitbit/data/bl/as);
        b().a("com.fitbit.data.bl.LoadProfileInfoTask.ACTION", com/fitbit/data/bl/z);
        b().a("com.fitbit.data.bl.PairSoftTrackerTask.ACTION", com/fitbit/data/bl/al);
        b().a("com.fitbit.data.bl.SendMessage.ACTION", com/fitbit/data/bl/av);
        b().a("com.fitbit.data.bl.CheerBadgeTask.ACTION", com/fitbit/data/bl/k);
        b().a("com.fitbit.data.bl.DatabaseMaintananceTask.ACTION", com/fitbit/data/bl/n);
        b().a("com.fitbit.data.bl.UpdateProfilePhotoTask.ACTION", com/fitbit/data/bl/fy);
        b().a(aw.a, com/fitbit/data/bl/aw);
        b().a("com.fitbit.data.bl.SyncFoodMeasurementUnitsTask.ACTION", com/fitbit/data/bl/cn);
        b().a("com.fitbit.data.bl.SyncTimeSeriesTask.ACTION", com/fitbit/data/bl/fd);
        b().a("com.fitbit.data.bl.SyncFoodLogsTask.ACTION", com/fitbit/data/bl/cl);
        b().a("com.fitbit.data.bl.SyncSleepLogsTask.ACTION", com/fitbit/data/bl/et);
        b().a("com.fitbit.data.bl.UploadPhotoToS3Task.ACTION", com/fitbit/data/bl/ga);
        b().a("com.fitbit.data.bl.UnpairDeviceTask.ACTION", com/fitbit/data/bl/fw);
        b().a("com.fitbit.data.bl.SendInviteByEmail.ACTION", com/fitbit/data/bl/au);
        b().a("com.fitbit.data.bl.SyncFoodLocalesTask.ACTION", com/fitbit/data/bl/ci);
        b().a("com.fitbit.data.bl.SyncProfilePreferencesTask.ACTION", com/fitbit/data/bl/eh);
        b().a("com.fitbit.data.bl.SyncFacebookLinkTask.ACTION", com/fitbit/data/bl/SyncFacebookLinkTask);
        b().a("com.fitbit.data.bl.SyncTimeZonesTask.ACTION", com/fitbit/data/bl/ff);
    }
}
