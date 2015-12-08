// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import butterknife.ButterKnife;
import com.lyft.scoop.Scoop;
import com.lyft.scoop.Screen;
import com.squareup.picasso.RequestCreator;
import me.lyft.android.ILyftPreferences;
import me.lyft.android.analytics.studies.RideHistoryAnalytics;
import me.lyft.android.application.IUserProvider;
import me.lyft.android.application.passenger.IPassengerRideProvider;
import me.lyft.android.common.AppFlow;
import me.lyft.android.common.Unit;
import me.lyft.android.controls.Toggle;
import me.lyft.android.development.DeveloperTools;
import me.lyft.android.domain.User;
import me.lyft.android.domain.passenger.PassengerRide;
import me.lyft.android.domain.ride.RideStatus;
import me.lyft.android.facades.UserModeSwitchFacade;
import me.lyft.android.flows.ProfileFlow;
import me.lyft.android.infrastructure.profile.IProfilePhotoLoader;
import me.lyft.android.rx.AsyncCall;
import me.lyft.android.rx.Binder;
import me.lyft.android.rx.ReactiveUI;
import me.lyft.android.utils.Keyboard;
import rx.functions.Action1;

// Referenced classes of package me.lyft.android.ui:
//            SlideMenuController

public class MenuView extends LinearLayout
{

    AppFlow appFlow;
    Binder binder;
    DeveloperTools developerTools;
    RadioButton developmentNavigationItem;
    LinearLayout driverModeSwitcherView;
    TextView fullNameTextView;
    RadioButton helpNavigationItem;
    RadioButton homeNavigationItem;
    RadioButton inviteNavigationItem;
    ILyftPreferences lyftPreferences;
    RadioGroup menuSelectorRadioGroup;
    Toggle modeSwitchToggle;
    private final Action1 onDriverSwitchToggle = new Action1() {

        final MenuView this$0;

        public void call(Boolean boolean1)
        {
            slideMenuController.close();
            switchUserMode();
        }

        public volatile void call(Object obj)
        {
            call((Boolean)obj);
        }

            
            {
                this$0 = MenuView.this;
                super();
            }
    };
    private final Action1 onHomeMenuChanged = new Action1() {

        final MenuView this$0;

        public volatile void call(Object obj)
        {
            call((Unit)obj);
        }

        public void call(Unit unit)
        {
            boolean flag = passengerRideProvider.getPassengerRide().getStatus().isActive();
            unit = driverModeSwitcherView;
            byte byte0;
            if (flag)
            {
                byte0 = 8;
            } else
            {
                byte0 = 0;
            }
            unit.setVisibility(byte0);
            updateHomeMenuTitle(flag);
            updateRideHistory();
        }

            
            {
                this$0 = MenuView.this;
                super();
            }
    };
    private Action1 onScreenChanged;
    private final Action1 onUserUpdated = new Action1() {

        final MenuView this$0;

        public volatile void call(Object obj)
        {
            call((User)obj);
        }

        public void call(User user)
        {
            modeSwitchToggle.setChecked(user.isInDriverMode(), false);
            fullNameTextView.setText(user.getFullName());
            updateUserPhoto();
            updateRideHistory();
        }

            
            {
                this$0 = MenuView.this;
                super();
            }
    };
    IPassengerRideProvider passengerRideProvider;
    RadioButton paymentNavigationItem;
    ImageView photoImageView;
    ProfileFlow profileFlow;
    IProfilePhotoLoader profilePhotoLoader;
    RadioButton rideHistoryNavigationItem;
    RadioButton settingsNavigationItem;
    SlideMenuController slideMenuController;
    UserModeSwitchFacade userModeSwitchFacade;
    IUserProvider userProvider;

