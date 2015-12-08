// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.analytics.trackers;

import android.os.Build;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import me.lyft.android.ILyftPreferences;
import me.lyft.android.IUserSession;
import me.lyft.android.analytics.ScreenAnalytics;
import me.lyft.android.analytics.session.AnalyticsSession;
import me.lyft.android.common.DateUtils;
import me.lyft.android.common.Objects;
import me.lyft.android.common.Strings;
import me.lyft.android.domain.location.Location;
import me.lyft.android.infrastructure.device.BatteryStatus;
import me.lyft.android.infrastructure.device.IDevice;
import me.lyft.android.infrastructure.foreground.IAppForegroundDetector;
import me.lyft.android.infrastructure.location.ILocationService;
import me.lyft.android.infrastructure.lyft.profile.NullUserDTO;
import me.lyft.android.infrastructure.lyft.profile.UserDTO;
import me.lyft.android.infrastructure.lyft.ride.RideDTO;
import me.lyft.android.logging.L;

// Referenced classes of package me.lyft.android.analytics.trackers:
//            AnalyticsApi

public class MixpanelWrapper
{

    public static final String CLIENT_EVENT_PREFIX = "client_";
    static final String PROPERTY_ADVERTISING_ID = "advertising_id";
    static final String PROPERTY_ANDROID_ID = "android_id";
    static final String PROPERTY_APP_VERSION = "app_version";
    static final String PROPERTY_BATTERY_LEVEL = "battery_level";
    static final String PROPERTY_CARRIER = "carrier";
    static final String PROPERTY_EVENT_NAME = "event_name";
    static final String PROPERTY_FG = "fg";
    static final String PROPERTY_IS_CHARGING = "is_charging";
    static final String PROPERTY_LAT = "lat";
    static final String PROPERTY_LNG = "lng";
    static final String PROPERTY_MANUFACTURER = "manufacturer";
    static final String PROPERTY_MAT_ID = "mat_id";
    static final String PROPERTY_MODEL = "model";
    static final String PROPERTY_OCCURRED_AT = "occurred_at";
    static final String PROPERTY_OS = "os";
    static final String PROPERTY_OS_VERSION = "os_version";
    static final String PROPERTY_PAGE = "page";
    static final String PROPERTY_REGION = "region";
    static final String PROPERTY_RIDE_ID = "ride_id";
    static final String PROPERTY_RIDE_STATE = "ride_state";
    static final String PROPERTY_SCREEN_DPI = "screen_dpi";
    static final String PROPERTY_SCREEN_HEIGHT = "screen_height";
    static final String PROPERTY_SCREEN_WIDTH = "screen_width";
    static final String PROPERTY_SESSION_ID = "session_id";
    static final String PROPERTY_USER_ID = "user_id";
    static final String PROPERTY_USER_MODE = "user_mode";
    static final String PROPERTY_WIFI_ENABLED = "wifi_enabled";
    private final AnalyticsApi analyticsApi;
    private final AnalyticsSession analyticsSession;
    private final IAppForegroundDetector appForegroundDetector;
    private final IDevice device;
    private final ILocationService locationService;
    private final ILyftPreferences lyftPreferences;
    private final IUserSession userSession;

    MixpanelWrapper(AnalyticsApi analyticsapi, IUserSession iusersession, ILocationService ilocationservice, ILyftPreferences ilyftpreferences, IDevice idevice, IAppForegroundDetector iappforegrounddetector, AnalyticsSession analyticssession)
    {
        analyticsApi = analyticsapi;
        userSession = iusersession;
        locationService = ilocationservice;
        lyftPreferences = ilyftpreferences;
        device = idevice;
        appForegroundDetector = iappforegrounddetector;
        analyticsSession = analyticssession;
    }

    private void removeKeysWithoutValue(Map map)
    {
        Object obj = new ArrayList();
        Iterator iterator = map.entrySet().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            java.util.Map.Entry entry = (java.util.Map.Entry)iterator.next();
            if (entry.getValue() == null)
            {
                ((ArrayList) (obj)).add(entry.getKey());
            }
        } while (true);
        for (obj = ((ArrayList) (obj)).iterator(); ((Iterator) (obj)).hasNext(); map.remove((String)((Iterator) (obj)).next())) { }
    }

    private void trackEvent(String s, Map map, Location location)
    {
        String s1;
        UserDTO userdto;
        try
        {
            s1 = (new StringBuilder()).append("client_").append(s).toString();
            userdto = userSession.getUser();
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            L.e(s, "trackEvent", new Object[0]);
            return;
        }
        if (map == null)
        {
            break MISSING_BLOCK_LABEL_617;
        }
        s = new HashMap(map);
_L1:
        s.put("event_name", s1);
        s.put("occurred_at", DateUtils.convertEpochToISO(System.currentTimeMillis()));
        s.put("os", "Android");
        s.put("os_version", android.os.Build.VERSION.RELEASE);
        s.put("manufacturer", Build.MANUFACTURER);
        s.put("model", Build.MODEL);
        map = device.getApplicationVersion();
        if (!Strings.isNullOrEmpty(map))
        {
            s.put("app_version", map);
        }
        map = device.getOperatorName();
        if (!Strings.isNullOrEmpty(map))
        {
            s.put("carrier", map);
        }
        if (!Strings.isNullOrEmpty(device.getNetworkType()))
        {
            s.put("wifi_enabled", Boolean.valueOf("WiFi".equalsIgnoreCase(device.getNetworkType())));
        }
        if (!NullUserDTO.isNull(userdto))
        {
            s.put("user_mode", userdto.getMode());
            s.put("user_id", userdto.getId());
            s.put("region", userdto.getRegion());
            if (!location.isNull())
            {
                s.put("lat", location.getLat());
                s.put("lng", location.getLng());
            }
            if ("driver".equalsIgnoreCase(userdto.getMode()))
            {
                map = device.getBatteryStatus();
                s.put("battery_level", Float.valueOf(map.getBatteryLevel()));
                s.put("is_charging", Boolean.valueOf(map.isCharging()));
            }
        }
        if (lyftPreferences.getMatId() != null)
        {
            s.put("mat_id", lyftPreferences.getMatId());
        }
        if (lyftPreferences.getAdvertisingId() != null)
        {
            s.put("advertising_id", lyftPreferences.getAdvertisingId());
        }
        s.put("android_id", device.getAndroidId());
        map = userSession.getRide();
        if (map == null)
        {
            break MISSING_BLOCK_LABEL_476;
        }
        s.put("ride_state", map.getStatus());
        s.put("ride_id", Objects.firstNonNull(map.getId(), ""));
        s.put("fg", Boolean.valueOf(appForegroundDetector.isForegrounded()));
        map = ScreenAnalytics.getCurrentPage();
        if (!Strings.isNullOrEmpty(map))
        {
            s.put("page", map);
        }
        map = analyticsSession.getSessionId(false);
        if (!Strings.isNullOrEmpty(map))
        {
            s.put("session_id", map);
        }
        s.put("screen_dpi", Integer.valueOf(device.getDensityDpi()));
        s.put("screen_height", device.getScreenHeight());
        s.put("screen_width", device.getScreenWidth());
        removeKeysWithoutValue(s);
        analyticsApi.track(s1, s);
        return;
        s = new HashMap();
          goto _L1
    }

    public void flush()
    {
        analyticsApi.flush();
    }

    void trackEvent(String s, Map map)
    {
        trackEvent(s, map, locationService.getLastCachedLocation());
    }
}
