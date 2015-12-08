// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.content.Context;
import android.graphics.PointF;

// Referenced classes of package android.support.v7.widget:
//            LinearSmoothScroller, StaggeredGridLayoutManager

class a extends LinearSmoothScroller
{

    final StaggeredGridLayoutManager a;

    public PointF a(int i)
    {
        i = StaggeredGridLayoutManager.a(a, i);
        if (i == 0)
        {
            return null;
        }
        if (StaggeredGridLayoutManager.a(a) == 0)
        {
            return new PointF(i, 0.0F);
        } else
        {
            return new PointF(0.0F, i);
        }
    }

    (StaggeredGridLayoutManager staggeredgridlayoutmanager, Context context)
    {
        a = staggeredgridlayoutmanager;
        super(context);
    }
}
