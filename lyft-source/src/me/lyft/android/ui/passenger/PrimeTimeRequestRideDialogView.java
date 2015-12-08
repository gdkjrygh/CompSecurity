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
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import me.lyft.android.application.IConstantsProvider;
import me.lyft.android.application.ride.IRequestRideTypeProvider;
import me.lyft.android.application.ride.IRideRequestSession;
import me.lyft.android.common.DialogFlow;
import me.lyft.android.common.Strings;
import me.lyft.android.domain.ride.RequestRideType;
import me.lyft.android.infrastructure.lyft.constants.Constants;
import me.lyft.android.rx.MessageBus;
import me.lyft.android.ui.dialogs.DialogContainerView;
import rx.Scheduler;
import rx.Subscription;
import rx.android.schedulers.AndroidSchedulers;
import rx.functions.Action0;
import rx.subscriptions.Subscriptions;

public class PrimeTimeRequestRideDialogView extends DialogContainerView
{

    public static final long REQUEST_LYFT_PRIME_TIME_DIALOG_TIMEOUT = 30L;
    MessageBus bus;
    Button confirmCourierSwitchButton;
    View confirmCourierSwitchDivider;
    private Subscription confirmationTimeoutSubscription;
    IConstantsProvider constantsProvider;
    TextView courierDiscountText;
    DialogFlow dialogFlow;
    TextView primeTimeDescriptionText;
    TextView primeTimePercentageText;
    IRequestRideTypeProvider requestRideTypeProvider;
    IRideRequestSession rideRequestSession;

