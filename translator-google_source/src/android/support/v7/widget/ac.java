// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.database.DataSetObserver;
import android.widget.PopupWindow;

// Referenced classes of package android.support.v7.widget:
//            ListPopupWindow

final class ac extends DataSetObserver
{

    final ListPopupWindow a;

    ac(ListPopupWindow listpopupwindow)
    {
        a = listpopupwindow;
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
        a.d();
    }
}
