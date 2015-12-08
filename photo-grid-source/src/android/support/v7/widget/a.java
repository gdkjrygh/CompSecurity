// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import java.util.ArrayList;
import java.util.List;

// Referenced classes of package android.support.v7.widget:
//            ac, ab, b, c

final class a
    implements ac
{

    final ArrayList a;
    final ArrayList b;
    final b c;
    Runnable d;
    final boolean e;
    final ab f;
    private android.support.v4.util.Pools.Pool g;

    a(b b1)
    {
        this(b1, (byte)0);
    }

    private a(b b1, byte byte0)
    {
        g = new android.support.v4.util.Pools.SimplePool(30);
        a = new ArrayList();
        b = new ArrayList();
        c = b1;
        e = false;
        f = new ab(this);
    }

    private void a(c c1, int i)
    {
        c.a(c1);
        switch (c1.a)
        {
        default:
            throw new IllegalArgumentException("only remove and update ops can be dispatched in first pass");

        case 1: // '\001'
            c.a(i, c1.c);
            return;

        case 2: // '\002'
            c.c(i, c1.c);
            break;
        }
    }

    private void a(List list)
    {
        int j = list.size();
        for (int i = 0; i < j; i++)
        {
            a((c)list.get(i));
        }

        list.clear();
    }

    private void b(c c1)
    {
        int j;
        int j1;
        if (c1.a == 0 || c1.a == 3)
        {
            throw new IllegalArgumentException("should not dispatch add or move for pre layout");
        }
        j1 = d(c1.b, c1.a);
        j = c1.b;
        c1.a;
        JVM INSTR tableswitch 1 2: default 72
    //                   1 183
    //                   2 96;
           goto _L1 _L2 _L3
_L1:
        throw new IllegalArgumentException((new StringBuilder("op should be remove or update.")).append(c1).toString());
_L3:
        int k = 1;
_L8:
        int l;
        int i1;
        i1 = 1;
        l = 1;
_L7:
        int k1;
        if (l >= c1.c)
        {
            break MISSING_BLOCK_LABEL_283;
        }
        k1 = d(c1.b + k * l, c1.a);
        c1.a;
        JVM INSTR tableswitch 1 2: default 160
    //                   1 208
    //                   2 189;
           goto _L4 _L5 _L6
_L4:
        int i = 0;
_L9:
        if (i != 0)
        {
            i = i1 + 1;
        } else
        {
            c c2 = a(c1.a, j1, i1);
            a(c2, j);
            a(c2);
            i = j;
            if (c1.a == 2)
            {
                i = j + i1;
            }
            i1 = 1;
            j1 = k1;
            j = i;
            i = i1;
        }
        l++;
        i1 = i;
          goto _L7
_L2:
        k = 0;
          goto _L8
_L6:
        if (k1 == j1 + 1)
        {
            i = 1;
        } else
        {
            i = 0;
        }
          goto _L9
_L5:
        if (k1 == j1)
        {
            i = 1;
        } else
        {
            i = 0;
        }
          goto _L9
        a(c1);
        if (i1 > 0)
        {
            c1 = a(c1.a, j1, i1);
            a(c1, j);
            a(c1);
        }
        return;
          goto _L7
    }

    private boolean b(int i)
    {
        int l = b.size();
label0:
        for (int j = 0; j < l; j++)
        {
            c c1 = (c)b.get(j);
            if (c1.a == 3)
            {
                if (a(c1.c, j + 1) == i)
                {
                    return true;
                }
                continue;
            }
            if (c1.a != 0)
            {
                continue;
            }
            int i1 = c1.b;
            int j1 = c1.c;
            int k = c1.b;
            do
            {
                if (k >= i1 + j1)
                {
                    continue label0;
                }
                if (a(k, j + 1) == i)
                {
                    return true;
                }
                k++;
            } while (true);
        }

        return false;
    }

    private void c(c c1)
    {
        b.add(c1);
        switch (c1.a)
        {
        default:
            throw new IllegalArgumentException((new StringBuilder("Unknown update op type for ")).append(c1).toString());

        case 0: // '\0'
            c.d(c1.b, c1.c);
            return;

        case 3: // '\003'
            c.e(c1.b, c1.c);
            return;

        case 1: // '\001'
            c.b(c1.b, c1.c);
            return;

        case 2: // '\002'
            c.c(c1.b, c1.c);
            return;
        }
    }

    private int d(int i, int j)
    {
        int k = b.size() - 1;
        do
        {
            if (k >= 0)
            {
                c c1 = (c)b.get(k);
                if (c1.a == 3)
                {
                    int l;
                    int i1;
                    if (c1.b < c1.c)
                    {
                        i1 = c1.b;
                        l = c1.c;
                    } else
                    {
                        i1 = c1.c;
                        l = c1.b;
                    }
                    if (i >= i1 && i <= l)
                    {
                        if (i1 == c1.b)
                        {
                            if (j == 0)
                            {
                                c1.c = c1.c + 1;
                            } else
                            if (j == 1)
                            {
                                c1.c = c1.c - 1;
                            }
                            i++;
                        } else
                        {
                            if (j == 0)
                            {
                                c1.b = c1.b + 1;
                            } else
                            if (j == 1)
                            {
                                c1.b = c1.b - 1;
                            }
                            i--;
                        }
                    } else
                    if (i < c1.b)
                    {
                        if (j == 0)
                        {
                            c1.b = c1.b + 1;
                            c1.c = c1.c + 1;
                        } else
                        if (j == 1)
                        {
                            c1.b = c1.b - 1;
                            c1.c = c1.c - 1;
                        }
                    }
                } else
                if (c1.b <= i)
                {
                    if (c1.a == 0)
                    {
                        i -= c1.c;
                    } else
                    if (c1.a == 1)
                    {
                        i = c1.c + i;
                    }
                } else
                if (j == 0)
                {
                    c1.b = c1.b + 1;
                } else
                if (j == 1)
                {
                    c1.b = c1.b - 1;
                }
                k--;
                continue;
            }
            j = b.size() - 1;
            while (j >= 0) 
            {
                c c2 = (c)b.get(j);
                if (c2.a == 3)
                {
                    if (c2.c == c2.b || c2.c < 0)
                    {
                        b.remove(j);
                        a(c2);
                    }
                } else
                if (c2.c <= 0)
                {
                    b.remove(j);
                    a(c2);
                }
                j--;
            }
            return i;
        } while (true);
    }

    final int a(int i)
    {
        return a(i, 0);
    }

    final int a(int i, int j)
    {
        int l;
        int i1;
        i1 = b.size();
        l = j;
        j = i;
_L5:
        i = j;
        if (l >= i1) goto _L2; else goto _L1
_L1:
        c c1 = (c)b.get(l);
        if (c1.a != 3) goto _L4; else goto _L3
_L3:
        if (c1.b == j)
        {
            i = c1.c;
        } else
        {
            int k = j;
            if (c1.b < j)
            {
                k = j - 1;
            }
            i = k;
            if (c1.c <= k)
            {
                i = k + 1;
            }
        }
_L7:
        l++;
        j = i;
          goto _L5
_L4:
        i = j;
        if (c1.b > j) goto _L7; else goto _L6
_L6:
        if (c1.a != 1)
        {
            break MISSING_BLOCK_LABEL_149;
        }
        if (j >= c1.b + c1.c) goto _L9; else goto _L8
_L8:
        i = -1;
_L2:
        return i;
_L9:
        i = j - c1.c;
          goto _L7
        i = j;
        if (c1.a == 0)
        {
            i = j + c1.c;
        }
          goto _L7
    }

    public final c a(int i, int j, int k)
    {
        c c1 = (c)g.acquire();
        if (c1 == null)
        {
            return new c(i, j, k);
        } else
        {
            c1.a = i;
            c1.b = j;
            c1.c = k;
            return c1;
        }
    }

    final void a()
    {
        a(((List) (a)));
        a(((List) (b)));
    }

    public final void a(c c1)
    {
        if (!e)
        {
            g.release(c1);
        }
    }

    final void b()
    {
        ab ab1;
        ArrayList arraylist;
        ab1 = f;
        arraylist = a;
_L16:
        int i;
        int i1;
        i1 = 0;
        i = arraylist.size() - 1;
_L9:
        if (i < 0) goto _L2; else goto _L1
_L1:
        if (((c)arraylist.get(i)).a != 3) goto _L4; else goto _L3
_L3:
        if (i1 == 0)
        {
            continue; /* Loop/switch isn't completed */
        }
        i1 = i;
_L10:
        c c5;
        c c6;
        int i4;
        if (i1 == -1)
        {
            break; /* Loop/switch isn't completed */
        }
        i4 = i1 + 1;
        c5 = (c)arraylist.get(i1);
        c6 = (c)arraylist.get(i4);
        c6.a;
        JVM INSTR tableswitch 0 2: default 128
    //                   0 131
    //                   1 289
    //                   2 986;
           goto _L5 _L6 _L7 _L8
_L5:
        continue; /* Loop/switch isn't completed */
_L6:
        i = 0;
        if (c5.c < c6.b)
        {
            i = -1;
        }
        int k1 = i;
        if (c5.b < c6.b)
        {
            k1 = i + 1;
        }
        if (c6.b <= c5.b)
        {
            c5.b = c5.b + c6.c;
        }
        if (c6.b <= c5.c)
        {
            c5.c = c5.c + c6.c;
        }
        c6.b = k1 + c6.b;
        arraylist.set(i1, c6);
        arraylist.set(i4, c5);
        continue; /* Loop/switch isn't completed */
_L4:
        i1 = 1;
        i--;
          goto _L9
_L2:
        i1 = -1;
          goto _L10
_L7:
        c c1;
        boolean flag1;
        c1 = null;
        boolean flag2 = false;
        boolean flag;
        if (c5.b < c5.c)
        {
            boolean flag3 = false;
            flag1 = flag3;
            flag = flag2;
            if (c6.b == c5.b)
            {
                flag1 = flag3;
                flag = flag2;
                if (c6.c == c5.c - c5.b)
                {
                    flag = true;
                    flag1 = flag3;
                }
            }
        } else
        {
            boolean flag4 = true;
            flag1 = flag4;
            flag = flag2;
            if (c6.b == c5.c + 1)
            {
                flag1 = flag4;
                flag = flag2;
                if (c6.c == c5.b - c5.c)
                {
                    flag = true;
                    flag1 = flag4;
                }
            }
        }
        if (c5.c >= c6.b) goto _L12; else goto _L11
_L11:
        c6.b = c6.b - 1;
_L14:
        if (c5.b <= c6.b)
        {
            c6.b = c6.b + 1;
        } else
        if (c5.b < c6.b + c6.c)
        {
            int j2 = c6.b;
            int i3 = c6.c;
            int j4 = c5.b;
            c1 = ab1.a.a(1, c5.b + 1, (j2 + i3) - j4);
            c6.c = c5.b - c6.b;
        }
        if (flag)
        {
            arraylist.set(i1, c6);
            arraylist.remove(i4);
            ab1.a.a(c5);
        } else
        {
            if (flag1)
            {
                if (c1 != null)
                {
                    if (c5.b > c1.b)
                    {
                        c5.b = c5.b - c1.c;
                    }
                    if (c5.c > c1.b)
                    {
                        c5.c = c5.c - c1.c;
                    }
                }
                if (c5.b > c6.b)
                {
                    c5.b = c5.b - c6.c;
                }
                if (c5.c > c6.b)
                {
                    c5.c = c5.c - c6.c;
                }
            } else
            {
                if (c1 != null)
                {
                    if (c5.b >= c1.b)
                    {
                        c5.b = c5.b - c1.c;
                    }
                    if (c5.c >= c1.b)
                    {
                        c5.c = c5.c - c1.c;
                    }
                }
                if (c5.b >= c6.b)
                {
                    c5.b = c5.b - c6.c;
                }
                if (c5.c >= c6.b)
                {
                    c5.c = c5.c - c6.c;
                }
            }
            arraylist.set(i1, c6);
            if (c5.b != c5.c)
            {
                arraylist.set(i4, c5);
            } else
            {
                arraylist.remove(i4);
            }
            if (c1 != null)
            {
                arraylist.add(i1, c1);
            }
        }
        continue; /* Loop/switch isn't completed */
_L12:
        if (c5.c >= c6.b + c6.c) goto _L14; else goto _L13
_L13:
        c6.c = c6.c - 1;
        c5.a = 1;
        c5.c = 1;
        if (c6.c == 0)
        {
            arraylist.remove(i4);
            ab1.a.a(c6);
        }
        continue; /* Loop/switch isn't completed */
_L8:
        c c2;
        c1 = null;
        c2 = null;
        if (c5.c < c6.b)
        {
            c6.b = c6.b - 1;
        } else
        if (c5.c < c6.b + c6.c)
        {
            c6.c = c6.c - 1;
            c1 = ab1.a.a(2, c5.b, 1);
        }
_L25:
        if (c5.b <= c6.b)
        {
            c6.b = c6.b + 1;
        } else
        if (c5.b < c6.b + c6.c)
        {
            int j = (c6.b + c6.c) - c5.b;
            c2 = ab1.a.a(2, c5.b + 1, j);
            c6.c = c6.c - j;
        }
        arraylist.set(i4, c5);
        if (c6.c > 0)
        {
            arraylist.set(i1, c6);
        } else
        {
            arraylist.remove(i1);
            ab1.a.a(c6);
        }
        if (c1 != null)
        {
            arraylist.add(i1, c1);
        }
        if (c2 != null)
        {
            arraylist.add(i1, c2);
        }
        if (true) goto _L16; else goto _L15
_L15:
        int l4;
        l4 = a.size();
        i4 = 0;
_L24:
        if (i4 >= l4) goto _L18; else goto _L17
_L17:
        c1 = (c)a.get(i4);
        c1.a;
        JVM INSTR tableswitch 0 3: default 1320
    //                   0 1345
    //                   1 1353
    //                   2 1593
    //                   3 1810;
           goto _L19 _L20 _L21 _L22 _L23
_L19:
        if (d != null)
        {
            d.run();
        }
        i4++;
          goto _L24
_L20:
        c(c1);
          goto _L19
_L21:
        int i5 = c1.b;
        int k = c1.b;
        int l1 = c1.c + k;
        byte byte1 = -1;
        k = c1.b;
        int j3 = 0;
        while (k < l1) 
        {
            byte byte0 = 0;
            int k2 = 0;
            if (c.a(k) != null || b(k))
            {
                if (byte1 == 0)
                {
                    b(a(1, i5, j3));
                    k2 = 1;
                }
                byte0 = 1;
            } else
            {
                if (byte1 == 1)
                {
                    c(a(1, i5, j3));
                    byte0 = 1;
                }
                byte1 = 0;
                k2 = byte0;
                byte0 = byte1;
            }
            if (k2 != 0)
            {
                k2 = k - j3;
                k = l1 - j3;
                l1 = 1;
            } else
            {
                j3++;
                k2 = k;
                k = l1;
                l1 = j3;
            }
            j3 = l1;
            l1 = k;
            k = k2 + 1;
            byte1 = byte0;
        }
        c c3 = c1;
        if (j3 != c1.c)
        {
            a(c1);
            c3 = a(1, i5, j3);
        }
        if (byte1 == 0)
        {
            b(c3);
        } else
        {
            c(c3);
        }
          goto _L19
_L22:
        int i2 = c1.b;
        int j5 = c1.b;
        int k5 = c1.c;
        int l = c1.b;
        int j1 = 0;
        int k4 = -1;
        while (l < j5 + k5) 
        {
            int l2;
            if (c.a(l) != null || b(l))
            {
                l2 = j1;
                int k3 = i2;
                if (k4 == 0)
                {
                    b(a(2, i2, j1));
                    l2 = 0;
                    k3 = l;
                }
                i2 = k3;
                j1 = 1;
            } else
            {
                l2 = j1;
                int l3 = i2;
                if (k4 == 1)
                {
                    c(a(2, i2, j1));
                    l2 = 0;
                    l3 = l;
                }
                i2 = l3;
                j1 = 0;
            }
            l++;
            l2++;
            k4 = j1;
            j1 = l2;
        }
        c c4 = c1;
        if (j1 != c1.c)
        {
            a(c1);
            c4 = a(2, i2, j1);
        }
        if (k4 == 0)
        {
            b(c4);
        } else
        {
            c(c4);
        }
          goto _L19
_L23:
        c(c1);
          goto _L19
_L18:
        a.clear();
        return;
          goto _L25
    }

    final boolean b(int i, int j)
    {
        a.add(a(2, i, j));
        return a.size() == 1;
    }

    final void c()
    {
        int j = b.size();
        for (int i = 0; i < j; i++)
        {
            c.b((c)b.get(i));
        }

        a(b);
    }

    final boolean c(int i, int j)
    {
        a.add(a(1, i, j));
        return a.size() == 1;
    }

    final boolean d()
    {
        return a.size() > 0;
    }

    final void e()
    {
        int i;
        int j;
        c();
        j = a.size();
        i = 0;
_L7:
        c c1;
        if (i >= j)
        {
            break MISSING_BLOCK_LABEL_207;
        }
        c1 = (c)a.get(i);
        c1.a;
        JVM INSTR tableswitch 0 3: default 64
    //                   0 87
    //                   1 117
    //                   2 147
    //                   3 177;
           goto _L1 _L2 _L3 _L4 _L5
_L5:
        break MISSING_BLOCK_LABEL_177;
_L1:
        break; /* Loop/switch isn't completed */
_L2:
        break; /* Loop/switch isn't completed */
_L8:
        if (d != null)
        {
            d.run();
        }
        i++;
        if (true) goto _L7; else goto _L6
_L6:
        c.b(c1);
        c.d(c1.b, c1.c);
          goto _L8
_L3:
        c.b(c1);
        c.a(c1.b, c1.c);
          goto _L8
_L4:
        c.b(c1);
        c.c(c1.b, c1.c);
          goto _L8
        c.b(c1);
        c.e(c1.b, c1.c);
          goto _L8
        a(a);
        return;
    }
}
