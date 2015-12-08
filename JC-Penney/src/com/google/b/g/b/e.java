// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.b.g.b;

import com.google.b.b.b;
import com.google.b.m;
import com.google.b.s;
import com.google.b.t;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

// Referenced classes of package com.google.b.g.b:
//            d, h, g, i

public class e
{

    private final b a;
    private final List b = new ArrayList();
    private boolean c;
    private final int d[] = new int[5];
    private final t e;

    public e(b b1, t t1)
    {
        a = b1;
        e = t1;
    }

    private static float a(int ai[], int j)
    {
        return (float)(j - ai[4] - ai[3]) - (float)ai[2] / 2.0F;
    }

    private boolean a(int j, int k, int l, int i1)
    {
        int ai[];
        int l1;
label0:
        {
            ai = a();
            int j1;
            for (j1 = 0; j >= j1 && k >= j1 && a.a(k - j1, j - j1); j1++)
            {
                ai[2] = ai[2] + 1;
            }

            if (j >= j1)
            {
                l1 = j1;
                if (k >= j1)
                {
                    break label0;
                }
            }
            return false;
        }
        int i2;
        int j2;
label1:
        {
            for (; j >= l1 && k >= l1 && !a.a(k - l1, j - l1) && ai[1] <= l; l1++)
            {
                ai[1] = ai[1] + 1;
            }

            if (j < l1 || k < l1 || ai[1] > l)
            {
                return false;
            }
            for (; j >= l1 && k >= l1 && a.a(k - l1, j - l1) && ai[0] <= l; l1++)
            {
                ai[0] = ai[0] + 1;
            }

            if (ai[0] > l)
            {
                return false;
            }
            i2 = a.g();
            j2 = a.f();
            int k1;
            for (k1 = 1; j + k1 < i2 && k + k1 < j2 && a.a(k + k1, j + k1); k1++)
            {
                ai[2] = ai[2] + 1;
            }

            if (j + k1 < i2)
            {
                l1 = k1;
                if (k + k1 < j2)
                {
                    break label1;
                }
            }
            return false;
        }
        for (; j + l1 < i2 && k + l1 < j2 && !a.a(k + l1, j + l1) && ai[3] < l; l1++)
        {
            ai[3] = ai[3] + 1;
        }

        if (j + l1 >= i2 || k + l1 >= j2 || ai[3] >= l)
        {
            return false;
        }
        for (; j + l1 < i2 && k + l1 < j2 && a.a(k + l1, j + l1) && ai[4] < l; l1++)
        {
            ai[4] = ai[4] + 1;
        }

        if (ai[4] >= l)
        {
            return false;
        }
        return Math.abs((ai[0] + ai[1] + ai[2] + ai[3] + ai[4]) - i1) < i1 * 2 && a(ai);
    }

    protected static boolean a(int ai[])
    {
        int j;
        int k;
        boolean flag;
        flag = true;
        j = 0;
        k = 0;
_L7:
        if (j >= 5) goto _L2; else goto _L1
_L1:
        int l = ai[j];
        if (l != 0) goto _L4; else goto _L3
_L3:
        return false;
_L4:
        k += l;
        j++;
        continue; /* Loop/switch isn't completed */
_L2:
        if (k < 7) goto _L3; else goto _L5
_L5:
        float f = (float)k / 7F;
        float f1 = f / 2.0F;
        if (Math.abs(f - (float)ai[0]) >= f1 || Math.abs(f - (float)ai[1]) >= f1 || Math.abs(3F * f - (float)ai[2]) >= 3F * f1 || Math.abs(f - (float)ai[3]) >= f1 || Math.abs(f - (float)ai[4]) >= f1)
        {
            flag = false;
        }
        return flag;
        if (true) goto _L7; else goto _L6
_L6:
    }

    private int[] a()
    {
        d[0] = 0;
        d[1] = 0;
        d[2] = 0;
        d[3] = 0;
        d[4] = 0;
        return d;
    }

