// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.database.DataSetObserver;
import android.support.v7.widget.ListPopupWindow;
import android.widget.PopupWindow;

public final class aao extends DataSetObserver
{

    private ListPopupWindow a;

    private aao(ListPopupWindow listpopupwindow)
    {
        a = listpopupwindow;
        super();
    }

    public aao(ListPopupWindow listpopupwindow, byte byte0)
    {
        this(listpopupwindow);
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
        a.dismiss();
    }
}
