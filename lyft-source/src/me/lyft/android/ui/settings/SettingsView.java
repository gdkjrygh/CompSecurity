// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.settings;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.ButterKnife;
import com.lyft.scoop.Scoop;
import me.lyft.android.ILyftPreferences;
import me.lyft.android.application.ILogoutService;
import me.lyft.android.application.IUserProvider;
import me.lyft.android.application.driver.IVehicleProvider;
import me.lyft.android.application.driverdocuments.IDriverDocumentsProvider;
import me.lyft.android.application.driverdocuments.IDriverDocumentsService;
import me.lyft.android.application.passenger.IPassengerRideProvider;
import me.lyft.android.application.settings.ISignUrlService;
import me.lyft.android.common.AppFlow;
import me.lyft.android.common.DialogFlow;
import me.lyft.android.common.Strings;
import me.lyft.android.controls.MenuButtonToolbar;
import me.lyft.android.controls.PhoneFormattingTextWatcher;
import me.lyft.android.controls.Toggle;
import me.lyft.android.controls.Toolbar;
import me.lyft.android.domain.Phone;
import me.lyft.android.domain.User;
import me.lyft.android.domain.driver.Vehicle;
import me.lyft.android.domain.driverdocuments.Insurance;
import me.lyft.android.domain.passenger.PassengerRide;
import me.lyft.android.domain.ride.RideStatus;
import me.lyft.android.rx.AsyncCall;
import me.lyft.android.rx.Binder;
import me.lyft.android.rx.MessageBus;
import me.lyft.android.ui.SlideMenuController;
import me.lyft.android.ui.dialogs.DialogResult;
import me.lyft.android.utils.Navigator;
import me.lyft.android.utils.WebBrowser;
import rx.functions.Action1;

public class SettingsView extends LinearLayout
{

    private static final String LOGOUT_DIALOG_TAG = "logout_confirmation_dialog";
    AppFlow appFlow;
    Button becomeDriverButton;
    View becomeDriverSplitter;
    private Binder binder;
    MessageBus bus;
    View carView;
    DialogFlow dialogFlow;
    Button driverDashboardButton;
    IDriverDocumentsProvider driverDocumentsProvider;
    IDriverDocumentsService driverDocumentsService;
    View driverShortcutSwitcherView;
    Toggle driverShortcutToggle;
    Button driverStatsButton;
    View driverTrainingLayout;
    TextView emailTxt;
    TextView insuranceStatusTextView;
    View logoutButton;
    ILogoutService logoutService;
    View logoutSplitter;
    ILyftPreferences lyftPreferences;
    View navigationSettingsView;
    private Action1 onDriverShortcutSettingChanged;
    private Action1 onLogoutDialogResult;
    IPassengerRideProvider passengerRideProvider;
    TextView phoneText;
    TextView selectedNavigationTxt;
    TextView serviceIndicatorTextView;
    View servicesSettingsView;
    ISignUrlService signUrlService;
    SlideMenuController slideMenuController;
    MenuButtonToolbar toolbar;
    IUserProvider userProvider;
    IVehicleProvider vehicleProvider;

