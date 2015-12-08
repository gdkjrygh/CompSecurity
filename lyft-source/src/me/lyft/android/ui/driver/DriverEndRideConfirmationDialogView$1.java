// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.driver;

import android.view.View;
import me.lyft.android.analytics.studies.EndRideConfirmationAnalytics;
import me.lyft.android.common.DialogFlow;

// Referenced classes of package me.lyft.android.ui.driver:
//            DriverEndRideConfirmationDialogView

class this._cls0
    implements android.view.DialogView._cls1
{

    final DriverEndRideConfirmationDialogView this$0;

    public void onClick(View view)
    {
        EndRideConfirmationAnalytics.trackEndRide();
        dialogFlow.show(new ialog());
    }

    ialog()
    {
        this$0 = DriverEndRideConfirmationDialogView.this;
        super();
    }
}
