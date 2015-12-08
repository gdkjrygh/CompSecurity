// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.infrastructure;

import android.accounts.AccountManager;
import android.app.NotificationManager;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.telephony.TelephonyManager;
import android.view.WindowManager;
import com.google.gson.Gson;
import com.squareup.okhttp.OkHttpClient;
import me.lyft.android.IAppStateHandler;
import me.lyft.android.ILyftPreferences;
import me.lyft.android.LyftApplication;
import me.lyft.android.analytics.trackers.AnalyticsService;
import me.lyft.android.application.IAppInfoService;
import me.lyft.android.application.IConstantsProvider;
import me.lyft.android.application.IUserProvider;
import me.lyft.android.application.passenger.IPassengerRideProvider;
import me.lyft.android.application.payment.IChargeAccountsProvider;
import me.lyft.android.application.polling.IAppProcess;
import me.lyft.android.application.polling.IBackgroundLocationAppProcess;
import me.lyft.android.application.polling.IPollingAppProcess;
import me.lyft.android.application.profile.IProfilePhotoFileRecipient;
import me.lyft.android.application.ride.IRideRequestSession;
import me.lyft.android.common.AppFlow;
import me.lyft.android.common.DialogFlow;
import me.lyft.android.infrastructure.activity.ActivityServiceRegistry;
import me.lyft.android.infrastructure.appboy.AppboyService;
import me.lyft.android.infrastructure.appboy.IAppboyService;
import me.lyft.android.infrastructure.assets.AssetLoadingService;
import me.lyft.android.infrastructure.assets.AssetPackagingService;
import me.lyft.android.infrastructure.assets.IAssetLoadingService;
import me.lyft.android.infrastructure.assets.IAssetPackagingService;
import me.lyft.android.infrastructure.camera.CaptureImageSession;
import me.lyft.android.infrastructure.camera.ICaptureImage;
import me.lyft.android.infrastructure.camera.ICaptureImageSession;
import me.lyft.android.infrastructure.cardscan.CardScanService;
import me.lyft.android.infrastructure.cardscan.ICardScanService;
import me.lyft.android.infrastructure.competition.InstallTrackerService;
import me.lyft.android.infrastructure.device.Device;
import me.lyft.android.infrastructure.device.IDevice;
import me.lyft.android.infrastructure.driverdefense.DriverDefenseStarterService;
import me.lyft.android.infrastructure.facebook.FacebookService;
import me.lyft.android.infrastructure.facebook.IFacebookService;
import me.lyft.android.infrastructure.foreground.AppForegroundDetector;
import me.lyft.android.infrastructure.foreground.IAppForegroundDetector;
import me.lyft.android.infrastructure.gallery.GalleryService;
import me.lyft.android.infrastructure.gallery.IGalleryService;
import me.lyft.android.infrastructure.gcm.GcmIdService;
import me.lyft.android.infrastructure.gcm.IGcmIdService;
import me.lyft.android.infrastructure.googlegeo.GoogleGeoApiService;
import me.lyft.android.infrastructure.googlegeo.IGoogleGeoApiService;
import me.lyft.android.infrastructure.googleplaces.GooglePlaceService;
import me.lyft.android.infrastructure.googleplaces.IGooglePlaceService;
import me.lyft.android.infrastructure.googleplay.GoogleApiProvider;
import me.lyft.android.infrastructure.googleplay.IGoogleApiProvider;
import me.lyft.android.infrastructure.instabug.IInstabugService;
import me.lyft.android.infrastructure.instabug.InstabugSupport;
import me.lyft.android.infrastructure.leanplum.ILeanplumService;
import me.lyft.android.infrastructure.leanplum.LeanplumService;
import me.lyft.android.infrastructure.location.ILocationService;
import me.lyft.android.infrastructure.location.LocationService;
import me.lyft.android.infrastructure.locationsettings.ILocationSettingsService;
import me.lyft.android.infrastructure.locationsettings.LocationSettingsService;
import me.lyft.android.infrastructure.lyft.AppStateDTO;
import me.lyft.android.infrastructure.lyft.ILyftApi;
import me.lyft.android.infrastructure.lyft.LyftApi;
import me.lyft.android.infrastructure.notifications.InAppNotificationService;
import me.lyft.android.infrastructure.paypal.IPayPalService;
import me.lyft.android.infrastructure.paypal.PayPalService;
import me.lyft.android.infrastructure.photo.IPhotoPickerService;
import me.lyft.android.infrastructure.photo.PhotoPickerService;
import me.lyft.android.infrastructure.profile.IProfilePhotoLoader;
import me.lyft.android.infrastructure.profile.ProfilePhotoLoader;
import me.lyft.android.infrastructure.s3.IS3Api;
import me.lyft.android.infrastructure.s3.S3Api;
import me.lyft.android.infrastructure.service.AppProcessRegistry;
import me.lyft.android.infrastructure.sms.ISmsService;
import me.lyft.android.infrastructure.sms.IVerificationAutoFillService;
import me.lyft.android.infrastructure.sms.SmsService;
import me.lyft.android.infrastructure.sms.VerificationAutoFillService;
import me.lyft.android.infrastructure.stripe.IStripeService;
import me.lyft.android.infrastructure.stripe.StripeService;
import me.lyft.android.infrastructure.viewserver.IViewServerService;
import me.lyft.android.infrastructure.viewserver.ViewServerService;
import me.lyft.android.infrastructure.wallet.IWalletService;
import me.lyft.android.infrastructure.wallet.WalletService;
import me.lyft.android.managers.DeepLinkManager;
import me.lyft.android.managers.ImageLoader;
import me.lyft.android.notifications.IStatusBarNotificationsService;
import me.lyft.android.notifications.StatusBarNotificationsService;
import me.lyft.android.rx.MessageBus;

