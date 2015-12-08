// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.support.v4.view.ViewCompat;
import android.support.v4.view.ViewPropertyAnimatorCompat;
import android.support.v4.view.ViewPropertyAnimatorListener;
import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package android.support.v7.widget:
//            h, i, j, k, 
//            g, d, e, f

public final class android.support.v7.widget.c extends RecyclerView.e
{
    private static final class a
    {

        public RecyclerView.t a;
        public RecyclerView.t b;
        public int c;
        public int d;
        public int e;
        public int f;

        public final String toString()
        {
            return (new StringBuilder("ChangeInfo{oldHolder=")).append(a).append(", newHolder=").append(b).append(", fromX=").append(c).append(", fromY=").append(d).append(", toX=").append(e).append(", toY=").append(f).append('}').toString();
        }

        private a(RecyclerView.t t, RecyclerView.t t1)
        {
            a = t;
            b = t1;
        }

        private a(RecyclerView.t t, RecyclerView.t t1, int l, int i1, int j1, int k1)
        {
            this(t, t1);
            c = l;
            d = i1;
            e = j1;
            f = k1;
        }

        a(RecyclerView.t t, RecyclerView.t t1, int l, int i1, int j1, int k1, byte byte0)
        {
            this(t, t1, l, i1, j1, k1);
        }
    }

    private static final class b
    {

        public RecyclerView.t a;
        public int b;
        public int c;
        public int d;
        public int e;

        private b(RecyclerView.t t, int l, int i1, int j1, int k1)
        {
            a = t;
            b = l;
            c = i1;
            d = j1;
            e = k1;
        }

        b(RecyclerView.t t, int l, int i1, int j1, int k1, byte byte0)
        {
            this(t, l, i1, j1, k1);
        }
    }

    private static class c
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

    public android.support.v7.widget.c()
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

