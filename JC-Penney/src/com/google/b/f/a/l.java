// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.b.f.a;

import com.google.b.b.b;
import com.google.b.b.e;
import com.google.b.d;
import com.google.b.f.a.a.a;
import com.google.b.h;
import com.google.b.m;
import com.google.b.s;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

// Referenced classes of package com.google.b.f.a:
//            h, i, d, c, 
//            j, b, e, k, 
//            a

public final class l
{

    private static final a a = new a();

    private static int a(int i1)
    {
        return 2 << i1;
    }

    private static int a(com.google.b.f.a.h h1, int i1, int j1, boolean flag)
    {
        com.google.b.f.a.d d1;
        int k1;
        if (flag)
        {
            k1 = 1;
        } else
        {
            k1 = -1;
        }
        d1 = null;
        if (a(h1, i1 - k1))
        {
            d1 = h1.a(i1 - k1).c(j1);
        }
        if (d1 != null)
        {
            if (flag)
            {
                return d1.e();
            } else
            {
                return d1.d();
            }
        }
        d1 = h1.a(i1).a(j1);
        if (d1 != null)
        {
            if (flag)
            {
                return d1.d();
            } else
            {
                return d1.e();
            }
        }
        if (a(h1, i1 - k1))
        {
            d1 = h1.a(i1 - k1).a(j1);
        }
        if (d1 != null)
        {
            if (flag)
            {
                return d1.e();
            } else
            {
                return d1.d();
            }
        }
        boolean flag1 = false;
        j1 = i1;
        i1 = ((flag1) ? 1 : 0);
        int l1;
        for (; a(h1, j1 - k1); j1 = l1)
        {
            l1 = j1 - k1;
            com.google.b.f.a.d ad[] = h1.a(l1).b();
            int i2 = ad.length;
            for (j1 = 0; j1 < i2; j1++)
            {
                com.google.b.f.a.d d2 = ad[j1];
                if (d2 != null)
                {
                    if (flag)
                    {
                        j1 = d2.e();
                    } else
                    {
                        j1 = d2.d();
                    }
                    return k1 * i1 * (d2.e() - d2.d()) + j1;
                }
            }

            i1++;
        }

        if (flag)
        {
            return h1.e().a();
        } else
        {
            return h1.e().b();
        }
    }

    private static int a(int ai[])
    {
        int j1 = -1;
        int k1 = ai.length;
        for (int i1 = 0; i1 < k1; i1++)
        {
            j1 = Math.max(j1, ai[i1]);
        }

        return j1;
    }

    private static int a(int ai[], int ai1[], int i1)
    {
        if (ai1 != null && ai1.length > i1 / 2 + 3 || i1 < 0 || i1 > 512)
        {
            throw d.a();
        } else
        {
            return a.a(ai, i1, ai1);
        }
    }

    private static e a(int i1, int ai[], int ai1[], int ai2[], int ai3[][])
    {
        int ai4[] = new int[ai2.length];
        int j1 = 100;
label0:
        do
        {
            if (j1 > 0)
            {
                for (int k1 = 0; k1 < ai4.length; k1++)
                {
                    ai[ai2[k1]] = ai3[k1][ai4[k1]];
                }

                e e1;
                try
                {
                    e1 = a(ai, i1, ai1);
                }
                catch (d d1)
                {
                    if (ai4.length == 0)
                    {
                        throw d.a();
                    }
                    int l1 = 0;
                    do
                    {
label1:
                        {
                            if (l1 < ai4.length)
                            {
                                if (ai4[l1] >= ai3[l1].length - 1)
                                {
                                    break label1;
                                }
                                ai4[l1] = ai4[l1] + 1;
                            }
                            j1--;
                            continue label0;
                        }
                        ai4[l1] = 0;
                        if (l1 == ai4.length - 1)
                        {
                            throw d.a();
                        }
                        l1++;
                    } while (true);
                }
                return e1;
            }
            throw d.a();
        } while (true);
    }

