// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.b.f.a;

import com.google.b.h;
import com.google.b.s;

// Referenced classes of package com.google.b.f.a:
//            i, d, a, c, 
//            b

final class j extends i
{

    private final boolean a;

    j(c c1, boolean flag)
    {
        super(c1);
        a = flag;
    }

    private void a(d ad[], a a1)
    {
        int k = 0;
_L5:
        if (k >= ad.length) goto _L2; else goto _L1
_L1:
        d d1 = ad[k];
        if (ad[k] != null) goto _L4; else goto _L3
_L3:
        k++;
          goto _L5
_L4:
        int j1 = d1.g() % 30;
        int i1 = d1.h();
        if (i1 > a1.c())
        {
            ad[k] = null;
            continue; /* Loop/switch isn't completed */
        }
        int l = i1;
        if (!a)
        {
            l = i1 + 2;
        }
        switch (l % 3)
        {
        case 0: // '\0'
            if (j1 * 3 + 1 != a1.d())
            {
                ad[k] = null;
            }
            break;

        case 1: // '\001'
            if (j1 / 3 != a1.b() || j1 % 3 != a1.e())
            {
                ad[k] = null;
            }
            break;

        case 2: // '\002'
            if (j1 + 1 != a1.a())
            {
                ad[k] = null;
            }
            break;
        }
        if (true) goto _L3; else goto _L2
_L2:
    }

    int a(a a1)
    {
        d ad[] = b();
        c();
        a(ad, a1);
        Object obj = a();
        float f1;
        s s1;
        int k;
        int l;
        int i1;
        int k2;
        int k3;
        if (a)
        {
            s1 = ((c) (obj)).e();
        } else
        {
            s1 = ((c) (obj)).f();
        }
        if (a)
        {
            obj = ((c) (obj)).g();
        } else
        {
            obj = ((c) (obj)).h();
        }
        k2 = b((int)s1.b());
        k3 = b((int)((s) (obj)).b());
        f1 = (float)(k3 - k2) / (float)a1.c();
        l = -1;
        i1 = 0;
        k = 1;
        while (k2 < k3) 
        {
            int k1;
            if (ad[k2] == null)
            {
                int j1 = i1;
                i1 = l;
                l = k;
                k = j1;
            } else
            {
                d d1 = ad[k2];
                int l2 = d1.h() - l;
                if (l2 == 0)
                {
                    l2 = i1 + 1;
                    i1 = k;
                    int l1 = l;
                    k = l2;
                    l = i1;
                    i1 = l1;
                } else
                if (l2 == 1)
                {
                    l = Math.max(k, i1);
                    i1 = d1.h();
                    k = 1;
                } else
                if (l2 < 0 || d1.h() >= a1.c() || l2 > k2)
                {
                    ad[k2] = null;
                    int i2 = k;
                    l2 = l;
                    k = i1;
                    l = i2;
                    i1 = l2;
                } else
                {
                    if (k > 2)
                    {
                        l2 *= k - 2;
                    }
                    boolean flag;
                    int j3;
                    if (l2 >= k2)
                    {
                        flag = true;
                    } else
                    {
                        flag = false;
                    }
                    j3 = 1;
                    while (j3 <= l2 && !flag) 
                    {
                        if (ad[k2 - j3] != null)
                        {
                            flag = true;
                        } else
                        {
                            flag = false;
                        }
                        j3++;
                    }
                    if (flag)
                    {
                        ad[k2] = null;
                        int j2 = k;
                        int i3 = l;
                        k = i1;
                        l = j2;
                        i1 = i3;
                    } else
                    {
                        i1 = d1.h();
                        l = k;
                        k = 1;
                    }
                }
            }
            k2++;
            k1 = i1;
            i1 = k;
            k = l;
            l = k1;
        }
        return (int)((double)f1 + 0.5D);
    }

