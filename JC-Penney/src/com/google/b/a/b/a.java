// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.b.a.b;

import com.google.b.b.b;
import com.google.b.b.b.c;
import com.google.b.b.b.e;
import com.google.b.b.i;
import com.google.b.m;
import com.google.b.s;

// Referenced classes of package com.google.b.a.b:
//            b

public final class a
{

    private static final int g[] = {
        3808, 476, 2107, 1799
    };
    private final b a;
    private boolean b;
    private int c;
    private int d;
    private int e;
    private int f;

    public a(b b1)
    {
        a = b1;
    }

    private static float a(s s1, s s2)
    {
        return com.google.b.b.a.a.a(s1.a(), s1.b(), s2.a(), s2.b());
    }

    private static int a(long l, boolean flag)
    {
        boolean flag1 = false;
        int ai[];
        byte byte0;
        int j;
        if (flag)
        {
            j = 7;
            byte0 = 2;
        } else
        {
            j = 10;
            byte0 = 4;
        }
        ai = new int[j];
        for (int k = j - 1; k >= 0; k--)
        {
            ai[k] = (int)l & 0xf;
            l >>= 4;
        }

        int i1;
        try
        {
            (new c(com.google.b.b.b.a.d)).a(ai, j - byte0);
        }
        catch (e e1)
        {
            throw m.a();
        }
        j = 0;
        i1 = ((flag1) ? 1 : 0);
        for (; j < byte0; j++)
        {
            i1 = ai[j] + (i1 << 4);
        }

        return i1;
    }

    private int a(com.google.b.a.b.b b1, com.google.b.a.b.b b2)
    {
        float f3 = b(b1, b2);
        float f4 = (float)(b2.b() - b1.b()) / f3;
        float f5 = (float)(b2.c() - b1.c()) / f3;
        float f1 = b1.b();
        float f2 = b1.c();
        boolean flag1 = a.a(b1.b(), b1.c());
        int k = 0;
        for (int j = 0; (float)j < f3;)
        {
            f1 += f4;
            f2 += f5;
            int l = k;
            if (a.a(com.google.b.b.a.a.a(f1), com.google.b.b.a.a.a(f2)) != flag1)
            {
                l = k + 1;
            }
            j++;
            k = l;
        }

        f1 = (float)k / f3;
        if (f1 > 0.1F && f1 < 0.9F)
        {
            return 0;
        }
        boolean flag;
        if (f1 <= 0.1F)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        return flag != flag1 ? -1 : 1;
    }

    private int a(s s1, s s2, int j)
    {
        int l = 0;
        float f4 = a(s1, s2);
        float f5 = f4 / (float)j;
        float f1 = s1.a();
        float f2 = s1.b();
        float f3 = ((s2.a() - s1.a()) * f5) / f4;
        f4 = (f5 * (s2.b() - s1.b())) / f4;
        for (int k = 0; k < j;)
        {
            int i1 = l;
            if (a.a(com.google.b.b.a.a.a((float)k * f3 + f1), com.google.b.b.a.a.a((float)k * f4 + f2)))
            {
                i1 = l | 1 << j - k - 1;
            }
            k++;
            l = i1;
        }

        return l;
    }

    private static int a(int ai[], int j)
    {
        boolean flag = false;
        int i1 = ai.length;
        int l = 0;
        int k = 0;
        for (; l < i1; l++)
        {
            int j1 = ai[l];
            k = (k << 3) + ((j1 & 1) + ((j1 >> j - 2) << 1));
        }

        for (j = ((flag) ? 1 : 0); j < 4; j++)
        {
            if (Integer.bitCount(g[j] ^ ((k & 1) << 11) + (k >> 1)) <= 2)
            {
                return j;
            }
        }

        throw m.a();
    }

