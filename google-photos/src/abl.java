// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.ArrayList;
import java.util.List;

public final class abl
    implements aed
{

    public final ArrayList a;
    private jw b;
    private ArrayList c;
    private abm d;
    private boolean e;
    private aec f;

    public abl(abm abm1)
    {
        this(abm1, false);
    }

    private abl(abm abm1, boolean flag)
    {
        b = new jx(30);
        a = new ArrayList();
        c = new ArrayList();
        d = abm1;
        e = false;
        f = new aec(this);
    }

    private void a(abn abn1, int i)
    {
        d.a(abn1);
        switch (abn1.a)
        {
        default:
            throw new IllegalArgumentException("only remove and update ops can be dispatched in first pass");

        case 1: // '\001'
            d.a(i, abn1.d);
            return;

        case 2: // '\002'
            d.a(i, abn1.d, abn1.c);
            break;
        }
    }

    private void a(List list)
    {
        int j = list.size();
        for (int i = 0; i < j; i++)
        {
            a((abn)list.get(i));
        }

        list.clear();
    }

    private int b(int i, int j)
    {
        int k = c.size() - 1;
        do
        {
            if (k >= 0)
            {
                abn abn1 = (abn)c.get(k);
                if (abn1.a == 3)
                {
                    int l;
                    int i1;
                    if (abn1.b < abn1.d)
                    {
                        i1 = abn1.b;
                        l = abn1.d;
                    } else
                    {
                        i1 = abn1.d;
                        l = abn1.b;
                    }
                    if (i >= i1 && i <= l)
                    {
                        if (i1 == abn1.b)
                        {
                            if (j == 0)
                            {
                                abn1.d = abn1.d + 1;
                            } else
                            if (j == 1)
                            {
                                abn1.d = abn1.d - 1;
                            }
                            i++;
                        } else
                        {
                            if (j == 0)
                            {
                                abn1.b = abn1.b + 1;
                            } else
                            if (j == 1)
                            {
                                abn1.b = abn1.b - 1;
                            }
                            i--;
                        }
                    } else
                    if (i < abn1.b)
                    {
                        if (j == 0)
                        {
                            abn1.b = abn1.b + 1;
                            abn1.d = abn1.d + 1;
                        } else
                        if (j == 1)
                        {
                            abn1.b = abn1.b - 1;
                            abn1.d = abn1.d - 1;
                        }
                    }
                } else
                if (abn1.b <= i)
                {
                    if (abn1.a == 0)
                    {
                        i -= abn1.d;
                    } else
                    if (abn1.a == 1)
                    {
                        i = abn1.d + i;
                    }
                } else
                if (j == 0)
                {
                    abn1.b = abn1.b + 1;
                } else
                if (j == 1)
                {
                    abn1.b = abn1.b - 1;
                }
                k--;
                continue;
            }
            j = c.size() - 1;
            while (j >= 0) 
            {
                abn abn2 = (abn)c.get(j);
                if (abn2.a == 3)
                {
                    if (abn2.d == abn2.b || abn2.d < 0)
                    {
                        c.remove(j);
                        a(abn2);
                    }
                } else
                if (abn2.d <= 0)
                {
                    c.remove(j);
                    a(abn2);
                }
                j--;
            }
            return i;
        } while (true);
    }

    private void b(abn abn1)
    {
        int j;
        int j1;
        if (abn1.a == 0 || abn1.a == 3)
        {
            throw new IllegalArgumentException("should not dispatch add or move for pre layout");
        }
        j1 = b(abn1.b, abn1.a);
        j = abn1.b;
        abn1.a;
        JVM INSTR tableswitch 1 2: default 72
    //                   1 183
    //                   2 96;
           goto _L1 _L2 _L3
_L1:
        throw new IllegalArgumentException((new StringBuilder("op should be remove or update.")).append(abn1).toString());
_L3:
        int k = 1;
_L8:
        int l;
        int i1;
        i1 = 1;
        l = 1;
_L7:
        int k1;
        if (l >= abn1.d)
        {
            break MISSING_BLOCK_LABEL_287;
        }
        k1 = b(abn1.b + k * l, abn1.a);
        abn1.a;
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
            abn abn2 = a(abn1.a, j1, i1, abn1.c);
            a(abn2, j);
            a(abn2);
            i = j;
            if (abn1.a == 2)
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
        Object obj = abn1.c;
        a(abn1);
        if (i1 > 0)
        {
            abn1 = a(abn1.a, j1, i1, obj);
            a(abn1, j);
            a(abn1);
        }
        return;
          goto _L7
    }

    private boolean b(int i)
    {
        int l = c.size();
label0:
        for (int j = 0; j < l; j++)
        {
            abn abn1 = (abn)c.get(j);
            if (abn1.a == 3)
            {
                if (a(abn1.d, j + 1) == i)
                {
                    return true;
                }
                continue;
            }
            if (abn1.a != 0)
            {
                continue;
            }
            int i1 = abn1.b;
            int j1 = abn1.d;
            int k = abn1.b;
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

    private void c(abn abn1)
    {
        c.add(abn1);
        switch (abn1.a)
        {
        default:
            throw new IllegalArgumentException((new StringBuilder("Unknown update op type for ")).append(abn1).toString());

        case 0: // '\0'
            d.c(abn1.b, abn1.d);
            return;

        case 3: // '\003'
            d.d(abn1.b, abn1.d);
            return;

        case 1: // '\001'
            d.b(abn1.b, abn1.d);
            return;

        case 2: // '\002'
            d.a(abn1.b, abn1.d, abn1.c);
            return;
        }
    }

    final int a(int i)
    {
        return a(i, 0);
    }

    final int a(int i, int j)
    {
        int l;
        int i1;
        i1 = c.size();
        l = j;
        j = i;
_L5:
        i = j;
        if (l >= i1) goto _L2; else goto _L1
_L1:
        abn abn1 = (abn)c.get(l);
        if (abn1.a != 3) goto _L4; else goto _L3
_L3:
        if (abn1.b == j)
        {
            i = abn1.d;
        } else
        {
            int k = j;
            if (abn1.b < j)
            {
                k = j - 1;
            }
            i = k;
            if (abn1.d <= k)
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
        if (abn1.b > j) goto _L7; else goto _L6
_L6:
        if (abn1.a != 1)
        {
            break MISSING_BLOCK_LABEL_149;
        }
        if (j >= abn1.b + abn1.d) goto _L9; else goto _L8
_L8:
        i = -1;
_L2:
        return i;
_L9:
        i = j - abn1.d;
          goto _L7
        i = j;
        if (abn1.a == 0)
        {
            i = j + abn1.d;
        }
          goto _L7
    }

    public final abn a(int i, int j, int k, Object obj)
    {
        abn abn1 = (abn)b.a();
        if (abn1 == null)
        {
            return new abn(i, j, k, obj);
        } else
        {
            abn1.a = i;
            abn1.b = j;
            abn1.d = k;
            abn1.c = obj;
            return abn1;
        }
    }

    public final void a()
    {
        a(((List) (a)));
        a(((List) (c)));
    }

    public final void a(abn abn1)
    {
        if (!e)
        {
            abn1.c = null;
            b.a(abn1);
        }
    }

    public final void b()
    {
        aec aec1;
        ArrayList arraylist;
        aec1 = f;
        arraylist = a;
_L16:
        int i;
        int i1;
        i1 = 0;
        i = arraylist.size() - 1;
_L9:
        if (i < 0) goto _L2; else goto _L1
_L1:
        if (((abn)arraylist.get(i)).a != 3) goto _L4; else goto _L3
_L3:
        if (i1 == 0)
        {
            continue; /* Loop/switch isn't completed */
        }
        i1 = i;
_L10:
        abn abn4;
        abn abn5;
        int i4;
        if (i1 == -1)
        {
            break; /* Loop/switch isn't completed */
        }
        i4 = i1 + 1;
        abn4 = (abn)arraylist.get(i1);
        abn5 = (abn)arraylist.get(i4);
        abn5.a;
        JVM INSTR tableswitch 0 2: default 128
    //                   0 131
    //                   1 289
    //                   2 987;
           goto _L5 _L6 _L7 _L8
_L5:
        continue; /* Loop/switch isn't completed */
_L6:
        i = 0;
        if (abn4.d < abn5.b)
        {
            i = -1;
        }
        int k1 = i;
        if (abn4.b < abn5.b)
        {
            k1 = i + 1;
        }
        if (abn5.b <= abn4.b)
        {
            abn4.b = abn4.b + abn5.d;
        }
        if (abn5.b <= abn4.d)
        {
            abn4.d = abn4.d + abn5.d;
        }
        abn5.b = k1 + abn5.b;
        arraylist.set(i1, abn5);
        arraylist.set(i4, abn4);
        continue; /* Loop/switch isn't completed */
_L4:
        i1 = 1;
        i--;
          goto _L9
_L2:
        i1 = -1;
          goto _L10
_L7:
        abn abn1;
        boolean flag1;
        abn1 = null;
        boolean flag2 = false;
        boolean flag;
        if (abn4.b < abn4.d)
        {
            boolean flag3 = false;
            flag1 = flag3;
            flag = flag2;
            if (abn5.b == abn4.b)
            {
                flag1 = flag3;
                flag = flag2;
                if (abn5.d == abn4.d - abn4.b)
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
            if (abn5.b == abn4.d + 1)
            {
                flag1 = flag4;
                flag = flag2;
                if (abn5.d == abn4.b - abn4.d)
                {
                    flag = true;
                    flag1 = flag4;
                }
            }
        }
        if (abn4.d >= abn5.b) goto _L12; else goto _L11
_L11:
        abn5.b = abn5.b - 1;
_L14:
        if (abn4.b <= abn5.b)
        {
            abn5.b = abn5.b + 1;
        } else
        if (abn4.b < abn5.b + abn5.d)
        {
            int j2 = abn5.b;
            int i3 = abn5.d;
            int j4 = abn4.b;
            abn1 = aec1.a.a(1, abn4.b + 1, (j2 + i3) - j4, null);
            abn5.d = abn4.b - abn5.b;
        }
        if (flag)
        {
            arraylist.set(i1, abn5);
            arraylist.remove(i4);
            aec1.a.a(abn4);
        } else
        {
            if (flag1)
            {
                if (abn1 != null)
                {
                    if (abn4.b > abn1.b)
                    {
                        abn4.b = abn4.b - abn1.d;
                    }
                    if (abn4.d > abn1.b)
                    {
                        abn4.d = abn4.d - abn1.d;
                    }
                }
                if (abn4.b > abn5.b)
                {
                    abn4.b = abn4.b - abn5.d;
                }
                if (abn4.d > abn5.b)
                {
                    abn4.d = abn4.d - abn5.d;
                }
            } else
            {
                if (abn1 != null)
                {
                    if (abn4.b >= abn1.b)
                    {
                        abn4.b = abn4.b - abn1.d;
                    }
                    if (abn4.d >= abn1.b)
                    {
                        abn4.d = abn4.d - abn1.d;
                    }
                }
                if (abn4.b >= abn5.b)
                {
                    abn4.b = abn4.b - abn5.d;
                }
                if (abn4.d >= abn5.b)
                {
                    abn4.d = abn4.d - abn5.d;
                }
            }
            arraylist.set(i1, abn5);
            if (abn4.b != abn4.d)
            {
                arraylist.set(i4, abn4);
            } else
            {
                arraylist.remove(i4);
            }
            if (abn1 != null)
            {
                arraylist.add(i1, abn1);
            }
        }
        continue; /* Loop/switch isn't completed */
_L12:
        if (abn4.d >= abn5.b + abn5.d) goto _L14; else goto _L13
_L13:
        abn5.d = abn5.d - 1;
        abn4.a = 1;
        abn4.d = 1;
        if (abn5.d == 0)
        {
            arraylist.remove(i4);
            aec1.a.a(abn5);
        }
        continue; /* Loop/switch isn't completed */
_L8:
        abn abn2;
        abn1 = null;
        abn2 = null;
        if (abn4.d < abn5.b)
        {
            abn5.b = abn5.b - 1;
        } else
        if (abn4.d < abn5.b + abn5.d)
        {
            abn5.d = abn5.d - 1;
            abn1 = aec1.a.a(2, abn4.b, 1, abn5.c);
        }
_L25:
        if (abn4.b <= abn5.b)
        {
            abn5.b = abn5.b + 1;
        } else
        if (abn4.b < abn5.b + abn5.d)
        {
            int j = (abn5.b + abn5.d) - abn4.b;
            abn2 = aec1.a.a(2, abn4.b + 1, j, abn5.c);
            abn5.d = abn5.d - j;
        }
        arraylist.set(i4, abn4);
        if (abn5.d > 0)
        {
            arraylist.set(i1, abn5);
        } else
        {
            arraylist.remove(i1);
            aec1.a.a(abn5);
        }
        if (abn1 != null)
        {
            arraylist.add(i1, abn1);
        }
        if (abn2 != null)
        {
            arraylist.add(i1, abn2);
        }
        if (true) goto _L16; else goto _L15
_L15:
        int l4;
        l4 = a.size();
        i4 = 0;
_L24:
        if (i4 >= l4) goto _L18; else goto _L17
_L17:
        abn1 = (abn)a.get(i4);
        abn1.a;
        JVM INSTR tableswitch 0 3: default 1328
    //                   0 1337
    //                   1 1345
    //                   2 1588
    //                   3 1819;
           goto _L19 _L20 _L21 _L22 _L23
_L19:
        i4++;
          goto _L24
_L20:
        c(abn1);
          goto _L19
_L21:
        int i5 = abn1.b;
        int k = abn1.b;
        int l1 = abn1.d + k;
        byte byte1 = -1;
        k = abn1.b;
        int j3 = 0;
        while (k < l1) 
        {
            byte byte0 = 0;
            int k2 = 0;
            if (d.a(k) != null || b(k))
            {
                if (byte1 == 0)
                {
                    b(a(1, i5, j3, null));
                    k2 = 1;
                }
                byte0 = 1;
            } else
            {
                if (byte1 == 1)
                {
                    c(a(1, i5, j3, null));
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
        abn abn3 = abn1;
        if (j3 != abn1.d)
        {
            a(abn1);
            abn3 = a(1, i5, j3, null);
        }
        if (byte1 == 0)
        {
            b(abn3);
        } else
        {
            c(abn3);
        }
          goto _L19
_L22:
        int i2 = abn1.b;
        int j5 = abn1.b;
        int k5 = abn1.d;
        int l = abn1.b;
        int j1 = 0;
        int k4 = -1;
        while (l < j5 + k5) 
        {
            int l2;
            if (d.a(l) != null || b(l))
            {
                l2 = j1;
                int k3 = i2;
                if (k4 == 0)
                {
                    b(a(2, i2, j1, abn1.c));
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
                    c(a(2, i2, j1, abn1.c));
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
        Object obj = abn1;
        if (j1 != abn1.d)
        {
            obj = abn1.c;
            a(abn1);
            obj = a(2, i2, j1, obj);
        }
        if (k4 == 0)
        {
            b(((abn) (obj)));
        } else
        {
            c(((abn) (obj)));
        }
          goto _L19
_L23:
        c(abn1);
          goto _L19
_L18:
        a.clear();
        return;
          goto _L25
    }

    public final void c()
    {
        int j = c.size();
        for (int i = 0; i < j; i++)
        {
            d.b((abn)c.get(i));
        }

        a(c);
    }

    final boolean d()
    {
        return a.size() > 0;
    }

    public final void e()
    {
        int i;
        int j;
        c();
        j = a.size();
        i = 0;
_L7:
        abn abn1;
        if (i >= j)
        {
            break MISSING_BLOCK_LABEL_195;
        }
        abn1 = (abn)a.get(i);
        abn1.a;
        JVM INSTR tableswitch 0 3: default 64
    //                   0 71
    //                   1 101
    //                   2 131
    //                   3 165;
           goto _L1 _L2 _L3 _L4 _L5
_L5:
        break MISSING_BLOCK_LABEL_165;
_L1:
        break; /* Loop/switch isn't completed */
_L2:
        break; /* Loop/switch isn't completed */
_L8:
        i++;
        if (true) goto _L7; else goto _L6
_L6:
        d.b(abn1);
        d.c(abn1.b, abn1.d);
          goto _L8
_L3:
        d.b(abn1);
        d.a(abn1.b, abn1.d);
          goto _L8
_L4:
        d.b(abn1);
        d.a(abn1.b, abn1.d, abn1.c);
          goto _L8
        d.b(abn1);
        d.d(abn1.b, abn1.d);
          goto _L8
        a(a);
        return;
    }
}
