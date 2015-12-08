// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.b.e.a.a;

import com.google.b.e.a.a;
import com.google.b.e.a.a.a.j;
import com.google.b.e.a.b;
import com.google.b.e.a.c;
import com.google.b.e.a.f;
import com.google.b.m;
import com.google.b.q;
import com.google.b.s;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

// Referenced classes of package com.google.b.e.a.a:
//            a, b, c

public final class d extends a
{

    private static final int a[] = {
        7, 5, 4, 3, 1
    };
    private static final int b[] = {
        4, 20, 52, 104, 204
    };
    private static final int c[] = {
        0, 348, 1388, 2948, 3988
    };
    private static final int d[][];
    private static final int e[][];
    private static final int f[][];
    private final List g = new ArrayList(11);
    private final List h = new ArrayList();
    private final int i[] = new int[2];
    private boolean j;

    public d()
    {
        j = false;
    }

    private static int a(com.google.b.b.a a1, int k)
    {
        if (a1.a(k))
        {
            return a1.c(a1.d(k));
        } else
        {
            return a1.d(a1.c(k));
        }
    }

    private c a(com.google.b.b.a a1, int k, boolean flag)
    {
        int l;
        int i1;
        int j1;
        if (flag)
        {
            for (l = i[0] - 1; l >= 0 && !a1.a(l); l--) { }
            l++;
            j1 = i[0] - l;
            i1 = i[1];
        } else
        {
            l = i[0];
            i1 = a1.d(i[1] + 1);
            j1 = i1 - i[1];
        }
        a1 = b();
        System.arraycopy(a1, 0, a1, 1, a1.length - 1);
        a1[0] = j1;
        try
        {
            j1 = a(((int []) (a1)), d);
        }
        // Misplaced declaration of an exception variable
        catch (com.google.b.b.a a1)
        {
            return null;
        }
        return new c(j1, new int[] {
            l, i1
        }, l, i1, k);
    }

    static q a(List list)
    {
        String s1 = com.google.b.e.a.a.a.j.a(com.google.b.e.a.a.a.a(list)).a();
        s as[] = ((com.google.b.e.a.a.b)list.get(0)).c().c();
        s as1[] = ((com.google.b.e.a.a.b)list.get(list.size() - 1)).c().c();
        list = as[0];
        s s2 = as[1];
        s s3 = as1[0];
        s s4 = as1[1];
        com.google.b.a a1 = com.google.b.a.n;
        return new q(s1, null, new s[] {
            list, s2, s3, s4
        }, a1);
    }

    private List a(List list, int k)
    {
_L5:
        if (k >= h.size()) goto _L2; else goto _L1
_L1:
        Object obj;
        obj = (com.google.b.e.a.a.c)h.get(k);
        g.clear();
        int i1 = list.size();
        for (int l = 0; l < i1; l++)
        {
            g.addAll(((com.google.b.e.a.a.c)list.get(l)).a());
        }

        g.addAll(((com.google.b.e.a.a.c) (obj)).a());
        if (b(g)) goto _L4; else goto _L3
_L3:
        k++;
          goto _L5
_L4:
        ArrayList arraylist;
        if (h())
        {
            return g;
        }
        arraylist = new ArrayList();
        arraylist.addAll(list);
        arraylist.add(obj);
        obj = a(((List) (arraylist)), k + 1);
        return ((List) (obj));
_L2:
        throw m.a();
        m m1;
        m1;
          goto _L3
    }

    private List a(boolean flag)
    {
        List list;
        List list1;
        list = null;
        list1 = null;
        if (h.size() <= 25) goto _L2; else goto _L1
_L1:
        h.clear();
_L4:
        return list1;
_L2:
        g.clear();
        if (flag)
        {
            Collections.reverse(h);
        }
        list1 = a(((List) (new ArrayList())), 0);
        list = list1;
_L5:
        list1 = list;
        if (flag)
        {
            Collections.reverse(h);
            return list;
        }
        if (true) goto _L4; else goto _L3
_L3:
        m m1;
        m1;
          goto _L5
    }

