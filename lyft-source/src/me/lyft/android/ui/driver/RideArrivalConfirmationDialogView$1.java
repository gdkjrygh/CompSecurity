// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.driver;

import android.view.View;
import me.lyft.android.common.DialogFlow;
import me.lyft.android.common.Unit;
import me.lyft.android.rx.MessageBus;

// Referenced classes of package me.lyft.android.ui.driver:
//            RideArrivalConfirmationDialogView

class this._cls0
    implements android.view.DialogView._cls1
{

    final RideArrivalConfirmationDialogView this$0;

    public void onClick(View view)
    {
        dialogFlow.dismiss();
        bus.post(me/lyft/android/ui/driver/RideArrivalConfirmationDialogView$RideArrivalConfirmationResultEvent, Unit.create());
    }

    deArrivalConfirmationResultEvent()
    {
        this$0 = RideArrivalConfirmationDialogView.this;
        super();
    }
}
