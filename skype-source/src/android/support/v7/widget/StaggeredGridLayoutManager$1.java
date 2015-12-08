// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.content.Context;
import android.graphics.PointF;

// Referenced classes of package android.support.v7.widget:
//            i, StaggeredGridLayoutManager

final class a extends i
{

    final StaggeredGridLayoutManager a;

    public final PointF a(int j)
    {
        j = StaggeredGridLayoutManager.a(a, j);
        if (j == 0)
        {
            return null;
        }
        if (StaggeredGridLayoutManager.a(a) == 0)
        {
            return new PointF(j, 0.0F);
        } else
        {
            return new PointF(0.0F, j);
        }
    }

    (StaggeredGridLayoutManager staggeredgridlayoutmanager, Context context)
    {
        a = staggeredgridlayoutmanager;
        super(context);
    }
}
