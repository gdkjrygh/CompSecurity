// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.passenger;

import android.content.Context;
import android.content.res.Resources;
import android.text.Html;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.ButterKnife;
import com.lyft.scoop.Scoop;
import java.text.MessageFormat;
import java.util.Iterator;
import java.util.List;
import me.lyft.android.analytics.studies.PassengerAnalytics;
import me.lyft.android.application.IConstantsProvider;
import me.lyft.android.application.passenger.IPassengerRideProvider;
import me.lyft.android.application.ride.ICancellationOptionsProvider;
import me.lyft.android.application.ride.IPassengerRideService;
import me.lyft.android.common.DialogFlow;
import me.lyft.android.common.Objects;
import me.lyft.android.common.Strings;
import me.lyft.android.common.Unit;
import me.lyft.android.domain.passenger.PassengerRide;
import me.lyft.android.domain.ride.RideStatus;
import me.lyft.android.infrastructure.lyft.constants.CancellationOption;
import me.lyft.android.infrastructure.lyft.constants.Constants;
import me.lyft.android.rx.AsyncCall;
import me.lyft.android.rx.Binder;
import me.lyft.android.ui.IProgressController;
import me.lyft.android.ui.IViewErrorHandler;
import me.lyft.android.ui.dialogs.DialogContainerView;
import me.lyft.android.ui.dialogs.Toast;
import rx.functions.Action1;

public class PassengerCancelRideDialogView extends DialogContainerView
{

    private Binder binder;
    LinearLayout cancellationOptionsContainer;
    ICancellationOptionsProvider cancellationOptionsProvider;
    IConstantsProvider constantsProvider;
    private int currentCancelPenalty;
    private RideStatus currentRideStatus;
    DialogFlow dialogFlow;
    Button doNotCancelButton;
    TextView multiOptionsMessageTextView;
    private Action1 onCancellationOptionsChanged;
    private Action1 onPassengerRideUpdated;
    IPassengerRideProvider passengerRideProvider;
    IPassengerRideService passengerRideService;
    TextView penaltyDetailTextView;
    TextView penaltyMessageTextView;
    IProgressController progressController;
    IViewErrorHandler viewErrorHandler;

