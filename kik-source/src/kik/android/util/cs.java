// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.util;

import android.graphics.Point;
import android.view.MotionEvent;
import android.view.View;

public final class cs
    implements android.view.View.OnTouchListener
{

    private float a;
    private float b;

    public cs()
    {
    }

    public final Point a()
    {
        return new Point((int)a, (int)b);
    }

    public final boolean onTouch(View view, MotionEvent motionevent)
    {
        if (motionevent.getAction() == 1)
        {
            a = motionevent.getX() + (float)view.getLeft();
            b = motionevent.getY() + (float)view.getTop();
        }
        return false;
    }
}
