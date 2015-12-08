// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.adjust.sdk;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import org.json.JSONObject;

// Referenced classes of package com.adjust.sdk:
//            AdjustFactory, ActivityState, Util, ILogger, 
//            DeviceInfo, ActivityPackage, AdjustEvent, AdjustAttribution, 
//            AdjustConfig, ActivityKind

class PackageBuilder
{

    private static ILogger logger = AdjustFactory.getLogger();
    private ActivityState activityState;
    private AdjustConfig adjustConfig;
    AdjustAttribution attribution;
    private long createdAt;
    private DeviceInfo deviceInfo;
    Map extraParameters;
    String referrer;
    String reftag;

    public PackageBuilder(AdjustConfig adjustconfig, DeviceInfo deviceinfo, ActivityState activitystate, long l)
    {
        adjustConfig = adjustconfig;
        deviceInfo = deviceinfo;
        if (activitystate == null)
        {
            adjustconfig = null;
        } else
        {
            adjustconfig = activitystate.shallowCopy();
        }
        activityState = adjustconfig;
        createdAt = l;
    }

    private void addBoolean(Map map, String s, Boolean boolean1)
    {
        if (boolean1 == null)
        {
            return;
        }
        int i;
        if (boolean1.booleanValue())
        {
            i = 1;
        } else
        {
            i = 0;
        }
        addInt(map, s, i);
    }

    private void addDate(Map map, String s, long l)
    {
        if (l < 0L)
        {
            return;
        } else
        {
            addString(map, s, Util.dateFormat(l));
            return;
        }
    }

    private void addDouble(Map map, String s, Double double1)
    {
        if (double1 == null)
        {
            return;
        } else
        {
            addString(map, s, String.format(Locale.US, "%.5f", new Object[] {
                double1
            }));
            return;
        }
    }

    private void addDuration(Map map, String s, long l)
    {
        if (l < 0L)
        {
            return;
        } else
        {
            addInt(map, s, (500L + l) / 1000L);
            return;
        }
    }

    private void addInt(Map map, String s, long l)
    {
        if (l < 0L)
        {
            return;
        } else
        {
            addString(map, s, Long.toString(l));
            return;
        }
    }

    private void addMapJson(Map map, String s, Map map1)
    {
        while (map1 == null || map1.size() == 0) 
        {
            return;
        }
        addString(map, s, (new JSONObject(map1)).toString());
    }

    private void addString(Map map, String s, String s1)
    {
        if (TextUtils.isEmpty(s1))
        {
            return;
        } else
        {
            map.put(s, s1);
            return;
        }
    }

    private void checkDeviceIds(Map map)
    {
        if (!map.containsKey("mac_sha1") && !map.containsKey("mac_md5") && !map.containsKey("android_id") && !map.containsKey("gps_adid"))
        {
            logger.error("Missing device id's. Please check if Proguard is correctly set with Adjust SDK", new Object[0]);
        }
    }

    private void fillPluginKeys(Map map)
    {
        if (deviceInfo.pluginKeys != null)
        {
            Iterator iterator = deviceInfo.pluginKeys.entrySet().iterator();
            while (iterator.hasNext()) 
            {
                java.util.Map.Entry entry = (java.util.Map.Entry)iterator.next();
                addString(map, (String)entry.getKey(), (String)entry.getValue());
            }
        }
    }

    private ActivityPackage getDefaultActivityPackage(ActivityKind activitykind)
    {
        activitykind = new ActivityPackage(activitykind);
        activitykind.setClientSdk(deviceInfo.clientSdk);
        return activitykind;
    }

    private Map getDefaultParameters()
    {
        HashMap hashmap = new HashMap();
        injectDeviceInfo(hashmap);
        injectConfig(hashmap);
        injectActivityState(hashmap);
        injectCreatedAt(hashmap);
        checkDeviceIds(hashmap);
        return hashmap;
    }

    private String getEventSuffix(AdjustEvent adjustevent)
    {
        if (adjustevent.revenue == null)
        {
            return String.format(Locale.US, "'%s'", new Object[] {
                adjustevent.eventToken
            });
        } else
        {
            return String.format(Locale.US, "(%.5f %s, '%s')", new Object[] {
                adjustevent.revenue, adjustevent.currency, adjustevent.eventToken
            });
        }
    }

    private Map getIdsParameters()
    {
        HashMap hashmap = new HashMap();
        injectDeviceInfoIds(hashmap);
        injectConfig(hashmap);
        injectCreatedAt(hashmap);
        checkDeviceIds(hashmap);
        return hashmap;
    }

