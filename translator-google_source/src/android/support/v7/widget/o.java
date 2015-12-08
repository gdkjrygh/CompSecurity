// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.view.View;
import android.widget.PopupWindow;

// Referenced classes of package android.support.v7.widget:
//            y, AppCompatSpinner, ListPopupWindow, q

final class o extends y
{

    final q a;
    final AppCompatSpinner b;

    o(AppCompatSpinner appcompatspinner, View view, q q1)
    {
        b = appcompatspinner;
        a = q1;
        super(view);
    }

    public final ListPopupWindow a()
    {
        return a;
    }

    public final boolean b()
    {
        if (!((ListPopupWindow) (AppCompatSpinner.a(b))).c.isShowing())
        {
            AppCompatSpinner.a(b).b();
        }
        return true;
    }
}
