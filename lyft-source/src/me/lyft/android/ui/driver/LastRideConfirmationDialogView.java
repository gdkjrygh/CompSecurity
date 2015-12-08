// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.driver;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import butterknife.ButterKnife;
import com.lyft.scoop.Scoop;
import java.util.Iterator;
import java.util.List;
import me.lyft.android.analytics.AsyncActionAnalytics;
import me.lyft.android.analytics.studies.DriverAnalytics;
import me.lyft.android.application.ride.IDriverRideProvider;
import me.lyft.android.application.ride.IDriverRouteService;
import me.lyft.android.common.DialogFlow;
import me.lyft.android.common.Unit;
import me.lyft.android.domain.ride.DriverRide;
import me.lyft.android.domain.ride.Passenger;
import me.lyft.android.rx.AsyncCall;
import me.lyft.android.rx.Binder;
import me.lyft.android.ui.IProgressController;
import me.lyft.android.ui.IViewErrorHandler;
import me.lyft.android.ui.UserImageView;
import me.lyft.android.ui.dialogs.DialogContainerView;
import me.lyft.android.ui.dialogs.Toast;
import rx.functions.Action1;

public class LastRideConfirmationDialogView extends DialogContainerView
{

    private Binder binder;
    Button confirmLastRideButton;
    DialogFlow dialogFlow;
    IDriverRouteService driverRouteService;
    private Action1 onRouteUpdated;
    LinearLayout passengerPhotoListView;
    IProgressController progressController;
    IDriverRideProvider routeProvider;
    IViewErrorHandler viewErrorHandler;

    public LastRideConfirmationDialogView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        onRouteUpdated = new Action1() {

            final LastRideConfirmationDialogView this$0;

            public volatile void call(Object obj)
            {
                call((DriverRide)obj);
            }

            public void call(DriverRide driverride)
            {
                updatePassengerPhotos();
            }

            
            {
                this$0 = LastRideConfirmationDialogView.this;
                super();
            }
        };
        Scoop.a(this).b(this);
    }

    private void addPassengerPhoto(Passenger passenger, android.view.ViewGroup.LayoutParams layoutparams)
    {
        UserImageView userimageview = new UserImageView(getContext());
        userimageview.loadPhoto(passenger.getPhotoUrl());
        passengerPhotoListView.addView(userimageview, layoutparams);
    }

    private void updatePassengerPhotos()
    {
        passengerPhotoListView.removeAllViews();
        int i = getResources().getDimensionPixelOffset(0x7f080059);
        android.view.ViewGroup.LayoutParams layoutparams = new android.view.ViewGroup.LayoutParams(i, i);
        for (Iterator iterator = routeProvider.getDriverRide().getNotDroppedOffPassengers().iterator(); iterator.hasNext(); addPassengerPhoto((Passenger)iterator.next(), layoutparams)) { }
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
            binder.bind(routeProvider.observeRide(), onRouteUpdated);
            confirmLastRideButton.setOnClickListener(new android.view.View.OnClickListener() {

                final LastRideConfirmationDialogView this$0;

                public void onClick(View view)
                {
                    view = DriverAnalytics.trackEnterLastRide();
                    progressController.showProgress();
                    binder.bind(driverRouteService.enterLastRide(), view. new AsyncCall() {

                        final _cls1 this$1;
                        final AsyncActionAnalytics val$asyncActionAnalytics;

                        public void onFail(Throwable throwable)
                        {
                            asyncActionAnalytics.trackResponseFailure(throwable);
                            viewErrorHandler.handle(throwable);
                        }

                        public void onStart()
                        {
                            progressController.hideProgress();
                        }

                        public volatile void onSuccess(Object obj)
                        {
                            onSuccess((Unit)obj);
                        }

                        public void onSuccess(Unit unit)
                        {
                            asyncActionAnalytics.trackResponseSuccess();
                            dialogFlow.dismiss();
                            dialogFlow.show(new Toast(getResources().getString(0x7f0701eb), null));
                        }

            
            {
                this$1 = final__pcls1;
                asyncActionAnalytics = AsyncActionAnalytics.this;
                super();
            }
                    });
                }

            
            {
                this$0 = LastRideConfirmationDialogView.this;
                super();
            }
            });
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


}
