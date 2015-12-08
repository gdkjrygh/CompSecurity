// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.support.v4.animation.AnimatorCompatHelper;
import android.support.v4.view.ViewCompat;
import android.support.v4.view.ViewPropertyAnimatorCompat;
import android.support.v4.view.ViewPropertyAnimatorListener;
import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class DefaultItemAnimator extends RecyclerView.ItemAnimator
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

    public DefaultItemAnimator()
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

    static ArrayList a(DefaultItemAnimator defaultitemanimator)
    {
        return defaultitemanimator.f;
    }

    private void a(ChangeInfo changeinfo)
    {
        View view = null;
        Object obj = changeinfo.a;
        RecyclerView.ViewHolder viewholder;
        if (obj == null)
        {
            obj = null;
        } else
        {
            obj = ((RecyclerView.ViewHolder) (obj)).itemView;
        }
        viewholder = changeinfo.b;
        if (viewholder != null)
        {
            view = viewholder.itemView;
        }
        if (obj != null)
        {
            obj = ViewCompat.o(((View) (obj))).a(g());
            k.add(changeinfo.a);
            ((ViewPropertyAnimatorCompat) (obj)).b(changeinfo.e - changeinfo.c);
            ((ViewPropertyAnimatorCompat) (obj)).c(changeinfo.f - changeinfo.d);
            ((ViewPropertyAnimatorCompat) (obj)).a(0.0F).a(new VpaListenerAdapter(changeinfo, ((ViewPropertyAnimatorCompat) (obj))) {

                final ChangeInfo a;
                final ViewPropertyAnimatorCompat b;
                final DefaultItemAnimator c;

                public void onAnimationEnd(View view1)
                {
                    b.a(null);
                    ViewCompat.c(view1, 1.0F);
                    ViewCompat.a(view1, 0.0F);
                    ViewCompat.b(view1, 0.0F);
                    c.a(a.a, true);
                    DefaultItemAnimator.h(c).remove(a.a);
                    DefaultItemAnimator.e(c);
                }

                public void onAnimationStart(View view1)
                {
                    c.b(a.a, true);
                }

            
            {
                c = DefaultItemAnimator.this;
                a = changeinfo;
                b = viewpropertyanimatorcompat;
                super();
            }
            }).b();
        }
        if (view != null)
        {
            obj = ViewCompat.o(view);
            k.add(changeinfo.b);
            ((ViewPropertyAnimatorCompat) (obj)).b(0.0F).c(0.0F).a(g()).a(1.0F).a(new VpaListenerAdapter(changeinfo, ((ViewPropertyAnimatorCompat) (obj)), view) {

                final ChangeInfo a;
                final ViewPropertyAnimatorCompat b;
                final View c;
                final DefaultItemAnimator d;

                public void onAnimationEnd(View view1)
                {
                    b.a(null);
                    ViewCompat.c(c, 1.0F);
                    ViewCompat.a(c, 0.0F);
                    ViewCompat.b(c, 0.0F);
                    d.a(a.b, false);
                    DefaultItemAnimator.h(d).remove(a.b);
                    DefaultItemAnimator.e(d);
                }

                public void onAnimationStart(View view1)
                {
                    d.b(a.b, false);
                }

            
            {
                d = DefaultItemAnimator.this;
                a = changeinfo;
                b = viewpropertyanimatorcompat;
                c = view;
                super();
            }
            }).b();
        }
    }

    static void a(DefaultItemAnimator defaultitemanimator, ChangeInfo changeinfo)
    {
        defaultitemanimator.a(changeinfo);
    }

    static void a(DefaultItemAnimator defaultitemanimator, RecyclerView.ViewHolder viewholder)
    {
        defaultitemanimator.q(viewholder);
    }

    static void a(DefaultItemAnimator defaultitemanimator, RecyclerView.ViewHolder viewholder, int l, int i1, int j1, int k1)
    {
        defaultitemanimator.b(viewholder, l, i1, j1, k1);
    }

    private void a(List list, RecyclerView.ViewHolder viewholder)
    {
        for (int l = list.size() - 1; l >= 0; l--)
        {
            ChangeInfo changeinfo = (ChangeInfo)list.get(l);
            if (a(changeinfo, viewholder) && changeinfo.a == null && changeinfo.b == null)
            {
                list.remove(changeinfo);
            }
        }

    }

    private boolean a(ChangeInfo changeinfo, RecyclerView.ViewHolder viewholder)
    {
        boolean flag;
        boolean flag1;
        flag1 = false;
        flag = false;
        if (changeinfo.b != viewholder) goto _L2; else goto _L1
_L1:
        changeinfo.b = null;
_L6:
        ViewCompat.c(viewholder.itemView, 1.0F);
        ViewCompat.a(viewholder.itemView, 0.0F);
        ViewCompat.b(viewholder.itemView, 0.0F);
        a(viewholder, flag);
        flag = true;
_L4:
        return flag;
_L2:
        flag = flag1;
        if (changeinfo.a != viewholder) goto _L4; else goto _L3
_L3:
        changeinfo.a = null;
        flag = true;
        if (true) goto _L6; else goto _L5
_L5:
    }

    static ArrayList b(DefaultItemAnimator defaultitemanimator)
    {
        return defaultitemanimator.g;
    }

    private void b(ChangeInfo changeinfo)
    {
        if (changeinfo.a != null)
        {
            a(changeinfo, changeinfo.a);
        }
        if (changeinfo.b != null)
        {
            a(changeinfo, changeinfo.b);
        }
    }

    private void b(RecyclerView.ViewHolder viewholder, int l, int i1, int j1, int k1)
    {
        Object obj = viewholder.itemView;
        l = j1 - l;
        i1 = k1 - i1;
        if (l != 0)
        {
            ViewCompat.o(((View) (obj))).b(0.0F);
        }
        if (i1 != 0)
        {
            ViewCompat.o(((View) (obj))).c(0.0F);
        }
        obj = ViewCompat.o(((View) (obj)));
        i.add(viewholder);
        ((ViewPropertyAnimatorCompat) (obj)).a(d()).a(new VpaListenerAdapter(viewholder, l, i1, ((ViewPropertyAnimatorCompat) (obj))) {

            final RecyclerView.ViewHolder a;
            final int b;
            final int c;
            final ViewPropertyAnimatorCompat d;
            final DefaultItemAnimator e;

            public void onAnimationCancel(View view)
            {
                if (b != 0)
                {
                    ViewCompat.a(view, 0.0F);
                }
                if (c != 0)
                {
                    ViewCompat.b(view, 0.0F);
                }
            }

            public void onAnimationEnd(View view)
            {
                d.a(null);
                e.e(a);
                DefaultItemAnimator.g(e).remove(a);
                DefaultItemAnimator.e(e);
            }

            public void onAnimationStart(View view)
            {
                e.h(a);
            }

            
            {
                e = DefaultItemAnimator.this;
                a = viewholder;
                b = l;
                c = i1;
                d = viewpropertyanimatorcompat;
                super();
            }
        }).b();
    }

    static ArrayList c(DefaultItemAnimator defaultitemanimator)
    {
        return defaultitemanimator.e;
    }

    static ArrayList d(DefaultItemAnimator defaultitemanimator)
    {
        return defaultitemanimator.j;
    }

    static void e(DefaultItemAnimator defaultitemanimator)
    {
        defaultitemanimator.j();
    }

    static ArrayList f(DefaultItemAnimator defaultitemanimator)
    {
        return defaultitemanimator.h;
    }

    static ArrayList g(DefaultItemAnimator defaultitemanimator)
    {
        return defaultitemanimator.i;
    }

    static ArrayList h(DefaultItemAnimator defaultitemanimator)
    {
        return defaultitemanimator.k;
    }

    private void j()
    {
        if (!b())
        {
            i();
        }
    }

    private void p(RecyclerView.ViewHolder viewholder)
    {
        ViewPropertyAnimatorCompat viewpropertyanimatorcompat = ViewCompat.o(viewholder.itemView);
        j.add(viewholder);
        viewpropertyanimatorcompat.a(f()).a(0.0F).a(new VpaListenerAdapter(viewholder, viewpropertyanimatorcompat) {
            private class VpaListenerAdapter
                implements ViewPropertyAnimatorListener
            {

                public void onAnimationCancel(View view)
                {
                }

                public void onAnimationEnd(View view)
                {
                }

                public void onAnimationStart(View view)
                {
                }

                private VpaListenerAdapter()
                {
                }

            }


            final RecyclerView.ViewHolder a;
            final ViewPropertyAnimatorCompat b;
            final DefaultItemAnimator c;

            public void onAnimationEnd(View view)
            {
                b.a(null);
                ViewCompat.c(view, 1.0F);
                c.d(a);
                DefaultItemAnimator.d(c).remove(a);
                DefaultItemAnimator.e(c);
            }

            public void onAnimationStart(View view)
            {
                c.g(a);
            }

            
            {
                c = DefaultItemAnimator.this;
                a = viewholder;
                b = viewpropertyanimatorcompat;
                super();
            }
        }).b();
    }

    private void q(RecyclerView.ViewHolder viewholder)
    {
        ViewPropertyAnimatorCompat viewpropertyanimatorcompat = ViewCompat.o(viewholder.itemView);
        h.add(viewholder);
        viewpropertyanimatorcompat.a(1.0F).a(e()).a(new VpaListenerAdapter(viewholder, viewpropertyanimatorcompat) {

            final RecyclerView.ViewHolder a;
            final ViewPropertyAnimatorCompat b;
            final DefaultItemAnimator c;

            public void onAnimationCancel(View view)
            {
                ViewCompat.c(view, 1.0F);
            }

            public void onAnimationEnd(View view)
            {
                b.a(null);
                c.f(a);
                DefaultItemAnimator.f(c).remove(a);
                DefaultItemAnimator.e(c);
            }

            public void onAnimationStart(View view)
            {
                c.i(a);
            }

            
            {
                c = DefaultItemAnimator.this;
                a = viewholder;
                b = viewpropertyanimatorcompat;
                super();
            }
        }).b();
    }

    private void r(RecyclerView.ViewHolder viewholder)
    {
        AnimatorCompatHelper.a(viewholder.itemView);
        c(viewholder);
    }

    public void a()
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
            for (Iterator iterator = a.iterator(); iterator.hasNext(); p((RecyclerView.ViewHolder)iterator.next())) { }
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
                    final DefaultItemAnimator b;

                    public void run()
                    {
                        MoveInfo moveinfo;
                        for (Iterator iterator1 = a.iterator(); iterator1.hasNext(); DefaultItemAnimator.a(b, moveinfo.a, moveinfo.b, moveinfo.c, moveinfo.d, moveinfo.e))
                        {
                            moveinfo = (MoveInfo)iterator1.next();
                        }

                        a.clear();
                        DefaultItemAnimator.a(b).remove(a);
                    }

            
            {
                b = DefaultItemAnimator.this;
                a = arraylist;
                super();
            }
                };
                if (flag)
                {
                    ViewCompat.a(((MoveInfo)arraylist.get(0)).a.itemView, runnable, f());
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
                    final DefaultItemAnimator b;

                    public void run()
                    {
                        ChangeInfo changeinfo;
                        for (Iterator iterator1 = a.iterator(); iterator1.hasNext(); DefaultItemAnimator.a(b, changeinfo))
                        {
                            changeinfo = (ChangeInfo)iterator1.next();
                        }

                        a.clear();
                        DefaultItemAnimator.b(b).remove(a);
                    }

            
            {
                b = DefaultItemAnimator.this;
                a = arraylist;
                super();
            }
                };
                if (flag)
                {
                    ViewCompat.a(((ChangeInfo)arraylist.get(0)).a.itemView, runnable, f());
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
                    final DefaultItemAnimator b;

                    public void run()
                    {
                        RecyclerView.ViewHolder viewholder;
                        for (Iterator iterator1 = a.iterator(); iterator1.hasNext(); DefaultItemAnimator.a(b, viewholder))
                        {
                            viewholder = (RecyclerView.ViewHolder)iterator1.next();
                        }

                        a.clear();
                        DefaultItemAnimator.c(b).remove(a);
                    }

            
            {
                b = DefaultItemAnimator.this;
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
                    ViewCompat.a(((RecyclerView.ViewHolder)arraylist.get(0)).itemView, runnable, l + l1);
                    return;
                } else
                {
                    runnable.run();
                    return;
                }
            }
        }
    }

    void a(List list)
    {
        for (int l = list.size() - 1; l >= 0; l--)
        {
            ViewCompat.o(((RecyclerView.ViewHolder)list.get(l)).itemView).a();
        }

    }

    public boolean a(RecyclerView.ViewHolder viewholder)
    {
        r(viewholder);
        a.add(viewholder);
        return true;
    }

    public boolean a(RecyclerView.ViewHolder viewholder, int l, int i1, int j1, int k1)
    {
        View view = viewholder.itemView;
        l = (int)((float)l + ViewCompat.k(viewholder.itemView));
        i1 = (int)((float)i1 + ViewCompat.l(viewholder.itemView));
        r(viewholder);
        int l1 = j1 - l;
        int i2 = k1 - i1;
        if (l1 == 0 && i2 == 0)
        {
            e(viewholder);
            return false;
        }
        if (l1 != 0)
        {
            ViewCompat.a(view, -l1);
        }
        if (i2 != 0)
        {
            ViewCompat.b(view, -i2);
        }
        c.add(new MoveInfo(viewholder, l, i1, j1, k1));
        return true;
    }

    public boolean a(RecyclerView.ViewHolder viewholder, RecyclerView.ViewHolder viewholder1, int l, int i1, int j1, int k1)
    {
        float f1 = ViewCompat.k(viewholder.itemView);
        float f2 = ViewCompat.l(viewholder.itemView);
        float f3 = ViewCompat.f(viewholder.itemView);
        r(viewholder);
        int l1 = (int)((float)(j1 - l) - f1);
        int i2 = (int)((float)(k1 - i1) - f2);
        ViewCompat.a(viewholder.itemView, f1);
        ViewCompat.b(viewholder.itemView, f2);
        ViewCompat.c(viewholder.itemView, f3);
        if (viewholder1 != null && viewholder1.itemView != null)
        {
            r(viewholder1);
            ViewCompat.a(viewholder1.itemView, -l1);
            ViewCompat.b(viewholder1.itemView, -i2);
            ViewCompat.c(viewholder1.itemView, 0.0F);
        }
        d.add(new ChangeInfo(viewholder, viewholder1, l, i1, j1, k1));
        return true;
    }

    public boolean b()
    {
        return !b.isEmpty() || !d.isEmpty() || !c.isEmpty() || !a.isEmpty() || !i.isEmpty() || !j.isEmpty() || !h.isEmpty() || !k.isEmpty() || !f.isEmpty() || !e.isEmpty() || !g.isEmpty();
    }

    public boolean b(RecyclerView.ViewHolder viewholder)
    {
        r(viewholder);
        ViewCompat.c(viewholder.itemView, 0.0F);
        b.add(viewholder);
        return true;
    }

    public void c()
    {
        for (int l = c.size() - 1; l >= 0; l--)
        {
            MoveInfo moveinfo = (MoveInfo)c.get(l);
            View view = moveinfo.a.itemView;
            ViewCompat.b(view, 0.0F);
            ViewCompat.a(view, 0.0F);
            e(moveinfo.a);
            c.remove(l);
        }

        for (int i1 = a.size() - 1; i1 >= 0; i1--)
        {
            d((RecyclerView.ViewHolder)a.get(i1));
            a.remove(i1);
        }

        for (int j1 = b.size() - 1; j1 >= 0; j1--)
        {
            RecyclerView.ViewHolder viewholder = (RecyclerView.ViewHolder)b.get(j1);
            ViewCompat.c(viewholder.itemView, 1.0F);
            f(viewholder);
            b.remove(j1);
        }

        for (int k1 = d.size() - 1; k1 >= 0; k1--)
        {
            b((ChangeInfo)d.get(k1));
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
                MoveInfo moveinfo1 = (MoveInfo)arraylist.get(k2);
                View view1 = moveinfo1.a.itemView;
                ViewCompat.b(view1, 0.0F);
                ViewCompat.a(view1, 0.0F);
                e(moveinfo1.a);
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
                RecyclerView.ViewHolder viewholder1 = (RecyclerView.ViewHolder)arraylist1.get(l2);
                ViewCompat.c(viewholder1.itemView, 1.0F);
                f(viewholder1);
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
                b((ChangeInfo)arraylist2.get(i3));
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

    public void c(RecyclerView.ViewHolder viewholder)
    {
        View view = viewholder.itemView;
        ViewCompat.o(view).a();
        for (int l = c.size() - 1; l >= 0; l--)
        {
            if (((MoveInfo)c.get(l)).a == viewholder)
            {
                ViewCompat.b(view, 0.0F);
                ViewCompat.a(view, 0.0F);
                e(viewholder);
                c.remove(l);
            }
        }

        a(d, viewholder);
        if (a.remove(viewholder))
        {
            ViewCompat.c(view, 1.0F);
            d(viewholder);
        }
        if (b.remove(viewholder))
        {
            ViewCompat.c(view, 1.0F);
            f(viewholder);
        }
        for (int i1 = g.size() - 1; i1 >= 0; i1--)
        {
            ArrayList arraylist = (ArrayList)g.get(i1);
            a(arraylist, viewholder);
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
                            if (((MoveInfo)arraylist1.get(l1)).a != viewholder)
                            {
                                break label1;
                            }
                            ViewCompat.b(view, 0.0F);
                            ViewCompat.a(view, 0.0F);
                            e(viewholder);
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
                if (!arraylist2.remove(viewholder))
                {
                    continue;
                }
                ViewCompat.c(view, 1.0F);
                f(viewholder);
                if (arraylist2.isEmpty())
                {
                    e.remove(k1);
                }
            }

            if (!j.remove(viewholder));
            if (!h.remove(viewholder));
            if (!k.remove(viewholder));
            if (!i.remove(viewholder));
            j();
            return;
        } while (true);
    }

    private class ChangeInfo
    {

        public RecyclerView.ViewHolder a;
        public RecyclerView.ViewHolder b;
        public int c;
        public int d;
        public int e;
        public int f;

        public String toString()
        {
            return (new StringBuilder()).append("ChangeInfo{oldHolder=").append(a).append(", newHolder=").append(b).append(", fromX=").append(c).append(", fromY=").append(d).append(", toX=").append(e).append(", toY=").append(f).append('}').toString();
        }

        private ChangeInfo(RecyclerView.ViewHolder viewholder, RecyclerView.ViewHolder viewholder1)
        {
            a = viewholder;
            b = viewholder1;
        }

        private ChangeInfo(RecyclerView.ViewHolder viewholder, RecyclerView.ViewHolder viewholder1, int l, int i1, int j1, int k1)
        {
            this(viewholder, viewholder1);
            c = l;
            d = i1;
            e = j1;
            f = k1;
        }

    }


    private class MoveInfo
    {

        public RecyclerView.ViewHolder a;
        public int b;
        public int c;
        public int d;
        public int e;

        private MoveInfo(RecyclerView.ViewHolder viewholder, int l, int i1, int j1, int k1)
        {
            a = viewholder;
            b = l;
            c = i1;
            d = j1;
            e = k1;
        }

    }

}
