// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common;

import android.app.Activity;
import android.app.Dialog;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import android.util.TypedValue;
import com.google.android.gms.internal.jf;
import com.google.android.gms.internal.jh;
import com.google.android.gms.internal.jo;
import com.google.android.gms.internal.jx;
import com.google.android.gms.internal.lc;
import com.google.android.gms.internal.ll;
import java.io.InputStream;
import java.util.Arrays;
import java.util.NoSuchElementException;
import java.util.Scanner;
import java.util.Set;

// Referenced classes of package com.google.android.gms.common:
//            GooglePlayServicesRepairableException, GooglePlayServicesNotAvailableException, b, SupportErrorDialogFragment, 
//            ErrorDialogFragment

public final class GooglePlayServicesUtil
{
    private static class a extends Handler
    {

        private final Context mO;

        public void handleMessage(Message message)
        {
            message.what;
            JVM INSTR tableswitch 1 1: default 24
        //                       1 53;
               goto _L1 _L2
_L1:
            Log.w("GooglePlayServicesUtil", (new StringBuilder()).append("Don't know how to handle this message: ").append(message.what).toString());
_L4:
            return;
_L2:
            int i = GooglePlayServicesUtil.isGooglePlayServicesAvailable(mO);
            if (GooglePlayServicesUtil.isUserRecoverableError(i))
            {
                GooglePlayServicesUtil.b(i, mO);
                return;
            }
            if (true) goto _L4; else goto _L3
_L3:
        }

        a(Context context)
        {
            Looper looper;
            if (Looper.myLooper() == null)
            {
                looper = Looper.getMainLooper();
            } else
            {
                looper = Looper.myLooper();
            }
            super(looper);
            mO = context.getApplicationContext();
        }
    }


    public static final String GMS_ERROR_DIALOG = "GooglePlayServicesErrorDialog";
    public static final String GOOGLE_PLAY_SERVICES_PACKAGE = "com.google.android.gms";
    public static final int GOOGLE_PLAY_SERVICES_VERSION_CODE = 0x648278;
    public static final String GOOGLE_PLAY_STORE_PACKAGE = "com.android.vending";
    public static boolean Jg = false;
    public static boolean Jh = false;
    private static int Ji = -1;
    private static final Object Jj = new Object();

    private GooglePlayServicesUtil()
    {
    }

    public static void C(Context context)
        throws GooglePlayServicesRepairableException, GooglePlayServicesNotAvailableException
    {
        int i = isGooglePlayServicesAvailable(context);
        if (i != 0)
        {
            context = aj(i);
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

    private static void D(Context context)
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
            if (i == 0x648278)
            {
                return;
            } else
            {
                throw new IllegalStateException((new StringBuilder()).append("The meta-data tag in your app's AndroidManifest.xml does not have the right value.  Expected 6587000 but found ").append(i).append(".  You must have the").append(" following declaration within the <application> element: ").append("    <meta-data android:name=\"").append("com.google.android.gms.version").append("\" android:value=\"@integer/google_play_services_version\" />").toString());
            }
        } else
        {
            throw new IllegalStateException("A required meta-data tag in your app's AndroidManifest.xml does not exist.  You must have the following declaration within the <application> element:     <meta-data android:name=\"com.google.android.gms.version\" android:value=\"@integer/google_play_services_version\" />");
        }
    }

    private static void E(Context context)
    {
        context = new a(context);
        context.sendMessageDelayed(context.obtainMessage(1), 0x1d4c0L);
    }

    private static String F(Context context)
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

