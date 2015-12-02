// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.a.a;

import android.view.animation.Interpolator;

// Referenced classes of package com.a.a:
//            o

public abstract class n
    implements Cloneable
{

    float a;
    Class b;
    boolean c;
    private Interpolator d;

    public n()
    {
        d = null;
        c = false;
    }

    public static n a(float f)
    {
        return new o(f);
    }

    public static n a(float f, float f1)
    {
        return new o(f, f1);
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
    {
        return e();
    }

    public Interpolator d()
    {
        return d;
    }

    public abstract n e();
}
