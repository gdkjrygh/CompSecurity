// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.MotionEvent;

class lu extends lx
{

    lu()
    {
    }

    public final int a(MotionEvent motionevent)
    {
        return motionevent.getPointerCount();
    }

    public final int a(MotionEvent motionevent, int i)
    {
        return motionevent.findPointerIndex(i);
    }

    public final int b(MotionEvent motionevent, int i)
    {
        return motionevent.getPointerId(i);
    }

    public final float c(MotionEvent motionevent, int i)
    {
        return motionevent.getX(i);
    }

    public final float d(MotionEvent motionevent, int i)
    {
        return motionevent.getY(i);
    }
}
