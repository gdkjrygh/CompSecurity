// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.b.b;

import com.google.b.m;

// Referenced classes of package com.google.b.b:
//            i, k, b

public final class f extends i
{

    public f()
    {
    }

    public b a(b b1, int j, int l, float f1, float f2, float f3, float f4, 
            float f5, float f6, float f7, float f8, float f9, float f10, float f11, 
            float f12, float f13, float f14, float f15, float f16)
    {
        return a(b1, j, l, k.a(f1, f2, f3, f4, f5, f6, f7, f8, f9, f10, f11, f12, f13, f14, f15, f16));
    }

    public b a(b b1, int j, int l, k k1)
    {
        if (j <= 0 || l <= 0)
        {
            throw m.a();
        }
        b b2 = new b(j, l);
        float af[] = new float[j * 2];
        for (j = 0; j < l; j++)
        {
            int l1 = af.length;
            float f1 = j;
            for (int i1 = 0; i1 < l1; i1 += 2)
            {
                af[i1] = (float)(i1 / 2) + 0.5F;
                af[i1 + 1] = f1 + 0.5F;
            }

            k1.a(af);
            a(b1, af);
            int j1 = 0;
            while (j1 < l1) 
            {
                try
                {
                    if (b1.a((int)af[j1], (int)af[j1 + 1]))
                    {
                        b2.b(j1 / 2, j);
                    }
                }
                // Misplaced declaration of an exception variable
                catch (b b1)
                {
                    throw m.a();
                }
                j1 += 2;
            }
        }

        return b2;
    }
}
