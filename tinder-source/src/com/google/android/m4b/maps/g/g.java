// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.g;

import android.app.Activity;
import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageInstaller;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.i;
import android.text.TextUtils;
import android.util.Log;
import android.util.TypedValue;
import com.google.android.m4b.maps.cz.a;
import com.google.android.m4b.maps.cz.e;
import com.google.android.m4b.maps.j.f;
import com.google.android.m4b.maps.j.h;
import com.google.android.m4b.maps.j.j;
import com.google.android.m4b.maps.j.p;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

// Referenced classes of package com.google.android.m4b.maps.g:
//            h, i, c, e

public final class g
{

    public static final int a;
    private static boolean b = false;
    private static boolean c = false;
    private static int d = -1;
    private static final Object e = new Object();
    private static String f = null;
    private static Integer g = null;
    private static AtomicBoolean h = new AtomicBoolean();

    public static int a(Context context)
    {
        Object obj;
        Object obj1;
        Object obj2;
        if (f.c)
        {
            return 0;
        }
        obj1 = context.getPackageManager();
        try
        {
            context.getResources().getString(com.google.android.m4b.maps.h.h.common_google_play_services_unknown_issue);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            Log.e("GooglePlayServicesUtil", "The Google Play services resources were not found. Check your project configuration to ensure that the resources are included.");
        }
        if ("com.google.android.gms".equals(context.getPackageName()))
        {
            break MISSING_BLOCK_LABEL_352;
        }
        obj = e;
        obj;
        JVM INSTR monitorenter ;
        if (f != null) goto _L2; else goto _L1
_L1:
        f = context.getPackageName();
        obj2 = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
        if (obj2 == null) goto _L4; else goto _L3
_L3:
        g = Integer.valueOf(((Bundle) (obj2)).getInt("com.google.android.gms.version"));
_L5:
        obj2 = g;
        obj;
        JVM INSTR monitorexit ;
        if (obj2 == null)
        {
            throw new IllegalStateException("A required meta-data tag in your app's AndroidManifest.xml does not exist.  You must have the following declaration within the <application> element:     <meta-data android:name=\"com.google.android.gms.version\" android:value=\"@integer/google_play_services_version\" />");
        }
        break MISSING_BLOCK_LABEL_243;
_L4:
        g = null;
          goto _L5
        obj2;
        Log.wtf("GooglePlayServicesUtil", "This should never happen.", ((Throwable) (obj2)));
          goto _L5
        context;
        obj;
        JVM INSTR monitorexit ;
        throw context;
_L2:
        if (f.equals(context.getPackageName())) goto _L5; else goto _L6
_L6:
        obj1 = String.valueOf("isGooglePlayServicesAvailable should only be called with Context from your application's package. A previous call used package '");
        obj2 = f;
        context = String.valueOf(context.getPackageName());
        throw new IllegalArgumentException((new StringBuilder(String.valueOf(obj1).length() + 32 + String.valueOf(obj2).length() + String.valueOf(context).length())).append(((String) (obj1))).append(((String) (obj2))).append("' and this call used package '").append(context).append("'.").toString());
        if (((Integer) (obj2)).intValue() != a)
        {
            context = String.valueOf("The meta-data tag in your app's AndroidManifest.xml does not have the right value.  Expected ");
            int k = a;
            obj = String.valueOf(obj2);
            obj1 = String.valueOf("com.google.android.gms.version");
            throw new IllegalStateException((new StringBuilder(String.valueOf(context).length() + 186 + String.valueOf(obj).length() + String.valueOf(obj1).length())).append(context).append(k).append(" but found ").append(((String) (obj))).append(".  You must have the following declaration within the <application> element:     <meta-data android:name=\"").append(((String) (obj1))).append("\" android:value=\"@integer/google_play_services_version\" />").toString());
        }
        try
        {
            obj = ((PackageManager) (obj1)).getPackageInfo("com.google.android.gms", 64);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            Log.w("GooglePlayServicesUtil", "Google Play services is missing.");
            return 1;
        }
        com.google.android.m4b.maps.g.h.a();
        if (com.google.android.m4b.maps.cz.a.b(((PackageInfo) (obj)).versionCode) || com.google.android.m4b.maps.cz.a.a(context))
        {
            if (com.google.android.m4b.maps.g.h.a(((PackageInfo) (obj)), com.google.android.m4b.maps.g.e.am.a) == null)
            {
                Log.w("GooglePlayServicesUtil", "Google Play services signature invalid.");
                return 9;
            }
            break MISSING_BLOCK_LABEL_520;
        }
        Object obj3;
        try
        {
            obj3 = com.google.android.m4b.maps.g.h.a(((PackageManager) (obj1)).getPackageInfo("com.android.vending", 64), com.google.android.m4b.maps.g.e.am.a);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj3)
        {
            if (a(context, "com.android.vending"))
            {
                Log.w("GooglePlayServicesUtil", "Google Play Store is updating.");
                if (com.google.android.m4b.maps.g.h.a(((PackageInfo) (obj)), com.google.android.m4b.maps.g.e.am.a) == null)
                {
                    Log.w("GooglePlayServicesUtil", "Google Play services signature invalid.");
                    return 9;
                }
            } else
            {
                Log.w("GooglePlayServicesUtil", "Google Play Store is neither installed nor updating.");
                return 9;
            }
            break MISSING_BLOCK_LABEL_520;
        }
        if (obj3 != null)
        {
            break MISSING_BLOCK_LABEL_483;
        }
        Log.w("GooglePlayServicesUtil", "Google Play Store signature invalid.");
        return 9;
        if (com.google.android.m4b.maps.g.h.a(((PackageInfo) (obj)), new e.a[] {
    obj3
}) != null)
        {
            break MISSING_BLOCK_LABEL_520;
        }
        Log.w("GooglePlayServicesUtil", "Google Play services signature invalid.");
        return 9;
        int l = com.google.android.m4b.maps.cz.a.a(a);
        if (com.google.android.m4b.maps.cz.a.a(((PackageInfo) (obj)).versionCode) < l)
        {
            int i1 = a;
            int j1 = ((PackageInfo) (obj)).versionCode;
            Log.w("GooglePlayServicesUtil", (new StringBuilder(77)).append("Google Play services out of date.  Requires ").append(i1).append(" but found ").append(j1).toString());
            return 2;
        }
        obj = ((PackageInfo) (obj)).applicationInfo;
        context = ((Context) (obj));
        if (obj == null)
        {
            try
            {
                context = ((PackageManager) (obj1)).getApplicationInfo("com.google.android.gms", 0);
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

    public static boolean a(int k)
    {
        if (a(k, "com.google.android.gms"))
        {
            throw new NullPointerException();
        } else
        {
            return false;
        }
    }

    public static boolean a(int k, Activity activity, Fragment fragment, android.content.DialogInterface.OnCancelListener oncancellistener)
    {
        Object obj;
        Object obj1;
        obj1 = null;
        if (k == 0)
        {
            fragment = null;
            break MISSING_BLOCK_LABEL_9;
        }
        l = k;
        if (com.google.android.m4b.maps.cz.a.a(activity))
        {
            l = k;
            if (k == 2)
            {
                l = 42;
            }
        }
        if (!com.google.android.m4b.maps.cz.e.a(14))
        {
            break MISSING_BLOCK_LABEL_670;
        }
        obj = new TypedValue();
        activity.getTheme().resolveAttribute(0x1010309, ((TypedValue) (obj)), true);
        if (!"Theme.Dialog.Alert".equals(activity.getResources().getResourceEntryName(((TypedValue) (obj)).resourceId)))
        {
            break MISSING_BLOCK_LABEL_670;
        }
        obj = new android.app.AlertDialog.Builder(activity, 5);
_L18:
        android.app.AlertDialog.Builder builder = ((android.app.AlertDialog.Builder) (obj));
        if (obj == null)
        {
            builder = new android.app.AlertDialog.Builder(activity);
        }
        builder.setMessage(com.google.android.m4b.maps.j.h.a(activity, l, c(activity)));
        if (oncancellistener != null)
        {
            builder.setOnCancelListener(oncancellistener);
        }
        obj = b(l);
        if (fragment == null)
        {
            fragment = new j(activity, ((Intent) (obj)));
        } else
        {
            fragment = new j(fragment, ((Intent) (obj)));
        }
        obj = com.google.android.m4b.maps.j.h.a(activity, l);
        if (obj != null)
        {
            builder.setPositiveButton(((CharSequence) (obj)), fragment);
        }
        obj = activity.getResources();
        fragment = obj1;
        l;
        JVM INSTR lookupswitch 15: default 332
    //                   1: 398
    //                   2: 434
    //                   3: 410
    //                   4: 364
    //                   5: 530
    //                   6: 364
    //                   7: 479
    //                   8: 500
    //                   9: 458
    //                   10: 515
    //                   11: 551
    //                   16: 566
    //                   17: 581
    //                   18: 422
    //                   42: 446;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L5 _L7 _L8 _L9 _L10 _L11 _L12 _L13 _L14 _L15
_L13:
        break MISSING_BLOCK_LABEL_581;
_L5:
        break; /* Loop/switch isn't completed */
_L1:
        Log.e("GooglePlayServicesUtil", (new StringBuilder(33)).append("Unexpected error code ").append(l).toString());
        fragment = obj1;
_L17:
        if (fragment != null)
        {
            builder.setTitle(fragment);
        }
        fragment = builder.create();
          goto _L16
_L2:
        fragment = ((Resources) (obj)).getString(com.google.android.m4b.maps.h.h.common_google_play_services_install_title);
          goto _L17
_L4:
        fragment = ((Resources) (obj)).getString(com.google.android.m4b.maps.h.h.common_google_play_services_enable_title);
          goto _L17
_L14:
        fragment = ((Resources) (obj)).getString(com.google.android.m4b.maps.h.h.common_google_play_services_updating_title);
          goto _L17
_L3:
        fragment = ((Resources) (obj)).getString(com.google.android.m4b.maps.h.h.common_google_play_services_update_title);
          goto _L17
_L15:
        fragment = ((Resources) (obj)).getString(com.google.android.m4b.maps.h.h.common_android_wear_update_title);
          goto _L17
_L9:
        Log.e("GooglePlayServicesUtil", "Google Play services is invalid. Cannot recover.");
        fragment = ((Resources) (obj)).getString(com.google.android.m4b.maps.h.h.common_google_play_services_unsupported_title);
          goto _L17
_L7:
        Log.e("GooglePlayServicesUtil", "Network error occurred. Please retry request later.");
        fragment = ((Resources) (obj)).getString(com.google.android.m4b.maps.h.h.common_google_play_services_network_error_title);
          goto _L17
_L8:
        Log.e("GooglePlayServicesUtil", "Internal error occurred. Please see logs for detailed information");
        fragment = obj1;
          goto _L17
_L10:
        Log.e("GooglePlayServicesUtil", "Developer error occurred. Please see logs for detailed information");
        fragment = obj1;
          goto _L17
_L6:
        Log.e("GooglePlayServicesUtil", "An invalid account was specified when connecting. Please provide a valid account.");
        fragment = ((Resources) (obj)).getString(com.google.android.m4b.maps.h.h.common_google_play_services_invalid_account_title);
          goto _L17
_L11:
        Log.e("GooglePlayServicesUtil", "The application is not licensed to the user.");
        fragment = obj1;
          goto _L17
_L12:
        Log.e("GooglePlayServicesUtil", "One of the API components you attempted to connect to is not available.");
        fragment = obj1;
          goto _L17
        Log.e("GooglePlayServicesUtil", "The specified account could not be signed in.");
        fragment = ((Resources) (obj)).getString(com.google.android.m4b.maps.h.h.common_google_play_services_sign_in_failed_title);
          goto _L17
_L16:
        int l;
        if (fragment == null)
        {
            return false;
        }
        if (activity instanceof i)
        {
            activity = ((i)activity).getSupportFragmentManager();
            com.google.android.m4b.maps.g.i.a(fragment, oncancellistener).show(activity, "GooglePlayServicesErrorDialog");
        } else
        if (com.google.android.m4b.maps.cz.e.a(11))
        {
            activity = activity.getFragmentManager();
            com.google.android.m4b.maps.g.c.a(fragment, oncancellistener).show(activity, "GooglePlayServicesErrorDialog");
        } else
        {
            throw new RuntimeException("This Activity does not support Fragments.");
        }
        return true;
        obj = null;
          goto _L18
    }

    private static boolean a(int k, String s)
    {
        if (com.google.android.m4b.maps.cz.e.a(19))
        {
            throw new NullPointerException();
        } else
        {
            throw new NullPointerException();
        }
    }

    public static boolean a(Context context, int k)
    {
        if (k == 18)
        {
            return true;
        }
        if (k == 1)
        {
            return a(context, "com.google.android.gms");
        } else
        {
            return false;
        }
    }

    private static boolean a(Context context, String s)
    {
        if (com.google.android.m4b.maps.cz.e.a(21))
        {
            context = context.getPackageManager().getPackageInstaller().getAllSessions().iterator();
            do
            {
                if (!context.hasNext())
                {
                    break MISSING_BLOCK_LABEL_78;
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
        break MISSING_BLOCK_LABEL_78;
        context;
        return false;
    }

    public static boolean a(PackageManager packagemanager)
    {
        return b(packagemanager) || !"user".equals(Build.TYPE);
    }

    public static Intent b(int k)
    {
        switch (k)
        {
        default:
            return null;

        case 1: // '\001'
        case 2: // '\002'
            return p.b("com.google.android.gms");

        case 42: // '*'
            return p.a();

        case 3: // '\003'
            return p.a("com.google.android.gms");
        }
    }

    public static void b(Context context)
    {
        if (h.getAndSet(true))
        {
            return;
        }
        try
        {
            ((NotificationManager)context.getSystemService("notification")).cancel(10436);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            return;
        }
    }

    private static boolean b(PackageManager packagemanager)
    {
        boolean flag = true;
        Object obj = e;
        obj;
        JVM INSTR monitorenter ;
        int k = d;
        if (k != -1) goto _L2; else goto _L1
_L1:
        packagemanager = packagemanager.getPackageInfo("com.google.android.gms", 64);
        com.google.android.m4b.maps.g.h.a();
        if (com.google.android.m4b.maps.g.h.a(packagemanager, new e.a[] {
            com.google.android.m4b.maps.g.e.a[1]
        }) == null) goto _L4; else goto _L3
_L3:
        d = 1;
_L2:
        if (d == 0)
        {
            flag = false;
        }
        obj;
        JVM INSTR monitorexit ;
        return flag;
_L4:
        d = 0;
          goto _L2
        packagemanager;
        d = 0;
          goto _L2
        packagemanager;
        obj;
        JVM INSTR monitorexit ;
        throw packagemanager;
    }

    public static String c(Context context)
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

    public static boolean c(int k)
    {
        switch (k)
        {
        case 4: // '\004'
        case 5: // '\005'
        case 6: // '\006'
        case 7: // '\007'
        case 8: // '\b'
        default:
            return false;

        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
        case 9: // '\t'
            return true;
        }
    }

    public static int d(Context context)
    {
        try
        {
            context = context.getPackageManager().getPackageInfo("com.google.android.gms", 0);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            Log.w("GooglePlayServicesUtil", "Google Play services is missing.");
            return 0;
        }
        return ((PackageInfo) (context)).versionCode;
    }

    public static boolean e(Context context)
    {
        context = context.getPackageManager();
        return com.google.android.m4b.maps.cz.e.a(21) && context.hasSystemFeature("com.google.sidewinder");
    }

    static 
    {
        a = f.b;
    }
}