    private com.google.b.a.b.b a()
    {
        s as[] = (new com.google.b.b.a.b(a)).a();
        Object obj;
        s s1;
        s s2;
        s s3;
        s3 = as[0];
        s2 = as[1];
        s1 = as[2];
        obj = as[3];
_L1:
        int j;
        int k;
        j = com.google.b.b.a.a.a((s3.a() + ((s) (obj)).a() + s2.a() + s1.a()) / 4F);
        float f1 = s3.b();
        k = com.google.b.b.a.a.a((((s) (obj)).b() + f1 + s2.b() + s1.b()) / 4F);
        obj = (new com.google.b.b.a.b(a, 15, j, k)).a();
        s3 = obj[0];
        s2 = obj[1];
        s1 = obj[2];
        obj = obj[3];
_L2:
        j = com.google.b.b.a.a.a((s3.a() + ((s) (obj)).a() + s2.a() + s1.a()) / 4F);
        float f2 = s3.b();
        return new com.google.b.a.b.b(j, com.google.b.b.a.a.a((((s) (obj)).b() + f2 + s2.b() + s1.b()) / 4F));
        m m1;
        m1;
        j = a.f() / 2;
        k = a.g() / 2;
        s3 = a(new com.google.b.a.b.b(j + 7, k - 7), false, 1, -1).a();
        s2 = a(new com.google.b.a.b.b(j + 7, k + 7), false, 1, 1).a();
        s1 = a(new com.google.b.a.b.b(j - 7, k + 7), false, -1, 1).a();
        m1 = a(new com.google.b.a.b.b(j - 7, k - 7), false, -1, -1).a();
          goto _L1
        m1;
        s3 = a(new com.google.b.a.b.b(j + 7, k - 7), false, 1, -1).a();
        s2 = a(new com.google.b.a.b.b(j + 7, k + 7), false, 1, 1).a();
        s1 = a(new com.google.b.a.b.b(j - 7, k + 7), false, -1, 1).a();
        m1 = a(new com.google.b.a.b.b(j - 7, k - 7), false, -1, -1).a();
          goto _L2
    }

    private com.google.b.a.b.b a(com.google.b.a.b.b b1, boolean flag, int j, int k)
    {
        int l = b1.b() + j;
        int i1;
        for (i1 = b1.c() + k; a(l, i1) && a.a(l, i1) == flag; i1 += k)
        {
            l += j;
        }

        i1 -= k;
        for (l -= j; a(l, i1) && a.a(l, i1) == flag; l += j) { }
        l -= j;
        for (j = i1; a(l, j) && a.a(l, j) == flag; j += k) { }
        return new com.google.b.a.b.b(l, j - k);
    }

    private b a(b b1, s s1, s s2, s s3, s s4)
    {
        i j = i.a();
        int k = b();
        float f1 = (float)k / 2.0F - (float)e;
        float f2 = (float)k / 2.0F + (float)e;
        return j.a(b1, k, k, f1, f1, f2, f1, f2, f2, f1, f2, s1.a(), s1.b(), s2.a(), s2.b(), s3.a(), s3.b(), s4.a(), s4.b());
    }

    private void a(s as[])
    {
        if (!a(as[0]) || !a(as[1]) || !a(as[2]) || !a(as[3]))
        {
            throw m.a();
        }
        int j = e * 2;
        int ai[] = new int[4];
        ai[0] = a(as[0], as[1], j);
        ai[1] = a(as[1], as[2], j);
        ai[2] = a(as[2], as[3], j);
        ai[3] = a(as[3], as[0], j);
        f = a(ai, j);
        long l = 0L;
        j = 0;
        while (j < 4) 
        {
            int k = ai[(f + j) % 4];
            if (b)
            {
                l = (l << 7) + (long)(k >> 1 & 0x7f);
            } else
            {
                l = (l << 10) + (long)((k >> 1 & 0x1f) + (k >> 2 & 0x3e0));
            }
            j++;
        }
        j = a(l, b);
        if (b)
        {
            c = (j >> 6) + 1;
            d = (j & 0x3f) + 1;
            return;
        } else
        {
            c = (j >> 11) + 1;
            d = (j & 0x7ff) + 1;
            return;
        }
    }

    private boolean a(int j, int k)
    {
        return j >= 0 && j < a.f() && k > 0 && k < a.g();
    }

    private boolean a(com.google.b.a.b.b b1, com.google.b.a.b.b b2, com.google.b.a.b.b b3, com.google.b.a.b.b b4)
    {
        b1 = new com.google.b.a.b.b(b1.b() - 3, b1.c() + 3);
        b2 = new com.google.b.a.b.b(b2.b() - 3, b2.c() - 3);
        b3 = new com.google.b.a.b.b(b3.b() + 3, b3.c() - 3);
        b4 = new com.google.b.a.b.b(b4.b() + 3, 3 + b4.c());
        for (int j = a(b4, b1); j == 0 || a(b1, b2) != j || a(b2, b3) != j || a(b3, b4) != j;)
        {
            return false;
        }

        return true;
    }

