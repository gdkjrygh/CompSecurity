// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import aak;
import android.view.View;
import android.widget.PopupWindow;
import zr;

// Referenced classes of package android.support.v7.widget:
//            AppCompatSpinner, ListPopupWindow

final class a extends aak
{

    private zr a;
    private AppCompatSpinner b;

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

    (AppCompatSpinner appcompatspinner, View view, zr zr1)
    {
        b = appcompatspinner;
        a = zr1;
        super(view);
    }
}