    public PrimeTimeRequestRideDialogView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        confirmationTimeoutSubscription = Subscriptions.empty();
        Scoop.a(this).b(this);
    }

    private String getPrimeTimeDownSellButtonText()
    {
        String s1 = constantsProvider.getConstants().getPrimeTimeDownSellButtonLabel();
        String s = s1;
        if (Strings.isNullOrEmpty(s1))
        {
            s = getResources().getString(0x7f07035e);
        }
        return s;
    }

    private String getPrimeTimeDownsellText()
    {
        String s = constantsProvider.getConstants().getPrimeTimeDownSellDialogLabel();
        if (!Strings.isNullOrEmpty(s))
        {
            return s;
        } else
        {
            return getResources().getString(0x7f0702bb);
        }
    }

    private boolean isCourierDownSellEnabled()
    {
        if (!rideRequestSession.getCurrentRideType().isStandard())
        {
            return false;
        }
        for (Iterator iterator = requestRideTypeProvider.getRequestRideTypes().iterator(); iterator.hasNext();)
        {
            if (((RequestRideType)iterator.next()).isCourier())
            {
                return true;
            }
        }

        return false;
    }

    private void postResult(RequestType requesttype)
    {
        dialogFlow.dismiss();
        bus.post(me/lyft/android/ui/passenger/PrimeTimeRequestRideDialogView$ConfirmPricingDialogResultEvent, requesttype);
    }

    private void runConfirmationDismissTimeout()
    {
        confirmationTimeoutSubscription = AndroidSchedulers.mainThread().createWorker().schedule(new Action0() {

            final PrimeTimeRequestRideDialogView this$0;

            public void call()
            {
                dialogFlow.dismiss();
                postResult(RequestType.ALERT_TIME_OUT);
            }

            
            {
                this$0 = PrimeTimeRequestRideDialogView.this;
                super();
            }

            private class RequestType extends Enum
            {

                private static final RequestType $VALUES[];
                public static final RequestType ALERT_TIME_OUT;
                public static final RequestType CANCEL;
                public static final RequestType COURIER;
                public static final RequestType LYFT;

                public static RequestType valueOf(String s)
                {
                    return (RequestType)Enum.valueOf(me/lyft/android/ui/passenger/PrimeTimeRequestRideDialogView$RequestType, s);
                }

                public static RequestType[] values()
                {
                    return (RequestType[])$VALUES.clone();
                }

                public String getAnalyticName()
                {
                    class _cls2
                    {

                        static final int $SwitchMap$me$lyft$android$ui$passenger$PrimeTimeRequestRideDialogView$RequestType[];

                        static 
                        {
                            $SwitchMap$me$lyft$android$ui$passenger$PrimeTimeRequestRideDialogView$RequestType = new int[RequestType.values().length];
                            try
                            {
                                $SwitchMap$me$lyft$android$ui$passenger$PrimeTimeRequestRideDialogView$RequestType[RequestType.LYFT.ordinal()] = 1;
                            }
                            catch (NoSuchFieldError nosuchfielderror2) { }
                            try
                            {
                                $SwitchMap$me$lyft$android$ui$passenger$PrimeTimeRequestRideDialogView$RequestType[RequestType.COURIER.ordinal()] = 2;
                            }
                            catch (NoSuchFieldError nosuchfielderror1) { }
                            try
                            {
                                $SwitchMap$me$lyft$android$ui$passenger$PrimeTimeRequestRideDialogView$RequestType[RequestType.CANCEL.ordinal()] = 3;
                            }
                            catch (NoSuchFieldError nosuchfielderror)
                            {
                                return;
                            }
                        }
                    }

                    switch (_cls2..SwitchMap.me.lyft.android.ui.passenger.PrimeTimeRequestRideDialogView.RequestType[ordinal()])
                    {
                    default:
                        return "alert_time_out";

                    case 1: // '\001'
                        return "lyft";

                    case 2: // '\002'
                        return "courier";

                    case 3: // '\003'
                        return "cancel";
                    }
                }

                static 
                {
                    LYFT = new RequestType("LYFT", 0);
                    COURIER = new RequestType("COURIER", 1);
                    CANCEL = new RequestType("CANCEL", 2);
                    ALERT_TIME_OUT = new RequestType("ALERT_TIME_OUT", 3);
                    $VALUES = (new RequestType[] {
                        LYFT, COURIER, CANCEL, ALERT_TIME_OUT
                    });
                }

                private RequestType(String s, int i)
                {
                    super(s, i);
                }
            }

        }, 30L, TimeUnit.SECONDS);
    }

    void confirmCourierSwitch()
    {
        postResult(RequestType.COURIER);
    }

    void confirmLyftRequest()
    {
        rideRequestSession.confirmDynamicPricing();
        postResult(RequestType.LYFT);
    }

    void dialogContainerOnClick()
    {
    }

    protected void onAttachedToWindow()
    {
        boolean flag = false;
        super.onAttachedToWindow();
        primeTimePercentageText.setText(getResources().getString(0x7f0702ba, new Object[] {
            Integer.valueOf(rideRequestSession.getAcceptedDynamicPricing())
        }));
        primeTimeDescriptionText.setText(getResources().getString(0x7f0702b9, new Object[] {
            Integer.valueOf(rideRequestSession.getAcceptedDynamicPricing())
        }));
        courierDiscountText.setText(getPrimeTimeDownsellText());
        Object obj = courierDiscountText;
        int i;
        if (isCourierDownSellEnabled())
        {
            i = 0;
        } else
        {
            i = 8;
        }
        ((TextView) (obj)).setVisibility(i);
        obj = confirmCourierSwitchDivider;
        if (isCourierDownSellEnabled())
        {
            i = 0;
        } else
        {
            i = 8;
        }
        ((View) (obj)).setVisibility(i);
        obj = confirmCourierSwitchButton;
        if (isCourierDownSellEnabled())
        {
            i = ((flag) ? 1 : 0);
        } else
        {
            i = 8;
        }
        ((Button) (obj)).setVisibility(i);
        confirmCourierSwitchButton.setText(getPrimeTimeDownSellButtonText());
        runConfirmationDismissTimeout();
    }

    public boolean onBack()
    {
        super.onCancel();
        postResult(RequestType.CANCEL);
        return true;
    }

    protected void onClickOutside()
    {
        super.onClickOutside();
        postResult(RequestType.CANCEL);
    }

    protected void onDetachedFromWindow()
    {
        super.onDetachedFromWindow();
        confirmationTimeoutSubscription.unsubscribe();
    }

    protected void onFinishInflate()
    {
        super.onFinishInflate();
        ButterKnife.a(this);
    }

}