    private void a(int k)
    {
        boolean flag1 = false;
        boolean flag3 = true;
        int j1 = a(f());
        int k1 = a(g());
        int l1 = (j1 + k1) - k;
        int l;
        boolean flag;
        int i1;
        boolean flag2;
        if ((j1 & 1) == 1)
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        if ((k1 & 1) == 0)
        {
            flag2 = true;
        } else
        {
            flag2 = false;
        }
        if (j1 > 13)
        {
            l = 1;
            k = 0;
        } else
        if (j1 < 4)
        {
            l = 0;
            k = 1;
        } else
        {
            l = 0;
            k = 0;
        }
        if (k1 > 13)
        {
            flag = false;
            flag1 = true;
        } else
        if (k1 < 4)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (l1 == 1)
        {
            if (i1 != 0)
            {
                if (flag2)
                {
                    throw m.a();
                }
                i1 = 1;
                l = k;
                k = i1;
            } else
            {
                if (!flag2)
                {
                    throw m.a();
                }
                flag1 = true;
                i1 = k;
                k = l;
                l = i1;
            }
            break MISSING_BLOCK_LABEL_141;
        }
        if (l1 == -1)
        {
            if (i1 != 0)
            {
                if (flag2)
                {
                    throw m.a();
                }
                k = l;
                l = 1;
            } else
            {
                if (!flag2)
                {
                    throw m.a();
                }
                i1 = k;
                flag = flag3;
                k = l;
                l = i1;
            }
            continue; /* Loop/switch isn't completed */
        }
        if (l1 == 0)
        {
            if (i1 != 0)
            {
                if (!flag2)
                {
                    throw m.a();
                }
                if (j1 < k1)
                {
                    flag1 = true;
                    k = l;
                    l = 1;
                } else
                {
                    i1 = 1;
                    l = k;
                    flag = flag3;
                    k = i1;
                }
                continue; /* Loop/switch isn't completed */
            }
            if (flag2)
            {
                throw m.a();
            }
        } else
        {
            throw m.a();
        }
        i1 = k;
        k = l;
        l = i1;
          goto _L1
_L3:
        if (l != 0)
        {
            if (k != 0)
            {
                throw m.a();
            }
            a(f(), d());
        }
        if (k != 0)
        {
            b(f(), d());
        }
        if (flag)
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
_L1:
        if (true) goto _L3; else goto _L2
_L2:
    }

    private void a(int k, boolean flag)
    {
        int l;
        boolean flag1;
        boolean flag3;
        flag3 = false;
        flag1 = false;
        l = 0;
_L2:
        com.google.b.e.a.a.c c1;
        boolean flag2;
label0:
        {
            flag2 = flag3;
            if (l < h.size())
            {
                c1 = (com.google.b.e.a.a.c)h.get(l);
                if (c1.b() <= k)
                {
                    break label0;
                }
                flag2 = c1.a(g);
            }
        }
        break MISSING_BLOCK_LABEL_60;
_L1:
        flag1 = c1.a(g);
        l++;
        continue; /* Loop/switch isn't completed */
        if (flag2 || flag1 || a(((Iterable) (g)), ((Iterable) (h))))
        {
            return;
        }
        h.add(l, new com.google.b.e.a.a.c(g, k, flag));
        a(g, h);
        return;
        if (true) goto _L2; else goto _L1
    }

