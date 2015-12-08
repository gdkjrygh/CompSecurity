// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mobeta.android.dslv;

import android.graphics.Point;

// Referenced classes of package com.mobeta.android.dslv:
//            t, DragSortListView

final class q extends t
{

    final DragSortListView a;
    private float d;
    private float e;

    public final void a()
    {
        d = DragSortListView.b(a);
        e = DragSortListView.c(a);
    }

    public final void a(float f)
    {
        if (DragSortListView.d(a) != 4)
        {
            d();
            return;
        } else
        {
            DragSortListView.a(a, (int)(e * f + (1.0F - f) * d));
            DragSortListView.e(a).y = DragSortListView.f(a) - DragSortListView.b(a);
            DragSortListView.g(a);
            return;
        }
    }
}