    private float b(int j, int k, int l, int i1)
    {
        b b1 = a;
        int l1 = b1.g();
        int ai[] = a();
        int j1;
        for (j1 = j; j1 >= 0 && b1.a(k, j1); j1--)
        {
            ai[2] = ai[2] + 1;
        }

        int k1 = j1;
        if (j1 >= 0)
        {
            for (; k1 >= 0 && !b1.a(k, k1) && ai[1] <= l; k1--)
            {
                ai[1] = ai[1] + 1;
            }

            if (k1 >= 0 && ai[1] <= l)
            {
                for (; k1 >= 0 && b1.a(k, k1) && ai[0] <= l; k1--)
                {
                    ai[0] = ai[0] + 1;
                }

                if (ai[0] <= l)
                {
                    for (j++; j < l1 && b1.a(k, j); j++)
                    {
                        ai[2] = ai[2] + 1;
                    }

                    if (j != l1)
                    {
                        for (; j < l1 && !b1.a(k, j) && ai[3] < l; j++)
                        {
                            ai[3] = ai[3] + 1;
                        }

                        if (j != l1 && ai[3] < l)
                        {
                            for (; j < l1 && b1.a(k, j) && ai[4] < l; j++)
                            {
                                ai[4] = ai[4] + 1;
                            }

                            if (ai[4] < l && Math.abs((ai[0] + ai[1] + ai[2] + ai[3] + ai[4]) - i1) * 5 < i1 * 2 && a(ai))
                            {
                                return a(ai, j);
                            }
                        }
                    }
                }
            }
        }
        return (0.0F / 0.0F);
    }

