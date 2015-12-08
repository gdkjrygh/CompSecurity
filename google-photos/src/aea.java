// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Handler;
import android.view.MotionEvent;
import android.view.View;
import android.widget.PopupWindow;

final class aea
    implements android.view.View.OnTouchListener
{

    private adq a;

    aea(adq adq1)
    {
        a = adq1;
        super();
    }

    public final boolean onTouch(View view, MotionEvent motionevent)
    {
        int i;
        int j;
        int k;
        i = motionevent.getAction();
        j = (int)motionevent.getX();
        k = (int)motionevent.getY();
        if (i != 0 || adq.b(a) == null || !adq.b(a).isShowing() || j < 0 || j >= adq.b(a).getWidth() || k < 0 || k >= adq.b(a).getHeight()) goto _L2; else goto _L1
_L1:
        adq.d(a).postDelayed(adq.c(a), 250L);
_L4:
        return false;
_L2:
        if (i == 1)
        {
            adq.d(a).removeCallbacks(adq.c(a));
        }
        if (true) goto _L4; else goto _L3
_L3:
    }
}
