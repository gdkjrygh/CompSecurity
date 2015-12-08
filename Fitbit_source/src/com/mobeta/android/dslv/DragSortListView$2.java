// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mobeta.android.dslv;

import android.database.DataSetObserver;

// Referenced classes of package com.mobeta.android.dslv:
//            DragSortListView

class a extends DataSetObserver
{

    final DragSortListView a;

    private void a()
    {
        if (DragSortListView.b(a) == 4)
        {
            a.c();
        }
    }

    public void onChanged()
    {
        a();
    }

    public void onInvalidated()
    {
        a();
    }

    (DragSortListView dragsortlistview)
    {
        a = dragsortlistview;
        super();
    }
}
