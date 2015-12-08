// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import java.util.ArrayList;
import java.util.List;

// Referenced classes of package android.support.v7.widget:
//            k

final class android.support.v7.widget.a
    implements k.a
{
    static interface a
    {

        public abstract RecyclerView.v a(int i);

        public abstract void a(int i, int j);

        public abstract void a(int i, int j, Object obj);

        public abstract void a(b b1);

        public abstract void b(int i, int j);

        public abstract void b(b b1);

        public abstract void c(int i, int j);

        public abstract void d(int i, int j);
    }

    static final class b
    {

        int a;
        int b;
        Object c;
        int d;

        public final boolean equals(Object obj)
        {
            if (this != obj) goto _L2; else goto _L1
_L1:
            return true;
_L2:
            if (obj == null || getClass() != obj.getClass())
            {
                return false;
            }
            obj = (b)obj;
            if (a != ((b) (obj)).a)
            {
                return false;
            }
            if (a == 3 && Math.abs(d - b) == 1 && d == ((b) (obj)).b && b == ((b) (obj)).d) goto _L1; else goto _L3
_L3:
            if (d != ((b) (obj)).d)
            {
                return false;
            }
            if (b != ((b) (obj)).b)
            {
                return false;
            }
            if (c == null)
            {
                continue; /* Loop/switch isn't completed */
            }
            if (c.equals(((b) (obj)).c)) goto _L1; else goto _L4
_L4:
            return false;
            if (((b) (obj)).c == null) goto _L1; else goto _L5
_L5:
            return false;
        }

        public final int hashCode()
        {
            return (a * 31 + b) * 31 + d;
        }

        public final String toString()
        {
            StringBuilder stringbuilder = (new StringBuilder()).append(Integer.toHexString(System.identityHashCode(this))).append("[");
            a;
            JVM INSTR tableswitch 0 3: default 56
        //                       0 109
        //                       1 115
        //                       2 121
        //                       3 127;
               goto _L1 _L2 _L3 _L4 _L5
_L1:
            String s = "??";
_L7:
            return stringbuilder.append(s).append(",s:").append(b).append("c:").append(d).append(",p:").append(c).append("]").toString();
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

        b(int i, int j, int l, Object obj)
        {
            a = i;
            b = j;
            d = l;
            c = obj;
        }
    }


    final ArrayList a;
    final ArrayList b;
    final a c;
    Runnable d;
    final boolean e;
    final k f;
    private android.support.v4.util.h.a g;

    android.support.v7.widget.a(a a1)
    {
        this(a1, (byte)0);
    }

    private android.support.v7.widget.a(a a1, byte byte0)
    {
        g = new android.support.v4.util.h.b();
        a = new ArrayList();
        b = new ArrayList();
        c = a1;
        e = false;
        f = new k(this);
    }

    private void a(b b1, int i)
    {
        c.a(b1);
        switch (b1.a)
        {
        default:
            throw new IllegalArgumentException("only remove and update ops can be dispatched in first pass");

        case 1: // '\001'
            c.a(i, b1.d);
            return;

        case 2: // '\002'
            c.a(i, b1.d, b1.c);
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

    private void b(b b1)
    {
        int i;
        int j1;
        int k1;
        if (b1.a == 0 || b1.a == 3)
        {
            throw new IllegalArgumentException("should not dispatch add or move for pre layout");
        }
        k1 = d(b1.b, b1.a);
        j1 = 1;
        i = b1.b;
        b1.a;
        JVM INSTR tableswitch 1 2: default 72
    //                   1 184
    //                   2 96;
           goto _L1 _L2 _L3
_L1:
        throw new IllegalArgumentException((new StringBuilder("op should be remove or update.")).append(b1).toString());
_L3:
        int l = 1;
_L8:
        int i1 = 1;
_L7:
        int j;
        int l1;
        if (i1 >= b1.d)
        {
            break MISSING_BLOCK_LABEL_292;
        }
        l1 = d(b1.b + l * i1, b1.a);
        j = 0;
        b1.a;
        JVM INSTR tableswitch 1 2: default 160
    //                   1 211
    //                   2 190;
           goto _L4 _L5 _L6
_L4:
        if (j != 0)
        {
            j = j1 + 1;
        } else
        {
            b b2 = a(b1.a, k1, j1, b1.c);
            a(b2, i);
            a(b2);
            j = i;
            if (b1.a == 2)
            {
                j = i + j1;
            }
            k1 = l1;
            j1 = 1;
            i = j;
            j = j1;
        }
        i1++;
        j1 = j;
          goto _L7
_L2:
        l = 0;
          goto _L8
_L6:
        if (l1 == k1 + 1)
        {
            j = 1;
        } else
        {
            j = 0;
        }
          goto _L4
_L5:
        if (l1 == k1)
        {
            j = 1;
        } else
        {
            j = 0;
        }
          goto _L4
        Object obj = b1.c;
        a(b1);
        if (j1 > 0)
        {
            b1 = a(b1.a, k1, j1, obj);
            a(b1, i);
            a(b1);
        }
        return;
          goto _L7
    }

    private boolean b(int i)
    {
        int j;
        int i1;
        i1 = b.size();
        j = 0;
_L7:
        if (j >= i1) goto _L2; else goto _L1
_L1:
        b b1 = (b)b.get(j);
        if (b1.a != 3) goto _L4; else goto _L3
_L3:
        if (a(b1.d, j + 1) != i)
        {
            continue; /* Loop/switch isn't completed */
        }
_L6:
        return true;
_L4:
        if (b1.a != 0)
        {
            continue; /* Loop/switch isn't completed */
        }
        int j1 = b1.b;
        int k1 = b1.d;
        int l = b1.b;
        do
        {
            if (l >= j1 + k1)
            {
                continue; /* Loop/switch isn't completed */
            }
            if (a(l, j + 1) == i)
            {
                break;
            }
            l++;
        } while (true);
        if (true) goto _L6; else goto _L5
_L5:
        j++;
          goto _L7
_L2:
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
            c.c(b1.b, b1.d);
            return;

        case 3: // '\003'
            c.d(b1.b, b1.d);
            return;

        case 1: // '\001'
            c.b(b1.b, b1.d);
            return;

        case 2: // '\002'
            c.a(b1.b, b1.d, b1.c);
            return;
        }
    }

    private int d(int i, int j)
    {
        int l = b.size() - 1;
        int i1 = i;
        do
        {
            if (l >= 0)
            {
                b b1 = (b)b.get(l);
                if (b1.a == 3)
                {
                    int j1;
                    if (b1.b < b1.d)
                    {
                        j1 = b1.b;
                        i = b1.d;
                    } else
                    {
                        j1 = b1.d;
                        i = b1.b;
                    }
                    if (i1 >= j1 && i1 <= i)
                    {
                        if (j1 == b1.b)
                        {
                            if (j == 0)
                            {
                                b1.d = b1.d + 1;
                            } else
                            if (j == 1)
                            {
                                b1.d = b1.d - 1;
                            }
                            i = i1 + 1;
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
                            i = i1 - 1;
                        }
                    } else
                    {
                        i = i1;
                        if (i1 < b1.b)
                        {
                            if (j == 0)
                            {
                                b1.b = b1.b + 1;
                                b1.d = b1.d + 1;
                                i = i1;
                            } else
                            {
                                i = i1;
                                if (j == 1)
                                {
                                    b1.b = b1.b - 1;
                                    b1.d = b1.d - 1;
                                    i = i1;
                                }
                            }
                        }
                    }
                } else
                if (b1.b <= i1)
                {
                    if (b1.a == 0)
                    {
                        i = i1 - b1.d;
                    } else
                    {
                        i = i1;
                        if (b1.a == 1)
                        {
                            i = i1 + b1.d;
                        }
                    }
                } else
                if (j == 0)
                {
                    b1.b = b1.b + 1;
                    i = i1;
                } else
                {
                    i = i1;
                    if (j == 1)
                    {
                        b1.b = b1.b - 1;
                        i = i1;
                    }
                }
                l--;
                i1 = i;
                continue;
            }
            i = b.size() - 1;
            while (i >= 0) 
            {
                b b2 = (b)b.get(i);
                if (b2.a == 3)
                {
                    if (b2.d == b2.b || b2.d < 0)
                    {
                        b.remove(i);
                        a(b2);
                    }
                } else
                if (b2.d <= 0)
                {
                    b.remove(i);
                    a(b2);
                }
                i--;
            }
            return i1;
        } while (true);
    }

    final int a(int i)
    {
        return a(i, 0);
    }

    final int a(int i, int j)
    {
        int i1;
        int j1;
        j1 = b.size();
        i1 = j;
        j = i;
_L5:
        i = j;
        if (i1 >= j1) goto _L2; else goto _L1
_L1:
        b b1 = (b)b.get(i1);
        if (b1.a != 3) goto _L4; else goto _L3
_L3:
        if (b1.b == j)
        {
            i = b1.d;
        } else
        {
            int l = j;
            if (b1.b < j)
            {
                l = j - 1;
            }
            i = l;
            if (b1.d <= l)
            {
                i = l + 1;
            }
        }
_L7:
        i1++;
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
        if (j >= b1.b + b1.d) goto _L9; else goto _L8
_L8:
        i = -1;
_L2:
        return i;
_L9:
        i = j - b1.d;
          goto _L7
        i = j;
        if (b1.a == 0)
        {
            i = j + b1.d;
        }
          goto _L7
    }

    public final b a(int i, int j, int l, Object obj)
    {
        b b1 = (b)g.a();
        if (b1 == null)
        {
            return new b(i, j, l, obj);
        } else
        {
            b1.a = i;
            b1.b = j;
            b1.d = l;
            b1.c = obj;
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
            b1.c = null;
            g.a(b1);
        }
    }

    final boolean a(int i, int j, int l)
    {
        if (i != j)
        {
            if (l != 1)
            {
                throw new IllegalArgumentException("Moving more than 1 item is not supported yet");
            }
            a.add(a(3, i, j, null));
            if (a.size() == 1)
            {
                return true;
            }
        }
        return false;
    }

    final boolean a(int i, int j, Object obj)
    {
        a.add(a(2, i, j, obj));
        return a.size() == 1;
    }

    final void b()
    {
        k k1;
        ArrayList arraylist;
        k1 = f;
        arraylist = a;
_L16:
        int i;
        int j1;
        j1 = 0;
        i = arraylist.size() - 1;
_L9:
        if (i < 0) goto _L2; else goto _L1
_L1:
        if (((b)arraylist.get(i)).a != 3) goto _L4; else goto _L3
_L3:
        if (j1 == 0)
        {
            continue; /* Loop/switch isn't completed */
        }
        j1 = i;
_L10:
        b b4;
        b b5;
        int k4;
        if (j1 == -1)
        {
            break; /* Loop/switch isn't completed */
        }
        k4 = j1 + 1;
        b4 = (b)arraylist.get(j1);
        b5 = (b)arraylist.get(k4);
        b5.a;
        JVM INSTR tableswitch 0 2: default 128
    //                   0 131
    //                   1 289
    //                   2 987;
           goto _L5 _L6 _L7 _L8
_L5:
        continue; /* Loop/switch isn't completed */
_L6:
        i = 0;
        if (b4.d < b5.b)
        {
            i = -1;
        }
        int i2 = i;
        if (b4.b < b5.b)
        {
            i2 = i + 1;
        }
        if (b5.b <= b4.b)
        {
            b4.b = b4.b + b5.d;
        }
        if (b5.b <= b4.d)
        {
            b4.d = b4.d + b5.d;
        }
        b5.b = i2 + b5.b;
        arraylist.set(j1, b5);
        arraylist.set(k4, b4);
        continue; /* Loop/switch isn't completed */
_L4:
        j1 = 1;
        i--;
          goto _L9
_L2:
        j1 = -1;
          goto _L10
_L7:
        b b1;
        boolean flag1;
        b1 = null;
        boolean flag2 = false;
        boolean flag;
        if (b4.b < b4.d)
        {
            boolean flag3 = false;
            flag1 = flag3;
            flag = flag2;
            if (b5.b == b4.b)
            {
                flag1 = flag3;
                flag = flag2;
                if (b5.d == b4.d - b4.b)
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
            if (b5.b == b4.d + 1)
            {
                flag1 = flag4;
                flag = flag2;
                if (b5.d == b4.b - b4.d)
                {
                    flag = true;
                    flag1 = flag4;
                }
            }
        }
        if (b4.d >= b5.b) goto _L12; else goto _L11
_L11:
        b5.b = b5.b - 1;
_L14:
        if (b4.b <= b5.b)
        {
            b5.b = b5.b + 1;
        } else
        if (b4.b < b5.b + b5.d)
        {
            int l2 = b5.b;
            int k3 = b5.d;
            int l4 = b4.b;
            b1 = k1.a.a(1, b4.b + 1, (l2 + k3) - l4, null);
            b5.d = b4.b - b5.b;
        }
        if (flag)
        {
            arraylist.set(j1, b5);
            arraylist.remove(k4);
            k1.a.a(b4);
        } else
        {
            if (flag1)
            {
                if (b1 != null)
                {
                    if (b4.b > b1.b)
                    {
                        b4.b = b4.b - b1.d;
                    }
                    if (b4.d > b1.b)
                    {
                        b4.d = b4.d - b1.d;
                    }
                }
                if (b4.b > b5.b)
                {
                    b4.b = b4.b - b5.d;
                }
                if (b4.d > b5.b)
                {
                    b4.d = b4.d - b5.d;
                }
            } else
            {
                if (b1 != null)
                {
                    if (b4.b >= b1.b)
                    {
                        b4.b = b4.b - b1.d;
                    }
                    if (b4.d >= b1.b)
                    {
                        b4.d = b4.d - b1.d;
                    }
                }
                if (b4.b >= b5.b)
                {
                    b4.b = b4.b - b5.d;
                }
                if (b4.d >= b5.b)
                {
                    b4.d = b4.d - b5.d;
                }
            }
            arraylist.set(j1, b5);
            if (b4.b != b4.d)
            {
                arraylist.set(k4, b4);
            } else
            {
                arraylist.remove(k4);
            }
            if (b1 != null)
            {
                arraylist.add(j1, b1);
            }
        }
        continue; /* Loop/switch isn't completed */
_L12:
        if (b4.d >= b5.b + b5.d) goto _L14; else goto _L13
_L13:
        b5.d = b5.d - 1;
        b4.a = 1;
        b4.d = 1;
        if (b5.d == 0)
        {
            arraylist.remove(k4);
            k1.a.a(b5);
        }
        continue; /* Loop/switch isn't completed */
_L8:
        b b2;
        b1 = null;
        b2 = null;
        if (b4.d < b5.b)
        {
            b5.b = b5.b - 1;
        } else
        if (b4.d < b5.b + b5.d)
        {
            b5.d = b5.d - 1;
            b1 = k1.a.a(2, b4.b, 1, b5.c);
        }
_L25:
        if (b4.b <= b5.b)
        {
            b5.b = b5.b + 1;
        } else
        if (b4.b < b5.b + b5.d)
        {
            int j = (b5.b + b5.d) - b4.b;
            b2 = k1.a.a(2, b4.b + 1, j, b5.c);
            b5.d = b5.d - j;
        }
        arraylist.set(k4, b4);
        if (b5.d > 0)
        {
            arraylist.set(j1, b5);
        } else
        {
            arraylist.remove(j1);
            k1.a.a(b5);
        }
        if (b1 != null)
        {
            arraylist.add(j1, b1);
        }
        if (b2 != null)
        {
            arraylist.add(j1, b2);
        }
        if (true) goto _L16; else goto _L15
_L15:
        int j5;
        j5 = a.size();
        k4 = 0;
_L24:
        if (k4 >= j5) goto _L18; else goto _L17
_L17:
        b1 = (b)a.get(k4);
        b1.a;
        JVM INSTR tableswitch 0 3: default 1328
    //                   0 1353
    //                   1 1361
    //                   2 1604
    //                   3 1835;
           goto _L19 _L20 _L21 _L22 _L23
_L19:
        if (d != null)
        {
            d.run();
        }
        k4++;
          goto _L24
_L20:
        c(b1);
          goto _L19
_L21:
        int k5 = b1.b;
        int l = b1.b;
        int j2 = b1.d + l;
        byte byte1 = -1;
        l = b1.b;
        int l3 = 0;
        while (l < j2) 
        {
            byte byte0 = 0;
            int i3 = 0;
            if (c.a(l) != null || b(l))
            {
                if (byte1 == 0)
                {
                    b(a(1, k5, l3, null));
                    i3 = 1;
                }
                byte0 = 1;
            } else
            {
                if (byte1 == 1)
                {
                    c(a(1, k5, l3, null));
                    byte0 = 1;
                }
                byte1 = 0;
                i3 = byte0;
                byte0 = byte1;
            }
            if (i3 != 0)
            {
                i3 = l - l3;
                l = j2 - l3;
                j2 = 1;
            } else
            {
                l3++;
                i3 = l;
                l = j2;
                j2 = l3;
            }
            l3 = j2;
            j2 = l;
            l = i3 + 1;
            byte1 = byte0;
        }
        b b3 = b1;
        if (l3 != b1.d)
        {
            a(b1);
            b3 = a(1, k5, l3, null);
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
        int k2 = b1.b;
        int l5 = b1.b;
        int i6 = b1.d;
        int i1 = b1.b;
        int l1 = 0;
        int i5 = -1;
        while (i1 < l5 + i6) 
        {
            int j3;
            if (c.a(i1) != null || b(i1))
            {
                j3 = l1;
                int i4 = k2;
                if (i5 == 0)
                {
                    b(a(2, k2, l1, b1.c));
                    j3 = 0;
                    i4 = i1;
                }
                k2 = i4;
                l1 = 1;
            } else
            {
                j3 = l1;
                int j4 = k2;
                if (i5 == 1)
                {
                    c(a(2, k2, l1, b1.c));
                    j3 = 0;
                    j4 = i1;
                }
                k2 = j4;
                l1 = 0;
            }
            i1++;
            j3++;
            i5 = l1;
            l1 = j3;
        }
        Object obj = b1;
        if (l1 != b1.d)
        {
            obj = b1.c;
            a(b1);
            obj = a(2, k2, l1, obj);
        }
        if (i5 == 0)
        {
            b(((b) (obj)));
        } else
        {
            c(((b) (obj)));
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

    final boolean b(int i, int j)
    {
        a.add(a(0, i, j, null));
        return a.size() == 1;
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

    final boolean c(int i, int j)
    {
        a.add(a(1, i, j, null));
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
        b b1;
        if (i >= j)
        {
            break MISSING_BLOCK_LABEL_211;
        }
        b1 = (b)a.get(i);
        b1.a;
        JVM INSTR tableswitch 0 3: default 64
    //                   0 87
    //                   1 117
    //                   2 147
    //                   3 181;
           goto _L1 _L2 _L3 _L4 _L5
_L5:
        break MISSING_BLOCK_LABEL_181;
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
        c.c(b1.b, b1.d);
          goto _L8
_L3:
        c.b(b1);
        c.a(b1.b, b1.d);
          goto _L8
_L4:
        c.b(b1);
        c.a(b1.b, b1.d, b1.c);
          goto _L8
        c.b(b1);
        c.d(b1.b, b1.d);
          goto _L8
        a(a);
        return;
    }
}
