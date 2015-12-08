// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.task.view;

import android.support.v4.app.Fragment;
import com.pinterest.activity.task.adapter.MainViewAdapter;
import com.pinterest.analytics.Pinalytics;
import com.pinterest.base.Colors;
import com.pinterest.base.Events;
import java.util.List;

// Referenced classes of package com.pinterest.activity.task.view:
//            MainViewPager

class this._cls0
    implements android.support.v4.view.r.OnPageChangeListener
{

    final MainViewPager this$0;

    public void onPageScrollStateChanged(int i)
    {
        Events.post(new geStateEvent(i));
        i;
        JVM INSTR tableswitch 0 1: default 36
    //                   0 142
    //                   1 136;
           goto _L1 _L2 _L3
_L2:
        break MISSING_BLOCK_LABEL_142;
_L1:
        setBackgroundColor(Colors.BLACK);
_L4:
        java.util.ArrayList arraylist = getAdapter().getFragments();
        int j = getAdapter().getCount();
        int k = arraylist.size();
        if (j > k)
        {
            j = k;
        }
        MainViewPager.access$402(MainViewPager.this, getAnimation((Fragment)arraylist.get(j - 1)));
        if (MainViewPager.access$000(MainViewPager.this) != null)
        {
            MainViewPager.access$000(MainViewPager.this).onPageScrollStateChanged(i);
        }
        return;
_L3:
        Pinalytics.e();
          goto _L1
        setBackgroundColor(Colors.TRANSPARENT);
        MainViewPager.access$102(MainViewPager.this, false);
        if (MainViewPager.access$200(MainViewPager.this))
        {
            MainViewPager.access$202(MainViewPager.this, false);
            getAdapter().trim(MainViewPager.access$300(MainViewPager.this));
        }
          goto _L4
    }

    public void onPageScrolled(int i, float f, int j)
    {
        if (MainViewPager.access$000(MainViewPager.this) != null)
        {
            MainViewPager.access$000(MainViewPager.this).onPageScrolled(i, f, j);
        }
    }

    public void onPageSelected(final int position)
    {
        if (MainViewPager.access$100(MainViewPager.this))
        {
            Pinalytics.f();
        }
        MainViewPager.access$202(MainViewPager.this, true);
        MainViewPager.access$302(MainViewPager.this, position);
        if (getAdapter().getFragments().size() == 0)
        {
            class _cls1
                implements Runnable
            {

                final MainViewPager._cls1 this$1;
                final int val$position;

                public void run()
                {
                    handlePageSelected(position);
                }

            _cls1()
            {
                this$1 = MainViewPager._cls1.this;
                position = i;
                super();
            }
            }

            postDelayed(new _cls1(), 100L);
            return;
        } else
        {
            handlePageSelected(position);
            return;
        }
    }

    _cls1()
    {
        this$0 = MainViewPager.this;
        super();
    }
}
