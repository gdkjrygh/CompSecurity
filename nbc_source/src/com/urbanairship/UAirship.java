// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.urbanairship;

import android.app.Application;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.ComponentInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.util.Log;
import com.urbanairship.analytics.Analytics;
import com.urbanairship.analytics.EventService;
import com.urbanairship.location.LocationService;
import com.urbanairship.location.UALocationManager;
import com.urbanairship.push.GCMPushReceiver;
import com.urbanairship.push.PushManager;
import com.urbanairship.push.PushService;
import com.urbanairship.richpush.RichPushManager;
import com.urbanairship.richpush.RichPushUpdateService;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

// Referenced classes of package com.urbanairship:
//            CoreReceiver, Logger, AirshipConfigOptions, UrbanAirshipProvider, 
//            LocationOptions

public class UAirship
{

    private static final UAirship sharedAirship = new UAirship();
    AirshipConfigOptions airshipConfigOptions;
    Analytics analytics;
    Context applicationContext;
    boolean flying;

    private UAirship()
    {
        flying = false;
    }

    private void checkManifest()
    {
        Map map;
label0:
        {
            checkRequiredPermission("android.permission.INTERNET");
            checkRequiredPermission("android.permission.ACCESS_NETWORK_STATE");
            map = getUrbanAirshipReceiverAndServiceInfos();
            if (!map.containsKey(com/urbanairship/CoreReceiver.getCanonicalName()))
            {
                Logger.error((new StringBuilder()).append("AndroidManifest.xml missing required receiver: ").append(com/urbanairship/CoreReceiver.getCanonicalName()).toString());
            }
            if (airshipConfigOptions.analyticsEnabled && !map.containsKey(com/urbanairship/analytics/EventService.getCanonicalName()))
            {
                Logger.error((new StringBuilder()).append("AndroidManifest.xml missing required service: ").append(com/urbanairship/analytics/EventService.getCanonicalName()).toString());
            }
            String s = null;
            ComponentInfo componentinfo;
label1:
            do
            {
                for (Iterator iterator = map.values().iterator(); iterator.hasNext();)
                {
                    componentinfo = (ComponentInfo)iterator.next();
                    if (s != null)
                    {
                        continue label1;
                    }
                    s = componentinfo.processName;
                }

                break label0;
            } while (s.equals(componentinfo.processName));
            Logger.error("Multiple processes detected for Urban Airship's services and receivers. In your AndroidManifest.xml, either remove the android:process from each of the UA receivers and services, or if you require multiple processes, make sure they are all running the same process.");
        }
        if (airshipConfigOptions.pushServiceEnabled)
        {
            if (!map.containsKey(com/urbanairship/push/PushService.getCanonicalName()))
            {
                Logger.error((new StringBuilder()).append("AndroidManifest.xml missing required service: ").append(com/urbanairship/push/PushService.getCanonicalName()).toString());
            }
            PushManager.validateManifest();
        }
        if (getPackageManager().resolveContentProvider(UrbanAirshipProvider.getAuthorityString(), 0) == null)
        {
            throw new IllegalStateException("Unable to resolve UrbanAirshipProvider. Please check that the provider is defined defined in your AndroidManifest.xml, and that the authority string is set to \"YOUR_PACKAGENAME.urbanairship.provider\"");
        } else
        {
            return;
        }
    }

    private static void checkRequiredPermission(String s)
    {
        if (-1 == getPackageManager().checkPermission(s, getPackageName()))
        {
            Logger.error((new StringBuilder()).append("AndroidManifest.xml missing required permission: ").append(s).toString());
        }
    }

    public static int getAppIcon()
    {
        ApplicationInfo applicationinfo = getAppInfo();
        if (applicationinfo != null)
        {
            return applicationinfo.icon;
        } else
        {
            return -1;
        }
    }

    public static ApplicationInfo getAppInfo()
    {
        return sharedAirship.applicationContext.getApplicationInfo();
    }

    public static String getAppName()
    {
        if (getAppInfo() != null)
        {
            return getPackageManager().getApplicationLabel(getAppInfo()).toString();
        } else
        {
            return null;
        }
    }

    public static PackageInfo getPackageInfo()
    {
        PackageInfo packageinfo;
        try
        {
            packageinfo = getPackageManager().getPackageInfo(getPackageName(), 0);
        }
        catch (android.content.pm.PackageManager.NameNotFoundException namenotfoundexception)
        {
            Logger.info((new StringBuilder()).append("NameNotFound for: ").append(getPackageName()).append(". Disabling.").toString());
            return null;
        }
        return packageinfo;
    }

    public static PackageManager getPackageManager()
    {
        return sharedAirship.applicationContext.getPackageManager();
    }

    public static String getPackageName()
    {
        return sharedAirship.applicationContext.getPackageName();
    }

