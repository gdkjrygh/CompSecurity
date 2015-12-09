// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.purchaserecord;

import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;

// Referenced classes of package com.google.android.apps.wallet.purchaserecord:
//            PurchaseRecordDetailActivity, PurchaseRecordPublisher

final class this._cls0
    implements android.support.v4.view.ecordDetailActivity._cls5
{

    final PurchaseRecordDetailActivity this$0;

    public final void onPageScrollStateChanged(int i)
    {
    }

    public final void onPageScrolled(int i, float f, int j)
    {
    }

    public final void onPageSelected(int i)
    {
        if (i == PurchaseRecordDetailActivity.access$600(PurchaseRecordDetailActivity.this).getAdapter().getCount() - 2)
        {
            purchaseRecordPublisher.fetchNextPage();
        }
        PurchaseRecordDetailActivity.access$700(PurchaseRecordDetailActivity.this);
    }

    ()
    {
        this$0 = PurchaseRecordDetailActivity.this;
        super();
    }
}
