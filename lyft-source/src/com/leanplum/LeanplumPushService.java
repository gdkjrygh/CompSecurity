// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.leanplum;

import android.app.IntentService;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.os.Bundle;
import android.util.Log;
import com.leanplum.callbacks.VariablesChangedCallback;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

// Referenced classes of package com.leanplum:
//            Leanplum, g, Q, GcmBroadcastReceiver, 
//            Util, LeanplumPushNotificationCustomizer, LeanplumActivityHelper, P

public class LeanplumPushService extends IntentService
{

    public static final String LEANPLUM_SENDER_ID = "44059457771";
    private static LeanplumPushNotificationCustomizer a;
    private static String b;

    public LeanplumPushService()
    {
        super("LeanplumPushService");
    }

    private static int a(Context context)
    {
        int i;
        try
        {
            i = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            throw new RuntimeException((new StringBuilder("Could not get package name: ")).append(context).toString());
        }
        return i;
    }

    static Class a()
    {
        return null;
    }

    static void a(Context context, String s)
    {
        Leanplum.a(s);
        context = context.getApplicationContext();
        SharedPreferences sharedpreferences = b(context);
        int i = a(context);
        if (g.m)
        {
            Log.i("Leanplum", (new StringBuilder("Saving GCM registration on app version ")).append(i).toString());
        }
        context = sharedpreferences.edit();
        context.putString("registration_id", s);
        context.putInt("appVersion", i);
        try
        {
            context.apply();
        }
        catch (NoSuchMethodError nosuchmethoderror)
        {
            context.commit();
        }
        Log.i("Leanplum", (new StringBuilder("Device registered for push notifications with registrationId ")).append(s).toString());
    }

    static void a(LeanplumPushService leanplumpushservice, Bundle bundle)
    {
        leanplumpushservice.c(bundle);
    }

    static void a(String s, VariablesChangedCallback variableschangedcallback)
    {
        Leanplum.addOnceVariablesChangedAndNoDownloadsPendingHandler(new Q(s, variableschangedcallback));
    }

    static boolean a(Bundle bundle)
    {
        return bundle.containsKey("_lpx");
    }

    private static boolean a(String s)
    {
        Context context = Leanplum.a();
        String s1 = com/leanplum/GcmBroadcastReceiver.getName();
        Iterator iterator = context.getPackageManager().queryBroadcastReceivers(new Intent(s), 0).iterator();
        ResolveInfo resolveinfo;
        do
        {
            if (!iterator.hasNext())
            {
                Log.e("Leanplum", (new StringBuilder("Push notifications requires you to add the receiver ")).append(s1).append(" to your AndroidManifest.xml file with the ").append(s).append(" intent filter. Add this code within the <application> section:\n<receiver android:name=\"").append(s1).append("\"\n    android:permission=\"com.google.android.c2dm.permission.SEND\">\n").append("    <intent-filter>\n        <action android:name=\"").append("com.google.android.c2dm.intent.RECEIVE\" />\n").append("        <action android:name=\"com.google.android.c2dm.intent.REGISTRATION").append("\" />\n        <category android:name=\"").append(context.getPackageName()).append("\" />\n    </intent-filter>\n").append("</receiver>").toString());
                return false;
            }
            resolveinfo = (ResolveInfo)iterator.next();
        } while (!resolveinfo.activityInfo.name.equals(s1) || !resolveinfo.activityInfo.packageName.equals(context.getPackageName()));
        return true;
    }

    private static boolean a(String s, boolean flag, boolean flag1)
    {
        if (Leanplum.a().checkCallingOrSelfPermission(s) != 0)
        {
            String s1;
            if (flag)
            {
                s1 = (new StringBuilder("<permission android:name=\"")).append(s).append("\" android:protectionLevel=\"signature\" />\n").toString();
            } else
            {
                s1 = "";
            }
            if (flag1)
            {
                Log.e("Leanplum", (new StringBuilder("In order to use push notifications, you need to enable the ")).append(s).append(" permission in your AndroidManifest.xml file. Add this within the <manifest> section:\n").append(s1).append("<uses-permission android:name=\"").append(s).append("\" />").toString());
            }
            return false;
        } else
        {
            return true;
        }
    }

