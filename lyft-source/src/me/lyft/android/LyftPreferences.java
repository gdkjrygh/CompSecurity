// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.gson.Gson;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import me.lyft.android.analytics.session.AnalyticsSessionInfo;
import me.lyft.android.common.Objects;
import me.lyft.android.common.Strings;
import me.lyft.android.domain.ride.PassengerRideRequest;
import me.lyft.android.domain.tooltips.Tooltip;
import me.lyft.android.infrastructure.lyft.AppStateDTO;
import me.lyft.android.infrastructure.lyft.constants.AppInfo;
import me.lyft.android.infrastructure.lyft.googlenow.GoogleNowAuthCodeDTO;
import me.lyft.android.infrastructure.lyft.profile.UserDTO;
import me.lyft.android.logging.L;
import me.lyft.android.services.TimerRecord;
import me.lyft.android.ui.passenger.MatchingStartTime;

// Referenced classes of package me.lyft.android:
//            ILyftPreferences, RideFlags

public class LyftPreferences
    implements ILyftPreferences
{

    private static final String ADVERTISING_ID = "advertising_id";
    private static final String ANALYTICS_SESSION = "analytics_session";
    private static final String ANALYTICS_URL = "analytics_url";
    private static final String APP_INFO = "app_info";
    private static final String APP_VERSION_CODE = "app_version_code";
    private static final String ATS_API_ROOT = "ats_api_root";
    private static final String AUTO_NAVIGATION_ENABLED = "auto_navigation_enabled";
    private static final String COURIER_ENROUTE_DIALOG_SHOWN = "courier_enroute_dialog_shown";
    private static final String COURIER_ONBOARD_VIEW_COUNT = "courier_onboard_view_count";
    private static final String DEVELOPER_MODE = "developer_mode";
    private static final String DRIVER_SHORTCUT_ENABLED = "driver_shortcut_enabled";
    private static final String ENVIRONMENT_NAME = "environment_name";
    private static final String ENVIRONMENT_PRODUCTION = "production";
    private static final String FACEBOOK_APP_ID = "facebook_app_id";
    private static final String FIRST_TIME_DESTINY_DIALOG_SHOWN = "destiny_info_dialog_shown";
    private static final String GOOGLE_NOW_AUTH_CODE = "google_now_auth_code";
    private static final String IGNORE_RIDE_ID = "ignore_ride_id";
    private static final String INSTALL_REFERRER = "install_referral";
    private static final String INSTALL_STATUS = "install_status";
    private static final String IN_APP_NOTIFICATIONS = "in_app_notifications";
    private static final String LAST_CACHED_APP_STATE = "last_cached_app_state";
    private static final String LAST_PUSH_TIMESTAMP = "last_push_timestamp";
    private static final String LAST_RIDE_DESCRIPTION_SHOWN = "last_ride_description_shown";
    private static final String LAST_UPDATED_ASSETS_PACKAGE_NAME = "last_updated_assets_package_name";
    private static final String LIMIT_ADVERTISING_ID = "limit_advertising_id";
    private static final String LYFT_API_ROOT = "lyft_api_root";
    private static final String LYFT_PREFERENCES = "LyftPreferences";
    private static final String LYFT_TOKEN = "lyft_token";
    private static final String LYFT_WEB_ROOT = "lyft_web_root";
    private static final String MAT_ID = "mat_id";
    private static final String PASSENGER_MATCHING_START_TIME = "passenger_matching_start_time";
    private static final String POLLING_RATE = "polling_rate";
    private static final String PROXY_ENABLED = "proxy_enabled";
    private static final String PROXY_IP_ADDRESS = "proxy_ip_address";
    private static final String RATE_APP_PROMPT_TIMESTAMP = "rate_app_prompt_timestamp";
    private static final String RATING_DATA = "rating_data";
    private static final String RIDE_FLAGS = "ride_flags";
    private static final String RIDE_REQUEST_STATE = "ride_request_state";
    private static final String SELECTED_NAVIGATION = "selected_navigation";
    private static final String SHOWN_IN_APP_NOTIFICATIONS = "shown_in_app_notifications";
    private static final String SHOWN_MODE_DETAILS = "shown_mode_details";
    private static final String SHOW_TOS_OVER_MAP = "show_tos_over_map";
    private static final String SOCIAL_DIALOG_GAP_COUNT = "social_dialog_gap_count";
    private static final String SOCIAL_DIALOG_SHOW_COUNT = "social_dialog_show_count";
    private static final String STRIPE_KEY = "stripe_key";
    private static final String TOOLTIPS_PREFIX = "tooltip_";
    final Context context;
    final Gson gson;
    final SharedPreferences preferences;

    public LyftPreferences(Context context1, Gson gson1)
    {
        context = context1;
        gson = gson1;
        preferences = context1.getSharedPreferences("LyftPreferences", 0);
    }

    private Object getSerializable(String s, Class class1)
    {
        String s1 = preferences.getString(s, null);
        if (Strings.isNullOrEmpty(s1))
        {
            return null;
        }
        try
        {
            class1 = ((Class) (gson.a(s1, class1)));
        }
        // Misplaced declaration of an exception variable
        catch (Class class1)
        {
            class1 = preferences.edit();
            class1.remove(s);
            class1.apply();
            return null;
        }
        return class1;
    }

    private void putSerializable(String s, Object obj)
    {
        android.content.SharedPreferences.Editor editor = preferences.edit();
        if (obj == null)
        {
            editor.remove(s);
        } else
        {
            try
            {
                editor.putString(s, gson.a(obj));
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                L.e(s, "putSerializable", new Object[0]);
            }
        }
        editor.apply();
    }

    public void clearRideRequest()
    {
        setRideRequest(new PassengerRideRequest(getRideRequest().getSelectedRideTypeId()));
    }

    public void clearTooltips()
    {
        Object obj = preferences.getAll().keySet();
        android.content.SharedPreferences.Editor editor = preferences.edit();
        obj = ((Set) (obj)).iterator();
        do
        {
            if (!((Iterator) (obj)).hasNext())
            {
                break;
            }
            String s = (String)((Iterator) (obj)).next();
            if (s.startsWith("tooltip_"))
            {
                editor.remove(s);
            }
        } while (true);
        editor.apply();
    }

    public Integer decrementCourierDriverOnboardView()
    {
        int i = preferences.getInt("courier_onboard_view_count", 3);
        if (i > 0)
        {
            android.content.SharedPreferences.Editor editor = preferences.edit();
            editor.putInt("courier_onboard_view_count", i - 1);
            editor.apply();
        }
        return Integer.valueOf(i);
    }

    public String getATSApiRoot()
    {
        return preferences.getString("ats_api_root", context.getString(0x7f07006b));
    }

    public String getAdvertisingId()
    {
        return preferences.getString("advertising_id", null);
    }

    public AnalyticsSessionInfo getAnalyticsSession()
    {
        return (AnalyticsSessionInfo)getSerializable("analytics_session", me/lyft/android/analytics/session/AnalyticsSessionInfo);
    }

    public String getAnalyticsUrl()
    {
        return preferences.getString("analytics_url", context.getString(0x7f070065));
    }

    public AppInfo getAppInfo()
    {
        return (AppInfo)getSerializable("app_info", me/lyft/android/infrastructure/lyft/constants/AppInfo);
    }

    public Integer getAppVersionCode()
    {
        int i = preferences.getInt("app_version_code", -1);
        if (i >= 0)
        {
            return Integer.valueOf(i);
        } else
        {
            return null;
        }
    }

    public String getEnvironmentName()
    {
        return preferences.getString("environment_name", context.getString(0x7f07016c));
    }

    public String getFacebookAppId()
    {
        return preferences.getString("facebook_app_id", context.getString(0x7f070174));
    }

    public GoogleNowAuthCodeDTO getGoogleNowAuthCode()
    {
        return (GoogleNowAuthCodeDTO)getSerializable("google_now_auth_code", me/lyft/android/infrastructure/lyft/googlenow/GoogleNowAuthCodeDTO);
    }

    public String getIgnoreRideId()
    {
        return preferences.getString("ignore_ride_id", null);
    }

    public List getInAppNotifications()
    {
        ArrayList arraylist1 = (ArrayList)getSerializable("in_app_notifications", me/lyft/android/LyftPreferences$InAppNotificationList);
        ArrayList arraylist = arraylist1;
        if (arraylist1 == null)
        {
            arraylist = new ArrayList();
        }
        return arraylist;
    }

    public String getInstallReferrer()
    {
        return preferences.getString("install_referral", null);
    }

    public int getInstallStatus()
    {
        return preferences.getInt("install_status", 0);
    }

    public AppStateDTO getLastCachedAppState()
    {
        AppStateDTO appstatedto1 = (AppStateDTO)getSerializable("last_cached_app_state", me/lyft/android/infrastructure/lyft/AppStateDTO);
        AppStateDTO appstatedto = appstatedto1;
        if (appstatedto1 == null)
        {
            appstatedto = new AppStateDTO(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
        }
        return appstatedto;
    }

    public long getLastPushTimestamp()
    {
        return preferences.getLong("last_push_timestamp", 0L);
    }

    public String getLastUnpackedAssetsPackageName()
    {
        return preferences.getString("last_updated_assets_package_name", "");
    }

    public boolean getLimitAdvertisingId()
    {
        return preferences.getBoolean("limit_advertising_id", false);
    }

    public String getLyftApiRoot()
    {
        return preferences.getString("lyft_api_root", context.getString(0x7f0701fe));
    }

    public String getLyftToken()
    {
        return preferences.getString("lyft_token", null);
    }

    public String getLyftWebRoot()
    {
        return preferences.getString("lyft_web_root", context.getString(0x7f070201));
    }

    public String getMatId()
    {
        return preferences.getString("mat_id", null);
    }

    public MatchingStartTime getPassengerMatchingStartTime()
    {
        return (MatchingStartTime)Objects.firstNonNull(getSerializable("passenger_matching_start_time", me/lyft/android/ui/passenger/MatchingStartTime), new MatchingStartTime(""));
    }

    public long getPollingRate()
    {
        return preferences.getLong("polling_rate", UserDTO.DEFAULT_POLLING_RATE);
    }

    public String getProxyIpAddress()
    {
        return preferences.getString("proxy_ip_address", "");
    }

    public RideFlags getRideFlags()
    {
        return (RideFlags)Objects.firstNonNull((RideFlags)getSerializable("ride_flags", me/lyft/android/RideFlags), new RideFlags());
    }

    public PassengerRideRequest getRideRequest()
    {
        PassengerRideRequest passengerriderequest1 = (PassengerRideRequest)getSerializable("ride_request_state", me/lyft/android/domain/ride/PassengerRideRequest);
        if (passengerriderequest1 != null)
        {
            String s = passengerriderequest1.getSelectedRideTypeId();
            PassengerRideRequest passengerriderequest = passengerriderequest1;
            if (Math.abs(passengerriderequest1.getTimestamp().longValue() - System.currentTimeMillis()) > 0xdbba0L)
            {
                passengerriderequest = new PassengerRideRequest(s);
            }
            return passengerriderequest;
        } else
        {
            return new PassengerRideRequest("");
        }
    }

    public int getSelectedNavigation()
    {
        return preferences.getInt("selected_navigation", 0);
    }

    public int getShareDialogShowCount()
    {
        return preferences.getInt("social_dialog_show_count", 0);
    }

    public boolean getShowTermsOfServiceOverRideView()
    {
        return preferences.getBoolean("show_tos_over_map", true);
    }

    public Set getShownInAppNotifications()
    {
        LinkedHashSet linkedhashset1 = (LinkedHashSet)getSerializable("shown_in_app_notifications", (new LinkedHashSet()).getClass());
        LinkedHashSet linkedhashset = linkedhashset1;
        if (linkedhashset1 == null)
        {
            linkedhashset = new LinkedHashSet();
        }
        return linkedhashset;
    }

    public Set getShownModeDetails()
    {
        Set set = (Set)getSerializable("shown_mode_details", (new LinkedHashSet()).getClass());
        Object obj = set;
        if (set == null)
        {
            obj = new LinkedHashSet();
        }
        return ((Set) (obj));
    }

    public String getStripeKey()
    {
        return preferences.getString("stripe_key", context.getString(0x7f07035a));
    }

    public TimerRecord getTimerRecord(String s)
    {
        return (TimerRecord)getSerializable(s, me/lyft/android/services/TimerRecord);
    }

    public Tooltip getTooltip(String s)
    {
        return (Tooltip)getSerializable((new StringBuilder()).append("tooltip_").append(s).toString(), me/lyft/android/domain/tooltips/Tooltip);
    }

    public void increaseShownCount()
    {
        preferences.edit().putInt("social_dialog_show_count", getShareDialogShowCount() + 1).apply();
    }

    public boolean isAutoNavigationEnabled()
    {
        return preferences.getBoolean("auto_navigation_enabled", true);
    }

    public boolean isCourierEnrouteDialogShown()
    {
        return preferences.getBoolean("courier_enroute_dialog_shown", false);
    }

    public boolean isDeveloperMode()
    {
        return preferences.getBoolean("developer_mode", false);
    }

    public boolean isDriverShortcutEnabled()
    {
        return preferences.getBoolean("driver_shortcut_enabled", false);
    }

    public boolean isFirstTimeDestinyInfoShown()
    {
        return preferences.getBoolean("destiny_info_dialog_shown", false);
    }

    public boolean isProductionEnvironment()
    {
        return "production".equalsIgnoreCase(getEnvironmentName());
    }

    public boolean isProxyEnabled()
    {
        return preferences.getBoolean("proxy_enabled", false);
    }

    public void resetRideFlags()
    {
        setRideFlags(null);
    }

    public void saveTooltip(Tooltip tooltip)
    {
        putSerializable((new StringBuilder()).append("tooltip_").append(tooltip.getId()).toString(), tooltip);
    }

    public void setAdvertisingId(String s)
    {
        android.content.SharedPreferences.Editor editor = preferences.edit();
        editor.putString("advertising_id", s);
        editor.apply();
    }

    public void setAnalyticsSession(AnalyticsSessionInfo analyticssessioninfo)
    {
        putSerializable("analytics_session", analyticssessioninfo);
    }

    public void setAnalyticsUrl(String s)
    {
        android.content.SharedPreferences.Editor editor = preferences.edit();
        editor.putString("analytics_url", s);
        editor.apply();
    }

    public void setAppInfo(AppInfo appinfo)
    {
        putSerializable("app_info", appinfo);
    }

    public void setAppVersionCode(Integer integer)
    {
        android.content.SharedPreferences.Editor editor = preferences.edit();
        editor.putInt("app_version_code", integer.intValue());
        editor.apply();
    }

    public void setAtsApiRoot(String s)
    {
        android.content.SharedPreferences.Editor editor = preferences.edit();
        editor.putString("ats_api_root", s);
        editor.apply();
    }

    public void setAutoNavigationEnabled(boolean flag)
    {
        android.content.SharedPreferences.Editor editor = preferences.edit();
        editor.putBoolean("auto_navigation_enabled", flag);
        editor.apply();
    }

    public void setCourierEnrouteDialogShown(boolean flag)
    {
        android.content.SharedPreferences.Editor editor = preferences.edit();
        editor.putBoolean("courier_enroute_dialog_shown", flag);
        editor.apply();
    }

    public void setDeveloperMode(boolean flag)
    {
        android.content.SharedPreferences.Editor editor = preferences.edit();
        editor.putBoolean("developer_mode", flag);
        editor.apply();
    }

    public void setDriverShortcutEnabled(boolean flag)
    {
        android.content.SharedPreferences.Editor editor = preferences.edit();
        editor.putBoolean("driver_shortcut_enabled", flag);
        editor.apply();
    }

    public void setEnvironmentName(String s)
    {
        android.content.SharedPreferences.Editor editor = preferences.edit();
        editor.putString("environment_name", s);
        editor.apply();
    }

    public void setFacebookAppId(String s)
    {
        android.content.SharedPreferences.Editor editor = preferences.edit();
        editor.putString("facebook_app_id", s);
        editor.apply();
    }

    public void setFirstTimeDestinyInfoShown(boolean flag)
    {
        android.content.SharedPreferences.Editor editor = preferences.edit();
        editor.putBoolean("destiny_info_dialog_shown", flag);
        editor.apply();
    }

    public void setGoogleNowAuthCode(GoogleNowAuthCodeDTO googlenowauthcodedto)
    {
        putSerializable("google_now_auth_code", googlenowauthcodedto);
    }

    public void setIgnoreRideId(String s)
    {
        android.content.SharedPreferences.Editor editor = preferences.edit();
        editor.putString("ignore_ride_id", s);
        editor.apply();
    }

    public void setInAppNotifications(List list)
    {
        putSerializable("in_app_notifications", list);
    }

    public void setInstallReferrer(String s)
    {
        android.content.SharedPreferences.Editor editor = preferences.edit();
        editor.putString("install_referral", s);
        editor.apply();
    }

    public void setInstallStatus(int i)
    {
        android.content.SharedPreferences.Editor editor = preferences.edit();
        editor.putInt("install_status", i);
        editor.apply();
    }

    public void setLastCachedAppState(AppStateDTO appstatedto)
    {
        putSerializable("last_cached_app_state", appstatedto);
    }

    public void setLastPushTimestamp(long l)
    {
        android.content.SharedPreferences.Editor editor = preferences.edit();
        editor.putLong("last_push_timestamp", l);
        editor.apply();
    }

    public void setLastRideDescriptionShown()
    {
        android.content.SharedPreferences.Editor editor = preferences.edit();
        editor.putBoolean("last_ride_description_shown", true);
        editor.apply();
    }

    public void setLastUnpackedAssetsPackageName(String s)
    {
        android.content.SharedPreferences.Editor editor = preferences.edit();
        editor.putString("last_updated_assets_package_name", s);
        editor.apply();
    }

    public void setLimitAdvertisingId(boolean flag)
    {
        android.content.SharedPreferences.Editor editor = preferences.edit();
        editor.putBoolean("limit_advertising_id", flag);
        editor.apply();
    }

    public void setLyftApiRoot(String s)
    {
        android.content.SharedPreferences.Editor editor = preferences.edit();
        editor.putString("lyft_api_root", s);
        editor.apply();
    }

    public void setLyftToken(String s)
    {
        android.content.SharedPreferences.Editor editor = preferences.edit();
        editor.putString("lyft_token", s);
        editor.apply();
    }

    public void setLyftWebRoot(String s)
    {
        android.content.SharedPreferences.Editor editor = preferences.edit();
        editor.putString("lyft_web_root", s);
        editor.apply();
    }

    public void setMatId(String s)
    {
        android.content.SharedPreferences.Editor editor = preferences.edit();
        editor.putString("mat_id", s);
        editor.apply();
    }

    public void setPassengerMatchingStartTime(MatchingStartTime matchingstarttime)
    {
        putSerializable("passenger_matching_start_time", matchingstarttime);
    }

    public void setPollingRate(Long long1)
    {
        android.content.SharedPreferences.Editor editor = preferences.edit();
        editor.putLong("polling_rate", long1.longValue());
        editor.apply();
    }

    public void setProxyEnabled(Boolean boolean1)
    {
        android.content.SharedPreferences.Editor editor = preferences.edit();
        editor.putBoolean("proxy_enabled", boolean1.booleanValue());
        editor.apply();
    }

    public void setProxyIpAddress(String s)
    {
        android.content.SharedPreferences.Editor editor = preferences.edit();
        editor.putString("proxy_ip_address", s);
        editor.apply();
    }

    public void setRateAppPromptTimestamp(long l)
    {
        android.content.SharedPreferences.Editor editor = preferences.edit();
        editor.putLong("rate_app_prompt_timestamp", l);
        editor.apply();
    }

    public void setRideFlags(RideFlags rideflags)
    {
        putSerializable("ride_flags", Objects.firstNonNull(rideflags, new RideFlags()));
    }

    public void setRideRequest(PassengerRideRequest passengerriderequest)
    {
        putSerializable("ride_request_state", passengerriderequest);
    }

    public void setSelectedNavigation(int i)
    {
        android.content.SharedPreferences.Editor editor = preferences.edit();
        editor.putInt("selected_navigation", i);
        editor.apply();
    }

    public void setShowTermsOfServiceOverRideView(boolean flag)
    {
        android.content.SharedPreferences.Editor editor = preferences.edit();
        editor.putBoolean("show_tos_over_map", flag);
        editor.apply();
    }

    public void setShownInAppNotifications(Set set)
    {
        putSerializable("shown_in_app_notifications", set);
    }

    public void setShownModeDetails(Set set)
    {
        putSerializable("shown_mode_details", set);
    }

    public void setStripeKey(String s)
    {
        android.content.SharedPreferences.Editor editor = preferences.edit();
        editor.putString("stripe_key", s);
        editor.apply();
    }

    public void setTimerRecord(String s, TimerRecord timerrecord)
    {
        putSerializable(s, timerrecord);
    }

    public boolean shouldShowRateAppPrompt()
    {
        long l = preferences.getLong("rate_app_prompt_timestamp", 0L);
        return System.currentTimeMillis() - l > 0x19bfcc00L;
    }

    public boolean wasLastRideDescriptionShown()
    {
        return preferences.getBoolean("last_ride_description_shown", false);
    }
}
