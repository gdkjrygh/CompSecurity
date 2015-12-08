// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.wearable.view;

import android.graphics.Point;

// Referenced classes of package android.support.wearable.view:
//            GridViewPager, GridPagerAdapter

class this._cls0
    implements Runnable
{

    final GridViewPager this$0;

    public void run()
    {
        if (GridViewPager.access$300(GridViewPager.this) != null && GridViewPager.access$400(GridViewPager.this) != null)
        {
            GridViewPager.access$300(GridViewPager.this).setPrimaryItem(GridViewPager.this, GridViewPager.access$400(GridViewPager.this).x, GridViewPager.access$400(GridViewPager.this).y);
        }
    }

    ()
    {
        this$0 = GridViewPager.this;
        super();
    }
}
