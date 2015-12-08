// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.widget.popupmenu;

import android.database.DataSetObserver;

// Referenced classes of package com.android.widget.popupmenu:
//            ListPopupWindow

private class <init> extends DataSetObserver
{

    final ListPopupWindow a;

    public void onChanged()
    {
        if (a.e())
        {
            a.b();
        }
    }

    public void onInvalidated()
    {
        a.c();
    }

    private (ListPopupWindow listpopupwindow)
    {
        a = listpopupwindow;
        super();
    }

    a(ListPopupWindow listpopupwindow, a a1)
    {
        this(listpopupwindow);
    }
}
