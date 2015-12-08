// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class bF extends android.support.v7.widget.RecyclerView.e
{
    static final class a
    {

        public android.support.v7.widget.RecyclerView.v a;
        public android.support.v7.widget.RecyclerView.v b;
        public int c;
        public int d;
        public int e;
        public int f;

        public final String toString()
        {
            return (new StringBuilder("ChangeInfo{oldHolder=")).append(a).append(", newHolder=").append(b).append(", fromX=").append(c).append(", fromY=").append(d).append(", toX=").append(e).append(", toY=").append(f).append('}').toString();
        }

        private a(android.support.v7.widget.RecyclerView.v v, android.support.v7.widget.RecyclerView.v v1)
        {
            a = v;
            b = v1;
        }

        private a(android.support.v7.widget.RecyclerView.v v, android.support.v7.widget.RecyclerView.v v1, int i, int j, int k, int l)
        {
            this(v, v1);
            c = i;
            d = j;
            e = k;
            f = l;
        }

        a(android.support.v7.widget.RecyclerView.v v, android.support.v7.widget.RecyclerView.v v1, int i, int j, int k, int l, byte byte0)
        {
            this(v, v1, i, j, k, l);
        }
    }

    static final class b
    {

        public android.support.v7.widget.RecyclerView.v a;
        public int b;
        public int c;
        public int d;
        public int e;

        private b(android.support.v7.widget.RecyclerView.v v, int i, int j, int k, int l)
        {
            a = v;
            b = i;
            c = j;
            d = k;
            e = l;
        }

        b(android.support.v7.widget.RecyclerView.v v, int i, int j, int k, int l, byte byte0)
        {
            this(v, i, j, k, l);
        }
    }

    static class c
        implements bi
    {

        public void a(View view)
        {
        }

        public void b(View view)
        {
        }

        public void c(View view)
        {
        }

        private c()
        {
        }

        c(byte byte0)
        {
            this();
        }
    }


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

    public bF()
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

    private void a(a a1)
    {
        if (a1.a != null)
        {
            a(a1, a1.a);
        }
        if (a1.b != null)
        {
            a(a1, a1.b);
        }
    }

    private static void a(List list)
    {
        for (int i = list.size() - 1; i >= 0; i--)
        {
            aY.o(((android.support.v7.widget.RecyclerView.v)list.get(i)).a).a();
        }

    }

    private void a(List list, android.support.v7.widget.RecyclerView.v v)
    {
        for (int i = list.size() - 1; i >= 0; i--)
        {
            a a1 = (a)list.get(i);
            if (a(a1, v) && a1.a == null && a1.b == null)
            {
                list.remove(a1);
            }
        }

    }

    private boolean a(a a1, android.support.v7.widget.RecyclerView.v v)
    {
        if (a1.b == v)
        {
            a1.b = null;
        } else
        if (a1.a == v)
        {
            a1.a = null;
        } else
        {
            return false;
        }
        aY.c(v.a, 1.0F);
        aY.a(v.a, 0.0F);
        aY.b(v.a, 0.0F);
        g(v);
        return true;
    }

    public final void T_()
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
            android.support.v7.widget.RecyclerView.v v;
            bf bf1;
            for (Iterator iterator = n.iterator(); iterator.hasNext(); bf1.a(super.j).a(0.0F).a(new c(v, bf1) {

        private android.support.v7.widget.RecyclerView.v a;
        private bf b;
        private bF c;

        public final void a(View view)
        {
            c.h(a);
        }

        public final void b(View view)
        {
            b.a(null);
            aY.c(view, 1.0F);
            c.d(a);
            c.f.remove(a);
            c.c();
        }

            
            {
                c = bF.this;
                a = v;
                b = bf2;
                super((byte)0);
            }
    }).b())
            {
                v = (android.support.v7.widget.RecyclerView.v)iterator.next();
                bf1 = aY.o(v.a);
                f.add(v);
            }

            n.clear();
            Runnable runnable;
            if (flag1)
            {
                ArrayList arraylist = new ArrayList();
                arraylist.addAll(p);
                b.add(arraylist);
                p.clear();
                runnable = new Runnable(arraylist) {

                    private ArrayList a;
                    private bF b;

                    public final void run()
                    {
                        bF bf2;
                        android.support.v7.widget.RecyclerView.v v1;
                        Object obj;
                        int i;
                        int k;
                        for (Iterator iterator1 = a.iterator(); iterator1.hasNext(); ((bf) (obj)).a(((android.support.v7.widget.RecyclerView.e) (bf2)).k).a(bf2. new c(v1, k, i, ((bf) (obj))) {

                    private android.support.v7.widget.RecyclerView.v a;
                    private int b;
                    private int c;
                    private bf d;
                    private bF e;

                    public final void a(View view)
                    {
                        e.i(a);
                    }

                    public final void b(View view)
                    {
                        d.a(null);
                        e.e(a);
                        e.e.remove(a);
                        e.c();
                    }

                    public final void c(View view)
                    {
                        if (b != 0)
                        {
                            aY.a(view, 0.0F);
                        }
                        if (c != 0)
                        {
                            aY.b(view, 0.0F);
                        }
                    }

            
            {
                e = bF.this;
                a = v;
                b = i;
                c = j;
                d = bf2;
                super((byte)0);
            }
                }).b())
                        {
                            obj = (b)iterator1.next();
                            bf2 = b;
                            v1 = ((b) (obj)).a;
                            k = ((b) (obj)).b;
                            i = ((b) (obj)).c;
                            int i1 = ((b) (obj)).d;
                            int j = ((b) (obj)).e;
                            obj = v1.a;
                            k = i1 - k;
                            i = j - i;
                            if (k != 0)
                            {
                                aY.o(((View) (obj))).b(0.0F);
                            }
                            if (i != 0)
                            {
                                aY.o(((View) (obj))).c(0.0F);
                            }
                            obj = aY.o(((View) (obj)));
                            bf2.e.add(v1);
                        }

                        a.clear();
                        b.b.remove(a);
                    }

            
            {
                b = bF.this;
                a = arraylist;
                super();
            }
                };
                if (flag)
                {
                    aY.a(((b)arraylist.get(0)).a.a, runnable, super.j);
                } else
                {
                    runnable.run();
                }
            }
            if (flag2)
            {
                arraylist = new ArrayList();
                arraylist.addAll(q);
                c.add(arraylist);
                q.clear();
                runnable = new Runnable(arraylist) {

                    private ArrayList a;
                    private bF b;

                    public final void run()
                    {
                        Iterator iterator1 = a.iterator();
                        do
                        {
                            if (!iterator1.hasNext())
                            {
                                break;
                            }
                            a a1 = (a)iterator1.next();
                            bF bf2 = b;
                            Object obj = a1.a;
                            Object obj1;
                            if (obj == null)
                            {
                                obj = null;
                            } else
                            {
                                obj = ((android.support.v7.widget.RecyclerView.v) (obj)).a;
                            }
                            obj1 = a1.b;
                            if (obj1 != null)
                            {
                                obj1 = ((android.support.v7.widget.RecyclerView.v) (obj1)).a;
                            } else
                            {
                                obj1 = null;
                            }
                            if (obj != null)
                            {
                                obj = aY.o(((View) (obj))).a(((android.support.v7.widget.RecyclerView.e) (bf2)).l);
                                bf2.g.add(a1.a);
                                ((bf) (obj)).b(a1.e - a1.c);
                                ((bf) (obj)).c(a1.f - a1.d);
                                ((bf) (obj)).a(0.0F).a(bf2. new c(a1, ((bf) (obj))) {

                                    private a a;
                                    private bf b;
                                    private bF c;

                                    public final void a(View view)
                                    {
                                    }

                                    public final void b(View view)
                                    {
                                        b.a(null);
                                        aY.c(view, 1.0F);
                                        aY.a(view, 0.0F);
                                        aY.b(view, 0.0F);
                                        c.g(a.a);
                                        c.g.remove(a.a);
                                        c.c();
                                    }

            
            {
                c = bF.this;
                a = a1;
                b = bf2;
                super((byte)0);
            }
                                }).b();
                            }
                            if (obj1 != null)
                            {
                                obj = aY.o(((View) (obj1)));
                                bf2.g.add(a1.b);
                                ((bf) (obj)).b(0.0F).c(0.0F).a(((android.support.v7.widget.RecyclerView.e) (bf2)).l).a(1.0F).a(bf2. new c(a1, ((bf) (obj)), ((View) (obj1))) {

                                    private a a;
                                    private bf b;
                                    private View c;
                                    private bF d;

                                    public final void a(View view)
                                    {
                                    }

                                    public final void b(View view)
                                    {
                                        b.a(null);
                                        aY.c(c, 1.0F);
                                        aY.a(c, 0.0F);
                                        aY.b(c, 0.0F);
                                        d.g(a.b);
                                        d.g.remove(a.b);
                                        d.c();
                                    }

            
            {
                d = bF.this;
                a = a1;
                b = bf2;
                c = view;
                super((byte)0);
            }
                                }).b();
                            }
                        } while (true);
                        a.clear();
                        b.c.remove(a);
                    }

            
            {
                b = bF.this;
                a = arraylist;
                super();
            }
                };
                if (flag)
                {
                    aY.a(((a)arraylist.get(0)).a.a, runnable, super.j);
                } else
                {
                    runnable.run();
                }
            }
            if (flag3)
            {
                arraylist = new ArrayList();
                arraylist.addAll(o);
                a.add(arraylist);
                o.clear();
                runnable = new Runnable(arraylist) {

                    private ArrayList a;
                    private bF b;

                    public final void run()
                    {
                        android.support.v7.widget.RecyclerView.v v1;
                        bF bf2;
                        bf bf3;
                        for (Iterator iterator1 = a.iterator(); iterator1.hasNext(); bf3.a(1.0F).a(((android.support.v7.widget.RecyclerView.e) (bf2)).i).a(bf2. new c(v1, bf3) {

                    private android.support.v7.widget.RecyclerView.v a;
                    private bf b;
                    private bF c;

                    public final void a(View view)
                    {
                    }

                    public final void b(View view)
                    {
                        b.a(null);
                        c.f(a);
                        c.d.remove(a);
                        c.c();
                    }

                    public final void c(View view)
                    {
                        aY.c(view, 1.0F);
                    }

            
            {
                c = bF.this;
                a = v;
                b = bf2;
                super((byte)0);
            }
                }).b())
                        {
                            v1 = (android.support.v7.widget.RecyclerView.v)iterator1.next();
                            bf2 = b;
                            bf3 = aY.o(v1.a);
                            bf2.d.add(v1);
                        }

                        a.clear();
                        b.a.remove(a);
                    }

            
            {
                b = bF.this;
                a = arraylist;
                super();
            }
                };
                if (flag || flag1 || flag2)
                {
                    long l;
                    long l1;
                    long l2;
                    if (flag)
                    {
                        l = super.j;
                    } else
                    {
                        l = 0L;
                    }
                    if (flag1)
                    {
                        l1 = super.k;
                    } else
                    {
                        l1 = 0L;
                    }
                    if (flag2)
                    {
                        l2 = super.l;
                    } else
                    {
                        l2 = 0L;
                    }
                    l1 = Math.max(l1, l2);
                    aY.a(((android.support.v7.widget.RecyclerView.v)arraylist.get(0)).a, runnable, l + l1);
                    return;
                } else
                {
                    runnable.run();
                    return;
                }
            }
        }
    }

    public final boolean a(android.support.v7.widget.RecyclerView.v v)
    {
        c(v);
        n.add(v);
        return true;
    }

    public final boolean a(android.support.v7.widget.RecyclerView.v v, int i, int j, int k, int l)
    {
        View view = v.a;
        i = (int)((float)i + aY.k(v.a));
        j = (int)((float)j + aY.l(v.a));
        c(v);
        int i1 = k - i;
        int j1 = l - j;
        if (i1 == 0 && j1 == 0)
        {
            e(v);
            return false;
        }
        if (i1 != 0)
        {
            aY.a(view, -i1);
        }
        if (j1 != 0)
        {
            aY.b(view, -j1);
        }
        p.add(new b(v, i, j, k, l, (byte)0));
        return true;
    }

    public final boolean a(android.support.v7.widget.RecyclerView.v v, android.support.v7.widget.RecyclerView.v v1, int i, int j, int k, int l)
    {
        float f1 = aY.k(v.a);
        float f2 = aY.l(v.a);
        float f3 = aY.f(v.a);
        c(v);
        int i1 = (int)((float)(k - i) - f1);
        int j1 = (int)((float)(l - j) - f2);
        aY.a(v.a, f1);
        aY.b(v.a, f2);
        aY.c(v.a, f3);
        if (v1 != null && v1.a != null)
        {
            c(v1);
            aY.a(v1.a, -i1);
            aY.b(v1.a, -j1);
            aY.c(v1.a, 0.0F);
        }
        q.add(new a(v, v1, i, j, k, l, (byte)0));
        return true;
    }

    public final boolean b()
    {
        return !o.isEmpty() || !q.isEmpty() || !p.isEmpty() || !n.isEmpty() || !e.isEmpty() || !f.isEmpty() || !d.isEmpty() || !g.isEmpty() || !b.isEmpty() || !a.isEmpty() || !c.isEmpty();
    }

    public final boolean b(android.support.v7.widget.RecyclerView.v v)
    {
        c(v);
        aY.c(v.a, 0.0F);
        o.add(v);
        return true;
    }

    final void c()
    {
        if (!b())
        {
            e();
        }
    }

    public final void c(android.support.v7.widget.RecyclerView.v v)
    {
        View view = v.a;
        aY.o(view).a();
        for (int i = p.size() - 1; i >= 0; i--)
        {
            if (((b)p.get(i)).a == v)
            {
                aY.b(view, 0.0F);
                aY.a(view, 0.0F);
                e(v);
                p.remove(i);
            }
        }

        a(q, v);
        if (n.remove(v))
        {
            aY.c(view, 1.0F);
            d(v);
        }
        if (o.remove(v))
        {
            aY.c(view, 1.0F);
            f(v);
        }
        for (int j = c.size() - 1; j >= 0; j--)
        {
            ArrayList arraylist = (ArrayList)c.get(j);
            a(arraylist, v);
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
                int i1 = arraylist1.size() - 1;
                do
                {
label1:
                    {
                        if (i1 >= 0)
                        {
                            if (((b)arraylist1.get(i1)).a != v)
                            {
                                break label1;
                            }
                            aY.b(view, 0.0F);
                            aY.a(view, 0.0F);
                            e(v);
                            arraylist1.remove(i1);
                            if (arraylist1.isEmpty())
                            {
                                b.remove(k);
                            }
                        }
                        k--;
                        continue label0;
                    }
                    i1--;
                } while (true);
            }
            for (int l = a.size() - 1; l >= 0; l--)
            {
                ArrayList arraylist2 = (ArrayList)a.get(l);
                if (!arraylist2.remove(v))
                {
                    continue;
                }
                aY.c(view, 1.0F);
                f(v);
                if (arraylist2.isEmpty())
                {
                    a.remove(l);
                }
            }

            f.remove(v);
            d.remove(v);
            g.remove(v);
            e.remove(v);
            c();
            return;
        } while (true);
    }

    public final void d()
    {
        for (int i = p.size() - 1; i >= 0; i--)
        {
            b b1 = (b)p.get(i);
            View view = b1.a.a;
            aY.b(view, 0.0F);
            aY.a(view, 0.0F);
            e(b1.a);
            p.remove(i);
        }

        for (int j = n.size() - 1; j >= 0; j--)
        {
            d((android.support.v7.widget.RecyclerView.v)n.get(j));
            n.remove(j);
        }

        for (int k = o.size() - 1; k >= 0; k--)
        {
            android.support.v7.widget.RecyclerView.v v = (android.support.v7.widget.RecyclerView.v)o.get(k);
            aY.c(v.a, 1.0F);
            f(v);
            o.remove(k);
        }

        for (int l = q.size() - 1; l >= 0; l--)
        {
            a((a)q.get(l));
        }

        q.clear();
        if (!b())
        {
            return;
        }
        for (int i1 = b.size() - 1; i1 >= 0; i1--)
        {
            ArrayList arraylist = (ArrayList)b.get(i1);
            for (int l1 = arraylist.size() - 1; l1 >= 0; l1--)
            {
                b b2 = (b)arraylist.get(l1);
                View view1 = b2.a.a;
                aY.b(view1, 0.0F);
                aY.a(view1, 0.0F);
                e(b2.a);
                arraylist.remove(l1);
                if (arraylist.isEmpty())
                {
                    b.remove(arraylist);
                }
            }

        }

        for (int j1 = a.size() - 1; j1 >= 0; j1--)
        {
            ArrayList arraylist1 = (ArrayList)a.get(j1);
            for (int i2 = arraylist1.size() - 1; i2 >= 0; i2--)
            {
                android.support.v7.widget.RecyclerView.v v1 = (android.support.v7.widget.RecyclerView.v)arraylist1.get(i2);
                aY.c(v1.a, 1.0F);
                f(v1);
                arraylist1.remove(i2);
                if (arraylist1.isEmpty())
                {
                    a.remove(arraylist1);
                }
            }

        }

        for (int k1 = c.size() - 1; k1 >= 0; k1--)
        {
            ArrayList arraylist2 = (ArrayList)c.get(k1);
            for (int j2 = arraylist2.size() - 1; j2 >= 0; j2--)
            {
                a((a)arraylist2.get(j2));
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
        e();
    }
}
