// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.FitbitMobile;

import android.app.NotificationManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;
import android.support.v4.app.TaskStackBuilder;
import android.text.TextUtils;
import com.fitbit.ApplicationForegroundController;
import com.fitbit.FitBitApplication;
import com.fitbit.challenges.ui.ChallengeActivity;
import com.fitbit.challenges.ui.IncomingInvitationActivity;
import com.fitbit.challenges.ui.a;
import com.fitbit.data.bl.ChallengesUtils;
import com.fitbit.data.bl.ah;
import com.fitbit.friends.ui.ConversationActivity;
import com.fitbit.home.ui.HomeActivity;
import com.fitbit.home.ui.HomeNavigationItem;
import com.fitbit.profile.ui.badges.BadgeDetailActivity;
import com.fitbit.settings.ui.ProfileActivity;
import com.fitbit.util.z;
import java.util.List;

// Referenced classes of package com.fitbit.FitbitMobile:
//            GCMNotification

public class NotificationBroadcastReceiver extends BroadcastReceiver
{

    public static final String a = "com.fitbit.FitbitMobile.NotificationBroadcastReceiver.ACTION";
    public static final String b = "com.fitbit.FitbitMobile.NotificationBroadcastReceiver.ACTION_NOTIFICATION_CAME";
    public static final String c = "com.fitbit.FitbitMobile.NotificationBroadcastReceiver.ACTION_CHALLENGE_INVITE_RECEIVED";
    public static final String d = "com.fitbit.FitbitMobile.NotificationBroadcastReceiver.SYNC_BROADCAST_ACTION";
    public static final String e = "com.fitbit.FitbitMobile.NotificationBroadcastReceiver.RESULT_RECEIVER";
    public static final String f = "com.fitbit.FitbitMobile.GCMIntentService.GCM_NOTIFICATION_KEY";
    private static final String g = "NotificationBroadcastReceiver";

    public NotificationBroadcastReceiver()
    {
    }

    private void a()
    {
        com.fitbit.challenges.ui.a.a().a(true);
        z.a(new Intent("com.fitbit.FitbitMobile.NotificationBroadcastReceiver.ACTION_CHALLENGE_INVITE_RECEIVED"));
    }

    private transient void a(Context context, Bundle bundle, Intent aintent[])
    {
        context = TaskStackBuilder.create(context);
        int j = aintent.length;
        for (int i = 0; i < j; i++)
        {
            context.addNextIntent(aintent[i]);
        }

        try
        {
            context.startActivities(bundle);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            com.fitbit.e.a.f("NotificationBroadcastReceiver", "Unable to start activities", context, new Object[0]);
        }
    }

    private transient void a(Context context, Intent aintent[])
    {
        a(context, null, aintent);
    }

    private void a(GCMNotification gcmnotification, Context context)
    {
        a(context, new Intent[] {
            HomeActivity.a(context, 0x10000000), HomeActivity.b(context, HomeNavigationItem.c)
        });
    }

    private boolean a(Intent intent)
    {
        String s = intent.getAction();
        String s1 = intent.getPackage();
        com.fitbit.e.a.a("NotificationBroadcastReceiver", String.format("Notification for package %s, being evaluated", new Object[] {
            s1
        }), new Object[0]);
        while (!TextUtils.isEmpty(s1) && !TextUtils.equals(s1, FitBitApplication.a().getPackageName()) || !"com.fitbit.FitbitMobile.NotificationBroadcastReceiver.ACTION_NOTIFICATION_CAME".equals(s) && !"com.fitbit.FitbitMobile.NotificationBroadcastReceiver.ACTION".equals(s)) 
        {
            return false;
        }
        return intent.hasExtra("com.fitbit.FitbitMobile.GCMIntentService.GCM_NOTIFICATION_KEY");
    }

    private void b(GCMNotification gcmnotification, Context context)
    {
        a(context, new Intent[] {
            HomeActivity.a(context, 0x10000000), ProfileActivity.b(context), BadgeDetailActivity.a(context, gcmnotification.e(), null)
        });
    }

    private void c(GCMNotification gcmnotification, Context context)
    {
        ChallengesUtils.a(gcmnotification);
        Object obj = gcmnotification.e();
        gcmnotification = HomeActivity.a(context, 0x10000000);
        obj = IncomingInvitationActivity.a(context, ((String) (obj)), 0x10000000);
        a(context, new Bundle(), new Intent[] {
            gcmnotification, obj
        });
    }

