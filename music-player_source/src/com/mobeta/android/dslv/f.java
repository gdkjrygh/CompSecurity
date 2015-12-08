// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mobeta.android.dslv;

import android.database.DataSetObserver;

// Referenced classes of package com.mobeta.android.dslv:
//            DragSortListView

final class f extends DataSetObserver
{

    final DragSortListView a;

    f(DragSortListView dragsortlistview)
    {
        a = dragsortlistview;
        super();
    }

    private void a()
    {
        if (DragSortListView.d(a) == 4)
        {
            a.a();
        }
    }

    public final void onChanged()
    {
        a();
    }

    public final void onInvalidated()
    {
        a();
    }
}
