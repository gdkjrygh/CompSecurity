// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common;

import android.app.Activity;
import android.app.AppOpsManager;
import android.app.Dialog;
import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageInstaller;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.util.Log;
import android.util.TypedValue;
import com.google.android.gms.b;
import com.google.android.gms.common.internal.aa;
import com.google.android.gms.common.internal.g;
import com.google.android.gms.common.internal.i;
import com.google.android.gms.internal.in;
import com.google.android.gms.internal.is;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.google.android.gms.common:
//            fg, bf, j, f, 
//            b, c, d, i

public final class e
{

    public static boolean a = false;
    public static boolean b = false;
    private static int c = -1;
    private static final Object d = new Object();

    private e()
    {
    }

    public static int a(Context context)
    {
        PackageManager packagemanager;
        packagemanager = context.getPackageManager();
        Object obj;
        ApplicationInfo applicationinfo;
        int k;
        if (!g.a)
        {
            try
            {
                context.getResources().getString(b.q);
            }
            catch (Throwable throwable)
            {
                Log.e("GooglePlayServicesUtil", "The Google Play services resources were not found. Check your project configuration to ensure that the resources are included.");
            }
        }
        if (g.a)
        {
            break MISSING_BLOCK_LABEL_136;
        }
        obj = null;
        applicationinfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
        obj = applicationinfo;
_L1:
        obj = ((ApplicationInfo) (obj)).metaData;
        android.content.pm.PackageManager.NameNotFoundException namenotfoundexception;
        if (obj != null)
        {
            k = ((Bundle) (obj)).getInt("com.google.android.gms.version");
            if (k != 0x6c42d8)
            {
                throw new IllegalStateException((new StringBuilder("The meta-data tag in your app's AndroidManifest.xml does not have the right value.  Expected 7095000 but found ")).append(k).append(".  You must have the following declaration within the <application> element:     <meta-data android:name=\"com.google.android.gms.version\" android:value=\"@integer/google_play_services_version\" />").toString());
            }
        } else
        {
            throw new IllegalStateException("A required meta-data tag in your app's AndroidManifest.xml does not exist.  You must have the following declaration within the <application> element:     <meta-data android:name=\"com.google.android.gms.version\" android:value=\"@integer/google_play_services_version\" />");
        }
        break MISSING_BLOCK_LABEL_136;
        namenotfoundexception;
        Log.wtf("GooglePlayServicesUtil", "This should never happen.", namenotfoundexception);
          goto _L1
        PackageInfo packageinfo;
        try
        {
            packageinfo = packagemanager.getPackageInfo("com.google.android.gms", 64);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            Log.w("GooglePlayServicesUtil", "Google Play services is missing.");
            return 1;
        }
        fg.a();
        if (in.b(packageinfo.versionCode) || in.a(context))
        {
            if (fg.a(packageinfo, bf.a) == null)
            {
                Log.w("GooglePlayServicesUtil", "Google Play services signature invalid.");
                return 9;
            }
        } else
        {
            try
            {
                context = packagemanager.getPackageInfo("com.android.vending", 64);
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                Log.w("GooglePlayServicesUtil", "Google Play Store is missing.");
                return 9;
            }
            context = fg.a(context, bf.a);
            if (context == null)
            {
                Log.w("GooglePlayServicesUtil", "Google Play Store signature invalid.");
                return 9;
            }
            if (fg.a(packageinfo, new j[] {
    context
}) == null)
            {
                Log.w("GooglePlayServicesUtil", "Google Play services signature invalid.");
                return 9;
            }
        }
        int l = in.a(0x6c42d8);
        if (in.a(packageinfo.versionCode) < l)
        {
            Log.w("GooglePlayServicesUtil", (new StringBuilder("Google Play services out of date.  Requires 7095000 but found ")).append(packageinfo.versionCode).toString());
            return 2;
        }
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
        return ((ApplicationInfo) (context)).enabled ? 0 : 3;
    }

    public static Dialog a(int k, Activity activity, int l, android.content.DialogInterface.OnCancelListener oncancellistener)
    {
        return a(k, activity, null, l, oncancellistener);
    }

