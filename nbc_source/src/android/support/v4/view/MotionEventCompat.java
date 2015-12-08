// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view;

import android.view.MotionEvent;

// Referenced classes of package android.support.v4.view:
//            MotionEventCompatEclair, MotionEventCompatGingerbread, MotionEventCompatHoneycombMr1

public class MotionEventCompat
{
    static class BaseMotionEventVersionImpl
        implements MotionEventVersionImpl
    {

        public int findPointerIndex(MotionEvent motionevent, int i)
        {
            return i != 0 ? -1 : 0;
        }

        public float getAxisValue(MotionEvent motionevent, int i)
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

        BaseMotionEventVersionImpl()
        {
        }
    }

    static class EclairMotionEventVersionImpl extends BaseMotionEventVersionImpl
    {

        public int findPointerIndex(MotionEvent motionevent, int i)
        {
            return MotionEventCompatEclair.findPointerIndex(motionevent, i);
        }

        public int getPointerCount(MotionEvent motionevent)
        {
            return MotionEventCompatEclair.getPointerCount(motionevent);
        }

        public int getPointerId(MotionEvent motionevent, int i)
        {
            return MotionEventCompatEclair.getPointerId(motionevent, i);
        }

        public float getX(MotionEvent motionevent, int i)
        {
            return MotionEventCompatEclair.getX(motionevent, i);
        }

        public float getY(MotionEvent motionevent, int i)
        {
            return MotionEventCompatEclair.getY(motionevent, i);
        }

        EclairMotionEventVersionImpl()
        {
        }
    }

    static class GingerbreadMotionEventVersionImpl extends EclairMotionEventVersionImpl
    {

        public int getSource(MotionEvent motionevent)
        {
            return MotionEventCompatGingerbread.getSource(motionevent);
        }

        GingerbreadMotionEventVersionImpl()
        {
        }
    }

    static class HoneycombMr1MotionEventVersionImpl extends GingerbreadMotionEventVersionImpl
    {

        public float getAxisValue(MotionEvent motionevent, int i)
        {
            return MotionEventCompatHoneycombMr1.getAxisValue(motionevent, i);
        }

        HoneycombMr1MotionEventVersionImpl()
        {
        }
    }

    static interface MotionEventVersionImpl
    {

        public abstract int findPointerIndex(MotionEvent motionevent, int i);

        public abstract float getAxisValue(MotionEvent motionevent, int i);

        public abstract int getPointerCount(MotionEvent motionevent);

        public abstract int getPointerId(MotionEvent motionevent, int i);

        public abstract int getSource(MotionEvent motionevent);

        public abstract float getX(MotionEvent motionevent, int i);

        public abstract float getY(MotionEvent motionevent, int i);
    }


    static final MotionEventVersionImpl IMPL;

    public static int findPointerIndex(MotionEvent motionevent, int i)
    {
        return IMPL.findPointerIndex(motionevent, i);
    }

    public static int getActionIndex(MotionEvent motionevent)
    {
        return (motionevent.getAction() & 0xff00) >> 8;
    }

    public static int getActionMasked(MotionEvent motionevent)
    {
        return motionevent.getAction() & 0xff;
    }

    public static float getAxisValue(MotionEvent motionevent, int i)
    {
        return IMPL.getAxisValue(motionevent, i);
    }

    public static int getPointerCount(MotionEvent motionevent)
    {
        return IMPL.getPointerCount(motionevent);
    }

    public static int getPointerId(MotionEvent motionevent, int i)
    {
        return IMPL.getPointerId(motionevent, i);
    }

    public static int getSource(MotionEvent motionevent)
    {
        return IMPL.getSource(motionevent);
    }

    public static float getX(MotionEvent motionevent, int i)
    {
        return IMPL.getX(motionevent, i);
    }

    public static float getY(MotionEvent motionevent, int i)
    {
        return IMPL.getY(motionevent, i);
    }

    static 
    {
        if (android.os.Build.VERSION.SDK_INT >= 12)
        {
            IMPL = new HoneycombMr1MotionEventVersionImpl();
        } else
        if (android.os.Build.VERSION.SDK_INT >= 9)
        {
            IMPL = new GingerbreadMotionEventVersionImpl();
        } else
        if (android.os.Build.VERSION.SDK_INT >= 5)
        {
            IMPL = new EclairMotionEventVersionImpl();
        } else
        {
            IMPL = new BaseMotionEventVersionImpl();
        }
    }
}
