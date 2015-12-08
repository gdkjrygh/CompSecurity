// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mobeta.android.dslv;


// Referenced classes of package com.mobeta.android.dslv:
//            j, DragSortListView

final class e
    implements j
{

    final DragSortListView a;

    e(DragSortListView dragsortlistview)
    {
        a = dragsortlistview;
        super();
    }

    public final float a(float f)
    {
        return DragSortListView.a(a) * f;
    }
}
