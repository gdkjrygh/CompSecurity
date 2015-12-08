// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.FitbitMobile;

import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.fitbit.ApplicationForegroundController;
import com.fitbit.FitBitApplication;
import com.fitbit.data.bl.BadgesBusinessLogic;
import com.fitbit.data.bl.SyncDataForDayOperation;
import com.fitbit.data.bl.ah;
import com.fitbit.data.bl.an;
import com.fitbit.data.bl.at;
import com.fitbit.data.bl.dg;
import com.fitbit.e.a;
import com.fitbit.galileo.bluetooth.b;
import com.fitbit.mixpanel.f;
import com.fitbit.savedstate.d;
import com.google.android.gcm.GCMBaseIntentService;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Date;

// Referenced classes of package com.fitbit.FitbitMobile:
//            c, GCMNotification

public class GCMIntentService extends GCMBaseIntentService
{

    private static final String b = "GCMIntentService";

    public GCMIntentService()
    {
        super(new String[] {
            "625585532877"
        });
    }

    private static String a(String s)
    {
        com/fitbit/FitbitMobile/GCMIntentService;
        JVM INSTR monitorenter ;
        Object obj = null;
        try
        {
            MessageDigest messagedigest = MessageDigest.getInstance("MD5");
            messagedigest.reset();
            messagedigest.update(s.getBytes());
            s = a(messagedigest.digest());
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            s = obj;
        }
        finally
        {
            com/fitbit/FitbitMobile/GCMIntentService;
        }
        return s;
        throw s;
    }

    private static String a(byte abyte0[])
    {
        StringBuffer stringbuffer = new StringBuffer();
        int j = abyte0.length;
        for (int i = 0; i < j; i++)
        {
            String s1 = Integer.toHexString(abyte0[i] & 0xff);
            String s = s1;
            if (s1.length() < 2)
            {
                s = (new StringBuilder()).append("0").append(s1).toString();
            }
            stringbuffer.append(s);
        }

        return stringbuffer.toString();
    }

    private void a(Context context, GCMNotification gcmnotification, NotificationManager notificationmanager)
    {
        context = new c(context);
        context.a(gcmnotification);
        int i = gcmnotification.d();
        if (gcmnotification.a().b())
        {
            context.a(ah.a().a(gcmnotification.a()));
            i = gcmnotification.a().ordinal();
        }
        notificationmanager.notify(i, context.a());
    }

