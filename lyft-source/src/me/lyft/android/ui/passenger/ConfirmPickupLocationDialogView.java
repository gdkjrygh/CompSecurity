// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.passenger;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import butterknife.ButterKnife;
import com.lyft.scoop.IHandleBack;
import com.lyft.scoop.Scoop;
import me.lyft.android.application.ride.IRideRequestSession;
import me.lyft.android.common.DialogFlow;
import me.lyft.android.domain.location.Location;
import me.lyft.android.rx.MessageBus;
import me.lyft.android.ui.dialogs.DialogContainerView;
import me.lyft.android.ui.dialogs.DialogResult;

public class ConfirmPickupLocationDialogView extends DialogContainerView
    implements IHandleBack
{

    private String address;
    TextView addressNameView;
    MessageBus bus;
    Button cancelButton;
    Button confirmPickupButton;
    DialogFlow dialogFlow;
    IRideRequestSession rideRequestSession;

    public ConfirmPickupLocationDialogView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        Scoop.a(this).b(this);
        address = rideRequestSession.getPickupLocation().getDisplayName();
    }

    public boolean onBack()
    {
        bus.post(me/lyft/android/ui/passenger/ConfirmPickupLocationDialogView$ConfirmPickupLocationDialogResult, Boolean.valueOf(false));
        return false;
    }

    protected void onFinishInflate()
    {
        super.onFinishInflate();
        ButterKnife.a(this);
        addressNameView.setText(address);
        confirmPickupButton.setOnClickListener(new android.view.View.OnClickListener() {

            final ConfirmPickupLocationDialogView this$0;

            public void onClick(View view)
            {
                rideRequestSession.confirmPickupLocation();
                dialogFlow.dismiss();
                (new DialogResult()).setCancelled(false);
                bus.post(me/lyft/android/ui/passenger/ConfirmPickupLocationDialogView$ConfirmPickupLocationDialogResult, Boolean.valueOf(true));
            }

            
            {
                this$0 = ConfirmPickupLocationDialogView.this;
                super();
            }
        });
        cancelButton.setOnClickListener(new android.view.View.OnClickListener() {

            final ConfirmPickupLocationDialogView this$0;

            public void onClick(View view)
            {
                dialogFlow.dismiss();
                bus.post(me/lyft/android/ui/passenger/ConfirmPickupLocationDialogView$ConfirmPickupLocationDialogResult, Boolean.valueOf(false));
            }

            
            {
                this$0 = ConfirmPickupLocationDialogView.this;
                super();
            }
        });
    }
}
