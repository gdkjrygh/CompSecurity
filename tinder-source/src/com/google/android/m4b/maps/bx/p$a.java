// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.bx;

import com.google.android.m4b.maps.ay.k;
import com.google.android.m4b.maps.bi.a;
import com.google.android.m4b.maps.bi.b;
import com.google.android.m4b.maps.bi.c;
import com.google.android.m4b.maps.bi.d;
import com.google.android.m4b.maps.bi.f;
import com.google.android.m4b.maps.bo.g;

// Referenced classes of package com.google.android.m4b.maps.bx:
//            p

public static final class h extends a
{

    private final c b;
    private d c;
    private final int d;
    private final long e = k.c();
    private int f;
    private final k g = k.a();
    private float h;

    public final int a()
    {
        return f;
    }

    public final d a(b b1)
    {
        long l = k.c();
        float f1;
        int i;
        if (d == 0)
        {
            f1 = 1.0F;
        } else
        {
            f1 = (float)(l - e) / (float)d;
        }
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        float f8;
        c c1;
        c c2;
        if (c instanceof f)
        {
            f f9 = (f)c;
            c = f9.a(b1);
            i = f9.a();
        } else
        {
            i = 0;
        }
        if (f1 >= 1.0F)
        {
            f = i;
            return c;
        }
        f6 = 1.0F - ((float)Math.cos((double)f1 * 3.1415926535897931D) + 1.0F) * 0.5F;
        c1 = b;
        c2 = c.b().a(b);
        f1 = h;
        if (f1 == 0.0F)
        {
            b1 = c1.a.a(c2.a, f6);
            f1 = c1.b;
            f1 = (c2.b - f1) * f6 + f1;
        } else
        {
            b1 = c1.a.a(c2.a, ((float)Math.cos(3.141593F * (f6 - 1.0F)) + 1.0F) / 2.0F);
            f4 = c1.b;
            f3 = c2.b;
            f2 = (float)Math.sin(3.141593F * f6);
            f4 = com.google.android.m4b.maps.bi.c.a(f4);
            f3 = com.google.android.m4b.maps.bi.c.a(f3);
            f1 = Math.min((float)(0.5D * Math.pow(f2, 1.2D) * Math.pow(f1, 0.40000000000000002D)) + (f4 * (1.0F - f6) + f3 * f6), 160F);
            if (f1 > 0.0F)
            {
                f1 = (float)(-Math.log((double)f1 * 0.10000000000000001D) * 1.4426950216293335D + 4D);
            } else
            {
                f1 = 32F;
            }
            f1 = Math.max(f1, 2.0F);
        }
        f7 = c1.c;
        f8 = c2.c;
        f4 = c1.d;
        f5 = c2.d;
        if (f4 <= f5) goto _L2; else goto _L1
_L1:
        f2 = f5;
        f3 = f4;
        if (f4 - f5 > 180F)
        {
            f3 = f4 - 360F;
            f2 = f5;
        }
_L4:
        f3 += (f2 - f3) * f6;
        f2 = f3;
        if ((double)f3 < 0.0D)
        {
            f2 = f3 + 360F;
        }
        f3 = c1.e;
        a = new c(b1, f1, (f8 - f7) * f6 + f7, f2, f6 * (c2.e - f3) + f3);
        f = i | 2;
        return this;
_L2:
        f2 = f5;
        f3 = f4;
        if (f5 - f4 > 180F)
        {
            f2 = f5 - 360F;
            f3 = f4;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    protected (c c1, d d1, int i, boolean flag, float f1)
    {
        super(c1);
        f = 0;
        b = c1;
        c = d1;
        if (b.equals(c.b()))
        {
            d = 0;
        } else
        {
            d = Math.max(0, i);
        }
        if (flag)
        {
            h = 0.0F;
            return;
        } else
        {
            h = f1;
            return;
        }
    }
}