    public static e a(b b1, s s1, s s2, s s3, s s4, int i1, int j1)
    {
        com.google.b.f.a.h h1;
        c c1;
        int l1;
        int i2;
        int j2;
        int k2;
        int i3;
        int j3;
        boolean flag;
        {
            s s5;
            s s6;
label0:
            {
                c1 = new c(b1, s1, s2, s3, s4);
                s2 = null;
                int k1 = 0;
                h1 = null;
                s4 = null;
                do
                {
                    s6 = s4;
                    s5 = s2;
                    if (k1 >= 2)
                    {
                        break label0;
                    }
                    if (s1 != null)
                    {
                        s4 = a(b1, c1, s1, true, i1, j1);
                    }
                    if (s3 != null)
                    {
                        s2 = a(b1, c1, s3, false, i1, j1);
                    }
                    h1 = a(((j) (s4)), ((j) (s2)));
                    if (h1 == null)
                    {
                        throw m.a();
                    }
                    if (k1 != 0 || h1.e() == null || h1.e().c() >= c1.c() && h1.e().d() <= c1.d())
                    {
                        break;
                    }
                    c1 = h1.e();
                    k1++;
                } while (true);
                h1.a(c1);
                s5 = s2;
                s6 = s4;
            }
            j3 = h1.b() + 1;
            h1.a(0, s6);
            h1.a(j3, s5);
            if (s6 != null)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            i2 = 1;
            l1 = j1;
            j1 = i2;
            i2 = i1;
        }
        if (j1 > j3)
        {
            break MISSING_BLOCK_LABEL_485;
        }
        if (flag)
        {
            k2 = j1;
        } else
        {
            k2 = j3 - j1;
        }
        if (h1.a(k2) == null) goto _L2; else goto _L1
_L1:
        j2 = l1;
        i3 = i2;
_L4:
        j1++;
        i2 = i3;
        l1 = j2;
        break MISSING_BLOCK_LABEL_215;
_L2:
        int l2;
        if (k2 == 0 || k2 == j3)
        {
            boolean flag1;
            if (k2 == 0)
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            s1 = new j(c1, flag1);
        } else
        {
            s1 = new i(c1);
        }
        h1.a(k2, s1);
        l2 = c1.c();
        i1 = -1;
        i3 = i2;
        j2 = l1;
        if (l2 > c1.d()) goto _L4; else goto _L3
_L3:
        i3 = a(h1, k2, l2, flag);
        if (i3 >= 0)
        {
            j2 = i3;
            if (i3 <= c1.b())
            {
                break MISSING_BLOCK_LABEL_420;
            }
        }
        if (i1 != -1) goto _L6; else goto _L5
_L5:
        l2++;
        break MISSING_BLOCK_LABEL_332;
_L6:
        j2 = i1;
        s2 = a(b1, c1.a(), c1.b(), flag, j2, l2, i2, l1);
        if (s2 != null)
        {
            s1.a(l2, s2);
            i2 = Math.min(i2, s2.c());
            l1 = Math.max(l1, s2.c());
            i1 = j2;
        }
        if (true) goto _L5; else goto _L7
_L7:
        return a(h1);
    }

    private static e a(com.google.b.f.a.h h1)
    {
        boolean flag = false;
        Object aobj[][] = b(h1);
        a(h1, ((com.google.b.f.a.b [][]) (aobj)));
        ArrayList arraylist = new ArrayList();
        int ai[] = new int[h1.c() * h1.b()];
        ArrayList arraylist1 = new ArrayList();
        ArrayList arraylist2 = new ArrayList();
        for (int i1 = 0; i1 < h1.c(); i1++)
        {
            int k1 = 0;
            while (k1 < h1.b()) 
            {
                int ai1[] = aobj[i1][k1 + 1].a();
                int l1 = h1.b() * i1 + k1;
                if (ai1.length == 0)
                {
                    arraylist.add(Integer.valueOf(l1));
                } else
                if (ai1.length == 1)
                {
                    ai[l1] = ai1[0];
                } else
                {
                    arraylist2.add(Integer.valueOf(l1));
                    arraylist1.add(ai1);
                }
                k1++;
            }
        }

        aobj = new int[arraylist1.size()][];
        for (int j1 = ((flag) ? 1 : 0); j1 < aobj.length; j1++)
        {
            aobj[j1] = (int[])arraylist1.get(j1);
        }

        return a(h1.d(), ai, com.google.b.f.a.a(arraylist), com.google.b.f.a.a(arraylist2), ((int [][]) (aobj)));
    }

    private static e a(int ai[], int i1, int ai1[])
    {
        if (ai.length == 0)
        {
            throw h.a();
        } else
        {
            int j1 = 1 << i1 + 1;
            int k1 = a(ai, ai1, j1);
            a(ai, j1);
            ai = com.google.b.f.a.e.a(ai, String.valueOf(i1));
            ai.a(Integer.valueOf(k1));
            ai.b(Integer.valueOf(ai1.length));
            return ai;
        }
    }

