// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.graphics.Matrix;

public final class cce extends cbi
{

    private final int c;
    private final boolean d;
    private final Matrix e = new Matrix();

    public cce(cbj cbj, int i1, boolean flag)
    {
        super(cbj);
        c = i1;
        d = flag;
    }

    public final int f(cba cba)
    {
        return c;
    }

    public final Matrix g(cba cba)
    {
        return e;
    }

    public final float h(cba cba)
    {
        return 1.0F;
    }

    public final int i(cba cba)
    {
        return caz.d;
    }

    public final int j(cba cba)
    {
        if (d)
        {
            return super.f(cba);
        } else
        {
            return super.j(cba);
        }
    }

    public final Matrix k(cba cba)
    {
        if (d)
        {
            return super.g(cba);
        } else
        {
            return super.k(cba);
        }
    }

    public final float l(cba cba)
    {
        if (d)
        {
            return super.h(cba);
        } else
        {
            return super.l(cba);
        }
    }

    public final int m(cba cba)
    {
        if (d)
        {
            return super.i(cba);
        } else
        {
            return super.m(cba);
        }
    }
}
