// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.util;

import android.app.Dialog;
import android.app.NotificationManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.content.LocalBroadcastManager;
import com.fitbit.FitbitMobile.GCMNotification;
import com.fitbit.data.bl.LogoutTaskState;
import com.fitbit.data.bl.an;
import com.fitbit.e.a;

// Referenced classes of package com.fitbit.util:
//            SimpleConfirmDialogFragment, r

public class PushNotificationsController
{
    public static class PushNotificationAlert extends SimpleConfirmDialogFragment
    {

        private static final String e = "notification";
        private GCMNotification f;

        static GCMNotification a(PushNotificationAlert pushnotificationalert)
        {
            return pushnotificationalert.f;
        }

        public static PushNotificationAlert a(FragmentActivity fragmentactivity, GCMNotification gcmnotification)
        {
            PushNotificationAlert pushnotificationalert = new PushNotificationAlert();
            Bundle bundle = new Bundle();
            bundle.putParcelable("notification", gcmnotification);
            bundle.putAll(com.fitbit.util.r.a(fragmentactivity.getString(0x7f08046c), gcmnotification.b()));
            pushnotificationalert.setArguments(bundle);
            return pushnotificationalert;
        }

        public void onCreate(Bundle bundle)
        {
            super.onCreate(bundle);
            f = (GCMNotification)getArguments().getParcelable("notification");
        /* block-local class not found */
        class _cls1 {}

            b(new _cls1());
        }

        public PushNotificationAlert()
        {
            super(0x7f08046d, 0x7f08046b);
        }
    }

    public static interface a
    {

        public abstract boolean a(GCMNotification gcmnotification);
    }


    private static final String b = "PushNotificationsController";
    private static final String c = "com.fitbit.ui.BaseFragmentPushActivity.TAG_DLG_PUSH";
    a a;
    private BroadcastReceiver d;
    private FragmentActivity e;
    private boolean f;

    public PushNotificationsController(FragmentActivity fragmentactivity)
    {
        d = new BroadcastReceiver() {

            final PushNotificationsController a;

            public void onReceive(Context context, Intent intent)
            {
                if (com.fitbit.util.PushNotificationsController.a(a))
                {
                    ((ResultReceiver)intent.getParcelableExtra("com.fitbit.FitbitMobile.NotificationBroadcastReceiver.RESULT_RECEIVER")).send(0, new Bundle());
                    a.a((GCMNotification)intent.getParcelableExtra("com.fitbit.FitbitMobile.GCMIntentService.GCM_NOTIFICATION_KEY"));
                }
            }

            
            {
                a = PushNotificationsController.this;
                super();
            }
        };
        e = fragmentactivity;
    }

    public static void a(Context context)
    {
        ((NotificationManager)context.getSystemService("notification")).cancelAll();
    }

    public static void a(FragmentActivity fragmentactivity)
    {
        Handler handler = new Handler(fragmentactivity.getMainLooper());
        handler.postDelayed(new Runnable(fragmentactivity, handler) {

            final FragmentActivity a;
            final Handler b;

            public void run()
            {
                FragmentManager fragmentmanager = a.getSupportFragmentManager();
                Fragment fragment = fragmentmanager.findFragmentByTag("com.fitbit.ui.BaseFragmentPushActivity.TAG_DLG_PUSH");
                if (fragment != null)
                {
                    if (!fragment.isRemoving())
                    {
                        fragmentmanager.beginTransaction().remove(fragment).commitAllowingStateLoss();
                    }
                    b.postDelayed(this, 1L);
                }
            }

            
            {
                a = fragmentactivity;
                b = handler;
                super();
            }
        }, 1L);
    }

    static boolean a(PushNotificationsController pushnotificationscontroller)
    {
        return pushnotificationscontroller.f;
    }

    public static void b(FragmentActivity fragmentactivity)
    {
        a(fragmentactivity);
        a(fragmentactivity);
    }

    public void a()
    {
        f = false;
        LocalBroadcastManager.getInstance(e.getApplicationContext()).unregisterReceiver(d);
    }

    public void a(GCMNotification gcmnotification)
    {
        if (!gcmnotification.c() || an.a().g())
        {
            if (LogoutTaskState.a() == com.fitbit.data.bl.LogoutTaskState.State.b)
            {
                com.fitbit.e.a.a("PushNotificationsController", "The notification canceled because logout operation is not done yet", new Object[0]);
                return;
            }
            if (gcmnotification.a() != com.fitbit.FitbitMobile.GCMNotification.Type.b)
            {
                boolean flag;
                if (a != null && a.a(gcmnotification))
                {
                    flag = false;
                } else
                {
                    flag = true;
                }
                com.fitbit.e.a.a("PushNotificationsController", "activity = %s, shouldShowAlert = %s, listener = %s", new Object[] {
                    e, Boolean.valueOf(flag), a
                });
                if (flag)
                {
                    com.fitbit.util.PushNotificationAlert.a(e, gcmnotification).show(e.getSupportFragmentManager(), "com.fitbit.ui.BaseFragmentPushActivity.TAG_DLG_PUSH");
                    return;
                }
            }
        }
    }

    public void a(a a1)
    {
        a = a1;
    }

    public void b()
    {
        f = true;
        LocalBroadcastManager.getInstance(e.getApplicationContext()).registerReceiver(d, new IntentFilter("com.fitbit.FitbitMobile.NotificationBroadcastReceiver.SYNC_BROADCAST_ACTION"));
        PushNotificationAlert pushnotificationalert = (PushNotificationAlert)e.getSupportFragmentManager().findFragmentByTag("com.fitbit.ui.BaseFragmentPushActivity.TAG_DLG_PUSH");
        if (pushnotificationalert != null && pushnotificationalert.getDialog() != null)
        {
            pushnotificationalert.getDialog().hide();
            pushnotificationalert.getDialog().show();
        }
    }

    public a c()
    {
        return a;
    }
}
