// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.passenger;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import butterknife.ButterKnife;
import com.lyft.scoop.Scoop;
import java.util.concurrent.TimeUnit;
import me.lyft.android.application.passenger.IPassengerRideProvider;
import me.lyft.android.application.ride.IPassengerRideService;
import me.lyft.android.common.DialogFlow;
import me.lyft.android.common.Strings;
import me.lyft.android.domain.passenger.PassengerRide;
import me.lyft.android.domain.payment.Money;
import me.lyft.android.domain.ride.FixedFare;
import me.lyft.android.domain.ride.RideStatus;
import me.lyft.android.events.AppStateUpdatedEvent;
import me.lyft.android.infrastructure.lyft.AppStateDTO;
import me.lyft.android.rx.AsyncCall;
import me.lyft.android.rx.Binder;
import me.lyft.android.rx.MessageBus;
import me.lyft.android.ui.IProgressController;
import me.lyft.android.ui.dialogs.DialogContainerView;
import rx.functions.Action1;

public class StandbyConfirmationDialogView extends DialogContainerView
{

    private Binder binder;
    MessageBus bus;
    Button confirmStandbySwitchButton;
    DialogFlow dialogFlow;
    private final FixedFare fare;
    TextView messageTextView;
    private final Action1 onAppStateUpdated = new Action1() {

        final StandbyConfirmationDialogView this$0;

        public volatile void call(Object obj)
        {
            call((AppStateDTO)obj);
        }

        public void call(AppStateDTO appstatedto)
        {
            if (!passengerRideProvider.getPassengerRide().getStatus().isPending())
            {
                dialogFlow.dismiss(me/lyft/android/ui/passenger/PassengerDialogs$StandbyConfirmationDialog);
            }
        }

            
            {
                this$0 = StandbyConfirmationDialogView.this;
                super();
            }
    };
    IPassengerRideProvider passengerRideProvider;
    IPassengerRideService passengerRideService;
    IProgressController progressController;
    TextView standbyPrice;
    TextView titleTextView;

    public StandbyConfirmationDialogView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        context = Scoop.a(this);
        context.b(this);
        fare = ((PassengerDialogs.StandbyConfirmationDialog)context.a()).getFare();
    }

    private void confirmStandbySwitch()
    {
        progressController.showProgress();
        binder.bind(passengerRideService.updateStandby(fare), new AsyncCall() {

            final StandbyConfirmationDialogView this$0;

            public void onUnsubscribe()
            {
                super.onUnsubscribe();
                progressController.hideProgress();
                dialogFlow.dismiss(me/lyft/android/ui/passenger/PassengerDialogs$StandbyConfirmationDialog);
            }

            
            {
                this$0 = StandbyConfirmationDialogView.this;
                super();
            }
        });
    }

    private void setConfirmationDescriptionText(FixedFare fixedfare)
    {
        String s1 = fixedfare.getConfirmationTitle();
        String s = s1;
        if (Strings.isNullOrEmpty(s1))
        {
            s = getResources().getString(0x7f070109, new Object[] {
                Long.valueOf(TimeUnit.SECONDS.toMinutes(fixedfare.getDispatchTimeout().longValue()))
            });
        }
        titleTextView.setText(s);
        fixedfare = fixedfare.getConfirmationSubtitle();
        messageTextView.setText(fixedfare);
    }

    protected void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        binder = Binder.attach(this);
        binder.bind(bus.observe(me/lyft/android/events/AppStateUpdatedEvent), onAppStateUpdated);
        setConfirmationDescriptionText(fare);
        standbyPrice.setText(fare.getTotalMoney().format());
        String s = fare.getConfirmationButtonText();
        if (!Strings.isNullOrEmpty(s))
        {
            confirmStandbySwitchButton.setText(s);
        }
        confirmStandbySwitchButton.setOnClickListener(new android.view.View.OnClickListener() {

            final StandbyConfirmationDialogView this$0;

            public void onClick(View view)
            {
                confirmStandbySwitch();
            }

            
            {
                this$0 = StandbyConfirmationDialogView.this;
                super();
            }
        });
    }

    protected void onFinishInflate()
    {
        super.onFinishInflate();
        ButterKnife.a(this);
    }

}
