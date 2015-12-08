// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.widget;

import android.os.Handler;
import android.view.MotionEvent;
import android.view.View;
import android.widget.PopupWindow;

// Referenced classes of package android.support.v7.internal.widget:
//            ListPopupWindow

private class <init>
    implements android.view.PopupTouchInterceptor
{

    final ListPopupWindow this$0;

    public boolean onTouch(View view, MotionEvent motionevent)
    {
        int i;
        int j;
        int k;
        i = motionevent.getAction();
        j = (int)motionevent.getX();
        k = (int)motionevent.getY();
        if (i != 0 || ListPopupWindow.access$800(ListPopupWindow.this) == null || !ListPopupWindow.access$800(ListPopupWindow.this).isShowing() || j < 0 || j >= ListPopupWindow.access$800(ListPopupWindow.this).getWidth() || k < 0 || k >= ListPopupWindow.access$800(ListPopupWindow.this).getHeight()) goto _L2; else goto _L1
_L1:
        ListPopupWindow.access$1000(ListPopupWindow.this).postDelayed(ListPopupWindow.access$900(ListPopupWindow.this), 250L);
_L4:
        return false;
_L2:
        if (i == 1)
        {
            ListPopupWindow.access$1000(ListPopupWindow.this).removeCallbacks(ListPopupWindow.access$900(ListPopupWindow.this));
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    private ()
    {
        this$0 = ListPopupWindow.this;
        super();
    }

    this._cls0(this._cls0 _pcls0)
    {
        this();
    }
}
