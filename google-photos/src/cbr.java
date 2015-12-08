// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.graphics.Matrix;

public class cbr extends cat
{

    private final Matrix b = new Matrix();
    private final Matrix c = new Matrix();

    public cbr(cay cay1)
    {
        super(cay1);
    }

    public final Matrix a(cba cba1, cpy cpy)
    {
        b.reset();
        cba1.s.a(b);
        b.a(b, cba1, true);
        return b;
    }

    public final Matrix b(cba cba1)
    {
        if (cba1.k != cnt.c)
        {
            return super.a.b(cba1);
        } else
        {
            c.reset();
            cba1.t.a(c);
            b.a(c, cba1, false);
            return c;
        }
    }
}
