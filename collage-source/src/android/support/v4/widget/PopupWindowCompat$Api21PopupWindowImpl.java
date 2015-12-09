// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.widget;

import android.widget.PopupWindow;

// Referenced classes of package android.support.v4.widget:
//            PopupWindowCompat, PopupWindowCompatApi21

static class  extends 
{

    public boolean getOverlapAnchor(PopupWindow popupwindow)
    {
        return PopupWindowCompatApi21.getOverlapAnchor(popupwindow);
    }

    public void setOverlapAnchor(PopupWindow popupwindow, boolean flag)
    {
        PopupWindowCompatApi21.setOverlapAnchor(popupwindow, flag);
    }

    ()
    {
    }
}
