// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.widget;

import android.view.View;
import android.widget.PopupWindow;

// Referenced classes of package android.support.v4.widget:
//            au, at, ax, aw, 
//            av, ay

public final class as
{

    static final ay a;

    public static void a(PopupWindow popupwindow)
    {
        a.a(popupwindow);
    }

    public static void a(PopupWindow popupwindow, View view, int i, int j, int k)
    {
        a.a(popupwindow, view, i, j, k);
    }

    public static void a(PopupWindow popupwindow, boolean flag)
    {
        a.a(popupwindow, flag);
    }

    static 
    {
        int i = android.os.Build.VERSION.SDK_INT;
        if (i >= 23)
        {
            a = new au();
        } else
        if (i >= 21)
        {
            a = new at();
        } else
        if (i >= 19)
        {
            a = new ax();
        } else
        if (i >= 9)
        {
            a = new aw();
        } else
        {
            a = new av();
        }
    }
}
