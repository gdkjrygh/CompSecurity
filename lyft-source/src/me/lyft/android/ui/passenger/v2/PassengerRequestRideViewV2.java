// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.passenger.v2;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import com.lyft.scoop.IHandleBack;
import com.lyft.scoop.Scoop;

// Referenced classes of package me.lyft.android.ui.passenger.v2:
//            PassengerModuleV2, PassengerRequestRidePresenterV2

public class PassengerRequestRideViewV2 extends FrameLayout
    implements IHandleBack, PassengerRequestRidePresenterV2.RequestRideViewV2
{

    PassengerRequestRidePresenterV2 passengerRequestRidePresenter;
    final me.lyft.android.ui.MainScreens.RideScreen rideScreenParams;
    final Scoop scoop;

    public PassengerRequestRideViewV2(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        context = Scoop.a(this);
        scoop = Scoop.a(context.a(new Object[] {
            new PassengerModuleV2()
        }), context.a());
        scoop.b(this);
        rideScreenParams = (me.lyft.android.ui.MainScreens.RideScreen)scoop.a();
    }

    public String getWebDialogParams()
    {
        return rideScreenParams.getWebDialogParams();
    }

    public boolean isSwitchToDriverMode()
    {
        return rideScreenParams.isSwitchToDriverMode();
    }

    protected void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        if (isInEditMode())
        {
            return;
        } else
        {
            passengerRequestRidePresenter.attachView(this);
            return;
        }
    }

    public boolean onBack()
    {
        return passengerRequestRidePresenter.onBack();
    }

    protected void onDetachedFromWindow()
    {
        passengerRequestRidePresenter.detachView(this);
        super.onDetachedFromWindow();
    }

    public void resetSwitchToDriverMode()
    {
        rideScreenParams.resetSwitchToDriverMode();
    }

    public void resetWebDialogParams()
    {
        rideScreenParams.resetWebDialogUrl();
    }

    public void showStep(me.lyft.android.domain.ride.PassengerRideRequest.RequestRideStep requestridestep)
    {
        class _cls1
        {

            static final int $SwitchMap$me$lyft$android$domain$ride$PassengerRideRequest$RequestRideStep[];

            static 
            {
                $SwitchMap$me$lyft$android$domain$ride$PassengerRideRequest$RequestRideStep = new int[me.lyft.android.domain.ride.PassengerRideRequest.RequestRideStep.values().length];
                try
                {
                    $SwitchMap$me$lyft$android$domain$ride$PassengerRideRequest$RequestRideStep[me.lyft.android.domain.ride.PassengerRideRequest.RequestRideStep.SET_PICKUP.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    $SwitchMap$me$lyft$android$domain$ride$PassengerRideRequest$RequestRideStep[me.lyft.android.domain.ride.PassengerRideRequest.RequestRideStep.SET_DROPOFF.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    $SwitchMap$me$lyft$android$domain$ride$PassengerRideRequest$RequestRideStep[me.lyft.android.domain.ride.PassengerRideRequest.RequestRideStep.CONFIRM_REQUEST.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    $SwitchMap$me$lyft$android$domain$ride$PassengerRideRequest$RequestRideStep[me.lyft.android.domain.ride.PassengerRideRequest.RequestRideStep.CONFIRM_REQUEST_WITH_DESTINATION.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        _cls1..SwitchMap.me.lyft.android.domain.ride.PassengerRideRequest.RequestRideStep[requestridestep.ordinal()];
        JVM INSTR tableswitch 1 4: default 40
    //                   1 50
    //                   2 76
    //                   3 82
    //                   4 88;
           goto _L1 _L2 _L3 _L4 _L5
_L1:
        throw new IllegalStateException("unsupported step");
_L2:
        int i = 0x7f0300c3;
_L7:
        removeAllViews();
        scoop.a(getContext()).inflate(i, this, true);
        return;
_L3:
        i = 0x7f0300c2;
        continue; /* Loop/switch isn't completed */
_L4:
        i = 0x7f0300bf;
        continue; /* Loop/switch isn't completed */
_L5:
        i = 0x7f0300be;
        if (true) goto _L7; else goto _L6
_L6:
    }
}
