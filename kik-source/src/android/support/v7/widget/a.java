// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import java.util.ArrayList;
import java.util.List;

// Referenced classes of package android.support.v7.widget:
//            p

final class android.support.v7.widget.a
    implements p.a
{
    static interface a
    {

        public abstract RecyclerView.t a(int i);

        public abstract void a(int i, int j);

        public abstract void a(b b1);

        public abstract void b(int i, int j);

        public abstract void b(b b1);

        public abstract void c(int i, int j);

        public abstract void d(int i, int j);

        public abstract void e(int i, int j);
    }

    static final class b
    {

        int a;
        int b;
        int c;

        public final boolean equals(Object obj)
        {
            if (this != obj)
            {
                if (obj == null || getClass() != obj.getClass())
                {
                    return false;
                }
                obj = (b)obj;
                if (a != ((b) (obj)).a)
                {
                    return false;
                }
                if (a != 3 || Math.abs(c - b) != 1 || c != ((b) (obj)).b || b != ((b) (obj)).c)
                {
                    if (c != ((b) (obj)).c)
                    {
                        return false;
                    }
                    if (b != ((b) (obj)).b)
                    {
                        return false;
                    }
                }
            }
            return true;
        }

        public final int hashCode()
        {
            return (a * 31 + b) * 31 + c;
        }

        public final String toString()
        {
            StringBuilder stringbuilder = new StringBuilder("[");
            a;
            JVM INSTR tableswitch 0 3: default 44
        //                       0 85
        //                       1 91
        //                       2 97
        //                       3 103;
               goto _L1 _L2 _L3 _L4 _L5
_L1:
            String s = "??";
_L7:
            return stringbuilder.append(s).append(",s:").append(b).append("c:").append(c).append("]").toString();
_L2:
            s = "add";
            continue; /* Loop/switch isn't completed */
_L3:
            s = "rm";
            continue; /* Loop/switch isn't completed */
_L4:
            s = "up";
            continue; /* Loop/switch isn't completed */
_L5:
            s = "mv";
            if (true) goto _L7; else goto _L6
_L6:
        }

        b(int i, int j, int k)
        {
            a = i;
            b = j;
            c = k;
        }
    }


    final ArrayList a;
    final ArrayList b;
    final a c;
    Runnable d;
    final boolean e;
    final p f;
    private android.support.v4.util.Pools.Pool g;

    android.support.v7.widget.a(a a1)
    {
        this(a1, (byte)0);
    }

    private android.support.v7.widget.a(a a1, byte byte0)
    {
        g = new android.support.v4.util.Pools.SimplePool(30);
        a = new ArrayList();
        b = new ArrayList();
        c = a1;
        e = false;
        f = new p(this);
    }

    private void a(b b1, int i)
    {
        c.a(b1);
        switch (b1.a)
        {
        default:
            throw new IllegalArgumentException("only remove and update ops can be dispatched in first pass");

        case 1: // '\001'
            c.a(i, b1.c);
            return;

        case 2: // '\002'
            c.c(i, b1.c);
            break;
        }
    }

    private void a(List list)
    {
        int j = list.size();
        for (int i = 0; i < j; i++)
        {
            a((b)list.get(i));
        }

        list.clear();
    }

    private int b(int i, int j)
    {
        int k = b.size() - 1;
        do
        {
            if (k >= 0)
            {
                b b1 = (b)b.get(k);
                if (b1.a == 3)
                {
                    int l;
                    int i1;
                    if (b1.b < b1.c)
                    {
                        i1 = b1.b;
                        l = b1.c;
                    } else
                    {
                        i1 = b1.c;
                        l = b1.b;
                    }
                    if (i >= i1 && i <= l)
                    {
                        if (i1 == b1.b)
                        {
                            if (j == 0)
                            {
                                b1.c = b1.c + 1;
                            } else
                            if (j == 1)
                            {
                                b1.c = b1.c - 1;
                            }
                            i++;
                        } else
                        {
                            if (j == 0)
                            {
                                b1.b = b1.b + 1;
                            } else
                            if (j == 1)
                            {
                                b1.b = b1.b - 1;
                            }
                            i--;
                        }
                    } else
                    if (i < b1.b)
                    {
                        if (j == 0)
                        {
                            b1.b = b1.b + 1;
                            b1.c = b1.c + 1;
                        } else
                        if (j == 1)
                        {
                            b1.b = b1.b - 1;
                            b1.c = b1.c - 1;
                        }
                    }
                } else
                if (b1.b <= i)
                {
                    if (b1.a == 0)
                    {
                        i -= b1.c;
                    } else
                    if (b1.a == 1)
                    {
                        i = b1.c + i;
                    }
                } else
                if (j == 0)
                {
                    b1.b = b1.b + 1;
                } else
                if (j == 1)
                {
                    b1.b = b1.b - 1;
                }
                k--;
                continue;
            }
            j = b.size() - 1;
            while (j >= 0) 
            {
                b b2 = (b)b.get(j);
                if (b2.a == 3)
                {
                    if (b2.c == b2.b || b2.c < 0)
                    {
                        b.remove(j);
                        a(b2);
                    }
                } else
                if (b2.c <= 0)
                {
                    b.remove(j);
                    a(b2);
                }
                j--;
            }
            return i;
        } while (true);
    }

    private void b(b b1)
    {
        int j;
        int j1;
        if (b1.a == 0 || b1.a == 3)
        {
            throw new IllegalArgumentException("should not dispatch add or move for pre layout");
        }
        j1 = b(b1.b, b1.a);
        j = b1.b;
        b1.a;
        JVM INSTR tableswitch 1 2: default 72
    //                   1 183
    //                   2 96;
           goto _L1 _L2 _L3
_L1:
        throw new IllegalArgumentException((new StringBuilder("op should be remove or update.")).append(b1).toString());
_L3:
        int k = 1;
_L8:
        int l;
        int i1;
        i1 = 1;
        l = 1;
_L7:
        int k1;
        if (l >= b1.c)
        {
            break MISSING_BLOCK_LABEL_283;
        }
        k1 = b(b1.b + k * l, b1.a);
        b1.a;
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
            b b2 = a(b1.a, j1, i1);
            a(b2, j);
            a(b2);
            i = j;
            if (b1.a == 2)
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
        a(b1);
        if (i1 > 0)
        {
            b1 = a(b1.a, j1, i1);
            a(b1, j);
            a(b1);
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
            b b1 = (b)b.get(j);
            if (b1.a == 3)
            {
                if (a(b1.c, j + 1) == i)
                {
                    return true;
                }
                continue;
            }
            if (b1.a != 0)
            {
                continue;
            }
            int i1 = b1.b;
            int j1 = b1.c;
            int k = b1.b;
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

    private void c(b b1)
    {
        b.add(b1);
        switch (b1.a)
        {
        default:
            throw new IllegalArgumentException((new StringBuilder("Unknown update op type for ")).append(b1).toString());

        case 0: // '\0'
            c.d(b1.b, b1.c);
            return;

        case 3: // '\003'
            c.e(b1.b, b1.c);
            return;

        case 1: // '\001'
            c.b(b1.b, b1.c);
            return;

        case 2: // '\002'
            c.c(b1.b, b1.c);
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
        i1 = b.size();
        l = j;
        j = i;
_L5:
        i = j;
        if (l >= i1) goto _L2; else goto _L1
_L1:
        b b1 = (b)b.get(l);
        if (b1.a != 3) goto _L4; else goto _L3
_L3:
        if (b1.b == j)
        {
            i = b1.c;
        } else
        {
            int k = j;
            if (b1.b < j)
            {
                k = j - 1;
            }
            i = k;
            if (b1.c <= k)
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
        if (b1.b > j) goto _L7; else goto _L6
_L6:
        if (b1.a != 1)
        {
            break MISSING_BLOCK_LABEL_149;
        }
        if (j >= b1.b + b1.c) goto _L9; else goto _L8
_L8:
        i = -1;
_L2:
        return i;
_L9:
        i = j - b1.c;
          goto _L7
        i = j;
        if (b1.a == 0)
        {
            i = j + b1.c;
        }
          goto _L7
    }

    public final b a(int i, int j, int k)
    {
        b b1 = (b)g.acquire();
        if (b1 == null)
        {
            return new b(i, j, k);
        } else
        {
            b1.a = i;
            b1.b = j;
            b1.c = k;
            return b1;
        }
    }

    final void a()
    {
        a(((List) (a)));
        a(((List) (b)));
    }

    public final void a(b b1)
    {
        if (!e)
        {
            g.release(b1);
        }
    }

    final void b()
    {
        p p1;
        ArrayList arraylist;
        p1 = f;
        arraylist = a;
_L16:
        int i;
        int i1;
        i1 = 0;
        i = arraylist.size() - 1;
_L9:
        if (i < 0) goto _L2; else goto _L1
_L1:
        if (((b)arraylist.get(i)).a != 3) goto _L4; else goto _L3
_L3:
        if (i1 == 0)
        {
            continue; /* Loop/switch isn't completed */
        }
        i1 = i;
_L10:
        b b5;
        b b6;
        int i4;
        if (i1 == -1)
        {
            break; /* Loop/switch isn't completed */
        }
        i4 = i1 + 1;
        b5 = (b)arraylist.get(i1);
        b6 = (b)arraylist.get(i4);
        b6.a;
        JVM INSTR tableswitch 0 2: default 128
    //                   0 131
    //                   1 289
    //                   2 986;
           goto _L5 _L6 _L7 _L8
_L5:
        continue; /* Loop/switch isn't completed */
_L6:
        i = 0;
        if (b5.c < b6.b)
        {
            i = -1;
        }
        int k1 = i;
        if (b5.b < b6.b)
        {
            k1 = i + 1;
        }
        if (b6.b <= b5.b)
        {
            b5.b = b5.b + b6.c;
        }
        if (b6.b <= b5.c)
        {
            b5.c = b5.c + b6.c;
        }
        b6.b = k1 + b6.b;
        arraylist.set(i1, b6);
        arraylist.set(i4, b5);
        continue; /* Loop/switch isn't completed */
_L4:
        i1 = 1;
        i--;
          goto _L9
_L2:
        i1 = -1;
          goto _L10
_L7:
        b b1;
        boolean flag1;
        b1 = null;
        boolean flag2 = false;
        boolean flag;
        if (b5.b < b5.c)
        {
            boolean flag3 = false;
            flag1 = flag3;
            flag = flag2;
            if (b6.b == b5.b)
            {
                flag1 = flag3;
                flag = flag2;
                if (b6.c == b5.c - b5.b)
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
            if (b6.b == b5.c + 1)
            {
                flag1 = flag4;
                flag = flag2;
                if (b6.c == b5.b - b5.c)
                {
                    flag = true;
                    flag1 = flag4;
                }
            }
        }
        if (b5.c >= b6.b) goto _L12; else goto _L11
_L11:
        b6.b = b6.b - 1;
_L14:
        if (b5.b <= b6.b)
        {
            b6.b = b6.b + 1;
        } else
        if (b5.b < b6.b + b6.c)
        {
            int j2 = b6.b;
            int i3 = b6.c;
            int j4 = b5.b;
            b1 = p1.a.a(1, b5.b + 1, (j2 + i3) - j4);
            b6.c = b5.b - b6.b;
        }
        if (flag)
        {
            arraylist.set(i1, b6);
            arraylist.remove(i4);
            p1.a.a(b5);
        } else
        {
            if (flag1)
            {
                if (b1 != null)
                {
                    if (b5.b > b1.b)
                    {
                        b5.b = b5.b - b1.c;
                    }
                    if (b5.c > b1.b)
                    {
                        b5.c = b5.c - b1.c;
                    }
                }
                if (b5.b > b6.b)
                {
                    b5.b = b5.b - b6.c;
                }
                if (b5.c > b6.b)
                {
                    b5.c = b5.c - b6.c;
                }
            } else
            {
                if (b1 != null)
                {
                    if (b5.b >= b1.b)
                    {
                        b5.b = b5.b - b1.c;
                    }
                    if (b5.c >= b1.b)
                    {
                        b5.c = b5.c - b1.c;
                    }
                }
                if (b5.b >= b6.b)
                {
                    b5.b = b5.b - b6.c;
                }
                if (b5.c >= b6.b)
                {
                    b5.c = b5.c - b6.c;
                }
            }
            arraylist.set(i1, b6);
            if (b5.b != b5.c)
            {
                arraylist.set(i4, b5);
            } else
            {
                arraylist.remove(i4);
            }
            if (b1 != null)
            {
                arraylist.add(i1, b1);
            }
        }
        continue; /* Loop/switch isn't completed */
_L12:
        if (b5.c >= b6.b + b6.c) goto _L14; else goto _L13
_L13:
        b6.c = b6.c - 1;
        b5.a = 1;
        b5.c = 1;
        if (b6.c == 0)
        {
            arraylist.remove(i4);
            p1.a.a(b6);
        }
        continue; /* Loop/switch isn't completed */
_L8:
        b b2;
        b1 = null;
        b2 = null;
        if (b5.c < b6.b)
        {
            b6.b = b6.b - 1;
        } else
        if (b5.c < b6.b + b6.c)
        {
            b6.c = b6.c - 1;
            b1 = p1.a.a(2, b5.b, 1);
        }
_L25:
        if (b5.b <= b6.b)
        {
            b6.b = b6.b + 1;
        } else
        if (b5.b < b6.b + b6.c)
        {
            int j = (b6.b + b6.c) - b5.b;
            b2 = p1.a.a(2, b5.b + 1, j);
            b6.c = b6.c - j;
        }
        arraylist.set(i4, b5);
        if (b6.c > 0)
        {
            arraylist.set(i1, b6);
        } else
        {
            arraylist.remove(i1);
            p1.a.a(b6);
        }
        if (b1 != null)
        {
            arraylist.add(i1, b1);
        }
        if (b2 != null)
        {
            arraylist.add(i1, b2);
        }
        if (true) goto _L16; else goto _L15
_L15:
        int l4;
        l4 = a.size();
        i4 = 0;
_L24:
        if (i4 >= l4) goto _L18; else goto _L17
_L17:
        b1 = (b)a.get(i4);
        b1.a;
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
        c(b1);
          goto _L19
_L21:
        int i5 = b1.b;
        int k = b1.b;
        int l1 = b1.c + k;
        byte byte1 = -1;
        k = b1.b;
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
        b b3 = b1;
        if (j3 != b1.c)
        {
            a(b1);
            b3 = a(1, i5, j3);
        }
        if (byte1 == 0)
        {
            b(b3);
        } else
        {
            c(b3);
        }
          goto _L19
_L22:
        int i2 = b1.b;
        int j5 = b1.b;
        int k5 = b1.c;
        int l = b1.b;
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
        b b4 = b1;
        if (j1 != b1.c)
        {
            a(b1);
            b4 = a(2, i2, j1);
        }
        if (k4 == 0)
        {
            b(b4);
        } else
        {
            c(b4);
        }
          goto _L19
_L23:
        c(b1);
          goto _L19
_L18:
        a.clear();
        return;
          goto _L25
    }

    final void c()
    {
        int j = b.size();
        for (int i = 0; i < j; i++)
        {
            c.b((b)b.get(i));
        }

        a(b);
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
        b b1;
        if (i >= j)
        {
            break MISSING_BLOCK_LABEL_207;
        }
        b1 = (b)a.get(i);
        b1.a;
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
        c.b(b1);
        c.d(b1.b, b1.c);
          goto _L8
_L3:
        c.b(b1);
        c.a(b1.b, b1.c);
          goto _L8
_L4:
        c.b(b1);
        c.c(b1.b, b1.c);
          goto _L8
        c.b(b1);
        c.e(b1.b, b1.c);
          goto _L8
        a(a);
        return;
    }
}
