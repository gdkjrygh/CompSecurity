// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.widget.animator;


public class MotionTween
{
    public static final class Approximation extends Enum
    {

        public static final Approximation a;
        public static final Approximation b;
        public static final Approximation c;
        public static final Approximation d;
        public static final Approximation e;
        public static final Approximation f;
        public static final Approximation g;
        private static final Approximation h[];

        public static Approximation valueOf(String s)
        {
            return (Approximation)Enum.valueOf(com/skype/android/widget/animator/MotionTween$Approximation, s);
        }

        public static Approximation[] values()
        {
            return (Approximation[])h.clone();
        }

        static 
        {
            a = new Approximation("LINEAR", 0);
            b = new Approximation("DIRECT_POWER_2", 1);
            c = new Approximation("DIRECT_POWER_3", 2);
            d = new Approximation("DIRECT_POWER_4", 3);
            e = new Approximation("INVERSE_POWER_2", 4);
            f = new Approximation("INVERSE_POWER_3", 5);
            g = new Approximation("INVERSE_POWER_4", 6);
            h = (new Approximation[] {
                a, b, c, d, e, f, g
            });
        }

        private Approximation(String s, int i)
        {
            super(s, i);
        }
    }


    private int a;
    private float b;
    private float c;
    private Approximation d;

    public MotionTween(float f, float f1, Approximation approximation)
    {
        a = 20;
        b = f;
        c = f1;
        d = approximation;
    }

    public final float a(int i)
    {
        float f = (float)i / (float)(a - 1);
        if (a <= 1)
        {
            return (b + c) / 2.0F;
        }
        if (i < 0)
        {
            return b;
        }
        if (i > a - 1)
        {
            return c;
        }
        static final class _cls1
        {

            static final int a[];

            static 
            {
                a = new int[Approximation.values().length];
                try
                {
                    a[Approximation.b.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror6) { }
                try
                {
                    a[Approximation.c.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror5) { }
                try
                {
                    a[Approximation.d.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror4) { }
                try
                {
                    a[Approximation.e.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    a[Approximation.f.ordinal()] = 5;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    a[Approximation.g.ordinal()] = 6;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[Approximation.a.ordinal()] = 7;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        switch (_cls1.a[d.ordinal()])
        {
        default:
            return b + (c - b) * f;

        case 1: // '\001'
            return b + (c - b) * (float)Math.pow(f, 2D);

        case 2: // '\002'
            return b + (c - b) * (float)Math.pow(f, 3D);

        case 3: // '\003'
            return b + (c - b) * (float)Math.pow(f, 4D);

        case 4: // '\004'
            return b + (c - b) * (float)Math.pow(f, 0.5D);

        case 5: // '\005'
            return b + (c - b) * (float)Math.pow(f, 0.33000000000000002D);

        case 6: // '\006'
            return b + (c - b) * (float)Math.pow(f, 0.25D);
        }
    }

    public final int a()
    {
        return a;
    }

    public final float b()
    {
        return b;
    }

    public final float c()
    {
        return c;
    }
}
