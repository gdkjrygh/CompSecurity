// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.activities;

import android.view.View;
import android.widget.AdapterView;
import com.dominos.adapters.LabsCouponListAdapter;
import com.dominos.adapters.LabsCouponSpinnerAdapter;
import com.dominos.android.sdk.core.coupon.CouponWizardManager;
import com.dominos.android.sdk.core.store.MenuManager;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.dominos.activities:
//            LabsCouponListActivity

class this._cls0
    implements android.widget.dListener
{

    final LabsCouponListActivity this$0;

    public void onItemSelected(AdapterView adapterview, View view, int i, long l)
    {
        view = couponSpinnerAdapter.getCouponsInCategory(i);
        adapterview = new ArrayList();
        view = view.iterator();
        do
        {
            if (!view.hasNext())
            {
                break;
            }
            String s = (String)view.next();
            if (mCouponWizardManager.isCouponDayValid(mMenuManager.getCoupon(s)))
            {
                adapterview.add(mMenuManager.getCoupon(s));
            }
        } while (true);
        mCouponWizardManager.setDisplayedCouponList(adapterview);
        couponListAdapter.setCouponList(adapterview);
        couponListAdapter.notifyDataSetChanged();
    }

    public void onNothingSelected(AdapterView adapterview)
    {
    }

    Manager()
    {
        this$0 = LabsCouponListActivity.this;
        super();
    }
}
