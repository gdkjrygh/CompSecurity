// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.task.view;

import android.view.View;
import com.pinterest.activity.task.animation.PagerAnimation;

// Referenced classes of package com.pinterest.activity.task.view:
//            MainViewPager

class this._cls0
    implements android.support.v4.view.r.PageTransformer
{

    final MainViewPager this$0;

    public void transformPage(View view, float f, boolean flag, int i)
    {
        if (flag)
        {
            MainViewPager.access$102(MainViewPager.this, true);
        }
        if (MainViewPager.access$400(MainViewPager.this) != null)
        {
            MainViewPager.access$400(MainViewPager.this).transformView(view, f, MainViewPager.access$100(MainViewPager.this), i);
        }
    }

    ion()
    {
        this$0 = MainViewPager.this;
        super();
    }
}
