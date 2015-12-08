// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.passenger;

import me.lyft.android.common.DialogFlow;
import rx.functions.Action0;

// Referenced classes of package me.lyft.android.ui.passenger:
//            PrimeTimeRequestRideDialogView

class this._cls0
    implements Action0
{

    final PrimeTimeRequestRideDialogView this$0;

    public void call()
    {
        dialogFlow.dismiss();
        PrimeTimeRequestRideDialogView.access$000(PrimeTimeRequestRideDialogView.this, questType.ALERT_TIME_OUT);
    }

    questType()
    {
        this$0 = PrimeTimeRequestRideDialogView.this;
        super();
    }
}
