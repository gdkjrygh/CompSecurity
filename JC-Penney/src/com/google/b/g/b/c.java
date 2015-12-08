// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.b.g.b;

import com.google.b.b.a.a;
import com.google.b.b.b;
import com.google.b.b.g;
import com.google.b.b.i;
import com.google.b.b.k;
import com.google.b.e;
import com.google.b.m;
import com.google.b.s;
import com.google.b.t;
import java.util.Map;

// Referenced classes of package com.google.b.g.b:
//            i, d, e, b, 
//            a

public class c
{

    private final b a;
    private t b;

    public c(b b1)
    {
        a = b1;
    }

    private float a(int j, int l, int i1, int j1)
    {
        boolean flag = false;
        float f1 = b(j, l, i1, j1);
        i1 = j - (i1 - j);
        float f;
        float f2;
        if (i1 < 0)
        {
            f = (float)j / (float)(j - i1);
            i1 = 0;
        } else
        if (i1 >= a.f())
        {
            f = (float)(a.f() - 1 - j) / (float)(i1 - j);
            i1 = a.f();
            i1--;
        } else
        {
            f = 1.0F;
        }
        j1 = (int)((float)l - f * (float)(j1 - l));
        if (j1 < 0)
        {
            f = (float)l / (float)(l - j1);
            j1 = ((flag) ? 1 : 0);
        } else
        if (j1 >= a.g())
        {
            f = (float)(a.g() - 1 - l) / (float)(j1 - l);
            j1 = a.g() - 1;
        } else
        {
            f = 1.0F;
        }
        f2 = j;
        return (b(j, l, (int)(f * (float)(i1 - j) + f2), j1) + f1) - 1.0F;
    }

    private float a(s s1, s s2)
    {
        float f = a((int)s1.a(), (int)s1.b(), (int)s2.a(), (int)s2.b());
        float f1 = a((int)s2.a(), (int)s2.b(), (int)s1.a(), (int)s1.b());
        if (Float.isNaN(f))
        {
            return f1 / 7F;
        }
        if (Float.isNaN(f1))
        {
            return f / 7F;
        } else
        {
            return (f + f1) / 14F;
        }
    }

    private static int a(s s1, s s2, s s3, float f)
    {
        int j = (com.google.b.b.a.a.a(s.a(s1, s2) / f) + com.google.b.b.a.a.a(s.a(s1, s3) / f)) / 2 + 7;
        switch (j & 3)
        {
        case 1: // '\001'
        default:
            return j;

        case 0: // '\0'
            return j + 1;

        case 2: // '\002'
            return j - 1;

        case 3: // '\003'
            throw m.a();
        }
    }

    private static b a(b b1, k k1, int j)
    {
        return i.a().a(b1, j, j, k1);
    }

    private static k a(s s1, s s2, s s3, s s4, int j)
    {
        float f = (float)j - 3.5F;
        float f1;
        float f2;
        float f3;
        float f4;
        if (s4 != null)
        {
            f3 = s4.a();
            f4 = s4.b();
            f2 = f - 3F;
            f1 = f2;
        } else
        {
            f3 = (s2.a() - s1.a()) + s3.a();
            f4 = (s2.b() - s1.b()) + s3.b();
            f2 = f;
            f1 = f;
        }
        return k.a(3.5F, 3.5F, f, 3.5F, f1, f2, 3.5F, f, s1.a(), s1.b(), s2.a(), s2.b(), f3, f4, s3.a(), s3.b());
    }

