// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.content.Context;
import android.graphics.PointF;

// Referenced classes of package android.support.v7.widget:
//            i, LinearLayoutManager

final class a extends i
{

    final LinearLayoutManager a;

    public final PointF a(int j)
    {
        return a.computeScrollVectorForPosition(j);
    }

    (LinearLayoutManager linearlayoutmanager, Context context)
    {
        a = linearlayoutmanager;
        super(context);
    }
}
