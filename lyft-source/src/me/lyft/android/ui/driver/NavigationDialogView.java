// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.driver;

import android.content.Context;
import android.content.res.Resources;
import android.text.Html;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import butterknife.ButterKnife;
import com.lyft.scoop.Scoop;
import com.squareup.picasso.RequestCreator;
import me.lyft.android.ILyftPreferences;
import me.lyft.android.RideFlags;
import me.lyft.android.application.ride.IDriverRideProvider;
import me.lyft.android.common.AppFlow;
import me.lyft.android.common.DialogFlow;
import me.lyft.android.common.Objects;
import me.lyft.android.common.Strings;
import me.lyft.android.domain.location.Location;
import me.lyft.android.domain.ride.DriverRide;
import me.lyft.android.domain.ride.Passenger;
import me.lyft.android.domain.ride.Stop;
import me.lyft.android.managers.ImageLoader;
import me.lyft.android.rx.Binder;
import me.lyft.android.rx.MessageBus;
import me.lyft.android.ui.UserImageView;
import me.lyft.android.ui.dialogs.DialogContainerView;
import me.lyft.android.ui.tooltips.TooltipContainerView;
import me.lyft.android.utils.GoogleMapsUrlBuilder;
import me.lyft.android.utils.Navigator;
import rx.functions.Action1;

public class NavigationDialogView extends DialogContainerView
{

    public static final int NAVIGATION_PREVIEW_ZOOM_LEVEL = 14;
    TextView addressTextView;
    AppFlow appFlow;
    MessageBus bus;
    Button closeButton;
    DialogFlow dialogFlow;
    private Stop displayedStop;
    ImageLoader imageLoader;
    ILyftPreferences lyftPreferences;
    ImageView mapPinImageView;
    Button navigateButton;
    Navigator navigator;
    private Action1 onRouteChanged;
    TextView passengerNameTextView;
    UserImageView passengerPhotoImageView;
    IDriverRideProvider routeProvider;
    ImageView staticMap;
    RelativeLayout staticMapLayout;
    TooltipContainerView tooltipContainer;