public class InfrastructureServicesModule
{

    public InfrastructureServicesModule()
    {
    }

    public ActivityServiceRegistry provideActivityServiceRegistry(IFacebookService ifacebookservice, IGoogleApiProvider igoogleapiprovider, IWalletService iwalletservice, IGalleryService igalleryservice, AnalyticsService analyticsservice, ICardScanService icardscanservice, IPayPalService ipaypalservice, 
            ILocationSettingsService ilocationsettingsservice, IViewServerService iviewserverservice, DriverDefenseStarterService driverdefensestarterservice, InAppNotificationService inappnotificationservice, InstallTrackerService installtrackerservice, IAppboyService iappboyservice, IStatusBarNotificationsService istatusbarnotificationsservice, 
            ILeanplumService ileanplumservice, IInstabugService iinstabugservice)
    {
        return new ActivityServiceRegistry(new Object[] {
            ifacebookservice, igoogleapiprovider, iwalletservice, igalleryservice, analyticsservice, icardscanservice, ipaypalservice, ilocationsettingsservice, iviewserverservice, driverdefensestarterservice, 
            inappnotificationservice, installtrackerservice, iappboyservice, istatusbarnotificationsservice, ileanplumservice, iinstabugservice
        });
    }

    IAppForegroundDetector provideAppForegroundDetector()
    {
        return new AppForegroundDetector();
    }

    public AppProcessRegistry provideAppServiceRegistry(IPollingAppProcess ipollingappprocess, IBackgroundLocationAppProcess ibackgroundlocationappprocess)
    {
        return new AppProcessRegistry(new IAppProcess[] {
            ipollingappprocess, ibackgroundlocationappprocess
        });
    }

    IAppboyService provideAppboyService(IUserProvider iuserprovider, IGcmIdService igcmidservice, DialogFlow dialogflow, ImageLoader imageloader, InAppNotificationService inappnotificationservice)
    {
        return new AppboyService(iuserprovider, igcmidservice, dialogflow, imageloader, inappnotificationservice);
    }

    IAssetPackagingService provideAssetPackagingService(LyftApplication lyftapplication, ILyftPreferences ilyftpreferences, OkHttpClient okhttpclient)
    {
        return new AssetPackagingService(lyftapplication, ilyftpreferences, okhttpclient);
    }

    CaptureImageSession provideCaptureImageSession(AppFlow appflow)
    {
        return new CaptureImageSession(appflow);
    }

    ICardScanService provideCardScanService()
    {
        return new CardScanService();
    }

    IDevice provideDevice(LyftApplication lyftapplication, WindowManager windowmanager, TelephonyManager telephonymanager, ConnectivityManager connectivitymanager, AccountManager accountmanager, PackageManager packagemanager)
    {
        return new Device(lyftapplication, windowmanager, telephonymanager, connectivitymanager, accountmanager, packagemanager);
    }

    DriverDefenseStarterService provideDriverDefenseStarterService(IUserProvider iuserprovider, ILyftPreferences ilyftpreferences)
    {
        return new DriverDefenseStarterService(iuserprovider, ilyftpreferences);
    }

    public IFacebookService provideFacebookService()
    {
        return new FacebookService();
    }

    IGalleryService provideGalleryService(ICaptureImageSession icaptureimagesession)
    {
        return new GalleryService(icaptureimagesession);
    }

    IPhotoPickerService provideGalleryService(ICaptureImage icaptureimage)
    {
        return new PhotoPickerService(icaptureimage);
    }

    IGoogleApiProvider provideGoogleApiProvider(ILyftPreferences ilyftpreferences)
    {
        return new GoogleApiProvider(ilyftpreferences);
    }