    private static c a(j j1)
    {
        int ai[];
        if (j1 != null)
        {
            if ((ai = j1.d()) != null)
            {
                int k2 = a(ai);
                int j2 = ai.length;
                int i2 = 0;
                int i1 = 0;
                com.google.b.f.a.d ad[];
label0:
                do
                {
label1:
                    {
                        int k1 = i1;
                        if (i2 < j2)
                        {
                            k1 = ai[i2];
                            i1 += k2 - k1;
                            if (k1 <= 0)
                            {
                                break label1;
                            }
                            k1 = i1;
                        }
                        ad = j1.b();
                        i1 = 0;
                        for (i2 = k1; i2 > 0 && ad[i1] == null; i1++)
                        {
                            i2--;
                        }

                        break label0;
                    }
                    i2++;
                } while (true);
                int l1 = ai.length;
                i1 = 0;
                j2 = l1 - 1;
label2:
                do
                {
label3:
                    {
                        l1 = i1;
                        if (j2 >= 0)
                        {
                            i1 += k2 - ai[j2];
                            if (ai[j2] <= 0)
                            {
                                break label3;
                            }
                            l1 = i1;
                        }
                        i1 = ad.length;
                        for (i1--; l1 > 0 && ad[i1] == null; i1--)
                        {
                            l1--;
                        }

                        break label2;
                    }
                    j2--;
                } while (true);
                return j1.a().a(i2, l1, j1.f());
            }
        }
        return null;
    }

    private static com.google.b.f.a.d a(b b1, int i1, int j1, boolean flag, int k1, int l1, int i2, int j2)
    {
        k1 = b(b1, i1, j1, flag, k1, l1);
        b1 = a(b1, i1, j1, flag, k1, l1);
        if (b1 == null)
        {
            return null;
        }
        j1 = com.google.b.f.a.a(b1);
        if (flag)
        {
            i1 = k1;
            k1 += j1;
        } else
        {
            for (i1 = 0; i1 < b1.length / 2; i1++)
            {
                l1 = b1[i1];
                b1[i1] = b1[b1.length - 1 - i1];
                b1[b1.length - 1 - i1] = l1;
            }

            i1 = k1 - j1;
        }
        if (!a(j1, i2, j2))
        {
            return null;
        }
        j1 = com.google.b.f.a.k.a(b1);
        l1 = com.google.b.f.a.a(j1);
        if (l1 == -1)
        {
            return null;
        } else
        {
            return new com.google.b.f.a.d(i1, k1, c(j1), l1);
        }
    }

    private static com.google.b.f.a.h a(j j1, j j2)
    {
        com.google.b.f.a.a a1;
        if (j1 != null || j2 != null)
        {
            if ((a1 = b(j1, j2)) != null)
            {
                return new com.google.b.f.a.h(a1, com.google.b.f.a.c.a(a(j1), a(j2)));
            }
        }
        return null;
    }

    private static j a(b b1, c c1, s s1, boolean flag, int i1, int j1)
    {
        j j2 = new j(c1, flag);
        for (int l1 = 0; l1 < 2; l1++)
        {
            int k1;
            int i2;
            int k2;
            if (l1 == 0)
            {
                i2 = 1;
            } else
            {
                i2 = -1;
            }
            k1 = (int)s1.a();
            k2 = (int)s1.b();
            while (k2 <= c1.d() && k2 >= c1.c()) 
            {
                com.google.b.f.a.d d1 = a(b1, 0, b1.f(), flag, k1, k2, i1, j1);
                if (d1 != null)
                {
                    j2.a(k2, d1);
                    if (flag)
                    {
                        k1 = d1.d();
                    } else
                    {
                        k1 = d1.e();
                    }
                }
                k2 += i2;
            }
        }

        return j2;
    }

    private static void a(com.google.b.f.a.h h1, com.google.b.f.a.b ab[][])
    {
        int ai[] = ab[0][1].a();
        int i1 = h1.b() * h1.c() - a(h1.d());
        if (ai.length == 0)
        {
            if (i1 < 1 || i1 > 928)
            {
                throw m.a();
            }
            ab[0][1].a(i1);
        } else
        if (ai[0] != i1)
        {
            ab[0][1].a(i1);
            return;
        }
    }

    private static void a(int ai[], int i1)
    {
label0:
        {
            if (ai.length < 4)
            {
                throw h.a();
            }
            int j1 = ai[0];
            if (j1 > ai.length)
            {
                throw h.a();
            }
            if (j1 == 0)
            {
                if (i1 >= ai.length)
                {
                    break label0;
                }
                ai[0] = ai.length - i1;
            }
            return;
        }
        throw h.a();
    }