    public MenuView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        onScreenChanged = new Action1() {

            final MenuView this$0;

            public void call(Screen screen)
            {
                if (screen instanceof MainScreens.RideScreen)
                {
                    homeNavigationItem.setChecked(true);
                } else
                {
                    if (screen instanceof me.lyft.android.ui.profile.ProfileScreens.DriverMyProfileScreen)
                    {
                        menuSelectorRadioGroup.check(0);
                        return;
                    }
                    if (screen instanceof me.lyft.android.ui.profile.ProfileScreens.PassengerMyProfileScreen)
                    {
                        menuSelectorRadioGroup.check(0);
                        return;
                    }
                    if (screen instanceof me.lyft.android.ui.payment.PaymentScreens.PaymentScreen)
                    {
                        paymentNavigationItem.setChecked(true);
                        return;
                    }
                    if (screen instanceof me.lyft.android.ui.invites.InvitesScreens.InviteScreen)
                    {
                        inviteNavigationItem.setChecked(true);
                        return;
                    }
                    if (screen instanceof me.lyft.android.ui.help.HelpScreens.HelpScreen)
                    {
                        helpNavigationItem.setChecked(true);
                        return;
                    }
                    if (screen instanceof me.lyft.android.ui.settings.SettingsScreens.SettingsScreen)
                    {
                        settingsNavigationItem.setChecked(true);
                        return;
                    }
                    if (screen instanceof me.lyft.android.ui.development.DevelopmentScreens.DevelopmentScreen)
                    {
                        developmentNavigationItem.setChecked(true);
                        return;
                    }
                }
            }

            public volatile void call(Object obj)
            {
                call((Screen)obj);
            }

            
            {
                this$0 = MenuView.this;
                super();
            }
        };
        Scoop.a(this).b(this);
    }

    private void switchUserMode()
    {
        if (userProvider.getUser().isInPassengerMode())
        {
            binder.bind(userModeSwitchFacade.switchToDriver(), new AsyncCall());
            return;
        } else
        {
            binder.bind(userModeSwitchFacade.switchToPassenger(), new AsyncCall());
            return;
        }
    }

    private void updateHomeMenuTitle(boolean flag)
    {
        String s;
        if (flag)
        {
            s = getContext().getString(0x7f07019e);
        } else
        {
            s = getContext().getString(0x7f07019d);
        }
        if (developerTools.isDeveloperMode())
        {
            String s1 = lyftPreferences.getEnvironmentName();
            homeNavigationItem.setText((new StringBuilder()).append(s).append(" \u2014 ").append(s1.toUpperCase()).toString());
            developmentNavigationItem.setVisibility(0);
            return;
        } else
        {
            homeNavigationItem.setText(s);
            developmentNavigationItem.setVisibility(8);
            return;
        }
    }

    private void updateRideHistory()
    {
        boolean flag = false;
        RadioButton radiobutton;
        int i;
        if (!userProvider.getUser().isInDriverMode())
        {
            i = 1;
        } else
        {
            i = 0;
        }
        radiobutton = rideHistoryNavigationItem;
        if (i != 0)
        {
            i = ((flag) ? 1 : 0);
        } else
        {
            i = 8;
        }
        radiobutton.setVisibility(i);
    }

    private void updateUserPhoto()
    {
        profilePhotoLoader.load().fit().centerCrop().placeholder(0x7f0201fc).error(0x7f0201fc).into(photoImageView);
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
            binder.bind(modeSwitchToggle.observeChange(), onDriverSwitchToggle);
            binder.bind(userProvider.observeUserUpdates(), onUserUpdated);
            binder.bind(ReactiveUI.any(passengerRideProvider.observeRideUpdateEvent(), developerTools.observeDeveloperMode()), onHomeMenuChanged);
            binder.bind(appFlow.observeScreenChange(), onScreenChanged);
            return;
        }
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

    void onMenuItemSelected(View view)
    {
        slideMenuController.close();
        Keyboard.hideKeyboard(view);
        switch (view.getId())
        {
        case 2131559031: 
        case 2131559032: 
        case 2131559033: 
        case 2131559041: 
        default:
            return;

        case 2131559040: 
            switchUserMode();
            return;

        case 2131559030: 
            profileFlow.openMyProfile();
            menuSelectorRadioGroup.check(0);
            return;

        case 2131559034: 
            appFlow.resetTo(new MainScreens.RideScreen());
            return;

        case 2131559035: 
            appFlow.resetToParent(new me.lyft.android.ui.invites.InvitesScreens.InviteScreen());
            return;

        case 2131559036: 
            RideHistoryAnalytics.trackRideHistorySidebarTap();
            appFlow.goTo(new me.lyft.android.ui.ridehistory.RideHistoryScreens.PassengerRideHistoryListScreen());
            return;

        case 2131559037: 
            if (userProvider.getUser().hasDebt())
            {
                appFlow.resetToParent(new me.lyft.android.ui.payment.PaymentScreens.DebtScreen());
                return;
            } else
            {
                appFlow.resetToParent(new me.lyft.android.ui.payment.PaymentScreens.PaymentScreen());
                return;
            }

        case 2131559038: 
            appFlow.resetToParent(new me.lyft.android.ui.help.HelpScreens.HelpScreen());
            return;

        case 2131559039: 
            appFlow.resetToParent(new me.lyft.android.ui.settings.SettingsScreens.SettingsScreen());
            return;

        case 2131559042: 
            appFlow.goTo(new me.lyft.android.ui.development.DevelopmentScreens.DevelopmentScreen());
            return;
        }
    }




}
