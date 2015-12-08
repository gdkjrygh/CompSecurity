// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.graphics.Matrix;

public class ccy extends ccu
{

    private final int a;
    private final float b;
    private Matrix c;

    public ccy(long l, int i, int j, int k, int i1)
    {
        super(l, i);
        c = new Matrix();
        a = i1;
        b.a(j, "width");
        b.a(k, "height");
        ccz.a[i1 - 1];
        JVM INSTR tableswitch 1 4: default 76
    //                   1 86
    //                   2 86
    //                   3 105
    //                   4 105;
           goto _L1 _L2 _L2 _L3 _L3
_L1:
        throw new AssertionError("Direction not recognised.");
_L2:
        float f = (float)j / ((float)k * 1.777778F);
_L5:
        b = f;
        return;
_L3:
        f = ((float)k * 1.777778F) / (float)j;
        if (true) goto _L5; else goto _L4
_L4:
    }

    public final Matrix c(cba cba)
    {
        float f;
        float f1;
        f = b(cba);
        f1 = 1.0F / b;
        ccz.a[a - 1];
        JVM INSTR tableswitch 1 4: default 52
    //                   1 57
    //                   2 85
    //                   3 111
    //                   4 139;
           goto _L1 _L2 _L3 _L4 _L5
_L1:
        return c;
_L2:
        c.setScale(f1, 1.0F);
        c.postTranslate((1.0F - f) * (1.0F - f1), 0.0F);
        continue; /* Loop/switch isn't completed */
_L3:
        c.setScale(f1, 1.0F);
        c.postTranslate(f * (1.0F - f1), 0.0F);
        continue; /* Loop/switch isn't completed */
_L4:
        c.setScale(1.0F, f1);
        c.postTranslate(0.0F, (1.0F - f) * (1.0F - f1));
        continue; /* Loop/switch isn't completed */
_L5:
        c.setScale(1.0F, f1);
        c.postTranslate(0.0F, f * (1.0F - f1));
        if (true) goto _L1; else goto _L6
_L6:
    }
}
