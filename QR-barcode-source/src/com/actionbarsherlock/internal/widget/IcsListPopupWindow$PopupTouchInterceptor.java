// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.actionbarsherlock.internal.widget;

import android.os.Handler;
import android.view.MotionEvent;
import android.view.View;

// Referenced classes of package com.actionbarsherlock.internal.widget:
//            IcsListPopupWindow, PopupWindowCompat

private class <init>
    implements android.view.ow.PopupTouchInterceptor
{

    final IcsListPopupWindow this$0;

    public boolean onTouch(View view, MotionEvent motionevent)
    {
        int i;
        int j;
        int k;
        i = motionevent.getAction();
        j = (int)motionevent.getX();
        k = (int)motionevent.getY();
        if (i != 0 || IcsListPopupWindow.access$2(IcsListPopupWindow.this) == null || !IcsListPopupWindow.access$2(IcsListPopupWindow.this).isShowing() || j < 0 || j >= IcsListPopupWindow.access$2(IcsListPopupWindow.this).getWidth() || k < 0 || k >= IcsListPopupWindow.access$2(IcsListPopupWindow.this).getHeight()) goto _L2; else goto _L1
_L1:
        IcsListPopupWindow.access$3(IcsListPopupWindow.this).postDelayed(IcsListPopupWindow.access$4(IcsListPopupWindow.this), 250L);
_L4:
        return false;
_L2:
        if (i == 1)
        {
            IcsListPopupWindow.access$3(IcsListPopupWindow.this).removeCallbacks(IcsListPopupWindow.access$4(IcsListPopupWindow.this));
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    private ()
    {
        this$0 = IcsListPopupWindow.this;
        super();
    }

    this._cls0(this._cls0 _pcls0)
    {
        this();
    }
}
