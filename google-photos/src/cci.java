// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.animation.TimeInterpolator;
import android.graphics.Matrix;

public final class cci extends cat
{

    private final cck b;
    private final float c;
    private final TimeInterpolator d;
    private final ccl e = new ccl();
    private float f;
    private float g;
    private Matrix h;
    private Matrix i;

    public cci(cay cay, cck cck1, float f1)
    {
        super(cay);
        h = new Matrix();
        i = new Matrix();
        boolean flag;
        if (f1 > 0.0F && f1 <= 1.0F)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        b.a(flag, "scale must be > 0 and <= 1");
        c = f1;
        b = (cck)b.a(cck1, "direction", null);
        d = dac.a;
    }

    private cck A(cba cba1)
    {
        if (b == cck.e)
        {
            int j = b.b(0, 4, cba1.f * cba1.h);
            return cck.values()[j];
        } else
        {
            return b;
        }
    }

    private float a(cck cck1, int j)
    {
        float f1 = 1.0F;
_L12:
        ccj.a[cck1.ordinal()];
        JVM INSTR tableswitch 1 5: default 44
    //                   1 171
    //                   2 82
    //                   3 182
    //                   4 269
    //                   5 280;
           goto _L1 _L2 _L3 _L4 _L5 _L6
_L1:
        cck1 = String.valueOf(cck1);
        throw b.a((new StringBuilder(String.valueOf(cck1).length() + 21)).append("Unexpected direction ").append(cck1).toString());
_L3:
        j;
        JVM INSTR tableswitch 0 3: default 112
    //                   0 137
    //                   1 148
    //                   2 153
    //                   3 146;
           goto _L7 _L8 _L9 _L10 _L11
_L7:
        throw b.a((new StringBuilder(31)).append("Unexpected position ").append(j).toString());
_L8:
        f1 = -e.a;
_L11:
        return f1;
_L9:
        return g;
_L10:
        return (f + g) - e.a;
_L2:
        cck1 = cck.d;
        j = 3 - j;
          goto _L12
_L4:
        switch (j)
        {
        default:
            throw b.a((new StringBuilder(31)).append("Unexpected position ").append(j).toString());

        case 0: // '\0'
            return -e.b;

        case 1: // '\001'
            return g;

        case 2: // '\002'
            return (f + g) - e.b;

        case 3: // '\003'
            break;
        }
          goto _L11
_L5:
        cck1 = cck.a;
        j = 3 - j;
          goto _L12
_L6:
        throw c.a("RANDOM_PER_CLIP direction has not been resolved");
    }

    private void a(Matrix matrix)
    {
        matrix.setScale(e.a, e.b);
        matrix.postTranslate(e.c, e.d);
    }

    private void a(cnw cnw1, cck cck1)
    {
        float f1 = 1.0F - cnw1.a - cnw1.b;
        float f2 = 1.0F - cnw1.c - cnw1.d;
        e.a = c * f1;
        e.b = c * f2;
        switch (ccj.a[cck1.ordinal()])
        {
        default:
            return;

        case 1: // '\001'
        case 2: // '\002'
            f = f1;
            cck1 = e;
            f1 = cnw1.d;
            cck1.d = (f2 - e.b) / 2.0F + f1;
            g = cnw1.a;
            return;

        case 3: // '\003'
        case 4: // '\004'
            f = f2;
            cck1 = e;
            f2 = cnw1.a;
            cck1.c = (f1 - e.a) / 2.0F + f2;
            g = cnw1.d;
            return;

        case 5: // '\005'
            throw b.a("Direction parameter must not be RANDOM_PER_CLIP");
        }
    }

    public final Matrix a(cba cba1, cpy cpy)
    {
        cpy = A(cba1);
        a(cba1.s, ((cck) (cpy)));
        if (b.a(cba1)) goto _L2; else goto _L1
_L1:
        float f1 = (float)(cba1.d - cba1.n) / (float)(cba1.e - cba1.n - cba1.o);
        ccj.a[cpy.ordinal()];
        JVM INSTR tableswitch 1 5: default 92
    //                   1 105
    //                   2 105
    //                   3 139
    //                   4 139
    //                   5 173;
           goto _L3 _L4 _L4 _L5 _L5 _L6
_L3:
        a(h);
        return h;
_L4:
        cba1 = e;
        float f3 = a(((cck) (cpy)), 1);
        cba1.c = (a(((cck) (cpy)), 2) - f3) * f1 + f3;
        continue; /* Loop/switch isn't completed */
_L5:
        cba1 = e;
        float f4 = a(((cck) (cpy)), 1);
        cba1.d = (a(((cck) (cpy)), 2) - f4) * f1 + f4;
        if (true) goto _L3; else goto _L6
_L6:
        throw c.a("RANDOM_PER_CLIP direction has not been resolved");
_L2:
        float f2 = d.getInterpolation(cba1.m);
        switch (ccj.a[cpy.ordinal()])
        {
        case 1: // '\001'
        case 2: // '\002'
            cba1 = e;
            float f5 = a(((cck) (cpy)), 2);
            cba1.c = (a(((cck) (cpy)), 3) - f5) * f2 + f5;
            break;

        case 3: // '\003'
        case 4: // '\004'
            cba1 = e;
            float f6 = a(((cck) (cpy)), 2);
            cba1.d = (a(((cck) (cpy)), 3) - f6) * f2 + f6;
            break;

        case 5: // '\005'
            throw c.a("RANDOM_PER_CLIP direction has not been resolved");
        }
        if (true) goto _L3; else goto _L7
_L7:
    }

    public final Matrix b(cba cba1)
    {
        float f1;
        cck cck1;
        cck1 = A(cba1);
        a(cba1.t, cck1);
        f1 = d.getInterpolation(cba1.m);
        ccj.a[cck1.ordinal()];
        JVM INSTR tableswitch 1 5: default 76
    //                   1 89
    //                   2 89
    //                   3 122
    //                   4 122
    //                   5 155;
           goto _L1 _L2 _L2 _L3 _L3 _L4
_L1:
        a(i);
        return i;
_L2:
        cba1 = e;
        float f2 = a(cck1, 0);
        cba1.c = (a(cck1, 1) - f2) * f1 + f2;
        continue; /* Loop/switch isn't completed */
_L3:
        cba1 = e;
        float f3 = a(cck1, 0);
        cba1.d = (a(cck1, 1) - f3) * f1 + f3;
        if (true) goto _L1; else goto _L4
_L4:
        throw c.a("RANDOM_PER_CLIP direction has not been resolved");
    }

    public final float w(cba cba1)
    {
        return 1.0F;
    }
}
