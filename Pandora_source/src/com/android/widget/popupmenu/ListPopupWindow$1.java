// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.widget.popupmenu;

import android.view.View;

// Referenced classes of package com.android.widget.popupmenu:
//            ListPopupWindow

class a
    implements Runnable
{

    final ListPopupWindow a;

    public void run()
    {
        View view = a.a();
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