    int b(a a1)
    {
        Object obj1 = a();
        float f1;
        Object obj;
        int k;
        int l;
        int i1;
        int j1;
        int k1;
        if (a)
        {
            obj = ((c) (obj1)).e();
        } else
        {
            obj = ((c) (obj1)).f();
        }
        if (a)
        {
            obj1 = ((c) (obj1)).g();
        } else
        {
            obj1 = ((c) (obj1)).h();
        }
        i1 = b((int)((s) (obj)).b());
        k1 = b((int)((s) (obj1)).b());
        f1 = (float)(k1 - i1) / (float)a1.c();
        obj = b();
        l = -1;
        k = 0;
        j1 = 1;
        while (i1 < k1) 
        {
            if (obj[i1] != null)
            {
                d d1 = obj[i1];
                d1.b();
                int l1 = d1.h() - l;
                if (l1 == 0)
                {
                    k++;
                } else
                if (l1 == 1)
                {
                    j1 = Math.max(j1, k);
                    l = d1.h();
                    k = 1;
                } else
                if (d1.h() >= a1.c())
                {
                    obj[i1] = null;
                } else
                {
                    l = d1.h();
                    k = 1;
                }
            }
            i1++;
        }
        return (int)((double)f1 + 0.5D);
    }

    void c()
    {
        d ad[] = b();
        int l = ad.length;
        for (int k = 0; k < l; k++)
        {
            d d1 = ad[k];
            if (d1 != null)
            {
                d1.b();
            }
        }

    }

    int[] d()
    {
        Object obj = e();
        if (obj != null) goto _L2; else goto _L1
_L1:
        obj = null;
_L4:
        return ((int []) (obj));
_L2:
        b(((a) (obj)));
        int ai[] = new int[((a) (obj)).c()];
        d ad[] = b();
        int l = ad.length;
        int k = 0;
        do
        {
            obj = ai;
            if (k >= l)
            {
                continue;
            }
            obj = ad[k];
            if (obj != null)
            {
                int i1 = ((d) (obj)).h();
                if (i1 >= ai.length)
                {
                    throw h.a();
                }
                ai[i1] = ai[i1] + 1;
            }
            k++;
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
    }

    a e()
    {
        d ad[];
        Object obj;
        b b1;
        b b2;
        b b3;
        int k;
        int j1;
        ad = b();
        obj = new b();
        b1 = new b();
        b2 = new b();
        b3 = new b();
        j1 = ad.length;
        k = 0;
_L5:
        if (k >= j1) goto _L2; else goto _L1
_L1:
        d d1 = ad[k];
        if (d1 != null) goto _L4; else goto _L3
_L3:
        k++;
          goto _L5
_L4:
        d1.b();
        int k1 = d1.g() % 30;
        int i1 = d1.h();
        int l = i1;
        if (!a)
        {
            l = i1 + 2;
        }
        switch (l % 3)
        {
        case 0: // '\0'
            b1.a(k1 * 3 + 1);
            break;

        case 1: // '\001'
            b3.a(k1 / 3);
            b2.a(k1 % 3);
            break;

        case 2: // '\002'
            ((b) (obj)).a(k1 + 1);
            break;
        }
        continue; /* Loop/switch isn't completed */
_L2:
        if (((b) (obj)).a().length == 0 || b1.a().length == 0 || b2.a().length == 0 || b3.a().length == 0 || ((b) (obj)).a()[0] < 1 || b1.a()[0] + b2.a()[0] < 3 || b1.a()[0] + b2.a()[0] > 90)
        {
            return null;
        } else
        {
            obj = new a(((b) (obj)).a()[0], b1.a()[0], b2.a()[0], b3.a()[0]);
            a(ad, ((a) (obj)));
            return ((a) (obj));
        }
        if (true) goto _L3; else goto _L6
_L6:
    }

    boolean f()
    {
        return a;
    }

    public String toString()
    {
        return (new StringBuilder()).append("IsLeft: ").append(a).append('\n').append(super.toString()).toString();
    }
}
