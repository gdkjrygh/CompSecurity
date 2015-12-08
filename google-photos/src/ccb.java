// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.graphics.Matrix;

final class ccb extends cbi
{

    private Matrix c;

    public ccb(cbj cbj)
    {
        super(cbj);
        c = new Matrix();
    }

    public final int e(cba cba1)
    {
        return b.eT;
    }

    public final int j(cba cba1)
    {
        return b.fc;
    }

    public final Matrix o(cba cba1)
    {
        c.reset();
        b.a(c, -5F, cba1.u);
        return c;
    }
}
