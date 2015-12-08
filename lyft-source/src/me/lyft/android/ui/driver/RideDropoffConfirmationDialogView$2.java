// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.driver;

import android.view.View;
import me.lyft.android.common.DialogFlow;
import me.lyft.android.common.Unit;
import me.lyft.android.rx.MessageBus;

// Referenced classes of package me.lyft.android.ui.driver:
//            RideDropoffConfirmationDialogView

class this._cls0
    implements android.view.DialogView._cls2
{

    final RideDropoffConfirmationDialogView this$0;

    public void onClick(View view)
    {
        bus.post(me/lyft/android/ui/driver/RideDropoffConfirmationDialogView$RideDropoffConfirmationResultEvent, Unit.create());
        dialogFlow.dismiss();
    }

    deDropoffConfirmationResultEvent()
    {
        this$0 = RideDropoffConfirmationDialogView.this;
        super();
    }
}
