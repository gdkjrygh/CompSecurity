// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.database.DataSetObserver;

// Referenced classes of package android.support.v7.widget:
//            ListPopupWindow

final class ao extends DataSetObserver
{

    final ListPopupWindow a;

    private ao(ListPopupWindow listpopupwindow)
    {
        a = listpopupwindow;
        super();
    }

    ao(ListPopupWindow listpopupwindow, byte byte0)
    {
        this(listpopupwindow);
    }

    public final void onChanged()
    {
        if (a.b())
        {
            a.c();
        }
    }

    public final void onInvalidated()
    {
        a.a();
    }
}