    private static void a(List list, List list1)
    {
        list1 = list1.iterator();
_L4:
        if (!list1.hasNext()) goto _L2; else goto _L1
_L1:
        Object obj = (com.google.b.e.a.a.c)list1.next();
        if (((com.google.b.e.a.a.c) (obj)).a().size() == list.size()) goto _L4; else goto _L3
_L3:
        obj = ((com.google.b.e.a.a.c) (obj)).a().iterator();
_L10:
        com.google.b.e.a.a.b b1;
        Iterator iterator;
        if (!((Iterator) (obj)).hasNext())
        {
            break MISSING_BLOCK_LABEL_140;
        }
        b1 = (com.google.b.e.a.a.b)((Iterator) (obj)).next();
        iterator = list.iterator();
_L8:
        if (!iterator.hasNext()) goto _L6; else goto _L5
_L5:
        if (!b1.equals((com.google.b.e.a.a.b)iterator.next())) goto _L8; else goto _L7
_L7:
        boolean flag = true;
_L11:
        if (flag) goto _L10; else goto _L9
_L9:
        flag = false;
_L12:
        if (flag)
        {
            list1.remove();
        }
          goto _L4
_L2:
        return;
_L6:
        flag = false;
          goto _L11
        flag = true;
          goto _L12
    }

    private static boolean a(c c1, boolean flag, boolean flag1)
    {
        return c1.a() != 0 || !flag || !flag1;
    }

    private static boolean a(Iterable iterable, Iterable iterable1)
    {
        iterable1 = iterable1.iterator();
_L9:
        if (!iterable1.hasNext()) goto _L2; else goto _L1
_L1:
        com.google.b.e.a.a.c c1;
        Iterator iterator;
        c1 = (com.google.b.e.a.a.c)iterable1.next();
        iterator = iterable.iterator();
_L8:
        com.google.b.e.a.a.b b1;
        Iterator iterator1;
        if (!iterator.hasNext())
        {
            break MISSING_BLOCK_LABEL_118;
        }
        b1 = (com.google.b.e.a.a.b)iterator.next();
        iterator1 = c1.a().iterator();
_L6:
        if (!iterator1.hasNext()) goto _L4; else goto _L3
_L3:
        if (!b1.equals((com.google.b.e.a.a.b)iterator1.next())) goto _L6; else goto _L5
_L5:
        boolean flag = true;
_L10:
        if (flag) goto _L8; else goto _L7
_L7:
        flag = false;
_L11:
        if (flag)
        {
            return true;
        }
          goto _L9
_L2:
        return false;
_L4:
        flag = false;
          goto _L10
        flag = true;
          goto _L11
    }

