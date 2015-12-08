// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.appboy.e;

import android.app.AlarmManager;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Bundle;
import android.os.PowerManager;
import android.os.SystemClock;
import com.appboy.AppboyAdmReceiver;
import com.appboy.AppboyGcmReceiver;
import com.appboy.a;
import com.appboy.a.b;
import com.appboy.d;
import com.appboy.f.c;
import com.appboy.h;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.appboy.e:
//            b, d

public class e
{

    private static final String a;

    public e()
    {
    }

    public static int a(b b1, android.support.v4.app.NotificationCompat.Builder builder)
    {
        int j = b1.i();
        int i = j;
        if (j == 0)
        {
            i = b1.m();
        }
        builder.setSmallIcon(i);
        return i;
    }

    public static Bundle a(Bundle bundle)
    {
        if (bundle == null)
        {
            return null;
        }
        if (!d.b.booleanValue())
        {
            return a(a(bundle, "extra", "{}"));
        } else
        {
            return new Bundle(bundle);
        }
    }

    private static Bundle a(String s)
    {
        Bundle bundle;
        try
        {
            bundle = new Bundle();
            s = new JSONObject(s);
            String s1;
            for (Iterator iterator = s.keys(); iterator.hasNext(); bundle.putString(s1, s.getString(s1)))
            {
                s1 = (String)iterator.next();
            }

        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            String.format("Unable parse JSON into a bundle.", new Object[0]);
            return null;
        }
        return bundle;
    }

    public static h a()
    {
        h h1 = com.appboy.a.g();
        Object obj = h1;
        if (h1 == null)
        {
            obj = com.appboy.e.b.a();
        }
        return ((h) (obj));
    }

    static String a(Resources resources, int i, String s)
    {
        try
        {
            resources = resources.getString(i);
        }
        // Misplaced declaration of an exception variable
        catch (Resources resources)
        {
            return s;
        }
        return resources;
    }

    public static String a(Bundle bundle, String s, String s1)
    {
        if (android.os.Build.VERSION.SDK_INT >= 12)
        {
            s1 = bundle.getString(s, s1);
        } else
        {
            bundle = bundle.getString(s);
            if (bundle != null)
            {
                return bundle;
            }
        }
        return s1;
    }

    public static void a(Context context, int i)
    {
        try
        {
            Intent intent = (new Intent("com.appboy.action.CANCEL_NOTIFICATION")).setClass(context, b());
            intent.putExtra("nid", i);
            context.sendBroadcast(intent);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            return;
        }
    }

