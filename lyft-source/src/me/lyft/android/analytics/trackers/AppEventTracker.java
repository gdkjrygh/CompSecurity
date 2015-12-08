// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.analytics.trackers;

import android.app.Activity;
import com.google.gson.Gson;
import com.kochava.android.tracker.Feature;
import com.mobileapptracker.MATEvent;
import com.mobileapptracker.MobileAppTracker;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import me.lyft.android.ILyftPreferences;
import me.lyft.android.IUserSession;
import me.lyft.android.analytics.AsyncActionAnalytics;
import me.lyft.android.analytics.IEvent;
import me.lyft.android.analytics.IEventTracker;
import me.lyft.android.analytics.definitions.LifecycleEvent;
import me.lyft.android.analytics.definitions.Parameter;
import me.lyft.android.analytics.studies.AppAnalytics;
import me.lyft.android.application.geo.IEtaAnalyticService;
import me.lyft.android.application.ride.IRideRequestSession;
import me.lyft.android.application.system.ILyftSystemRepository;
import me.lyft.android.common.Objects;
import me.lyft.android.common.Strings;
import me.lyft.android.common.Unit;
import me.lyft.android.domain.User;
import me.lyft.android.domain.geo.EtaRecord;
import me.lyft.android.domain.ride.Pricing;
import me.lyft.android.domain.ride.RequestRideType;
import me.lyft.android.domain.system.LyftSystem;
import me.lyft.android.infrastructure.device.IDevice;
import me.lyft.android.infrastructure.lyft.profile.PhoneDTO;
import me.lyft.android.infrastructure.lyft.profile.UserDTO;
import me.lyft.android.logging.L;
import me.lyft.android.providers.AdvertisingIdProvider;
import me.lyft.android.rx.ReactiveProperty;
import me.lyft.android.rx.SecureSubscriber;
import rx.Observable;
import rx.android.schedulers.AndroidSchedulers;
import rx.functions.Func2;
import rx.schedulers.Schedulers;

