// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.taplytics;

import android.view.MotionEvent;

// Referenced classes of package com.taplytics:
//            au

final class at
    implements au
{

    at()
    {
    }

    public final int a(MotionEvent motionevent)
    {
        return motionevent.getPointerCount();
    }

    public final int a(MotionEvent motionevent, int i)
    {
        return motionevent.getPointerId(i);
    }

    public final float b(MotionEvent motionevent, int i)
    {
        return motionevent.getX(i);
    }

    public final float c(MotionEvent motionevent, int i)
    {
        return motionevent.getY(i);
    }
}
