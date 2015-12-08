// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.urbanairship.util;

import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.ComponentInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import com.urbanairship.AirshipConfigOptions;
import com.urbanairship.CoreActivity;
import com.urbanairship.CoreReceiver;
import com.urbanairship.Logger;
import com.urbanairship.UAirship;
import com.urbanairship.UrbanAirshipProvider;
import com.urbanairship.actions.ActionActivity;
import com.urbanairship.actions.ActionService;
import com.urbanairship.analytics.EventService;
import com.urbanairship.location.LocationService;
import com.urbanairship.push.GCMPushReceiver;
import com.urbanairship.push.PushService;
import com.urbanairship.richpush.RichPushUpdateService;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ManifestUtils
{

    public ManifestUtils()
    {
    }

    public static void checkRequiredPermission(String s)
    {
        if (-1 == UAirship.getPackageManager().checkPermission(s, UAirship.getPackageName()))
        {
            Logger.error((new StringBuilder()).append("AndroidManifest.xml missing required permission: ").append(s).toString());
        }
    }

    public static ActivityInfo getActivityInfo(Class class1)
    {
        class1 = new ComponentName(UAirship.getPackageName(), class1.getCanonicalName());
        try
        {
            class1 = UAirship.getPackageManager().getActivityInfo(class1, 128);
        }
        // Misplaced declaration of an exception variable
        catch (Class class1)
        {
            return null;
        }
        return class1;
    }

    public static ComponentInfo getProviderInfo(String s)
    {
        return UAirship.getPackageManager().resolveContentProvider(s, 0);
    }

    public static ComponentInfo getReceiverInfo(Class class1)
    {
        class1 = new ComponentName(UAirship.getPackageName(), class1.getCanonicalName());
        try
        {
            class1 = UAirship.getPackageManager().getReceiverInfo(class1, 128);
        }
        // Misplaced declaration of an exception variable
        catch (Class class1)
        {
            return null;
        }
        return class1;
    }

    public static ComponentInfo getServiceInfo(Class class1)
    {
        class1 = new ComponentName(UAirship.getPackageName(), class1.getCanonicalName());
        try
        {
            class1 = UAirship.getPackageManager().getServiceInfo(class1, 128);
        }
        // Misplaced declaration of an exception variable
        catch (Class class1)
        {
            return null;
        }
        return class1;
    }

    private static Map getUrbanAirshipComponentInfoMap()
    {
        return new HashMap() {

            
            {
                put(com/urbanairship/analytics/EventService, ManifestUtils.getServiceInfo(com/urbanairship/analytics/EventService));
                put(com/urbanairship/push/PushService, ManifestUtils.getServiceInfo(com/urbanairship/push/PushService));
                put(com/urbanairship/richpush/RichPushUpdateService, ManifestUtils.getServiceInfo(com/urbanairship/richpush/RichPushUpdateService));
                put(com/urbanairship/actions/ActionService, ManifestUtils.getServiceInfo(com/urbanairship/actions/ActionService));
                put(com/urbanairship/location/LocationService, ManifestUtils.getServiceInfo(com/urbanairship/location/LocationService));
                put(com/urbanairship/CoreReceiver, ManifestUtils.getReceiverInfo(com/urbanairship/CoreReceiver));
                put(com/urbanairship/push/GCMPushReceiver, ManifestUtils.getReceiverInfo(com/urbanairship/push/GCMPushReceiver));
                put(com/urbanairship/UrbanAirshipProvider, ManifestUtils.getProviderInfo(UrbanAirshipProvider.getAuthorityString()));
                put(com/urbanairship/actions/ActionActivity, ManifestUtils.getActivityInfo(com/urbanairship/actions/ActionActivity));
                put(com/urbanairship/CoreActivity, ManifestUtils.getActivityInfo(com/urbanairship/CoreActivity));
            }
        };
    }

    public static boolean isPermissionKnown(String s)
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

    public static void validateManifest(AirshipConfigOptions airshipconfigoptions)
    {
        checkRequiredPermission("android.permission.INTERNET");
        checkRequiredPermission("android.permission.ACCESS_NETWORK_STATE");
        Iterator iterator;
        Map map;
        if (isPermissionKnown(UAirship.getUrbanAirshipPermission()))
        {
            checkRequiredPermission(UAirship.getUrbanAirshipPermission());
        } else
        {
            Logger.error((new StringBuilder()).append("AndroidManifest.xml does not define and require permission: ").append(UAirship.getUrbanAirshipPermission()).toString());
        }
        map = getUrbanAirshipComponentInfoMap();
        if (map.get(com/urbanairship/CoreReceiver) == null)
        {
            Logger.error((new StringBuilder()).append("AndroidManifest.xml missing required receiver: ").append(com/urbanairship/CoreReceiver.getCanonicalName()).toString());
        } else
        {
            ComponentInfo componentinfo1 = (ComponentInfo)map.get(com/urbanairship/CoreReceiver);
            Intent intent = (new Intent("com.urbanairship.push.OPENED")).addCategory(UAirship.getPackageName());
            ResolveInfo resolveinfo = null;
            Iterator iterator1 = UAirship.getPackageManager().queryBroadcastReceivers(intent, 0).iterator();
            do
            {
                if (!iterator1.hasNext())
                {
                    break;
                }
                ResolveInfo resolveinfo1 = (ResolveInfo)iterator1.next();
                if (resolveinfo1.activityInfo != null && resolveinfo1.activityInfo.name != null && resolveinfo1.activityInfo.name.equals(componentinfo1.name))
                {
                    resolveinfo = resolveinfo1;
                }
            } while (true);
            if (resolveinfo == null)
            {
                Logger.error((new StringBuilder()).append("AndroidManifest.xml's ").append(com/urbanairship/CoreReceiver.getCanonicalName()).append(" declaration missing required ").append("com.urbanairship.push.OPENED").append(" filter with category ").append(UAirship.getPackageName()).toString());
            }
        }
        if (map.get(com/urbanairship/CoreActivity) == null)
        {
            Logger.error((new StringBuilder()).append("AndroidManifest.xml missing required activity: ").append(com/urbanairship/CoreActivity.getCanonicalName()).toString());
        }
        if (airshipconfigoptions.analyticsEnabled && map.get(com/urbanairship/analytics/EventService) == null)
        {
            Logger.error((new StringBuilder()).append("AndroidManifest.xml missing required service: ").append(com/urbanairship/analytics/EventService.getCanonicalName()).toString());
        }
        if (map.get(com/urbanairship/push/PushService) == null)
        {
            Logger.error((new StringBuilder()).append("AndroidManifest.xml missing required service: ").append(com/urbanairship/push/PushService.getCanonicalName()).toString());
        }
        if (map.get(com/urbanairship/richpush/RichPushUpdateService) == null)
        {
            Logger.error((new StringBuilder()).append("AndroidManifest.xml missing required service: ").append(com/urbanairship/richpush/RichPushUpdateService.getCanonicalName()).toString());
        }
        if (map.get(com/urbanairship/actions/ActionService) == null)
        {
            Logger.error((new StringBuilder()).append("AndroidManifest.xml missing required service: ").append(com/urbanairship/actions/ActionService.getCanonicalName()).toString());
        }
        if (map.get(com/urbanairship/actions/ActionActivity) == null)
        {
            Logger.warn("AndroidManifest.xml missing ActionActivity.  Action.startActivityForResult will not work.");
        }
        airshipconfigoptions = (new Intent("com.urbanairship.actions.SHOW_LANDING_PAGE_INTENT_ACTION", Uri.parse("http://"))).setPackage(UAirship.getPackageName()).addFlags(0x10000000).addCategory("android.intent.category.DEFAULT");
        if (UAirship.getPackageManager().resolveActivity(airshipconfigoptions, 0) == null)
        {
            Logger.warn("AndroidManifest.xml missing activity with an intent filter for action com.urbanairship.actions.SHOW_LANDING_PAGE_INTENT_ACTION, category android.intent.category.DEFAULT, and data with scheme http.  Landing page action may not function properly.");
        }
        airshipconfigoptions = (new Intent("com.urbanairship.actions.SHOW_LANDING_PAGE_INTENT_ACTION", Uri.parse("https://"))).setPackage(UAirship.getPackageName()).addFlags(0x10000000).addCategory("android.intent.category.DEFAULT");
        if (UAirship.getPackageManager().resolveActivity(airshipconfigoptions, 0) == null)
        {
            Logger.error("AndroidManifest.xml missing activity with an intent filter for action com.urbanairship.actions.SHOW_LANDING_PAGE_INTENT_ACTION, category android.intent.category.DEFAULT, and data with scheme https Landing page action may not function properly.");
        }
        if (UAirship.getAppInfo() == null)
        {
            airshipconfigoptions = UAirship.getPackageName();
        } else
        {
            airshipconfigoptions = UAirship.getAppInfo().processName;
        }
        iterator = map.keySet().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            Class class1 = (Class)iterator.next();
            ComponentInfo componentinfo = (ComponentInfo)map.get(class1);
            if (componentinfo != null && !airshipconfigoptions.equals(componentinfo.processName))
            {
                Logger.warn((new StringBuilder()).append("A separate process is detected for: ").append(class1.getCanonicalName()).append(". In the ").append("AndroidManifest.xml, remove the android:process attribute.").toString());
            }
        } while (true);
        if (map.get(com/urbanairship/UrbanAirshipProvider) == null)
        {
            throw new IllegalStateException("Unable to resolve UrbanAirshipProvider. Please check that the provider is defined in your AndroidManifest.xml, and that the authority string is set to  \"YOUR_PACKAGENAME.urbanairship.provider\"");
        } else
        {
            return;
        }
    }
}
