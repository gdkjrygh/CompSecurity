// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.ads;

import android.content.Context;
import android.support.v4.view.ViewPager;
import android.view.View;

// Referenced classes of package com.facebook.ads:
//            NativeAdScrollView

private class t> extends ViewPager
{

    final NativeAdScrollView a;

    protected void onMeasure(int i, int j)
    {
        j = 0;
        int k;
        int l;
        for (k = 0; j < getChildCount(); k = l)
        {
            View view = getChildAt(j);
            view.measure(i, android.view.MeasureSpec(0, 0));
            int i1 = view.getMeasuredHeight();
            l = k;
            if (i1 > k)
            {
                l = i1;
            }
            j++;
        }

        super.onMeasure(i, android.view.MeasureSpec(k, 0x40000000));
    }

    public (NativeAdScrollView nativeadscrollview, Context context)
    {
        a = nativeadscrollview;
        super(context);
    }
}
