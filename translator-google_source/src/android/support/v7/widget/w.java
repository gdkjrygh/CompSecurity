// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.view.View;

// Referenced classes of package android.support.v7.widget:
//            ListPopupWindow

final class w
    implements Runnable
{

    final ListPopupWindow a;

    w(ListPopupWindow listpopupwindow)
    {
        a = listpopupwindow;
        super();
    }

    public final void run()
    {
        View view = a.l;
        if (view != null && view.getWindowToken() != null)
        {
            a.b();
        }
    }
}
