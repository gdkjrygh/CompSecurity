// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.support.v4.view.bp;
import android.support.v4.view.cy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package android.support.v7.widget:
//            bf, bv, v, w, 
//            z, x, y, u, 
//            r, aa, s, t

public final class q extends bf
{

    private ArrayList a;
    private ArrayList b;
    private ArrayList c;
    private ArrayList d;
    private ArrayList e;
    private ArrayList f;
    private ArrayList g;
    private ArrayList h;
    private ArrayList i;
    private ArrayList j;
    private ArrayList k;

    public q()
    {
        a = new ArrayList();
        b = new ArrayList();
        c = new ArrayList();
        d = new ArrayList();
        e = new ArrayList();
        f = new ArrayList();
        g = new ArrayList();
        h = new ArrayList();
        i = new ArrayList();
        j = new ArrayList();
        k = new ArrayList();
    }

    static ArrayList a(q q1)
    {
        return q1.f;
    }

    static void a(q q1, bv bv1)
    {
        cy cy1 = bp.o(bv1.itemView);
        q1.h.add(bv1);
        cy1.a(1.0F).a(q1.e()).a(new v(q1, bv1, cy1)).c();
    }

    static void a(q q1, bv bv1, int l, int i1, int j1, int k1)
    {
        Object obj = bv1.itemView;
        l = j1 - l;
        i1 = k1 - i1;
        if (l != 0)
        {
            bp.o(((android.view.View) (obj))).b(0.0F);
        }
        if (i1 != 0)
        {
            bp.o(((android.view.View) (obj))).c(0.0F);
        }
        obj = bp.o(((android.view.View) (obj)));
        q1.i.add(bv1);
        ((cy) (obj)).a(q1.d()).a(new w(q1, bv1, l, i1, ((cy) (obj)))).c();
    }

    static void a(q q1, z z1)
    {
        android.view.View view = null;
        Object obj = z1.a;
        bv bv1;
        if (obj == null)
        {
            obj = null;
        } else
        {
            obj = ((bv) (obj)).itemView;
        }
        bv1 = z1.b;
        if (bv1 != null)
        {
            view = bv1.itemView;
        }
        if (obj != null)
        {
            obj = bp.o(((android.view.View) (obj))).a(q1.g());
            q1.k.add(z1.a);
            ((cy) (obj)).b(z1.e - z1.c);
            ((cy) (obj)).c(z1.f - z1.d);
            ((cy) (obj)).a(0.0F).a(new x(q1, z1, ((cy) (obj)))).c();
        }
        if (view != null)
        {
            obj = bp.o(view);
            q1.k.add(z1.b);
            ((cy) (obj)).b(0.0F).c(0.0F).a(q1.g()).a(1.0F).a(new y(q1, z1, ((cy) (obj)), view)).c();
        }
    }

    private void a(z z1)
    {
        if (z1.a != null)
        {
            a(z1, z1.a);
        }
        if (z1.b != null)
        {
            a(z1, z1.b);
        }
    }

    private static void a(List list)
    {
        for (int l = list.size() - 1; l >= 0; l--)
        {
            bp.o(((bv)list.get(l)).itemView).b();
        }

    }

    private void a(List list, bv bv1)
    {
        for (int l = list.size() - 1; l >= 0; l--)
        {
            z z1 = (z)list.get(l);
            if (a(z1, bv1) && z1.a == null && z1.b == null)
            {
                list.remove(z1);
            }
        }

    }

    private boolean a(z z1, bv bv1)
    {
        if (z1.b == bv1)
        {
            z1.b = null;
        } else
        if (z1.a == bv1)
        {
            z1.a = null;
        } else
        {
            return false;
        }
        bp.c(bv1.itemView, 1.0F);
        bp.a(bv1.itemView, 0.0F);
        bp.b(bv1.itemView, 0.0F);
        g(bv1);
        return true;
    }

    static ArrayList b(q q1)
    {
        return q1.g;
    }

    static ArrayList c(q q1)
    {
        return q1.e;
    }

    static ArrayList d(q q1)
    {
        return q1.j;
    }

    static void e(q q1)
    {
        q1.j();
    }

    static ArrayList f(q q1)
    {
        return q1.h;
    }

    static ArrayList g(q q1)
    {
        return q1.i;
    }

    static ArrayList h(q q1)
    {
        return q1.k;
    }

    private void j()
    {
        if (!b())
        {
            i();
        }
    }

