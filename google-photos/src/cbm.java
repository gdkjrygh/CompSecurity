// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.graphics.Matrix;

public final class cbm extends cbd
{

    public cbm(cay cay)
    {
        super(cay, 0.5F, 1.4F, new cbn(4F, 0.15F), 0, false);
    }

    public final Matrix c(cba cba)
    {
        Matrix matrix = super.c(cba);
        float f = 1.0F + (0.95F - 1.0F) * b.b(cba);
        matrix.postScale(f, f, 0.5F, 0.5F);
        return matrix;
    }

    public final int j(cba cba)
    {
        return 0;
    }
}
