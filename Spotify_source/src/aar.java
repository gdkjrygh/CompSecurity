// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.support.v7.widget.ListPopupWindow;
import android.widget.PopupWindow;

public final class aar
    implements Runnable
{

    private ListPopupWindow a;

    private aar(ListPopupWindow listpopupwindow)
    {
        a = listpopupwindow;
        super();
    }

    public aar(ListPopupWindow listpopupwindow, byte byte0)
    {
        this(listpopupwindow);
    }

    public final void run()
    {
        if (ListPopupWindow.a(a) != null && km.C(ListPopupWindow.a(a)) && ListPopupWindow.a(a).getCount() > ListPopupWindow.a(a).getChildCount() && ListPopupWindow.a(a).getChildCount() <= a.j)
        {
            ListPopupWindow.b(a).setInputMethodMode(2);
            a.b();
        }
    }
}
