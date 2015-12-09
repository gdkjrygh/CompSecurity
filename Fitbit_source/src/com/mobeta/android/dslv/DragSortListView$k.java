// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mobeta.android.dslv;

import android.graphics.Point;

// Referenced classes of package com.mobeta.android.dslv:
//            DragSortListView

private class <init> extends <init>
{

    final DragSortListView a;
    private float d;
    private float e;

    public void a()
    {
        d = DragSortListView.c(a);
        e = DragSortListView.d(a);
    }

    public void a(float f, float f1)
    {
        if (DragSortListView.b(a) != 4)
        {
            d();
            return;
        } else
        {
            DragSortListView.a(a, (int)(e * f1 + (1.0F - f1) * d));
            DragSortListView.e(a).y = DragSortListView.f(a) - DragSortListView.c(a);
            DragSortListView.a(a, true);
            return;
        }
    }

    public (DragSortListView dragsortlistview, float f, int i)
    {
        a = dragsortlistview;
        super(dragsortlistview, f, i);
    }
}
