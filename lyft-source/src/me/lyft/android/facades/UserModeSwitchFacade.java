// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.facades;

import me.lyft.android.IUserSession;
import me.lyft.android.application.driverdocuments.IDriverDocumentsProvider;
import me.lyft.android.application.driverdocuments.IDriverDocumentsService;
import me.lyft.android.common.AppFlow;
import me.lyft.android.common.DialogFlow;
import me.lyft.android.common.Objects;
import me.lyft.android.common.Unit;
import me.lyft.android.domain.driverdocuments.Insurance;
import me.lyft.android.infrastructure.locationsettings.ILocationSettingsService;
import me.lyft.android.infrastructure.lyft.location.LocationDTO;
import me.lyft.android.infrastructure.lyft.location.NullLocationDTO;
import me.lyft.android.infrastructure.lyft.profile.UserDTO;
import me.lyft.android.infrastructure.lyft.ride.DriverSignOutFrictionDTO;
import me.lyft.android.ui.IProgressController;
import me.lyft.android.ui.IViewErrorHandler;
import me.lyft.android.ui.SlideMenuController;
import rx.Observable;
import rx.functions.Action0;
import rx.functions.Action1;
import rx.functions.Func1;

// Referenced classes of package me.lyft.android.facades:
//            ApiFacade

public class UserModeSwitchFacade
{

    private ApiFacade apiFacade;
    private AppFlow appFlow;
    private DialogFlow dialogFlow;
    private IDriverDocumentsProvider driverDocumentsProvider;
    private IDriverDocumentsService driverDocumentsService;
    private ILocationSettingsService locationSettingsService;
    private IProgressController progressController;
    private SlideMenuController slideMenuController;
    private IUserSession userSession;
    private IViewErrorHandler viewErrorHandler;

    public UserModeSwitchFacade(IProgressController iprogresscontroller, AppFlow appflow, DialogFlow dialogflow, ApiFacade apifacade, IUserSession iusersession, IViewErrorHandler iviewerrorhandler, SlideMenuController slidemenucontroller, 
            IDriverDocumentsProvider idriverdocumentsprovider, IDriverDocumentsService idriverdocumentsservice, ILocationSettingsService ilocationsettingsservice)
    {
        progressController = iprogresscontroller;
        appFlow = appflow;
        dialogFlow = dialogflow;
        apiFacade = apifacade;
        userSession = iusersession;
        viewErrorHandler = iviewerrorhandler;
        slideMenuController = slidemenucontroller;
        driverDocumentsProvider = idriverdocumentsprovider;
        driverDocumentsService = idriverdocumentsservice;
        locationSettingsService = ilocationsettingsservice;
    }

    private Observable changeUserMode(boolean flag)
    {
        slideMenuController.close();
        progressController.showProgress();
        return apiFacade.switchMode(flag).map(Unit.func1()).doOnNext(new Action1() {

            final UserModeSwitchFacade this$0;

            public volatile void call(Object obj)
            {
                call((Unit)obj);
            }

            public void call(Unit unit)
            {
                appFlow.goTo(new me.lyft.android.ui.MainScreens.RideScreen());
            }

            
            {
                this$0 = UserModeSwitchFacade.this;
                super();
            }
        }).doOnError(new Action1() {

            final UserModeSwitchFacade this$0;

            public volatile void call(Object obj)
            {
                call((Throwable)obj);
            }

            public void call(Throwable throwable)
            {
                viewErrorHandler.handle(throwable);
            }

            
            {
                this$0 = UserModeSwitchFacade.this;
                super();
            }
        }).doOnUnsubscribe(new Action0() {

            final UserModeSwitchFacade this$0;

            public void call()
            {
                progressController.hideProgress();
            }

            
            {
                this$0 = UserModeSwitchFacade.this;
                super();
            }
        });
    }

    private UserDTO getUser()
    {
        return userSession.getUser();
    }

    private boolean shouldRedirectToInsuranceUpdateScreen()
    {
        Insurance insurance = driverDocumentsProvider.getInsurance();
        return driverDocumentsService.isDriverDocumentsEnabled() && !insurance.isNull() && (insurance.isPending() || insurance.isRejected() || insurance.isExpired());
    }

    private boolean shouldShowInsuranceExpirationDialog()
    {
        Insurance insurance = driverDocumentsProvider.getInsurance();
        return driverDocumentsService.isDriverDocumentsEnabled() && !insurance.isNull() && !insurance.isPending() && insurance.isApprovedButExpiringSoon();
    }

    private Observable tryToggleUserMode(boolean flag)
    {
        UserDTO userdto = userSession.getUser();
        if (!flag && ((Boolean)Objects.firstNonNull(((DriverSignOutFrictionDTO)Objects.firstNonNull(userdto.getDriverSignOutFriction(), DriverSignOutFrictionDTO.empty())).getShowSignoutFriction(), Boolean.valueOf(false))).booleanValue() && ((LocationDTO)Objects.firstNonNull(userdto.getDestinyLocation(), NullLocationDTO.getInstance())).isNull())
        {
            dialogFlow.show(new me.lyft.android.ui.driver.DriverDialogs.DriverSignOutConfirmationDialog());
            return Observable.empty();
        } else
        {
            return changeUserMode(flag);
        }
    }

    public Observable checkLocationSettingsAndEnterDriverMode()
    {
        return locationSettingsService.observeLocationSettingsEnabled().flatMap(new Func1() {

            final UserModeSwitchFacade this$0;

            public volatile Object call(Object obj)
            {
                return call((Unit)obj);
            }

            public Observable call(Unit unit)
            {
                return changeUserMode(true);
            }

            
            {
                this$0 = UserModeSwitchFacade.this;
                super();
            }
        });
    }

    public Observable switchToDriver()
    {
        if (((Boolean)Objects.firstNonNull(getUser().isApprovedDriver(), Boolean.valueOf(false))).booleanValue())
        {
            if (!((Boolean)Objects.firstNonNull(getUser().isTermsAccepted(), Boolean.valueOf(false))).booleanValue())
            {
                appFlow.goTo(new me.lyft.android.ui.MainScreens.AcceptTermsScreen(true));
                return Observable.empty();
            }
            if (shouldShowInsuranceExpirationDialog())
            {
                dialogFlow.show((new me.lyft.android.ui.Dialogs.InsuranceExpiringDialog()).setAttemptEnterDriverMode(true));
                return Observable.empty();
            } else
            {
                return checkLocationSettingsAndEnterDriverMode();
            }
        }
        if (shouldRedirectToInsuranceUpdateScreen())
        {
            appFlow.goTo(new me.lyft.android.ui.settings.SettingsScreens.PersonalInsuranceScreen());
            return Observable.empty();
        } else
        {
            appFlow.goTo(new me.lyft.android.ui.onboarding.OnboardingScreens.WebApplicationStatusScreen());
            return Observable.empty();
        }
    }

    public Observable switchToPassenger()
    {
        return tryToggleUserMode(false);
    }




}
