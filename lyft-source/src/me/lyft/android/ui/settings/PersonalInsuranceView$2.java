// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.settings;

import android.view.View;
import me.lyft.android.analytics.studies.DriverDocumentsAnalytics;

// Referenced classes of package me.lyft.android.ui.settings:
//            PersonalInsuranceView

class this._cls0
    implements android.view.nsuranceView._cls2
{

    final PersonalInsuranceView this$0;

    public void onClick(View view)
    {
        DriverDocumentsAnalytics.driverInsuranceUpdate();
        PersonalInsuranceView.access$100(PersonalInsuranceView.this);
    }

    lytics()
    {
        this$0 = PersonalInsuranceView.this;
        super();
    }
}
