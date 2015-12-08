// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import java.util.ArrayList;
import java.util.List;

// Referenced classes of package android.support.v7.widget:
//            OpReorderer

class AdapterHelper
    implements OpReorderer.Callback
{

    final ArrayList a;
    final ArrayList b;
    final Callback c;
    Runnable d;
    final boolean e;
    final OpReorderer f;
    private android.support.v4.util.Pools.Pool g;

    AdapterHelper(Callback callback)
    {
        this(callback, false);
    }

    AdapterHelper(Callback callback, boolean flag)
    {
        g = new android.support.v4.util.Pools.SimplePool(30);
        a = new ArrayList();
        b = new ArrayList();
        c = callback;
        e = flag;
        f = new OpReorderer(this);
    }

    private void b(UpdateOp updateop)
    {
        g(updateop);
    }

    private void c(UpdateOp updateop)
    {
        int i1 = updateop.b;
        int j = updateop.b + updateop.d;
        byte byte0 = -1;
        int i = updateop.b;
        int l = 0;
        while (i < j) 
        {
            if (c.a(i) != null || c(i))
            {
                UpdateOp updateop1;
                int k;
                boolean flag;
                if (byte0 == 0)
                {
                    e(a(1, i1, l, null));
                    k = 1;
                } else
                {
                    k = 0;
                }
                byte0 = 1;
            } else
            {
                if (byte0 == 1)
                {
                    g(a(1, i1, l, null));
                    byte0 = 1;
                } else
                {
                    byte0 = 0;
                }
                flag = false;
                k = byte0;
                byte0 = flag;
            }
            if (k != 0)
            {
                k = i - l;
                i = j - l;
                j = 1;
            } else
            {
                l++;
                k = i;
                i = j;
                j = l;
            }
            l = j;
            j = i;
            i = k + 1;
        }
        updateop1 = updateop;
        if (l != updateop.d)
        {
            a(updateop);
            updateop1 = a(1, i1, l, null);
        }
        if (byte0 == 0)
        {
            e(updateop1);
            return;
        } else
        {
            g(updateop1);
            return;
        }
    }

    private boolean c(int i)
    {
        int l = b.size();
label0:
        for (int j = 0; j < l; j++)
        {
            UpdateOp updateop = (UpdateOp)b.get(j);
            if (updateop.a == 3)
            {
                if (a(updateop.d, j + 1) == i)
                {
                    return true;
                }
                continue;
            }
            if (updateop.a != 0)
            {
                continue;
            }
            int i1 = updateop.b;
            int j1 = updateop.d;
            int k = updateop.b;
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

    private int d(int i, int j)
    {
        int l = b.size() - 1;
        do
        {
            if (l >= 0)
            {
                UpdateOp updateop = (UpdateOp)b.get(l);
                int k;
                if (updateop.a == 3)
                {
                    int i1;
                    if (updateop.b < updateop.d)
                    {
                        i1 = updateop.b;
                        k = updateop.d;
                    } else
                    {
                        i1 = updateop.d;
                        k = updateop.b;
                    }
                    if (i >= i1 && i <= k)
                    {
                        if (i1 == updateop.b)
                        {
                            if (j == 0)
                            {
                                updateop.d = updateop.d + 1;
                            } else
                            if (j == 1)
                            {
                                updateop.d = updateop.d - 1;
                            }
                            i++;
                        } else
                        {
                            if (j == 0)
                            {
                                updateop.b = updateop.b + 1;
                            } else
                            if (j == 1)
                            {
                                updateop.b = updateop.b - 1;
                            }
                            i--;
                        }
                    } else
                    if (i < updateop.b)
                    {
                        if (j == 0)
                        {
                            updateop.b = updateop.b + 1;
                            updateop.d = updateop.d + 1;
                        } else
                        if (j == 1)
                        {
                            updateop.b = updateop.b - 1;
                            updateop.d = updateop.d - 1;
                        }
                    }
                    k = i;
                } else
                if (updateop.b <= i)
                {
                    if (updateop.a == 0)
                    {
                        k = i - updateop.d;
                    } else
                    {
                        k = i;
                        if (updateop.a == 1)
                        {
                            k = i + updateop.d;
                        }
                    }
                } else
                if (j == 0)
                {
                    updateop.b = updateop.b + 1;
                    k = i;
                } else
                {
                    k = i;
                    if (j == 1)
                    {
                        updateop.b = updateop.b - 1;
                        k = i;
                    }
                }
                l--;
                i = k;
                continue;
            }
            j = b.size() - 1;
            while (j >= 0) 
            {
                UpdateOp updateop1 = (UpdateOp)b.get(j);
                if (updateop1.a == 3)
                {
                    if (updateop1.d == updateop1.b || updateop1.d < 0)
                    {
                        b.remove(j);
                        a(updateop1);
                    }
                } else
                if (updateop1.d <= 0)
                {
                    b.remove(j);
                    a(updateop1);
                }
                j--;
            }
            return i;
        } while (true);
    }

    private void d(UpdateOp updateop)
    {
        int k = updateop.b;
        int l1 = updateop.b;
        int i2 = updateop.d;
        int i = updateop.b;
        int k1 = -1;
        int j = 0;
        while (i < l1 + i2) 
        {
            int l;
            if (c.a(i) != null || c(i))
            {
                l = j;
                int i1 = k;
                if (k1 == 0)
                {
                    e(a(2, k, j, updateop.c));
                    l = 0;
                    i1 = i;
                }
                k = i1;
                j = 1;
            } else
            {
                l = j;
                int j1 = k;
                if (k1 == 1)
                {
                    g(a(2, k, j, updateop.c));
                    l = 0;
                    j1 = i;
                }
                k = j1;
                j = 0;
            }
            i++;
            l++;
            k1 = j;
            j = l;
        }
        Object obj = updateop;
        if (j != updateop.d)
        {
            obj = updateop.c;
            a(updateop);
            obj = a(2, k, j, obj);
        }
        if (k1 == 0)
        {
            e(((UpdateOp) (obj)));
            return;
        } else
        {
            g(((UpdateOp) (obj)));
            return;
        }
    }

    private void e(UpdateOp updateop)
    {
        int j;
        int j1;
        if (updateop.a == 0 || updateop.a == 3)
        {
            throw new IllegalArgumentException("should not dispatch add or move for pre layout");
        }
        j1 = d(updateop.b, updateop.a);
        j = updateop.b;
        updateop.a;
        JVM INSTR tableswitch 1 2: default 72
    //                   1 187
    //                   2 99;
           goto _L1 _L2 _L3
_L1:
        throw new IllegalArgumentException((new StringBuilder()).append("op should be remove or update.").append(updateop).toString());
_L3:
        int k = 1;
_L8:
        int l;
        int i1;
        i1 = 1;
        l = 1;
_L7:
        int k1;
        if (l >= updateop.d)
        {
            break MISSING_BLOCK_LABEL_291;
        }
        k1 = d(updateop.b + k * l, updateop.a);
        updateop.a;
        JVM INSTR tableswitch 1 2: default 164
    //                   1 212
    //                   2 193;
           goto _L4 _L5 _L6
_L4:
        int i = 0;
_L9:
        if (i != 0)
        {
            i = i1 + 1;
        } else
        {
            UpdateOp updateop1 = a(updateop.a, j1, i1, updateop.c);
            a(updateop1, j);
            a(updateop1);
            i = j;
            if (updateop.a == 2)
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
        Object obj = updateop.c;
        a(updateop);
        if (i1 > 0)
        {
            updateop = a(updateop.a, j1, i1, obj);
            a(updateop, j);
            a(updateop);
        }
        return;
          goto _L7
    }

    private void f(UpdateOp updateop)
    {
        g(updateop);
    }

    private void g(UpdateOp updateop)
    {
        b.add(updateop);
        switch (updateop.a)
        {
        default:
            throw new IllegalArgumentException((new StringBuilder()).append("Unknown update op type for ").append(updateop).toString());

        case 0: // '\0'
            c.c(updateop.b, updateop.d);
            return;

        case 3: // '\003'
            c.d(updateop.b, updateop.d);
            return;

        case 1: // '\001'
            c.b(updateop.b, updateop.d);
            return;

        case 2: // '\002'
            c.a(updateop.b, updateop.d, updateop.c);
            return;
        }
    }

    int a(int i)
    {
        return a(i, 0);
    }

    int a(int i, int j)
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
        UpdateOp updateop = (UpdateOp)b.get(l);
        if (updateop.a != 3) goto _L4; else goto _L3
_L3:
        if (updateop.b == j)
        {
            i = updateop.d;
        } else
        {
            int k = j;
            if (updateop.b < j)
            {
                k = j - 1;
            }
            i = k;
            if (updateop.d <= k)
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
        if (updateop.b > j) goto _L7; else goto _L6
_L6:
        if (updateop.a != 1)
        {
            break MISSING_BLOCK_LABEL_149;
        }
        if (j >= updateop.b + updateop.d) goto _L9; else goto _L8
_L8:
        i = -1;
_L2:
        return i;
_L9:
        i = j - updateop.d;
          goto _L7
        i = j;
        if (updateop.a == 0)
        {
            i = j + updateop.d;
        }
          goto _L7
    }

    public UpdateOp a(int i, int j, int k, Object obj)
    {
        UpdateOp updateop = (UpdateOp)g.a();
        if (updateop == null)
        {
            return new UpdateOp(i, j, k, obj);
        } else
        {
            updateop.a = i;
            updateop.b = j;
            updateop.d = k;
            updateop.c = obj;
            return updateop;
        }
    }

    void a()
    {
        a(((List) (a)));
        a(((List) (b)));
    }

    public void a(UpdateOp updateop)
    {
        if (!e)
        {
            updateop.c = null;
            g.a(updateop);
        }
    }

    void a(UpdateOp updateop, int i)
    {
        c.a(updateop);
        switch (updateop.a)
        {
        default:
            throw new IllegalArgumentException("only remove and update ops can be dispatched in first pass");

        case 1: // '\001'
            c.a(i, updateop.d);
            return;

        case 2: // '\002'
            c.a(i, updateop.d, updateop.c);
            break;
        }
    }

    void a(List list)
    {
        int j = list.size();
        for (int i = 0; i < j; i++)
        {
            a((UpdateOp)list.get(i));
        }

        list.clear();
    }

    boolean a(int i, int j, int k)
    {
        boolean flag = true;
        if (i == j)
        {
            return false;
        }
        if (k != 1)
        {
            throw new IllegalArgumentException("Moving more than 1 item is not supported yet");
        }
        a.add(a(3, i, j, null));
        if (a.size() != 1)
        {
            flag = false;
        }
        return flag;
    }

    boolean a(int i, int j, Object obj)
    {
        a.add(a(2, i, j, obj));
        return a.size() == 1;
    }

    public int b(int i)
    {
        int j;
        int l;
        int i1;
        i1 = a.size();
        l = 0;
        j = i;
_L8:
        i = j;
        if (l >= i1) goto _L2; else goto _L1
_L1:
        UpdateOp updateop;
        updateop = (UpdateOp)a.get(l);
        i = j;
        updateop.a;
        JVM INSTR tableswitch 0 3: default 72
    //                   0 85
    //                   1 105
    //                   2 74
    //                   3 142;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_142;
_L6:
        break; /* Loop/switch isn't completed */
_L3:
        i = j;
_L9:
        l++;
        j = i;
          goto _L8
_L4:
        i = j;
        if (updateop.b <= j)
        {
            i = j + updateop.d;
        }
          goto _L9
_L5:
        i = j;
        if (updateop.b > j) goto _L9; else goto _L10
_L10:
        if (updateop.b + updateop.d <= j) goto _L12; else goto _L11
_L11:
        i = -1;
_L2:
        return i;
_L12:
        i = j - updateop.d;
          goto _L9
        if (updateop.b == j)
        {
            i = updateop.d;
        } else
        {
            int k = j;
            if (updateop.b < j)
            {
                k = j - 1;
            }
            i = k;
            if (updateop.d <= k)
            {
                i = k + 1;
            }
        }
          goto _L9
    }

    void b()
    {
        int i;
        int j;
        f.a(a);
        j = a.size();
        i = 0;
_L7:
        UpdateOp updateop;
        if (i >= j)
        {
            break MISSING_BLOCK_LABEL_127;
        }
        updateop = (UpdateOp)a.get(i);
        updateop.a;
        JVM INSTR tableswitch 0 3: default 72
    //                   0 95
    //                   1 103
    //                   2 111
    //                   3 119;
           goto _L1 _L2 _L3 _L4 _L5
_L5:
        break MISSING_BLOCK_LABEL_119;
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
        f(updateop);
          goto _L8
_L3:
        c(updateop);
          goto _L8
_L4:
        d(updateop);
          goto _L8
        b(updateop);
          goto _L8
        a.clear();
        return;
    }

    boolean b(int i, int j)
    {
        a.add(a(0, i, j, null));
        return a.size() == 1;
    }

    void c()
    {
        int j = b.size();
        for (int i = 0; i < j; i++)
        {
            c.b((UpdateOp)b.get(i));
        }

        a(b);
    }

    boolean c(int i, int j)
    {
        a.add(a(1, i, j, null));
        return a.size() == 1;
    }

    boolean d()
    {
        return a.size() > 0;
    }

    void e()
    {
        int i;
        int j;
        c();
        j = a.size();
        i = 0;
_L7:
        UpdateOp updateop;
        if (i >= j)
        {
            break MISSING_BLOCK_LABEL_211;
        }
        updateop = (UpdateOp)a.get(i);
        updateop.a;
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
        c.b(updateop);
        c.c(updateop.b, updateop.d);
          goto _L8
_L3:
        c.b(updateop);
        c.a(updateop.b, updateop.d);
          goto _L8
_L4:
        c.b(updateop);
        c.a(updateop.b, updateop.d, updateop.c);
          goto _L8
        c.b(updateop);
        c.d(updateop.b, updateop.d);
          goto _L8
        a(a);
        return;
    }

    private class UpdateOp
    {

        int a;
        int b;
        Object c;
        int d;

        String a()
        {
            switch (a)
            {
            default:
                return "??";

            case 0: // '\0'
                return "add";

            case 1: // '\001'
                return "rm";

            case 2: // '\002'
                return "up";

            case 3: // '\003'
                return "mv";
            }
        }

        public boolean equals(Object obj)
        {
            if (this != obj) goto _L2; else goto _L1
_L1:
            return true;
_L2:
            if (obj == null || getClass() != obj.getClass())
            {
                return false;
            }
            obj = (UpdateOp)obj;
            if (a != ((UpdateOp) (obj)).a)
            {
                return false;
            }
            if (a == 3 && Math.abs(d - b) == 1 && d == ((UpdateOp) (obj)).b && b == ((UpdateOp) (obj)).d) goto _L1; else goto _L3
_L3:
            if (d != ((UpdateOp) (obj)).d)
            {
                return false;
            }
            if (b != ((UpdateOp) (obj)).b)
            {
                return false;
            }
            if (c == null)
            {
                continue; /* Loop/switch isn't completed */
            }
            if (c.equals(((UpdateOp) (obj)).c)) goto _L1; else goto _L4
_L4:
            return false;
            if (((UpdateOp) (obj)).c == null) goto _L1; else goto _L5
_L5:
            return false;
        }

        public int hashCode()
        {
            return (a * 31 + b) * 31 + d;
        }

        public String toString()
        {
            return (new StringBuilder()).append(Integer.toHexString(System.identityHashCode(this))).append("[").append(a()).append(",s:").append(b).append("c:").append(d).append(",p:").append(c).append("]").toString();
        }

        UpdateOp(int i, int j, int k, Object obj)
        {
            a = i;
            b = j;
            d = k;
            c = obj;
        }
    }


    private class Callback
    {

        public abstract RecyclerView.ViewHolder a(int i);

        public abstract void a(int i, int j);

        public abstract void a(int i, int j, Object obj);

        public abstract void a(UpdateOp updateop);

        public abstract void b(int i, int j);

        public abstract void b(UpdateOp updateop);

        public abstract void c(int i, int j);

        public abstract void d(int i, int j);
    }

}