    private static SharedPreferences b(Context context)
    {
        return context.getSharedPreferences("__leanplum_push__", 0);
    }

    static String b(Bundle bundle)
    {
        String s1 = bundle.getString("_lpm");
        String s = s1;
        if (s1 == null)
        {
            String s2 = bundle.getString("_lpu");
            s = s2;
            if (s2 == null)
            {
                String s3 = bundle.getString("_lpn");
                s = s3;
                if (s3 == null)
                {
                    s = bundle.getString("_lpv");
                }
            }
        }
        if (s != null)
        {
            bundle.putString("lp_messageId", s);
        }
        return s;
    }

    static void b()
    {
        if (!Util.i()) goto _L2; else goto _L1
_L1:
        Object obj = Leanplum.a();
        if (b == null || !a("com.google.android.c2dm.permission.RECEIVE", false, true) || !a((new StringBuilder(String.valueOf(((Context) (obj)).getPackageName()))).append(".gcm.permission.C2D_MESSAGE").toString(), true, false) && !a((new StringBuilder(String.valueOf(((Context) (obj)).getPackageName()))).append(".permission.C2D_MESSAGE").toString(), true, true) || !a("com.google.android.c2dm.intent.RECEIVE") || !a("com.google.android.c2dm.intent.REGISTRATION")) goto _L4; else goto _L3
_L3:
        if (!c())
        {
            return;
        }
        Context context;
        SharedPreferences sharedpreferences;
        String s;
        context = ((Context) (obj)).getApplicationContext();
        sharedpreferences = b(context);
        obj = sharedpreferences.getString("registration_id", "");
        s = sharedpreferences.getString("sender_ids", "");
        if (((String) (obj)).length() != 0) goto _L6; else goto _L5
_L5:
        Log.i("Leanplum", "GCM registration not found.");
        obj = "";
_L7:
        try
        {
            if (((String) (obj)).length() == 0)
            {
                obj = new Intent("com.google.android.c2dm.intent.REGISTER");
                context = Leanplum.a();
                ((Intent) (obj)).putExtra("app", PendingIntent.getBroadcast(context, 0, new Intent(), 0));
                ((Intent) (obj)).putExtra("sender", b);
                ((Intent) (obj)).setPackage("com.google.android.gms");
                context.startService(((Intent) (obj)));
                return;
            }
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            Log.e("Leanplum", "There was an error registering for push notifications.", ((Throwable) (obj)));
            return;
        }
        break; /* Loop/switch isn't completed */
_L6:
        if (!s.equals(b))
        {
            break MISSING_BLOCK_LABEL_272;
        }
        Log.i("Leanplum", "GCM sender IDs have changed.");
        obj = "";
        continue; /* Loop/switch isn't completed */
        if (sharedpreferences.getInt("appVersion", 0x80000000) != a(context))
        {
            obj = "";
        }
        if (true) goto _L7; else goto _L4
_L2:
        Log.i("Leanplum", "No valid Google Play Services APK found.");
_L4:
    }

