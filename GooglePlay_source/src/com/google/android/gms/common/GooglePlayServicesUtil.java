// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common;

import android.app.Activity;
import android.app.AppOpsManager;
import android.app.Dialog;
import android.app.NotificationManager;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageInstaller;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.os.UserManager;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.text.TextUtils;
import android.util.Log;
import android.util.TypedValue;
import com.google.android.gms.common.internal.DialogRedirect;
import com.google.android.gms.common.util.BuildUtils;
import com.google.android.gms.common.util.DeviceProperties;
import com.google.android.gms.common.util.PlatformVersion;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

// Referenced classes of package com.google.android.gms.common:
//            GooglePlayServicesRepairableException, GooglePlayServicesNotAvailableException, GoogleApiAvailability, GoogleSignatureVerifier, 
//            GoogleCertificates, SupportErrorDialogFragment, ErrorDialogFragment

public final class GooglePlayServicesUtil
{

    public static final int GOOGLE_PLAY_SERVICES_VERSION_CODE = 0x7e6378;
    private static String sAppPackageName = null;
    static final AtomicBoolean sCanceledAvailabilityNotification = new AtomicBoolean();
    private static Integer sDeclaredVersionCache = null;
    private static int sIsTestKeys = -1;
    public static boolean sIsTestMode = false;
    private static final Object sLock = new Object();
    public static boolean sTestIsUserBuild = false;
    private static final AtomicBoolean sUsingApkIndependentContext = new AtomicBoolean();

