// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.passenger;

import android.view.View;
import me.lyft.android.application.ride.IRideRequestSession;
import me.lyft.android.common.DialogFlow;
import me.lyft.android.rx.MessageBus;
import me.lyft.android.ui.dialogs.DialogResult;

// Referenced classes of package me.lyft.android.ui.passenger:
//            ConfirmPickupLocationDialogView

class this._cls0
    implements android.view.ionDialogView._cls1
{

    final ConfirmPickupLocationDialogView this$0;

    public void onClick(View view)
    {
        rideRequestSession.confirmPickupLocation();
        dialogFlow.dismiss();
        (new DialogResult()).setCancelled(false);
        bus.post(me/lyft/android/ui/passenger/ConfirmPickupLocationDialogView$ConfirmPickupLocationDialogResult, Boolean.valueOf(true));
    }

    nfirmPickupLocationDialogResult()
    {
        this$0 = ConfirmPickupLocationDialogView.this;
        super();
    }
}