    private Map getUrbanAirshipReceiverAndServiceInfos()
    {
        HashMap hashmap = new HashMap();
        String as[] = new String[2];
        as[0] = com/urbanairship/CoreReceiver.getCanonicalName();
        as[1] = com/urbanairship/push/GCMPushReceiver.getCanonicalName();
        String as1[] = new String[4];
        as1[0] = com/urbanairship/analytics/EventService.getCanonicalName();
        as1[1] = com/urbanairship/push/PushService.getCanonicalName();
        as1[2] = com/urbanairship/richpush/RichPushUpdateService.getCanonicalName();
        as1[3] = com/urbanairship/location/LocationService.getCanonicalName();
        int j = as1.length;
        int i = 0;
        while (i < j) 
        {
            Object obj = as1[i];
            ComponentName componentname = new ComponentName(getPackageName(), ((String) (obj)));
            String s;
            Exception exception;
            int k;
            try
            {
                hashmap.put(obj, getPackageManager().getServiceInfo(componentname, 128));
            }
            catch (Exception exception1) { }
            i++;
        }
        k = as.length;
        i = 0;
        while (i < k) 
        {
            s = as[i];
            obj = new ComponentName(getPackageName(), s);
            try
            {
                hashmap.put(s, getPackageManager().getReceiverInfo(((ComponentName) (obj)), 128));
            }
            // Misplaced declaration of an exception variable
            catch (Exception exception) { }
            i++;
        }
        return hashmap;
    }

    public static String getVersion()
    {
        return "3.3.0";
    }

    public static void land()
    {
        sharedAirship.flying = false;
    }

    public static UAirship shared()
    {
        return sharedAirship;
    }

    public static void takeOff(Application application)
    {
        takeOff(application, null);
    }

    public static void takeOff(Application application, AirshipConfigOptions airshipconfigoptions)
    {
        com/urbanairship/UAirship;
        JVM INSTR monitorenter ;
        if (application != null)
        {
            break MISSING_BLOCK_LABEL_23;
        }
        throw new IllegalArgumentException("Application argument must not be null");
        application;
        com/urbanairship/UAirship;
        JVM INSTR monitorexit ;
        throw application;
        if (!sharedAirship.flying) goto _L2; else goto _L1
_L1:
        Logger.error("You can only call UAirship.takeOff once.");
_L3:
        com/urbanairship/UAirship;
        JVM INSTR monitorexit ;
        return;
_L2:
        Context context;
        UAirship uairship = sharedAirship;
        context = application.getApplicationContext();
        uairship.applicationContext = context;
        UrbanAirshipProvider.init();
        AirshipConfigOptions airshipconfigoptions1;
        airshipconfigoptions1 = airshipconfigoptions;
        if (airshipconfigoptions != null)
        {
            break MISSING_BLOCK_LABEL_69;
        }
        airshipconfigoptions1 = AirshipConfigOptions.loadDefaultOptions(context);
        sharedAirship.airshipConfigOptions = airshipconfigoptions1;
        Logger.logLevel = airshipconfigoptions1.getLoggerLevel();
        Logger.TAG = (new StringBuilder()).append(getAppName()).append(" - UALib").toString();
        airshipconfigoptions = (new StringBuilder()).append("Airship Take Off! Lib Version: ");
        UAirship uairship1 = sharedAirship;
        Logger.debug(airshipconfigoptions.append(getVersion()).append(" / App key = ").append(airshipconfigoptions1.getAppKey()).toString());
        Logger.debug((new StringBuilder()).append("In Production? ").append(airshipconfigoptions1.inProduction).toString());
        if (!airshipconfigoptions1.isValid())
        {
            Logger.error("AirshipConfigOptions are not valid. Unable to take off! Check your airshipconfig.properties file for the errors listed above.");
            throw new IllegalArgumentException("Application configuration is invalid.");
        }
        if (!airshipconfigoptions1.inProduction)
        {
            sharedAirship.checkManifest();
        }
        sharedAirship.flying = true;
        if (airshipconfigoptions1.pushServiceEnabled)
        {
            Logger.debug("Initializing Push.");
            PushManager.init();
            if (Logger.logLevel < 7)
            {
                Log.d((new StringBuilder()).append(getAppName()).append(" APID").toString(), (new StringBuilder()).append("").append(PushManager.shared().getAPID()).toString());
            }
        }
        if (airshipconfigoptions1.richPushEnabled)
        {
            Logger.debug("Initializing Rich Push");
            RichPushManager.init();
        }
        if (airshipconfigoptions1.locationOptions.locationServiceEnabled)
        {
            Logger.debug("Initializing Location.");
            UALocationManager.init();
        }
        Logger.debug("Initializing Analytics.");
        sharedAirship.analytics = new Analytics(application);
          goto _L3
    }

    public AirshipConfigOptions getAirshipConfigOptions()
    {
        return airshipConfigOptions;
    }

    public Analytics getAnalytics()
    {
        return analytics;
    }

    public Context getApplicationContext()
    {
        return applicationContext;
    }

    public boolean isFlying()
    {
        return flying;
    }

}
