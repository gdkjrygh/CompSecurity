// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common;

import android.app.AppOpsManager;
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
import android.util.Log;
import com.google.android.gms.common.internal.zzd;
import com.google.android.gms.common.internal.zzm;
import com.google.android.gms.internal.zzkz;
import com.google.android.gms.internal.zzlk;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

// Referenced classes of package com.google.android.gms.common:
//            zzd, GooglePlayServicesRepairableException, GooglePlayServicesNotAvailableException, zzc

public final class GooglePlayServicesUtil
{

    public static final int GOOGLE_PLAY_SERVICES_VERSION_CODE = zzml();
    public static boolean zzVS = false;
    public static boolean zzVT = false;
    private static int zzVU = -1;
    private static String zzVV = null;
    private static Integer zzVW = null;
    static final AtomicBoolean zzVX = new AtomicBoolean();
    private static final Object zzoW = new Object();

    private GooglePlayServicesUtil()
    {
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
        Object obj;
        PackageManager packagemanager;
        if (zzd.zzZR)
        {
            return 0;
        }
        packagemanager = context.getPackageManager();
        com.google.android.gms.common.zzd zzd1;
        try
        {
            context.getResources().getString(com.google.android.gms.R.string.common_google_play_services_unknown_issue);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            Log.e("GooglePlayServicesUtil", "The Google Play services resources were not found. Check your project configuration to ensure that the resources are included.");
        }
        if (!"com.google.android.gms".equals(context.getPackageName()))
        {
            zzaa(context);
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
        zzd1 = com.google.android.gms.common.zzd.zzmn();
        if (zzkz.zzbP(((PackageInfo) (obj)).versionCode) || zzkz.zzai(context))
        {
            if (zzd1.zza(((PackageInfo) (obj)), zzc.zzbk.zzVR) == null)
            {
                Log.w("GooglePlayServicesUtil", "Google Play services signature invalid.");
                return 9;
            }
            break MISSING_BLOCK_LABEL_228;
        }
        Object obj1;
        try
        {
            obj1 = zzd1.zza(packagemanager.getPackageInfo("com.android.vending", 64), zzc.zzbk.zzVR);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj1)
        {
            if (zzh(context, "com.android.vending"))
            {
                Log.w("GooglePlayServicesUtil", "Google Play Store is updating.");
                if (zzd1.zza(((PackageInfo) (obj)), zzc.zzbk.zzVR) == null)
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
        if (zzd1.zza(((PackageInfo) (obj)), new zzc.zza[] {
    obj1
}) != null)
        {
            break MISSING_BLOCK_LABEL_228;
        }
        Log.w("GooglePlayServicesUtil", "Google Play services signature invalid.");
        return 9;
        int i = zzkz.zzbN(GOOGLE_PLAY_SERVICES_VERSION_CODE);
        if (zzkz.zzbN(((PackageInfo) (obj)).versionCode) < i)
        {
            Log.w("GooglePlayServicesUtil", (new StringBuilder()).append("Google Play services out of date.  Requires ").append(GOOGLE_PLAY_SERVICES_VERSION_CODE).append(" but found ").append(((PackageInfo) (obj)).versionCode).toString());
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

    public static void zzY(Context context)
        throws GooglePlayServicesRepairableException, GooglePlayServicesNotAvailableException
    {
        int i = isGooglePlayServicesAvailable(context);
        if (i != 0)
        {
            context = zzaT(i);
            Log.e("GooglePlayServicesUtil", (new StringBuilder()).append("GooglePlayServices not available due to error ").append(i).toString());
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

    public static boolean zza(Context context, int i, String s)
    {
label0:
        {
            {
                boolean flag1 = false;
                if (!zzlk.zzoX())
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
        break MISSING_BLOCK_LABEL_27;
_L1:
    }

    public static Intent zzaT(int i)
    {
        switch (i)
        {
        default:
            return null;

        case 1: // '\001'
        case 2: // '\002'
            return zzm.zzcg("com.google.android.gms");

        case 42: // '*'
            return zzm.zznX();

        case 3: // '\003'
            return zzm.zzce("com.google.android.gms");
        }
    }

    private static void zzaa(Context context)
    {
        Object obj = zzoW;
        obj;
        JVM INSTR monitorenter ;
        if (zzVV != null) goto _L2; else goto _L1
_L1:
        zzVV = context.getPackageName();
        context = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
        if (context == null) goto _L4; else goto _L3
_L3:
        zzVW = Integer.valueOf(context.getInt("com.google.android.gms.version"));
_L5:
        context = zzVW;
        obj;
        JVM INSTR monitorexit ;
        if (context == null)
        {
            throw new IllegalStateException("A required meta-data tag in your app's AndroidManifest.xml does not exist.  You must have the following declaration within the <application> element:     <meta-data android:name=\"com.google.android.gms.version\" android:value=\"@integer/google_play_services_version\" />");
        }
        break MISSING_BLOCK_LABEL_163;
_L4:
        zzVW = null;
          goto _L5
        context;
        Log.wtf("GooglePlayServicesUtil", "This should never happen.", context);
          goto _L5
        context;
        obj;
        JVM INSTR monitorexit ;
        throw context;
_L2:
        if (zzVV.equals(context.getPackageName())) goto _L5; else goto _L6
_L6:
        throw new IllegalArgumentException((new StringBuilder()).append("isGooglePlayServicesAvailable should only be called with Context from your application's package. A previous call used package '").append(zzVV).append("' and this call used package '").append(context.getPackageName()).append("'.").toString());
        if (context.intValue() != GOOGLE_PLAY_SERVICES_VERSION_CODE)
        {
            throw new IllegalStateException((new StringBuilder()).append("The meta-data tag in your app's AndroidManifest.xml does not have the right value.  Expected ").append(GOOGLE_PLAY_SERVICES_VERSION_CODE).append(" but").append(" found ").append(context).append(".  You must have the").append(" following declaration within the <application> element: ").append("    <meta-data android:name=\"").append("com.google.android.gms.version").append("\" android:value=\"@integer/google_play_services_version\" />").toString());
        } else
        {
            return;
        }
    }

    public static void zzac(Context context)
    {
        if (zzVX.getAndSet(true))
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

    public static boolean zzae(Context context)
    {
        context = context.getPackageManager();
        return zzlk.zzoZ() && context.hasSystemFeature("com.google.sidewinder");
    }

    public static boolean zzb(PackageManager packagemanager)
    {
        Object obj = zzoW;
        obj;
        JVM INSTR monitorenter ;
        int i = zzVU;
        if (i != -1) goto _L2; else goto _L1
_L1:
        packagemanager = packagemanager.getPackageInfo("com.google.android.gms", 64);
        if (com.google.android.gms.common.zzd.zzmn().zza(packagemanager, new zzc.zza[] {
            zzc.zzVK[1]
        }) == null) goto _L4; else goto _L3
_L3:
        zzVU = 1;
_L2:
        obj;
        JVM INSTR monitorexit ;
        return zzVU != 0;
_L4:
        zzVU = 0;
          goto _L2
        packagemanager;
        zzVU = 0;
          goto _L2
        packagemanager;
        obj;
        JVM INSTR monitorexit ;
        throw packagemanager;
    }

    public static boolean zzb(PackageManager packagemanager, String s)
    {
        return com.google.android.gms.common.zzd.zzmn().zzb(packagemanager, s);
    }

    public static boolean zzc(PackageManager packagemanager)
    {
        return zzb(packagemanager) || !zzmm();
    }

    public static boolean zzd(Context context, int i)
    {
        return zza(context, i, "com.google.android.gms") && zzb(context.getPackageManager(), "com.google.android.gms");
    }

    public static boolean zzh(Context context, String s)
    {
        if (zzlk.zzoZ())
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

    private static int zzml()
    {
        return 0x738638;
    }

    public static boolean zzmm()
    {
        if (zzVS)
        {
            return zzVT;
        } else
        {
            return "user".equals(Build.TYPE);
        }
    }

}
