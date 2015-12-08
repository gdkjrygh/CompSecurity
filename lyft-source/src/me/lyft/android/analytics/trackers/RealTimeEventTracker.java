// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.analytics.trackers;

import android.os.Build;
import java.util.UUID;
import me.lyft.android.ILyftPreferences;
import me.lyft.android.IUserSession;
import me.lyft.android.analytics.IEvent;
import me.lyft.android.analytics.IEventTracker;
import me.lyft.android.analytics.definitions.Event2;
import me.lyft.android.analytics.definitions.MapParameterStore;
import me.lyft.android.analytics.definitions.Parameter;
import me.lyft.android.analytics.definitions.ParameterStore;
import me.lyft.android.analytics.definitions.Subevent;
import me.lyft.android.analytics.session.AnalyticsSession;
import me.lyft.android.application.IUserProvider;
import me.lyft.android.application.ride.IRideRequestSession;
import me.lyft.android.common.DateUtils;
import me.lyft.android.common.Objects;
import me.lyft.android.domain.User;
import me.lyft.android.domain.location.Location;
import me.lyft.android.domain.ride.RequestRideType;
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

public class RealTimeEventTracker
    implements IEventTracker
{

    private final AnalyticsApi analyticsApi;
    private final AnalyticsSession analyticsSession;
    private final IDevice device;
    private final IAppForegroundDetector foregroundDetector;
    private final ILocationService locationService;
    private final ILyftPreferences lyftPreferences;
    private final IRideRequestSession rideRequestSession;
    private final IUserProvider userProvider;
    private final IUserSession userSession;

    RealTimeEventTracker(AnalyticsApi analyticsapi, AnalyticsSession analyticssession, ILyftPreferences ilyftpreferences, ILocationService ilocationservice, IUserProvider iuserprovider, IRideRequestSession iriderequestsession, IDevice idevice, 
            IAppForegroundDetector iappforegrounddetector, IUserSession iusersession)
    {
        analyticsApi = analyticsapi;
        lyftPreferences = ilyftpreferences;
        analyticsSession = analyticssession;
        locationService = ilocationservice;
        userProvider = iuserprovider;
        rideRequestSession = iriderequestsession;
        device = idevice;
        foregroundDetector = iappforegrounddetector;
        userSession = iusersession;
    }

    private String getSessionId()
    {
        boolean flag = foregroundDetector.isForegrounded();
        return analyticsSession.getSessionId(flag);
    }

    static void mapClientInfo(ParameterStore parameterstore, IDevice idevice, IAppForegroundDetector iappforegrounddetector)
    {
        parameterstore.put(Parameter.APP_ID, "me.lyft.android");
        parameterstore.put(Parameter.APP_VERSION, idevice.getApplicationVersion());
        parameterstore.put(Parameter.OS, "Android");
        parameterstore.put(Parameter.OS_VERSION, android.os.Build.VERSION.RELEASE);
        parameterstore.put(Parameter.MANUFACTURER, Build.MANUFACTURER);
        parameterstore.put(Parameter.MODEL, Build.MODEL);
        parameterstore.put(Parameter.DEVICE_ID, idevice.getAndroidId());
        Parameter parameter = Parameter.BACKGROUND;
        boolean flag;
        if (!iappforegrounddetector.isForegrounded())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        parameterstore.put(parameter, Boolean.valueOf(flag));
        parameterstore.put(Parameter.LOCALE, idevice.getDeviceLocale());
    }

    static void mapDeviceInfo(ParameterStore parameterstore, IDevice idevice)
    {
        parameterstore.put(Parameter.SCREEN_DPI, Integer.valueOf(idevice.getDensityDpi()));
        parameterstore.put(Parameter.SCREEN_HEIGHT, idevice.getScreenHeight());
        parameterstore.put(Parameter.SCREEN_WIDTH, idevice.getScreenWidth());
        idevice = idevice.getBatteryStatus();
        parameterstore.put(Parameter.BATTERY_LEVEL, Float.valueOf(idevice.getBatteryLevel()));
        parameterstore.put(Parameter.BATTERY_CHARGING, Boolean.valueOf(idevice.isCharging()));
    }

    static void mapLocationInfo(ParameterStore parameterstore, IUserSession iusersession, ILocationService ilocationservice)
    {
        iusersession = iusersession.getUser();
        if (!NullUserDTO.isNull(iusersession))
        {
            parameterstore.put(Parameter.REGION, iusersession.getRegion());
        }
        iusersession = ilocationservice.getLastCachedLocation();
        if (!iusersession.isNull())
        {
            parameterstore.put(Parameter.LATITUDE, CoordinateWeakener.weaken(iusersession.getLat()));
            parameterstore.put(Parameter.LONGITUDE, CoordinateWeakener.weaken(iusersession.getLng()));
            parameterstore.put(Parameter.ALTITUDE, iusersession.getAltitude());
            if (iusersession.getBearing() != null && iusersession.getBearing().doubleValue() != -1D)
            {
                parameterstore.put(Parameter.BEARING, iusersession.getBearing());
            }
            parameterstore.put(Parameter.SPEED, iusersession.getSpeed());
            parameterstore.put(Parameter.ACCURACY, iusersession.getAccuracy());
            if (iusersession.getTime() != null)
            {
                parameterstore.put(Parameter.SAMPLED_AT, DateUtils.convertEpochToISO(iusersession.getTime().longValue()));
            }
        }
    }

    static void mapNetworkInfo(ParameterStore parameterstore, IDevice idevice)
    {
        parameterstore.put(Parameter.NETWORK_TYPE, idevice.getNetworkType());
        parameterstore.put(Parameter.RADIO_TYPE, idevice.getRadioType());
        parameterstore.put(Parameter.CARRIER, idevice.getOperatorName());
        parameterstore.put(Parameter.CARRIER_ISO, idevice.getNetworkIso());
        parameterstore.put(Parameter.CARRIER_MCC, idevice.getMobileCountryCode());
        parameterstore.put(Parameter.CARRIER_MNC, idevice.getMobileNetworkCode());
    }

    static void mapRideInfo(ParameterStore parameterstore, IUserSession iusersession, IRideRequestSession iriderequestsession)
    {
        iusersession = iusersession.getRide();
        if (iusersession != null)
        {
            parameterstore.put(Parameter.RIDE_ID, (String)Objects.firstNonNull(iusersession.getId(), ""));
            parameterstore.put(Parameter.RIDE_STATE, iusersession.getStatus());
            parameterstore.put(Parameter.RIDE_TYPE, iusersession.getRideTypeId());
            return;
        } else
        {
            iusersession = iriderequestsession.getCurrentRideType().getId();
            parameterstore.put(Parameter.RIDE_TYPE, iusersession);
            return;
        }
    }

    static void mapUserInfo(ParameterStore parameterstore, IUserProvider iuserprovider, IUserSession iusersession)
    {
        iuserprovider = iuserprovider.getUser();
        if (iuserprovider != null && !iuserprovider.isNull())
        {
            parameterstore.put(Parameter.USER_ID, iuserprovider.getId());
            if (iuserprovider.getMode() == me.lyft.android.domain.User.UserMode.DRIVER)
            {
                iuserprovider = "driver";
            } else
            if (iuserprovider.getMode() == me.lyft.android.domain.User.UserMode.PASSENGER)
            {
                iuserprovider = "passenger";
            } else
            {
                iuserprovider = "unauthorized";
            }
            parameterstore.put(Parameter.USER_MODE, iuserprovider);
            parameterstore.put(Parameter.USER_REFERRAL_CODE, (String)Objects.firstNonNull(iusersession.getUser().getReferralCode(), ""));
        }
    }

    static void mapVendorInfo(ParameterStore parameterstore, IDevice idevice, ILyftPreferences ilyftpreferences)
    {
        parameterstore.put(Parameter.ANDROID_ID, idevice.getAndroidId());
        parameterstore.put(Parameter.GOOGLE_AID, ilyftpreferences.getAdvertisingId());
        parameterstore.put(Parameter.TUNE_MAT_ID, ilyftpreferences.getMatId());
    }

    private void trackEvent(Event2 event2)
    {
        MapParameterStore mapparameterstore = new MapParameterStore();
        String s = (new StringBuilder()).append("client_").append(event2.getName()).toString();
        mapparameterstore.put(Parameter.EVENT_NAME, s);
        mapparameterstore.put(Parameter.EVENT_ID, UUID.randomUUID().toString());
        mapparameterstore.put(Parameter.EVENT_VERSION, Integer.valueOf(event2.getEventVersion()));
        mapparameterstore.put(Parameter.SAMPLE_RATE, Float.valueOf(1.0F));
        mapparameterstore.put(Parameter.OCCURRED_AT, DateUtils.convertEpochToISO(System.currentTimeMillis()));
        mapparameterstore.put(Parameter.SESSION_ID, getSessionId());
        if (event2.contains(Subevent.USER))
        {
            mapUserInfo(mapparameterstore, userProvider, userSession);
        }
        if (event2.contains(Subevent.CLIENT))
        {
            mapClientInfo(mapparameterstore, device, foregroundDetector);
        }
        if (event2.contains(Subevent.RIDE))
        {
            mapRideInfo(mapparameterstore, userSession, rideRequestSession);
        }
        if (event2.contains(Subevent.VENDOR))
        {
            mapVendorInfo(mapparameterstore, device, lyftPreferences);
        }
        if (event2.contains(Subevent.DEVICE))
        {
            mapDeviceInfo(mapparameterstore, device);
        }
        if (event2.contains(Subevent.LOCATION))
        {
            mapLocationInfo(mapparameterstore, userSession, locationService);
        }
        if (event2.contains(Subevent.NETWORK))
        {
            mapNetworkInfo(mapparameterstore, device);
        }
        mapparameterstore.overrideParameters(event2.getParameters());
        analyticsApi.track(s, mapparameterstore.getMap());
    }

    public void flush()
    {
        analyticsApi.flush();
    }

    public void track(IEvent ievent)
    {
        if (!(ievent instanceof Event2))
        {
            break MISSING_BLOCK_LABEL_15;
        }
        trackEvent((Event2)ievent);
        return;
        Exception exception;
        exception;
        L.e(exception, "failed to track the event: %s", new Object[] {
            ievent.getName()
        });
        return;
    }

    private class CoordinateWeakener
    {

        private static final DecimalFormat COORDINATE_FORMAT;

        private static Double weaken(Double double1)
        {
            if (double1 != null)
            {
                return Double.valueOf(COORDINATE_FORMAT.format(double1));
            } else
            {
                return null;
            }
        }

        static 
        {
            DecimalFormatSymbols decimalformatsymbols = new DecimalFormatSymbols(Locale.US);
            decimalformatsymbols.setDecimalSeparator('.');
            COORDINATE_FORMAT = new DecimalFormat("0.##", decimalformatsymbols);
        }


        private CoordinateWeakener()
        {
        }
    }

}