    private void c(Bundle bundle)
    {
        Object obj1;
        int i;
        NotificationManager notificationmanager = (NotificationManager)getSystemService("notification");
        Object obj = new Intent(this, com/leanplum/GcmBroadcastReceiver);
        ((Intent) (obj)).addCategory("lpAction");
        ((Intent) (obj)).putExtras(bundle);
        obj1 = PendingIntent.getBroadcast(getApplicationContext(), (new Random()).nextInt(), ((Intent) (obj)), 0);
        obj = getApplicationContext();
        i = ((Context) (obj)).getApplicationInfo().labelRes;
        if (i == 0)
        {
            obj = ((Context) (obj)).getApplicationInfo().loadLabel(((Context) (obj)).getPackageManager()).toString();
        } else
        {
            obj = ((Context) (obj)).getString(i);
        }
        if (bundle.getString("title") != null)
        {
            obj = bundle.getString("title");
        }
        obj = (new android.support.v4.app.NotificationCompat.Builder(this)).setSmallIcon(getApplicationInfo().icon).setContentTitle(((CharSequence) (obj))).setStyle((new android.support.v4.app.NotificationCompat.BigTextStyle()).bigText(bundle.getString("lp_message"))).setContentText(bundle.getString("lp_message"));
        ((android.support.v4.app.NotificationCompat.Builder) (obj)).setAutoCancel(true);
        ((android.support.v4.app.NotificationCompat.Builder) (obj)).setContentIntent(((PendingIntent) (obj1)));
        if (a != null)
        {
            a.customize(((android.support.v4.app.NotificationCompat.Builder) (obj)), bundle);
        }
        obj1 = bundle.get("lp_notificationId");
        if (!(obj1 instanceof Number)) goto _L2; else goto _L1
_L1:
        i = ((Number)obj1).intValue();
_L4:
        notificationmanager.notify(i, ((android.support.v4.app.NotificationCompat.Builder) (obj)).build());
        return;
_L2:
        if (obj1 instanceof String)
        {
            try
            {
                i = Integer.parseInt((String)obj1);
                continue; /* Loop/switch isn't completed */
            }
            // Misplaced declaration of an exception variable
            catch (Bundle bundle) { }
        } else
        if (bundle.containsKey("lp_messageId"))
        {
            i = bundle.getString("lp_messageId").hashCode();
            continue; /* Loop/switch isn't completed */
        }
        i = 1;
        if (true) goto _L4; else goto _L3
_L3:
    }

    private static boolean c()
    {
        String s = com/leanplum/LeanplumPushService.getName();
        Context context = Leanplum.a();
        try
        {
            context.getPackageManager().getServiceInfo(new ComponentName(context.getPackageName(), s), 0);
        }
        catch (android.content.pm.PackageManager.NameNotFoundException namenotfoundexception)
        {
            Log.e("Leanplum", (new StringBuilder("Push notifications requires you to add the following service to your AndroidManifest.xml file within the <application> section:\n<service android:name=\"")).append(s).append("\" />").toString());
            return false;
        }
        return true;
    }

    public static void setCustomizer(LeanplumPushNotificationCustomizer leanplumpushnotificationcustomizer)
    {
        a = leanplumpushnotificationcustomizer;
    }

    public static void setGcmSenderId(String s)
    {
        b = s;
    }

    public static transient void setGcmSenderIds(String as[])
    {
        StringBuffer stringbuffer = new StringBuffer();
        int j = as.length;
        int i = 0;
        do
        {
            if (i >= j)
            {
                b = stringbuffer.toString();
                return;
            }
            String s = as[i];
            if (stringbuffer.length() > 0)
            {
                stringbuffer.append(',');
            }
            stringbuffer.append(s);
            i++;
        } while (true);
    }

    public static void unregister()
    {
        Intent intent = new Intent("com.google.android.c2dm.intent.UNREGISTER");
        Context context = Leanplum.a();
        intent.putExtra("app", PendingIntent.getBroadcast(context, 0, new Intent(), 0));
        intent.setPackage("com.google.android.gms");
        context.startService(intent);
    }

    protected void onHandleIntent(Intent intent)
    {
        Bundle bundle = intent.getExtras();
        String s;
        if (!"com.google.android.c2dm.intent.RECEIVE".equals(intent.getAction()))
        {
            s = null;
        } else
        {
            String s1 = intent.getStringExtra("message_type");
            s = s1;
            if (s1 == null)
            {
                s = "gcm";
            }
        }
        if (!bundle.isEmpty() && (s == null || "gcm".equals(s)))
        {
            if (bundle.containsKey("lp_message") && (!bundle.containsKey("_lpu") && !bundle.containsKey("_lpv") || LeanplumActivityHelper.b == null || LeanplumActivityHelper.a))
            {
                s = b(bundle);
                if (s == null)
                {
                    c(bundle);
                } else
                if (!Leanplum.a)
                {
                    c(bundle);
                } else
                {
                    P p = new P(this, s, bundle);
                    if (bundle.containsKey("_lpx"))
                    {
                        p.variablesChanged();
                    } else
                    {
                        a(s, p);
                    }
                }
            }
            Log.i("Leanplum", (new StringBuilder("Received: ")).append(bundle.toString()).toString());
        }
        GcmBroadcastReceiver.completeWakefulIntent(intent);
    }
}
