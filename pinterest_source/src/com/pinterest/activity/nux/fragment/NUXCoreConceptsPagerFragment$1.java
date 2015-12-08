// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.nux.fragment;

import android.support.v4.app.FixedFragmentStatePagerAdapter;
import android.support.v4.view.ModifiedViewPager;
import android.view.View;
import android.view.ViewTreeObserver;

// Referenced classes of package com.pinterest.activity.nux.fragment:
//            NUXCoreConceptsPagerFragment, NUXCoreConceptsBaseFragment

class val.v
    implements android.view.Listener
{

    final NUXCoreConceptsPagerFragment this$0;
    final View val$v;

    public void onGlobalLayout()
    {
        val$v.getViewTreeObserver().removeGlobalOnLayoutListener(this);
        NUXCoreConceptsPagerFragment.access$000(NUXCoreConceptsPagerFragment.this).setCurrentItem(0);
        NUXCoreConceptsPagerFragment.access$200(NUXCoreConceptsPagerFragment.this).setOnPageChangeListener(NUXCoreConceptsPagerFragment.access$100(NUXCoreConceptsPagerFragment.this));
        NUXCoreConceptsPagerFragment.access$300(NUXCoreConceptsPagerFragment.this, 0);
        ((NUXCoreConceptsBaseFragment)NUXCoreConceptsPagerFragment.access$400(NUXCoreConceptsPagerFragment.this).getItem(0)).applyAnimation();
    }

    ()
    {
        this$0 = final_nuxcoreconceptspagerfragment;
        val$v = View.this;
        super();
    }
}