    static ArrayList a(android.support.v7.widget.c c1)
    {
        return c1.f;
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

    static void a(android.support.v7.widget.c c1, RecyclerView.t t)
    {
        ViewPropertyAnimatorCompat viewpropertyanimatorcompat = ViewCompat.animate(t.a);
        c1.h.add(t);
        viewpropertyanimatorcompat.alpha(1.0F).setDuration(c1.e()).setListener(new h(c1, t, viewpropertyanimatorcompat)).start();
    }

    static void a(android.support.v7.widget.c c1, RecyclerView.t t, int l, int i1, int j1, int k1)
    {
        Object obj = t.a;
        l = j1 - l;
        i1 = k1 - i1;
        if (l != 0)
        {
            ViewCompat.animate(((View) (obj))).translationX(0.0F);
        }
        if (i1 != 0)
        {
            ViewCompat.animate(((View) (obj))).translationY(0.0F);
        }
        obj = ViewCompat.animate(((View) (obj)));
        c1.i.add(t);
        ((ViewPropertyAnimatorCompat) (obj)).setDuration(c1.d()).setListener(new i(c1, t, l, i1, ((ViewPropertyAnimatorCompat) (obj)))).start();
    }

    static void a(android.support.v7.widget.c c1, a a1)
    {
        View view = null;
        Object obj = a1.a;
        RecyclerView.t t;
        if (obj == null)
        {
            obj = null;
        } else
        {
            obj = ((RecyclerView.t) (obj)).a;
        }
        t = a1.b;
        if (t != null)
        {
            view = t.a;
        }
        if (obj != null)
        {
            obj = ViewCompat.animate(((View) (obj))).setDuration(c1.g());
            c1.k.add(a1.a);
            ((ViewPropertyAnimatorCompat) (obj)).translationX(a1.e - a1.c);
            ((ViewPropertyAnimatorCompat) (obj)).translationY(a1.f - a1.d);
            ((ViewPropertyAnimatorCompat) (obj)).alpha(0.0F).setListener(new j(c1, a1, ((ViewPropertyAnimatorCompat) (obj)))).start();
        }
        if (view != null)
        {
            obj = ViewCompat.animate(view);
            c1.k.add(a1.b);
            ((ViewPropertyAnimatorCompat) (obj)).translationX(0.0F).translationY(0.0F).setDuration(c1.g()).alpha(1.0F).setListener(new k(c1, a1, ((ViewPropertyAnimatorCompat) (obj)), view)).start();
        }
    }

    private static void a(List list)
    {
        for (int l = list.size() - 1; l >= 0; l--)
        {
            ViewCompat.animate(((RecyclerView.t)list.get(l)).a).cancel();
        }

    }

    private void a(List list, RecyclerView.t t)
    {
        for (int l = list.size() - 1; l >= 0; l--)
        {
            a a1 = (a)list.get(l);
            if (a(a1, t) && a1.a == null && a1.b == null)
            {
                list.remove(a1);
            }
        }

    }

    private boolean a(a a1, RecyclerView.t t)
    {
        if (a1.b == t)
        {
            a1.b = null;
        } else
        if (a1.a == t)
        {
            a1.a = null;
        } else
        {
            return false;
        }
        ViewCompat.setAlpha(t.a, 1.0F);
        ViewCompat.setTranslationX(t.a, 0.0F);
        ViewCompat.setTranslationY(t.a, 0.0F);
        g(t);
        return true;
    }

    static ArrayList b(android.support.v7.widget.c c1)
    {
        return c1.g;
    }

    static ArrayList c(android.support.v7.widget.c c1)
    {
        return c1.e;
    }

    static ArrayList d(android.support.v7.widget.c c1)
    {
        return c1.j;
    }

    static void e(android.support.v7.widget.c c1)
    {
        c1.j();
    }

    static ArrayList f(android.support.v7.widget.c c1)
    {
        return c1.h;
    }

    static ArrayList g(android.support.v7.widget.c c1)
    {
        return c1.i;
    }

    static ArrayList h(android.support.v7.widget.c c1)
    {
        return c1.k;
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
            RecyclerView.t t;
            ViewPropertyAnimatorCompat viewpropertyanimatorcompat;
            for (Iterator iterator = a.iterator(); iterator.hasNext(); viewpropertyanimatorcompat.setDuration(f()).alpha(0.0F).setListener(new g(this, t, viewpropertyanimatorcompat)).start())
            {
                t = (RecyclerView.t)iterator.next();
                viewpropertyanimatorcompat = ViewCompat.animate(t.a);
                j.add(t);
            }

            a.clear();
            Object obj;
            if (flag1)
            {
                ArrayList arraylist = new ArrayList();
                arraylist.addAll(c);
                f.add(arraylist);
                c.clear();
                obj = new d(this, arraylist);
                if (flag)
                {
                    ViewCompat.postOnAnimationDelayed(((b)arraylist.get(0)).a.a, ((Runnable) (obj)), f());
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
                obj = new e(this, arraylist);
                if (flag)
                {
                    ViewCompat.postOnAnimationDelayed(((a)arraylist.get(0)).a.a, ((Runnable) (obj)), f());
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
                obj = new f(this, arraylist);
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
                    ViewCompat.postOnAnimationDelayed(((RecyclerView.t)arraylist.get(0)).a, ((Runnable) (obj)), l + l1);
                    return;
                } else
                {
                    ((Runnable) (obj)).run();
                    return;
                }
            }
        }
    }

    public final boolean a(RecyclerView.t t)
    {
        c(t);
        a.add(t);
        return true;
    }

    public final boolean a(RecyclerView.t t, int l, int i1, int j1, int k1)
    {
        View view = t.a;
        l = (int)((float)l + ViewCompat.getTranslationX(t.a));
        i1 = (int)((float)i1 + ViewCompat.getTranslationY(t.a));
        c(t);
        int l1 = j1 - l;
        int i2 = k1 - i1;
        if (l1 == 0 && i2 == 0)
        {
            e(t);
            return false;
        }
        if (l1 != 0)
        {
            ViewCompat.setTranslationX(view, -l1);
        }
        if (i2 != 0)
        {
            ViewCompat.setTranslationY(view, -i2);
        }
        c.add(new b(t, l, i1, j1, k1, (byte)0));
        return true;
    }

    public final boolean a(RecyclerView.t t, RecyclerView.t t1, int l, int i1, int j1, int k1)
    {
        float f1 = ViewCompat.getTranslationX(t.a);
        float f2 = ViewCompat.getTranslationY(t.a);
        float f3 = ViewCompat.getAlpha(t.a);
        c(t);
        int l1 = (int)((float)(j1 - l) - f1);
        int i2 = (int)((float)(k1 - i1) - f2);
        ViewCompat.setTranslationX(t.a, f1);
        ViewCompat.setTranslationY(t.a, f2);
        ViewCompat.setAlpha(t.a, f3);
        if (t1 != null && t1.a != null)
        {
            c(t1);
            ViewCompat.setTranslationX(t1.a, -l1);
            ViewCompat.setTranslationY(t1.a, -i2);
            ViewCompat.setAlpha(t1.a, 0.0F);
        }
        d.add(new a(t, t1, l, i1, j1, k1, (byte)0));
        return true;
    }

    public final boolean b()
    {
        return !b.isEmpty() || !d.isEmpty() || !c.isEmpty() || !a.isEmpty() || !i.isEmpty() || !j.isEmpty() || !h.isEmpty() || !k.isEmpty() || !f.isEmpty() || !e.isEmpty() || !g.isEmpty();
    }

    public final boolean b(RecyclerView.t t)
    {
        c(t);
        ViewCompat.setAlpha(t.a, 0.0F);
        b.add(t);
        return true;
    }

    public final void c()
    {
        for (int l = c.size() - 1; l >= 0; l--)
        {
            b b1 = (b)c.get(l);
            View view = b1.a.a;
            ViewCompat.setTranslationY(view, 0.0F);
            ViewCompat.setTranslationX(view, 0.0F);
            e(b1.a);
            c.remove(l);
        }

        for (int i1 = a.size() - 1; i1 >= 0; i1--)
        {
            d((RecyclerView.t)a.get(i1));
            a.remove(i1);
        }

        for (int j1 = b.size() - 1; j1 >= 0; j1--)
        {
            RecyclerView.t t = (RecyclerView.t)b.get(j1);
            ViewCompat.setAlpha(t.a, 1.0F);
            f(t);
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
                View view1 = b2.a.a;
                ViewCompat.setTranslationY(view1, 0.0F);
                ViewCompat.setTranslationX(view1, 0.0F);
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
                RecyclerView.t t1 = (RecyclerView.t)arraylist1.get(l2);
                ViewCompat.setAlpha(t1.a, 1.0F);
                f(t1);
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

    public final void c(RecyclerView.t t)
    {
        View view = t.a;
        ViewCompat.animate(view).cancel();
        for (int l = c.size() - 1; l >= 0; l--)
        {
            if (((b)c.get(l)).a == t)
            {
                ViewCompat.setTranslationY(view, 0.0F);
                ViewCompat.setTranslationX(view, 0.0F);
                e(t);
                c.remove(l);
            }
        }

        a(d, t);
        if (a.remove(t))
        {
            ViewCompat.setAlpha(view, 1.0F);
            d(t);
        }
        if (b.remove(t))
        {
            ViewCompat.setAlpha(view, 1.0F);
            f(t);
        }
        for (int i1 = g.size() - 1; i1 >= 0; i1--)
        {
            ArrayList arraylist = (ArrayList)g.get(i1);
            a(arraylist, t);
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
                            if (((b)arraylist1.get(l1)).a != t)
                            {
                                break label1;
                            }
                            ViewCompat.setTranslationY(view, 0.0F);
                            ViewCompat.setTranslationX(view, 0.0F);
                            e(t);
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
                if (!arraylist2.remove(t))
                {
                    continue;
                }
                ViewCompat.setAlpha(view, 1.0F);
                f(t);
                if (arraylist2.isEmpty())
                {
                    e.remove(k1);
                }
            }

            j.remove(t);
            h.remove(t);
            k.remove(t);
            i.remove(t);
            j();
            return;
        } while (true);
    }
}
