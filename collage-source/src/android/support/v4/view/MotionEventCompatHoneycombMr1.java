// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view;

import android.view.MotionEvent;

class MotionEventCompatHoneycombMr1
{

    MotionEventCompatHoneycombMr1()
    {
    }

    static float getAxisValue(MotionEvent motionevent, int i)
    {
        return motionevent.getAxisValue(i);
    }

    static float getAxisValue(MotionEvent motionevent, int i, int j)
    {
        return motionevent.getAxisValue(i, j);
    }
}
