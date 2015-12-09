// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.widget;

import android.widget.PopupWindow;

// Referenced classes of package android.support.v7.internal.widget:
//            ListPopupWindow

private class <init>
    implements Runnable
{

    final ListPopupWindow a;

    public void run()
    {
        if (ListPopupWindow.a(a) != null && ListPopupWindow.a(a).getCount() > ListPopupWindow.a(a).getChildCount() && ListPopupWindow.a(a).getChildCount() <= a.a)
        {
            ListPopupWindow.b(a).setInputMethodMode(2);
            a.c();
        }
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
