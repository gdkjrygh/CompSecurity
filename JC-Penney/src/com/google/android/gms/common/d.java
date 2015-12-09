// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageInstaller;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.text.TextUtils;
import android.util.Log;
import android.util.TypedValue;
import com.google.android.gms.b;
import com.google.android.gms.common.internal.a;
import com.google.android.gms.common.internal.p;
import com.google.android.gms.common.internal.q;
import com.google.android.gms.d.o;
import com.google.android.gms.d.t;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

// Referenced classes of package com.google.android.gms.common:
//            kb, eq, h, b, 
//            c

public final class d
{

    public static final int a = a();
    public static boolean b = false;
    public static boolean c = false;
    static final AtomicBoolean d = new AtomicBoolean();
    private static int e = -1;
    private static final Object f = new Object();
    private static String g = null;
    private static Integer h = null;

    private static int a()
    {
        return 0x7877d8;
    }

    public static int a(Context context)
    {
        Object obj;
        PackageManager packagemanager;
        if (a.a)
        {
            return 0;
        }
        packagemanager = context.getPackageManager();
        kb kb1;
        try
        {
            context.getResources().getString(b.common_google_play_services_unknown_issue);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            Log.e("GooglePlayServicesUtil", "The Google Play services resources were not found. Check your project configuration to ensure that the resources are included.");
        }
        if (!"com.google.android.gms".equals(context.getPackageName()))
        {
            e(context);
        }
        try
        {
            obj = packagemanager.getPackageInfo("com.google.android.gms", 64);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            Log.w("GooglePlayServicesUtil", "Google Play services is missing.");
            return 1;
        }
        kb1 = com.google.android.gms.common.kb.a();
        if (o.c(((PackageInfo) (obj)).versionCode) || o.a(context))
        {
            if (kb1.a(((PackageInfo) (obj)), com.google.android.gms.common.eq.a) == null)
            {
                Log.w("GooglePlayServicesUtil", "Google Play services signature invalid.");
                return 9;
            }
            break MISSING_BLOCK_LABEL_228;
        }
        Object obj1;
        try
        {
            obj1 = kb1.a(packagemanager.getPackageInfo("com.android.vending", 64), com.google.android.gms.common.eq.a);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj1)
        {
            if (a(context, "com.android.vending"))
            {
                Log.w("GooglePlayServicesUtil", "Google Play Store is updating.");
                if (kb1.a(((PackageInfo) (obj)), com.google.android.gms.common.eq.a) == null)
                {
                    Log.w("GooglePlayServicesUtil", "Google Play services signature invalid.");
                    return 9;
                }
            } else
            {
                Log.w("GooglePlayServicesUtil", "Google Play Store is neither installed nor updating.");
                return 9;
            }
            break MISSING_BLOCK_LABEL_228;
        }
        if (obj1 != null)
        {
            break MISSING_BLOCK_LABEL_189;
        }
        Log.w("GooglePlayServicesUtil", "Google Play Store signature invalid.");
        return 9;
        if (kb1.a(((PackageInfo) (obj)), new h[] {
    obj1
}) != null)
        {
            break MISSING_BLOCK_LABEL_228;
        }
        Log.w("GooglePlayServicesUtil", "Google Play services signature invalid.");
        return 9;
        int i = o.a(a);
        if (o.a(((PackageInfo) (obj)).versionCode) < i)
        {
            Log.w("GooglePlayServicesUtil", (new StringBuilder()).append("Google Play services out of date.  Requires ").append(a).append(" but found ").append(((PackageInfo) (obj)).versionCode).toString());
            return 2;
        }
        obj = ((PackageInfo) (obj)).applicationInfo;
        context = ((Context) (obj));
        if (obj == null)
        {
            try
            {
                context = packagemanager.getApplicationInfo("com.google.android.gms", 0);
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                Log.wtf("GooglePlayServicesUtil", "Google Play services missing when getting application info.");
                context.printStackTrace();
                return 1;
            }
        }
        return ((ApplicationInfo) (context)).enabled ? 0 : 3;
    }

    public static Dialog a(int i, Activity activity, int j)
    {
        return a(i, activity, j, null);
    }

    public static Dialog a(int i, Activity activity, int j, android.content.DialogInterface.OnCancelListener oncancellistener)
    {
        return a(i, activity, null, j, oncancellistener);
    }