    public static void a(Context context, Intent intent)
    {
        String s;
        try
        {
            s = intent.getStringExtra("cid");
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            return;
        }
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_50;
        }
        String.format((new StringBuilder("Logging push click to Appboy. Campaign Id: ")).append(s).toString(), new Object[0]);
        com.appboy.a.a(context).b(s);
_L2:
        c(context, intent);
        return;
        String.format("No campaign Id associated with this notification. Not logging push click to Appboy.", new Object[0]);
        if (true) goto _L2; else goto _L1
_L1:
    }

    public static void a(Context context, Bundle bundle)
    {
        Intent intent = new Intent((new StringBuilder()).append(context.getPackageName()).append(".intent.APPBOY_PUSH_RECEIVED").toString());
        if (bundle != null)
        {
            intent.putExtras(bundle);
        }
        context.sendBroadcast(intent);
    }

    public static void a(Context context, android.support.v4.app.NotificationCompat.Builder builder, Bundle bundle)
    {
        Intent intent;
        try
        {
            intent = (new Intent("com.appboy.action.APPBOY_PUSH_CLICKED")).setClass(context, b());
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            return;
        }
        if (bundle == null)
        {
            break MISSING_BLOCK_LABEL_27;
        }
        intent.putExtras(bundle);
        builder.setContentIntent(PendingIntent.getBroadcast(context, com.appboy.f.b.a(), intent, 0x40000000));
        return;
    }

    public static void a(Context context, android.support.v4.app.NotificationCompat.Builder builder, Bundle bundle, Bundle bundle1)
    {
        if (android.os.Build.VERSION.SDK_INT >= 16 && bundle != null)
        {
            builder.setStyle(com.appboy.e.d.a(context, bundle, bundle1));
        }
    }

    public static void a(Context context, b b1, android.support.v4.app.NotificationCompat.Builder builder)
    {
        int i;
        if (android.os.Build.VERSION.SDK_INT <= 11)
        {
            break MISSING_BLOCK_LABEL_30;
        }
        i = b1.j();
        if (i == 0)
        {
            break MISSING_BLOCK_LABEL_30;
        }
        builder.setLargeIcon(BitmapFactory.decodeResource(context.getResources(), i));
        return;
        context;
    }

    public static void a(Context context, b b1, android.support.v4.app.NotificationCompat.Builder builder, Bundle bundle)
    {
        if (android.os.Build.VERSION.SDK_INT >= 21 && bundle != null && bundle.containsKey("ab_pn"))
        {
            bundle = a(bundle.getString("ab_pn"));
            context = new android.support.v4.app.NotificationCompat.Builder(context);
            b(context, bundle);
            a(((android.support.v4.app.NotificationCompat.Builder) (context)), bundle);
            e(context, bundle);
            a(b1, ((android.support.v4.app.NotificationCompat.Builder) (context)));
            a(b1, ((android.support.v4.app.NotificationCompat.Builder) (context)), bundle);
            builder.setPublicVersion(context.build());
        }
    }

    public static void a(Context context, Class class1, int i, int j)
    {
        class1 = new Intent(context, class1);
        class1.setAction("com.appboy.action.CANCEL_NOTIFICATION");
        class1.putExtra("nid", i);
        class1 = PendingIntent.getBroadcast(context, 0, class1, 0x8000000);
        context = (AlarmManager)context.getSystemService("alarm");
        if (j >= 1000)
        {
            context.set(3, SystemClock.elapsedRealtime() + (long)j, class1);
        }
    }

    public static void a(android.support.v4.app.NotificationCompat.Builder builder, Bundle bundle)
    {
        if (bundle != null)
        {
            builder.setContentTitle(bundle.getString("t"));
        }
    }

    public static void a(b b1, android.support.v4.app.NotificationCompat.Builder builder, Bundle bundle)
    {
label0:
        {
            if (android.os.Build.VERSION.SDK_INT >= 21)
            {
                if (bundle == null || !bundle.containsKey("ac"))
                {
                    break label0;
                }
                builder.setColor((int)Long.parseLong(bundle.getString("ac")));
            }
            return;
        }
        builder.setColor(b1.getIntValue("com_appboy_default_notification_accent_color", 0));
    }

    public static boolean a(Intent intent)
    {
        intent = intent.getExtras();
        return intent != null && "true".equals(intent.getString("_ab"));
    }

    public static int b(Bundle bundle)
    {
        if (bundle != null)
        {
            if (bundle.containsKey("n"))
            {
                int i;
                try
                {
                    i = Integer.parseInt(bundle.getString("n"));
                    String.format((new StringBuilder("Using notification id provided in the message's extras bundle: ")).append(i).toString(), new Object[0]);
                }
                // Misplaced declaration of an exception variable
                catch (Bundle bundle)
                {
                    String.format("Unable to parse notification id provided in the message's extras bundle. Using default notification id instead: -1", new Object[0]);
                    return -1;
                }
                return i;
            } else
            {
                int j = (new StringBuilder()).append(a(bundle, "t", "")).append(a(bundle, "a", "")).toString().hashCode();
                String.format((new StringBuilder("Message without notification id provided in the extras bundle received.  Using a hash of the message: ")).append(j).toString(), new Object[0]);
                return j;
            }
        } else
        {
            String.format("Message without extras bundle received.  Using default notification id: -1", new Object[0]);
            return -1;
        }
    }

    public static Class b()
    {
        if (d.b.booleanValue())
        {
            return com/appboy/AppboyAdmReceiver;
        } else
        {
            return com/appboy/AppboyGcmReceiver;
        }
    }

    public static void b(Context context, Intent intent)
    {
        try
        {
            if (intent.hasExtra("nid"))
            {
                int i = intent.getIntExtra("nid", -1);
                ((NotificationManager)context.getSystemService("notification")).cancel("appboy_notification", i);
            }
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            return;
        }
    }

    public static void b(android.support.v4.app.NotificationCompat.Builder builder, Bundle bundle)
    {
        if (bundle != null)
        {
            builder.setContentText(bundle.getString("a"));
        }
    }

    public static boolean b(Context context, Bundle bundle)
    {
        while (!com.appboy.f.d.a(context, "android.permission.WAKE_LOCK") || android.os.Build.VERSION.SDK_INT >= 16 && d(bundle) == -2) 
        {
            return false;
        }
        context = ((PowerManager)context.getSystemService("power")).newWakeLock(0x1000001a, a);
        context.acquire();
        context.release();
        return true;
    }

    public static boolean b(Intent intent)
    {
        intent = intent.getExtras();
        return intent != null && intent.containsKey("t") && intent.containsKey("a");
    }

    static void c(Context context, Intent intent)
    {
        Intent intent1 = new Intent((new StringBuilder()).append(com.appboy.f.c.a(context)).append(".intent.APPBOY_NOTIFICATION_OPENED").toString());
        if (intent.getExtras() != null)
        {
            intent1.putExtras(intent.getExtras());
        }
        context.sendBroadcast(intent1);
    }

    public static void c(android.support.v4.app.NotificationCompat.Builder builder, Bundle bundle)
    {
        if (bundle != null)
        {
            builder.setTicker(bundle.getString("t"));
        }
    }

    public static boolean c(Bundle bundle)
    {
        if (bundle != null)
        {
            if (bundle.containsKey("appboy_uninstall_tracking"))
            {
                return true;
            }
            bundle = bundle.getBundle("extra");
            if (bundle != null)
            {
                return bundle.containsKey("appboy_uninstall_tracking");
            }
        }
        return false;
    }

    private static int d(Bundle bundle)
    {
        boolean flag = true;
        if (bundle == null || !bundle.containsKey("p")) goto _L2; else goto _L1
_L1:
        int i;
        i = Integer.parseInt(bundle.getString("p"));
        break MISSING_BLOCK_LABEL_27;
_L4:
        try
        {
            String.format("Received invalid notification priority %d", new Object[] {
                Integer.valueOf(i)
            });
        }
        // Misplaced declaration of an exception variable
        catch (Bundle bundle)
        {
            String.format("Unable to parse custom priority. Returning default priority of 0", new Object[0]);
        }
_L2:
        return 0;
        if (i < -2 || i > 2)
        {
            flag = false;
        }
        if (flag)
        {
            return i;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public static void d(android.support.v4.app.NotificationCompat.Builder builder, Bundle bundle)
    {
label0:
        {
            if (android.os.Build.VERSION.SDK_INT > 11 && bundle != null && bundle.containsKey("sd"))
            {
                bundle = bundle.getString("sd");
                if (bundle != null)
                {
                    if (!bundle.equals("d"))
                    {
                        break label0;
                    }
                    builder.setDefaults(1);
                }
            }
            return;
        }
        builder.setSound(Uri.parse(bundle));
    }

    public static void e(android.support.v4.app.NotificationCompat.Builder builder, Bundle bundle)
    {
        if (android.os.Build.VERSION.SDK_INT >= 16 && bundle != null && bundle.containsKey("s"))
        {
            bundle = bundle.getString("s");
            if (bundle != null)
            {
                builder.setSubText(bundle);
            }
        }
    }

    public static void f(android.support.v4.app.NotificationCompat.Builder builder, Bundle bundle)
    {
        if (android.os.Build.VERSION.SDK_INT >= 16 && bundle != null)
        {
            builder.setPriority(d(bundle));
        }
    }

    public static void g(android.support.v4.app.NotificationCompat.Builder builder, Bundle bundle)
    {
        if (android.os.Build.VERSION.SDK_INT >= 21 && bundle != null && bundle.containsKey("ab_ct"))
        {
            builder.setCategory(bundle.getString("ab_ct"));
        }
    }

    public static void h(android.support.v4.app.NotificationCompat.Builder builder, Bundle bundle)
    {
        boolean flag = false;
        if (android.os.Build.VERSION.SDK_INT < 21 || bundle == null || !bundle.containsKey("ab_vs"))
        {
            break MISSING_BLOCK_LABEL_89;
        }
        int i;
        try
        {
            i = Integer.parseInt(bundle.getString("ab_vs"));
        }
        // Misplaced declaration of an exception variable
        catch (android.support.v4.app.NotificationCompat.Builder builder)
        {
            return;
        }
        if (i == -1 || i == 0 || i == 1)
        {
            flag = true;
        }
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_63;
        }
        builder.setVisibility(i);
        return;
        String.format("Received invalid notification visibility %d", new Object[] {
            Integer.valueOf(i)
        });
        return;
    }

    static 
    {
        a = String.format("%s.%s", new Object[] {
            d.a, com/appboy/e/e.getName()
        });
    }
}
