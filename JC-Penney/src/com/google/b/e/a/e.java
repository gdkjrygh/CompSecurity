// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.b.e.a;

import com.google.b.b.a;
import com.google.b.m;
import com.google.b.q;
import com.google.b.s;
import com.google.b.t;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

// Referenced classes of package com.google.b.e.a:
//            a, c, f, b, 
//            d

public final class e extends com.google.b.e.a.a
{

    private static final int a[] = {
        1, 10, 34, 70, 126
    };
    private static final int b[] = {
        4, 20, 48, 81
    };
    private static final int c[] = {
        0, 161, 961, 2015, 2715
    };
    private static final int d[] = {
        0, 336, 1036, 1516
    };
    private static final int e[] = {
        8, 6, 4, 3, 1
    };
    private static final int f[] = {
        2, 4, 6, 8
    };
    private static final int g[][];
    private final List h = new ArrayList();
    private final List i = new ArrayList();

    public e()
    {
    }

    private b a(a a1, c c1, boolean flag)
    {
        int ai[] = c();
        ai[0] = 0;
        ai[1] = 0;
        ai[2] = 0;
        ai[3] = 0;
        ai[4] = 0;
        ai[5] = 0;
        ai[6] = 0;
        ai[7] = 0;
        float f1;
        float af[];
        float af1[];
        int i1;
        int j1;
        if (flag)
        {
            b(a1, c1.b()[0], ai);
        } else
        {
            a(a1, c1.b()[1] + 1, ai);
            i1 = 0;
            j = ai.length - 1;
            while (i1 < j) 
            {
                j1 = ai[i1];
                ai[i1] = ai[j];
                ai[j] = j1;
                i1++;
                j--;
            }
        }
        if (flag)
        {
            i1 = 16;
        } else
        {
            i1 = 15;
        }
        f1 = (float)a(ai) / (float)i1;
        a1 = f();
        c1 = g();
        af = d();
        af1 = e();
        j1 = 0;
        while (j1 < ai.length) 
        {
            float f2 = (float)ai[j1] / f1;
            int k1 = (int)(0.5F + f2);
            int j;
            if (k1 < 1)
            {
                j = 1;
            } else
            {
                j = k1;
                if (k1 > 8)
                {
                    j = 8;
                }
            }
            k1 = j1 / 2;
            if ((j1 & 1) == 0)
            {
                a1[k1] = j;
                af[k1] = f2 - (float)j;
            } else
            {
                c1[k1] = j;
                af1[k1] = f2 - (float)j;
            }
            j1++;
        }
        a(flag, i1);
        j1 = a1.length - 1;
        i1 = 0;
        int k;
        int l1;
        for (k = 0; j1 >= 0; k = l1 + k)
        {
            int k2 = a1[j1];
            l1 = a1[j1];
            j1--;
            i1 = i1 * 9 + k2;
        }

        int l2 = 0;
        j1 = 0;
        for (int i2 = c1.length - 1; i2 >= 0; i2--)
        {
            l2 = l2 * 9 + c1[i2];
            j1 += c1[i2];
        }

        i1 += l2 * 3;
        if (flag)
        {
            if ((k & 1) != 0 || k > 12 || k < 4)
            {
                throw m.a();
            } else
            {
                k = (12 - k) / 2;
                int j2 = e[k];
                j1 = com.google.b.e.a.f.a(a1, j2, false);
                j2 = com.google.b.e.a.f.a(c1, 9 - j2, true);
                return new b(j1 * a[k] + j2 + c[k], i1);
            }
        }
        if ((j1 & 1) != 0 || j1 > 10 || j1 < 4)
        {
            throw m.a();
        } else
        {
            int l = (10 - j1) / 2;
            j1 = f[l];
            return new b(com.google.b.e.a.f.a(a1, j1, true) + com.google.b.e.a.f.a(c1, 9 - j1, false) * b[l] + d[l], i1);
        }
    }

    private c a(a a1, int j, boolean flag, int ai[])
    {
        boolean flag1 = a1.a(ai[0]);
        int k;
        for (k = ai[0] - 1; k >= 0 && a1.a(k) ^ flag1; k--) { }
        int i1 = k + 1;
        k = ai[0];
        int ai1[] = b();
        System.arraycopy(ai1, 0, ai1, 1, ai1.length - 1);
        ai1[0] = k - i1;
        int j1 = a(ai1, g);
        int l = ai[1];
        if (flag)
        {
            k = a1.a() - 1 - i1;
            l = a1.a() - 1 - l;
        } else
        {
            k = i1;
        }
        return new c(j1, new int[] {
            i1, ai[1]
        }, k, l, j);
    }

