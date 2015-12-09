// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.recurringtopup;

import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;
import com.google.android.apps.wallet.analytics.AnalyticsCustomDimension;
import com.google.android.apps.wallet.analytics.AnalyticsUtil;

// Referenced classes of package com.google.android.apps.wallet.recurringtopup:
//            SetupRecurringTopupActivity

final class this._cls0
    implements android.widget.ener
{

    final SetupRecurringTopupActivity this$0;

    public final void onItemSelected(AdapterView adapterview, View view, int i, long l)
    {
        if ("INITIALIZING".equals(SetupRecurringTopupActivity.access$000(SetupRecurringTopupActivity.this).getTag()))
        {
            SetupRecurringTopupActivity.access$000(SetupRecurringTopupActivity.this).setTag("INITIALIZED");
        } else
        {
            analyticsUtil.sendListItemTap("RecurringTransferRecurrence", new AnalyticsCustomDimension[0]);
        }
        SetupRecurringTopupActivity.access$100(SetupRecurringTopupActivity.this);
    }

    public final void onNothingSelected(AdapterView adapterview)
    {
    }

    Q()
    {
        this$0 = SetupRecurringTopupActivity.this;
        super();
    }
}
