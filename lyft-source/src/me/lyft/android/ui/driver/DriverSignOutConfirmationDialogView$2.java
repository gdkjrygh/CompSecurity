// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.driver;

import android.view.View;
import me.lyft.android.analytics.studies.DriverSignOutConfirmationAnalytics;
import me.lyft.android.common.DialogFlow;

// Referenced classes of package me.lyft.android.ui.driver:
//            DriverSignOutConfirmationDialogView

class this._cls0
    implements android.view.DialogView._cls2
{

    final DriverSignOutConfirmationDialogView this$0;

    public void onClick(View view)
    {
        DriverSignOutConfirmationAnalytics.keepDriving(System.currentTimeMillis() - DriverSignOutConfirmationDialogView.access$000(DriverSignOutConfirmationDialogView.this), DriverSignOutConfirmationDialogView.access$100(DriverSignOutConfirmationDialogView.this));
        dialogFlow.dismiss();
    }

    tics()
    {
        this$0 = DriverSignOutConfirmationDialogView.this;
        super();
    }
}
