// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.application;

import android.content.res.Resources;
import me.lyft.android.ILyftPreferences;
import me.lyft.android.IUserSession;
import me.lyft.android.LyftApplication;
import me.lyft.android.application.checkout.CheckoutSession;
import me.lyft.android.application.checkout.ICheckoutSession;
import me.lyft.android.application.driver.DailyTotalsRepository;
import me.lyft.android.application.driver.IDailyTotalsRepository;
import me.lyft.android.application.driver.IVehicleProvider;
import me.lyft.android.application.driver.VehicleProvider;
import me.lyft.android.application.driver.expresspay.ExpressPayRepository;
import me.lyft.android.application.driver.expresspay.ExpressPayService;
import me.lyft.android.application.driver.expresspay.IExpressPayRepository;
import me.lyft.android.application.driver.expresspay.IExpressPayService;
import me.lyft.android.application.driverdocuments.DriverDocumentsProvider;
import me.lyft.android.application.driverdocuments.DriverDocumentsService;
import me.lyft.android.application.driverdocuments.IDriverDocumentsProvider;
import me.lyft.android.application.driverdocuments.IDriverDocumentsService;
import me.lyft.android.application.geo.EtaAnalyticService;
import me.lyft.android.application.geo.EtaRepository;
import me.lyft.android.application.geo.GeoService;
import me.lyft.android.application.geo.IEtaAnalyticService;
import me.lyft.android.application.geo.IEtaRepository;
import me.lyft.android.application.geo.IGeoService;
import me.lyft.android.application.landing.ILandingService;
import me.lyft.android.application.landing.LandingService;
import me.lyft.android.application.passenger.IPassengerRideProvider;
import me.lyft.android.application.passenger.PassengerRideProvider;
import me.lyft.android.application.payment.ChargeAccountsProvider;
import me.lyft.android.application.payment.IChargeAccountsProvider;
import me.lyft.android.application.payment.IPaymentService;
import me.lyft.android.application.payment.PaymentService;
import me.lyft.android.application.polling.BackgroundLocationAppProcess;
import me.lyft.android.application.polling.BackgroundLocationTracker;
import me.lyft.android.application.polling.IBackgroundLocationAppProcess;
import me.lyft.android.application.polling.IBackgroundLocationTracker;
import me.lyft.android.application.polling.ILocationUpdateService;
import me.lyft.android.application.polling.IPollingAppProcess;
import me.lyft.android.application.polling.IPollingService;
import me.lyft.android.application.polling.LocationUpdateService;
import me.lyft.android.application.polling.PollingAppProcess;
import me.lyft.android.application.polling.PollingService;
import me.lyft.android.application.ride.CancellationOptionsProvider;
import me.lyft.android.application.ride.DestinyService;
import me.lyft.android.application.ride.DestinySession;
import me.lyft.android.application.ride.DriverRideProvider;
import me.lyft.android.application.ride.DriverRouteService;
import me.lyft.android.application.ride.ExpenseNoteSession;
import me.lyft.android.application.ride.HotspotRepository;
import me.lyft.android.application.ride.ICancellationOptionsProvider;
import me.lyft.android.application.ride.IDestinyService;
import me.lyft.android.application.ride.IDestinySession;
import me.lyft.android.application.ride.IDriverRideProvider;
import me.lyft.android.application.ride.IDriverRouteService;
import me.lyft.android.application.ride.IExpenseNoteSession;
import me.lyft.android.application.ride.IHotspotRepository;
import me.lyft.android.application.ride.IPassengerRideService;
import me.lyft.android.application.ride.IPreRideInfoRepository;
import me.lyft.android.application.ride.IRatingSession;
import me.lyft.android.application.ride.IRequestRideTypeProvider;
import me.lyft.android.application.ride.IRideFareRepository;
import me.lyft.android.application.ride.IRideRequestService;
import me.lyft.android.application.ride.IRideRequestSession;
import me.lyft.android.application.ride.IWearRideRequestService;
import me.lyft.android.application.ride.PassengerRideService;
import me.lyft.android.application.ride.PreRideInfoRepository;
import me.lyft.android.application.ride.RatingSession;
import me.lyft.android.application.ride.RequestRideTypeProvider;
import me.lyft.android.application.ride.RideFareRepository;
import me.lyft.android.application.ride.RideRequestService;
import me.lyft.android.application.ride.RideRequestSession;
import me.lyft.android.application.ride.WearRideRequestService;
import me.lyft.android.application.settings.AccessibilitySettingsService;
import me.lyft.android.application.settings.IAccessibilitySettingsService;
import me.lyft.android.application.settings.ISettingsService;
import me.lyft.android.application.settings.ISignUrlService;
import me.lyft.android.application.settings.SettingsService;
import me.lyft.android.application.settings.SignUrlService;
import me.lyft.android.application.shortcuts.IShortcutService;
import me.lyft.android.application.shortcuts.ShortcutService;
import me.lyft.android.application.splitfare.ISplitFareStateRepository;
import me.lyft.android.application.system.ILyftSystemRepository;
import me.lyft.android.application.system.LyftSystemRepository;
import me.lyft.android.application.topdestinations.ITopDestinationProvider;
import me.lyft.android.application.topdestinations.TopDestinationProvider;
import me.lyft.android.common.Preconditions;
import me.lyft.android.data.ContactsDatabaseHelper;
import me.lyft.android.domain.payment.IPaymentFactory;
import me.lyft.android.domain.payment.PaymentFactory;
import me.lyft.android.features.IFeatureFlagsManager;
import me.lyft.android.infrastructure.assets.IAssetPackagingService;
import me.lyft.android.infrastructure.device.IDevice;
import me.lyft.android.infrastructure.facebook.IFacebookService;
import me.lyft.android.infrastructure.foreground.IAppForegroundDetector;
import me.lyft.android.infrastructure.googlegeo.IGoogleGeoApiService;
import me.lyft.android.infrastructure.googleplaces.IGooglePlaceService;
import me.lyft.android.infrastructure.location.ILocationService;
import me.lyft.android.infrastructure.lyft.ILyftApi;
import me.lyft.android.infrastructure.paypal.IPayPalService;
import me.lyft.android.infrastructure.s3.IS3Api;
import me.lyft.android.infrastructure.splitfare.ISplitFareRequestRepository;
import me.lyft.android.infrastructure.splitfare.ISplitFareService;
import me.lyft.android.infrastructure.splitfare.SplitFareRequestRepository;
import me.lyft.android.infrastructure.splitfare.SplitFareService;
import me.lyft.android.infrastructure.splitfare.SplitFareStateRepository;
import me.lyft.android.persistence.ISimpleStorage;
import me.lyft.android.persistence.driverdocuments.IDriverDocumentsStorage;
import me.lyft.android.persistence.expensenotes.IExpenseNoteStorage;
import me.lyft.android.persistence.landing.ISignUpUserRepository;
import me.lyft.android.persistence.rating.IRatingStateStorage;
import me.lyft.android.providers.ContactsProvider;
import me.lyft.android.providers.SplitFareDatabaseProvider;

