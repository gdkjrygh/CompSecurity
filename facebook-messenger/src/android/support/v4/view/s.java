// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view;

import android.view.MotionEvent;

// Referenced classes of package android.support.v4.view:
//            u, t, v

public class s
{

    static final v a;

    public s()
    {
    }

    public static int a(MotionEvent motionevent)
    {
        return (motionevent.getAction() & 0xff00) >> 8;
    }

    public static int a(MotionEvent motionevent, int i)
    {
        return a.a(motionevent, i);
    }

    public static int b(MotionEvent motionevent, int i)
    {
        return a.b(motionevent, i);
    }

    public static float c(MotionEvent motionevent, int i)
    {
        return a.c(motionevent, i);
    }

    public static float d(MotionEvent motionevent, int i)
    {
        return a.d(motionevent, i);
    }

    static 
    {
        if (android.os.Build.VERSION.SDK_INT >= 5)
        {
            a = new u();
        } else
        {
            a = new t();
        }
    }
}
