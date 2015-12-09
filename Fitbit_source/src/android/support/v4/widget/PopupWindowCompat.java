// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.widget;

import android.view.View;
import android.widget.PopupWindow;

public class PopupWindowCompat
{

    static final PopupWindowImpl IMPL;

    private PopupWindowCompat()
    {
    }

    public static void showAsDropDown(PopupWindow popupwindow, View view, int i, int j, int k)
    {
    /* block-local class not found */
    class PopupWindowImpl {}

        IMPL.showAsDropDown(popupwindow, view, i, j, k);
    }

    static 
    {
    /* block-local class not found */
    class BasePopupWindowImpl {}

    /* block-local class not found */
    class KitKatPopupWindowImpl {}

        if (android.os.Build.VERSION.SDK_INT >= 19)
        {
            IMPL = new KitKatPopupWindowImpl();
        } else
        {
            IMPL = new BasePopupWindowImpl();
        }
    }
}
