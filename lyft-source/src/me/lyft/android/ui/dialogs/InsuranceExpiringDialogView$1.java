// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.dialogs;

import android.view.View;
import me.lyft.android.analytics.studies.DriverDocumentsAnalytics;
import me.lyft.android.common.AppFlow;

// Referenced classes of package me.lyft.android.ui.dialogs:
//            InsuranceExpiringDialogView

class this._cls0
    implements android.view.gDialogView._cls1
{

    final InsuranceExpiringDialogView this$0;

    public void onClick(View view)
    {
        DriverDocumentsAnalytics.driverInsuranceDialogUpdate();
        appFlow.goTo(new me.lyft.android.ui.settings.nceScreen());
    }

    anceScreen()
    {
        this$0 = InsuranceExpiringDialogView.this;
        super();
    }
}
