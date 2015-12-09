// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.view.View;

// Referenced classes of package android.support.v7.widget:
//            ListPopupWindow

final class a
    implements Runnable
{

    private ListPopupWindow a;

    public final void run()
    {
        View view = a.k;
        if (view != null && view.getWindowToken() != null)
        {
            a.b();
        }
    }

    (ListPopupWindow listpopupwindow)
    {
        a = listpopupwindow;
        super();
    }
}
