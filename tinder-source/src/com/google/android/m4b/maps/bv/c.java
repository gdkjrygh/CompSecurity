// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.bv;

import com.google.android.m4b.maps.cg.ar;
import com.google.android.m4b.maps.y.j;

// Referenced classes of package com.google.android.m4b.maps.bv:
//            n, p, q, l, 
//            ae, g

final class c extends n
{

    private final float b[] = new float[4];

    public c(ae ae, ae.c c1)
    {
        super(ae, c1);
    }

    public final int a(int i)
    {
        boolean flag;
        if (i == 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        j.b(flag);
        return -1;
    }

    public final p a(int i, int k, float f, float f1, int i1, float f2, float f3, 
            float f4, float f5, boolean flag)
    {
        if (i1 != 0)
        {
            throw new IllegalStateException("Invalid sphere face.");
        }
        int l1 = i + 1;
        int i2 = k + 1;
        p p1 = new p(l1, i2);
        for (i1 = 0; i1 < l1; i1++)
        {
            float f8 = (float)i1 / (float)i;
            float f9 = ar.a(f8 * f2 + f, 0.0F, 1.0F);
            for (int j1 = 0; j1 < i2; j1++)
            {
                float f10 = (float)j1 / (float)k;
                float f6 = ar.a((f10 * f3 + (1.0F - f1 - f3)) * 0.5F, 0.0F, 0.5F);
                ar.a(f9, f6, b);
                if (flag && a.z != null)
                {
                    float f7 = Math.min(200F, a.z.a(f9, f6, null));
                    f6 = f7;
                    if (f7 == 0.0F)
                    {
                        f6 = 200F;
                    }
                    for (int k1 = 0; k1 < 3; k1++)
                    {
                        float af[] = b;
                        af[k1] = af[k1] * f6;
                    }

                }
                b[3] = 1.0F;
                p1.a(i1, j1, b[0], b[1], b[2], f8 * f4, (1.0F - f10) * f5);
            }

        }

        return p1;
    }

    public final void a(q q1, g g, int i, int k)
    {
        a(q1, g, i, k, 1);
    }
}
