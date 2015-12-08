// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common;

import android.app.Activity;
import android.app.AppOpsManager;
import android.app.Dialog;
import android.app.NotificationManager;
import android.content.ContentResolver;
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
import android.support.v4.app.FragmentActivity;
import android.text.TextUtils;
import android.util.Log;
import android.util.TypedValue;
import com.google.android.gms.common.internal.g;
import com.google.android.gms.common.internal.j;
import com.google.android.gms.common.internal.k;
import com.google.android.gms.common.internal.q;
import com.google.android.gms.internal.im;
import com.google.android.gms.internal.it;
import java.io.InputStream;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicBoolean;

// Referenced classes of package com.google.android.gms.common:
//            k, f, a, d, 
//            c, j

public final class e
{

    public static final int a = 0x7877d8;
    public static boolean b = false;
    public static boolean c = false;
    static final AtomicBoolean d = new AtomicBoolean();
    private static int e = -1;
    private static final Object f = new Object();
    private static String g = null;
    private static Integer h = null;

    public static int a(Context context)
    {
        Object obj;
        PackageManager packagemanager;
        Object obj1;
        if (g.a)
        {
            return 0;
        }
        packagemanager = context.getPackageManager();
        try
        {
            context.getResources().getString(com.google.android.gms.a.c.common_google_play_services_unknown_issue);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            Log.e("GooglePlayServicesUtil", "The Google Play services resources were not found. Check your project configuration to ensure that the resources are included.");
        }
        if ("com.google.android.gms".equals(context.getPackageName()))
        {
            break MISSING_BLOCK_LABEL_252;
        }
        obj = f;
        obj;
        JVM INSTR monitorenter ;
        if (g != null) goto _L2; else goto _L1
_L1:
        g = context.getPackageName();
        obj1 = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
        if (obj1 == null) goto _L4; else goto _L3
_L3:
        h = Integer.valueOf(((Bundle) (obj1)).getInt("com.google.android.gms.version"));
_L5:
        obj1 = h;
        obj;
        JVM INSTR monitorexit ;
        if (obj1 == null)
        {
            throw new IllegalStateException("A required meta-data tag in your app's AndroidManifest.xml does not exist.  You must have the following declaration within the <application> element:     <meta-data android:name=\"com.google.android.gms.version\" android:value=\"@integer/google_play_services_version\" />");
        }
        break MISSING_BLOCK_LABEL_202;
_L4:
        h = null;
          goto _L5
        obj1;
        Log.wtf("GooglePlayServicesUtil", "This should never happen.", ((Throwable) (obj1)));
          goto _L5
        context;
        obj;
        JVM INSTR monitorexit ;
        throw context;
_L2:
        if (g.equals(context.getPackageName())) goto _L5; else goto _L6
_L6:
        throw new IllegalArgumentException((new StringBuilder("isGooglePlayServicesAvailable should only be called with Context from your application's package. A previous call used package '")).append(g).append("' and this call used package '").append(context.getPackageName()).append("'.").toString());
        if (((Integer) (obj1)).intValue() != a)
        {
            throw new IllegalStateException((new StringBuilder("The meta-data tag in your app's AndroidManifest.xml does not have the right value.  Expected ")).append(a).append(" but found ").append(obj1).append(".  You must have the following declaration within the <application> element:     <meta-data android:name=\"com.google.android.gms.version\" android:value=\"@integer/google_play_services_version\" />").toString());
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
        k.a();
        if (im.b(((PackageInfo) (obj)).versionCode) || im.a(context))
        {
            if (k.a(((PackageInfo) (obj)), j.aw.a) == null)
            {
                Log.w("GooglePlayServicesUtil", "Google Play services signature invalid.");
                return 9;
            }
            break MISSING_BLOCK_LABEL_420;
        }
        Object obj2;
        try
        {
            obj2 = k.a(packagemanager.getPackageInfo("com.android.vending", 64), j.aw.a);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj2)
        {
            if (a(context, "com.android.vending"))
            {
                Log.w("GooglePlayServicesUtil", "Google Play Store is updating.");
                if (k.a(((PackageInfo) (obj)), j.aw.a) == null)
                {
                    Log.w("GooglePlayServicesUtil", "Google Play services signature invalid.");
                    return 9;
                }
            } else
            {
                Log.w("GooglePlayServicesUtil", "Google Play Store is neither installed nor updating.");
                return 9;
            }
            break MISSING_BLOCK_LABEL_420;
        }
        if (obj2 != null)
        {
            break MISSING_BLOCK_LABEL_383;
        }
        Log.w("GooglePlayServicesUtil", "Google Play Store signature invalid.");
        return 9;
        if (k.a(((PackageInfo) (obj)), new j.a[] {
    obj2
}) != null)
        {
            break MISSING_BLOCK_LABEL_420;
        }
        Log.w("GooglePlayServicesUtil", "Google Play services signature invalid.");
        return 9;
        int i = im.a(a);
        if (im.a(((PackageInfo) (obj)).versionCode) < i)
        {
            Log.w("GooglePlayServicesUtil", (new StringBuilder("Google Play services out of date.  Requires ")).append(a).append(" but found ").append(((PackageInfo) (obj)).versionCode).toString());
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

    public static Dialog a(int i, Activity activity)
    {
        return a(i, activity, null, 1, null);
    }

    private static Dialog a(int i, Activity activity, Fragment fragment, int l, android.content.DialogInterface.OnCancelListener oncancellistener)
    {
        Object obj1;
        int i1;
        obj1 = null;
        if (i == 0)
        {
            return null;
        }
        i1 = i;
        if (im.a(activity))
        {
            i1 = i;
            if (i == 2)
            {
                i1 = 42;
            }
        }
        if (!it.c()) goto _L2; else goto _L1
_L1:
        Object obj;
        obj = new TypedValue();
        activity.getTheme().resolveAttribute(0x1010309, ((TypedValue) (obj)), true);
        if (!"Theme.Dialog.Alert".equals(activity.getResources().getResourceEntryName(((TypedValue) (obj)).resourceId))) goto _L2; else goto _L3
_L3:
        obj = new android.app.AlertDialog.Builder(activity, 5);
_L21:
        android.app.AlertDialog.Builder builder = ((android.app.AlertDialog.Builder) (obj));
        if (obj == null)
        {
            builder = new android.app.AlertDialog.Builder(activity);
        }
        builder.setMessage(j.a(activity, i1, g(activity)));
        if (oncancellistener != null)
        {
            builder.setOnCancelListener(oncancellistener);
        }
        oncancellistener = a(i1);
        if (fragment == null)
        {
            fragment = new k(activity, oncancellistener, l);
        } else
        {
            fragment = new k(fragment, oncancellistener, l);
        }
        oncancellistener = j.a(activity, i1);
        if (oncancellistener != null)
        {
            builder.setPositiveButton(oncancellistener, fragment);
        }
        fragment = activity.getResources();
        activity = obj1;
        i1;
        JVM INSTR lookupswitch 15: default 324
    //                   1: 384
    //                   2: 417
    //                   3: 395
    //                   4: 352
    //                   5: 513
    //                   6: 352
    //                   7: 460
    //                   8: 481
    //                   9: 439
    //                   10: 497
    //                   11: 534
    //                   16: 550
    //                   17: 566
    //                   18: 406
    //                   42: 428;
           goto _L4 _L5 _L6 _L7 _L8 _L9 _L8 _L10 _L11 _L12 _L13 _L14 _L15 _L16 _L17 _L18
_L8:
        break; /* Loop/switch isn't completed */
_L4:
        Log.e("GoogleApiAvailability", (new StringBuilder("Unexpected error code ")).append(i1).toString());
        activity = obj1;
_L19:
        if (activity != null)
        {
            builder.setTitle(activity);
        }
        return builder.create();
_L5:
        activity = fragment.getString(com.google.android.gms.a.c.common_google_play_services_install_title);
        continue; /* Loop/switch isn't completed */
_L7:
        activity = fragment.getString(com.google.android.gms.a.c.common_google_play_services_enable_title);
        continue; /* Loop/switch isn't completed */
_L17:
        activity = fragment.getString(com.google.android.gms.a.c.common_google_play_services_updating_title);
        continue; /* Loop/switch isn't completed */
_L6:
        activity = fragment.getString(com.google.android.gms.a.c.common_google_play_services_update_title);
        continue; /* Loop/switch isn't completed */
_L18:
        activity = fragment.getString(com.google.android.gms.a.c.common_android_wear_update_title);
        continue; /* Loop/switch isn't completed */
_L12:
        Log.e("GoogleApiAvailability", "Google Play services is invalid. Cannot recover.");
        activity = fragment.getString(com.google.android.gms.a.c.common_google_play_services_unsupported_title);
        continue; /* Loop/switch isn't completed */
_L10:
        Log.e("GoogleApiAvailability", "Network error occurred. Please retry request later.");
        activity = fragment.getString(com.google.android.gms.a.c.common_google_play_services_network_error_title);
        continue; /* Loop/switch isn't completed */
_L11:
        Log.e("GoogleApiAvailability", "Internal error occurred. Please see logs for detailed information");
        activity = obj1;
        continue; /* Loop/switch isn't completed */
_L13:
        Log.e("GoogleApiAvailability", "Developer error occurred. Please see logs for detailed information");
        activity = obj1;
        continue; /* Loop/switch isn't completed */
_L9:
        Log.e("GoogleApiAvailability", "An invalid account was specified when connecting. Please provide a valid account.");
        activity = fragment.getString(com.google.android.gms.a.c.common_google_play_services_invalid_account_title);
        continue; /* Loop/switch isn't completed */
_L14:
        Log.e("GoogleApiAvailability", "The application is not licensed to the user.");
        activity = obj1;
        continue; /* Loop/switch isn't completed */
_L15:
        Log.e("GoogleApiAvailability", "One of the API components you attempted to connect to is not available.");
        activity = obj1;
        continue; /* Loop/switch isn't completed */
_L16:
        Log.e("GoogleApiAvailability", "The specified account could not be signed in.");
        activity = fragment.getString(com.google.android.gms.a.c.common_google_play_services_sign_in_failed_title);
        if (true) goto _L19; else goto _L2
_L2:
        obj = null;
        if (true) goto _L21; else goto _L20
_L20:
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

    public static boolean a(int i, Activity activity, Fragment fragment, android.content.DialogInterface.OnCancelListener oncancellistener)
    {
        fragment = a(i, activity, fragment, 2, oncancellistener);
        if (fragment == null)
        {
            return false;
        }
        if (activity instanceof FragmentActivity)
        {
            activity = ((FragmentActivity)activity).getSupportFragmentManager();
            com.google.android.gms.common.f.a(fragment, oncancellistener).show(activity, "GooglePlayServicesErrorDialog");
        } else
        if (it.a())
        {
            activity = activity.getFragmentManager();
            com.google.android.gms.common.a.a(fragment, oncancellistener).show(activity, "GooglePlayServicesErrorDialog");
        } else
        {
            throw new RuntimeException("This Activity does not support Fragments.");
        }
        return true;
    }

    public static boolean a(Context context, int i)
    {
        if (a(context, i, "com.google.android.gms"))
        {
            context = context.getPackageManager();
            k.a();
            if (k.a(context, "com.google.android.gms"))
            {
                return true;
            }
        }
        return false;
    }

    private static boolean a(Context context, int i, String s)
    {
label0:
        {
            {
                boolean flag1 = false;
                if (!it.f())
                {
                    break label0;
                }
                context = (AppOpsManager)context.getSystemService("appops");
                boolean flag;
                try
                {
                    context.checkPackage(i, s);
                }
                // Misplaced declaration of an exception variable
                catch (Context context)
                {
                    return false;
                }
                flag = true;
            }
            return flag;
        }
        context = context.getPackageManager().getPackagesForUid(i);
        flag = flag1;
        if (context == null)
        {
            continue;
        }
        i = 0;
        do
        {
            flag = flag1;
            if (i >= context.length)
            {
                continue;
            }
            if (s.equals(context[i]))
            {
                return true;
            }
            i++;
        } while (true);
        if (true) goto _L2; else goto _L1
_L2:
        break MISSING_BLOCK_LABEL_28;
_L1:
    }

    private static boolean a(Context context, String s)
    {
        if (it.i())
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

    public static boolean a(PackageManager packagemanager)
    {
label0:
        {
            if (!b(packagemanager))
            {
                boolean flag;
                if (b)
                {
                    flag = c;
                } else
                {
                    flag = "user".equals(Build.TYPE);
                }
                if (flag)
                {
                    break label0;
                }
            }
            return true;
        }
        return false;
    }

    public static void b(Context context)
        throws d, c
    {
        int i = a(context);
        if (i != 0)
        {
            context = a(i);
            Log.e("GooglePlayServicesUtil", (new StringBuilder("GooglePlayServices not available due to error ")).append(i).toString());
            if (context == null)
            {
                throw new c(i);
            } else
            {
                throw new d(i, "Google Play Services not available", context);
            }
        } else
        {
            return;
        }
    }

    public static boolean b(int i)
    {
        switch (i)
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

    public static boolean b(Context context, int i)
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

    private static boolean b(PackageManager packagemanager)
    {
        Object obj = f;
        obj;
        JVM INSTR monitorenter ;
        int i = e;
        if (i != -1) goto _L2; else goto _L1
_L1:
        packagemanager = packagemanager.getPackageInfo("com.google.android.gms", 64);
        k.a();
        if (k.a(packagemanager, new j.a[] {
            j.b[1]
        }) == null) goto _L4; else goto _L3
_L3:
        e = 1;
_L2:
        obj;
        JVM INSTR monitorexit ;
        return e != 0;
_L4:
        e = 0;
          goto _L2
        packagemanager;
        e = 0;
          goto _L2
        packagemanager;
        obj;
        JVM INSTR monitorexit ;
        throw packagemanager;
    }

    public static void c(Context context)
    {
        if (d.getAndSet(true))
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

    public static String d(Context context)
    {
        Object obj = (new android.net.Uri.Builder()).scheme("android.resource").authority("com.google.android.gms").appendPath("raw").appendPath("oss_notice").build();
        InputStream inputstream = context.getContentResolver().openInputStream(((android.net.Uri) (obj)));
        try
        {
            context = (new Scanner(inputstream)).useDelimiter("\\A").next();
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            if (inputstream == null)
            {
                break MISSING_BLOCK_LABEL_101;
            }
            try
            {
                inputstream.close();
                break MISSING_BLOCK_LABEL_101;
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                obj = null;
            }
            break MISSING_BLOCK_LABEL_99;
        }
        finally
        {
            if (inputstream == null) goto _L0; else goto _L0
        }
        obj = context;
        if (inputstream == null)
        {
            break MISSING_BLOCK_LABEL_99;
        }
        inputstream.close();
        return context;
        inputstream.close();
        throw context;
        return ((String) (obj));
        return null;
    }

    public static Resources e(Context context)
    {
        try
        {
            context = context.getPackageManager().getResourcesForApplication("com.google.android.gms");
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            return null;
        }
        return context;
    }

    public static Context f(Context context)
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

    public static String g(Context context)
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

    public static boolean h(Context context)
    {
        context = context.getPackageManager();
        return it.i() && context.hasSystemFeature("com.google.sidewinder");
    }

}