    private void injectActivityState(Map map)
    {
        addString(map, "android_uuid", activityState.uuid);
        addInt(map, "session_count", activityState.sessionCount);
        addInt(map, "subsession_count", activityState.subsessionCount);
        addDuration(map, "session_length", activityState.sessionLength);
        addDuration(map, "time_spent", activityState.timeSpent);
    }

    private void injectAttribution(Map map)
    {
        if (attribution == null)
        {
            return;
        } else
        {
            addString(map, "tracker", attribution.trackerName);
            addString(map, "campaign", attribution.campaign);
            addString(map, "adgroup", attribution.adgroup);
            addString(map, "creative", attribution.creative);
            return;
        }
    }

    private void injectConfig(Map map)
    {
        addString(map, "app_token", adjustConfig.appToken);
        addString(map, "environment", adjustConfig.environment);
        addBoolean(map, "device_known", adjustConfig.knownDevice);
        addBoolean(map, "needs_attribution_data", Boolean.valueOf(adjustConfig.hasListener()));
        addString(map, "gps_adid", Util.getPlayAdId(adjustConfig.context));
        addBoolean(map, "tracking_enabled", Util.isPlayTrackingEnabled(adjustConfig.context));
    }

    private void injectCreatedAt(Map map)
    {
        addDate(map, "created_at", createdAt);
    }

    private void injectDeviceInfo(Map map)
    {
        injectDeviceInfoIds(map);
        addString(map, "fb_id", deviceInfo.fbAttributionId);
        addString(map, "package_name", deviceInfo.packageName);
        addString(map, "app_version", deviceInfo.appVersion);
        addString(map, "device_type", deviceInfo.deviceType);
        addString(map, "device_name", deviceInfo.deviceName);
        addString(map, "device_manufacturer", deviceInfo.deviceManufacturer);
        addString(map, "os_name", deviceInfo.osName);
        addString(map, "os_version", deviceInfo.osVersion);
        addString(map, "language", deviceInfo.language);
        addString(map, "country", deviceInfo.country);
        addString(map, "screen_size", deviceInfo.screenSize);
        addString(map, "screen_format", deviceInfo.screenFormat);
        addString(map, "screen_density", deviceInfo.screenDensity);
        addString(map, "display_width", deviceInfo.displayWidth);
        addString(map, "display_height", deviceInfo.displayHeight);
        fillPluginKeys(map);
    }

    private void injectDeviceInfoIds(Map map)
    {
        addString(map, "mac_sha1", deviceInfo.macSha1);
        addString(map, "mac_md5", deviceInfo.macShortMd5);
        addString(map, "android_id", deviceInfo.androidId);
    }

    public ActivityPackage buildAttributionPackage()
    {
        Map map = getIdsParameters();
        ActivityPackage activitypackage = getDefaultActivityPackage(ActivityKind.ATTRIBUTION);
        activitypackage.setPath("attribution");
        activitypackage.setSuffix("");
        activitypackage.setParameters(map);
        return activitypackage;
    }

    public ActivityPackage buildClickPackage(String s, long l)
    {
        Map map = getIdsParameters();
        addString(map, "source", s);
        addDate(map, "click_time", l);
        addString(map, "reftag", reftag);
        addMapJson(map, "params", extraParameters);
        addString(map, "referrer", referrer);
        injectAttribution(map);
        s = getDefaultActivityPackage(ActivityKind.CLICK);
        s.setPath("/sdk_click");
        s.setSuffix("");
        s.setParameters(map);
        return s;
    }

    public ActivityPackage buildEventPackage(AdjustEvent adjustevent)
    {
        Map map = getDefaultParameters();
        addInt(map, "event_count", activityState.eventCount);
        addString(map, "event_token", adjustevent.eventToken);
        addDouble(map, "revenue", adjustevent.revenue);
        addString(map, "currency", adjustevent.currency);
        addMapJson(map, "callback_params", adjustevent.callbackParameters);
        addMapJson(map, "partner_params", adjustevent.partnerParameters);
        ActivityPackage activitypackage = getDefaultActivityPackage(ActivityKind.EVENT);
        activitypackage.setPath("/event");
        activitypackage.setSuffix(getEventSuffix(adjustevent));
        activitypackage.setParameters(map);
        return activitypackage;
    }

    public ActivityPackage buildSessionPackage()
    {
        Map map = getDefaultParameters();
        addDuration(map, "last_interval", activityState.lastInterval);
        addString(map, "default_tracker", adjustConfig.defaultTracker);
        ActivityPackage activitypackage = getDefaultActivityPackage(ActivityKind.SESSION);
        activitypackage.setPath("/session");
        activitypackage.setSuffix("");
        activitypackage.setParameters(map);
        return activitypackage;
    }

}