    public SettingsView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        onDriverShortcutSettingChanged = new Action1() {

            final SettingsView this$0;

            public void call(Boolean boolean1)
            {
                lyftPreferences.setDriverShortcutEnabled(boolean1.booleanValue());
            }

            public volatile void call(Object obj)
            {
                call((Boolean)obj);
            }

            
            {
                this$0 = SettingsView.this;
                super();
            }
        };
        onLogoutDialogResult = new Action1() {

            final SettingsView this$0;

            public volatile void call(Object obj)
            {
                call((DialogResult)obj);
            }

            public void call(DialogResult dialogresult)
            {
                if (dialogresult.getButtonId() == 0x7f0d000b)
                {
                    logoutService.logout("user_initiated");
                    appFlow.resetTo(new me.lyft.android.ui.landing.LandingScreens.IntroductionScreen("user_logout"));
                }
            }

            
            {
                this$0 = SettingsView.this;
                super();
            }
        };
        Scoop.a(this).b(this);
    }

    private void initData()
    {
        byte byte0 = 8;
        Object obj = userProvider.getUser();
        int i;
        if (((User) (obj)).isWheelchairNeeded())
        {
            serviceIndicatorTextView.setText(0x7f0702cd);
        } else
        {
            serviceIndicatorTextView.setText("");
        }
        if (Strings.isNullOrEmpty(((User) (obj)).getEmail()))
        {
            emailTxt.setVisibility(8);
        } else
        {
            emailTxt.setText(((User) (obj)).getEmail());
            emailTxt.setVisibility(0);
        }
        if (Strings.isNullOrEmpty(((User) (obj)).getPhone().getNumber()))
        {
            phoneText.setVisibility(8);
        } else
        {
            TextView textview = phoneText;
            boolean flag1;
            if (!Strings.isNullOrEmpty(((User) (obj)).getPhone().getNumber()))
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            textview.setEnabled(flag1);
            phoneText.addTextChangedListener(new PhoneFormattingTextWatcher(null));
            phoneText.setText(((User) (obj)).getPhone().getNumber());
            phoneText.setVisibility(0);
        }
        if (Strings.isNullOrEmpty(((User) (obj)).getFacebookUid()))
        {
            phoneText.setEnabled(false);
            phoneText.setTextColor(getResources().getColor(0x7f0c0084));
        }
        updateInsuranceStatus();
        initTrainingRide();
        if (((User) (obj)).isApprovedDriver())
        {
            becomeDriverButton.setVisibility(8);
            navigationSettingsView.setVisibility(0);
            driverStatsButton.setVisibility(0);
            driverDashboardButton.setVisibility(0);
            driverShortcutToggle.setChecked(lyftPreferences.isDriverShortcutEnabled(), false);
            obj = vehicleProvider.getVehicle();
            View view = carView;
            boolean flag;
            if (((Vehicle) (obj)).isNull())
            {
                i = 8;
            } else
            {
                i = 0;
            }
            view.setVisibility(i);
            i = lyftPreferences.getSelectedNavigation();
            selectedNavigationTxt.setText(Navigator.getNavigationResourceIdByIndex(i));
        } else
        {
            if (passengerRideProvider.getPassengerRide().getStatus().isActive())
            {
                becomeDriverSplitter.setVisibility(8);
                becomeDriverButton.setVisibility(8);
                servicesSettingsView.setVisibility(8);
            } else
            {
                becomeDriverSplitter.setVisibility(0);
                becomeDriverButton.setVisibility(0);
                servicesSettingsView.setVisibility(0);
            }
            navigationSettingsView.setVisibility(8);
            driverStatsButton.setVisibility(8);
            driverDashboardButton.setVisibility(8);
            driverShortcutSwitcherView.setVisibility(8);
            if (driverDocumentsService.isDriverDocumentsEnabled())
            {
                carView.setVisibility(0);
                initTrainingRide();
            } else
            {
                carView.setVisibility(8);
            }
        }
        flag = passengerRideProvider.getPassengerRide().getStatus().isActive();
        obj = logoutSplitter;
        if (flag)
        {
            i = 8;
        } else
        {
            i = 0;
        }
        ((View) (obj)).setVisibility(i);
        obj = logoutButton;
        if (flag)
        {
            i = byte0;
        } else
        {
            i = 0;
        }
        ((View) (obj)).setVisibility(i);
    }

    private void initTrainingRide()
    {
        User user = userProvider.getUser();
        View view = driverTrainingLayout;
        int i;
        if ((user.submittedDriverApplication() || user.isApprovedDriver()) && !passengerRideProvider.getPassengerRide().getStatus().isActive())
        {
            i = 0;
        } else
        {
            i = 8;
        }
        view.setVisibility(i);
    }

    private void updateInsuranceStatus()
    {
        insuranceStatusTextView.setVisibility(0);
        Insurance insurance = driverDocumentsProvider.getInsurance();
        if (insurance.isNull() || insurance.isApproved())
        {
            insuranceStatusTextView.setVisibility(8);
        } else
        {
            if (insurance.isExpired())
            {
                insuranceStatusTextView.setText(getResources().getString(0x7f07032b));
                return;
            }
            if (insurance.isRejected())
            {
                insuranceStatusTextView.setText(getResources().getString(0x7f07032d));
                return;
            }
            if (insurance.isPending())
            {
                insuranceStatusTextView.setText(getResources().getString(0x7f07032c));
                return;
            }
        }
    }

    protected void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        if (isInEditMode())
        {
            return;
        } else
        {
            binder = Binder.attach(this);
            toolbar.showTitle().setTitle(getResources().getString(0x7f070329));
            initData();
            binder.bind(driverShortcutToggle.observeChange(), onDriverShortcutSettingChanged);
            binder.bind(bus.observe(me/lyft/android/ui/settings/SettingsView$LogoutDialogResultEvent), onLogoutDialogResult);
            slideMenuController.enableMenu();
            return;
        }
    }

    public void onBecomeDriverClicked()
    {
        appFlow.goTo(new me.lyft.android.ui.onboarding.OnboardingScreens.WebApplicationStatusScreen());
    }

    public void onCarSettingsClicked()
    {
        appFlow.goTo(new SettingsScreens.CarViewScreen());
    }

    protected void onDetachedFromWindow()
    {
        super.onDetachedFromWindow();
        slideMenuController.disableMenu();
    }

    public void onDriverDashboardClicked()
    {
        driverDashboardButton.setEnabled(false);
        final String notSignedUrl = (new StringBuilder()).append(lyftPreferences.getLyftWebRoot()).append("/drive").toString();
        binder.bind(signUrlService.getSignedUrl(notSignedUrl), new AsyncCall() {

            final SettingsView this$0;
            final String val$notSignedUrl;

            public void onFail(Throwable throwable)
            {
                super.onFail(throwable);
                WebBrowser.open(getContext(), notSignedUrl);
            }

            public volatile void onSuccess(Object obj)
            {
                onSuccess((String)obj);
            }

            public void onSuccess(String s)
            {
                super.onSuccess(s);
                Context context = getContext();
                String s1 = s;
                if (Strings.isNullOrEmpty(s))
                {
                    s1 = notSignedUrl;
                }
                WebBrowser.open(context, s1);
            }

            public void onUnsubscribe()
            {
                driverDashboardButton.setEnabled(true);
            }

            
            {
                this$0 = SettingsView.this;
                notSignedUrl = s;
                super();
            }
        });
    }

    public void onDriverPracticeClicked(View view)
    {
        appFlow.goTo(new SettingsScreens.TrainingRideStartScreen());
    }

    public void onDriverStatsClicked()
    {
        appFlow.goTo(new me.lyft.android.ui.driver.DriverScreens.DriverStatsScreen());
    }

    public void onEditProfileClicked()
    {
        appFlow.goTo(new me.lyft.android.ui.profile.ProfileScreens.EditProfileScreen());
    }

    public void onEmailClicked()
    {
        appFlow.goTo(new SettingsScreens.EditEmailScreen());
    }

    protected void onFinishInflate()
    {
        super.onFinishInflate();
        if (isInEditMode())
        {
            return;
        } else
        {
            ButterKnife.a(this);
            return;
        }
    }

    public void onLogoutClicked()
    {
        me.lyft.android.ui.Dialogs.AlertDialog alertdialog = new me.lyft.android.ui.Dialogs.AlertDialog("logout_confirmation_dialog");
        alertdialog.setDialogEventClass(me/lyft/android/ui/settings/SettingsView$LogoutDialogResultEvent).setTitle(getContext().getString(0x7f0702c6)).addNegativeButton(getContext().getString(0x7f07020f)).addPositiveButton(getContext().getString(0x7f0703a3));
        dialogFlow.show(alertdialog);
    }

    public void onNavigationSettingsClicked()
    {
        appFlow.goTo(new SettingsScreens.NavigationSettingsScreen());
    }

    public void onPhoneClicked()
    {
        appFlow.goTo(new SettingsScreens.EditPhoneScreen());
    }

    public void onServiceSettingsClicked()
    {
        appFlow.goTo(new SettingsScreens.AccessibilitySettingsScreen());
    }

    public void onWorkPerksClicked()
    {
        appFlow.replaceWith(new me.lyft.android.ui.enterprise.EnterpriseScreens.WorkPerksMainScreen());
    }
}
