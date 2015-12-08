// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.activities;

import android.view.View;
import android.widget.AdapterView;
import com.dominos.android.sdk.common.LogUtil;
import com.dominos.utils.AnalyticsUtil;
import com.dominos.utils.StoreNumberOrder;

// Referenced classes of package com.dominos.activities:
//            PizzaTrackerPhoneNumberActivity

class this._cls0
    implements android.widget.ivity._cls1
{

    final PizzaTrackerPhoneNumberActivity this$0;

    public void onItemClick(AdapterView adapterview, View view, int i, long l)
    {
        mAnalyticsUtil.postPizzaTrackerSubmitted();
        adapterview = (StoreNumberOrder)view.getTag();
        if (((StoreNumberOrder) (adapterview)).storeProfile != null)
        {
            PizzaTrackerPhoneNumberActivity.access$000(PizzaTrackerPhoneNumberActivity.this, adapterview);
            return;
        } else
        {
            PizzaTrackerPhoneNumberActivity.access$102(PizzaTrackerPhoneNumberActivity.this, i);
            LogUtil.d("trackerByPhoneTag", "Store profile empty!", new Object[0]);
            return;
        }
    }

    ()
    {
        this$0 = PizzaTrackerPhoneNumberActivity.this;
        super();
    }
}