    private void a(GCMNotification gcmnotification)
    {
        if (gcmnotification == null || gcmnotification.a() == null) goto _L2; else goto _L1
_L1:
        static class _cls1
        {

            static final int a[];

            static 
            {
                a = new int[GCMNotification.Type.values().length];
                try
                {
                    a[com.fitbit.FitbitMobile.GCMNotification.Type.a.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror5) { }
                try
                {
                    a[GCMNotification.Type.c.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror4) { }
                try
                {
                    a[com.fitbit.FitbitMobile.GCMNotification.Type.d.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    a[GCMNotification.Type.e.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    a[com.fitbit.FitbitMobile.GCMNotification.Type.f.ordinal()] = 5;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[GCMNotification.Type.h.ordinal()] = 6;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        com.fitbit.FitbitMobile._cls1.a[gcmnotification.a().ordinal()];
        JVM INSTR tableswitch 1 6: default 146
    //                   1 60
    //                   2 94
    //                   3 112
    //                   4 112
    //                   5 122
    //                   6 131;
           goto _L2 _L3 _L4 _L5 _L5 _L6 _L7
_L3:
        dg.d().a(new Date(), true, null, SyncDataForDayOperation.f);
        return;
_L4:
        try
        {
            dg.d().a(true, null);
            dg.d().b(true, false, null);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (GCMNotification gcmnotification)
        {
            com.fitbit.e.a.f("GCMIntentService", "Unable to load data", gcmnotification, new Object[0]);
            return;
        }
_L5:
        dg.d().b(true, false, null);
        return;
_L6:
        dg.d().j(true, null);
        return;
_L7:
        BadgesBusinessLogic.a().b();
        dg.d().r(true, null);
        return;
_L2:
    }

    private boolean a()
    {
        com.fitbit.galileo.bluetooth.BluetoothWorker.BluetoothWorkerName bluetoothworkername = com.fitbit.galileo.bluetooth.b.a().c();
        return bluetoothworkername != com.fitbit.galileo.bluetooth.BluetoothWorker.BluetoothWorkerName.b && bluetoothworkername != com.fitbit.galileo.bluetooth.BluetoothWorker.BluetoothWorkerName.c;
    }

    protected void a(Context context, Intent intent)
    {
        if (d.j() && com.google.android.gcm.b.g(this) != null && !com.google.android.gcm.b.g(this).equals("")) goto _L2; else goto _L1
_L1:
        com.fitbit.e.a.a("GCMIntentService", String.format("Ignored push notification %s", new Object[] {
            intent
        }), new Object[0]);
_L8:
        return;
_L2:
        String s;
        com.fitbit.e.a.a("GCMIntentService", String.format("%s,%s", new Object[] {
            intent, intent.getExtras()
        }), new Object[0]);
        s = intent.getStringExtra("md5_regid");
        String s1 = a(com.google.android.gcm.b.g(context));
        if (s1 != null && s != null && !s1.equals(s))
        {
            com.fitbit.e.a.a("GCMIntentService", String.format("RegId hash didn't match. Message md5_regid=%s, local md5_regid=%s", new Object[] {
                s, s1
            }), new Object[0]);
            return;
        }
        s = null;
        if (!intent.getExtras().containsKey("msg")) goto _L4; else goto _L3
_L3:
        s = intent.getExtras().getString("msg");
_L6:
        intent = com.fitbit.FitbitMobile.GCMNotification.a(intent.getStringExtra("data"), s);
        if (intent.a() == com.fitbit.FitbitMobile.GCMNotification.Type.b)
        {
            com.fitbit.e.a.a("GCMIntentService", "An unknown notification type received", new Object[0]);
            return;
        }
        break; /* Loop/switch isn't completed */
_L4:
        if (intent.getExtras().containsKey("mp_message"))
        {
            s = intent.getStringExtra("mp_message");
        }
        if (true) goto _L6; else goto _L5
_L5:
        if (intent.c() && !an.a().g())
        {
            com.fitbit.e.a.a("GCMIntentService", "The notification requires a profile but user logged out", new Object[0]);
            return;
        }
        if (a())
        {
            com.fitbit.e.a.a("GCMIntentService", "Broadcasting notification to every listener", new Object[0]);
            a(((GCMNotification) (intent)));
            Intent intent1 = new Intent("com.fitbit.FitbitMobile.NotificationBroadcastReceiver.ACTION_NOTIFICATION_CAME");
            intent1.putExtra("com.fitbit.FitbitMobile.GCMIntentService.GCM_NOTIFICATION_KEY", intent);
            intent1.setPackage(context.getPackageName());
            context.sendBroadcast(intent1);
            com.fitbit.e.a.a("GCMIntentService", String.format("broadcasted, %s %s", new Object[] {
                intent1, intent1.getExtras()
            }), new Object[0]);
            if (ApplicationForegroundController.a().c() < 1)
            {
                com.fitbit.e.a.a("GCMIntentService", "Displaying a notification", new Object[0]);
                a(context, ((GCMNotification) (intent)), (NotificationManager)getSystemService("notification"));
                return;
            }
        }
        if (true) goto _L8; else goto _L7
_L7:
    }

    protected void a(Context context, String s)
    {
        com.fitbit.e.a.a("GCMIntentService", s, new Object[0]);
    }

    protected void b(Context context, String s)
    {
        com.fitbit.e.a.a("GCMReg", s, new Object[0]);
        f.g(s);
        startService(at.b(FitBitApplication.a()));
    }

    protected void c(Context context, String s)
    {
        com.fitbit.e.a.a("GCMIntentService", "Unregistered %s", new Object[] {
            s
        });
        f.g();
    }
}
