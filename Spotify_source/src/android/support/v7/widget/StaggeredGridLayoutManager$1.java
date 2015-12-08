// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import aai;
import android.content.Context;
import android.graphics.PointF;

// Referenced classes of package android.support.v7.widget:
//            StaggeredGridLayoutManager

final class g extends aai
{

    private StaggeredGridLayoutManager g;

    public final PointF a(int i)
    {
        i = StaggeredGridLayoutManager.a(g, i);
        if (i == 0)
        {
            return null;
        } else
        {
            return new PointF(i, 0.0F);
        }
    }

    (StaggeredGridLayoutManager staggeredgridlayoutmanager, Context context)
    {
        g = staggeredgridlayoutmanager;
        super(context);
    }
}
