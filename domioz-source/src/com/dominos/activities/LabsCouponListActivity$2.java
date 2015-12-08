// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.activities;

import android.view.View;
import android.widget.AdapterView;
import com.dominos.adapters.LabsCouponListAdapter;

// Referenced classes of package com.dominos.activities:
//            LabsCouponListActivity

class this._cls0
    implements android.widget.stener
{

    final LabsCouponListActivity this$0;

    public void onItemClick(AdapterView adapterview, View view, int i, long l)
    {
        adapterview = couponListAdapter.getItem(i);
        selectCoupon(adapterview);
    }

    ()
    {
        this$0 = LabsCouponListActivity.this;
        super();
    }
}
