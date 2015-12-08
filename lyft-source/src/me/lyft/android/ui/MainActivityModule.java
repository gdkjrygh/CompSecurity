// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui;

import android.content.ContentResolver;
import android.content.res.Resources;
import me.lyft.android.ILyftPreferences;
import me.lyft.android.IUserSession;
import me.lyft.android.application.IConstantsProvider;
import me.lyft.android.application.IUserProvider;
import me.lyft.android.application.driver.DriverStatsProvider;
import me.lyft.android.application.driver.IDriverStatsProvider;
import me.lyft.android.application.driverdocuments.IDriverDocumentsProvider;
import me.lyft.android.application.driverdocuments.IDriverDocumentsService;
import me.lyft.android.application.geo.IGeoService;
import me.lyft.android.application.passenger.IPassengerRideProvider;
import me.lyft.android.application.profile.IProfilePhotoFileRecipient;
import me.lyft.android.application.profile.IProfileProvider;
import me.lyft.android.application.profile.IProfileService;
import me.lyft.android.application.profile.ProfileProvider;
import me.lyft.android.application.profile.ProfileService;
import me.lyft.android.application.ride.IDriverRideProvider;
import me.lyft.android.application.ridehistory.IPassengerRideHistoryService;
import me.lyft.android.application.ridehistory.PassengerRideHistoryService;
import me.lyft.android.application.settings.ITrainingRideService;
import me.lyft.android.application.settings.TrainingRideService;
import me.lyft.android.application.shortcuts.IShortcutService;
import me.lyft.android.common.DialogFlow;
import me.lyft.android.domain.ridehistory.PassengerRideHistoryMapper;
import me.lyft.android.errorhandling.IDefaultErrorHandler;
import me.lyft.android.facades.UserModeSwitchFacade;
import me.lyft.android.infrastructure.assets.IAssetLoadingService;
import me.lyft.android.infrastructure.facebook.IFacebookService;
import me.lyft.android.infrastructure.location.ILocationService;
import me.lyft.android.infrastructure.locationsettings.ILocationSettingsService;
import me.lyft.android.infrastructure.lyft.ILyftApi;
import me.lyft.android.infrastructure.s3.IS3Api;
import me.lyft.android.map.lyft.LyftMapView;
import me.lyft.android.map.lyft.MapOwner;
import me.lyft.android.map.lyft.MarkerBank;
import me.lyft.android.map.lyft.MarkerClickManager;
import me.lyft.android.providers.TopContactsProvider;
import me.lyft.android.services.HeatMapService;
import me.lyft.android.ui.ride.RideMap;

// Referenced classes of package me.lyft.android.ui:
//            MainActivity, ViewErrorHandler, IProgressController, SlideMenuController, 
//            IViewErrorHandler

public class MainActivityModule
{

    private MainActivity activity;

    public MainActivityModule(MainActivity mainactivity)
    {
        activity = mainactivity;
    }

    IDriverStatsProvider provideDriverStats(ILyftApi ilyftapi)
    {
        return new DriverStatsProvider(ilyftapi);
    }

    HeatMapService provideHeatmapService(ILyftApi ilyftapi, ILocationService ilocationservice, IDefaultErrorHandler idefaulterrorhandler)
    {
        return new HeatMapService(ilyftapi, ilocationservice, idefaulterrorhandler);
    }

    MarkerBank provideMapMarkerManager()
    {
        return new MarkerBank();
    }

    MapOwner provideMapOwner(LyftMapView lyftmapview, MarkerBank markerbank, MarkerClickManager markerclickmanager)
    {
        return new MapOwner(lyftmapview, markerbank, markerclickmanager);
    }

    public LyftMapView provideMapView()
    {
        return activity.mapView;
    }

    MarkerClickManager provideMarkerClickManager(MarkerBank markerbank)
    {
        return new MarkerClickManager(markerbank);
    }

    IPassengerRideHistoryService providePassengerHistoryService(ILyftApi ilyftapi, IUserProvider iuserprovider)
    {
        return new PassengerRideHistoryService(ilyftapi, iuserprovider, new PassengerRideHistoryMapper());
    }

    IProfileProvider provideProfileProvider(IUserSession iusersession)
    {
        return new ProfileProvider(iusersession);
    }

    IProfileService provideProfileService(IUserSession iusersession, IS3Api is3api, ILyftApi ilyftapi, IProfilePhotoFileRecipient iprofilephotofilerecipient, IFacebookService ifacebookservice)
    {
        return new ProfileService(iusersession, is3api, ilyftapi, iprofilephotofilerecipient, ifacebookservice);
    }

    public IProgressController provideProgressController()
    {
        return activity.progressController;
    }

    RideMap provideRideView(MapOwner mapowner, IAssetLoadingService iassetloadingservice, IDriverRideProvider idriverrideprovider, IPassengerRideProvider ipassengerrideprovider, IGeoService igeoservice, ILocationService ilocationservice, IDefaultErrorHandler idefaulterrorhandler, 
            IShortcutService ishortcutservice, IConstantsProvider iconstantsprovider)
    {
        return new RideMap(mapowner, iassetloadingservice, idriverrideprovider, ipassengerrideprovider, igeoservice, ilocationservice, idefaulterrorhandler, ishortcutservice, iconstantsprovider);
    }

    SlideMenuController provideSlideController()
    {
        return activity.slideMenuController;
    }

    TopContactsProvider provideTopContactsProvider(ContentResolver contentresolver, IUserProvider iuserprovider)
    {
        return new TopContactsProvider(contentresolver, iuserprovider);
    }

    ITrainingRideService provideTrainingRideService(ILyftApi ilyftapi)
    {
        return new TrainingRideService(ilyftapi);
    }

    UserModeSwitchFacade provideUserModeSwitchFacade(IDriverDocumentsProvider idriverdocumentsprovider, IDriverDocumentsService idriverdocumentsservice, ILocationSettingsService ilocationsettingsservice, IViewErrorHandler iviewerrorhandler, ILyftPreferences ilyftpreferences)
    {
        return new UserModeSwitchFacade(activity.progressController, activity.appFlow, activity.dialogFlow, activity.apiFacade, activity.userSession, iviewerrorhandler, activity.slideMenuController, idriverdocumentsprovider, idriverdocumentsservice, ilocationsettingsservice);
    }

    public IViewErrorHandler provideViewErrorHandler(IDefaultErrorHandler idefaulterrorhandler, DialogFlow dialogflow, Resources resources, IUserProvider iuserprovider)
    {
        return new ViewErrorHandler(idefaulterrorhandler, dialogflow, resources, iuserprovider);
    }
}
