// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.support.v4.e.n;
import android.support.v4.e.o;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package android.support.v7.widget:
//            at, as, l, m

final class k
    implements at
{

    final ArrayList a;
    final ArrayList b;
    final l c;
    Runnable d;
    final boolean e;
    final as f;
    private n g;

    k(l l1)
    {
        this(l1, (byte)0);
    }

    private k(l l1, byte byte0)
    {
        g = new o();
        a = new ArrayList();
        b = new ArrayList();
        c = l1;
        e = false;
        f = new as(this);
    }

    private void a(m m1, int i)
    {
        c.a(m1);
        switch (m1.a)
        {
        default:
            throw new IllegalArgumentException("only remove and update ops can be dispatched in first pass");

        case 1: // '\001'
            c.a(i, m1.c);
            return;

        case 2: // '\002'
            c.c(i, m1.c);
            break;
        }
    }

    private void a(List list)
    {
        int j = list.size();
        for (int i = 0; i < j; i++)
        {
            a((m)list.get(i));
        }

        list.clear();
    }

    private void b(m m1)
    {
        int j;
        int l1;
        if (m1.a == 0 || m1.a == 3)
        {
            throw new IllegalArgumentException("should not dispatch add or move for pre layout");
        }
        l1 = f(m1.b, m1.a);
        j = m1.b;
        m1.a;
        JVM INSTR tableswitch 1 2: default 72
    //                   1 183
    //                   2 96;
           goto _L1 _L2 _L3
_L1:
        throw new IllegalArgumentException((new StringBuilder("op should be remove or update.")).append(m1).toString());
_L3:
        int i1 = 1;
_L8:
        int j1;
        int k1;
        k1 = 1;
        j1 = 1;
_L7:
        int i2;
        if (j1 >= m1.c)
        {
            break MISSING_BLOCK_LABEL_283;
        }
        i2 = f(m1.b + i1 * j1, m1.a);
        m1.a;
        JVM INSTR tableswitch 1 2: default 160
    //                   1 208
    //                   2 189;
           goto _L4 _L5 _L6
_L4:
        int i = 0;
_L9:
        if (i != 0)
        {
            i = k1 + 1;
        } else
        {
            m m2 = a(m1.a, l1, k1);
            a(m2, j);
            a(m2);
            i = j;
            if (m1.a == 2)
            {
                i = j + k1;
            }
            k1 = 1;
            l1 = i2;
            j = i;
            i = k1;
        }
        j1++;
        k1 = i;
          goto _L7
_L2:
        i1 = 0;
          goto _L8
_L6:
        if (i2 == l1 + 1)
        {
            i = 1;
        } else
        {
            i = 0;
        }
          goto _L9
_L5:
        if (i2 == l1)
        {
            i = 1;
        } else
        {
            i = 0;
        }
          goto _L9
        a(m1);
        if (k1 > 0)
        {
            m1 = a(m1.a, l1, k1);
            a(m1, j);
            a(m1);
        }
        return;
          goto _L7
    }

    private boolean b(int i)
    {
        int j1 = b.size();
label0:
        for (int j = 0; j < j1; j++)
        {
            m m1 = (m)b.get(j);
            if (m1.a == 3)
            {
                if (a(m1.c, j + 1) == i)
                {
                    return true;
                }
                continue;
            }
            if (m1.a != 0)
            {
                continue;
            }
            int k1 = m1.b;
            int l1 = m1.c;
            int i1 = m1.b;
            do
            {
                if (i1 >= k1 + l1)
                {
                    continue label0;
                }
                if (a(i1, j + 1) == i)
                {
                    return true;
                }
                i1++;
            } while (true);
        }

        return false;
    }

    private void c(m m1)
    {
        b.add(m1);
        switch (m1.a)
        {
        default:
            throw new IllegalArgumentException((new StringBuilder("Unknown update op type for ")).append(m1).toString());

        case 0: // '\0'
            c.d(m1.b, m1.c);
            return;

        case 3: // '\003'
            c.e(m1.b, m1.c);
            return;

        case 1: // '\001'
            c.b(m1.b, m1.c);
            return;

        case 2: // '\002'
            c.c(m1.b, m1.c);
            return;
        }
    }

    private int f(int i, int j)
    {
        int i1 = b.size() - 1;
        do
        {
            if (i1 >= 0)
            {
                m m1 = (m)b.get(i1);
                if (m1.a == 3)
                {
                    int j1;
                    int k1;
                    if (m1.b < m1.c)
                    {
                        k1 = m1.b;
                        j1 = m1.c;
                    } else
                    {
                        k1 = m1.c;
                        j1 = m1.b;
                    }
                    if (i >= k1 && i <= j1)
                    {
                        if (k1 == m1.b)
                        {
                            if (j == 0)
                            {
                                m1.c = m1.c + 1;
                            } else
                            if (j == 1)
                            {
                                m1.c = m1.c - 1;
                            }
                            i++;
                        } else
                        {
                            if (j == 0)
                            {
                                m1.b = m1.b + 1;
                            } else
                            if (j == 1)
                            {
                                m1.b = m1.b - 1;
                            }
                            i--;
                        }
                    } else
                    if (i < m1.b)
                    {
                        if (j == 0)
                        {
                            m1.b = m1.b + 1;
                            m1.c = m1.c + 1;
                        } else
                        if (j == 1)
                        {
                            m1.b = m1.b - 1;
                            m1.c = m1.c - 1;
                        }
                    }
                } else
                if (m1.b <= i)
                {
                    if (m1.a == 0)
                    {
                        i -= m1.c;
                    } else
                    if (m1.a == 1)
                    {
                        i = m1.c + i;
                    }
                } else
                if (j == 0)
                {
                    m1.b = m1.b + 1;
                } else
                if (j == 1)
                {
                    m1.b = m1.b - 1;
                }
                i1--;
                continue;
            }
            j = b.size() - 1;
            while (j >= 0) 
            {
                m m2 = (m)b.get(j);
                if (m2.a == 3)
                {
                    if (m2.c == m2.b || m2.c < 0)
                    {
                        b.remove(j);
                        a(m2);
                    }
                } else
                if (m2.c <= 0)
                {
                    b.remove(j);
                    a(m2);
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
        int j1;
        int k1;
        k1 = b.size();
        j1 = j;
        j = i;
_L5:
        i = j;
        if (j1 >= k1) goto _L2; else goto _L1
_L1:
        m m1 = (m)b.get(j1);
        if (m1.a != 3) goto _L4; else goto _L3
_L3:
        if (m1.b == j)
        {
            i = m1.c;
        } else
        {
            int i1 = j;
            if (m1.b < j)
            {
                i1 = j - 1;
            }
            i = i1;
            if (m1.c <= i1)
            {
                i = i1 + 1;
            }
        }
_L7:
        j1++;
        j = i;
          goto _L5
_L4:
        i = j;
        if (m1.b > j) goto _L7; else goto _L6
_L6:
        if (m1.a != 1)
        {
            break MISSING_BLOCK_LABEL_149;
        }
        if (j >= m1.b + m1.c) goto _L9; else goto _L8
_L8:
        i = -1;
_L2:
        return i;
_L9:
        i = j - m1.c;
          goto _L7
        i = j;
        if (m1.a == 0)
        {
            i = j + m1.c;
        }
          goto _L7
    }

    public final m a(int i, int j, int i1)
    {
        m m1 = (m)g.a();
        if (m1 == null)
        {
            return new m(i, j, i1);
        } else
        {
            m1.a = i;
            m1.b = j;
            m1.c = i1;
            return m1;
        }
    }

    final void a()
    {
        a(((List) (a)));
        a(((List) (b)));
    }

    public final void a(m m1)
    {
        if (!e)
        {
            g.a(m1);
        }
    }

    final void b()
    {
        as as1;
        ArrayList arraylist;
        as1 = f;
        arraylist = a;
_L16:
        int i;
        int k1;
        k1 = 0;
        i = arraylist.size() - 1;
_L9:
        if (i < 0) goto _L2; else goto _L1
_L1:
        if (((m)arraylist.get(i)).a != 3) goto _L4; else goto _L3
_L3:
        if (k1 == 0)
        {
            continue; /* Loop/switch isn't completed */
        }
        k1 = i;
_L10:
        m m5;
        m m6;
        int k4;
        if (k1 == -1)
        {
            break; /* Loop/switch isn't completed */
        }
        k4 = k1 + 1;
        m5 = (m)arraylist.get(k1);
        m6 = (m)arraylist.get(k4);
        m6.a;
        JVM INSTR tableswitch 0 2: default 128
    //                   0 131
    //                   1 289
    //                   2 986;
           goto _L5 _L6 _L7 _L8
_L5:
        continue; /* Loop/switch isn't completed */
_L6:
        i = 0;
        if (m5.c < m6.b)
        {
            i = -1;
        }
        int i2 = i;
        if (m5.b < m6.b)
        {
            i2 = i + 1;
        }
        if (m6.b <= m5.b)
        {
            m5.b = m5.b + m6.c;
        }
        if (m6.b <= m5.c)
        {
            m5.c = m5.c + m6.c;
        }
        m6.b = i2 + m6.b;
        arraylist.set(k1, m6);
        arraylist.set(k4, m5);
        continue; /* Loop/switch isn't completed */
_L4:
        k1 = 1;
        i--;
          goto _L9
_L2:
        k1 = -1;
          goto _L10
_L7:
        m m1;
        boolean flag1;
        m1 = null;
        boolean flag2 = false;
        boolean flag;
        if (m5.b < m5.c)
        {
            boolean flag3 = false;
            flag1 = flag3;
            flag = flag2;
            if (m6.b == m5.b)
            {
                flag1 = flag3;
                flag = flag2;
                if (m6.c == m5.c - m5.b)
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
            if (m6.b == m5.c + 1)
            {
                flag1 = flag4;
                flag = flag2;
                if (m6.c == m5.b - m5.c)
                {
                    flag = true;
                    flag1 = flag4;
                }
            }
        }
        if (m5.c >= m6.b) goto _L12; else goto _L11
_L11:
        m6.b = m6.b - 1;
_L14:
        if (m5.b <= m6.b)
        {
            m6.b = m6.b + 1;
        } else
        if (m5.b < m6.b + m6.c)
        {
            int l2 = m6.b;
            int k3 = m6.c;
            int l4 = m5.b;
            m1 = as1.a.a(1, m5.b + 1, (l2 + k3) - l4);
            m6.c = m5.b - m6.b;
        }
        if (flag)
        {
            arraylist.set(k1, m6);
            arraylist.remove(k4);
            as1.a.a(m5);
        } else
        {
            if (flag1)
            {
                if (m1 != null)
                {
                    if (m5.b > m1.b)
                    {
                        m5.b = m5.b - m1.c;
                    }
                    if (m5.c > m1.b)
                    {
                        m5.c = m5.c - m1.c;
                    }
                }
                if (m5.b > m6.b)
                {
                    m5.b = m5.b - m6.c;
                }
                if (m5.c > m6.b)
                {
                    m5.c = m5.c - m6.c;
                }
            } else
            {
                if (m1 != null)
                {
                    if (m5.b >= m1.b)
                    {
                        m5.b = m5.b - m1.c;
                    }
                    if (m5.c >= m1.b)
                    {
                        m5.c = m5.c - m1.c;
                    }
                }
                if (m5.b >= m6.b)
                {
                    m5.b = m5.b - m6.c;
                }
                if (m5.c >= m6.b)
                {
                    m5.c = m5.c - m6.c;
                }
            }
            arraylist.set(k1, m6);
            if (m5.b != m5.c)
            {
                arraylist.set(k4, m5);
            } else
            {
                arraylist.remove(k4);
            }
            if (m1 != null)
            {
                arraylist.add(k1, m1);
            }
        }
        continue; /* Loop/switch isn't completed */
_L12:
        if (m5.c >= m6.b + m6.c) goto _L14; else goto _L13
_L13:
        m6.c = m6.c - 1;
        m5.a = 1;
        m5.c = 1;
        if (m6.c == 0)
        {
            arraylist.remove(k4);
            as1.a.a(m6);
        }
        continue; /* Loop/switch isn't completed */
_L8:
        m m2;
        m1 = null;
        m2 = null;
        if (m5.c < m6.b)
        {
            m6.b = m6.b - 1;
        } else
        if (m5.c < m6.b + m6.c)
        {
            m6.c = m6.c - 1;
            m1 = as1.a.a(2, m5.b, 1);
        }
_L25:
        if (m5.b <= m6.b)
        {
            m6.b = m6.b + 1;
        } else
        if (m5.b < m6.b + m6.c)
        {
            int j = (m6.b + m6.c) - m5.b;
            m2 = as1.a.a(2, m5.b + 1, j);
            m6.c = m6.c - j;
        }
        arraylist.set(k4, m5);
        if (m6.c > 0)
        {
            arraylist.set(k1, m6);
        } else
        {
            arraylist.remove(k1);
            as1.a.a(m6);
        }
        if (m1 != null)
        {
            arraylist.add(k1, m1);
        }
        if (m2 != null)
        {
            arraylist.add(k1, m2);
        }
        if (true) goto _L16; else goto _L15
_L15:
        int j5;
        j5 = a.size();
        k4 = 0;
_L24:
        if (k4 >= j5) goto _L18; else goto _L17
_L17:
        m1 = (m)a.get(k4);
        m1.a;
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
        k4++;
          goto _L24
_L20:
        c(m1);
          goto _L19
_L21:
        int k5 = m1.b;
        int i1 = m1.b;
        int j2 = m1.c + i1;
        byte byte1 = -1;
        i1 = m1.b;
        int l3 = 0;
        while (i1 < j2) 
        {
            byte byte0 = 0;
            int i3 = 0;
            if (c.a(i1) != null || b(i1))
            {
                if (byte1 == 0)
                {
                    b(a(1, k5, l3));
                    i3 = 1;
                }
                byte0 = 1;
            } else
            {
                if (byte1 == 1)
                {
                    c(a(1, k5, l3));
                    byte0 = 1;
                }
                byte1 = 0;
                i3 = byte0;
                byte0 = byte1;
            }
            if (i3 != 0)
            {
                i3 = i1 - l3;
                i1 = j2 - l3;
                j2 = 1;
            } else
            {
                l3++;
                i3 = i1;
                i1 = j2;
                j2 = l3;
            }
            l3 = j2;
            j2 = i1;
            i1 = i3 + 1;
            byte1 = byte0;
        }
        m m3 = m1;
        if (l3 != m1.c)
        {
            a(m1);
            m3 = a(1, k5, l3);
        }
        if (byte1 == 0)
        {
            b(m3);
        } else
        {
            c(m3);
        }
          goto _L19
_L22:
        int k2 = m1.b;
        int l5 = m1.b;
        int i6 = m1.c;
        int j1 = m1.b;
        int l1 = 0;
        int i5 = -1;
        while (j1 < l5 + i6) 
        {
            int j3;
            if (c.a(j1) != null || b(j1))
            {
                j3 = l1;
                int i4 = k2;
                if (i5 == 0)
                {
                    b(a(2, k2, l1));
                    j3 = 0;
                    i4 = j1;
                }
                k2 = i4;
                l1 = 1;
            } else
            {
                j3 = l1;
                int j4 = k2;
                if (i5 == 1)
                {
                    c(a(2, k2, l1));
                    j3 = 0;
                    j4 = j1;
                }
                k2 = j4;
                l1 = 0;
            }
            j1++;
            j3++;
            i5 = l1;
            l1 = j3;
        }
        m m4 = m1;
        if (l1 != m1.c)
        {
            a(m1);
            m4 = a(2, k2, l1);
        }
        if (i5 == 0)
        {
            b(m4);
        } else
        {
            c(m4);
        }
          goto _L19
_L23:
        c(m1);
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
            c.b((m)b.get(i));
        }

        a(b);
    }

    final boolean c(int i, int j)
    {
        a.add(a(0, i, j));
        return a.size() == 1;
    }

    final boolean d()
    {
        return a.size() > 0;
    }

    final boolean d(int i, int j)
    {
        a.add(a(1, i, j));
        return a.size() == 1;
    }

    final void e()
    {
        int i;
        int j;
        c();
        j = a.size();
        i = 0;
_L7:
        m m1;
        if (i >= j)
        {
            break MISSING_BLOCK_LABEL_207;
        }
        m1 = (m)a.get(i);
        m1.a;
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
        c.b(m1);
        c.d(m1.b, m1.c);
          goto _L8
_L3:
        c.b(m1);
        c.a(m1.b, m1.c);
          goto _L8
_L4:
        c.b(m1);
        c.c(m1.b, m1.c);
          goto _L8
        c.b(m1);
        c.e(m1.b, m1.c);
          goto _L8
        a(a);
        return;
    }

    final boolean e(int i, int j)
    {
        if (i != j)
        {
            a.add(a(3, i, j));
            if (a.size() == 1)
            {
                return true;
            }
        }
        return false;
    }
}
