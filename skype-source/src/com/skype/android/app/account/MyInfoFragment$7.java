// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.account;

import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;
import com.skype.Account;
import com.skype.android.analytics.Analytics;
import com.skype.android.analytics.AnalyticsEvent;

// Referenced classes of package com.skype.android.app.account:
//            MyInfoFragment, PresenceControlAdapter

final class this._cls0
    implements android.widget.mSelectedListener
{

    final MyInfoFragment this$0;

    public final void onItemSelected(AdapterView adapterview, View view, int i, long l)
    {
        adapterview = (apter.PresenceModel)MyInfoFragment.access$200(MyInfoFragment.this).getItemAtPosition(i);
        if (i != MyInfoFragment.access$300(MyInfoFragment.this).getSelectedPosition())
        {
            MyInfoFragment.access$300(MyInfoFragment.this).setSelectedPosition(i);
            account.setAvailability(adapterview.getAvailabilityStatus());
            analytics.a(AnalyticsEvent.W, adapterview.getAvailabilityStatus().toString());
        }
        MyInfoFragment.access$400(MyInfoFragment.this);
    }

    public final void onNothingSelected(AdapterView adapterview)
    {
    }

    apter()
    {
        this$0 = MyInfoFragment.this;
        super();
    }
}
