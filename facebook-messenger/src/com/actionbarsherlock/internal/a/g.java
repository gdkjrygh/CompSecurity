// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.actionbarsherlock.internal.a;

import android.os.Handler;
import android.view.MotionEvent;
import android.view.View;
import android.widget.PopupWindow;

// Referenced classes of package com.actionbarsherlock.internal.a:
//            a, b

class g
    implements android.view.View.OnTouchListener
{

    final a a;

    private g(a a1)
    {
        a = a1;
        super();
    }

    g(a a1, b b)
    {
        this(a1);
    }

    public boolean onTouch(View view, MotionEvent motionevent)
    {
        int i;
        int j;
        int k;
        i = motionevent.getAction();
        j = (int)motionevent.getX();
        k = (int)motionevent.getY();
        if (i != 0 || com.actionbarsherlock.internal.a.a.c(a) == null || !com.actionbarsherlock.internal.a.a.c(a).isShowing() || j < 0 || j >= com.actionbarsherlock.internal.a.a.c(a).getWidth() || k < 0 || k >= com.actionbarsherlock.internal.a.a.c(a).getHeight()) goto _L2; else goto _L1
_L1:
        com.actionbarsherlock.internal.a.a.e(a).postDelayed(com.actionbarsherlock.internal.a.a.d(a), 250L);
_L4:
        return false;
_L2:
        if (i == 1)
        {
            com.actionbarsherlock.internal.a.a.e(a).removeCallbacks(com.actionbarsherlock.internal.a.a.d(a));
        }
        if (true) goto _L4; else goto _L3
_L3:
    }
}
