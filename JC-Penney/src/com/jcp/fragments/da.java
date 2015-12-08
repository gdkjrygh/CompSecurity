// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.fragments;

import android.view.View;
import com.jcp.views.ScrollViewWithStopMonitor;
import com.jcp.widget.BackToTopButton;

// Referenced classes of package com.jcp.fragments:
//            ProductDetailFragment

class da
    implements android.view.ViewTreeObserver.OnScrollChangedListener
{

    final ProductDetailFragment a;

    da(ProductDetailFragment productdetailfragment)
    {
        a = productdetailfragment;
        super();
    }

    public void onScrollChanged()
    {
        if (!ProductDetailFragment.a(a))
        {
            int i = a.mProductDetailsScrollView.getChildAt(a.mProductDetailsScrollView.getChildCount() - 1).getBottom();
            boolean flag;
            if (i - (a.mProductDetailsScrollView.getHeight() + a.mProductDetailsScrollView.getScrollY()) <= 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (!ProductDetailFragment.a(a) && flag)
            {
                ProductDetailFragment.a(a, true);
                ProductDetailFragment.b(a);
                if (i > 0 && !a.mBackToTopButton.b())
                {
                    a.mBackToTopButton.setTriggerHeight(i);
                    return;
                }
            }
        }
    }
}
