// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.widget;

import android.view.View;
import android.widget.PopupWindow;

// Referenced classes of package android.support.v4.widget:
//            PopupWindowCompat

static interface A
{

    public abstract boolean getOverlapAnchor(PopupWindow popupwindow);

    public abstract int getWindowLayoutType(PopupWindow popupwindow);

    public abstract void setOverlapAnchor(PopupWindow popupwindow, boolean flag);

    public abstract void setWindowLayoutType(PopupWindow popupwindow, int i);

    public abstract void showAsDropDown(PopupWindow popupwindow, View view, int i, int j, int k);
}
