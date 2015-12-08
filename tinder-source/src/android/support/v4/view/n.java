// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view;

import android.view.MotionEvent;

public final class n
{
    static class a
        implements e
    {

        public int a(MotionEvent motionevent)
        {
            return 1;
        }

        public int a(MotionEvent motionevent, int i)
        {
            return i != 0 ? -1 : 0;
        }

        public int b(MotionEvent motionevent)
        {
            return 0;
        }

        public int b(MotionEvent motionevent, int i)
        {
            if (i == 0)
            {
                return 0;
            } else
            {
                throw new IndexOutOfBoundsException("Pre-Eclair does not support multiple pointers");
            }
        }

        public float c(MotionEvent motionevent, int i)
        {
            if (i == 0)
            {
                return motionevent.getX();
            } else
            {
                throw new IndexOutOfBoundsException("Pre-Eclair does not support multiple pointers");
            }
        }

        public float d(MotionEvent motionevent, int i)
        {
            if (i == 0)
            {
                return motionevent.getY();
            } else
            {
                throw new IndexOutOfBoundsException("Pre-Eclair does not support multiple pointers");
            }
        }

        public float e(MotionEvent motionevent, int i)
        {
            return 0.0F;
        }

        a()
        {
        }
    }

    static class b extends a
    {

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

        b()
        {
        }
    }

    static class c extends b
    {

        public final int b(MotionEvent motionevent)
        {
            return motionevent.getSource();
        }

        c()
        {
        }
    }

    static final class d extends c
    {

        public final float e(MotionEvent motionevent, int i)
        {
            return motionevent.getAxisValue(i);
        }

        d()
        {
        }
    }

    static interface e
    {

        public abstract int a(MotionEvent motionevent);

        public abstract int a(MotionEvent motionevent, int i);

        public abstract int b(MotionEvent motionevent);

        public abstract int b(MotionEvent motionevent, int i);

        public abstract float c(MotionEvent motionevent, int i);

        public abstract float d(MotionEvent motionevent, int i);

        public abstract float e(MotionEvent motionevent, int i);
    }


    static final e a;

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
        return (motionevent.getAction() & 0xff00) >> 8;
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
            a = new d();
        } else
        if (android.os.Build.VERSION.SDK_INT >= 9)
        {
            a = new c();
        } else
        if (android.os.Build.VERSION.SDK_INT >= 5)
        {
            a = new b();
        } else
        {
            a = new a();
        }
    }
}
