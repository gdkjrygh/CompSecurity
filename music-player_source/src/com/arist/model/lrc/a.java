// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.arist.model.lrc;

import android.graphics.Rect;
import android.os.Handler;
import android.view.MotionEvent;

// Referenced classes of package com.arist.model.lrc:
//            b, c, d, DeskLrcView

public final class a
{

    public boolean a;
    private DeskLrcView b;
    private Handler c;
    private Rect d;
    private int e;
    private int f;
    private d g;
    private Runnable h;
    private Runnable i;

    public a(DeskLrcView desklrcview)
    {
        a = false;
        h = new b(this);
        i = new c(this);
        b = desklrcview;
        c = new Handler();
        d = new Rect();
    }

    static DeskLrcView a(a a1)
    {
        return a1.b;
    }

    static Handler b(a a1)
    {
        return a1.c;
    }

    static Runnable c(a a1)
    {
        return a1.i;
    }

    public final void a(Rect rect)
    {
        d.set(rect);
    }

    public final void a(d d1)
    {
        g = d1;
    }

    public final boolean a(MotionEvent motionevent)
    {
        if (a)
        {
            c.removeCallbacks(i);
            c.postDelayed(i, 3000L);
        }
        motionevent.getAction();
        JVM INSTR tableswitch 0 2: default 64
    //                   0 66
    //                   1 173
    //                   2 128;
           goto _L1 _L2 _L3 _L4
_L1:
        return true;
_L2:
        e = (int)motionevent.getX();
        f = (int)motionevent.getY();
        if (a && d.contains(e, f) && g != null)
        {
            g.a();
        }
        continue; /* Loop/switch isn't completed */
_L4:
        if (a)
        {
            int j = (int)(motionevent.getY() - (float)f);
            if (g != null || j > 10)
            {
                g.a(j);
            }
        }
        continue; /* Loop/switch isn't completed */
_L3:
        if (!a)
        {
            c.post(h);
        }
        if (true) goto _L1; else goto _L5
_L5:
    }
}
