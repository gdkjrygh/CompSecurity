// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.b.b;

import com.google.b.m;

// Referenced classes of package com.google.b.b:
//            f, b, k

public abstract class i
{

    private static i a = new f();

    public i()
    {
    }

    public static i a()
    {
        return a;
    }

    protected static void a(b b1, float af[])
    {
        int l = b1.f();
        int i1 = b1.g();
        int k = 0;
        int j = 1;
        while (k < af.length && j != 0) 
        {
            j = (int)af[k];
            int j1 = (int)af[k + 1];
            if (j < -1 || j > l || j1 < -1 || j1 > i1)
            {
                throw m.a();
            }
            if (j == -1)
            {
                af[k] = 0.0F;
                j = 1;
            } else
            if (j == l)
            {
                af[k] = l - 1;
                j = 1;
            } else
            {
                j = 0;
            }
            if (j1 == -1)
            {
                af[k + 1] = 0.0F;
                j = 1;
            } else
            if (j1 == i1)
            {
                af[k + 1] = i1 - 1;
                j = 1;
            }
            k += 2;
        }
        k = af.length - 2;
        j = 1;
        while (k >= 0 && j != 0) 
        {
            j = (int)af[k];
            j1 = (int)af[k + 1];
            if (j < -1 || j > l || j1 < -1 || j1 > i1)
            {
                throw m.a();
            }
            if (j == -1)
            {
                af[k] = 0.0F;
                j = 1;
            } else
            if (j == l)
            {
                af[k] = l - 1;
                j = 1;
            } else
            {
                j = 0;
            }
            if (j1 == -1)
            {
                af[k + 1] = 0.0F;
                j = 1;
            } else
            if (j1 == i1)
            {
                af[k + 1] = i1 - 1;
                j = 1;
            }
            k -= 2;
        }
    }

    public abstract b a(b b1, int j, int k, float f1, float f2, float f3, float f4, 
            float f5, float f6, float f7, float f8, float f9, float f10, float f11, 
            float f12, float f13, float f14, float f15, float f16);

    public abstract b a(b b1, int j, int k, k k1);

}
