// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.dialogs;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import butterknife.ButterKnife;
import com.lyft.scoop.Scoop;
import me.lyft.android.application.ride.IDriverRideProvider;
import me.lyft.android.domain.ride.DriverRide;
import me.lyft.android.domain.ride.Passenger;
import me.lyft.android.utils.Telephony;

// Referenced classes of package me.lyft.android.ui.dialogs:
//            DialogContainerView

public class CallConfirmationDialogView extends DialogContainerView
{

    Button confirmCallButton;
    me.lyft.android.ui.driver.DriverDialogs.CallConfirmationDialog params;
    IDriverRideProvider routeProvider;
    Telephony telephony;

    public CallConfirmationDialogView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        context = Scoop.a(this);
        context.b(this);
        params = (me.lyft.android.ui.driver.DriverDialogs.CallConfirmationDialog)context.a();
    }

    private void styleConfirmCallButton()
    {
        int i;
        int j;
        if (routeProvider.getDriverRide().isCourier())
        {
            j = 0x7f0c00ad;
            i = 0x7f02005b;
        } else
        {
            j = 0x7f0c00ab;
            i = 0x7f02004e;
        }
        confirmCallButton.setText(getResources().getString(0x7f070127, new Object[] {
            params.getPassenger().getFirstName()
        }));
        confirmCallButton.setTextColor(getResources().getColorStateList(j));
        confirmCallButton.setBackgroundDrawable(getResources().getDrawable(i));
    }

    protected void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        if (isInEditMode())
        {
            return;
        } else
        {
            confirmCallButton.setOnClickListener(new android.view.View.OnClickListener() {

                final CallConfirmationDialogView this$0;

                public void onClick(View view)
                {
                    telephony.callPhone(params.getPassenger().getPhoneNumber());
                }

            
            {
                this$0 = CallConfirmationDialogView.this;
                super();
            }
            });
            styleConfirmCallButton();
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
