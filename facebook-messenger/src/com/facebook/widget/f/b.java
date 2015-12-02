// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.widget.f;

import com.facebook.common.b.e;

// Referenced classes of package com.facebook.widget.f:
//            c

public class b
{

    private static final float a[] = {
        1.0F, 1.0F, 1.0F, 1.0F, 1.0F, 1.0F, 1.0F, 1.0F
    };
    private boolean b;
    private e c;

    public b()
    {
        this(false);
    }

    public b(boolean flag)
    {
        b = false;
        b = flag;
        c = new e(8);
    }

    private void b(long l, c c1)
    {
        int k = c.c();
        if (k == 0)
        {
            throw new IndexOutOfBoundsException("Can't estimate with no samples");
        }
        float f11 = 0.0F;
        float f10 = 0.0F;
        float f8 = 0.0F;
        float f3 = 0.0F;
        float f2 = 0.0F;
        float f13 = 0.0F;
        float f12 = 0.0F;
        float f7 = 0.0F;
        float f6 = 0.0F;
        float f4 = 0.0F;
        float f1 = 0.0F;
        float f = 0.0F;
        int j = 0;
        int i = k - 1;
        do
        {
label0:
            {
                c c2;
                if (i >= 0)
                {
                    c2 = (c)c.a(i);
                    if (c2.c >= 0L && l - c2.c <= 100L)
                    {
                        break label0;
                    }
                }
                float f14 = ((f3 * f13 - f2 * f2) * f11 - (f13 * f10 - f8 * f2) * f10) + (f10 * f2 - f3 * f8) * f8;
                float f15;
                float f16;
                if (b && Math.abs(f14) > 1E-04F && j >= 3)
                {
                    f6 = (1.0F / f14) * ((f10 * f2 - f3 * f8) * f12 + f7 * (f8 * f10 - f11 * f2) + f6 * (f11 * f3 - f10 * f10));
                    f = (1.0F / f14) * ((f10 * f2 - f3 * f8) * f4 + f1 * (f8 * f10 - f11 * f2) + f * (f11 * f3 - f10 * f10));
                    f1 = f6;
                } else
                {
                    float f9 = f3 * f13 - f2 * f2;
                    if (Math.abs(f9) > 1E-04F && j >= 2)
                    {
                        float f5 = (1.0F / f9) * (-f2 * f7 + f3 * f6);
                        f = (1.0F / f9) * (-f2 * f1 + f * f3);
                        f1 = f5;
                    } else
                    {
                        c c3 = (c)c.a(k - 1);
                        f1 = c3.a;
                        f = c3.b;
                    }
                }
                c1.a(f1, f, l);
                return;
            }
            f14 = c2.c - l;
            f16 = f14 * f14;
            f15 = a[i];
            f15 *= f15;
            f11 += f15 * f16 * f16;
            f10 += f15 * f16 * f14;
            f8 += f15 * f16;
            f3 += f15 * f16;
            f2 += f15 * f14;
            f13 += 1.0F * f15;
            f12 += f15 * f16 * c2.a;
            f7 += f15 * f14 * c2.a;
            f6 += c2.a * f15;
            f4 += f16 * f15 * c2.b;
            f1 += f14 * f15 * c2.b;
            f += c2.b * f15;
            j++;
            i--;
        } while (true);
    }

    public void a()
    {
        int j = c.c();
        for (int i = 0; i < j; i++)
        {
            ((c)c.a(i)).a();
        }

    }

    public void a(float f, float f1, long l)
    {
        c c1;
        if (c.b())
        {
            c1 = (c)c.a();
            c1.a(f, f1, l);
        } else
        {
            c1 = new c(f, f1, l);
        }
        c.a(c1);
    }

    public final void a(long l, c c1)
    {
        b(l, c1);
    }

}