    private void b(com.google.b.b.a a1, List list, int k)
    {
        int ai[] = b();
        ai[0] = 0;
        ai[1] = 0;
        ai[2] = 0;
        ai[3] = 0;
        int l1 = a1.a();
        int l;
        boolean flag;
        if (k < 0)
        {
            if (list.isEmpty())
            {
                k = 0;
            } else
            {
                k = ((com.google.b.e.a.a.b)list.get(list.size() - 1)).c().b()[1];
            }
        }
        if (list.size() % 2 != 0)
        {
            l = 1;
        } else
        {
            l = 0;
        }
        flag = l;
        if (j)
        {
            if (l == 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
        }
        l = 0;
        do
        {
label0:
            {
label1:
                {
                    int i1;
                    int j1;
                    int k1;
                    if (k < l1)
                    {
                        if (!a1.a(k))
                        {
                            l = 1;
                        } else
                        {
                            l = 0;
                        }
                        if (l != 0)
                        {
                            break label1;
                        }
                    }
                    i1 = k;
                    k1 = 0;
                    j1 = l;
                    while (i1 < l1) 
                    {
                        if ((a1.a(i1) ^ j1) != 0)
                        {
                            ai[k1] = ai[k1] + 1;
                            l = j1;
                            j1 = k;
                        } else
                        {
                            if (k1 == 3)
                            {
                                if (flag)
                                {
                                    c(ai);
                                }
                                if (b(ai))
                                {
                                    i[0] = k;
                                    i[1] = i1;
                                    return;
                                }
                                if (flag)
                                {
                                    c(ai);
                                }
                                l = k + (ai[0] + ai[1]);
                                ai[0] = ai[2];
                                ai[1] = ai[3];
                                ai[2] = 0;
                                ai[3] = 0;
                                k = k1 - 1;
                            } else
                            {
                                k1++;
                                l = k;
                                k = k1;
                            }
                            ai[k] = 1;
                            if (j1 == 0)
                            {
                                boolean flag1 = true;
                                j1 = l;
                                k1 = k;
                                l = ((flag1) ? 1 : 0);
                            } else
                            {
                                boolean flag2 = false;
                                j1 = l;
                                k1 = k;
                                l = ((flag2) ? 1 : 0);
                            }
                        }
                        i1++;
                        k = j1;
                        j1 = l;
                    }
                    break label0;
                }
                k++;
                continue;
            }
            throw m.a();
        } while (true);
    }

    private static boolean b(List list)
    {
        int ai[][];
        int k;
        int i1;
        boolean flag1;
        flag1 = false;
        ai = f;
        i1 = ai.length;
        k = 0;
_L5:
        boolean flag = flag1;
        if (k >= i1) goto _L2; else goto _L1
_L1:
        int ai1[] = ai[k];
        if (list.size() <= ai1.length) goto _L4; else goto _L3
_L3:
        k++;
          goto _L5
_L4:
        int l = 0;
_L9:
        if (l >= list.size())
        {
            break MISSING_BLOCK_LABEL_106;
        }
        if (((com.google.b.e.a.a.b)list.get(l)).c().a() == ai1[l]) goto _L7; else goto _L6
_L6:
        l = 0;
_L10:
        if (l == 0) goto _L3; else goto _L8
_L8:
        flag = true;
_L2:
        return flag;
_L7:
        l++;
          goto _L9
        l = 1;
          goto _L10
    }

    private static void c(int ai[])
    {
        int l = ai.length;
        for (int k = 0; k < l / 2; k++)
        {
            int i1 = ai[k];
            ai[k] = ai[l - k - 1];
            ai[l - k - 1] = i1;
        }

    }

    private boolean h()
    {
        boolean flag = true;
        Object obj = (com.google.b.e.a.a.b)g.get(0);
        b b1 = ((com.google.b.e.a.a.b) (obj)).a();
        obj = ((com.google.b.e.a.a.b) (obj)).b();
        if (obj == null)
        {
            return false;
        }
        int k = ((b) (obj)).b();
        int l = 2;
        for (int i1 = 1; i1 < g.size(); i1++)
        {
            Object obj1 = (com.google.b.e.a.a.b)g.get(i1);
            int j1 = k + ((com.google.b.e.a.a.b) (obj1)).a().b();
            int k1 = l + 1;
            obj1 = ((com.google.b.e.a.a.b) (obj1)).b();
            l = k1;
            k = j1;
            if (obj1 != null)
            {
                k = j1 + ((b) (obj1)).b();
                l = k1 + 1;
            }
        }

        if (k % 211 + (l - 4) * 211 != b1.a())
        {
            flag = false;
        }
        return flag;
    }

    com.google.b.e.a.a.b a(com.google.b.b.a a1, List list, int k)
    {
        c c1;
        b b1;
        boolean flag;
        int l;
        boolean flag2;
        if (list.size() % 2 == 0)
        {
            flag2 = true;
        } else
        {
            flag2 = false;
        }
        if (j)
        {
            if (!flag2)
            {
                flag2 = true;
            } else
            {
                flag2 = false;
            }
        }
        l = -1;
        flag = true;
        do
        {
            b(a1, list, l);
            c1 = a(a1, k, flag2);
            boolean flag1;
            if (c1 == null)
            {
                l = a(a1, i[0]);
                flag1 = flag;
            } else
            {
                flag1 = false;
            }
            flag = flag1;
        } while (flag1);
        b1 = a(a1, c1, flag2, true);
        if (!list.isEmpty() && ((com.google.b.e.a.a.b)list.get(list.size() - 1)).d())
        {
            throw m.a();
        }
        try
        {
            a1 = a(a1, c1, flag2, false);
        }
        // Misplaced declaration of an exception variable
        catch (com.google.b.b.a a1)
        {
            a1 = null;
        }
        return new com.google.b.e.a.a.b(b1, a1, c1, true);
    }

    b a(com.google.b.b.a a1, c c1, boolean flag, boolean flag1)
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
        float f2;
        if (flag1)
        {
            b(a1, c1.b()[0], ai);
        } else
        {
            a(a1, c1.b()[1], ai);
            int j1 = 0;
            int k = ai.length - 1;
            while (j1 < k) 
            {
                int l1 = ai[j1];
                ai[j1] = ai[k];
                ai[k] = l1;
                j1++;
                k--;
            }
        }
        f1 = (float)a(ai) / (float)17;
        f2 = (float)(c1.b()[1] - c1.b()[0]) / 15F;
        if (Math.abs(f1 - f2) / f2 > 0.3F)
        {
            throw m.a();
        }
        a1 = f();
        int ai1[] = g();
        float af[] = d();
        float af1[] = e();
        int k1 = 0;
        while (k1 < ai.length) 
        {
            float f3 = (1.0F * (float)ai[k1]) / f1;
            int i2 = (int)(0.5F + f3);
            int l;
            if (i2 < 1)
            {
                if (f3 < 0.3F)
                {
                    throw m.a();
                }
                l = 1;
            } else
            {
                l = i2;
                if (i2 > 8)
                {
                    if (f3 > 8.7F)
                    {
                        throw m.a();
                    }
                    l = 8;
                }
            }
            i2 = k1 / 2;
            if ((k1 & 1) == 0)
            {
                a1[i2] = l;
                af[i2] = f3 - (float)l;
            } else
            {
                ai1[i2] = l;
                af1[i2] = f3 - (float)l;
            }
            k1++;
        }
        a(17);
        int j2 = c1.a();
        int i1;
        int l3;
        if (flag)
        {
            i1 = 0;
        } else
        {
            i1 = 2;
        }
        if (flag1)
        {
            k1 = 0;
        } else
        {
            k1 = 1;
        }
        l3 = (k1 + (j2 * 4 + i1)) - 1;
        i1 = a1.length;
        k1 = 0;
        j2 = i1 - 1;
        int k2;
        for (i1 = 0; j2 >= 0; i1 = k2)
        {
            k2 = i1;
            if (a(c1, flag, flag1))
            {
                k2 = i1 + e[l3][j2 * 2] * a1[j2];
            }
            i1 = a1[j2];
            j2--;
            k1 = i1 + k1;
        }

        int l2 = ai1.length;
        j2 = 0;
        for (l2--; l2 >= 0;)
        {
            int j3 = j2;
            if (a(c1, flag, flag1))
            {
                j3 = j2 + e[l3][l2 * 2 + 1] * ai1[l2];
            }
            l2--;
            j2 = j3;
        }

        if ((k1 & 1) != 0 || k1 > 13 || k1 < 4)
        {
            throw m.a();
        } else
        {
            k1 = (13 - k1) / 2;
            int k3 = a[k1];
            int i3 = com.google.b.e.a.f.a(a1, k3, true);
            k3 = com.google.b.e.a.f.a(ai1, 9 - k3, false);
            int i4 = b[k1];
            return new b(c[k1] + (i3 * i4 + k3), i1 + j2);
        }
    }

