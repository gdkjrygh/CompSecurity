// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.play.onboard;

import android.content.res.Resources;
import android.support.v4.view.ViewCompat;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.libraries.bind.bidi.BidiPagingHelper;
import com.google.android.libraries.bind.view.ViewHeap;

// Referenced classes of package com.google.android.play.onboard:
//            OnboardPagerAdapter, OnboardHostFragment, OnboardPage, OnboardPageInfo

final class nit> extends OnboardPagerAdapter
{

    final OnboardHostFragment this$0;

    public final Object instantiateItem(ViewGroup viewgroup, int i)
    {
        viewgroup = ((ViewGroup) (super.instantiateItem(viewgroup, i)));
        View view = tryGetViewAt(BidiPagingHelper.getLogicalPosition(this, i));
        if (view instanceof OnboardPage)
        {
            Object obj = (OnboardPage)view;
            ((OnboardPage) (obj)).setOnboardHostControl(OnboardHostFragment.this);
            android.os.Bundle bundle = mOnboardBundle;
            obj = ((OnboardPage) (obj)).getPageInfo();
            if (((OnboardPageInfo) (obj)).shouldAdjustPagePaddingToFitNavFooter$5669347f())
            {
                OnboardHostFragment onboardhostfragment = OnboardHostFragment.this;
                if (((OnboardPageInfo) (obj)).isNavFooterVisible$5669347f())
                {
                    i = onboardhostfragment.getResources().getDimensionPixelSize(0x7f0c030f);
                } else
                {
                    i = 0;
                }
                ViewCompat.setPaddingRelative(view, ViewCompat.getPaddingStart(view), view.getPaddingTop(), ViewCompat.getPaddingEnd(view), i);
            }
        }
        return viewgroup;
    }

    public final void onDestroyedView(View view)
    {
        super.onDestroyedView(view);
        if (view instanceof OnboardPage)
        {
            view = mOnboardBundle;
        }
    }

    r(ViewHeap viewheap)
    {
        this$0 = OnboardHostFragment.this;
        super(viewheap);
    }
}