    public PassengerCancelRideDialogView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        currentCancelPenalty = -1;
        onPassengerRideUpdated = new Action1() {

            final PassengerCancelRideDialogView this$0;

            public volatile void call(Object obj)
            {
                call((Unit)obj);
            }

            public void call(Unit unit)
            {
                if (!Objects.equals(passengerRideProvider.getPassengerRide().getStatus().getStatus(), currentRideStatus.getStatus()))
                {
                    dialogFlow.dismiss(me/lyft/android/ui/passenger/PassengerDialogs$PassengerCancelRideDialog);
                }
                updatePenaltyMessageText();
                updateImprovementsMessageText();
            }

            
            {
                this$0 = PassengerCancelRideDialogView.this;
                super();
            }
        };
        onCancellationOptionsChanged = new Action1() {

            final PassengerCancelRideDialogView this$0;

            public volatile void call(Object obj)
            {
                call((Unit)obj);
            }

            public void call(Unit unit)
            {
                createCancellationOptions();
            }

            
            {
                this$0 = PassengerCancelRideDialogView.this;
                super();
            }
        };
        Scoop.a(this).b(this);
    }

    private void cancelRide(CancellationOption cancellationoption)
    {
        progressController.disableUI();
        binder.bind(passengerRideService.cancelRide(cancellationoption, currentCancelPenalty), new AsyncCall() {

            final PassengerCancelRideDialogView this$0;

            public void onFail(Throwable throwable)
            {
                super.onFail(throwable);
                viewErrorHandler.handle(throwable);
            }

            public volatile void onSuccess(Object obj)
            {
                onSuccess((Unit)obj);
            }

            public void onSuccess(Unit unit)
            {
                super.onSuccess(unit);
                dialogFlow.show(new Toast(getResources().getString(0x7f07030b)));
            }

            public void onUnsubscribe()
            {
                super.onUnsubscribe();
                progressController.enableUI();
            }

            
            {
                this$0 = PassengerCancelRideDialogView.this;
                super();
            }
        });
    }

    private void createCancellationOptions()
    {
        cancellationOptionsContainer.removeAllViews();
        Button button;
        for (Iterator iterator = cancellationOptionsProvider.getCancellationOptions().iterator(); iterator.hasNext(); cancellationOptionsContainer.addView(button))
        {
            final CancellationOption cancellationOption = (CancellationOption)iterator.next();
            button = (Button)inflate(getContext(), 0x7f03005c, null);
            button.setText(cancellationOption.getString());
            button.setOnClickListener(new android.view.View.OnClickListener() {

                final PassengerCancelRideDialogView this$0;
                final CancellationOption val$cancellationOption;

                public void onClick(View view)
                {
                    cancelRide(cancellationOption);
                }

            
            {
                this$0 = PassengerCancelRideDialogView.this;
                cancellationOption = cancellationoption;
                super();
            }
            });
        }

    }

    private String getPenaltyMessageText()
    {
        PassengerRide passengerride = passengerRideProvider.getPassengerRide();
        String s = constantsProvider.getConstants().getCancelSubtitleTextCharge();
        String s1;
        if (passengerride.getStatus().isPending())
        {
            s = constantsProvider.getConstants().getCancelSubtitleTextUnassigned();
        } else
        if (passengerride.getCancelPenalty() == 0)
        {
            s = constantsProvider.getConstants().getCancelSubtitleTextNoCharge();
        } else
        if (!Strings.isNullOrEmpty(s))
        {
            s = MessageFormat.format(s, new Object[] {
                Integer.valueOf(passengerride.getCancelPenalty())
            });
        } else
        {
            s = "";
        }
        s1 = constantsProvider.getConstants().getCancelDetailTextCharge();
        if (passengerride.getCancelPenalty() != 0 && !Strings.isNullOrEmpty(s1))
        {
            penaltyDetailTextView.setText(s1);
            penaltyDetailTextView.setVisibility(0);
            return s;
        } else
        {
            penaltyDetailTextView.setVisibility(8);
            return s;
        }
    }

    private void updateImprovementsMessageText()
    {
        String s = constantsProvider.getConstants().getMultipleOptionsCancelSubtitle();
        if (!Strings.isNullOrEmpty(s) && !cancellationOptionsProvider.getCancellationOptions().isEmpty())
        {
            multiOptionsMessageTextView.setText(s);
            multiOptionsMessageTextView.setVisibility(0);
            return;
        } else
        {
            multiOptionsMessageTextView.setVisibility(8);
            return;
        }
    }

    private void updatePenaltyMessageText()
    {
        Object obj = Integer.valueOf(passengerRideProvider.getPassengerRide().getCancelPenalty());
        if (((Integer) (obj)).intValue() == currentCancelPenalty)
        {
            return;
        }
        currentCancelPenalty = ((Integer) (obj)).intValue();
        obj = getPenaltyMessageText();
        if (!Strings.isNullOrEmpty(((String) (obj))))
        {
            penaltyMessageTextView.setText(Html.fromHtml(((String) (obj))));
            penaltyMessageTextView.setVisibility(0);
            return;
        } else
        {
            penaltyMessageTextView.setVisibility(8);
            return;
        }
    }

    protected void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        PassengerAnalytics.trackCancellationShown();
        currentRideStatus = passengerRideProvider.getPassengerRide().getStatus();
        createCancellationOptions();
        doNotCancelButton.setOnClickListener(new android.view.View.OnClickListener() {

            final PassengerCancelRideDialogView this$0;

            public void onClick(View view)
            {
                PassengerAnalytics.trackCancellationDismiss();
                dialogFlow.dismiss();
            }

            
            {
                this$0 = PassengerCancelRideDialogView.this;
                super();
            }
        });
        binder = Binder.attach(this);
        binder.bind(passengerRideProvider.observeRideUpdateEvent(), onPassengerRideUpdated);
        binder.bind(cancellationOptionsProvider.observeCancellationOptionChange(), onCancellationOptionsChanged);
    }

    public boolean onBack()
    {
        PassengerAnalytics.trackCancellationDismiss();
        return super.onBack();
    }

    protected void onFinishInflate()
    {
        super.onFinishInflate();
        ButterKnife.a(this);
    }





}