    public q a(int k, com.google.b.b.a a1, Map map)
    {
        g.clear();
        j = false;
        try
        {
            map = a(a(k, a1));
        }
        // Misplaced declaration of an exception variable
        catch (Map map)
        {
            g.clear();
            j = true;
            return a(a(k, a1));
        }
        return map;
    }

    List a(int k, com.google.b.b.a a1)
    {
        try
        {
            do
            {
                com.google.b.e.a.a.b b1 = a(a1, g, k);
                g.add(b1);
            } while (true);
        }
        // Misplaced declaration of an exception variable
        catch (com.google.b.b.a a1) { }
        if (g.isEmpty())
        {
            throw a1;
        }
        if (!h()) goto _L2; else goto _L1
_L1:
        a1 = g;
_L4:
        return a1;
_L2:
        List list;
        boolean flag;
        if (!h.isEmpty())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a(k, false);
        if (!flag)
        {
            break; /* Loop/switch isn't completed */
        }
        list = a(false);
        a1 = list;
        if (list != null) goto _L4; else goto _L3
_L3:
        list = a(true);
        a1 = list;
        if (list != null) goto _L4; else goto _L5
_L5:
        throw m.a();
    }

    public void a()
    {
        g.clear();
        h.clear();
    }

    static 
    {
        int ai[] = {
            3, 6, 4, 1
        };
        int ai1[] = {
            2, 6, 5, 1
        };
        d = (new int[][] {
            new int[] {
                1, 8, 4, 1
            }, ai, new int[] {
                3, 4, 6, 1
            }, new int[] {
                3, 2, 8, 1
            }, ai1, new int[] {
                2, 2, 9, 1
            }
        });
        ai = (new int[] {
            1, 3, 9, 27, 81, 32, 96, 77
        });
        ai1 = (new int[] {
            20, 60, 180, 118, 143, 7, 21, 63
        });
        int ai2[] = {
            189, 145, 13, 39, 117, 140, 209, 205
        };
        int ai3[] = {
            62, 186, 136, 197, 169, 85, 44, 132
        };
        int ai4[] = {
            113, 128, 173, 97, 80, 29, 87, 50
        };
        int ai5[] = {
            76, 17, 51, 153, 37, 111, 122, 155
        };
        int ai6[] = {
            43, 129, 176, 106, 107, 110, 119, 146
        };
        int ai7[] = {
            16, 48, 144, 10, 30, 90, 59, 177
        };
        int ai8[] = {
            109, 116, 137, 200, 178, 112, 125, 164
        };
        int ai9[] = {
            134, 191, 151, 31, 93, 68, 204, 190
        };
        int ai10[] = {
            161, 61, 183, 127, 170, 88, 53, 159
        };
        int ai11[] = {
            45, 135, 194, 160, 58, 174, 100, 89
        };
        e = (new int[][] {
            ai, ai1, ai2, new int[] {
                193, 157, 49, 147, 19, 57, 171, 91
            }, ai3, new int[] {
                185, 133, 188, 142, 4, 12, 36, 108
            }, ai4, new int[] {
                150, 28, 84, 41, 123, 158, 52, 156
            }, new int[] {
                46, 138, 203, 187, 139, 206, 196, 166
            }, ai5, 
            ai6, ai7, ai8, new int[] {
                70, 210, 208, 202, 184, 130, 179, 115
            }, ai9, new int[] {
                148, 22, 66, 198, 172, 94, 71, 2
            }, new int[] {
                6, 18, 54, 162, 64, 192, 154, 40
            }, new int[] {
                120, 149, 25, 75, 14, 42, 126, 167
            }, new int[] {
                79, 26, 78, 23, 69, 207, 199, 175
            }, new int[] {
                103, 98, 83, 38, 114, 131, 182, 124
            }, 
            ai10, new int[] {
                55, 165, 73, 8, 24, 72, 5, 15
            }, ai11
        });
        ai = (new int[] {
            0, 0
        });
        ai1 = (new int[] {
            0, 1, 1
        });
        ai2 = (new int[] {
            0, 4, 1, 3, 2
        });
        ai3 = (new int[] {
            0, 4, 1, 3, 3, 5
        });
        ai4 = (new int[] {
            0, 4, 1, 3, 4, 5, 5
        });
        ai5 = (new int[] {
            0, 0, 1, 1, 2, 2, 3, 3
        });
        ai6 = (new int[] {
            0, 0, 1, 1, 2, 2, 3, 4, 4
        });
        ai7 = (new int[] {
            0, 0, 1, 1, 2, 2, 3, 4, 5, 5
        });
        ai8 = (new int[] {
            0, 0, 1, 1, 2, 3, 3, 4, 4, 5, 
            5
        });
        f = (new int[][] {
            ai, ai1, new int[] {
                0, 2, 1, 3
            }, ai2, ai3, ai4, ai5, ai6, ai7, ai8
        });
    }
}