// Referenced classes of package me.lyft.android.application:
//            AppInfoService, ConstantsProvider, LogoutService, UserProvider, 
//            IConstantsProvider, IAppInfoService, IUserProvider, ILogoutService

public class ApplicationServicesModule
{

    public ApplicationServicesModule()
    {
    }

    IAccessibilitySettingsService provideAccessibilityServiceSettings(ILyftApi ilyftapi, IUserSession iusersession)
    {
        return new AccessibilitySettingsService(iusersession, ilyftapi);
    }

    public IAppInfoService provideAppInfoService(ILocationService ilocationservice, ILyftApi ilyftapi, IConstantsProvider iconstantsprovider, IAssetPackagingService iassetpackagingservice, IFeatureFlagsManager ifeatureflagsmanager, ILyftPreferences ilyftpreferences)
    {
        return new AppInfoService(ilocationservice, ilyftapi, iconstantsprovider, iassetpackagingservice, ifeatureflagsmanager, ilyftpreferences);
    }

    IBackgroundLocationAppProcess provideBackgroundLocationSupervisor(IBackgroundLocationTracker ibackgroundlocationtracker, IAppForegroundDetector iappforegrounddetector, IUserProvider iuserprovider)
    {
        return new BackgroundLocationAppProcess(ibackgroundlocationtracker, iappforegrounddetector, iuserprovider);
    }