    private static Dialog a(int i, Activity activity, Fragment fragment, int j, android.content.DialogInterface.OnCancelListener oncancellistener)
    {
        int k;
        k = i;
        if (lc.K(activity))
        {
            k = i;
            if (i == 2)
            {
                k = 42;
            }
        }
        if (!ll.ij()) goto _L2; else goto _L1
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
        builder.setMessage(b(activity, k));
        if (oncancellistener != null)
        {
            builder.setOnCancelListener(oncancellistener);
        }
        oncancellistener = aj(k);
        if (fragment == null)
        {
            fragment = new jh(activity, oncancellistener, j);
        } else
        {
            fragment = new jh(fragment, oncancellistener, j);
        }
        activity = c(activity, k);
        if (activity != null)
        {
            builder.setPositiveButton(activity, fragment);
        }
        switch (k)
        {
        default:
            Log.e("GooglePlayServicesUtil", (new StringBuilder()).append("Unexpected error code ").append(k).toString());
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
            Log.e("GooglePlayServicesUtil", "Google Play services is invalid. Cannot recover.");
            return builder.setTitle(com.google.android.gms.R.string.common_google_play_services_unsupported_title).create();

        case 7: // '\007'
            Log.e("GooglePlayServicesUtil", "Network error occurred. Please retry request later.");
            return builder.setTitle(com.google.android.gms.R.string.common_google_play_services_network_error_title).create();

        case 8: // '\b'
            Log.e("GooglePlayServicesUtil", "Internal error occurred. Please see logs for detailed information");
            return builder.create();

        case 10: // '\n'
            Log.e("GooglePlayServicesUtil", "Developer error occurred. Please see logs for detailed information");
            return builder.create();

        case 5: // '\005'
            Log.e("GooglePlayServicesUtil", "An invalid account was specified when connecting. Please provide a valid account.");
            return builder.setTitle(com.google.android.gms.R.string.common_google_play_services_invalid_account_title).create();

        case 11: // '\013'
            Log.e("GooglePlayServicesUtil", "The application is not licensed to the user.");
            break;
        }
        return builder.create();
_L2:
        obj = null;
        if (true) goto _L5; else goto _L4
_L4:
    }

    private static void a(int i, Context context)
    {
        Object obj = context.getResources();
        String s = d(context, i);
        String s1 = ((Resources) (obj)).getString(com.google.android.gms.R.string.common_google_play_services_error_notification_requested_by_msg, new Object[] {
            F(context)
        });
        PendingIntent pendingintent = getErrorPendingIntent(i, context, 0);
        if (lc.K(context))
        {
            jx.K(ll.ik());
            obj = (new android.app.Notification.Builder(context)).setSmallIcon(com.google.android.gms.R.drawable.common_ic_googleplayservices).setPriority(2).setAutoCancel(true).setStyle((new android.app.Notification.BigTextStyle()).bigText((new StringBuilder()).append(s).append(" ").append(s1).toString())).addAction(com.google.android.gms.R.drawable.common_full_open_on_phone, ((Resources) (obj)).getString(com.google.android.gms.R.string.common_open_on_phone), pendingintent).build();
        } else
        {
            obj = new Notification(0x108008a, ((Resources) (obj)).getString(com.google.android.gms.R.string.common_google_play_services_notification_ticker), System.currentTimeMillis());
            obj.flags = ((Notification) (obj)).flags | 0x10;
            ((Notification) (obj)).setLatestEventInfo(context, s, s1, pendingintent);
        }
        ((NotificationManager)context.getSystemService("notification")).notify(ak(i), ((Notification) (obj)));
    }

    public static boolean a(PackageManager packagemanager, PackageInfo packageinfo)
    {
        boolean flag = true;
        boolean flag2 = false;
        boolean flag1 = false;
        if (packageinfo != null)
        {
            if (c(packagemanager))
            {
                if (a(packageinfo, true) == null)
                {
                    flag = false;
                }
                return flag;
            }
            flag = flag2;
            if (a(packageinfo, false) != null)
            {
                flag = true;
            }
            flag1 = flag;
            if (!flag)
            {
                flag1 = flag;
                if (a(packageinfo, true) != null)
                {
                    Log.w("GooglePlayServicesUtil", "Test-keys aren't accepted on this build.");
                    return flag;
                }
            }
        }
        return flag1;
    }