    public final void a()
    {
        boolean flag;
        boolean flag1;
        boolean flag2;
        boolean flag3;
        if (!a.isEmpty())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (!c.isEmpty())
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        if (!d.isEmpty())
        {
            flag2 = true;
        } else
        {
            flag2 = false;
        }
        if (!b.isEmpty())
        {
            flag3 = true;
        } else
        {
            flag3 = false;
        }
        if (flag || flag1 || flag3 || flag2)
        {
            bv bv1;
            cy cy1;
            for (Iterator iterator = a.iterator(); iterator.hasNext(); cy1.a(f()).a(0.0F).a(new u(this, bv1, cy1)).c())
            {
                bv1 = (bv)iterator.next();
                cy1 = bp.o(bv1.itemView);
                j.add(bv1);
            }

            a.clear();
            Object obj;
            if (flag1)
            {
                ArrayList arraylist = new ArrayList();
                arraylist.addAll(c);
                f.add(arraylist);
                c.clear();
                obj = new r(this, arraylist);
                if (flag)
                {
                    bp.a(((aa)arraylist.get(0)).a.itemView, ((Runnable) (obj)), f());
                } else
                {
                    ((Runnable) (obj)).run();
                }
            }
            if (flag2)
            {
                arraylist = new ArrayList();
                arraylist.addAll(d);
                g.add(arraylist);
                d.clear();
                obj = new s(this, arraylist);
                if (flag)
                {
                    bp.a(((z)arraylist.get(0)).a.itemView, ((Runnable) (obj)), f());
                } else
                {
                    ((Runnable) (obj)).run();
                }
            }
            if (flag3)
            {
                arraylist = new ArrayList();
                arraylist.addAll(b);
                e.add(arraylist);
                b.clear();
                obj = new t(this, arraylist);
                if (flag || flag1 || flag2)
                {
                    long l;
                    long l1;
                    long l2;
                    if (flag)
                    {
                        l = f();
                    } else
                    {
                        l = 0L;
                    }
                    if (flag1)
                    {
                        l1 = d();
                    } else
                    {
                        l1 = 0L;
                    }
                    if (flag2)
                    {
                        l2 = g();
                    } else
                    {
                        l2 = 0L;
                    }
                    l1 = Math.max(l1, l2);
                    bp.a(((bv)arraylist.get(0)).itemView, ((Runnable) (obj)), l + l1);
                    return;
                } else
                {
                    ((Runnable) (obj)).run();
                    return;
                }
            }
        }
    }

    public final boolean a(bv bv1)
    {
        c(bv1);
        a.add(bv1);
        return true;
    }

    public final boolean a(bv bv1, int l, int i1, int j1, int k1)
    {
        android.view.View view = bv1.itemView;
        l = (int)((float)l + bp.k(bv1.itemView));
        i1 = (int)((float)i1 + bp.l(bv1.itemView));
        c(bv1);
        int l1 = j1 - l;
        int i2 = k1 - i1;
        if (l1 == 0 && i2 == 0)
        {
            e(bv1);
            return false;
        }
        if (l1 != 0)
        {
            bp.a(view, -l1);
        }
        if (i2 != 0)
        {
            bp.b(view, -i2);
        }
        c.add(new aa(bv1, l, i1, j1, k1, (byte)0));
        return true;
    }

    public final boolean a(bv bv1, bv bv2, int l, int i1, int j1, int k1)
    {
        float f1 = bp.k(bv1.itemView);
        float f2 = bp.l(bv1.itemView);
        float f3 = bp.f(bv1.itemView);
        c(bv1);
        int l1 = (int)((float)(j1 - l) - f1);
        int i2 = (int)((float)(k1 - i1) - f2);
        bp.a(bv1.itemView, f1);
        bp.b(bv1.itemView, f2);
        bp.c(bv1.itemView, f3);
        if (bv2 != null && bv2.itemView != null)
        {
            c(bv2);
            bp.a(bv2.itemView, -l1);
            bp.b(bv2.itemView, -i2);
            bp.c(bv2.itemView, 0.0F);
        }
        d.add(new z(bv1, bv2, l, i1, j1, k1, (byte)0));
        return true;
    }

    public final boolean b()
    {
        return !b.isEmpty() || !d.isEmpty() || !c.isEmpty() || !a.isEmpty() || !i.isEmpty() || !j.isEmpty() || !h.isEmpty() || !k.isEmpty() || !f.isEmpty() || !e.isEmpty() || !g.isEmpty();
    }

    public final boolean b(bv bv1)
    {
        c(bv1);
        bp.c(bv1.itemView, 0.0F);
        b.add(bv1);
        return true;
    }