    public static void cancelAvailabilityErrorNotifications(Context context)
    {
        if (sCanceledAvailabilityNotification.getAndSet(true))
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

    public static void ensurePlayServicesAvailable(Context context)
        throws GooglePlayServicesRepairableException, GooglePlayServicesNotAvailableException
    {
        GoogleApiAvailability.getInstance();
        int i = GoogleApiAvailability.isGooglePlayServicesAvailable(context);
        if (i != 0)
        {
            GoogleApiAvailability.getInstance();
            context = GoogleApiAvailability.getErrorResolutionIntent(context, i, "e");
            Log.e("GooglePlayServicesUtil", (new StringBuilder("GooglePlayServices not available due to error ")).append(i).toString());
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

    public static int getApkVersion(Context context)
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

    public static String getAppName(Context context)
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

    private static Dialog getErrorDialog(int i, Activity activity, Fragment fragment, int j, android.content.DialogInterface.OnCancelListener oncancellistener)
    {
        Object obj;
        android.app.AlertDialog.Builder builder;
        Resources resources;
        int k;
        if (i == 0)
        {
            return null;
        }
        k = i;
        if (BuildUtils.isWearable(activity))
        {
            k = i;
            if (i == 2)
            {
                k = 42;
            }
        }
        builder = null;
        obj = builder;
        if (PlatformVersion.checkVersion(14))
        {
            TypedValue typedvalue = new TypedValue();
            activity.getTheme().resolveAttribute(0x1010309, typedvalue, true);
            obj = builder;
            if ("Theme.Dialog.Alert".equals(activity.getResources().getResourceEntryName(typedvalue.resourceId)))
            {
                obj = new android.app.AlertDialog.Builder(activity, 5);
            }
        }
        builder = ((android.app.AlertDialog.Builder) (obj));
        if (obj == null)
        {
            builder = new android.app.AlertDialog.Builder(activity);
        }
        obj = getAppName(activity);
        resources = activity.getResources();
        k;
        JVM INSTR lookupswitch 10: default 224
    //                   1: 540
    //                   2: 636
    //                   3: 592
    //                   5: 715
    //                   7: 702
    //                   9: 680
    //                   16: 728
    //                   17: 750
    //                   18: 614
    //                   42: 658;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11
_L1:
        obj = resources.getString(0x7f100046);
_L31:
        builder.setMessage(((CharSequence) (obj)));
        if (oncancellistener != null)
        {
            builder.setOnCancelListener(oncancellistener);
        }
        GoogleApiAvailability.getInstance();
        oncancellistener = GoogleApiAvailability.getErrorResolutionIntent(activity, k, "d");
        if (fragment == null)
        {
            oncancellistener = new DialogRedirect(activity, oncancellistener, j);
        } else
        {
            oncancellistener = new DialogRedirect(fragment, oncancellistener, j);
        }
        fragment = activity.getResources();
        k;
        JVM INSTR lookupswitch 4: default 336
    //                   1: 779
    //                   2: 801
    //                   3: 790
    //                   42: 801;
           goto _L12 _L13 _L14 _L15 _L14
_L12:
        fragment = fragment.getString(0x104000a);
_L32:
        if (fragment != null)
        {
            builder.setPositiveButton(fragment, oncancellistener);
        }
        activity = activity.getResources();
        k;
        JVM INSTR lookupswitch 15: default 496
    //                   1: 817
    //                   2: 850
    //                   3: 828
    //                   4: 812
    //                   5: 944
    //                   6: 812
    //                   7: 893
    //                   8: 914
    //                   9: 872
    //                   10: 929
    //                   11: 965
    //                   16: 980
    //                   17: 995
    //                   18: 839
    //                   42: 861;
           goto _L16 _L17 _L18 _L19 _L20 _L21 _L20 _L22 _L23 _L24 _L25 _L26 _L27 _L28 _L29 _L30
_L28:
        break MISSING_BLOCK_LABEL_995;
_L16:
        Log.e("GoogleApiAvailability", (new StringBuilder("Unexpected error code ")).append(k).toString());
        activity = null;
_L33:
        if (activity != null)
        {
            builder.setTitle(activity);
        }
        return builder.create();
_L2:
        if (DeviceProperties.isTablet(resources))
        {
            obj = resources.getString(0x7f10003a, new Object[] {
                obj
            });
        } else
        {
            obj = resources.getString(0x7f100039, new Object[] {
                obj
            });
        }
          goto _L31
_L4:
        obj = resources.getString(0x7f100034, new Object[] {
            obj
        });
          goto _L31
_L10:
        obj = resources.getString(0x7f10004c, new Object[] {
            obj
        });
          goto _L31
_L3:
        obj = resources.getString(0x7f10004a, new Object[] {
            obj
        });
          goto _L31
_L11:
        obj = resources.getString(0x7f10001d, new Object[] {
            obj
        });
          goto _L31
_L7:
        obj = resources.getString(0x7f100047, new Object[] {
            obj
        });
          goto _L31
_L6:
        obj = resources.getString(0x7f10003f);
          goto _L31
_L5:
        obj = resources.getString(0x7f10003c);
          goto _L31
_L8:
        obj = resources.getString(0x7f100032, new Object[] {
            obj
        });
          goto _L31
_L9:
        obj = resources.getString(0x7f100044);
          goto _L31
_L13:
        fragment = fragment.getString(0x7f100038);
          goto _L32
_L15:
        fragment = fragment.getString(0x7f100033);
          goto _L32
_L14:
        fragment = fragment.getString(0x7f100049);
          goto _L32
_L20:
        activity = null;
          goto _L33
_L17:
        activity = activity.getString(0x7f10003b);
          goto _L33
_L19:
        activity = activity.getString(0x7f100035);
          goto _L33
_L29:
        activity = activity.getString(0x7f10004d);
          goto _L33
_L18:
        activity = activity.getString(0x7f10004b);
          goto _L33
_L30:
        activity = activity.getString(0x7f10001e);
          goto _L33
_L24:
        Log.e("GoogleApiAvailability", "Google Play services is invalid. Cannot recover.");
        activity = activity.getString(0x7f100048);
          goto _L33
_L22:
        Log.e("GoogleApiAvailability", "Network error occurred. Please retry request later.");
        activity = activity.getString(0x7f100040);
          goto _L33
_L23:
        Log.e("GoogleApiAvailability", "Internal error occurred. Please see logs for detailed information");
        activity = null;
          goto _L33
_L25:
        Log.e("GoogleApiAvailability", "Developer error occurred. Please see logs for detailed information");
        activity = null;
          goto _L33
_L21:
        Log.e("GoogleApiAvailability", "An invalid account was specified when connecting. Please provide a valid account.");
        activity = activity.getString(0x7f10003d);
          goto _L33
_L26:
        Log.e("GoogleApiAvailability", "The application is not licensed to the user.");
        activity = null;
          goto _L33
_L27:
        Log.e("GoogleApiAvailability", "One of the API components you attempted to connect to is not available.");
        activity = null;
          goto _L33
        Log.e("GoogleApiAvailability", "The specified account could not be signed in.");
        activity = activity.getString(0x7f100045);
          goto _L33
    }

    public static Dialog getErrorDialog$7b9fd7d3(int i, Activity activity)
    {
        return getErrorDialog(i, activity, null, 901, null);
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

    public static boolean honorsDebugCertificates(PackageManager packagemanager)
    {
        return isTestKeysBuild(packagemanager) || !isUserBuildDevice();
    }

    public static int isGooglePlayServicesAvailable(Context context)
    {
        Object obj;
        PackageManager packagemanager;
        Object obj1;
        packagemanager = context.getPackageManager();
        try
        {
            context.getResources().getString(0x7f100046);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            Log.e("GooglePlayServicesUtil", "The Google Play services resources were not found. Check your project configuration to ensure that the resources are included.");
        }
        if ("com.google.android.gms".equals(context.getPackageName()) || sUsingApkIndependentContext.get())
        {
            break MISSING_BLOCK_LABEL_261;
        }
        obj = sLock;
        obj;
        JVM INSTR monitorenter ;
        if (sAppPackageName != null) goto _L2; else goto _L1
_L1:
        sAppPackageName = context.getPackageName();
        obj1 = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
        if (obj1 == null) goto _L4; else goto _L3
_L3:
        sDeclaredVersionCache = Integer.valueOf(((Bundle) (obj1)).getInt("com.google.android.gms.version"));
_L5:
        obj1 = sDeclaredVersionCache;
        obj;
        JVM INSTR monitorexit ;
        if (obj1 == null)
        {
            throw new IllegalStateException("A required meta-data tag in your app's AndroidManifest.xml does not exist.  You must have the following declaration within the <application> element:     <meta-data android:name=\"com.google.android.gms.version\" android:value=\"@integer/google_play_services_version\" />");
        }
        break MISSING_BLOCK_LABEL_209;
_L4:
        sDeclaredVersionCache = null;
          goto _L5
        obj1;
        Log.wtf("GooglePlayServicesUtil", "This should never happen.", ((Throwable) (obj1)));
          goto _L5
        context;
        obj;
        JVM INSTR monitorexit ;
        throw context;
_L2:
        if (sAppPackageName.equals(context.getPackageName())) goto _L5; else goto _L6
_L6:
        throw new IllegalArgumentException((new StringBuilder("isGooglePlayServicesAvailable should only be called with Context from your application's package. A previous call used package '")).append(sAppPackageName).append("' and this call used package '").append(context.getPackageName()).append("'.").toString());
        if (((Integer) (obj1)).intValue() != 0x7e6378)
        {
            throw new IllegalStateException((new StringBuilder("The meta-data tag in your app's AndroidManifest.xml does not have the right value.  Expected 8283000")).append(" but found ").append(obj1).append(".  You must have the following declaration within the <application> element:     <meta-data android:name=\"com.google.android.gms.version").append("\" android:value=\"@integer/google_play_services_version\" />").toString());
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
        GoogleSignatureVerifier.getInstance();
        if (BuildUtils.isWearable(context))
        {
            if (GoogleSignatureVerifier.verifySignature(((PackageInfo) (obj)), GoogleCertificates.VALID_PUBLIC_SIGNATURES.KEYS) == null)
            {
                Log.w("GooglePlayServicesUtil", "Google Play services signature invalid.");
                return 9;
            }
            break MISSING_BLOCK_LABEL_387;
        }
        try
        {
            context = GoogleSignatureVerifier.verifySignature(packagemanager.getPackageInfo("com.android.vending", 8256), GoogleCertificates.VALID_PUBLIC_SIGNATURES.KEYS);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            Log.w("GooglePlayServicesUtil", "Google Play Store is neither installed nor updating.");
            return 9;
        }
        if (context != null)
        {
            break MISSING_BLOCK_LABEL_360;
        }
        Log.w("GooglePlayServicesUtil", "Google Play Store signature invalid.");
        return 9;
        if (GoogleSignatureVerifier.verifySignature(((PackageInfo) (obj)), new GoogleCertificates.CertData[] {
    context
}) != null)
        {
            break MISSING_BLOCK_LABEL_387;
        }
        Log.w("GooglePlayServicesUtil", "Google Play services signature invalid.");
        return 9;
        int i = BuildUtils.parseBuildVersion(0x7e6378);
        if (BuildUtils.parseBuildVersion(((PackageInfo) (obj)).versionCode) < i)
        {
            Log.w("GooglePlayServicesUtil", (new StringBuilder("Google Play services out of date.  Requires 8283000")).append(" but found ").append(((PackageInfo) (obj)).versionCode).toString());
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
                Log.wtf("GooglePlayServicesUtil", "Google Play services missing when getting application info.", context);
                return 1;
            }
        }
        return ((ApplicationInfo) (context)).enabled ? 0 : 3;
    }

    public static boolean isGooglePlayServicesUid(Context context, int i)
    {
        return uidHasPackageName(context, i, "com.google.android.gms") && isPackageGoogleSigned(context.getPackageManager(), "com.google.android.gms");
    }

    public static boolean isPackageGoogleSigned(PackageManager packagemanager, String s)
    {
        return GoogleSignatureVerifier.getInstance().isPackageGoogleSigned(packagemanager, s);
    }

    public static boolean isPlayServicesPossiblyUpdating(Context context, int i)
    {
        if (i == 18)
        {
            return true;
        }
        if (i == 1)
        {
            return isUninstalledAppPossiblyUpdating(context, "com.google.android.gms");
        } else
        {
            return false;
        }
    }

    public static boolean isRestrictedUserProfile(Context context)
    {
        if (PlatformVersion.checkVersion(18))
        {
            context = ((UserManager)context.getSystemService("user")).getApplicationRestrictions(context.getPackageName());
            if (context != null && "true".equals(context.getString("restricted_profile")))
            {
                return true;
            }
        }
        return false;
    }

    public static boolean isSidewinderDevice(Context context)
    {
        context = context.getPackageManager();
        return PlatformVersion.checkVersion(21) && context.hasSystemFeature("cn.google");
    }

    private static boolean isTestKeysBuild(PackageManager packagemanager)
    {
        boolean flag = true;
        Object obj = sLock;
        obj;
        JVM INSTR monitorenter ;
        int i = sIsTestKeys;
        if (i != -1) goto _L2; else goto _L1
_L1:
        packagemanager = packagemanager.getPackageInfo("com.google.android.gms", 64);
        GoogleSignatureVerifier.getInstance();
        if (GoogleSignatureVerifier.verifySignature(packagemanager, new GoogleCertificates.CertData[] {
            GoogleCertificates.VALID_GOOGLE_SIGNATURES[1]
        }) == null) goto _L4; else goto _L3
_L3:
        sIsTestKeys = 1;
_L2:
        if (sIsTestKeys == 0)
        {
            flag = false;
        }
        obj;
        JVM INSTR monitorexit ;
        return flag;
_L4:
        sIsTestKeys = 0;
          goto _L2
        packagemanager;
        sIsTestKeys = 0;
          goto _L2
        packagemanager;
        obj;
        JVM INSTR monitorexit ;
        throw packagemanager;
    }

    static boolean isUninstalledAppPossiblyUpdating(Context context, String s)
    {
        boolean flag = false;
        if (!PlatformVersion.checkVersion(21)) goto _L2; else goto _L1
_L1:
        Iterator iterator = context.getPackageManager().getPackageInstaller().getAllSessions().iterator();
_L5:
        if (!iterator.hasNext()) goto _L2; else goto _L3
_L3:
        if (!s.equals(((android.content.pm.PackageInstaller.SessionInfo)iterator.next()).getAppPackageName())) goto _L5; else goto _L4
_L4:
        flag = true;
_L7:
        return flag;
_L2:
        if (!isRestrictedUserProfile(context))
        {
            context = context.getPackageManager();
            boolean flag1;
            try
            {
                flag1 = context.getApplicationInfo(s, 8192).enabled;
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                return false;
            }
            return flag1;
        }
        if (true) goto _L7; else goto _L6
_L6:
    }

    private static boolean isUserBuildDevice()
    {
        return "user".equals(Build.TYPE);
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

    public static void showDialogFragment(Activity activity, android.content.DialogInterface.OnCancelListener oncancellistener, String s, Dialog dialog)
    {
        if (activity instanceof FragmentActivity)
        {
            activity = ((FragmentActivity)activity).mFragments;
            SupportErrorDialogFragment.newInstance(dialog, oncancellistener).show(activity, s);
            return;
        }
        if (PlatformVersion.checkVersion(11))
        {
            activity = activity.getFragmentManager();
            ErrorDialogFragment.newInstance(dialog, oncancellistener).show(activity, s);
            return;
        } else
        {
            throw new RuntimeException("This Activity does not support Fragments.");
        }
    }

    public static boolean showErrorDialogFragment(int i, Activity activity, Fragment fragment, int j, android.content.DialogInterface.OnCancelListener oncancellistener)
    {
        fragment = getErrorDialog(i, activity, fragment, j, oncancellistener);
        if (fragment == null)
        {
            return false;
        } else
        {
            showDialogFragment(activity, oncancellistener, "GooglePlayServicesErrorDialog", fragment);
            return true;
        }
    }

    public static boolean showErrorDialogFragment$70a48c07(int i, Activity activity)
    {
        return showErrorDialogFragment(i, activity, null, 0, null);
    }

    public static boolean uidHasPackageName(Context context, int i, String s)
    {
        if (!PlatformVersion.checkVersion(19)) goto _L2; else goto _L1
_L1:
        context = (AppOpsManager)context.getSystemService("appops");
        try
        {
            context.checkPackage(i, s);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            return false;
        }
_L4:
        return true;
_L2:
label0:
        {
            context = context.getPackageManager().getPackagesForUid(i);
            if (s == null || context == null)
            {
                break label0;
            }
            i = 0;
            do
            {
                if (i >= context.length)
                {
                    break label0;
                }
                if (s.equals(context[i]))
                {
                    break;
                }
                i++;
            } while (true);
        }
        if (true) goto _L4; else goto _L3
_L3:
        return false;
    }

    public static void verifyPackageIsGoogleSigned(PackageManager packagemanager, String s)
        throws SecurityException
    {
        if (!GoogleSignatureVerifier.getInstance().isPackageGoogleSigned(packagemanager, s))
        {
            throw new SecurityException((new StringBuilder("Signature check failed for ")).append(s).toString());
        } else
        {
            return;
        }
    }

}
