// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.widget;

import android.content.Context;
import android.graphics.Canvas;

public class EdgeEffectCompat
{

    private static final EdgeEffectImpl b;
    private Object a;

    public EdgeEffectCompat(Context context)
    {
        a = b.a(context);
    }

    public void a(int i, int j)
    {
        b.a(a, i, j);
    }

    public boolean a()
    {
        return b.a(a);
    }

    public boolean a(float f)
    {
        return b.a(a, f);
    }

    public boolean a(float f, float f1)
    {
        return b.a(a, f, f1);
    }

    public boolean a(int i)
    {
        return b.a(a, i);
    }

    public boolean a(Canvas canvas)
    {
        return b.a(a, canvas);
    }

    public void b()
    {
        b.b(a);
    }

    public boolean c()
    {
        return b.c(a);
    }

    static 
    {
        if (android.os.Build.VERSION.SDK_INT >= 21)
        {
            b = new EdgeEffectLollipopImpl();
        } else
        if (android.os.Build.VERSION.SDK_INT >= 14)
        {
            b = new EdgeEffectIcsImpl();
        } else
        {
            b = new BaseEdgeEffectImpl();
        }
    }

    private class EdgeEffectImpl
    {

        public abstract Object a(Context context);

        public abstract void a(Object obj, int i, int j);

        public abstract boolean a(Object obj);

        public abstract boolean a(Object obj, float f);

        public abstract boolean a(Object obj, float f, float f1);

        public abstract boolean a(Object obj, int i);

        public abstract boolean a(Object obj, Canvas canvas);

        public abstract void b(Object obj);

        public abstract boolean c(Object obj);
    }


    private class EdgeEffectLollipopImpl extends EdgeEffectIcsImpl
    {
        private class EdgeEffectIcsImpl
            implements EdgeEffectImpl
        {

            public Object a(Context context)
            {
                return EdgeEffectCompatIcs.a(context);
            }

            public void a(Object obj, int i, int j)
            {
                EdgeEffectCompatIcs.a(obj, i, j);
            }

            public boolean a(Object obj)
            {
                return EdgeEffectCompatIcs.a(obj);
            }

            public boolean a(Object obj, float f)
            {
                return EdgeEffectCompatIcs.a(obj, f);
            }

            public boolean a(Object obj, float f, float f1)
            {
                return EdgeEffectCompatIcs.a(obj, f);
            }

            public boolean a(Object obj, int i)
            {
                return EdgeEffectCompatIcs.a(obj, i);
            }

            public boolean a(Object obj, Canvas canvas)
            {
                return EdgeEffectCompatIcs.a(obj, canvas);
            }

            public void b(Object obj)
            {
                EdgeEffectCompatIcs.b(obj);
            }

            public boolean c(Object obj)
            {
                return EdgeEffectCompatIcs.c(obj);
            }

            EdgeEffectIcsImpl()
            {
            }
        }


        public boolean a(Object obj, float f, float f1)
        {
            return EdgeEffectCompatLollipop.a(obj, f, f1);
        }

        EdgeEffectLollipopImpl()
        {
        }
    }


    private class BaseEdgeEffectImpl
        implements EdgeEffectImpl
    {

        public Object a(Context context)
        {
            return null;
        }

        public void a(Object obj, int i, int j)
        {
        }

        public boolean a(Object obj)
        {
            return true;
        }

        public boolean a(Object obj, float f)
        {
            return false;
        }

        public boolean a(Object obj, float f, float f1)
        {
            return false;
        }

        public boolean a(Object obj, int i)
        {
            return false;
        }

        public boolean a(Object obj, Canvas canvas)
        {
            return false;
        }

        public void b(Object obj)
        {
        }

        public boolean c(Object obj)
        {
            return false;
        }

        BaseEdgeEffectImpl()
        {
        }
    }

}