    private int b()
    {
        if (b.size() <= 1)
        {
            return 0;
        }
        d d1 = null;
        Iterator iterator = b.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            d d2 = (d)iterator.next();
            if (d2.d() >= 2)
            {
                if (d1 == null)
                {
                    d1 = d2;
                } else
                {
                    c = true;
                    return (int)(Math.abs(d1.a() - d2.a()) - Math.abs(d1.b() - d2.b())) / 2;
                }
            }
        } while (true);
        return 0;
    }

    private float c(int j, int k, int l, int i1)
    {
        b b1 = a;
        int l1 = b1.f();
        int ai[] = a();
        int j1;
        for (j1 = j; j1 >= 0 && b1.a(j1, k); j1--)
        {
            ai[2] = ai[2] + 1;
        }

        int k1 = j1;
        if (j1 >= 0)
        {
            for (; k1 >= 0 && !b1.a(k1, k) && ai[1] <= l; k1--)
            {
                ai[1] = ai[1] + 1;
            }

            if (k1 >= 0 && ai[1] <= l)
            {
                for (; k1 >= 0 && b1.a(k1, k) && ai[0] <= l; k1--)
                {
                    ai[0] = ai[0] + 1;
                }

                if (ai[0] <= l)
                {
                    for (j++; j < l1 && b1.a(j, k); j++)
                    {
                        ai[2] = ai[2] + 1;
                    }

                    if (j != l1)
                    {
                        for (; j < l1 && !b1.a(j, k) && ai[3] < l; j++)
                        {
                            ai[3] = ai[3] + 1;
                        }

                        if (j != l1 && ai[3] < l)
                        {
                            for (; j < l1 && b1.a(j, k) && ai[4] < l; j++)
                            {
                                ai[4] = ai[4] + 1;
                            }

                            if (ai[4] < l && Math.abs((ai[0] + ai[1] + ai[2] + ai[3] + ai[4]) - i1) * 5 < i1 && a(ai))
                            {
                                return a(ai, j);
                            }
                        }
                    }
                }
            }
        }
        return (0.0F / 0.0F);
    }

    private boolean c()
    {
        float f1 = 0.0F;
        int k = b.size();
        Iterator iterator = b.iterator();
        float f = 0.0F;
        int j = 0;
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            d d1 = (d)iterator.next();
            if (d1.d() >= 2)
            {
                f = d1.c() + f;
                j++;
            }
        } while (true);
        if (j >= 3)
        {
            float f2 = f / (float)k;
            for (Iterator iterator1 = b.iterator(); iterator1.hasNext();)
            {
                f1 += Math.abs(((d)iterator1.next()).c() - f2);
            }

            if (f1 <= 0.05F * f)
            {
                return true;
            }
        }
        return false;
    }

    private d[] d()
    {
        float f3 = 0.0F;
        int j = b.size();
        if (j < 3)
        {
            throw m.a();
        }
        if (j > 3)
        {
            Iterator iterator = b.iterator();
            float f = 0.0F;
            float f2 = 0.0F;
            while (iterator.hasNext()) 
            {
                float f4 = ((d)iterator.next()).c();
                f2 += f4;
                f = f4 * f4 + f;
            }
            f2 /= j;
            f = (float)Math.sqrt(f / (float)j - f2 * f2);
            Collections.sort(b, new h(f2, null));
            f = Math.max(0.2F * f2, f);
            int l;
            for (int k = 0; k < b.size() && b.size() > 3; k = l + 1)
            {
                l = k;
                if (Math.abs(((d)b.get(k)).c() - f2) > f)
                {
                    b.remove(k);
                    l = k - 1;
                }
            }

        }
        if (b.size() > 3)
        {
            Iterator iterator1 = b.iterator();
            float f1;
            for (f1 = f3; iterator1.hasNext(); f1 += ((d)iterator1.next()).c()) { }
            f1 /= b.size();
            Collections.sort(b, new g(f1, null));
            b.subList(3, b.size()).clear();
        }
        return (new d[] {
            (d)b.get(0), (d)b.get(1), (d)b.get(2)
        });
    }

    final i a(Map map)
    {
        int j;
        int k;
        int l;
        int k1;
        int l1;
        boolean flag1;
        boolean flag3;
        if (map != null && map.containsKey(com.google.b.e.d))
        {
            k = 1;
        } else
        {
            k = 0;
        }
        if (map != null && map.containsKey(com.google.b.e.b))
        {
            flag3 = true;
        } else
        {
            flag3 = false;
        }
        k1 = a.g();
        l1 = a.f();
        j = (k1 * 3) / 228;
        if (j < 3 || k != 0)
        {
            j = 3;
        }
        flag1 = false;
        map = new int[5];
        l = j - 1;
        while (l < k1 && !flag1) 
        {
            map[0] = 0;
            map[1] = 0;
            map[2] = 0;
            map[3] = 0;
            map[4] = 0;
            boolean flag = false;
            k = 0;
            int i1 = j;
            j = ((flag) ? 1 : 0);
            while (k < l1) 
            {
                if (a.a(k, l))
                {
                    int j1 = j;
                    if ((j & 1) == 1)
                    {
                        j1 = j + 1;
                    }
                    map[j1] = map[j1] + 1;
                    j = j1;
                } else
                if ((j & 1) == 0)
                {
                    if (j == 4)
                    {
                        if (a(((int []) (map))))
                        {
                            if (a(((int []) (map)), l, k, flag3))
                            {
                                i1 = 2;
                                if (c)
                                {
                                    flag1 = c();
                                } else
                                {
                                    j = b();
                                    boolean flag2;
                                    if (j > map[2])
                                    {
                                        k = l + (j - map[2] - 2);
                                        j = l1 - 1;
                                    } else
                                    {
                                        j = k;
                                        k = l;
                                    }
                                    l = k;
                                    k = j;
                                }
                                map[0] = 0;
                                map[1] = 0;
                                map[2] = 0;
                                map[3] = 0;
                                map[4] = 0;
                                j = 0;
                            } else
                            {
                                map[0] = map[2];
                                map[1] = map[3];
                                map[2] = map[4];
                                map[3] = 1;
                                map[4] = 0;
                                j = 3;
                            }
                        } else
                        {
                            map[0] = map[2];
                            map[1] = map[3];
                            map[2] = map[4];
                            map[3] = 1;
                            map[4] = 0;
                            j = 3;
                        }
                    } else
                    {
                        j++;
                        map[j] = map[j] + 1;
                    }
                } else
                {
                    map[j] = map[j] + 1;
                }
                k++;
            }
            flag2 = flag1;
            j = i1;
            if (a(((int []) (map))))
            {
                flag2 = flag1;
                j = i1;
                if (a(((int []) (map)), l, l1, flag3))
                {
                    k = map[0];
                    flag2 = flag1;
                    j = k;
                    if (c)
                    {
                        flag2 = c();
                        j = k;
                    }
                }
            }
            l += j;
            flag1 = flag2;
        }
        map = d();
        s.a(map);
        return new i(map);
    }

    protected final boolean a(int ai[], int j, int k, boolean flag)
    {
        float f;
        float f1;
        boolean flag1;
        int l;
        boolean flag2;
        boolean flag3;
        flag3 = false;
        flag1 = false;
        l = ai[0] + ai[1] + ai[2] + ai[3] + ai[4];
        f1 = a(ai, k);
        f = b(j, (int)f1, ai[2], l);
        flag2 = flag3;
        if (Float.isNaN(f)) goto _L2; else goto _L1
_L1:
        f1 = c((int)f1, (int)f, ai[2], l);
        flag2 = flag3;
        if (Float.isNaN(f1)) goto _L2; else goto _L3
_L3:
        if (!flag) goto _L5; else goto _L4
_L4:
        flag2 = flag3;
        if (!a((int)f, (int)f1, ai[2], l)) goto _L2; else goto _L5
_L5:
        float f2;
        f2 = (float)l / 7F;
        j = 0;
_L11:
        k = ((flag1) ? 1 : 0);
        if (j >= b.size()) goto _L7; else goto _L6
_L6:
        ai = (d)b.get(j);
        if (!ai.a(f2, f, f1)) goto _L9; else goto _L8
_L8:
        b.set(j, ai.b(f, f1, f2));
        k = 1;
_L7:
        if (k == 0)
        {
            ai = new d(f1, f, f2);
            b.add(ai);
            if (e != null)
            {
                e.a(ai);
            }
        }
        flag2 = true;
_L2:
        return flag2;
_L9:
        j++;
        if (true) goto _L11; else goto _L10
_L10:
    }
}