    private static Dialog a(int i, Activity activity, Fragment fragment, int j, android.content.DialogInterface.OnCancelListener oncancellistener)
    {
        android.app.AlertDialog.Builder builder1 = null;
        if (i == 0)
        {
            return null;
        }
        int k = i;
        if (o.a(activity))
        {
            k = i;
            if (i == 2)
            {
                k = 42;
            }
        }
        android.app.AlertDialog.Builder builder = builder1;
        if (t.c())
        {
            TypedValue typedvalue = new TypedValue();
            activity.getTheme().resolveAttribute(0x1010309, typedvalue, true);
            builder = builder1;
            if ("Theme.Dialog.Alert".equals(activity.getResources().getResourceEntryName(typedvalue.resourceId)))
            {
                builder = new android.app.AlertDialog.Builder(activity, 5);
            }
        }
        builder1 = builder;
        if (builder == null)
        {
            builder1 = new android.app.AlertDialog.Builder(activity);
        }
        builder1.setMessage(com.google.android.gms.common.internal.o.a(activity, k, d(activity)));
        if (oncancellistener != null)
        {
            builder1.setOnCancelListener(oncancellistener);
        }
        oncancellistener = a(k);
        if (fragment == null)
        {
            fragment = new p(activity, oncancellistener, j);
        } else
        {
            fragment = new p(fragment, oncancellistener, j);
        }
        oncancellistener = com.google.android.gms.common.internal.o.b(activity, k);
        if (oncancellistener != null)
        {
            builder1.setPositiveButton(oncancellistener, fragment);
        }
        activity = com.google.android.gms.common.internal.o.a(activity, k);
        if (activity != null)
        {
            builder1.setTitle(activity);
        }
        return builder1.create();
    }

    public static Intent a(int i)
    {
        switch (i)
        {
        default:
            return null;

        case 1: // '\001'
        case 2: // '\002'
            return q.b("com.google.android.gms");

        case 42: // '*'
            return q.a();

        case 3: // '\003'
            return q.a("com.google.android.gms");
        }
    }

    public static boolean a(Context context, int i)
    {
        if (i == 18)
        {
            return true;
        }
        if (i == 1)
        {
            return a(context, "com.google.android.gms");
        } else
        {
            return false;
        }
    }

    public static boolean a(Context context, String s)
    {
        if (t.f())
        {
            context = context.getPackageManager().getPackageInstaller().getAllSessions().iterator();
            do
            {
                if (!context.hasNext())
                {
                    break MISSING_BLOCK_LABEL_76;
                }
            } while (!s.equals(((android.content.pm.PackageInstaller.SessionInfo)context.next()).getAppPackageName()));
            return true;
        }
        context = context.getPackageManager();
        boolean flag = context.getApplicationInfo(s, 8192).enabled;
        if (flag)
        {
            return true;
        }
        break MISSING_BLOCK_LABEL_76;
        context;
        return false;
    }

    public static void b(Context context)
    {
        int i = a(context);
        if (i != 0)
        {
            context = a(i);
            Log.e("GooglePlayServicesUtil", (new StringBuilder()).append("GooglePlayServices not available due to error ").append(i).toString());
            if (context == null)
            {
                throw new com.google.android.gms.common.b(i);
            } else
            {
                throw new c(i, "Google Play Services not available", context);
            }
        } else
        {
            return;
        }
    }

    public static Context c(Context context)
    {
        try
        {
            context = context.createPackageContext("com.google.android.gms", 3);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            return null;
        }
        return context;
    }

    public static String d(Context context)
    {
        String s1 = context.getApplicationInfo().name;
        String s = s1;
        if (TextUtils.isEmpty(s1))
        {
            s = context.getPackageName();
            PackageManager packagemanager = context.getApplicationContext().getPackageManager();
            try
            {
                context = packagemanager.getApplicationInfo(context.getPackageName(), 0);
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                context = null;
            }
            if (context != null)
            {
                s = packagemanager.getApplicationLabel(context).toString();
            }
        }
        return s;
    }

    private static void e(Context context)
    {
        Object obj = f;
        obj;
        JVM INSTR monitorenter ;
        if (g != null) goto _L2; else goto _L1
_L1:
        g = context.getPackageName();
        context = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
        if (context == null) goto _L4; else goto _L3
_L3:
        h = Integer.valueOf(context.getInt("com.google.android.gms.version"));
_L5:
        context = h;
        obj;
        JVM INSTR monitorexit ;
        if (context == null)
        {
            throw new IllegalStateException("A required meta-data tag in your app's AndroidManifest.xml does not exist.  You must have the following declaration within the <application> element:     <meta-data android:name=\"com.google.android.gms.version\" android:value=\"@integer/google_play_services_version\" />");
        }
        break MISSING_BLOCK_LABEL_163;
_L4:
        h = null;
          goto _L5
        context;
        Log.wtf("GooglePlayServicesUtil", "This should never happen.", context);
          goto _L5
        context;
        obj;
        JVM INSTR monitorexit ;
        throw context;
_L2:
        if (g.equals(context.getPackageName())) goto _L5; else goto _L6
_L6:
        throw new IllegalArgumentException((new StringBuilder()).append("isGooglePlayServicesAvailable should only be called with Context from your application's package. A previous call used package '").append(g).append("' and this call used package '").append(context.getPackageName()).append("'.").toString());
        if (context.intValue() != a)
        {
            throw new IllegalStateException((new StringBuilder()).append("The meta-data tag in your app's AndroidManifest.xml does not have the right value.  Expected ").append(a).append(" but").append(" found ").append(context).append(".  You must have the").append(" following declaration within the <application> element: ").append("    <meta-data android:name=\"").append("com.google.android.gms.version").append("\" android:value=\"@integer/google_play_services_version\" />").toString());
        } else
        {
            return;
        }
    }

}
