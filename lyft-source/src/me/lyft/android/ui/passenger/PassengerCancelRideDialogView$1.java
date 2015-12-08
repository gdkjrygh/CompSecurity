// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.passenger;

import android.view.View;
import me.lyft.android.analytics.studies.PassengerAnalytics;
import me.lyft.android.common.DialogFlow;

// Referenced classes of package me.lyft.android.ui.passenger:
//            PassengerCancelRideDialogView

class this._cls0
    implements android.view.ideDialogView._cls1
{

    final PassengerCancelRideDialogView this$0;

    public void onClick(View view)
    {
        PassengerAnalytics.trackCancellationDismiss();
        dialogFlow.dismiss();
    }

    ()
    {
        this$0 = PassengerCancelRideDialogView.this;
        super();
    }
}