    IGoogleGeoApiService provideGoogleApiService(OkHttpClient okhttpclient, Gson gson)
    {
        return new GoogleGeoApiService(okhttpclient, gson);
    }

    IGooglePlaceService provideGooglePlaceService(IGoogleApiProvider igoogleapiprovider)
    {
        return new GooglePlaceService(igoogleapiprovider);
    }

    ICaptureImage provideICaptureImage(CaptureImageSession captureimagesession)
    {
        return captureimagesession;
    }

    ICaptureImageSession provideICaptureImageSession(CaptureImageSession captureimagesession)
    {
        return captureimagesession;
    }

    public IGcmIdService provideIGcmIdService(GcmIdService gcmidservice)
    {
        return gcmidservice;
    }

    IInstabugService provideIInstabugService(LyftApplication lyftapplication, IUserProvider iuserprovider)
    {
        return InstabugSupport.getInstabugService(lyftapplication, iuserprovider);
    }

    public ILocationSettingsService provideILocationSettingsService(LyftApplication lyftapplication)
    {
        return new LocationSettingsService(lyftapplication);
    }

    IPayPalService provideIPayPalService(IChargeAccountsProvider ichargeaccountsprovider, IRideRequestSession iriderequestsession, IPassengerRideProvider ipassengerrideprovider)
    {
        return new PayPalService(ichargeaccountsprovider, iriderequestsession, ipassengerrideprovider);
    }

    IProfilePhotoLoader provideIProfilePhotoLoader(ProfilePhotoLoader profilephotoloader)
    {
        return profilephotoloader;
    }

    ISmsService provideISendSmsService(LyftApplication lyftapplication)
    {
        return new SmsService(lyftapplication);
    }

    InAppNotificationService provideInAppNotificationService(ILyftApi ilyftapi, IUserProvider iuserprovider, MessageBus messagebus, ILyftPreferences ilyftpreferences, DialogFlow dialogflow)
    {
        return new InAppNotificationService(ilyftapi, iuserprovider, messagebus, ilyftpreferences, dialogflow);
    }

    InstallTrackerService provideInstallTrackerService(IConstantsProvider iconstantsprovider, IDevice idevice)
    {
        return new InstallTrackerService(iconstantsprovider, idevice);
    }

    ILeanplumService provideLeanplumService(LyftApplication lyftapplication, IUserProvider iuserprovider, IAppInfoService iappinfoservice)
    {
        return new LeanplumService(lyftapplication, iuserprovider, iappinfoservice);
    }

    IAssetLoadingService provideLoadingService(LyftApplication lyftapplication, IDevice idevice, ImageLoader imageloader)
    {
        return new AssetLoadingService(lyftapplication, idevice, imageloader);
    }

    public ILocationService provideLocationService(LyftApplication lyftapplication)
    {
        return new LocationService(lyftapplication);
    }

    ILyftApi provideLyftApi(OkHttpClient okhttpclient, Gson gson, ILyftPreferences ilyftpreferences, IDevice idevice, final IAppStateHandler handler)
    {
        return new LyftApi(okhttpclient, gson, ilyftpreferences, idevice, new me.lyft.android.infrastructure.lyft.LyftApi.IAppStateListener() {

            final InfrastructureServicesModule this$0;
            final IAppStateHandler val$handler;

            public void onAppStateReceived(AppStateDTO appstatedto)
            {
                handler.setAppState(appstatedto);
            }

            
            {
                this$0 = InfrastructureServicesModule.this;
                handler = iappstatehandler;
                super();
            }
        });
    }

    IProfilePhotoFileRecipient provideProfilePhotoFileRecipient(ProfilePhotoLoader profilephotoloader)
    {
        return profilephotoloader;
    }

    IS3Api provideS3Api(OkHttpClient okhttpclient, Gson gson)
    {
        return new S3Api(okhttpclient, gson);
    }

    IStatusBarNotificationsService provideStatusBarService(ImageLoader imageloader, NotificationManager notificationmanager, ILyftPreferences ilyftpreferences, IAppForegroundDetector iappforegrounddetector, Gson gson, DeepLinkManager deeplinkmanager)
    {
        return new StatusBarNotificationsService(imageloader, notificationmanager, ilyftpreferences, iappforegrounddetector, gson, deeplinkmanager);
    }

    IStripeService provideStripeService(ILyftPreferences ilyftpreferences)
    {
        return new StripeService(ilyftpreferences);
    }

    IVerificationAutoFillService provideVerificationAutoFillService()
    {
        return new VerificationAutoFillService();
    }

    IViewServerService provideViewServerService()
    {
        return new ViewServerService();
    }

    IWalletService provideWalletService(IGoogleApiProvider igoogleapiprovider, ILyftPreferences ilyftpreferences)
    {
        return new WalletService(igoogleapiprovider, ilyftpreferences);
    }
}
