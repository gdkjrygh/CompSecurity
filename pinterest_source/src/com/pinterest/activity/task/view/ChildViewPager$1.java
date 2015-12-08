// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.task.view;

import android.support.v4.app.BetterFragmentStatePagerAdapter;
import android.support.v4.app.Fragment;
import com.pinterest.activity.task.fragment.BaseFragment;
import com.pinterest.analytics.Pinalytics;
import java.util.List;

// Referenced classes of package com.pinterest.activity.task.view:
//            ChildViewPager

class this._cls0
    implements android.support.v4.view..OnPageChangeListener
{

    final ChildViewPager this$0;

    public void onPageScrollStateChanged(int i)
    {
        i;
        JVM INSTR tableswitch 0 1: default 24
    //                   0 54
    //                   1 48;
           goto _L1 _L2 _L3
_L1:
        if (ChildViewPager.access$000(ChildViewPager.this) != null)
        {
            ChildViewPager.access$000(ChildViewPager.this).onPageScrollStateChanged(i);
        }
        return;
_L3:
        Pinalytics.e();
        continue; /* Loop/switch isn't completed */
_L2:
        ChildViewPager.access$102(ChildViewPager.this, false);
        if (true) goto _L1; else goto _L4
_L4:
    }

    public void onPageScrolled(int i, float f, int j)
    {
        if (ChildViewPager.access$000(ChildViewPager.this) != null)
        {
            ChildViewPager.access$000(ChildViewPager.this).onPageScrolled(i, f, j);
        }
    }

    public void onPageSelected(int i)
    {
        if (ChildViewPager.access$100(ChildViewPager.this))
        {
            Pinalytics.f();
        }
        Object obj = getAdapter().getFragments();
        for (int j = 0; j < ((List) (obj)).size(); j++)
        {
            Fragment fragment = (Fragment)((List) (obj)).get(j);
            if ((fragment instanceof BaseFragment) && i != j)
            {
                ((BaseFragment)fragment).setActive(false);
            }
        }

        if (i < ((List) (obj)).size())
        {
            obj = (Fragment)((List) (obj)).get(i);
            if (obj instanceof BaseFragment)
            {
                ((BaseFragment)obj).setActive(true);
            }
            if (ChildViewPager.access$000(ChildViewPager.this) != null)
            {
                ChildViewPager.access$000(ChildViewPager.this).onPageSelected(i);
                return;
            }
        }
    }

    pter()
    {
        this$0 = ChildViewPager.this;
        super();
    }
}
