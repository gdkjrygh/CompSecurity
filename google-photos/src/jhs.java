// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.MotionEvent;
import android.view.ScaleGestureDetector;

final class jhs
    implements iwe
{

    boolean a;
    private final ScaleGestureDetector b;

    public jhs(ScaleGestureDetector scalegesturedetector)
    {
        b = scalegesturedetector;
    }

    public final boolean a(MotionEvent motionevent)
    {
        b.onTouchEvent(motionevent);
        return a;
    }
}
