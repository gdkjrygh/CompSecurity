// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.widget;

import android.view.View;
import android.widget.PopupWindow;

// Referenced classes of package android.support.v4.widget:
//            PopupWindowCompat

static class 
    implements 
{

    public boolean getOverlapAnchor(PopupWindow popupwindow)
    {
        return false;
    }

    public int getWindowLayoutType(PopupWindow popupwindow)
    {
        return 0;
    }

    public void setOverlapAnchor(PopupWindow popupwindow, boolean flag)
    {
    }

    public void setWindowLayoutType(PopupWindow popupwindow, int i)
    {
    }

    public void showAsDropDown(PopupWindow popupwindow, View view, int i, int j, int k)
    {
        popupwindow.showAsDropDown(view, i, j);
    }

    ()
    {
    }
}
