// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.content.Context;
import android.graphics.PointF;
import bG;

// Referenced classes of package android.support.v7.widget:
//            LinearLayoutManager

final class g extends bG
{

    private LinearLayoutManager g;

    public final PointF a(int i)
    {
        boolean flag = true;
        boolean flag1 = false;
        LinearLayoutManager linearlayoutmanager = g;
        if (linearlayoutmanager.s() == 0)
        {
            return null;
        }
        if (i < LinearLayoutManager.a(linearlayoutmanager.e(0)))
        {
            flag1 = true;
        }
        i = ((flag) ? 1 : 0);
        if (flag1 != linearlayoutmanager.e)
        {
            i = -1;
        }
        if (linearlayoutmanager.c == 0)
        {
            return new PointF(i, 0.0F);
        } else
        {
            return new PointF(0.0F, i);
        }
    }

    (LinearLayoutManager linearlayoutmanager, Context context)
    {
        g = linearlayoutmanager;
        super(context);
    }
}
