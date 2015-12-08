// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.dialogs;

import android.view.View;
import me.lyft.android.analytics.studies.DriverDocumentsAnalytics;

// Referenced classes of package me.lyft.android.ui.dialogs:
//            InsuranceExpiringDialogView

class this._cls0
    implements android.view.gDialogView._cls2
{

    final InsuranceExpiringDialogView this$0;

    public void onClick(View view)
    {
        DriverDocumentsAnalytics.driverInsuranceDialogNotNow();
        InsuranceExpiringDialogView.access$000(InsuranceExpiringDialogView.this);
    }

    s()
    {
        this$0 = InsuranceExpiringDialogView.this;
        super();
    }
}
