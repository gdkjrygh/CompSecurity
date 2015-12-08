// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.os.Handler;
import android.view.MotionEvent;
import android.view.View;
import android.widget.PopupWindow;

// Referenced classes of package android.support.v7.widget:
//            j

private final class <init>
    implements android.view..OnTouchListener
{

    final j a;

    public final boolean onTouch(View view, MotionEvent motionevent)
    {
        int i;
        int k;
        int l;
        i = motionevent.getAction();
        k = (int)motionevent.getX();
        l = (int)motionevent.getY();
        if (i != 0 || j.b(a) == null || !j.b(a).isShowing() || k < 0 || k >= j.b(a).getWidth() || l < 0 || l >= j.b(a).getHeight()) goto _L2; else goto _L1
_L1:
        j.d(a).postDelayed(j.c(a), 250L);
_L4:
        return false;
_L2:
        if (i == 1)
        {
            j.d(a).removeCallbacks(j.c(a));
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    private ner(j j1)
    {
        a = j1;
        super();
    }

    a(j j1, byte byte0)
    {
        this(j1);
    }
}
