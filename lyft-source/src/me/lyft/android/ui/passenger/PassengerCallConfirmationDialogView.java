// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.passenger;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.widget.TextView;
import butterknife.ButterKnife;
import com.lyft.scoop.Scoop;
import me.lyft.android.application.passenger.IPassengerRideProvider;
import me.lyft.android.domain.passenger.Driver;
import me.lyft.android.domain.passenger.PassengerRide;
import me.lyft.android.ui.dialogs.DialogContainerView;
import me.lyft.android.utils.Telephony;

public class PassengerCallConfirmationDialogView extends DialogContainerView
{

    IPassengerRideProvider passengerRideProvider;
    Telephony telephony;
    TextView titleTextView;

    public PassengerCallConfirmationDialogView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        Scoop.a(this).b(this);
    }

    void call()
    {
        String s = passengerRideProvider.getPassengerRide().getDriver().getPhoneNumber();
        telephony.callPhone(s);
    }

    protected void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        if (isInEditMode())
        {
            return;
        } else
        {
            String s = passengerRideProvider.getPassengerRide().getDriver().getName();
            titleTextView.setText(getResources().getString(0x7f070085, new Object[] {
                s
            }));
            return;
        }
    }

    protected void onFinishInflate()
    {
        super.onFinishInflate();
        ButterKnife.a(this);
    }
}
