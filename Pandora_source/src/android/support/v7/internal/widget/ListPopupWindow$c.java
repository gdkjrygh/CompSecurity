// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.widget;

import android.database.DataSetObserver;

// Referenced classes of package android.support.v7.internal.widget:
//            ListPopupWindow

private class <init> extends DataSetObserver
{

    final ListPopupWindow a;

    public void onChanged()
    {
        if (a.f())
        {
            a.c();
        }
    }

    public void onInvalidated()
    {
        a.d();
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
