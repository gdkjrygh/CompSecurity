// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.urbanairship.push;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import com.urbanairship.AirshipConfigOptions;
import com.urbanairship.Logger;
import com.urbanairship.UAirship;
import com.urbanairship.analytics.Analytics;
import com.urbanairship.analytics.PushServiceStartedEvent;
import com.urbanairship.push.embedded.BoxOfficeClient;
import com.urbanairship.util.Device;
import com.urbanairship.util.IntentUtils;
import java.util.List;

// Referenced classes of package com.urbanairship.push:
//            PushManager, PushPreferences, PushService, GCMPushReceiver

abstract class GCMRegistrar
{

    private static final String ACTION_GCM_REGISTER = "com.google.android.c2dm.intent.REGISTER";
    static final String ACTION_GCM_REGISTRATION_RESPONSE = "com.google.android.c2dm.intent.REGISTRATION";
    private static final String ACTION_GCM_UNREGISTER = "com.google.android.c2dm.intent.UNREGISTER";
    public static final String EXTRA_GCM_REGISTRATION_ID = "com.urbanairship.push.GCM_REGISTRATION_ID";
    private static final long MAX_BACKOFF_TIME = 0x4e2000L;
    private static final String PERMISSION_RECEIVE = "com.google.android.c2dm.permission.RECEIVE";
    private static final long STARTING_BACKOFF_TIME = 10000L;
    private static long backoffTime = 10000L;

    private GCMRegistrar()
    {
    }

    private static void checkRequiredPermission(String s)
    {
        if (!isPermissionKnown(s))
        {
            Logger.error((new StringBuilder()).append("Required permission ").append(s).append(" is unknown to PackageManager.").toString());
        } else
        if (-1 == UAirship.getPackageManager().checkPermission(s, UAirship.getPackageName()))
        {
            Logger.error((new StringBuilder()).append("AndroidManifest.xml missing required push permission: ").append(s).toString());
            return;
        }
    }

