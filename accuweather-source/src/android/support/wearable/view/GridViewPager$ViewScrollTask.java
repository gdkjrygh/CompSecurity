// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.wearable.view;

import android.widget.OverScroller;

// Referenced classes of package android.support.wearable.view:
//            GridViewPager

private class <init>
    implements Runnable
{

    final GridViewPager this$0;

    public void run()
    {
        boolean flag = GridViewPager.access$800(GridViewPager.this).computeScrollOffset();
        GridViewPager.access$900(GridViewPager.this, GridViewPager.access$800(GridViewPager.this).getCurrX(), GridViewPager.access$800(GridViewPager.this).getCurrY());
        GridViewPager.access$1000(GridViewPager.this, false);
        GridViewPager.access$1100(GridViewPager.this);
        if (flag)
        {
            postOnAnimation(this);
            return;
        } else
        {
            onScrollAnimationEnd();
            return;
        }
    }

    private ()
    {
        this$0 = GridViewPager.this;
        super();
    }

    this._cls0(this._cls0 _pcls0)
    {
        this();
    }
}