    public NavigationDialogView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        onRouteChanged = new Action1() {

            final NavigationDialogView this$0;

            public volatile void call(Object obj)
            {
                call((DriverRide)obj);
            }

            public void call(DriverRide driverride)
            {
                boolean flag;
                if (Objects.equals(Boolean.valueOf(driverride.getCurrentStop().isPickup()), Boolean.valueOf(displayedStop.isPickup())) && Objects.equals(driverride.getCurrentStop().getPassenger().getId(), displayedStop.getPassenger().getId()) && Objects.equals(driverride.getCurrentStop().getRideId(), displayedStop.getRideId()))
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                if (!driverride.isInProgress() || !flag)
                {
                    dialogFlow.dismiss();
                }
            }

            
            {
                this$0 = NavigationDialogView.this;
                super();
            }
        };
        Scoop.a(this).b(this);
    }

    private android.view.ViewGroup.LayoutParams getAddressTextViewLayoutParams()
    {
        android.view.ViewGroup.LayoutParams layoutparams = addressTextView.getLayoutParams();
        if (!routeProvider.getDriverRide().isCourier() && getStop().isDropOff())
        {
            layoutparams.width = -1;
            return layoutparams;
        } else
        {
            layoutparams.width = -2;
            return layoutparams;
        }
    }

    private int getMapPinResource()
    {
        return !getStop().isPickup() ? 0x7f02017d : 0x7f020181;
    }

    private Passenger getPassenger()
    {
        return routeProvider.getDriverRide().getCurrentPassenger();
    }

    private int getPinResource()
    {
        return !getStop().isPickup() ? 0x7f02016f : 0x7f020170;
    }

    private String getStaticMap()
    {
        return (new GoogleMapsUrlBuilder()).setCenter(getStop().getLocation().toQueryString()).setSize(640, 640).setZoom(14).build();
    }

    private Stop getStop()
    {
        return routeProvider.getDriverRide().getCurrentStop();
    }

    private void loadImages()
    {
        passengerPhotoImageView.loadPhoto(getPassenger().getPhotoUrl());
        passengerPhotoImageView.setUserPartySize(Integer.valueOf(getPassenger().getPartySize()));
        imageLoader.load(getStaticMap()).into(staticMap);
    }

    private void setButtonStyles()
    {
        if (getStop().isPickup())
        {
            if (routeProvider.getDriverRide().isCourier())
            {
                navigateButton.setTextColor(getResources().getColorStateList(0x7f0c00ad));
                navigateButton.setBackgroundDrawable(getResources().getDrawable(0x7f02005b));
                return;
            } else
            {
                navigateButton.setTextColor(getResources().getColorStateList(0x7f0c00ab));
                navigateButton.setBackgroundDrawable(getResources().getDrawable(0x7f02004e));
                return;
            }
        } else
        {
            navigateButton.setTextColor(getResources().getColorStateList(0x7f0c00ac));
            navigateButton.setBackgroundDrawable(getResources().getDrawable(0x7f020058));
            return;
        }
    }

    private void showTooltips()
    {
        if (!routeProvider.getDriverRide().showHints())
        {
            return;
        } else
        {
            tooltipContainer.tryToShowAndMarkShown("pickup_modal_navigate_button", navigateButton, 80);
            return;
        }
    }

    private void styleDropoff()
    {
        if (getStop().getLocation().isNull())
        {
            staticMapLayout.setVisibility(8);
            navigateButton.setVisibility(8);
            addressTextView.setHint(Html.fromHtml(getResources().getString(0x7f0702ac)));
        }
        if (!routeProvider.getDriverRide().isCourier())
        {
            addressTextView.setGravity(16);
            addressTextView.setOnClickListener(getAddressTextClickListener());
            addressTextView.setBackgroundDrawable(getResources().getDrawable(0x7f020008));
        }
    }

    protected String getAddressText()
    {
        if (routeProvider.getDriverRide().getCurrentStop().isPickup() && Strings.isNullOrEmpty(getStop().getLocation().getDisplayName()))
        {
            return getContext().getResources().getString(0x7f070064);
        } else
        {
            return getStop().getLocation().getDisplayName();
        }
    }

    public android.view.View.OnClickListener getAddressTextClickListener()
    {
        return new android.view.View.OnClickListener() {

            final NavigationDialogView this$0;

            public void onClick(View view)
            {
                appFlow.goTo(new me.lyft.android.ui.placesearch.PlaceSearchScreens.DriverSetDropoffSearch(true));
                dialogFlow.dismiss();
            }

            
            {
                this$0 = NavigationDialogView.this;
                super();
            }
        };
    }

    public android.view.View.OnClickListener getNavigateButtonListener()
    {
        return new android.view.View.OnClickListener() {

            final NavigationDialogView this$0;

            public void onClick(View view)
            {
                if (routeProvider.getDriverRide().isTrainingRide())
                {
                    dialogFlow.queue(new DriverDialogs.TrainingRideNavigationDialog());
                } else
                {
                    navigator.navigate(getStop().getLocation());
                }
                dialogFlow.dismiss();
            }

            
            {
                this$0 = NavigationDialogView.this;
                super();
            }
        };
    }

    protected int getTitleTextId()
    {
        return !getStop().isPickup() ? 0x7f070136 : 0x7f070140;
    }

    protected void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        ButterKnife.a(this);
        displayedStop = routeProvider.getDriverRide().getCurrentStop();
        Binder.attach(this).bind(routeProvider.observeRide(), onRouteChanged);
        addressTextView.setText(getAddressText());
        passengerNameTextView.setText(getResources().getString(getTitleTextId(), new Object[] {
            routeProvider.getDriverRide().getCurrentPassenger().getFirstName()
        }));
        styleDialog();
        loadImages();
        navigateButton.setOnClickListener(getNavigateButtonListener());
        closeButton.setOnClickListener(new android.view.View.OnClickListener() {

            final NavigationDialogView this$0;

            public void onClick(View view)
            {
                dialogFlow.dismiss();
            }

            
            {
                this$0 = NavigationDialogView.this;
                super();
            }
        });
        setShownFlag();
        showTooltips();
    }

    protected void onDetachedFromWindow()
    {
        super.onDetachedFromWindow();
    }

    protected void setShownFlag()
    {
        RideFlags rideflags = lyftPreferences.getRideFlags();
        rideflags.setPickupMessageShown(true);
        lyftPreferences.setRideFlags(rideflags);
    }

    protected void styleDialog()
    {
        addressTextView.setCompoundDrawablesWithIntrinsicBounds(getPinResource(), 0, 0, 0);
        mapPinImageView.setImageResource(getMapPinResource());
        addressTextView.setLayoutParams(getAddressTextViewLayoutParams());
        if (getStop().isDropOff())
        {
            styleDropoff();
        }
        setButtonStyles();
    }


}
