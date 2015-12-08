// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.MotionEvent;

public final class lt
{

    private static lx a;

    public static int a(MotionEvent motionevent)
    {
        return motionevent.getAction() & 0xff;
    }

    public static int a(MotionEvent motionevent, int i)
    {
        return a.a(motionevent, i);
    }

    public static int b(MotionEvent motionevent)
    {
        return motionevent.getAction() >> 8 & 0xff;
    }

    public static int b(MotionEvent motionevent, int i)
    {
        return a.b(motionevent, i);
    }

    public static float c(MotionEvent motionevent, int i)
    {
        return a.c(motionevent, i);
    }

    public static int c(MotionEvent motionevent)
    {
        return a.a(motionevent);
    }

    public static float d(MotionEvent motionevent, int i)
    {
        return a.d(motionevent, i);
    }

    public static int d(MotionEvent motionevent)
    {
        return a.b(motionevent);
    }

    public static float e(MotionEvent motionevent, int i)
    {
        return a.e(motionevent, i);
    }

    static 
    {
        if (android.os.Build.VERSION.SDK_INT >= 12)
        {
            a = new lw();
        } else
        if (android.os.Build.VERSION.SDK_INT >= 9)
        {
            a = new lv();
        } else
        if (android.os.Build.VERSION.SDK_INT >= 5)
        {
            a = new lu();
        } else
        {
            a = new lx();
        }
    }
}
