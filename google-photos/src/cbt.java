// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.graphics.Matrix;

final class cbt extends cat
{

    private Matrix b;

    cbt(cbs cbs, cay cay1)
    {
        super(cay1);
        b = new Matrix();
    }

    public final Matrix a(cba cba1, cpy cpy)
    {
        b.setScale(0.95F, 0.95F, 0.5F, 0.5F);
        cba1.s.a(b);
        b.postConcat(super.a.g(cba1));
        return b;
    }
}