    private static boolean a(int i1, int j1, int k1)
    {
        return j1 - 2 <= i1 && i1 <= k1 + 2;
    }

    private static boolean a(com.google.b.f.a.h h1, int i1)
    {
        return i1 >= 0 && i1 <= h1.b() + 1;
    }

    private static int[] a(b b1, int i1, int j1, boolean flag, int k1, int l1)
    {
        int ai[] = new int[8];
        int i2;
        int j2;
        boolean flag1;
        if (flag)
        {
            i2 = 1;
        } else
        {
            i2 = -1;
        }
        flag1 = flag;
        for (j2 = 0; (flag && k1 < j1 || !flag && k1 >= i1) && j2 < ai.length;)
        {
            if (b1.a(k1, l1) == flag1)
            {
                ai[j2] = ai[j2] + 1;
                k1 += i2;
            } else
            {
                j2++;
                if (!flag1)
                {
                    flag1 = true;
                } else
                {
                    flag1 = false;
                }
            }
        }

        if (j2 == ai.length || (flag && k1 == j1 || !flag && k1 == i1) && j2 == ai.length - 1)
        {
            return ai;
        } else
        {
            return null;
        }
    }

    private static int b(b b1, int i1, int j1, boolean flag, int k1, int l1)
    {
        int i2;
        int j2;
        int k2;
        if (flag)
        {
            i2 = -1;
        } else
        {
            i2 = 1;
        }
        j2 = 0;
        k2 = i2;
        i2 = k1;
        while (j2 < 2) 
        {
            for (; (flag && i2 >= i1 || !flag && i2 < j1) && flag == b1.a(i2, l1); i2 += k2)
            {
                if (Math.abs(k1 - i2) > 2)
                {
                    return k1;
                }
            }

            k2 = -k2;
            if (!flag)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            j2++;
        }
        return i2;
    }

    private static int b(int ai[])
    {
        return ((((ai[0] - ai[2]) + ai[4]) - ai[6]) + 9) % 9;
    }

    private static com.google.b.f.a.a b(j j1, j j2)
    {
        if (j1 == null) goto _L2; else goto _L1
_L1:
        j1 = j1.e();
        if (j1 != null) goto _L3; else goto _L2
_L2:
        if (j2 != null) goto _L5; else goto _L4
_L4:
        return null;
_L5:
        return j2.e();
_L3:
        if (j2 != null)
        {
            j2 = j2.e();
            if (j2 != null)
            {
                continue; /* Loop/switch isn't completed */
            }
        }
        return j1;
        if (j1.() != j2.() && j1.b() != j2.b() && j1.c() != j2.c()) goto _L4; else goto _L6
_L6:
        return j1;
    }

    private static int[] b(int i1)
    {
        int ai[] = new int[8];
        int l1 = 0;
        int k1 = ai.length - 1;
        do
        {
            int j1 = k1;
            int i2 = l1;
            if ((i1 & 1) != l1)
            {
                i2 = i1 & 1;
                k1--;
                j1 = k1;
                if (k1 < 0)
                {
                    return ai;
                }
            }
            ai[j1] = ai[j1] + 1;
            i1 >>= 1;
            k1 = j1;
            l1 = i2;
        } while (true);
    }

    private static com.google.b.f.a.b[][] b(com.google.b.f.a.h h1)
    {
        com.google.b.f.a.b ab[][] = (com.google.b.f.a.b[][])Array.newInstance(com/google/b/f/a/b, new int[] {
            h1.c(), h1.b() + 2
        });
        for (int j1 = 0; j1 < ab.length; j1++)
        {
            for (int l1 = 0; l1 < ab[j1].length; l1++)
            {
                ab[j1][l1] = new com.google.b.f.a.b();
            }

        }

        h1 = h1.a();
        int k2 = h1.length;
        int k1 = 0;
        int i2 = 0;
        for (; k1 < k2; k1++)
        {
            i i1 = h1[k1];
            if (i1 != null)
            {
                com.google.b.f.a.d ad[] = i1.b();
                int l2 = ad.length;
                for (int j2 = 0; j2 < l2; j2++)
                {
                    com.google.b.f.a.d d1 = ad[j2];
                    if (d1 == null)
                    {
                        continue;
                    }
                    int i3 = d1.h();
                    if (i3 < 0)
                    {
                        continue;
                    }
                    if (i3 >= ab.length)
                    {
                        throw h.a();
                    }
                    ab[i3][i2].a(d1.g());
                }

            }
            i2++;
        }

        return ab;
    }

    private static int c(int i1)
    {
        return b(b(i1));
    }

}