public class AppEventTracker
    implements IEventTracker
{

    private static final String EVENT_APP_CLOSE = "client_app_close";
    private static final String EVENT_APP_OPEN = "client_app_open";
    private static final String EVENT_APP_VERSION_UPDATE = "client_app_version_update";
    private static final String EVENT_CLIENT_RIDE_TYPE_SWITCH = "client_ride_type_switch";
    private static final String EVENT_USER_INSTALL = "event_user_install";
    private static final String PROPERTY_APP_VERSION = "app_version";
    private static final String PROPERTY_COUPON_CODE_PRESENT = "coupon_code_present";
    private static final String PROPERTY_ELIGIBLE_TO_REQUEST = "eligible_to_request";
    private static final String PROPERTY_NEAREST_DRIVER_ETA = "nearest_driver_eta";
    private static final String PROPERTY_PLATFORM = "platform";
    private static final String PROPERTY_PRIME_TIME_PERCENT = "prime_time_percent";
    private static final String PROPERTY_REGION = "region";
    private static final String PROPERTY_RIDE_TYPE = "ride_type";
    private final ReactiveProperty advertisingIdFetchedSubject = ReactiveProperty.create();
    private final AdvertisingIdProvider advertisingIdProvider;
    private final IDevice device;
    private final IEtaAnalyticService etaAnalyticService;
    private final Feature feature;
    private final Gson gson;
    private final ILyftPreferences lyftPreferences;
    private final ILyftSystemRepository lyftSystemRepository;
    private final ReactiveProperty matIdInitSubject = ReactiveProperty.create();
    private final MobileAppTracker mobileAppTracker;
    private final IRideRequestSession rideRequestSession;
    private final IUserSession userSession;

    AppEventTracker(IEtaAnalyticService ietaanalyticservice, IUserSession iusersession, IRideRequestSession iriderequestsession, Feature feature1, MobileAppTracker mobileapptracker, Gson gson1, IDevice idevice, 
            ILyftPreferences ilyftpreferences, AdvertisingIdProvider advertisingidprovider, ILyftSystemRepository ilyftsystemrepository)
    {
        etaAnalyticService = ietaanalyticservice;
        userSession = iusersession;
        lyftSystemRepository = ilyftsystemrepository;
        feature = feature1;
        mobileAppTracker = mobileapptracker;
        gson = gson1;
        device = idevice;
        lyftPreferences = ilyftpreferences;
        advertisingIdProvider = advertisingidprovider;
        rideRequestSession = iriderequestsession;
    }

    private String getAppVersion()
    {
        return device.getApplicationVersion();
    }

    private String getCouponCodePresent()
    {
        return String.valueOf(((List)Objects.firstNonNull(userSession.getUser().getCredits(), Collections.emptyList())).size());
    }

    private String getEligibleToRequest()
    {
        return String.valueOf(isRegistrationCompleted());
    }

    private String getNearestDriverEta()
    {
        return String.valueOf(etaAnalyticService.getRecord().getEta());
    }

    private String getPlatform()
    {
        return device.getPlatform();
    }

    private String getPrimeTimePercent()
    {
        return String.valueOf(rideRequestSession.getCurrentRideType().getPricing().getDynamicPricing());
    }

    private String getRegion()
    {
        return lyftSystemRepository.getSystem().getRegion();
    }

    private boolean isRegistrationCompleted()
    {
        UserDTO userdto = userSession.getUser();
        PhoneDTO phonedto = (PhoneDTO)Objects.firstNonNull(userdto.getPhone(), new PhoneDTO(null, null, null));
        return ((Boolean)Objects.firstNonNull(userdto.isTermsAccepted(), Boolean.valueOf(false))).booleanValue() && !Strings.isNullOrEmpty(phonedto.getNumber()) && !((Boolean)Objects.firstNonNull(phonedto.getVerificationNeeded(), Boolean.valueOf(true))).booleanValue() && !Strings.isNullOrEmpty(userdto.getEmail()) && !Strings.isNullOrEmpty(userdto.getFirstName()) && !Strings.isNullOrEmpty(userdto.getLastName()) && ((List)Objects.firstNonNull(userdto.getChargeAccounts(), new ArrayList())).size() > 0;
    }

    private void trackAppClose()
    {
        try
        {
            String s = getRegion();
            String s1 = getNearestDriverEta();
            String s2 = getCouponCodePresent();
            String s3 = getPrimeTimePercent();
            HashMap hashmap = new HashMap();
            hashmap.put("nearest_driver_eta", s1);
            hashmap.put("coupon_code_present", s2);
            hashmap.put("prime_time_percent", s3);
            feature.a("client_app_close", gson.a(hashmap));
            mobileAppTracker.a((new MATEvent("client_app_close")).a(s).b(s1).c(s2).d(s3));
            return;
        }
        catch (Throwable throwable)
        {
            L.e(throwable, "trackAppClose failed", new Object[0]);
        }
    }

    private void trackAppOpen()
    {
        try
        {
            String s = getRegion();
            String s1 = getNearestDriverEta();
            String s2 = getCouponCodePresent();
            String s3 = getPrimeTimePercent();
            String s4 = getEligibleToRequest();
            HashMap hashmap = new HashMap();
            hashmap.put("region", s);
            hashmap.put("nearest_driver_eta", s1);
            hashmap.put("coupon_code_present", s2);
            hashmap.put("prime_time_percent", s3);
            hashmap.put("eligible_to_request", s4);
            feature.a("client_app_open", gson.a(hashmap));
            mobileAppTracker.a((new MATEvent("client_app_open")).a(s).b(s1).c(s2).d(s3).e(s4));
            return;
        }
        catch (Throwable throwable)
        {
            L.e(throwable, "trackAppOpen failed", new Object[0]);
        }
    }

    private void trackAppVersionUpdate()
    {
        try
        {
            String s = getRegion();
            String s1 = getAppVersion();
            String s2 = getPlatform();
            HashMap hashmap = new HashMap();
            hashmap.put("region", s);
            hashmap.put("app_version", s1);
            hashmap.put("platform", s2);
            feature.a("client_app_version_update", gson.a(hashmap));
            mobileAppTracker.a((new MATEvent("client_app_version_update")).a(s).b(s1).c(s2));
            return;
        }
        catch (Throwable throwable)
        {
            L.e(throwable, "trackAppVersionUpdate failed", new Object[0]);
        }
    }

    private void trackEvent2(LifecycleEvent lifecycleevent)
    {
        class _cls3
        {

            static final int $SwitchMap$me$lyft$android$analytics$definitions$LifecycleEvent$Type[];

            static 
            {
                $SwitchMap$me$lyft$android$analytics$definitions$LifecycleEvent$Type = new int[me.lyft.android.analytics.definitions.LifecycleEvent.Type.values().length];
                try
                {
                    $SwitchMap$me$lyft$android$analytics$definitions$LifecycleEvent$Type[me.lyft.android.analytics.definitions.LifecycleEvent.Type.APP_OPEN.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    $SwitchMap$me$lyft$android$analytics$definitions$LifecycleEvent$Type[me.lyft.android.analytics.definitions.LifecycleEvent.Type.APP_CLOSE.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    $SwitchMap$me$lyft$android$analytics$definitions$LifecycleEvent$Type[me.lyft.android.analytics.definitions.LifecycleEvent.Type.APP_INSTALL.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    $SwitchMap$me$lyft$android$analytics$definitions$LifecycleEvent$Type[me.lyft.android.analytics.definitions.LifecycleEvent.Type.APP_UPDATE.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        switch (_cls3..SwitchMap.me.lyft.android.analytics.definitions.LifecycleEvent.Type[lifecycleevent.getType().ordinal()])
        {
        default:
            return;

        case 1: // '\001'
            trackAppOpen();
            return;

        case 2: // '\002'
            trackAppClose();
            return;

        case 3: // '\003'
            trackUserInstall();
            return;

        case 4: // '\004'
            trackAppVersionUpdate();
            break;
        }
    }

    private void trackRideTypeSwitch(IEvent ievent)
    {
        try
        {
            String s = getRegion();
            String s1 = getNearestDriverEta();
            String s2 = getCouponCodePresent();
            String s3 = getPrimeTimePercent();
            ievent = (String)ievent.getParameters().get(Parameter.RIDE_TYPE_SELECTED.toString());
            HashMap hashmap = new HashMap();
            hashmap.put("region", s);
            hashmap.put("nearest_driver_eta", s1);
            hashmap.put("coupon_code_present", s2);
            hashmap.put("prime_time_percent", s3);
            hashmap.put("ride_type", ievent);
            feature.a("client_ride_type_switch", gson.a(hashmap));
            mobileAppTracker.a((new MATEvent("client_ride_type_switch")).a(s).b(s1).c(s2).d(s3).e(ievent));
            return;
        }
        // Misplaced declaration of an exception variable
        catch (IEvent ievent)
        {
            L.e(ievent, "trackRideTypeSwitch failed", new Object[0]);
        }
    }

    private void trackUserInstall()
    {
        try
        {
            String s = getRegion();
            HashMap hashmap = new HashMap();
            hashmap.put("region", s);
            feature.a("event_user_install", gson.a(hashmap));
            mobileAppTracker.a((new MATEvent("event_user_install")).a(s));
            return;
        }
        catch (Throwable throwable)
        {
            L.e(throwable, "trackUserInstall failed", new Object[0]);
        }
    }

    public void flush()
    {
    }

    public Observable observerMobileAppTrackerInit()
    {
        return advertisingIdFetchedSubject.zipWith(matIdInitSubject, new Func2() {

            final AppEventTracker this$0;

            public volatile Object call(Object obj, Object obj1)
            {
                return call((Unit)obj, (Unit)obj1);
            }

            public Unit call(Unit unit, Unit unit1)
            {
                return Unit.create();
            }

            
            {
                this$0 = AppEventTracker.this;
                super();
            }
        });
    }

    protected void onCreate()
    {
        final AsyncActionAnalytics advertiserIdAnalytics;
        boolean flag;
        flag = true;
        advertiserIdAnalytics = AppAnalytics.trackLoadAdvertiserId();
        MobileAppTracker mobileapptracker;
        mobileAppTracker.a(device.getAndroidId());
        mobileapptracker = mobileAppTracker;
        if (lyftPreferences.getInstallStatus() == 1)
        {
            flag = false;
        }
        mobileapptracker.a(flag);
        advertisingIdProvider.getAdvertisingInfo().subscribeOn(Schedulers.newThread()).observeOn(AndroidSchedulers.mainThread()).subscribe(new SecureSubscriber() {

            final AppEventTracker this$0;
            final AsyncActionAnalytics val$advertiserIdAnalytics;

            public void onSafeError(Throwable throwable)
            {
                super.onSafeError(throwable);
                advertiserIdAnalytics.trackResponseFailure(throwable);
                advertisingIdFetchedSubject.onNext(Unit.create());
            }

            public void onSafeNext(com.google.android.gms.ads.identifier.AdvertisingIdClient.Info info)
            {
                super.onSafeNext(info);
                advertiserIdAnalytics.trackResponseSuccess();
                mobileAppTracker.a(info.a(), info.b());
                lyftPreferences.setAdvertisingId(info.a());
                lyftPreferences.setLimitAdvertisingId(info.b());
                advertisingIdFetchedSubject.onNext(Unit.create());
                unsubscribe();
            }

            public volatile void onSafeNext(Object obj)
            {
                onSafeNext((com.google.android.gms.ads.identifier.AdvertisingIdClient.Info)obj);
            }

            
            {
                this$0 = AppEventTracker.this;
                advertiserIdAnalytics = asyncactionanalytics;
                super();
            }
        });
        return;
        Exception exception;
        exception;
        advertiserIdAnalytics.trackResponseFailure(exception);
        L.e(exception, "onCreate failed", new Object[0]);
        return;
    }

    protected void onResume(Activity activity)
    {
        try
        {
            mobileAppTracker.a(activity);
            mobileAppTracker.c();
            matIdInitSubject.onNext(Unit.create());
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Activity activity)
        {
            L.e(activity, "mobile app tracker crashed", new Object[0]);
        }
    }

    public void track(IEvent ievent)
    {
        if ("ride_type_switch".equals(ievent.getName()))
        {
            trackRideTypeSwitch(ievent);
        } else
        if (ievent instanceof LifecycleEvent)
        {
            trackEvent2((LifecycleEvent)ievent);
            return;
        }
    }

    protected void updateUserInfo(User user)
    {
        try
        {
            mobileAppTracker.c(user.getId());
            return;
        }
        // Misplaced declaration of an exception variable
        catch (User user)
        {
            L.e(user, "updateUserInfo failed", new Object[0]);
        }
    }



}