    IBackgroundLocationTracker provideBackgroundLocationTracker(ILocationUpdateService ilocationupdateservice, ILocationService ilocationservice)
    {
        return new BackgroundLocationTracker(ilocationupdateservice, ilocationservice);
    }

    public ICancellationOptionsProvider provideCancellationOptionsProvider(IConstantsProvider iconstantsprovider)
    {
        return new CancellationOptionsProvider(iconstantsprovider);
    }

    public IChargeAccountsProvider provideChargeAccountsProvider()
    {
        return new ChargeAccountsProvider();
    }

    ICheckoutSession provideCheckoutSession(CheckoutSession checkoutsession)
    {
        return checkoutsession;
    }

    public IConstantsProvider provideConstantsProvider(ILyftPreferences ilyftpreferences)
    {
        return new ConstantsProvider(ilyftpreferences);
    }

    IDailyTotalsRepository provideDailyTotalsRepository()
    {
        return new DailyTotalsRepository();
    }

    public IDestinyService provideDestinyService(IUserSession iusersession, ILyftApi ilyftapi, IDestinySession idestinysession, IConstantsProvider iconstantsprovider)
    {
        return new DestinyService(iusersession, ilyftapi, idestinysession, iconstantsprovider);
    }

    public IDestinySession provideDestinySession(ILocationService ilocationservice)
    {
        return new DestinySession(ilocationservice);
    }

    IDriverDocumentsProvider provideDriverDocumentsProvider(IDriverDocumentsStorage idriverdocumentsstorage)
    {
        return new DriverDocumentsProvider(idriverdocumentsstorage);
    }

    IDriverDocumentsService provideDriverDocumentsService(IUserSession iusersession, ILyftApi ilyftapi, IS3Api is3api, IDriverDocumentsStorage idriverdocumentsstorage, IConstantsProvider iconstantsprovider)
    {
        return new DriverDocumentsService(iusersession, ilyftapi, is3api, idriverdocumentsstorage, iconstantsprovider);
    }

    IEtaAnalyticService provideEtaAnalyticService()
    {
        return new EtaAnalyticService();
    }

    IEtaRepository provideEtaRepository()
    {
        return new EtaRepository();
    }

    IExpenseNoteSession provideExpenseNoteSession(IExpenseNoteStorage iexpensenotestorage, IUserProvider iuserprovider)
    {
        return new ExpenseNoteSession(iexpensenotestorage, iuserprovider);
    }

    IExpressPayRepository provideExpressPayRepository()
    {
        return new ExpressPayRepository();
    }

    IExpressPayService provideExpressPayService(ILyftApi ilyftapi, IUserProvider iuserprovider, IExpressPayRepository iexpresspayrepository)
    {
        return new ExpressPayService(ilyftapi, iuserprovider, iexpresspayrepository);
    }

    IGeoService provideGeoService(ILyftApi ilyftapi, IConstantsProvider iconstantsprovider, IGoogleGeoApiService igooglegeoapiservice, IEtaRepository ietarepository, IEtaAnalyticService ietaanalyticservice)
    {
        return new GeoService(ilyftapi, iconstantsprovider, igooglegeoapiservice, ietarepository, ietaanalyticservice);
    }

    public IHotspotRepository provideHotspotRepository(ISimpleStorage isimplestorage)
    {
        return new HotspotRepository(isimplestorage);
    }