    private d a(a a1, boolean flag, int j, Map map)
    {
        c c1;
        int ai[];
        try
        {
            ai = a(a1, 0, flag);
            c1 = a(a1, j, flag, ai);
        }
        // Misplaced declaration of an exception variable
        catch (a a1)
        {
            return null;
        }
        if (map != null)
        {
            break MISSING_BLOCK_LABEL_140;
        }
        float f1;
        float f2;
        for (map = null; map == null; map = (t)map.get(com.google.b.e.j))
        {
            break MISSING_BLOCK_LABEL_85;
        }

        f2 = (float)(ai[0] + ai[1]) / 2.0F;
        f1 = f2;
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_67;
        }
        f1 = (float)(a1.a() - 1) - f2;
        map.a(new s(f1, j));
        map = a(a1, c1, true);
        a1 = a(a1, c1, false);
        return new d(map.a() * 1597 + a1.a(), map.b() + a1.b() * 4, c1);
    }

    private static q a(d d1, d d2)
    {
        Object obj = String.valueOf(0x453af5L * (long)d1.a() + (long)d2.a());
        Object obj1 = new StringBuilder(14);
        for (int j = 13 - ((String) (obj)).length(); j > 0; j--)
        {
            ((StringBuilder) (obj1)).append('0');
        }

        ((StringBuilder) (obj1)).append(((String) (obj)));
        int k = 0;
        int l = 0;
        for (; k < 13; k++)
        {
            int j1 = ((StringBuilder) (obj1)).charAt(k) - 48;
            int i1 = j1;
            if ((k & 1) == 0)
            {
                i1 = j1 * 3;
            }
            l += i1;
        }

        l = 10 - l % 10;
        k = l;
        if (l == 10)
        {
            k = 0;
        }
        ((StringBuilder) (obj1)).append(k);
        s as1[] = d1.c().c();
        s as[] = d2.c().c();
        d1 = String.valueOf(((StringBuilder) (obj1)).toString());
        d2 = as1[0];
        obj1 = as1[1];
        s s1 = as[0];
        as = as[1];
        com.google.b.a a1 = com.google.b.a.m;
        return new q(d1, null, new s[] {
            d2, obj1, s1, as
        }, a1);
    }

    private static void a(Collection collection, d d1)
    {
        if (d1 != null) goto _L2; else goto _L1
_L1:
        return;
_L2:
        boolean flag;
        Iterator iterator = collection.iterator();
        d d2;
        do
        {
            if (!iterator.hasNext())
            {
                break; /* Loop/switch isn't completed */
            }
            d2 = (d)iterator.next();
        } while (d2.a() != d1.a());
        d2.e();
        flag = true;
_L4:
        if (!flag)
        {
            collection.add(d1);
            return;
        }
        if (true) goto _L1; else goto _L3
_L3:
        flag = false;
          goto _L4
        if (true) goto _L1; else goto _L5
_L5:
    }

    private void a(boolean flag, int j)
    {
        int k;
        int l;
        boolean flag1;
        boolean flag2;
        boolean flag3;
        boolean flag4;
        int k1;
        int l1;
        int i2;
        flag1 = false;
        flag4 = true;
        k1 = a(f());
        l1 = a(g());
        i2 = (k1 + l1) - j;
        if (flag)
        {
            j = 1;
        } else
        {
            j = 0;
        }
        if ((k1 & 1) == j)
        {
            flag2 = true;
        } else
        {
            flag2 = false;
        }
        if ((l1 & 1) == 1)
        {
            flag3 = true;
        } else
        {
            flag3 = false;
        }
        if (!flag) goto _L2; else goto _L1
_L1:
        int i1;
        int j1;
        if (k1 > 12)
        {
            l = 1;
            k = 0;
        } else
        if (k1 < 4)
        {
            l = 0;
            k = 1;
        } else
        {
            l = 0;
            k = 0;
        }
        if (l1 <= 12) goto _L4; else goto _L3
_L3:
        j = 0;
        flag1 = true;
_L7:
        if (i2 == 1)
        {
            if (flag2)
            {
                if (flag3)
                {
                    throw m.a();
                }
                l = j;
                j = 1;
                do
                {
                    if (k != 0)
                    {
                        if (j != 0)
                        {
                            throw m.a();
                        }
                        a(f(), d());
                    }
                    if (j != 0)
                    {
                        b(f(), d());
                    }
                    if (l != 0)
                    {
                        if (flag1)
                        {
                            throw m.a();
                        }
                        a(g(), d());
                    }
                    if (flag1)
                    {
                        b(g(), e());
                    }
                    return;
                } while (true);
            } else
            {
                if (!flag3)
                {
                    throw m.a();
                }
                flag1 = true;
                i1 = l;
                l = j;
                j = i1;
                continue;
            }
        } else
        {
            if (i2 == -1)
            {
                if (flag2)
                {
                    if (flag3)
                    {
                        throw m.a();
                    }
                    k = l;
                    i1 = 1;
                    l = j;
                    j = k;
                    k = i1;
                } else
                {
                    if (!flag3)
                    {
                        throw m.a();
                    }
                    j = l;
                    l = ((flag4) ? 1 : 0);
                }
                continue;
            }
            if (i2 == 0)
            {
                if (flag2)
                {
                    if (!flag3)
                    {
                        throw m.a();
                    }
                    if (k1 < l1)
                    {
                        flag1 = true;
                        k = l;
                        i1 = 1;
                        l = j;
                        j = k;
                        k = i1;
                    } else
                    {
                        j = 1;
                        l = ((flag4) ? 1 : 0);
                    }
                    continue;
                }
                if (flag3)
                {
                    throw m.a();
                }
            } else
            {
                throw m.a();
            }
            i1 = l;
            l = j;
            j = i1;
            continue;
        }
_L4:
        j1 = l;
        i1 = k;
        if (l1 < 4)
        {
            j = 1;
            continue; /* Loop/switch isn't completed */
        }
          goto _L5
_L2:
        if (k1 > 11)
        {
            l = 1;
            k = 0;
        } else
        if (k1 < 5)
        {
            l = 0;
            k = 1;
        } else
        {
            l = 0;
            k = 0;
        }
        if (l1 > 10)
        {
            j = 0;
            flag1 = true;
            continue; /* Loop/switch isn't completed */
        }
        j1 = l;
        i1 = k;
        if (l1 < 4)
        {
            j = 1;
            continue; /* Loop/switch isn't completed */
        }
_L5:
        j = 0;
        l = j1;
        k = i1;
        if (true) goto _L7; else goto _L6
_L6:
    }

    private int[] a(a a1, int j, boolean flag)
    {
        int ai[] = b();
        ai[0] = 0;
        ai[1] = 0;
        ai[2] = 0;
        ai[3] = 0;
        int j1 = a1.a();
        boolean flag1 = false;
        do
        {
label0:
            {
label1:
                {
                    int k;
                    int l;
                    if (j < j1)
                    {
                        if (!a1.a(j))
                        {
                            flag1 = true;
                        } else
                        {
                            flag1 = false;
                        }
                        if (flag != flag1)
                        {
                            break label1;
                        }
                    }
                    l = j;
                    k = 0;
                    flag = flag1;
                    while (l < j1) 
                    {
                        int i1;
                        if (a1.a(l) ^ flag)
                        {
                            ai[k] = ai[k] + 1;
                            i1 = k;
                            k = j;
                        } else
                        {
                            if (k == 3)
                            {
                                if (b(ai))
                                {
                                    return (new int[] {
                                        j, l
                                    });
                                }
                                i1 = j + (ai[0] + ai[1]);
                                ai[0] = ai[2];
                                ai[1] = ai[3];
                                ai[2] = 0;
                                ai[3] = 0;
                                j = k - 1;
                                k = i1;
                            } else
                            {
                                i1 = k + 1;
                                k = j;
                                j = i1;
                            }
                            ai[j] = 1;
                            if (!flag)
                            {
                                flag = true;
                                i1 = j;
                            } else
                            {
                                flag = false;
                                i1 = j;
                            }
                        }
                        l++;
                        j = k;
                        k = i1;
                    }
                    break label0;
                }
                j++;
                continue;
            }
            throw m.a();
        } while (true);
    }

    private static boolean b(d d1, d d2)
    {
        int l = d1.b();
        int i1 = d2.b();
        int k = d1.c().a() * 9 + d2.c().a();
        int j = k;
        if (k > 72)
        {
            j = k - 1;
        }
        k = j;
        if (j > 8)
        {
            k = j - 1;
        }
        return (l + i1 * 16) % 79 == k;
    }

    public q a(int j, a a1, Map map)
    {
        d d1 = a(a1, false, j, map);
        a(((Collection) (h)), d1);
        a1.e();
        map = a(a1, true, j, map);
        a(((Collection) (i)), ((d) (map)));
        a1.e();
        int l = h.size();
label0:
        for (j = 0; j < l; j++)
        {
            a1 = (d)h.get(j);
            if (a1.d() <= 1)
            {
                continue;
            }
            int i1 = i.size();
            int k = 0;
            do
            {
                if (k >= i1)
                {
                    continue label0;
                }
                map = (d)i.get(k);
                if (map.d() > 1 && b(a1, map))
                {
                    return a(((d) (a1)), ((d) (map)));
                }
                k++;
            } while (true);
        }

        throw m.a();
    }

    public void a()
    {
        h.clear();
        i.clear();
    }

    static 
    {
        int ai[] = {
            3, 5, 5, 1
        };
        int ai1[] = {
            2, 5, 6, 1
        };
        int ai2[] = {
            1, 5, 7, 1
        };
        int ai3[] = {
            1, 3, 9, 1
        };
        g = (new int[][] {
            new int[] {
                3, 8, 2, 1
            }, ai, new int[] {
                3, 3, 7, 1
            }, new int[] {
                3, 1, 9, 1
            }, new int[] {
                2, 7, 4, 1
            }, ai1, new int[] {
                2, 3, 8, 1
            }, ai2, ai3
        });
    }
}
