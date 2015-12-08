// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class acq extends aer
{

    ArrayList a;
    ArrayList b;
    ArrayList c;
    ArrayList d;
    ArrayList e;
    ArrayList f;
    ArrayList g;
    private ArrayList n;
    private ArrayList o;
    private ArrayList p;
    private ArrayList q;

    public acq()
    {
        n = new ArrayList();
        o = new ArrayList();
        p = new ArrayList();
        q = new ArrayList();
        a = new ArrayList();
        b = new ArrayList();
        c = new ArrayList();
        d = new ArrayList();
        e = new ArrayList();
        f = new ArrayList();
        g = new ArrayList();
    }

    private void a(acz acz1)
    {
        if (acz1.a != null)
        {
            a(acz1, acz1.a);
        }
        if (acz1.b != null)
        {
            a(acz1, acz1.b);
        }
    }

    private static void a(List list)
    {
        for (int i = list.size() - 1; i >= 0; i--)
        {
            mk.r(((afn)list.get(i)).a).a();
        }

    }

    private void a(List list, afn afn1)
    {
        for (int i = list.size() - 1; i >= 0; i--)
        {
            acz acz1 = (acz)list.get(i);
            if (a(acz1, afn1) && acz1.a == null && acz1.b == null)
            {
                list.remove(acz1);
            }
        }

    }

    private boolean a(acz acz1, afn afn1)
    {
        boolean flag;
        boolean flag1;
        flag1 = false;
        flag = false;
        if (acz1.b != afn1) goto _L2; else goto _L1
_L1:
        acz1.b = null;
_L6:
        mk.c(afn1.a, 1.0F);
        mk.a(afn1.a, 0.0F);
        mk.b(afn1.a, 0.0F);
        a(afn1, flag);
        flag = true;
_L4:
        return flag;
_L2:
        flag = flag1;
        if (acz1.a != afn1) goto _L4; else goto _L3
_L3:
        acz1.a = null;
        flag = true;
        if (true) goto _L6; else goto _L5
_L5:
    }

    private void g(afn afn1)
    {
        l.a(afn1.a);
        c(afn1);
    }

    public final void a()
    {
        boolean flag;
        boolean flag1;
        boolean flag2;
        boolean flag3;
        if (!n.isEmpty())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (!p.isEmpty())
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        if (!q.isEmpty())
        {
            flag2 = true;
        } else
        {
            flag2 = false;
        }
        if (!o.isEmpty())
        {
            flag3 = true;
        } else
        {
            flag3 = false;
        }
        if (flag || flag1 || flag3 || flag2)
        {
            afn afn1;
            ob ob1;
            for (Iterator iterator = n.iterator(); iterator.hasNext(); ob1.a(super.j).a(0.0F).a(new acu(this, afn1, ob1)).b())
            {
                afn1 = (afn)iterator.next();
                ob1 = mk.r(afn1.a);
                f.add(afn1);
            }

            n.clear();
            Object obj;
            if (flag1)
            {
                ArrayList arraylist = new ArrayList();
                arraylist.addAll(p);
                b.add(arraylist);
                p.clear();
                obj = new acr(this, arraylist);
                if (flag)
                {
                    mk.a(((ada)arraylist.get(0)).a.a, ((Runnable) (obj)), super.j);
                } else
                {
                    ((Runnable) (obj)).run();
                }
            }
            if (flag2)
            {
                arraylist = new ArrayList();
                arraylist.addAll(q);
                c.add(arraylist);
                q.clear();
                obj = new acs(this, arraylist);
                if (flag)
                {
                    mk.a(((acz)arraylist.get(0)).a.a, ((Runnable) (obj)), super.j);
                } else
                {
                    ((Runnable) (obj)).run();
                }
            }
            if (flag3)
            {
                arraylist = new ArrayList();
                arraylist.addAll(o);
                a.add(arraylist);
                o.clear();
                obj = new act(this, arraylist);
                if (flag || flag1 || flag2)
                {
                    long l1;
                    long l2;
                    long l3;
                    if (flag)
                    {
                        l1 = super.j;
                    } else
                    {
                        l1 = 0L;
                    }
                    if (flag1)
                    {
                        l2 = super.k;
                    } else
                    {
                        l2 = 0L;
                    }
                    if (flag2)
                    {
                        l3 = super.l;
                    } else
                    {
                        l3 = 0L;
                    }
                    l2 = Math.max(l2, l3);
                    mk.a(((afn)arraylist.get(0)).a, ((Runnable) (obj)), l1 + l2);
                    return;
                } else
                {
                    ((Runnable) (obj)).run();
                    return;
                }
            }
        }
    }

    public final boolean a(afn afn1)
    {
        g(afn1);
        n.add(afn1);
        return true;
    }

    public final boolean a(afn afn1, int i, int j, int k, int i1)
    {
        android.view.View view = afn1.a;
        i = (int)((float)i + mk.n(afn1.a));
        j = (int)((float)j + mk.o(afn1.a));
        g(afn1);
        int j1 = k - i;
        int k1 = i1 - j;
        if (j1 == 0 && k1 == 0)
        {
            e(afn1);
            return false;
        }
        if (j1 != 0)
        {
            mk.a(view, -j1);
        }
        if (k1 != 0)
        {
            mk.b(view, -k1);
        }
        p.add(new ada(afn1, i, j, k, i1));
        return true;
    }

    public final boolean a(afn afn1, afn afn2, int i, int j, int k, int i1)
    {
        float f1 = mk.n(afn1.a);
        float f2 = mk.o(afn1.a);
        float f3 = mk.f(afn1.a);
        g(afn1);
        int j1 = (int)((float)(k - i) - f1);
        int k1 = (int)((float)(i1 - j) - f2);
        mk.a(afn1.a, f1);
        mk.b(afn1.a, f2);
        mk.c(afn1.a, f3);
        if (afn2 != null && afn2.a != null)
        {
            g(afn2);
            mk.a(afn2.a, -j1);
            mk.b(afn2.a, -k1);
            mk.c(afn2.a, 0.0F);
        }
        q.add(new acz(afn1, afn2, i, j, k, i1));
        return true;
    }

    public final boolean b()
    {
        return !o.isEmpty() || !q.isEmpty() || !p.isEmpty() || !n.isEmpty() || !e.isEmpty() || !f.isEmpty() || !d.isEmpty() || !g.isEmpty() || !b.isEmpty() || !a.isEmpty() || !c.isEmpty();
    }

    public final boolean b(afn afn1)
    {
        g(afn1);
        mk.c(afn1.a, 0.0F);
        o.add(afn1);
        return true;
    }

    void c()
    {
        if (!b())
        {
            f();
        }
    }

    public final void c(afn afn1)
    {
        android.view.View view = afn1.a;
        mk.r(view).a();
        for (int i = p.size() - 1; i >= 0; i--)
        {
            if (((ada)p.get(i)).a == afn1)
            {
                mk.b(view, 0.0F);
                mk.a(view, 0.0F);
                e(afn1);
                p.remove(i);
            }
        }

        a(q, afn1);
        if (n.remove(afn1))
        {
            mk.c(view, 1.0F);
            d(afn1);
        }
        if (o.remove(afn1))
        {
            mk.c(view, 1.0F);
            f(afn1);
        }
        for (int j = c.size() - 1; j >= 0; j--)
        {
            ArrayList arraylist = (ArrayList)c.get(j);
            a(arraylist, afn1);
            if (arraylist.isEmpty())
            {
                c.remove(j);
            }
        }

        int k = b.size() - 1;
label0:
        do
        {
            if (k >= 0)
            {
                ArrayList arraylist1 = (ArrayList)b.get(k);
                int j1 = arraylist1.size() - 1;
                do
                {
label1:
                    {
                        if (j1 >= 0)
                        {
                            if (((ada)arraylist1.get(j1)).a != afn1)
                            {
                                break label1;
                            }
                            mk.b(view, 0.0F);
                            mk.a(view, 0.0F);
                            e(afn1);
                            arraylist1.remove(j1);
                            if (arraylist1.isEmpty())
                            {
                                b.remove(k);
                            }
                        }
                        k--;
                        continue label0;
                    }
                    j1--;
                } while (true);
            }
            for (int i1 = a.size() - 1; i1 >= 0; i1--)
            {
                ArrayList arraylist2 = (ArrayList)a.get(i1);
                if (!arraylist2.remove(afn1))
                {
                    continue;
                }
                mk.c(view, 1.0F);
                f(afn1);
                if (arraylist2.isEmpty())
                {
                    a.remove(i1);
                }
            }

            f.remove(afn1);
            d.remove(afn1);
            g.remove(afn1);
            e.remove(afn1);
            c();
            return;
        } while (true);
    }

    public final void d()
    {
        for (int i = p.size() - 1; i >= 0; i--)
        {
            ada ada1 = (ada)p.get(i);
            android.view.View view = ada1.a.a;
            mk.b(view, 0.0F);
            mk.a(view, 0.0F);
            e(ada1.a);
            p.remove(i);
        }

        for (int j = n.size() - 1; j >= 0; j--)
        {
            d((afn)n.get(j));
            n.remove(j);
        }

        for (int k = o.size() - 1; k >= 0; k--)
        {
            afn afn1 = (afn)o.get(k);
            mk.c(afn1.a, 1.0F);
            f(afn1);
            o.remove(k);
        }

        for (int i1 = q.size() - 1; i1 >= 0; i1--)
        {
            a((acz)q.get(i1));
        }

        q.clear();
        if (!b())
        {
            return;
        }
        for (int j1 = b.size() - 1; j1 >= 0; j1--)
        {
            ArrayList arraylist = (ArrayList)b.get(j1);
            for (int i2 = arraylist.size() - 1; i2 >= 0; i2--)
            {
                ada ada2 = (ada)arraylist.get(i2);
                android.view.View view1 = ada2.a.a;
                mk.b(view1, 0.0F);
                mk.a(view1, 0.0F);
                e(ada2.a);
                arraylist.remove(i2);
                if (arraylist.isEmpty())
                {
                    b.remove(arraylist);
                }
            }

        }

        for (int k1 = a.size() - 1; k1 >= 0; k1--)
        {
            ArrayList arraylist1 = (ArrayList)a.get(k1);
            for (int j2 = arraylist1.size() - 1; j2 >= 0; j2--)
            {
                afn afn2 = (afn)arraylist1.get(j2);
                mk.c(afn2.a, 1.0F);
                f(afn2);
                arraylist1.remove(j2);
                if (arraylist1.isEmpty())
                {
                    a.remove(arraylist1);
                }
            }

        }

        for (int l1 = c.size() - 1; l1 >= 0; l1--)
        {
            ArrayList arraylist2 = (ArrayList)c.get(l1);
            for (int k2 = arraylist2.size() - 1; k2 >= 0; k2--)
            {
                a((acz)arraylist2.get(k2));
                if (arraylist2.isEmpty())
                {
                    c.remove(arraylist2);
                }
            }

        }

        a(f);
        a(e);
        a(d);
        a(g);
        f();
    }
}