    private float b(int j, int l, int i1, int j1)
    {
        int k1;
        int l1;
        boolean flag;
        int i2;
        int j2;
        int k2;
        byte byte0;
        int j3;
        int k3;
        if (Math.abs(j1 - l) > Math.abs(i1 - j))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            j2 = j1;
            i2 = i1;
            k1 = l;
            j1 = j;
        } else
        {
            i2 = j1;
            j1 = l;
            k1 = j;
            j2 = i1;
        }
        j3 = Math.abs(j2 - k1);
        k3 = Math.abs(i2 - j1);
        l1 = -j3 / 2;
        if (k1 < j2)
        {
            k2 = 1;
        } else
        {
            k2 = -1;
        }
        if (j1 < i2)
        {
            byte0 = 1;
        } else
        {
            byte0 = -1;
        }
        i1 = 0;
        l = k1;
        j = j1;
        do
        {
label0:
            {
label1:
                {
                    if (l != j2 + k2)
                    {
                        int l2;
                        int i3;
                        boolean flag1;
                        if (flag)
                        {
                            l2 = j;
                        } else
                        {
                            l2 = l;
                        }
                        if (flag)
                        {
                            i3 = l;
                        } else
                        {
                            i3 = j;
                        }
                        if (i1 == 1)
                        {
                            flag1 = true;
                        } else
                        {
                            flag1 = false;
                        }
                        if (flag1 == a.a(l2, i3))
                        {
                            if (i1 == 2)
                            {
                                return com.google.b.b.a.a.a(l, j, k1, j1);
                            }
                            i1++;
                        }
                        l1 += k3;
                        if (l1 <= 0)
                        {
                            break label0;
                        }
                        if (j != i2)
                        {
                            break label1;
                        }
                    }
                    if (i1 == 2)
                    {
                        return com.google.b.b.a.a.a(j2 + k2, i2, k1, j1);
                    } else
                    {
                        return (0.0F / 0.0F);
                    }
                }
                j += byte0;
                l1 -= j3;
            }
            l += k2;
        } while (true);
    }

    protected final float a(s s1, s s2, s s3)
    {
        return (a(s1, s2) + a(s1, s3)) / 2.0F;
    }

    protected final g a(com.google.b.g.b.i j)
    {
        float f;
        Object obj;
        d d1;
        d d2;
        d d3;
        com.google.b.g.a.s s1;
        int l;
        int i1;
        d1 = j.b();
        d2 = j.c();
        d3 = j.a();
        f = a(((s) (d1)), ((s) (d2)), ((s) (d3)));
        if (f < 1.0F)
        {
            throw m.a();
        }
        i1 = a(((s) (d1)), ((s) (d2)), ((s) (d3)), f);
        s1 = com.google.b.g.a.s.a(i1);
        l = s1.d();
        obj = null;
        j = obj;
        if (s1.b().length <= 0) goto _L2; else goto _L1
_L1:
        int j1;
        int k1;
        float f1 = d2.a();
        float f3 = d1.a();
        float f4 = d3.a();
        float f5 = d2.b();
        float f6 = d1.b();
        float f7 = d3.b();
        float f8 = 1.0F - 3F / (float)(l - 7);
        float f9 = d1.a();
        j1 = (int)((((f1 - f3) + f4) - d1.a()) * f8 + f9);
        k1 = (int)(d1.b() + f8 * (((f5 - f6) + f7) - d1.b()));
        l = 4;
_L5:
        j = obj;
        if (l > 16) goto _L2; else goto _L3
_L3:
        float f2 = l;
        j = a(f, j1, k1, f2);
_L2:
        Object obj1 = a(((s) (d1)), ((s) (d2)), ((s) (d3)), ((s) (j)), i1);
        obj1 = a(a, ((k) (obj1)), i1);
        if (j == null)
        {
            j = new s[3];
            j[0] = d3;
            j[1] = d1;
            j[2] = d2;
        } else
        {
            j = (new s[] {
                d3, d1, d2, j
            });
        }
        return new g(((b) (obj1)), j);
        j;
        l <<= 1;
        if (true) goto _L5; else goto _L4
_L4:
    }

    public final g a(Map map)
    {
        t t1;
        if (map == null)
        {
            t1 = null;
        } else
        {
            t1 = (t)map.get(e.j);
        }
        b = t1;
        return a((new com.google.b.g.b.e(a, b)).a(map));
    }

    protected final com.google.b.g.b.a a(float f, int j, int l, float f1)
    {
        int j1 = (int)(f1 * f);
        int i1 = Math.max(0, j - j1);
        j = Math.min(a.f() - 1, j + j1);
        if ((float)(j - i1) < f * 3F)
        {
            throw m.a();
        }
        int k1 = Math.max(0, l - j1);
        l = Math.min(a.g() - 1, j1 + l);
        if ((float)(l - k1) < f * 3F)
        {
            throw m.a();
        } else
        {
            return (new com.google.b.g.b.b(a, i1, k1, j - i1, l - k1, f, b)).a();
        }
    }
}
