// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android;

import java.util.List;
import java.util.Set;
import me.lyft.android.analytics.session.AnalyticsSessionInfo;
import me.lyft.android.domain.ride.PassengerRideRequest;
import me.lyft.android.domain.tooltips.Tooltip;
import me.lyft.android.infrastructure.lyft.AppStateDTO;
import me.lyft.android.infrastructure.lyft.constants.AppInfo;
import me.lyft.android.infrastructure.lyft.googlenow.GoogleNowAuthCodeDTO;
import me.lyft.android.services.TimerRecord;
import me.lyft.android.ui.passenger.MatchingStartTime;

// Referenced classes of package me.lyft.android:
//            RideFlags

public interface ILyftPreferences
{

    public static final long APP_STATE_STATE_EXPIRE_TIMEOUT = 0x5265c00L;
    public static final int INSTALL_STATUS_NEW_INSTALL = 1;
    public static final int INSTALL_STATUS_NONE = 0;
    public static final int INSTALL_STATUS_UPDATE = 2;
    public static final long MINIMAL_DELAY_BETWEEN_RATE_APP_PROMPT = 0x19bfcc00L;
    public static final long MIN_POLLING_RATE = 1000L;
    public static final long RIDE_REQUEST_STATE_EXPIRE_TIMEOUT = 0xdbba0L;

    public abstract void clearRideRequest();

    public abstract void clearTooltips();

    public abstract Integer decrementCourierDriverOnboardView();

    public abstract String getATSApiRoot();

    public abstract String getAdvertisingId();

    public abstract AnalyticsSessionInfo getAnalyticsSession();

    public abstract String getAnalyticsUrl();

    public abstract AppInfo getAppInfo();

    public abstract Integer getAppVersionCode();

    public abstract String getEnvironmentName();

    public abstract String getFacebookAppId();

    public abstract GoogleNowAuthCodeDTO getGoogleNowAuthCode();

    public abstract String getIgnoreRideId();

    public abstract List getInAppNotifications();

    public abstract String getInstallReferrer();

    public abstract int getInstallStatus();

    public abstract AppStateDTO getLastCachedAppState();

    public abstract long getLastPushTimestamp();

    public abstract String getLastUnpackedAssetsPackageName();

    public abstract boolean getLimitAdvertisingId();

    public abstract String getLyftApiRoot();

    public abstract String getLyftToken();

    public abstract String getLyftWebRoot();

    public abstract String getMatId();

    public abstract MatchingStartTime getPassengerMatchingStartTime();

    public abstract long getPollingRate();

    public abstract String getProxyIpAddress();

    public abstract RideFlags getRideFlags();

    public abstract PassengerRideRequest getRideRequest();

    public abstract int getSelectedNavigation();

    public abstract int getShareDialogShowCount();

    public abstract boolean getShowTermsOfServiceOverRideView();

    public abstract Set getShownInAppNotifications();

    public abstract Set getShownModeDetails();

    public abstract String getStripeKey();

    public abstract TimerRecord getTimerRecord(String s);

    public abstract Tooltip getTooltip(String s);

    public abstract void increaseShownCount();

    public abstract boolean isAutoNavigationEnabled();

    public abstract boolean isCourierEnrouteDialogShown();

    public abstract boolean isDeveloperMode();

    public abstract boolean isDriverShortcutEnabled();

    public abstract boolean isFirstTimeDestinyInfoShown();

    public abstract boolean isProductionEnvironment();

    public abstract boolean isProxyEnabled();

    public abstract void resetRideFlags();

    public abstract void saveTooltip(Tooltip tooltip);

    public abstract void setAdvertisingId(String s);

    public abstract void setAnalyticsSession(AnalyticsSessionInfo analyticssessioninfo);

    public abstract void setAnalyticsUrl(String s);

    public abstract void setAppInfo(AppInfo appinfo);

    public abstract void setAppVersionCode(Integer integer);

    public abstract void setAtsApiRoot(String s);

    public abstract void setAutoNavigationEnabled(boolean flag);

    public abstract void setCourierEnrouteDialogShown(boolean flag);

    public abstract void setDeveloperMode(boolean flag);

    public abstract void setDriverShortcutEnabled(boolean flag);

    public abstract void setEnvironmentName(String s);

    public abstract void setFacebookAppId(String s);

    public abstract void setFirstTimeDestinyInfoShown(boolean flag);

    public abstract void setGoogleNowAuthCode(GoogleNowAuthCodeDTO googlenowauthcodedto);

    public abstract void setIgnoreRideId(String s);

    public abstract void setInAppNotifications(List list);

    public abstract void setInstallReferrer(String s);

    public abstract void setInstallStatus(int i);

    public abstract void setLastCachedAppState(AppStateDTO appstatedto);

    public abstract void setLastPushTimestamp(long l);

    public abstract void setLastRideDescriptionShown();

    public abstract void setLastUnpackedAssetsPackageName(String s);

    public abstract void setLimitAdvertisingId(boolean flag);

    public abstract void setLyftApiRoot(String s);

    public abstract void setLyftToken(String s);

    public abstract void setLyftWebRoot(String s);

    public abstract void setMatId(String s);

    public abstract void setPassengerMatchingStartTime(MatchingStartTime matchingstarttime);

    public abstract void setPollingRate(Long long1);

    public abstract void setProxyEnabled(Boolean boolean1);

    public abstract void setProxyIpAddress(String s);

    public abstract void setRateAppPromptTimestamp(long l);

    public abstract void setRideFlags(RideFlags rideflags);

    public abstract void setRideRequest(PassengerRideRequest passengerriderequest);

    public abstract void setSelectedNavigation(int i);

    public abstract void setShowTermsOfServiceOverRideView(boolean flag);

    public abstract void setShownInAppNotifications(Set set);

    public abstract void setShownModeDetails(Set set);

    public abstract void setStripeKey(String s);

    public abstract void setTimerRecord(String s, TimerRecord timerrecord);

    public abstract boolean shouldShowRateAppPrompt();

    public abstract boolean wasLastRideDescriptionShown();
}
