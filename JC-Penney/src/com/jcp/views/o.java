// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.views;

import android.database.DataSetObserver;

// Referenced classes of package com.jcp.views:
//            HorizontalListView

class o extends DataSetObserver
{

    final HorizontalListView a;

    o(HorizontalListView horizontallistview)
    {
        a = horizontallistview;
        super();
    }

    public void onChanged()
    {
        synchronized (a)
        {
            HorizontalListView.a(a, true);
        }
        a.invalidate();
        a.requestLayout();
        return;
        exception;
        horizontallistview;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void onInvalidated()
    {
        HorizontalListView.a(a);
        a.invalidate();
        a.requestLayout();
    }
}
