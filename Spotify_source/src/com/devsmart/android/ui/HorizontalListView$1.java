// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.devsmart.android.ui;

import android.database.DataSetObserver;

// Referenced classes of package com.devsmart.android.ui:
//            HorizontalListView

final class a extends DataSetObserver
{

    private HorizontalListView a;

    public final void onChanged()
    {
        synchronized (a)
        {
            HorizontalListView.a(a);
        }
        a.invalidate();
        a.requestLayout();
        return;
        exception;
        horizontallistview;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final void onInvalidated()
    {
        HorizontalListView.b(a);
        a.invalidate();
        a.requestLayout();
    }

    (HorizontalListView horizontallistview)
    {
        a = horizontallistview;
        super();
    }
}
