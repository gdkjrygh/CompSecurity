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
import com.google.android.gms.common.internal.zze;
import com.google.android.gms.common.internal.zzg;
import com.google.android.gms.common.internal.zzo;
import com.google.android.gms.internal.zzlu;
import com.google.android.gms.internal.zzme;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.google.android.gms.common:
//            zzc, SupportErrorDialogFragment, ErrorDialogFragment, GooglePlayServicesNotAvailableException, 
//            GooglePlayServicesRepairableException, zzb

public final class GooglePlayServicesUtil
{

    public static boolean zzLD = false;
    public static boolean zzLE = false;
    private static int zzLF = -1;
    private static final Object zzLG = new Object();

    public static Dialog getErrorDialog(int i, Activity activity, int j)
    {
        return getErrorDialog(i, activity, j, null);
    }

    public static Dialog getErrorDialog(int i, Activity activity, int j, android.content.DialogInterface.OnCancelListener oncancellistener)
    {
        return zza(i, activity, null, j, oncancellistener);
    }

    public static Context getRemoteContext(Context context)
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

    public static Resources getRemoteResource(Context context)
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

    public static int isGooglePlayServicesAvailable(Context context)
    {
        PackageManager packagemanager = context.getPackageManager();
        PackageInfo packageinfo;
        zzc zzc1;
        int i;
        if (!zze.zzPq)
        {
            try
            {
                context.getResources().getString(com.google.android.gms.R.string.common_google_play_services_unknown_issue);
            }
            catch (Throwable throwable) { }
        }
        if (!zze.zzPq)
        {
            zzJ(context);
        }
        try
        {
            packageinfo = packagemanager.getPackageInfo("com.google.android.gms", 64);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            return 1;
        }
        zzc1 = com.google.android.gms.common.zzc.zzhP();
        if (!zzlu.zzbd(packageinfo.versionCode) && !zzlu.zzQ(context)) goto _L2; else goto _L1
_L1:
        if (zzc1.zza(packageinfo, zzb.zzaq.zzLC) != null) goto _L4; else goto _L3
_L3:
        return 9;
_L2:
        try
        {
            context = packagemanager.getPackageInfo("com.android.vending", 64);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            return 9;
        }
        context = zzc1.zza(context, zzb.zzaq.zzLC);
        if (context == null || zzc1.zza(packageinfo, new zzb.zza[] {
            context
        }) == null) goto _L3; else goto _L4
_L4:
        i = zzlu.zzbb(0x6c42d8);
        if (zzlu.zzbb(packageinfo.versionCode) < i)
        {
            (new StringBuilder("Google Play services out of date.  Requires 7095000 but found ")).append(packageinfo.versionCode);
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

    public static boolean isUserRecoverableError(int i)
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

    public static boolean showErrorDialogFragment(int i, Activity activity, Fragment fragment, int j, android.content.DialogInterface.OnCancelListener oncancellistener)
    {
        fragment = zza(i, activity, fragment, j, oncancellistener);
        if (fragment == null)
        {
            return false;
        }
        if (activity instanceof FragmentActivity)
        {
            activity = ((FragmentActivity)activity).mFragments;
            SupportErrorDialogFragment.newInstance(fragment, oncancellistener).show(activity, "GooglePlayServicesErrorDialog");
        } else
        if (zzme.zzkd())
        {
            activity = activity.getFragmentManager();
            ErrorDialogFragment.newInstance(fragment, oncancellistener).show(activity, "GooglePlayServicesErrorDialog");
        } else
        {
            throw new RuntimeException("This Activity does not support Fragments.");
        }
        return true;
    }

    public static void zzI(Context context)
    {
        int i = isGooglePlayServicesAvailable(context);
        if (i != 0)
        {
            context = zzan(i);
            if (context == null)
            {
                throw new GooglePlayServicesNotAvailableException(i);
            } else
            {
                throw new GooglePlayServicesRepairableException(i, "Google Play Services not available", context);
            }
        } else
        {
            return;
        }
    }

    private static void zzJ(Context context)
    {
        Object obj = null;
        try
        {
            context = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            Log.wtf("GooglePlayServicesUtil", "This should never happen.", context);
            context = obj;
        }
        context = ((ApplicationInfo) (context)).metaData;
        if (context != null)
        {
            int i = context.getInt("com.google.android.gms.version");
            if (i == 0x6c42d8)
            {
                return;
            } else
            {
                throw new IllegalStateException((new StringBuilder("The meta-data tag in your app's AndroidManifest.xml does not have the right value.  Expected 7095000 but found ")).append(i).append(".  You must have the following declaration within the <application> element:     <meta-data android:name=\"com.google.android.gms.version\" android:value=\"@integer/google_play_services_version\" />").toString());
            }
        } else
        {
            throw new IllegalStateException("A required meta-data tag in your app's AndroidManifest.xml does not exist.  You must have the following declaration within the <application> element:     <meta-data android:name=\"com.google.android.gms.version\" android:value=\"@integer/google_play_services_version\" />");
        }
    }

    public static void zzL(Context context)
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

    private static Dialog zza(int i, Activity activity, Fragment fragment, int j, android.content.DialogInterface.OnCancelListener oncancellistener)
    {
        int k;
        k = i;
        if (zzlu.zzQ(activity))
        {
            k = i;
            if (i == 2)
            {
                k = 42;
            }
        }
        if (!zzme.zzkg()) goto _L2; else goto _L1
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
        builder.setMessage(zze(activity, k));
        if (oncancellistener != null)
        {
            builder.setOnCancelListener(oncancellistener);
        }
        oncancellistener = zzan(k);
        if (fragment == null)
        {
            fragment = new zzg(activity, oncancellistener, j);
        } else
        {
            fragment = new zzg(fragment, oncancellistener, j);
        }
        activity = zzf(activity, k);
        if (activity != null)
        {
            builder.setPositiveButton(activity, fragment);
        }
        switch (k)
        {
        default:
            return builder.create();

        case 0: // '\0'
            return null;

        case 4: // '\004'
        case 6: // '\006'
            return builder.create();

        case 1: // '\001'
            return builder.setTitle(com.google.android.gms.R.string.common_google_play_services_install_title).create();

        case 3: // '\003'
            return builder.setTitle(com.google.android.gms.R.string.common_google_play_services_enable_title).create();

        case 2: // '\002'
            return builder.setTitle(com.google.android.gms.R.string.common_google_play_services_update_title).create();

        case 42: // '*'
            return builder.setTitle(com.google.android.gms.R.string.common_android_wear_update_title).create();

        case 9: // '\t'
            return builder.setTitle(com.google.android.gms.R.string.common_google_play_services_unsupported_title).create();

        case 7: // '\007'
            return builder.setTitle(com.google.android.gms.R.string.common_google_play_services_network_error_title).create();

        case 8: // '\b'
            return builder.create();

        case 10: // '\n'
            return builder.create();

        case 5: // '\005'
            return builder.setTitle(com.google.android.gms.R.string.common_google_play_services_invalid_account_title).create();

        case 11: // '\013'
            return builder.create();

        case 16: // '\020'
            return builder.create();

        case 17: // '\021'
            return builder.setTitle(com.google.android.gms.R.string.common_google_play_services_sign_in_failed_title).create();
        }
_L2:
        obj = null;
        if (true) goto _L5; else goto _L4
_L4:
    }

    public static boolean zza(Context context, int i, String s)
    {
label0:
        {
            {
                boolean flag1 = false;
                if (!zzme.zzkj())
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
        if (s == null)
        {
            continue;
        }
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

    public static boolean zza(Resources resources)
    {
        if (resources != null)
        {
            boolean flag;
            if ((resources.getConfiguration().screenLayout & 0xf) > 3)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (zzme.zzkd() && flag || zzb(resources))
            {
                return true;
            }
        }
        return false;
    }

    public static Intent zzan(int i)
    {
        switch (i)
        {
        default:
            return null;

        case 1: // '\001'
        case 2: // '\002'
            return zzo.zzbl("com.google.android.gms");

        case 42: // '*'
            return zzo.zzjl();

        case 3: // '\003'
            return zzo.zzbj("com.google.android.gms");
        }
    }

    public static boolean zzb(PackageManager packagemanager)
    {
        Object obj = zzLG;
        obj;
        JVM INSTR monitorenter ;
        int i = zzLF;
        if (i != -1) goto _L2; else goto _L1
_L1:
        packagemanager = packagemanager.getPackageInfo("com.google.android.gms", 64);
        if (com.google.android.gms.common.zzc.zzhP().zza(packagemanager, new zzb.zza[] {
            zzb.zzLv[1]
        }) == null) goto _L4; else goto _L3
_L3:
        zzLF = 1;
_L2:
        obj;
        JVM INSTR monitorexit ;
        return zzLF != 0;
_L4:
        zzLF = 0;
          goto _L2
        packagemanager;
        zzLF = 0;
          goto _L2
        packagemanager;
        obj;
        JVM INSTR monitorexit ;
        throw packagemanager;
    }

    public static boolean zzb(PackageManager packagemanager, String s)
    {
        return com.google.android.gms.common.zzc.zzhP().zzb(packagemanager, s);
    }

    private static boolean zzb(Resources resources)
    {
        boolean flag1 = false;
        resources = resources.getConfiguration();
        boolean flag = flag1;
        if (zzme.zzkf())
        {
            flag = flag1;
            if ((((Configuration) (resources)).screenLayout & 0xf) <= 3)
            {
                flag = flag1;
                if (((Configuration) (resources)).smallestScreenWidthDp >= 600)
                {
                    flag = true;
                }
            }
        }
        return flag;
    }

    public static boolean zzc(PackageManager packagemanager)
    {
        return zzb(packagemanager) || !zzhO();
    }

    public static boolean zzd(Context context, int i)
    {
        return zza(context, i, "com.google.android.gms") && zzb(context.getPackageManager(), "com.google.android.gms");
    }

    public static String zze(Context context, int i)
    {
        Resources resources = context.getResources();
        switch (i)
        {
        default:
            return resources.getString(com.google.android.gms.R.string.common_google_play_services_unknown_issue);

        case 1: // '\001'
            if (zza(context.getResources()))
            {
                return resources.getString(com.google.android.gms.R.string.common_google_play_services_install_text_tablet);
            } else
            {
                return resources.getString(com.google.android.gms.R.string.common_google_play_services_install_text_phone);
            }

        case 3: // '\003'
            return resources.getString(com.google.android.gms.R.string.common_google_play_services_enable_text);

        case 2: // '\002'
            return resources.getString(com.google.android.gms.R.string.common_google_play_services_update_text);

        case 42: // '*'
            return resources.getString(com.google.android.gms.R.string.common_android_wear_update_text);

        case 9: // '\t'
            return resources.getString(com.google.android.gms.R.string.common_google_play_services_unsupported_text);

        case 7: // '\007'
            return resources.getString(com.google.android.gms.R.string.common_google_play_services_network_error_text);

        case 5: // '\005'
            return resources.getString(com.google.android.gms.R.string.common_google_play_services_invalid_account_text);

        case 16: // '\020'
            return resources.getString(com.google.android.gms.R.string.commono_google_play_services_api_unavailable_text);

        case 17: // '\021'
            return resources.getString(com.google.android.gms.R.string.common_google_play_services_sign_in_failed_text);
        }
    }

    public static String zzf(Context context, int i)
    {
        context = context.getResources();
        switch (i)
        {
        default:
            return context.getString(0x104000a);

        case 1: // '\001'
            return context.getString(com.google.android.gms.R.string.common_google_play_services_install_button);

        case 3: // '\003'
            return context.getString(com.google.android.gms.R.string.common_google_play_services_enable_button);

        case 2: // '\002'
        case 42: // '*'
            return context.getString(com.google.android.gms.R.string.common_google_play_services_update_button);
        }
    }

    private static boolean zzg(Context context, String s)
    {
        if (zzme.zzkl())
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

    public static boolean zzh(Context context, int i)
    {
        if (i == 1)
        {
            return zzg(context, "com.google.android.gms");
        } else
        {
            return false;
        }
    }

    public static boolean zzhO()
    {
        if (zzLD)
        {
            return zzLE;
        } else
        {
            return "user".equals(Build.TYPE);
        }
    }

}
