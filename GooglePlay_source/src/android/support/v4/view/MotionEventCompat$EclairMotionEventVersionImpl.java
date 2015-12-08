// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view;

import android.view.MotionEvent;

// Referenced classes of package android.support.v4.view:
//            MotionEventCompat

static class  extends 
{

    public final int findPointerIndex(MotionEvent motionevent, int i)
    {
        return motionevent.findPointerIndex(i);
    }

    public final int getPointerCount(MotionEvent motionevent)
    {
        return motionevent.getPointerCount();
    }

    public final int getPointerId(MotionEvent motionevent, int i)
    {
        return motionevent.getPointerId(i);
    }

    public final float getX(MotionEvent motionevent, int i)
    {
        return motionevent.getX(i);
    }

    public final float getY(MotionEvent motionevent, int i)
    {
        return motionevent.getY(i);
    }

    ()
    {
    }
}