    private static Dialog a(int k, Activity activity, Fragment fragment, int l, android.content.DialogInterface.OnCancelListener oncancellistener)
    {
        int i1;
        i1 = k;
        if (in.a(activity))
        {
            i1 = k;
            if (k == 2)
            {
                i1 = 42;
            }
        }
        if (!is.c()) goto _L2; else goto _L1
_L1:
        Object obj;
        obj = new TypedValue();
        activity.getTheme().resolveAttribute(0x1010309, ((TypedValue) (obj)), true);
        if (!"Theme.Dialog.Alert".equals(activity.getResources().getResourceEntryName(((TypedValue) (obj)).resourceId))) goto _L2; else goto _L3
_L3:
        obj = new android.app.AlertDialog.Builder(activity, 5);
_L5:
        android.app.AlertDialog.Builder builder = ((android.app.AlertDialog.Builder) (obj));
        if (obj == null)
        {
            builder = new android.app.AlertDialog.Builder(activity);
        }
        builder.setMessage(b(activity, i1));
        if (oncancellistener != null)
        {
            builder.setOnCancelListener(oncancellistener);
        }
        oncancellistener = a(i1);
        if (fragment == null)
        {
            fragment = new i(activity, oncancellistener, l);
        } else
        {
            fragment = new i(fragment, oncancellistener, l);
        }
        activity = c(activity, i1);
        if (activity != null)
        {
            builder.setPositiveButton(activity, fragment);
        }
        switch (i1)
        {
        default:
            Log.e("GooglePlayServicesUtil", (new StringBuilder("Unexpected error code ")).append(i1).toString());
            return builder.create();

        case 0: // '\0'
            return null;

        case 4: // '\004'
        case 6: // '\006'
            return builder.create();

        case 1: // '\001'
            return builder.setTitle(b.j).create();

        case 3: // '\003'
            return builder.setTitle(b.f).create();

        case 2: // '\002'
            return builder.setTitle(b.v).create();

        case 42: // '*'
            return builder.setTitle(b.c).create();

        case 9: // '\t'
            Log.e("GooglePlayServicesUtil", "Google Play services is invalid. Cannot recover.");
            return builder.setTitle(b.s).create();

        case 7: // '\007'
            Log.e("GooglePlayServicesUtil", "Network error occurred. Please retry request later.");
            return builder.setTitle(b.n).create();

        case 8: // '\b'
            Log.e("GooglePlayServicesUtil", "Internal error occurred. Please see logs for detailed information");
            return builder.create();

        case 10: // '\n'
            Log.e("GooglePlayServicesUtil", "Developer error occurred. Please see logs for detailed information");
            return builder.create();

        case 5: // '\005'
            Log.e("GooglePlayServicesUtil", "An invalid account was specified when connecting. Please provide a valid account.");
            return builder.setTitle(b.l).create();

        case 11: // '\013'
            Log.e("GooglePlayServicesUtil", "The application is not licensed to the user.");
            return builder.create();

        case 16: // '\020'
            Log.e("GooglePlayServicesUtil", "One of the API components you attempted to connect to is not available.");
            return builder.create();

        case 17: // '\021'
            Log.e("GooglePlayServicesUtil", "The specified account could not be signed in.");
            break;
        }
        return builder.setTitle(b.p).create();
_L2:
        obj = null;
        if (true) goto _L5; else goto _L4
_L4:
    }

    public static Intent a(int k)
    {
        switch (k)
        {
        default:
            return null;

        case 1: // '\001'
        case 2: // '\002'
            return aa.b("com.google.android.gms");

        case 42: // '*'
            return aa.a();

        case 3: // '\003'
            return aa.a("com.google.android.gms");
        }
    }

    public static boolean a(int k, Activity activity, Fragment fragment, android.content.DialogInterface.OnCancelListener oncancellistener)
    {
        fragment = a(k, activity, fragment, 2, oncancellistener);
        if (fragment == null)
        {
            return false;
        }
        if (activity instanceof FragmentActivity)
        {
            activity = ((FragmentActivity)activity).getSupportFragmentManager();
            f.a(fragment, oncancellistener).show(activity, "GooglePlayServicesErrorDialog");
        } else
        if (is.a())
        {
            activity = activity.getFragmentManager();
            com.google.android.gms.common.b.a(fragment, oncancellistener).show(activity, "GooglePlayServicesErrorDialog");
        } else
        {
            throw new RuntimeException("This Activity does not support Fragments.");
        }
        return true;
    }

    public static boolean a(Context context, int k)
    {
        if (a(context, k, "com.google.android.gms"))
        {
            context = context.getPackageManager();
            fg.a();
            if (fg.a(context, "com.google.android.gms"))
            {
                return true;
            }
        }
        return false;
    }

