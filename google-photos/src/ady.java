// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.database.DataSetObserver;
import android.widget.PopupWindow;

final class ady extends DataSetObserver
{

    private adq a;

    ady(adq adq1)
    {
        a = adq1;
        super();
    }

    public final void onChanged()
    {
        if (a.c.isShowing())
        {
            a.b();
        }
    }

    public final void onInvalidated()
    {
        a.c();
    }
}