    public static boolean a(Resources resources)
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
            if (ll.ig() && flag || b(resources))
            {
                return true;
            }
        }
        return false;
    }

    private static byte[] a(PackageInfo packageinfo, boolean flag)
    {
        if (packageinfo.signatures.length != 1)
        {
            Log.w("GooglePlayServicesUtil", "Package has more than one signature.");
            return null;
        }
        byte abyte0[] = packageinfo.signatures[0].toByteArray();
        if (flag)
        {
            packageinfo = com.google.android.gms.common.b.gu();
        } else
        {
            packageinfo = com.google.android.gms.common.b.gv();
        }
        if (packageinfo.contains(abyte0))
        {
            return abyte0;
        }
        if (Log.isLoggable("GooglePlayServicesUtil", 2))
        {
            Log.v("GooglePlayServicesUtil", (new StringBuilder()).append("Signature not valid.  Found: \n").append(Base64.encodeToString(abyte0, 0)).toString());
        }
        return null;
    }

    private static transient byte[] a(PackageInfo packageinfo, byte abyte0[][])
    {
        if (packageinfo.signatures.length != 1)
        {
            Log.w("GooglePlayServicesUtil", "Package has more than one signature.");
            return null;
        }
        packageinfo = packageinfo.signatures[0].toByteArray();
        for (int i = 0; i < abyte0.length; i++)
        {
            byte abyte1[] = abyte0[i];
            if (Arrays.equals(abyte1, packageinfo))
            {
                return abyte1;
            }
        }

        if (Log.isLoggable("GooglePlayServicesUtil", 2))
        {
            Log.v("GooglePlayServicesUtil", (new StringBuilder()).append("Signature not valid.  Found: \n").append(Base64.encodeToString(packageinfo, 0)).toString());
        }
        return null;
    }

    public static Intent aj(int i)
    {
        switch (i)
        {
        default:
            return null;

        case 1: // '\001'
        case 2: // '\002'
            return jo.ba("com.google.android.gms");

        case 42: // '*'
            return jo.hE();

        case 3: // '\003'
            return jo.aY("com.google.android.gms");
        }
    }

    private static int ak(int i)
    {
        switch (i)
        {
        case 2: // '\002'
        default:
            return 39789;

        case 1: // '\001'
        case 3: // '\003'
            return 10436;
        }
    }

    public static String b(Context context, int i)
    {
        Resources resources = context.getResources();
        switch (i)
        {
        default:
            return resources.getString(com.google.android.gms.R.string.common_google_play_services_unknown_issue);

        case 1: // '\001'
            if (a(context.getResources()))
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
        }
    }

    static void b(int i, Context context)
    {
        a(i, context);
    }

    public static boolean b(PackageManager packagemanager)
    {
        Object obj = Jj;
        obj;
        JVM INSTR monitorenter ;
        int i = Ji;
        if (i != -1) goto _L2; else goto _L1
_L1:
        if (a(packagemanager.getPackageInfo("com.google.android.gms", 64), new byte[][] {
            b.Jc[1]
        }) == null) goto _L4; else goto _L3
_L3:
        Ji = 1;
_L2:
        obj;
        JVM INSTR monitorexit ;
        return Ji != 0;
_L4:
        Ji = 0;
          goto _L2
        packagemanager;
        Ji = 0;
          goto _L2
        packagemanager;
        obj;
        JVM INSTR monitorexit ;
        throw packagemanager;
    }

    public static boolean b(PackageManager packagemanager, String s)
    {
        PackageInfo packageinfo;
        try
        {
            packageinfo = packagemanager.getPackageInfo(s, 64);
        }
        // Misplaced declaration of an exception variable
        catch (PackageManager packagemanager)
        {
            if (Log.isLoggable("GooglePlayServicesUtil", 3))
            {
                Log.d("GooglePlayServicesUtil", (new StringBuilder()).append("Package manager can't find package ").append(s).append(", defaulting to false").toString());
            }
            return false;
        }
        return a(packagemanager, packageinfo);
    }

    private static boolean b(Resources resources)
    {
        boolean flag1 = false;
        resources = resources.getConfiguration();
        boolean flag = flag1;
        if (ll.ii())
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

    public static String c(Context context, int i)
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

    public static boolean c(PackageManager packagemanager)
    {
        return b(packagemanager) || !gw();
    }

    public static String d(Context context, int i)
    {
        context = context.getResources();
        switch (i)
        {
        default:
            return context.getString(com.google.android.gms.R.string.common_google_play_services_unknown_issue);

        case 1: // '\001'
            return context.getString(com.google.android.gms.R.string.common_google_play_services_notification_needs_installation_title);

        case 2: // '\002'
            return context.getString(com.google.android.gms.R.string.common_google_play_services_notification_needs_update_title);

        case 42: // '*'
            return context.getString(com.google.android.gms.R.string.common_android_wear_notification_needs_update_text);

        case 3: // '\003'
            return context.getString(com.google.android.gms.R.string.common_google_play_services_needs_enabling_title);

        case 9: // '\t'
            return context.getString(com.google.android.gms.R.string.common_google_play_services_unsupported_text);

        case 7: // '\007'
            return context.getString(com.google.android.gms.R.string.common_google_play_services_network_error_text);

        case 5: // '\005'
            return context.getString(com.google.android.gms.R.string.common_google_play_services_invalid_account_text);
        }
    }

    public static boolean e(Context context, int i)
    {
        if (i != 1)
        {
            break MISSING_BLOCK_LABEL_30;
        }
        context = context.getPackageManager();
        boolean flag = context.getApplicationInfo("com.google.android.gms", 8192).enabled;
        if (flag)
        {
            return true;
        }
        break MISSING_BLOCK_LABEL_30;
        context;
        return false;
    }

    public static Dialog getErrorDialog(int i, Activity activity, int j)
    {
        return getErrorDialog(i, activity, j, null);
    }

    public static Dialog getErrorDialog(int i, Activity activity, int j, android.content.DialogInterface.OnCancelListener oncancellistener)
    {
        return a(i, activity, null, j, oncancellistener);
    }

    public static PendingIntent getErrorPendingIntent(int i, Context context, int j)
    {
        Intent intent = aj(i);
        if (intent == null)
        {
            return null;
        } else
        {
            return PendingIntent.getActivity(context, j, intent, 0x10000000);
        }
    }

    public static String getErrorString(int i)
    {
        switch (i)
        {
        default:
            return "UNKNOWN_ERROR_CODE";

        case 0: // '\0'
            return "SUCCESS";

        case 1: // '\001'
            return "SERVICE_MISSING";

        case 2: // '\002'
            return "SERVICE_VERSION_UPDATE_REQUIRED";

        case 3: // '\003'
            return "SERVICE_DISABLED";

        case 4: // '\004'
            return "SIGN_IN_REQUIRED";

        case 5: // '\005'
            return "INVALID_ACCOUNT";

        case 6: // '\006'
            return "RESOLUTION_REQUIRED";

        case 7: // '\007'
            return "NETWORK_ERROR";

        case 8: // '\b'
            return "INTERNAL_ERROR";

        case 9: // '\t'
            return "SERVICE_INVALID";

        case 10: // '\n'
            return "DEVELOPER_ERROR";

        case 11: // '\013'
            return "LICENSE_CHECK_FAILED";
        }
    }

    public static String getOpenSourceSoftwareLicenseInfo(Context context)
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

    public static boolean gw()
    {
        if (Jg)
        {
            return Jh;
        } else
        {
            return "user".equals(Build.TYPE);
        }
    }

    public static int isGooglePlayServicesAvailable(Context context)
    {
        Object obj;
        Object obj1;
label0:
        {
            obj = context.getPackageManager();
            if (!jf.Mv)
            {
                try
                {
                    context.getResources().getString(com.google.android.gms.R.string.common_google_play_services_unknown_issue);
                }
                // Misplaced declaration of an exception variable
                catch (Object obj1)
                {
                    Log.e("GooglePlayServicesUtil", "The Google Play services resources were not found. Check your project configuration to ensure that the resources are included.");
                }
            }
            if (!jf.Mv)
            {
                D(context);
            }
            try
            {
                obj1 = ((PackageManager) (obj)).getPackageInfo("com.google.android.gms", 64);
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                Log.w("GooglePlayServicesUtil", "Google Play services is missing.");
                return 1;
            }
            if (lc.aU(((PackageInfo) (obj1)).versionCode))
            {
                int i;
                if (gw())
                {
                    i = 0;
                } else
                {
                    i = 1;
                }
                if (a(((PackageInfo) (obj1)), new byte[][] {
    b.Ix[i], b.IE[i], b.IC[i]
}) == null)
                {
                    Log.w("GooglePlayServicesUtil", "Google Play Services signature invalid on Glass.");
                    return 9;
                }
                context = context.getPackageName();
                try
                {
                    PackageInfo packageinfo = ((PackageManager) (obj)).getPackageInfo(context, 64);
                    if (a(((PackageManager) (obj)), packageinfo))
                    {
                        break label0;
                    }
                    Log.w("GooglePlayServicesUtil", (new StringBuilder()).append("Calling package ").append(packageinfo.packageName).append(" signature invalid on Glass.").toString());
                }
                // Misplaced declaration of an exception variable
                catch (Object obj)
                {
                    Log.w("GooglePlayServicesUtil", (new StringBuilder()).append("Could not get info for calling package: ").append(context).toString());
                    return 9;
                }
                return 9;
            }
            if (lc.K(context))
            {
                if (a(((PackageInfo) (obj1)), b.Ix) == null)
                {
                    Log.w("GooglePlayServicesUtil", "Google Play services signature invalid.");
                    return 9;
                }
            } else
            {
                try
                {
                    context = ((PackageManager) (obj)).getPackageInfo("com.android.vending", 64);
                }
                // Misplaced declaration of an exception variable
                catch (Context context)
                {
                    Log.w("GooglePlayServicesUtil", "Google Play Store is missing.");
                    return 9;
                }
                context = a(context, b.Ix);
                if (context == null)
                {
                    Log.w("GooglePlayServicesUtil", "Google Play Store signature invalid.");
                    return 9;
                }
                if (a(((PackageInfo) (obj1)), new byte[][] {
    context
}) == null)
                {
                    Log.w("GooglePlayServicesUtil", "Google Play services signature invalid.");
                    return 9;
                }
            }
        }
        int j = lc.aS(0x648278);
        if (lc.aS(((PackageInfo) (obj1)).versionCode) < j)
        {
            Log.w("GooglePlayServicesUtil", (new StringBuilder()).append("Google Play services out of date.  Requires 6587000 but found ").append(((PackageInfo) (obj1)).versionCode).toString());
            return 2;
        }
        try
        {
            context = ((PackageManager) (obj)).getApplicationInfo("com.google.android.gms", 0);
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

    public static boolean isGoogleSignedUid(PackageManager packagemanager, int i)
    {
        if (packagemanager == null)
        {
            throw new SecurityException("Unknown error: invalid Package Manager");
        }
        String as[] = packagemanager.getPackagesForUid(i);
        if (as.length == 0 || !b(packagemanager, as[0]))
        {
            throw new SecurityException("Uid is not Google Signed");
        } else
        {
            return true;
        }
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

    public static boolean showErrorDialogFragment(int i, Activity activity, int j)
    {
        return showErrorDialogFragment(i, activity, j, null);
    }

    public static boolean showErrorDialogFragment(int i, Activity activity, int j, android.content.DialogInterface.OnCancelListener oncancellistener)
    {
        return showErrorDialogFragment(i, activity, null, j, oncancellistener);
    }

    public static boolean showErrorDialogFragment(int i, Activity activity, Fragment fragment, int j, android.content.DialogInterface.OnCancelListener oncancellistener)
    {
        boolean flag;
        flag = false;
        fragment = a(i, activity, fragment, j, oncancellistener);
        if (fragment == null)
        {
            return false;
        }
        boolean flag1 = activity instanceof FragmentActivity;
        flag = flag1;
_L2:
        if (flag)
        {
            activity = ((FragmentActivity)activity).getSupportFragmentManager();
            SupportErrorDialogFragment.newInstance(fragment, oncancellistener).show(activity, "GooglePlayServicesErrorDialog");
        } else
        if (ll.ig())
        {
            activity = activity.getFragmentManager();
            ErrorDialogFragment.newInstance(fragment, oncancellistener).show(activity, "GooglePlayServicesErrorDialog");
        } else
        {
            throw new RuntimeException("This Activity does not support Fragments.");
        }
        return true;
        NoClassDefFoundError noclassdeffounderror;
        noclassdeffounderror;
        if (true) goto _L2; else goto _L1
_L1:
    }

    public static void showErrorNotification(int i, Context context)
    {
        int j = i;
        if (lc.K(context))
        {
            j = i;
            if (i == 2)
            {
                j = 42;
            }
        }
        if (e(context, j))
        {
            E(context);
            return;
        } else
        {
            a(j, context);
            return;
        }
    }

}
