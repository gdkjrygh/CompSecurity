// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.dialogs;

import android.view.View;
import me.lyft.android.domain.ride.Passenger;
import me.lyft.android.utils.Telephony;

// Referenced classes of package me.lyft.android.ui.dialogs:
//            CallConfirmationDialogView

class this._cls0
    implements android.view.nDialogView._cls1
{

    final CallConfirmationDialogView this$0;

    public void onClick(View view)
    {
        telephony.callPhone(params.getPassenger().getPhoneNumber());
    }

    Dialog()
    {
        this$0 = CallConfirmationDialogView.this;
        super();
    }
}
