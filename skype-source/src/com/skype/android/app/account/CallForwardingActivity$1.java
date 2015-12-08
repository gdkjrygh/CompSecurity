// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.account;

import android.widget.CompoundButton;
import com.skype.android.analytics.Analytics;
import com.skype.android.analytics.AnalyticsEvent;
import com.skype.android.util.CallForwarding;

// Referenced classes of package com.skype.android.app.account:
//            CallForwardingActivity

final class this._cls0
    implements android.widget.hangeListener
{

    final CallForwardingActivity this$0;

    public final void onCheckedChanged(CompoundButton compoundbutton, boolean flag)
    {
        callForwarding.a(flag);
        Analytics analytics;
        if (flag && adapter.getCount() <= 0)
        {
            CallForwardingActivity.access$000(CallForwardingActivity.this, 17, false, null);
        } else
        if (!flag)
        {
            callForwarding.c();
            adapter.clear();
            adapter.notifyDataSetChanged();
        }
        CallForwardingActivity.access$100(CallForwardingActivity.this);
        analytics = CallForwardingActivity.this.analytics;
        if (flag)
        {
            compoundbutton = AnalyticsEvent.aA;
        } else
        {
            compoundbutton = AnalyticsEvent.aB;
        }
        analytics.c(compoundbutton);
    }

    ()
    {
        this$0 = CallForwardingActivity.this;
        super();
    }
}
