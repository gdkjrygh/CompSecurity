// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.animation;

import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import java.util.ArrayList;

public abstract class SkypeAbstractAnimatorSet
{
    public static class Curve
    {

        public float a;
        public float b;
        public float c;
        public float d;

        public static Curve a()
        {
            return new Curve(1.0F, 0.0F, 0.78F, 1.0F);
        }

        public static Curve a(float f1, float f2, float f3, float f4)
        {
            return new Curve(f1, f2, f3, f4);
        }

        public static Curve b()
        {
            return new Curve(0.33F, 0.0F, 0.0F, 1.0F);
        }

        public static Curve c()
        {
            return new Curve(0.9F, 0.0F, 0.78F, 1.0F);
        }

        public static Curve d()
        {
            return new Curve(0.6F, 0.0F, 0.78F, 1.0F);
        }

        public static Curve e()
        {
            return new Curve(0.0F, 0.0F, 1.0F, 1.0F);
        }

        private Curve(float f1, float f2, float f3, float f4)
        {
            a = f1;
            b = f2;
            c = f3;
            d = f4;
        }
    }

    protected class KeyFrame
    {

        public float a;
        public float b;
        public Curve c;
        final SkypeAbstractAnimatorSet d;

        public KeyFrame(float f1, float f2, Curve curve)
        {
            d = SkypeAbstractAnimatorSet.this;
            super();
            a = f1;
            b = f2;
            c = curve;
        }
    }


    public static long e = 733L;
    protected AnimatorSet a;
    protected ArrayList b;
    protected final ArrayList c = new ArrayList();
    protected AnimatorListenerAdapter d;
    private long f;

    public SkypeAbstractAnimatorSet()
    {
        b = new ArrayList();
        f = -1L;
    }

    protected void a()
    {
        if (b.size() == 0)
        {
            throw new IllegalStateException("No keyframes were added to animation");
        }
        if (a != null && a.isRunning())
        {
            return;
        }
        a = new AnimatorSet();
        if (d != null)
        {
            a.addListener(d);
        }
        a.playSequentially(b);
        if (f != -1L)
        {
            a.setStartDelay(f);
        }
        a.start();
    }

    protected abstract void a(float f1, float f2, float f3, float f4, String s, float f5, float f6, 
            long l);

    public void a(float f1, float f2, Curve curve)
    {
        f1 = Math.max(0.0F, Math.min(1.0F, f1));
        ArrayList arraylist = c;
        Curve curve1 = curve;
        if (curve == null)
        {
            curve1 = Curve.e();
        }
        arraylist.add(new KeyFrame(f1, f2, curve1));
    }

    public abstract void a(long l);

    protected final void a(long l, String s, ArrayList arraylist)
    {
        float f1 = 0.0F;
        int i = 0;
        do
        {
            float f3 = f1;
            if (i < arraylist.size())
            {
                KeyFrame keyframe = (KeyFrame)arraylist.get(i);
                Object obj = null;
                if (i != 0)
                {
                    obj = (KeyFrame)arraylist.get(i - 1);
                }
                float f4 = keyframe.a * (float)l;
                f1 = f4;
                float f2;
                if (obj != null)
                {
                    Curve curve = ((KeyFrame) (obj)).c;
                    f2 = ((KeyFrame) (obj)).b;
                    obj = curve;
                } else
                {
                    obj = Curve.e();
                    f2 = 0.0F;
                }
                a(((Curve) (obj)).a, ((Curve) (obj)).b, ((Curve) (obj)).c, ((Curve) (obj)).d, s, f2, keyframe.b, (long)(f4 - f3));
                i++;
            } else
            {
                return;
            }
        } while (true);
    }

    public final void a(AnimatorListenerAdapter animatorlisteneradapter)
    {
        d = animatorlisteneradapter;
    }

    public void b()
    {
        if (a != null)
        {
            a.cancel();
        }
    }

}
