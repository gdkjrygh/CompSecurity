// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import aai;
import android.content.Context;
import android.graphics.PointF;

// Referenced classes of package android.support.v7.widget:
//            LinearLayoutManager

final class g extends aai
{

    private LinearLayoutManager g;

    public final PointF a(int i)
    {
        boolean flag = true;
        boolean flag1 = false;
        LinearLayoutManager linearlayoutmanager = g;
        if (linearlayoutmanager.p() == 0)
        {
            return null;
        }
        if (i < LinearLayoutManager.b(linearlayoutmanager.d(0)))
        {
            flag1 = true;
        }
        i = ((flag) ? 1 : 0);
        if (flag1 != linearlayoutmanager.h)
        {
            i = -1;
        }
        if (linearlayoutmanager.f == 0)
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
