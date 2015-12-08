// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.os.Handler;
import android.view.MotionEvent;
import android.view.View;
import android.widget.PopupWindow;

// Referenced classes of package android.support.v7.widget:
//            ListPopupWindow

final class aq
    implements android.view.View.OnTouchListener
{

    final ListPopupWindow a;

    private aq(ListPopupWindow listpopupwindow)
    {
        a = listpopupwindow;
        super();
    }

    aq(ListPopupWindow listpopupwindow, byte byte0)
    {
        this(listpopupwindow);
    }

    public final boolean onTouch(View view, MotionEvent motionevent)
    {
        int i;
        int j;
        int k;
        i = motionevent.getAction();
        j = (int)motionevent.getX();
        k = (int)motionevent.getY();
        if (i != 0 || ListPopupWindow.b(a) == null || !ListPopupWindow.b(a).isShowing() || j < 0 || j >= ListPopupWindow.b(a).getWidth() || k < 0 || k >= ListPopupWindow.b(a).getHeight()) goto _L2; else goto _L1
_L1:
        ListPopupWindow.d(a).postDelayed(ListPopupWindow.c(a), 250L);
_L4:
        return false;
_L2:
        if (i == 1)
        {
            ListPopupWindow.d(a).removeCallbacks(ListPopupWindow.c(a));
        }
        if (true) goto _L4; else goto _L3
_L3:
    }
}
