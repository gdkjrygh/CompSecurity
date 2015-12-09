// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.appboy.e;

import android.app.AlarmManager;
import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Bundle;
import android.os.PowerManager;
import android.os.SystemClock;
import android.support.v4.app.bi;
import com.appboy.a.b;
import com.appboy.f;
import com.appboy.f.a;
import com.appboy.i;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.appboy.e:
//            a, c

public class d
{

    private static final String a;

    public d()
    {
    }

    public static int a(b b1, bi bi1)
    {
        int j = b1.i();
        int i = j;
        if (j == 0)
        {
            com.appboy.f.a.a(a, "Small notification icon resource was not found. Will use the app icon when displaying notifications.");
            i = b1.m();
        }
        bi1.a(i);
        return i;
    }

    public static Bundle a(Bundle bundle)
    {
        if (bundle == null)
        {
            return null;
        }
        if (!f.b.booleanValue())
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
            com.appboy.f.a.c(a, String.format("Unable parse JSON into a bundle.", new Object[0]), s);
            return null;
        }
        return bundle;
    }

    public static i a()
    {
        i i = com.appboy.a.h();
        Object obj = i;
        if (i == null)
        {
            obj = com.appboy.e.a.a();
        }
        return ((i) (obj));
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

    private static String a(Bundle bundle, String s, String s1)
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

    public static void a(Context context, Bundle bundle)
    {
        Intent intent = new Intent((new StringBuilder()).append(context.getPackageName()).append(".intent.APPBOY_PUSH_RECEIVED").toString());
        if (bundle != null)
        {
            intent.putExtras(bundle);
        }
        context.sendBroadcast(intent);
    }

    public static void a(Context context, bi bi1, Bundle bundle)
    {
        Intent intent = new Intent((new StringBuilder()).append(context.getPackageName()).append(".intent.APPBOY_NOTIFICATION_OPENED").toString());
        if (bundle != null)
        {
            intent.putExtras(bundle);
        }
        bi1.a(PendingIntent.getBroadcast(context, com.appboy.f.b.a(), intent, 0x40000000));
    }

    public static void a(Context context, bi bi1, Bundle bundle, Bundle bundle1)
    {
        if (android.os.Build.VERSION.SDK_INT >= 16 && bundle != null)
        {
            bi1.a(com.appboy.e.c.a(context, bundle, bundle1));
        }
    }

    public static void a(Context context, b b1, bi bi1)
    {
        int i;
        if (android.os.Build.VERSION.SDK_INT <= 11)
        {
            break MISSING_BLOCK_LABEL_29;
        }
        i = b1.j();
        if (i == 0)
        {
            break MISSING_BLOCK_LABEL_29;
        }
        bi1.g = BitmapFactory.decodeResource(context.getResources(), i);
        return;
        context;
        com.appboy.f.a.c(a, "Error setting large notification icon", context);
        return;
    }

    public static void a(Context context, b b1, bi bi1, Bundle bundle)
    {
        if (android.os.Build.VERSION.SDK_INT >= 21 && bundle != null && bundle.containsKey("ab_pn"))
        {
            bundle = a(bundle.getString("ab_pn"));
            context = new bi(context);
            b(context, bundle);
            a(((bi) (context)), bundle);
            e(context, bundle);
            a(b1, ((bi) (context)));
            a(b1, ((bi) (context)), bundle);
            bi1.a(context.b());
        }
    }

    public static void a(Context context, Class class1, int i, int j)
    {
        class1 = new Intent(context, class1);
        class1.setAction("com.appboy.action.CANCEL_NOTIFICATION");
        class1.putExtra("appboy_cancel_notification", i);
        class1 = PendingIntent.getBroadcast(context, 0, class1, 0x8000000);
        context = (AlarmManager)context.getSystemService("alarm");
        if (j >= 1000)
        {
            context.set(3, SystemClock.elapsedRealtime() + (long)j, class1);
        }
    }

    public static void a(bi bi1, Bundle bundle)
    {
        if (bundle != null)
        {
            bi1.a(bundle.getString("t"));
        }
    }

    public static void a(b b1, bi bi1, Bundle bundle)
    {
label0:
        {
            if (android.os.Build.VERSION.SDK_INT >= 21)
            {
                if (bundle == null || !bundle.containsKey("ac"))
                {
                    break label0;
                }
                bi1.d((int)Long.parseLong(bundle.getString("ac")));
            }
            return;
        }
        bi1.d(b1.a("com_appboy_default_notification_accent_color", 0));
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
                    com.appboy.f.a.a(a, String.format((new StringBuilder("Using notification id provided in the message's extras bundle: ")).append(i).toString(), new Object[0]));
                }
                // Misplaced declaration of an exception variable
                catch (Bundle bundle)
                {
                    com.appboy.f.a.c(a, String.format("Unable to parse notification id provided in the message's extras bundle. Using default notification id instead: -1", new Object[0]), bundle);
                    return -1;
                }
                return i;
            } else
            {
                int j = (new StringBuilder()).append(a(bundle, "t", "")).append(a(bundle, "a", "")).toString().hashCode();
                com.appboy.f.a.a(a, String.format((new StringBuilder("Message without notification id provided in the extras bundle received.  Using a hash of the message: ")).append(j).toString(), new Object[0]));
                return j;
            }
        } else
        {
            com.appboy.f.a.a(a, String.format("Message without extras bundle received.  Using default notification id: -1", new Object[0]));
            return -1;
        }
    }

    public static void b(bi bi1, Bundle bundle)
    {
        if (bundle != null)
        {
            bi1.b(bundle.getString("a"));
        }
    }

    public static boolean b(Context context, Bundle bundle)
    {
        while (context.checkCallingOrSelfPermission("android.permission.WAKE_LOCK") == -1 || android.os.Build.VERSION.SDK_INT >= 16 && c(bundle) == -2) 
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

    private static int c(Bundle bundle)
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
            com.appboy.f.a.d(a, String.format("Received invalid notification priority %d", new Object[] {
                Integer.valueOf(i)
            }));
        }
        // Misplaced declaration of an exception variable
        catch (Bundle bundle)
        {
            com.appboy.f.a.c(a, String.format("Unable to parse custom priority. Returning default priority of 0", new Object[0]), bundle);
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

    public static void c(bi bi1, Bundle bundle)
    {
        if (bundle != null)
        {
            bi1.d(bundle.getString("t"));
        }
    }

    public static void d(bi bi1, Bundle bundle)
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
                    bi1.b(1);
                }
            }
            return;
        }
        bundle = Uri.parse(bundle);
        bi1.B.sound = bundle;
        bi1.B.audioStreamType = -1;
    }

    public static void e(bi bi1, Bundle bundle)
    {
        if (android.os.Build.VERSION.SDK_INT >= 16 && bundle != null && bundle.containsKey("s"))
        {
            bundle = bundle.getString("s");
            if (bundle != null)
            {
                bi1.c(bundle);
            }
        }
    }

    public static void f(bi bi1, Bundle bundle)
    {
        if (android.os.Build.VERSION.SDK_INT >= 16 && bundle != null)
        {
            bi1.c(c(bundle));
        }
    }

    public static void g(bi bi1, Bundle bundle)
    {
        if (android.os.Build.VERSION.SDK_INT >= 21 && bundle != null && bundle.containsKey("ab_ct"))
        {
            bi1.a(bundle.getString("ab_ct"));
        }
    }

    public static void h(bi bi1, Bundle bundle)
    {
        boolean flag;
        flag = false;
        if (android.os.Build.VERSION.SDK_INT < 21 || bundle == null || !bundle.containsKey("ab_vs"))
        {
            break MISSING_BLOCK_LABEL_106;
        }
        int i = Integer.parseInt(bundle.getString("ab_vs"));
        if (i == -1 || i == 0 || i == 1)
        {
            flag = true;
        }
        if (flag)
        {
            try
            {
                bi1.e(i);
                return;
            }
            // Misplaced declaration of an exception variable
            catch (bi bi1)
            {
                com.appboy.f.a.c(a, "Failed to parse visibility from notificationExtras", bi1);
            }
            break MISSING_BLOCK_LABEL_100;
        }
        com.appboy.f.a.d(a, String.format("Received invalid notification visibility %d", new Object[] {
            Integer.valueOf(i)
        }));
        return;
        return;
    }

    static 
    {
        a = String.format("%s.%s", new Object[] {
            f.a, com/appboy/e/d.getName()
        });
    }
}