    private boolean a(s s1)
    {
        return a(com.google.b.b.a.a.a(s1.a()), com.google.b.b.a.a.a(s1.b()));
    }

    private s[] a(com.google.b.a.b.b b1)
    {
        boolean flag = true;
        e = 1;
        Object obj = b1;
        Object obj1 = b1;
        Object obj2 = b1;
label0:
        do
        {
            com.google.b.a.b.b b2;
            com.google.b.a.b.b b3;
            com.google.b.a.b.b b4;
            com.google.b.a.b.b b5;
label1:
            {
                if (e < 9)
                {
                    b2 = a(((com.google.b.a.b.b) (obj2)), flag, 1, -1);
                    b3 = a(((com.google.b.a.b.b) (obj1)), flag, 1, 1);
                    b4 = a(((com.google.b.a.b.b) (obj)), flag, -1, 1);
                    b5 = a(b1, flag, -1, -1);
                    if (e <= 2)
                    {
                        break label1;
                    }
                    float f1 = (b(b5, b2) * (float)e) / (b(b1, ((com.google.b.a.b.b) (obj2))) * (float)(e + 2));
                    if ((double)f1 >= 0.75D && (double)f1 <= 1.25D && a(b2, b3, b4, b5))
                    {
                        break label1;
                    }
                }
                if (e != 5 && e != 7)
                {
                    throw m.a();
                }
                break label0;
            }
            if (!flag)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            e = e + 1;
            b1 = b5;
            obj = b4;
            obj1 = b3;
            obj2 = b2;
        } while (true);
        float f2;
        float f3;
        if (e == 5)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        b = flag;
        obj2 = new s((float)((com.google.b.a.b.b) (obj2)).b() + 0.5F, (float)((com.google.b.a.b.b) (obj2)).c() - 0.5F);
        obj1 = new s((float)((com.google.b.a.b.b) (obj1)).b() + 0.5F, (float)((com.google.b.a.b.b) (obj1)).c() + 0.5F);
        obj = new s((float)((com.google.b.a.b.b) (obj)).b() - 0.5F, (float)((com.google.b.a.b.b) (obj)).c() + 0.5F);
        b1 = new s((float)b1.b() - 0.5F, (float)b1.c() - 0.5F);
        f2 = e * 2 - 3;
        f3 = e * 2;
        return a(new s[] {
            obj2, obj1, obj, b1
        }, f2, f3);
    }

    private static s[] a(s as[], float f1, float f2)
    {
        f1 = f2 / (2.0F * f1);
        f2 = as[0].a() - as[2].a();
        float f3 = as[0].b() - as[2].b();
        float f4 = (as[0].a() + as[2].a()) / 2.0F;
        float f5 = (as[0].b() + as[2].b()) / 2.0F;
        s s1 = new s(f1 * f2 + f4, f1 * f3 + f5);
        s s2 = new s(f4 - f2 * f1, f5 - f3 * f1);
        f2 = as[1].a() - as[3].a();
        f3 = as[1].b() - as[3].b();
        f4 = (as[1].a() + as[3].a()) / 2.0F;
        f5 = (as[1].b() + as[3].b()) / 2.0F;
        return (new s[] {
            s1, new s(f1 * f2 + f4, f1 * f3 + f5), s2, new s(f4 - f2 * f1, f5 - f1 * f3)
        });
    }

    private static float b(com.google.b.a.b.b b1, com.google.b.a.b.b b2)
    {
        return com.google.b.b.a.a.a(b1.b(), b1.c(), b2.b(), b2.c());
    }

    private int b()
    {
        if (b)
        {
            return c * 4 + 11;
        }
        if (c <= 4)
        {
            return c * 4 + 15;
        } else
        {
            return c * 4 + ((c - 4) / 8 + 1) * 2 + 15;
        }
    }

    private s[] b(s as[])
    {
        return a(as, e * 2, b());
    }

    public com.google.b.a.a a(boolean flag)
    {
        s as[] = a(a());
        if (flag)
        {
            s s1 = as[0];
            as[0] = as[2];
            as[2] = s1;
        }
        a(as);
        return new com.google.b.a.a(a(a, as[f % 4], as[(f + 1) % 4], as[(f + 2) % 4], as[(f + 3) % 4]), b(as), b, d, c);
    }

}
