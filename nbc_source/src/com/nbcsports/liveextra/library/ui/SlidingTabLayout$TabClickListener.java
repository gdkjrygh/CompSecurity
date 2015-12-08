// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.library.ui;

import android.support.v4.view.ViewPager;
import android.view.View;

// Referenced classes of package com.nbcsports.liveextra.library.ui:
//            SlidingTabLayout, SlidingTabStrip

private class <init>
    implements android.view.yout.TabClickListener
{

    final SlidingTabLayout this$0;

    public void onClick(View view)
    {
        int i = 0;
        do
        {
label0:
            {
                if (i < SlidingTabLayout.access$200(SlidingTabLayout.this).getChildCount())
                {
                    if (view != SlidingTabLayout.access$200(SlidingTabLayout.this).getChildAt(i))
                    {
                        break label0;
                    }
                    SlidingTabLayout.access$500(SlidingTabLayout.this).setCurrentItem(i);
                }
                return;
            }
            i++;
        } while (true);
    }

    private ()
    {
        this$0 = SlidingTabLayout.this;
        super();
    }

    this._cls0(this._cls0 _pcls0)
    {
        this();
    }
}