    ILandingService provideLandingService(ISignUpUserRepository isignupuserrepository, IUserProvider iuserprovider, ILyftApi ilyftapi, ILocationService ilocationservice, IFacebookService ifacebookservice, ILyftPreferences ilyftpreferences)
    {
        return new LandingService(isignupuserrepository, iuserprovider, ilyftapi, ilocationservice, ifacebookservice, ilyftpreferences);
    }

    ILogoutService provideLogoutService(LyftApplication lyftapplication, IUserSession iusersession, IRideRequestSession iriderequestsession, ILyftApi ilyftapi, ILyftPreferences ilyftpreferences, IFacebookService ifacebookservice, IDriverDocumentsStorage idriverdocumentsstorage, 
            ISimpleStorage isimplestorage, IUserProvider iuserprovider)
    {
        return new LogoutService(lyftapplication, iusersession, iriderequestsession, ilyftapi, ilyftpreferences, ifacebookservice, idriverdocumentsstorage, isimplestorage, iuserprovider);
    }

    ILyftSystemRepository provideLyftSystemRepository(ISimpleStorage isimplestorage)
    {
        return new LyftSystemRepository(isimplestorage);
    }

    IRatingSession providePassengerRateDriverSession(IRatingStateStorage iratingstatestorage)
    {
        return new RatingSession(iratingstatestorage);
    }

    IPassengerRideProvider providePassengerRideProvider()
    {
        return new PassengerRideProvider();
    }

    IPassengerRideService providePassengerRideService(ILyftApi ilyftapi, IPassengerRideProvider ipassengerrideprovider, ICheckoutSession icheckoutsession, ILocationService ilocationservice, IRideRequestSession iriderequestsession, IRatingSession iratingsession, IExpenseNoteSession iexpensenotesession)
    {
        return new PassengerRideService(ilyftapi, ipassengerrideprovider, icheckoutsession, ilocationservice, iriderequestsession, iratingsession, iexpensenotesession);
    }

    IPaymentFactory providePaymentFactory(me.lyft.android.domain.payment.IPaymentFactory.IPaymentMetadataProvider ipaymentmetadataprovider)
    {
        return new PaymentFactory(ipaymentmetadataprovider);
    }

    me.lyft.android.domain.payment.IPaymentFactory.IPaymentMetadataProvider providePaymentMetadataProvider(IPayPalService ipaypalservice)
    {
        Preconditions.checkArgument(ipaypalservice instanceof me.lyft.android.domain.payment.IPaymentFactory.IPaymentMetadataProvider, "PayPalService must be implement IPaymentMetadataProvider to provide chargeToken");
        return (me.lyft.android.domain.payment.IPaymentFactory.IPaymentMetadataProvider)ipaypalservice;
    }

    IPaymentService providePaymentService(PaymentService paymentservice)
    {
        return paymentservice;
    }

    ISettingsService providePhoneVerificationService(ILyftApi ilyftapi, IUserSession iusersession)
    {
        return new SettingsService(ilyftapi, iusersession);
    }

    IPollingAppProcess providePollingOverseer(IPollingService ipollingservice, IAppForegroundDetector iappforegrounddetector, IUserProvider iuserprovider)
    {
        return new PollingAppProcess(ipollingservice, iappforegrounddetector, iuserprovider);
    }

    ILocationUpdateService providePollingRequestService(ILocationService ilocationservice, IUserSession iusersession, IAppForegroundDetector iappforegrounddetector, IRideRequestSession iriderequestsession, IEtaAnalyticService ietaanalyticservice, ILyftApi ilyftapi, IConstantsProvider iconstantsprovider, 
            IDevice idevice)
    {
        return new LocationUpdateService(ilocationservice, iusersession, iappforegrounddetector, iriderequestsession, ietaanalyticservice, ilyftapi, iconstantsprovider, idevice);
    }

    IPollingService providePollingService(ILocationUpdateService ilocationupdateservice, ILocationService ilocationservice, ILyftPreferences ilyftpreferences, IDriverDocumentsService idriverdocumentsservice, IAppForegroundDetector iappforegrounddetector)
    {
        return new PollingService(ilocationupdateservice, ilocationservice, ilyftpreferences, idriverdocumentsservice, iappforegrounddetector);
    }