    private static boolean a(Context context, int k, String s)
    {
label0:
        {
            {
                boolean flag1 = false;
                if (!is.d())
                {
                    break label0;
                }
                context = (AppOpsManager)context.getSystemService("appops");
                boolean flag;
                try
                {
                    context.checkPackage(k, s);
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
        context = context.getPackageManager().getPackagesForUid(k);
        flag = flag1;
        if (context == null)
        {
            continue;
        }
        k = 0;
        do
        {
            flag = flag1;
            if (k >= context.length)
            {
                continue;
            }
            if (s.equals(context[k]))
            {
                return true;
            }
            k++;
        } while (true);
        if (true) goto _L2; else goto _L1
_L2:
        break MISSING_BLOCK_LABEL_28;
_L1:
    }

    private static boolean a(Context context, String s)
    {
        if (is.f())
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
                if (a)
                {
                    flag = b;
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

    public static String b(Context context, int k)
    {
        Resources resources;
        boolean flag1;
        flag1 = true;
        resources = context.getResources();
        k;
        JVM INSTR lookupswitch 9: default 92
    //                   1: 100
    //                   2: 227
    //                   3: 219
    //                   5: 259
    //                   7: 251
    //                   9: 243
    //                   16: 267
    //                   17: 275
    //                   42: 235;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10
_L1:
        return resources.getString(b.q);
_L2:
        context = context.getResources();
        if (context == null) goto _L12; else goto _L11
_L11:
        boolean flag;
        if ((context.getConfiguration().screenLayout & 0xf) > 3)
        {
            k = 1;
        } else
        {
            k = 0;
        }
        if (!is.a()) goto _L14; else goto _L13
_L13:
        flag = flag1;
        if (k != 0) goto _L15; else goto _L14
_L14:
        context = context.getConfiguration();
        if (is.b())
        {
            if ((((Configuration) (context)).screenLayout & 0xf) <= 3 && ((Configuration) (context)).smallestScreenWidthDp >= 600)
            {
                k = 1;
            } else
            {
                k = 0;
            }
        } else
        {
            k = 0;
        }
        if (k == 0) goto _L12; else goto _L16
_L16:
        flag = flag1;
_L15:
        if (flag)
        {
            return resources.getString(b.i);
        } else
        {
            return resources.getString(b.h);
        }
_L12:
        flag = false;
          goto _L15
_L4:
        return resources.getString(b.e);
_L3:
        return resources.getString(b.u);
_L10:
        return resources.getString(b.b);
_L7:
        return resources.getString(b.r);
_L6:
        return resources.getString(b.m);
_L5:
        return resources.getString(b.k);
_L8:
        return resources.getString(b.w);
_L9:
        return resources.getString(b.o);
    }

    public static void b(Context context)
    {
        int k = a(context);
        if (k != 0)
        {
            context = a(k);
            Log.e("GooglePlayServicesUtil", (new StringBuilder("GooglePlayServices not available due to error ")).append(k).toString());
            if (context == null)
            {
                throw new c(k);
            } else
            {
                throw new d(k, "Google Play Services not available", context);
            }
        } else
        {
            return;
        }
    }

    public static boolean b(int k)
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

    private static boolean b(PackageManager packagemanager)
    {
        Object obj = d;
        obj;
        JVM INSTR monitorenter ;
        int k = c;
        if (k != -1) goto _L2; else goto _L1
_L1:
        packagemanager = packagemanager.getPackageInfo("com.google.android.gms", 64);
        fg.a();
        if (fg.a(packagemanager, new j[] {
            com.google.android.gms.common.i.b[1]
        }) == null) goto _L4; else goto _L3
_L3:
        c = 1;
_L2:
        obj;
        JVM INSTR monitorexit ;
        return c != 0;
_L4:
        c = 0;
          goto _L2
        packagemanager;
        c = 0;
          goto _L2
        packagemanager;
        obj;
        JVM INSTR monitorexit ;
        throw packagemanager;
    }

    public static String c(Context context, int k)
    {
        context = context.getResources();
        switch (k)
        {
        default:
            return context.getString(0x104000a);

        case 1: // '\001'
            return context.getString(b.g);

        case 3: // '\003'
            return context.getString(b.d);

        case 2: // '\002'
        case 42: // '*'
            return context.getString(b.t);
        }
    }

    public static void c(Context context)
    {
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

    public static Resources d(Context context)
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

    public static boolean d(Context context, int k)
    {
        if (k == 1)
        {
            return a(context, "com.google.android.gms");
        } else
        {
            return false;
        }
    }

    public static Context e(Context context)
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

}
