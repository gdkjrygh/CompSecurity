// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.support.v4.animation.a;
import android.support.v4.view.af;
import android.support.v4.view.aj;
import android.support.v4.view.x;
import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class f extends RecyclerView.e
{
    private static final class a
    {

        public RecyclerView.v a;
        public RecyclerView.v b;
        public int c;
        public int d;
        public int e;
        public int f;

        public final String toString()
        {
            return (new StringBuilder("ChangeInfo{oldHolder=")).append(a).append(", newHolder=").append(b).append(", fromX=").append(c).append(", fromY=").append(d).append(", toX=").append(e).append(", toY=").append(f).append('}').toString();
        }

        private a(RecyclerView.v v, RecyclerView.v v1)
        {
            a = v;
            b = v1;
        }

        private a(RecyclerView.v v, RecyclerView.v v1, int l, int i1, int j1, int k1)
        {
            this(v, v1);
            c = l;
            d = i1;
            e = j1;
            f = k1;
        }

        a(RecyclerView.v v, RecyclerView.v v1, int l, int i1, int j1, int k1, byte byte0)
        {
            this(v, v1, l, i1, j1, k1);
        }
    }

    private static final class b
    {

        public RecyclerView.v a;
        public int b;
        public int c;
        public int d;
        public int e;

        private b(RecyclerView.v v, int l, int i1, int j1, int k1)
        {
            a = v;
            b = l;
            c = i1;
            d = j1;
            e = k1;
        }

        b(RecyclerView.v v, int l, int i1, int j1, int k1, byte byte0)
        {
            this(v, l, i1, j1, k1);
        }
    }

    private static class c
        implements aj
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

    public f()
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

    static ArrayList a(f f1)
    {
        return f1.f;
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

    static void a(f f1, RecyclerView.v v)
    {
        af af1 = x.s(v.itemView);
        f1.h.add(v);
        af1.a(1.0F).a(f1.e()).a(f1. new c(v, af1) {

            final RecyclerView.v a;
            final af b;
            final f c;

            public final void a(View view)
            {
            }

            public final void b(View view)
            {
                b.a(null);
                c.f(a);
                f.f(c).remove(a);
                f.e(c);
            }

            public final void c(View view)
            {
                x.c(view, 1.0F);
            }

            
            {
                c = f.this;
                a = v;
                b = af1;
                super((byte)0);
            }
        }).e();
    }

    static void a(f f1, RecyclerView.v v, int l, int i1, int j1, int k1)
    {
        Object obj = v.itemView;
        l = j1 - l;
        i1 = k1 - i1;
        if (l != 0)
        {
            x.s(((View) (obj))).b(0.0F);
        }
        if (i1 != 0)
        {
            x.s(((View) (obj))).c(0.0F);
        }
        obj = x.s(((View) (obj)));
        f1.i.add(v);
        ((af) (obj)).a(f1.d()).a(f1. new c(v, l, i1, ((af) (obj))) {

            final RecyclerView.v a;
            final int b;
            final int c;
            final af d;
            final f e;

            public final void a(View view)
            {
            }

            public final void b(View view)
            {
                d.a(null);
                e.e(a);
                f.g(e).remove(a);
                f.e(e);
            }

            public final void c(View view)
            {
                if (b != 0)
                {
                    x.a(view, 0.0F);
                }
                if (c != 0)
                {
                    x.b(view, 0.0F);
                }
            }

            
            {
                e = f.this;
                a = v;
                b = l;
                c = i1;
                d = af1;
                super((byte)0);
            }
        }).e();
    }

    static void a(f f1, a a1)
    {
        View view = null;
        Object obj = a1.a;
        RecyclerView.v v;
        if (obj == null)
        {
            obj = null;
        } else
        {
            obj = ((RecyclerView.v) (obj)).itemView;
        }
        v = a1.b;
        if (v != null)
        {
            view = v.itemView;
        }
        if (obj != null)
        {
            obj = x.s(((View) (obj))).a(f1.g());
            f1.k.add(a1.a);
            ((af) (obj)).b(a1.e - a1.c);
            ((af) (obj)).c(a1.f - a1.d);
            ((af) (obj)).a(0.0F).a(f1. new c(a1, ((af) (obj))) {

                final a a;
                final af b;
                final f c;

                public final void a(View view1)
                {
                }

                public final void b(View view1)
                {
                    b.a(null);
                    x.c(view1, 1.0F);
                    x.a(view1, 0.0F);
                    x.b(view1, 0.0F);
                    c.g(a.a);
                    f.h(c).remove(a.a);
                    f.e(c);
                }

            
            {
                c = f.this;
                a = a1;
                b = af1;
                super((byte)0);
            }
            }).e();
        }
        if (view != null)
        {
            obj = x.s(view);
            f1.k.add(a1.b);
            ((af) (obj)).b(0.0F).c(0.0F).a(f1.g()).a(1.0F).a(f1. new c(a1, ((af) (obj)), view) {

                final a a;
                final af b;
                final View c;
                final f d;

                public final void a(View view1)
                {
                }

                public final void b(View view1)
                {
                    b.a(null);
                    x.c(c, 1.0F);
                    x.a(c, 0.0F);
                    x.b(c, 0.0F);
                    d.g(a.b);
                    f.h(d).remove(a.b);
                    f.e(d);
                }

            
            {
                d = f.this;
                a = a1;
                b = af1;
                c = view;
                super((byte)0);
            }
            }).e();
        }
    }

    private static void a(List list)
    {
        for (int l = list.size() - 1; l >= 0; l--)
        {
            x.s(((RecyclerView.v)list.get(l)).itemView).d();
        }

    }

    private void a(List list, RecyclerView.v v)
    {
        for (int l = list.size() - 1; l >= 0; l--)
        {
            a a1 = (a)list.get(l);
            if (a(a1, v) && a1.a == null && a1.b == null)
            {
                list.remove(a1);
            }
        }

    }

    private boolean a(a a1, RecyclerView.v v)
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
        x.c(v.itemView, 1.0F);
        x.a(v.itemView, 0.0F);
        x.b(v.itemView, 0.0F);
        g(v);
        return true;
    }

    static ArrayList b(f f1)
    {
        return f1.g;
    }

    static ArrayList c(f f1)
    {
        return f1.e;
    }

    static ArrayList d(f f1)
    {
        return f1.j;
    }

    static void e(f f1)
    {
        f1.j();
    }

    static ArrayList f(f f1)
    {
        return f1.h;
    }

    static ArrayList g(f f1)
    {
        return f1.i;
    }

    static ArrayList h(f f1)
    {
        return f1.k;
    }

    private void h(RecyclerView.v v)
    {
        android.support.v4.animation.a.a(v.itemView);
        c(v);
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
            RecyclerView.v v;
            af af1;
            for (Iterator iterator = a.iterator(); iterator.hasNext(); af1.a(f()).a(0.0F).a(new c(v, af1) {

        final RecyclerView.v a;
        final af b;
        final f c;

        public final void a(View view)
        {
        }

        public final void b(View view)
        {
            b.a(null);
            x.c(view, 1.0F);
            c.d(a);
            f.d(c).remove(a);
            f.e(c);
        }

            
            {
                c = f.this;
                a = v;
                b = af1;
                super((byte)0);
            }
    }).e())
            {
                v = (RecyclerView.v)iterator.next();
                af1 = x.s(v.itemView);
                j.add(v);
            }

            a.clear();
            Runnable runnable;
            if (flag1)
            {
                ArrayList arraylist = new ArrayList();
                arraylist.addAll(c);
                f.add(arraylist);
                c.clear();
                runnable = new Runnable(arraylist) {

                    final ArrayList a;
                    final f b;

                    public final void run()
                    {
                        b b1;
                        for (Iterator iterator1 = a.iterator(); iterator1.hasNext(); android.support.v7.widget.f.a(b, b1.a, b1.b, b1.c, b1.d, b1.e))
                        {
                            b1 = (b)iterator1.next();
                        }

                        a.clear();
                        android.support.v7.widget.f.a(b).remove(a);
                    }

            
            {
                b = f.this;
                a = arraylist;
                super();
            }
                };
                if (flag)
                {
                    x.a(((b)arraylist.get(0)).a.itemView, runnable, f());
                } else
                {
                    runnable.run();
                }
            }
            if (flag2)
            {
                arraylist = new ArrayList();
                arraylist.addAll(d);
                g.add(arraylist);
                d.clear();
                runnable = new Runnable(arraylist) {

                    final ArrayList a;
                    final f b;

                    public final void run()
                    {
                        a a1;
                        for (Iterator iterator1 = a.iterator(); iterator1.hasNext(); android.support.v7.widget.f.a(b, a1))
                        {
                            a1 = (a)iterator1.next();
                        }

                        a.clear();
                        f.b(b).remove(a);
                    }

            
            {
                b = f.this;
                a = arraylist;
                super();
            }
                };
                if (flag)
                {
                    x.a(((a)arraylist.get(0)).a.itemView, runnable, f());
                } else
                {
                    runnable.run();
                }
            }
            if (flag3)
            {
                arraylist = new ArrayList();
                arraylist.addAll(b);
                e.add(arraylist);
                b.clear();
                runnable = new Runnable(arraylist) {

                    final ArrayList a;
                    final f b;

                    public final void run()
                    {
                        RecyclerView.v v1;
                        for (Iterator iterator1 = a.iterator(); iterator1.hasNext(); android.support.v7.widget.f.a(b, v1))
                        {
                            v1 = (RecyclerView.v)iterator1.next();
                        }

                        a.clear();
                        f.c(b).remove(a);
                    }

            
            {
                b = f.this;
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
                    x.a(((RecyclerView.v)arraylist.get(0)).itemView, runnable, l + l1);
                    return;
                } else
                {
                    runnable.run();
                    return;
                }
            }
        }
    }

    public final boolean a(RecyclerView.v v)
    {
        h(v);
        a.add(v);
        return true;
    }

    public final boolean a(RecyclerView.v v, int l, int i1, int j1, int k1)
    {
        View view = v.itemView;
        l = (int)((float)l + x.o(v.itemView));
        i1 = (int)((float)i1 + x.p(v.itemView));
        h(v);
        int l1 = j1 - l;
        int i2 = k1 - i1;
        if (l1 == 0 && i2 == 0)
        {
            e(v);
            return false;
        }
        if (l1 != 0)
        {
            x.a(view, -l1);
        }
        if (i2 != 0)
        {
            x.b(view, -i2);
        }
        c.add(new b(v, l, i1, j1, k1, (byte)0));
        return true;
    }

    public final boolean a(RecyclerView.v v, RecyclerView.v v1, int l, int i1, int j1, int k1)
    {
        float f1 = x.o(v.itemView);
        float f2 = x.p(v.itemView);
        float f3 = x.f(v.itemView);
        h(v);
        int l1 = (int)((float)(j1 - l) - f1);
        int i2 = (int)((float)(k1 - i1) - f2);
        x.a(v.itemView, f1);
        x.b(v.itemView, f2);
        x.c(v.itemView, f3);
        if (v1 != null && v1.itemView != null)
        {
            h(v1);
            x.a(v1.itemView, -l1);
            x.b(v1.itemView, -i2);
            x.c(v1.itemView, 0.0F);
        }
        d.add(new a(v, v1, l, i1, j1, k1, (byte)0));
        return true;
    }

    public final boolean b()
    {
        return !b.isEmpty() || !d.isEmpty() || !c.isEmpty() || !a.isEmpty() || !i.isEmpty() || !j.isEmpty() || !h.isEmpty() || !k.isEmpty() || !f.isEmpty() || !e.isEmpty() || !g.isEmpty();
    }

    public final boolean b(RecyclerView.v v)
    {
        h(v);
        x.c(v.itemView, 0.0F);
        b.add(v);
        return true;
    }

    public final void c()
    {
        for (int l = c.size() - 1; l >= 0; l--)
        {
            b b1 = (b)c.get(l);
            View view = b1.a.itemView;
            x.b(view, 0.0F);
            x.a(view, 0.0F);
            e(b1.a);
            c.remove(l);
        }

        for (int i1 = a.size() - 1; i1 >= 0; i1--)
        {
            d((RecyclerView.v)a.get(i1));
            a.remove(i1);
        }

        for (int j1 = b.size() - 1; j1 >= 0; j1--)
        {
            RecyclerView.v v = (RecyclerView.v)b.get(j1);
            x.c(v.itemView, 1.0F);
            f(v);
            b.remove(j1);
        }

        for (int k1 = d.size() - 1; k1 >= 0; k1--)
        {
            a((a)d.get(k1));
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
                b b2 = (b)arraylist.get(k2);
                View view1 = b2.a.itemView;
                x.b(view1, 0.0F);
                x.a(view1, 0.0F);
                e(b2.a);
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
                RecyclerView.v v1 = (RecyclerView.v)arraylist1.get(l2);
                x.c(v1.itemView, 1.0F);
                f(v1);
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
                a((a)arraylist2.get(i3));
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

    public final void c(RecyclerView.v v)
    {
        View view = v.itemView;
        x.s(view).d();
        for (int l = c.size() - 1; l >= 0; l--)
        {
            if (((b)c.get(l)).a == v)
            {
                x.b(view, 0.0F);
                x.a(view, 0.0F);
                e(v);
                c.remove(l);
            }
        }

        a(d, v);
        if (a.remove(v))
        {
            x.c(view, 1.0F);
            d(v);
        }
        if (b.remove(v))
        {
            x.c(view, 1.0F);
            f(v);
        }
        for (int i1 = g.size() - 1; i1 >= 0; i1--)
        {
            ArrayList arraylist = (ArrayList)g.get(i1);
            a(arraylist, v);
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
                            if (((b)arraylist1.get(l1)).a != v)
                            {
                                break label1;
                            }
                            x.b(view, 0.0F);
                            x.a(view, 0.0F);
                            e(v);
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
                if (!arraylist2.remove(v))
                {
                    continue;
                }
                x.c(view, 1.0F);
                f(v);
                if (arraylist2.isEmpty())
                {
                    e.remove(k1);
                }
            }

            j.remove(v);
            h.remove(v);
            k.remove(v);
            i.remove(v);
            j();
            return;
        } while (true);
    }
}
