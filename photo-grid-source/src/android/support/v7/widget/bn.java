// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.content.Context;
import android.graphics.PointF;

// Referenced classes of package android.support.v7.widget:
//            aa, StaggeredGridLayoutManager

final class bn extends aa
{

    final StaggeredGridLayoutManager a;

    bn(StaggeredGridLayoutManager staggeredgridlayoutmanager, Context context)
    {
        a = staggeredgridlayoutmanager;
        super(context);
    }

    public final PointF a(int i)
    {
        i = StaggeredGridLayoutManager.a(a, i);
        if (i == 0)
        {
            return null;
        }
        if (StaggeredGridLayoutManager.b(a) == 0)
        {
            return new PointF(i, 0.0F);
        } else
        {
            return new PointF(0.0F, i);
        }
    }
}
