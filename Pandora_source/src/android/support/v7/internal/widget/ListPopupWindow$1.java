// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.widget;

import android.view.View;

// Referenced classes of package android.support.v7.internal.widget:
//            ListPopupWindow

class a
    implements Runnable
{

    final ListPopupWindow a;

    public void run()
    {
        View view = a.b();
        if (view != null && view.getWindowToken() != null)
        {
            a.c();
        }
    }

    (ListPopupWindow listpopupwindow)
    {
        a = listpopupwindow;
        super();
    }
}
