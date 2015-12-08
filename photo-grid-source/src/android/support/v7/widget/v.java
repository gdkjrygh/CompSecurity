// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.content.Context;
import android.graphics.PointF;

// Referenced classes of package android.support.v7.widget:
//            aa, LinearLayoutManager

final class v extends aa
{

    final LinearLayoutManager a;

    v(LinearLayoutManager linearlayoutmanager, Context context)
    {
        a = linearlayoutmanager;
        super(context);
    }

    public final PointF a(int i)
    {
        boolean flag = true;
        boolean flag1 = false;
        LinearLayoutManager linearlayoutmanager = a;
        if (linearlayoutmanager.r() == 0)
        {
            return null;
        }
        if (i < LinearLayoutManager.e(linearlayoutmanager.c(0)))
        {
            flag1 = true;
        }
        i = ((flag) ? 1 : 0);
        if (flag1 != linearlayoutmanager.l)
        {
            i = -1;
        }
        if (linearlayoutmanager.j == 0)
        {
            return new PointF(i, 0.0F);
        } else
        {
            return new PointF(0.0F, i);
        }
    }
}
