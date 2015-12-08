// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.bv;

import android.content.Context;
import android.content.res.Resources;
import android.os.SystemClock;
import android.util.DisplayMetrics;
import android.view.MotionEvent;

// Referenced classes of package com.google.android.m4b.maps.bv:
//            o, b, ai, aj

public final class e
    implements android.view.GestureDetector.OnDoubleTapListener, android.view.GestureDetector.OnGestureListener, b.a
{

    final b a;
    final o b;
    private float c;
    private long d;
    private final float e;
    private final aj f;
    private final android.view.GestureDetector.OnGestureListener g;
    private final android.view.GestureDetector.OnDoubleTapListener h;

    public e(Context context, android.view.GestureDetector.OnGestureListener ongesturelistener, android.view.GestureDetector.OnDoubleTapListener ondoubletaplistener, aj aj1)
    {
        c = 0.0F;
        g = ongesturelistener;
        h = ondoubletaplistener;
        b = new o(context, this);
        b.k = this;
        b.w = true;
        f = aj1;
        a = new b(context, this);
        e = context.getResources().getDisplayMetrics().density;
    }

    public final boolean a(b b1)
    {
        c = c + Math.abs(b1.d - b1.e);
        return f.a(new ai(0, b1));
    }

    public final boolean b(b b1)
    {
        c = 0.0F;
        d = SystemClock.elapsedRealtime();
        return f.a(new ai(1, b1));
    }

    public final void c(b b1)
    {
        boolean flag;
        if (SystemClock.elapsedRealtime() - d < 300L && c <= 22F * e)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            f.f();
            return;
        } else
        {
            f.a(new ai(2, b1));
            return;
        }
    }

    public final boolean onDoubleTap(MotionEvent motionevent)
    {
        return h.onDoubleTap(motionevent);
    }

    public final boolean onDoubleTapEvent(MotionEvent motionevent)
    {
        return h.onDoubleTapEvent(motionevent);
    }

    public final boolean onDown(MotionEvent motionevent)
    {
        return g.onDown(motionevent);
    }

    public final boolean onFling(MotionEvent motionevent, MotionEvent motionevent1, float f1, float f2)
    {
        return g.onFling(motionevent, motionevent1, f1, f2);
    }

    public final void onLongPress(MotionEvent motionevent)
    {
        g.onLongPress(motionevent);
    }

    public final boolean onScroll(MotionEvent motionevent, MotionEvent motionevent1, float f1, float f2)
    {
        return g.onScroll(motionevent, motionevent1, f1, f2);
    }

    public final void onShowPress(MotionEvent motionevent)
    {
        g.onShowPress(motionevent);
    }

    public final boolean onSingleTapConfirmed(MotionEvent motionevent)
    {
        return h.onSingleTapConfirmed(motionevent);
    }

    public final boolean onSingleTapUp(MotionEvent motionevent)
    {
        return h.onSingleTapConfirmed(motionevent);
    }
}
