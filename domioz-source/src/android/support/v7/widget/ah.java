// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.view.View;

// Referenced classes of package android.support.v7.widget:
//            ListPopupWindow

final class ah
    implements Runnable
{

    final ListPopupWindow a;

    ah(ListPopupWindow listpopupwindow)
    {
        a = listpopupwindow;
        super();
    }

    public final void run()
    {
        View view = a.f();
        if (view != null && view.getWindowToken() != null)
        {
            a.c();
        }
    }
}
