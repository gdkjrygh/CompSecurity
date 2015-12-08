// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.bx;

import com.google.android.m4b.maps.bi.a;
import com.google.android.m4b.maps.bi.b;
import com.google.android.m4b.maps.bi.c;
import com.google.android.m4b.maps.bi.d;
import com.google.android.m4b.maps.bi.e;

// Referenced classes of package com.google.android.m4b.maps.bx:
//            p

static final class i extends a
{

    private float b;
    private float c;
    private float d;
    private float e;
    private float f;
    private float g;
    private volatile boolean h;
    private final e i;
    private final float j[] = new float[2];

    public final int a()
    {
        return !h ? 0 : 2;
    }

    public final d a(b b1)
    {
        this;
        JVM INSTR monitorenter ;
        float f3;
        float f4;
        float f5;
        float f6;
        f3 = f;
        f4 = g;
        f5 = d;
        f6 = e;
        if (b >= 0.0F) goto _L2; else goto _L1
_L1:
        float f1 = Math.max(b, b * b * b * 100F);
_L9:
        if (c >= 0.0F) goto _L4; else goto _L3
_L3:
        float f2 = Math.max(c, c * c * -0.1F);
_L7:
        b = b - f1;
        c = c - f2;
        d = 0.0F;
        e = 0.0F;
        if ((double)Math.abs(f1) >= 0.001D || (double)Math.abs(f2) >= 0.001D || f5 != 0.0F || f6 != 0.0F) goto _L6; else goto _L5
_L5:
        h = false;
        b1 = a;
        this;
        JVM INSTR monitorexit ;
        return b1;
_L2:
        f1 = Math.min(b, b * b * b * 100F);
        continue; /* Loop/switch isn't completed */
_L4:
        f2 = Math.min(c, c * c * 0.1F);
          goto _L7
_L6:
        this;
        JVM INSTR monitorexit ;
        boolean flag;
        boolean flag1;
        boolean flag2;
        if (f5 != 0.0F || f6 != 0.0F)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (f2 != 0.0F)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        if (f1 != 0.0F)
        {
            flag2 = true;
        } else
        {
            flag2 = false;
        }
        if (flag)
        {
            a = com.google.android.m4b.maps.bx.p.a(a, b1, f5, f6);
            if (flag1 || flag2)
            {
                b1.a(a);
            }
        }
        if (flag1)
        {
            com.google.android.m4b.maps.bo.g g1 = b1.b(f3, f4);
            a = com.google.android.m4b.maps.bx.p.a(b1, i, g1, f2);
            if (flag2)
            {
                b1.a(a);
            }
        }
        if (flag2)
        {
            a = com.google.android.m4b.maps.bx.p.a(a, b1, i, f1, f3, f4);
            return this;
        }
        break MISSING_BLOCK_LABEL_392;
        b1;
        this;
        JVM INSTR monitorexit ;
        throw b1;
        return this;
        if (true) goto _L9; else goto _L8
_L8:
    }

    final float[] a(float f1, float f2, float f3, float f4, float f5, float f6)
    {
        this;
        JVM INSTR monitorenter ;
        b = b + f1;
        c = c + f2;
        d = d + f5;
        e = e + f6;
        if (f1 == 0.0F && f2 == 0.0F)
        {
            break MISSING_BLOCK_LABEL_67;
        }
        f = f3;
        g = f4;
        float af[];
        h = true;
        j[0] = Math.max(Math.min(a.b + b, com.google.android.m4b.maps.bx.p.b()), 2.0F);
        j[1] = com.google.android.m4b.maps.bx.p.b(a.d + c);
        af = j;
        this;
        JVM INSTR monitorexit ;
        return af;
        Exception exception;
        exception;
        throw exception;
    }

    public (c c1, e e1)
    {
        super(c1);
        i = e1;
    }
}