    IPreRideInfoRepository providePreRideInfoRepository(ISimpleStorage isimplestorage)
    {
        return new PreRideInfoRepository(isimplestorage);
    }

    public IRequestRideTypeProvider provideRequestRideTypeProvider(ISimpleStorage isimplestorage)
    {
        return new RequestRideTypeProvider(isimplestorage);
    }

    IRideFareRepository provideRideFareRepository(ISimpleStorage isimplestorage)
    {
        return new RideFareRepository(isimplestorage);
    }

    IRideRequestService provideRideRequestService(IUserProvider iuserprovider, IChargeAccountsProvider ichargeaccountsprovider, ILocationService ilocationservice, IRideRequestSession iriderequestsession, ILyftApi ilyftapi, IPreRideInfoRepository iprerideinforepository, ICheckoutSession icheckoutsession)
    {
        return new RideRequestService(iuserprovider, ichargeaccountsprovider, ilocationservice, iriderequestsession, ilyftapi, iprerideinforepository, icheckoutsession);
    }

    IRideRequestSession provideRideRequestSession(ILyftPreferences ilyftpreferences, ILocationService ilocationservice, IRequestRideTypeProvider irequestridetypeprovider, IPreRideInfoRepository iprerideinforepository, IConstantsProvider iconstantsprovider)
    {
        return new RideRequestSession(ilyftpreferences, ilocationservice, irequestridetypeprovider, iprerideinforepository, iconstantsprovider);
    }

    public IDriverRideProvider provideRouteProvider(ILyftPreferences ilyftpreferences)
    {
        return new DriverRideProvider(ilyftpreferences);
    }

    public IDriverRouteService provideRouteService(ILyftApi ilyftapi, IDriverRideProvider idriverrideprovider, ILocationService ilocationservice, IUserProvider iuserprovider, IGooglePlaceService igoogleplaceservice, IRatingSession iratingsession)
    {
        return new DriverRouteService(ilyftapi, idriverrideprovider, iuserprovider, ilocationservice, igoogleplaceservice, iratingsession);
    }

    public IShortcutService provideShortcutService(IUserSession iusersession, ILyftApi ilyftapi)
    {
        return new ShortcutService(iusersession, ilyftapi);
    }

    ISignUrlService provideSignUrlService(ILyftApi ilyftapi)
    {
        return new SignUrlService(ilyftapi);
    }

    ISplitFareRequestRepository provideSplitFareRequestRepository(ISimpleStorage isimplestorage)
    {
        return new SplitFareRequestRepository(isimplestorage);
    }

    ISplitFareService provideSplitFareService(ContactsDatabaseHelper contactsdatabasehelper, ILyftApi ilyftapi, IPassengerRideProvider ipassengerrideprovider, ContactsProvider contactsprovider, Resources resources)
    {
        return new SplitFareService(ilyftapi, new SplitFareDatabaseProvider(contactsdatabasehelper), contactsprovider, resources, ipassengerrideprovider);
    }

    ISplitFareStateRepository provideSplitFareStateRepository(ISimpleStorage isimplestorage)
    {
        return new SplitFareStateRepository(isimplestorage);
    }

    public ITopDestinationProvider provideTopDestinationsProvider(IUserSession iusersession)
    {
        return new TopDestinationProvider(iusersession);
    }

    public IUserProvider provideUserProvider()
    {
        return new UserProvider();
    }

    IVehicleProvider provideVehicleProvider(ISimpleStorage isimplestorage)
    {
        return new VehicleProvider(isimplestorage);
    }

    IWearRideRequestService provideWearRideRequestService(IUserProvider iuserprovider, IChargeAccountsProvider ichargeaccountsprovider, ILyftApi ilyftapi, ICheckoutSession icheckoutsession)
    {
        return new WearRideRequestService(iuserprovider, ichargeaccountsprovider, ilyftapi, icheckoutsession);
    }
}
