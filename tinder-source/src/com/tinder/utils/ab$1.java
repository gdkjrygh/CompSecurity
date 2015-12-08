// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.utils;

import android.view.MotionEvent;

// Referenced classes of package com.tinder.utils:
//            ab

final class b extends android.view.reDetector.SimpleOnGestureListener
{

    long a;
    long b;
    final ab c;

    public final boolean onFling(MotionEvent motionevent, MotionEvent motionevent1, float f, float f1)
    {
        if (motionevent != null)
        {
            a = motionevent.getEventTime();
        }
        if (motionevent1 != null)
        {
            b = motionevent1.getEventTime();
        }
        (new StringBuilder("Fling detected: ")).append(a).append(", end: ").append(b);
        return false;
    }

    public final boolean onSingleTapUp(MotionEvent motionevent)
    {
        long l = motionevent.getEventTime();
        if (b > -1L && l - b < 700L)
        {
            (new StringBuilder("Fling Ended: ")).append(b).append(", tap time: ").append(l).append(", diff: ").append(l - b).append(", return: false");
            return false;
        } else
        {
            (new StringBuilder("Fling Ended: ")).append(b).append(", tap time: ").append(l).append(", diff: ").append(l - b).append(", return: true");
            return true;
        }
    }

    nt(ab ab1)
    {
        c = ab1;
        super();
        a = -1L;
        b = -1L;
    }
}
