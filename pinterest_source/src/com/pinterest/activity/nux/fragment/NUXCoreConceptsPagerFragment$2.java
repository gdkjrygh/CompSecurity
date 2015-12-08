// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.nux.fragment;

import android.animation.ObjectAnimator;
import android.support.v4.app.FixedFragmentStatePagerAdapter;
import android.widget.LinearLayout;

// Referenced classes of package com.pinterest.activity.nux.fragment:
//            NUXCoreConceptsPagerFragment, NUXCoreConceptsBaseFragment

class this._cls0
    implements android.support.v4.view.istener
{

    final NUXCoreConceptsPagerFragment this$0;

    public void onPageScrollStateChanged(int i)
    {
    }

    public void onPageScrolled(int i, float f, int j)
    {
    }

    public void onPageSelected(int i)
    {
        NUXCoreConceptsPagerFragment.access$300(NUXCoreConceptsPagerFragment.this, i);
        if (i > NUXCoreConceptsPagerFragment.access$500(NUXCoreConceptsPagerFragment.this))
        {
            ((NUXCoreConceptsBaseFragment)NUXCoreConceptsPagerFragment.access$600(NUXCoreConceptsPagerFragment.this).getItem(i)).applyAnimation();
            NUXCoreConceptsPagerFragment.access$502(NUXCoreConceptsPagerFragment.this, i);
        }
        if (i == 3)
        {
            NUXCoreConceptsPagerFragment.access$700(NUXCoreConceptsPagerFragment.this, _progressDots, 1.0F, 0.0F).start();
        }
        if (i == 2 && _progressDots.getAlpha() != 1.0F)
        {
            NUXCoreConceptsPagerFragment.access$700(NUXCoreConceptsPagerFragment.this, _progressDots, 0.0F, 1.0F).start();
        }
    }

    ()
    {
        this$0 = NUXCoreConceptsPagerFragment.this;
        super();
    }
}