    private void d(GCMNotification gcmnotification, Context context)
    {
        ChallengesUtils.a(gcmnotification);
        gcmnotification = gcmnotification.e();
        a(context, new Intent[] {
            HomeActivity.a(context, 0x10000000), ChallengeActivity.a(context, gcmnotification, false).addFlags(0x10000000)
        });
    }

    private void e(GCMNotification gcmnotification, Context context)
    {
        if (ah.a().a(gcmnotification.a()).size() < 2)
        {
            long l = gcmnotification.f();
            gcmnotification = ConversationActivity.b(context.getApplicationContext(), l, 0x10000000, true);
        } else
        {
            gcmnotification = HomeActivity.b(context, HomeNavigationItem.c);
        }
        a(context, new Intent[] {
            HomeActivity.a(context, 0x10000000), gcmnotification
        });
    }

    private void f(GCMNotification gcmnotification, Context context)
    {
        if (ah.a().a(gcmnotification.a()).size() < 2)
        {
            gcmnotification = ProfileActivity.a(context, gcmnotification.f());
        } else
        {
            gcmnotification = HomeActivity.b(context, HomeNavigationItem.c);
        }
        a(context, new Intent[] {
            HomeActivity.a(context, 0x10000000), gcmnotification
        });
    }

    public void onReceive(Context context, Intent intent)
    {
        com.fitbit.e.a.a("NotificationBroadcastReceiver", "RECEIVED SOMETHING", new Object[0]);
        if (!a(intent))
        {
            com.fitbit.e.a.a("NotificationBroadcastReceiver", "Ingnored because it is \"invalid\"", new Object[0]);
        } else
        {
            Intent intent1 = new Intent("com.fitbit.FitbitMobile.NotificationBroadcastReceiver.SYNC_BROADCAST_ACTION");
            boolean aflag[] = new boolean[1];
            aflag[0] = false;
            ResultReceiver resultreceiver = new ResultReceiver(null, aflag) {

                final boolean a[];
                final NotificationBroadcastReceiver b;

                protected void onReceiveResult(int k, Bundle bundle)
                {
                    a[0] = true;
                }

            
            {
                b = NotificationBroadcastReceiver.this;
                a = aflag;
                super(handler);
            }
            };
            GCMNotification gcmnotification = (GCMNotification)intent.getParcelableExtra("com.fitbit.FitbitMobile.GCMIntentService.GCM_NOTIFICATION_KEY");
            intent1.putExtra("com.fitbit.FitbitMobile.NotificationBroadcastReceiver.RESULT_RECEIVER", resultreceiver);
            intent1.putExtra("com.fitbit.FitbitMobile.GCMIntentService.GCM_NOTIFICATION_KEY", gcmnotification);
            z.b(intent1);
            int i = gcmnotification.d();
            if (gcmnotification.a().b())
            {
                int j = gcmnotification.a().ordinal();
                i = j;
                if (gcmnotification.a() == GCMNotification.Type.f)
                {
                    a();
                    i = j;
                }
            }
            if (!aflag[0] && "com.fitbit.FitbitMobile.NotificationBroadcastReceiver.ACTION".equals(intent.getAction()))
            {
                com.fitbit.e.a.a("NotificationBroadcastReceiver", "Displaying a notification", new Object[0]);
                if (gcmnotification.a() == GCMNotification.Type.c)
                {
                    f(gcmnotification, context);
                    i = gcmnotification.a().ordinal();
                } else
                if (gcmnotification.a() == GCMNotification.Type.d)
                {
                    e(gcmnotification, context);
                    i = gcmnotification.a().ordinal();
                } else
                if (gcmnotification.a() == GCMNotification.Type.e)
                {
                    a(gcmnotification, context);
                    i = gcmnotification.a().ordinal();
                } else
                if (gcmnotification.a() == GCMNotification.Type.f)
                {
                    c(gcmnotification, context);
                    i = gcmnotification.a().ordinal();
                } else
                if (gcmnotification.a() == GCMNotification.Type.g)
                {
                    d(gcmnotification, context);
                    i = gcmnotification.a().ordinal();
                } else
                if (gcmnotification.a() == GCMNotification.Type.h)
                {
                    b(gcmnotification, context);
                } else
                {
                    HomeActivity.a(context.getApplicationContext(), 0x10000000, HomeNavigationItem.a, "notification", gcmnotification.b());
                }
                ((NotificationManager)context.getSystemService("notification")).cancel(i);
                return;
            }
            if (ApplicationForegroundController.a().c() > 0)
            {
                ((NotificationManager)context.getSystemService("notification")).cancel(i);
                return;
            }
        }
    }
}
