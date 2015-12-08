// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view;

import android.view.MotionEvent;

class 
    implements 
{

    public int findPointerIndex(MotionEvent motionevent, int i)
    {
        return i != 0 ? -1 : 0;
    }

    public float getAxisValue(MotionEvent motionevent, int i)
    {
        return 0.0F;
    }

    public float getAxisValue(MotionEvent motionevent, int i, int j)
    {
        return 0.0F;
    }

    public int getPointerCount(MotionEvent motionevent)
    {
        return 1;
    }

    public int getPointerId(MotionEvent motionevent, int i)
    {
        if (i == 0)
        {
            return 0;
        } else
        {
            throw new IndexOutOfBoundsException("Pre-Eclair does not support multiple pointers");
        }
    }

    public int getSource(MotionEvent motionevent)
    {
        return 0;
    }

    public float getX(MotionEvent motionevent, int i)
    {
        if (i == 0)
        {
            return motionevent.getX();
        } else
        {
            throw new IndexOutOfBoundsException("Pre-Eclair does not support multiple pointers");
        }
    }

    public float getY(MotionEvent motionevent, int i)
    {
        if (i == 0)
        {
            return motionevent.getY();
        } else
        {
            throw new IndexOutOfBoundsException("Pre-Eclair does not support multiple pointers");
        }
    }

    ()
    {
    }
}
