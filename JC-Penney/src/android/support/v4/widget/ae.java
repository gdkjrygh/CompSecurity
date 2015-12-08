// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.widget;

import android.view.View;
import android.widget.PopupWindow;

// Referenced classes of package android.support.v4.widget:
//            ag, af, aj, ai, 
//            ah, ak

public class ae
{

    static final ak a;

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
            a = new ag();
        } else
        if (i >= 21)
        {
            a = new af();
        } else
        if (i >= 19)
        {
            a = new aj();
        } else
        if (i >= 9)
        {
            a = new ai();
        } else
        {
            a = new ah();
        }
    }
}
