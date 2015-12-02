// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nineoldandroids.a;

import android.view.animation.Interpolator;

public abstract class i
    implements Cloneable
{
    static class a extends i
    {

        float d;

        public void a(Object obj)
        {
            if (obj != null && obj.getClass() == java/lang/Float)
            {
                d = ((Float)obj).floatValue();
                c = true;
            }
        }

        public Object b()
        {
            return Float.valueOf(d);
        }

        public i e()
        {
            return g();
        }

        public float f()
        {
            return d;
        }

        public a g()
        {
            a a1 = new a(c(), d);
            a1.a(d());
            return a1;
        }

        a(float f1)
        {
            a = f1;
            b = Float.TYPE;
        }

        a(float f1, float f2)
        {
            a = f1;
            d = f2;
            b = Float.TYPE;
            c = true;
        }
    }

    static class b extends i
    {

        int d;

        public void a(Object obj)
        {
            if (obj != null && obj.getClass() == java/lang/Integer)
            {
                d = ((Integer)obj).intValue();
                c = true;
            }
        }

        public Object b()
        {
            return Integer.valueOf(d);
        }

        public i e()
        {
            return g();
        }

        public int f()
        {
            return d;
        }

        public b g()
        {
            b b1 = new b(c(), d);
            b1.a(d());
            return b1;
        }

        b(float f1)
        {
            a = f1;
            b = Integer.TYPE;
        }

        b(float f1, int j)
        {
            a = f1;
            d = j;
            b = Integer.TYPE;
            c = true;
        }
    }


    float a;
    Class b;
    boolean c;
    private Interpolator d;

    public i()
    {
        d = null;
        c = false;
    }

    public static i a(float f)
    {
        return new b(f);
    }

    public static i a(float f, float f1)
    {
        return new a(f, f1);
    }

    public static i a(float f, int j)
    {
        return new b(f, j);
    }

    public static i b(float f)
    {
        return new a(f);
    }

    public void a(Interpolator interpolator)
    {
        d = interpolator;
    }

    public abstract void a(Object obj);

    public boolean a()
    {
        return c;
    }

    public abstract Object b();

    public float c()
    {
        return a;
    }

    public Object clone()
        throws CloneNotSupportedException
    {
        return e();
    }

    public Interpolator d()
    {
        return d;
    }

    public abstract i e();
}
