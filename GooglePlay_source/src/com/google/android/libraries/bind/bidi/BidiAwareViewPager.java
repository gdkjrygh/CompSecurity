// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.bind.bidi;

import android.content.Context;
import android.support.v4.view.ViewPager;
import android.support.v4.view.ViewPagerShim;
import android.util.AttributeSet;

// Referenced classes of package com.google.android.libraries.bind.bidi:
//            BidiPagingHelper, BidiAwarePagerAdapter

public class BidiAwareViewPager extends ViewPagerShim
{

    public BidiAwareViewPager(Context context)
    {
        super(context);
    }

    public BidiAwareViewPager(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
    }

    public final int getCurrentLogicalItem()
    {
        return BidiPagingHelper.getLogicalPosition(super.mAdapter, super.mCurItem);
    }

    public final boolean isRtl()
    {
        return android.os.Build.VERSION.SDK_INT >= 18 && getLayoutDirection() == 1;
    }

    public void onRtlPropertiesChanged(int i)
    {
        boolean flag = true;
        super.onRtlPropertiesChanged(i);
        int j = getCurrentLogicalItem();
        if (super.mAdapter instanceof BidiAwarePagerAdapter)
        {
            BidiAwarePagerAdapter bidiawarepageradapter = (BidiAwarePagerAdapter)super.mAdapter;
            if (i != 1)
            {
                flag = false;
            }
            bidiawarepageradapter.setRtl(flag);
        }
        setCurrentItem(BidiPagingHelper.getVisualPosition(super.mAdapter, j));
    }
}