    static void handleRegistrationIntent(Intent intent)
    {
        String s;
        String s1;
        boolean flag;
        flag = PushManager.shared().getPreferences().isPushEnabled();
        s = intent.getStringExtra("registration_id");
        s1 = intent.getStringExtra("error");
        intent = intent.getStringExtra("unregistered");
        if (s1 == null) goto _L2; else goto _L1
_L1:
        Logger.error((new StringBuilder()).append("Received GCM error: ").append(s1).toString());
        if (!flag) goto _L4; else goto _L3
_L3:
        Logger.error("Failed to register with GCM.");
        registrationFailed(s1);
_L6:
        return;
_L4:
        Logger.error("Failed to unregister with GCM.");
        return;
_L2:
        if (intent != null)
        {
            Logger.info((new StringBuilder()).append("Unregistered from GCM: ").append(intent).toString());
            backoffTime = 10000L;
            return;
        }
        if (s != null)
        {
            Logger.info((new StringBuilder()).append("Received GCM Registration ID:").append(s).toString());
            if (flag)
            {
                UAirship.shared().getAnalytics().addEvent(new PushServiceStartedEvent());
                PushManager.shared().setGcmId(s);
            }
            backoffTime = 10000L;
            return;
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    private static boolean isGCMAvailable()
    {
        if (android.os.Build.VERSION.SDK_INT < 8)
        {
            Logger.debug((new StringBuilder()).append("GCM not supported in API level ").append(android.os.Build.VERSION.SDK_INT).toString());
            return false;
        }
        if ("qnx".equalsIgnoreCase(System.getProperty("os.name")) || "BlackBerry".equalsIgnoreCase(Build.BRAND.toString()) || "RIM".equalsIgnoreCase(Build.MANUFACTURER.toString()))
        {
            Logger.error("Urban Airship Android library does not support BlackBerry. Canceling GCM registration.");
            return false;
        }
        if (!isPermissionKnown("com.google.android.c2dm.permission.RECEIVE"))
        {
            Logger.error("com.google.android.c2dm.permission.RECEIVE is unknown to PackageManager. Note that an AVD emulator may not support GCM.");
            Logger.error("If you're running in an emulator, you need to install the appropriate image through the Android SDK and AVM manager. See http://developer.android.com/guide/google/gcm/ for further details.");
            return false;
        }
        if (UAirship.shared().getAirshipConfigOptions().gcmSender == null)
        {
            Logger.error("The GCM sender ID is not set. Unable to register.");
            return false;
        } else
        {
            return true;
        }
    }

    private static boolean isNewAppOrDevice()
    {
        PushPreferences pushpreferences = PushManager.shared().getPreferences();
        if (UAirship.getPackageInfo().versionCode != pushpreferences.getAppVersionCode())
        {
            Logger.verbose((new StringBuilder()).append("Version code changed to ").append(UAirship.getPackageInfo().versionCode).append(". GCM re-registration required.").toString());
            return true;
        }
        if (!Device.getHashedDeviceId().equals(pushpreferences.getDeviceId()))
        {
            Logger.verbose("Device ID changed. GCM re-registration required.");
            return true;
        } else
        {
            return false;
        }
    }

    private static boolean isPermissionKnown(String s)
    {
        try
        {
            UAirship.getPackageManager().getPermissionInfo(s, 0);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return false;
        }
        return true;
    }

    static void register()
    {
        Object obj = PushManager.shared().getPreferences();
        if (!((PushPreferences) (obj)).isPushEnabled())
        {
            Logger.debug("Push is not enabled. Canceling GCM registration.");
        } else
        {
            if (!isNewAppOrDevice() && ((PushPreferences) (obj)).getGcmId() != null)
            {
                Logger.info((new StringBuilder()).append("Using GCM Registration ID: ").append(((PushPreferences) (obj)).getGcmId()).toString());
                PushManager.shared().updateApidIfNecessary();
                return;
            }
            if (isGCMAvailable())
            {
                String s;
                Intent intent;
                if (((PushPreferences) (obj)).getPushId() == null)
                {
                    try
                    {
                        (new BoxOfficeClient()).firstRun();
                    }
                    catch (com.urbanairship.push.embedded.BoxOfficeClient.FirstRunForbiddenException firstrunforbiddenexception)
                    {
                        Logger.error(firstrunforbiddenexception);
                        return;
                    }
                    catch (com.urbanairship.push.embedded.BoxOfficeClient.BoxOfficeException boxofficeexception)
                    {
                        Logger.debug((new StringBuilder()).append("Firstrun failed, will retry. Error: ").append(boxofficeexception.getMessage()).toString());
                        retryRegistration();
                        return;
                    }
                }
                obj = UAirship.shared().getApplicationContext();
                s = UAirship.shared().getAirshipConfigOptions().gcmSender;
                intent = new Intent("com.google.android.c2dm.intent.REGISTER");
                intent.putExtra("app", PendingIntent.getBroadcast(((Context) (obj)), 0, new Intent(), 0));
                intent.putExtra("sender", s);
                if (startService(intent))
                {
                    Logger.info((new StringBuilder()).append("Sent GCM registration, sender: ").append(s).toString());
                    return;
                }
            }
        }
    }

    private static void registrationFailed(String s)
    {
        Logger.error((new StringBuilder()).append("GCM Failure: ").append(s).toString());
        if ("INVALID_SENDER".equals(s))
        {
            Logger.error("Your GCM sender ID is invalid. Please check your AirshipConfig.");
        }
        Context context;
        Class class1;
        PushPreferences pushpreferences;
        if ("SERVICE_NOT_AVAILABLE".equals(s))
        {
            retryRegistration();
        } else
        {
            PushManager.shared().setGcmId(null);
            backoffTime = 10000L;
        }
        context = UAirship.shared().getApplicationContext();
        class1 = PushManager.shared().getIntentReceiver();
        pushpreferences = PushManager.shared().getPreferences();
        if (class1 != null)
        {
            Intent intent = new Intent("com.urbanairship.push.REGISTRATION_FINISHED");
            intent.setClass(UAirship.shared().getApplicationContext(), class1);
            intent.putExtra("com.urbanairship.push.APID", pushpreferences.getPushId());
            intent.putExtra("com.urbanairship.push.REGISTRATION_VALID", false);
            intent.putExtra("com.urbanairship.push.REGISTRATION_ERROR", s);
            context.sendBroadcast(intent);
        }
    }

    private static void retryRegistration()
    {
        backoffTime = Math.min(backoffTime * 2L, 0x4e2000L);
        Logger.info((new StringBuilder()).append("Scheduling GCM registration in ").append(backoffTime / 1000L).append(" seconds").toString());
        Intent intent = new Intent();
        intent.setClass(UAirship.shared().getApplicationContext(), com/urbanairship/push/PushService);
        intent.setAction("com.urbanairship.push.GCM_REGISTRATION");
        IntentUtils.scheduleIntent(UAirship.shared().getApplicationContext(), intent, backoffTime);
    }

    static boolean startService(Intent intent)
    {
        Logger.debug("GCMRegistrar startService");
        Context context = UAirship.shared().getApplicationContext();
        try
        {
            context.startService(intent);
        }
        catch (SecurityException securityexception)
        {
            Logger.error((new StringBuilder()).append("A security exception occurred when starting service: ").append(intent.getAction()).toString(), securityexception);
            return false;
        }
        catch (Exception exception)
        {
            Logger.error((new StringBuilder()).append("An exception occurred when starting service: ").append(intent.getAction()).toString(), exception);
            return false;
        }
        return true;
    }

    static void unregister()
    {
        Context context = UAirship.shared().getApplicationContext();
        Intent intent = new Intent("com.google.android.c2dm.intent.UNREGISTER");
        intent.putExtra("app", PendingIntent.getBroadcast(context, 0, new Intent(), 0));
        startService(intent);
    }

    static void validateManifest()
    {
        PackageManager packagemanager = UAirship.getPackageManager();
        String s = UAirship.getPackageName();
        checkRequiredPermission("com.google.android.c2dm.permission.RECEIVE");
        checkRequiredPermission("android.permission.WAKE_LOCK");
        checkRequiredPermission("android.permission.GET_ACCOUNTS");
        Object obj = UAirship.getPackageInfo().applicationInfo;
        if (UAirship.shared().getAirshipConfigOptions().minSdkVersion < 16 || obj != null && ((ApplicationInfo) (obj)).targetSdkVersion < 16 || android.os.Build.VERSION.SDK_INT < 16)
        {
            checkRequiredPermission((new StringBuilder()).append(s).append(".permission.C2D_MESSAGE").toString());
        }
        obj = new ComponentName(s, com/urbanairship/push/GCMPushReceiver.getCanonicalName());
        try
        {
            packagemanager.getReceiverInfo(((ComponentName) (obj)), 128);
            obj = new Intent("com.google.android.c2dm.intent.RECEIVE");
            ((Intent) (obj)).addCategory(s);
            if (packagemanager.queryBroadcastReceivers(((Intent) (obj)), 0).isEmpty())
            {
                Logger.error((new StringBuilder()).append("AndroidManifest.xml's ").append(com/urbanairship/push/GCMPushReceiver.getCanonicalName()).append(" declaration missing required ").append(((Intent) (obj)).getAction()).append(" filter with category=").append(s).toString());
            }
            Intent intent = new Intent("com.google.android.c2dm.intent.REGISTRATION");
            intent.addCategory(s);
            if (packagemanager.queryBroadcastReceivers(((Intent) (obj)), 0).isEmpty())
            {
                Logger.error((new StringBuilder()).append("AndroidManifest.xml's ").append(com/urbanairship/push/GCMPushReceiver.getCanonicalName()).append(" declaration missing required ").append(intent.getAction()).append(" filter with category=").append(s).toString());
            }
            obj = new Intent("android.intent.action.PACKAGE_REPLACED");
            ((Intent) (obj)).setData(Uri.fromParts("package", s, null));
            ((Intent) (obj)).setClassName(s, com/urbanairship/push/GCMPushReceiver.getCanonicalName());
            if (packagemanager.queryBroadcastReceivers(((Intent) (obj)), 0).isEmpty())
            {
                Logger.error((new StringBuilder()).append("AndroidManifest.xml's ").append(com/urbanairship/push/GCMPushReceiver.getCanonicalName()).append(" declaration missing required filter ").append(((Intent) (obj)).getAction()).append(". Your app may not be able to reset the GCM ID on app upgrade.").toString());
            }
            return;
        }
        catch (android.content.pm.PackageManager.NameNotFoundException namenotfoundexception)
        {
            Logger.error((new StringBuilder()).append("AndroidManifest.xml missing required receiver: ").append(com/urbanairship/push/GCMPushReceiver.getCanonicalName()).toString());
        }
    }

}
