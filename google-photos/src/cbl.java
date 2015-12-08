// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.animation.TimeInterpolator;

final class cbl extends cbi
{

    cbl(cbj cbj)
    {
        super(cbj);
    }

    public final int f(cba cba1)
    {
        if (cba1.i == cnt.a)
        {
            return 0;
        } else
        {
            return super.f(cba1);
        }
    }

    public final int j(cba cba1)
    {
        return b.fq;
    }

    public final float l(cba cba1)
    {
        return 0.5F * b.getInterpolation(A(cba1));
    }

    public final int m(cba cba1)
    {
        return caz.d;
    }

    public final float u(cba cba1)
    {
        float f1 = super.a.u(cba1);
        return f1 + (1.0F - f1) * A(cba1);
    }
}
