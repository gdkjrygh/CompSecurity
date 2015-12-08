// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.widget;

import android.widget.PopupWindow;

// Referenced classes of package android.support.v4.widget:
//            PopupWindowCompat, PopupWindowCompatApi23

static class  extends 
{

    public boolean getOverlapAnchor(PopupWindow popupwindow)
    {
        return PopupWindowCompatApi23.getOverlapAnchor(popupwindow);
    }

    public int getWindowLayoutType(PopupWindow popupwindow)
    {
        return PopupWindowCompatApi23.getWindowLayoutType(popupwindow);
    }

    public void setOverlapAnchor(PopupWindow popupwindow, boolean flag)
    {
        PopupWindowCompatApi23.setOverlapAnchor(popupwindow, flag);
    }

    public void setWindowLayoutType(PopupWindow popupwindow, int i)
    {
        PopupWindowCompatApi23.setWindowLayoutType(popupwindow, i);
    }

    ()
    {
    }
}