    public final void c()
    {
        for (int l = c.size() - 1; l >= 0; l--)
        {
            aa aa1 = (aa)c.get(l);
            android.view.View view = aa1.a.itemView;
            bp.b(view, 0.0F);
            bp.a(view, 0.0F);
            e(aa1.a);
            c.remove(l);
        }

        for (int i1 = a.size() - 1; i1 >= 0; i1--)
        {
            d((bv)a.get(i1));
            a.remove(i1);
        }

        for (int j1 = b.size() - 1; j1 >= 0; j1--)
        {
            bv bv1 = (bv)b.get(j1);
            bp.c(bv1.itemView, 1.0F);
            f(bv1);
            b.remove(j1);
        }

        for (int k1 = d.size() - 1; k1 >= 0; k1--)
        {
            a((z)d.get(k1));
        }

        d.clear();
        if (!b())
        {
            return;
        }
        for (int l1 = f.size() - 1; l1 >= 0; l1--)
        {
            ArrayList arraylist = (ArrayList)f.get(l1);
            for (int k2 = arraylist.size() - 1; k2 >= 0; k2--)
            {
                aa aa2 = (aa)arraylist.get(k2);
                android.view.View view1 = aa2.a.itemView;
                bp.b(view1, 0.0F);
                bp.a(view1, 0.0F);
                e(aa2.a);
                arraylist.remove(k2);
                if (arraylist.isEmpty())
                {
                    f.remove(arraylist);
                }
            }

        }

        for (int i2 = e.size() - 1; i2 >= 0; i2--)
        {
            ArrayList arraylist1 = (ArrayList)e.get(i2);
            for (int l2 = arraylist1.size() - 1; l2 >= 0; l2--)
            {
                bv bv2 = (bv)arraylist1.get(l2);
                bp.c(bv2.itemView, 1.0F);
                f(bv2);
                arraylist1.remove(l2);
                if (arraylist1.isEmpty())
                {
                    e.remove(arraylist1);
                }
            }

        }

        for (int j2 = g.size() - 1; j2 >= 0; j2--)
        {
            ArrayList arraylist2 = (ArrayList)g.get(j2);
            for (int i3 = arraylist2.size() - 1; i3 >= 0; i3--)
            {
                a((z)arraylist2.get(i3));
                if (arraylist2.isEmpty())
                {
                    g.remove(arraylist2);
                }
            }

        }

        a(j);
        a(i);
        a(h);
        a(k);
        i();
    }

    public final void c(bv bv1)
    {
        android.view.View view = bv1.itemView;
        bp.o(view).b();
        for (int l = c.size() - 1; l >= 0; l--)
        {
            if (((aa)c.get(l)).a == bv1)
            {
                bp.b(view, 0.0F);
                bp.a(view, 0.0F);
                e(bv1);
                c.remove(l);
            }
        }

        a(d, bv1);
        if (a.remove(bv1))
        {
            bp.c(view, 1.0F);
            d(bv1);
        }
        if (b.remove(bv1))
        {
            bp.c(view, 1.0F);
            f(bv1);
        }
        for (int i1 = g.size() - 1; i1 >= 0; i1--)
        {
            ArrayList arraylist = (ArrayList)g.get(i1);
            a(arraylist, bv1);
            if (arraylist.isEmpty())
            {
                g.remove(i1);
            }
        }

        int j1 = f.size() - 1;
label0:
        do
        {
            if (j1 >= 0)
            {
                ArrayList arraylist1 = (ArrayList)f.get(j1);
                int l1 = arraylist1.size() - 1;
                do
                {
label1:
                    {
                        if (l1 >= 0)
                        {
                            if (((aa)arraylist1.get(l1)).a != bv1)
                            {
                                break label1;
                            }
                            bp.b(view, 0.0F);
                            bp.a(view, 0.0F);
                            e(bv1);
                            arraylist1.remove(l1);
                            if (arraylist1.isEmpty())
                            {
                                f.remove(j1);
                            }
                        }
                        j1--;
                        continue label0;
                    }
                    l1--;
                } while (true);
            }
            for (int k1 = e.size() - 1; k1 >= 0; k1--)
            {
                ArrayList arraylist2 = (ArrayList)e.get(k1);
                if (!arraylist2.remove(bv1))
                {
                    continue;
                }
                bp.c(view, 1.0F);
                f(bv1);
                if (arraylist2.isEmpty())
                {
                    e.remove(k1);
                }
            }

            j.remove(bv1);
            h.remove(bv1);
            k.remove(bv1);
            i.remove(bv1);
            j();
            return;
        } while (true);
    }
}
