// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.contacts;

import android.view.View;
import com.skype.android.analytics.Analytics;
import com.skype.android.analytics.AnalyticsEvent;
import com.skype.android.analytics.ExperimentEvent;
import com.skype.android.analytics.ExperimentTag;
import com.skype.android.analytics.ExperimentTelemetryEvent;
import com.skype.android.app.Navigation;
import com.skype.android.app.mnv.MnvAnalytics;

// Referenced classes of package com.skype.android.app.contacts:
//            ContactListFragment

final class this._cls0
    implements android.view.actListFragment._cls6
{

    final ContactListFragment this$0;

    public final void onClick(View view)
    {
        nav.launchMobileVerification(com.skype.android.app.mnv.ACT_LIST);
        analytics.a(new ExperimentTelemetryEvent(ExperimentEvent.a, ExperimentTag.d));
        mnvAnalytics.report(AnalyticsEvent.cT);
    }

    ()
    {
        this$0 = ContactListFragment.this;
        super();
    }
}
