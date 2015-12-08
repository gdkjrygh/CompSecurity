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
import java.util.List;
import me.lyft.android.IUserSession;
import me.lyft.android.application.IConstantsProvider;
import me.lyft.android.application.ride.IRideRequestSession;
import me.lyft.android.common.DialogFlow;
import me.lyft.android.common.Strings;
import me.lyft.android.common.Unit;
import me.lyft.android.domain.payment.Money;
import me.lyft.android.domain.ride.FixedFare;
import me.lyft.android.infrastructure.lyft.constants.Constants;
import me.lyft.android.rx.MessageBus;
import me.lyft.android.ui.dialogs.DialogContainerView;

public class PartySizePickerDialogView extends DialogContainerView
{

    MessageBus bus;
    IConstantsProvider constantsProvider;
    DialogFlow dialogFlow;
    private final List fares;
    TextView messageTextView;
    Button onePartySizeButton;
    IRideRequestSession rideRequestSession;
    TextView titleTextView;
    Button twoPartySizeButton;
    IUserSession userSession;

    public PartySizePickerDialogView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        Scoop.a(this).b(this);
        fares = rideRequestSession.getFares();
    }

    private String getButtonStringWithPrice(String s, String s1)
    {
        return getResources().getString(0x7f0700c9, new Object[] {
            s, s1
        });
    }

    private String getPartySizeButtonText(int i)
    {
        FixedFare fixedfare = FixedFare.findFareByPartySize(fares, i);
        Object obj = getResources();
        String s;
        if (i == 1)
        {
            i = 0x7f0700c8;
        } else
        {
            i = 0x7f0700cb;
        }
        s = ((Resources) (obj)).getString(i);
        obj = s;
        if (!fixedfare.isNull())
        {
            obj = getButtonStringWithPrice(s, fixedfare.getTotalMoney().format());
            obj = Strings.nullOrEmptyToDefault(fixedfare.getButtonText(), ((String) (obj)));
        }
        return ((String) (obj));
    }

    private void postResult(int i)
    {
        rideRequestSession.setPartySize(i);
        bus.post(me/lyft/android/ui/passenger/PartySizePickerDialogView$SelectNumberOfPassengersResultEvent, Unit.create());
    }

    protected void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        Constants constants = constantsProvider.getConstants();
        titleTextView.setText(Strings.nullOrEmptyToDefault(constants.getPartySizeConfirmationTitle(), getResources().getString(0x7f0700e3)));
        messageTextView.setText(Strings.nullOrEmptyToDefault(constants.getPartySizeConfirmationMessage(), getResources().getString(0x7f0700e2)));
        if (!fares.isEmpty())
        {
            onePartySizeButton.setText(getPartySizeButtonText(1));
            twoPartySizeButton.setText(getPartySizeButtonText(2));
        }
        onePartySizeButton.setOnClickListener(new android.view.View.OnClickListener() {

            final PartySizePickerDialogView this$0;

            public void onClick(View view)
            {
                postResult(1);
            }

            
            {
                this$0 = PartySizePickerDialogView.this;
                super();
            }
        });
        twoPartySizeButton.setOnClickListener(new android.view.View.OnClickListener() {

            final PartySizePickerDialogView this$0;

            public void onClick(View view)
            {
                postResult(2);
            }

            
            {
                this$0 = PartySizePickerDialogView.this;
                super();
            }
        });
    }

    protected void onDetachedFromWindow()
    {
        super.onDetachedFromWindow();
    }

    protected void onFinishInflate()
    {
        super.onFinishInflate();
        ButterKnife.a(this);
    }

}
