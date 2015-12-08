// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.support.v4.view.ViewCompat;
import android.support.v4.view.ViewPropertyAnimatorCompat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package android.support.v7.widget:
//            ap, bi, l, m, 
//            p, n, o, k, 
//            h, q, i, j

public final class g extends ap
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

    public g()
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

    static ArrayList a(g g1)
    {
        return g1.f;
    }

    static void a(g g1, bi bi1)
    {
        ViewPropertyAnimatorCompat viewpropertyanimatorcompat = ViewCompat.animate(bi1.a);
        g1.h.add(bi1);
        viewpropertyanimatorcompat.alpha(1.0F).setDuration(g1.e()).setListener(new l(g1, bi1, viewpropertyanimatorcompat)).start();
    }

    static void a(g g1, bi bi1, int i1, int j1, int k1, int l1)
    {
        Object obj = bi1.a;
        i1 = k1 - i1;
        j1 = l1 - j1;
        if (i1 != 0)
        {
            ViewCompat.animate(((android.view.View) (obj))).translationX(0.0F);
        }
        if (j1 != 0)
        {
            ViewCompat.animate(((android.view.View) (obj))).translationY(0.0F);
        }
        obj = ViewCompat.animate(((android.view.View) (obj)));
        g1.i.add(bi1);
        ((ViewPropertyAnimatorCompat) (obj)).setDuration(g1.d()).setListener(new m(g1, bi1, i1, j1, ((ViewPropertyAnimatorCompat) (obj)))).start();
    }

    static void a(g g1, p p1)
    {
        android.view.View view = null;
        Object obj = p1.a;
        bi bi1;
        if (obj == null)
        {
            obj = null;
        } else
        {
            obj = ((bi) (obj)).a;
        }
        bi1 = p1.b;
        if (bi1 != null)
        {
            view = bi1.a;
        }
        if (obj != null)
        {
            obj = ViewCompat.animate(((android.view.View) (obj))).setDuration(g1.g());
            g1.k.add(p1.a);
            ((ViewPropertyAnimatorCompat) (obj)).translationX(p1.e - p1.c);
            ((ViewPropertyAnimatorCompat) (obj)).translationY(p1.f - p1.d);
            ((ViewPropertyAnimatorCompat) (obj)).alpha(0.0F).setListener(new n(g1, p1, ((ViewPropertyAnimatorCompat) (obj)))).start();
        }
        if (view != null)
        {
            obj = ViewCompat.animate(view);
            g1.k.add(p1.b);
            ((ViewPropertyAnimatorCompat) (obj)).translationX(0.0F).translationY(0.0F).setDuration(g1.g()).alpha(1.0F).setListener(new o(g1, p1, ((ViewPropertyAnimatorCompat) (obj)), view)).start();
        }
    }

    private void a(p p1)
    {
        if (p1.a != null)
        {
            a(p1, p1.a);
        }
        if (p1.b != null)
        {
            a(p1, p1.b);
        }
    }

    private static void a(List list)
    {
        for (int i1 = list.size() - 1; i1 >= 0; i1--)
        {
            ViewCompat.animate(((bi)list.get(i1)).a).cancel();
        }

    }

    private void a(List list, bi bi1)
    {
        for (int i1 = list.size() - 1; i1 >= 0; i1--)
        {
            p p1 = (p)list.get(i1);
            if (a(p1, bi1) && p1.a == null && p1.b == null)
            {
                list.remove(p1);
            }
        }

    }

    private boolean a(p p1, bi bi1)
    {
        if (p1.b == bi1)
        {
            p1.b = null;
        } else
        if (p1.a == bi1)
        {
            p1.a = null;
        } else
        {
            return false;
        }
        ViewCompat.setAlpha(bi1.a, 1.0F);
        ViewCompat.setTranslationX(bi1.a, 0.0F);
        ViewCompat.setTranslationY(bi1.a, 0.0F);
        g(bi1);
        return true;
    }

    static ArrayList b(g g1)
    {
        return g1.g;
    }

    static ArrayList c(g g1)
    {
        return g1.e;
    }

    static ArrayList d(g g1)
    {
        return g1.j;
    }

    static void e(g g1)
    {
        g1.j();
    }

    static ArrayList f(g g1)
    {
        return g1.h;
    }

    static ArrayList g(g g1)
    {
        return g1.i;
    }

    static ArrayList h(g g1)
    {
        return g1.k;
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
            bi bi1;
            ViewPropertyAnimatorCompat viewpropertyanimatorcompat;
            for (Iterator iterator = a.iterator(); iterator.hasNext(); viewpropertyanimatorcompat.setDuration(f()).alpha(0.0F).setListener(new k(this, bi1, viewpropertyanimatorcompat)).start())
            {
                bi1 = (bi)iterator.next();
                viewpropertyanimatorcompat = ViewCompat.animate(bi1.a);
                j.add(bi1);
            }

            a.clear();
            Object obj;
            if (flag1)
            {
                ArrayList arraylist = new ArrayList();
                arraylist.addAll(c);
                f.add(arraylist);
                c.clear();
                obj = new h(this, arraylist);
                if (flag)
                {
                    ViewCompat.postOnAnimationDelayed(((q)arraylist.get(0)).a.a, ((Runnable) (obj)), f());
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
                obj = new i(this, arraylist);
                if (flag)
                {
                    ViewCompat.postOnAnimationDelayed(((p)arraylist.get(0)).a.a, ((Runnable) (obj)), f());
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
                obj = new j(this, arraylist);
                if (flag || flag1 || flag2)
                {
                    long l1;
                    long l2;
                    long l3;
                    if (flag)
                    {
                        l1 = f();
                    } else
                    {
                        l1 = 0L;
                    }
                    if (flag1)
                    {
                        l2 = d();
                    } else
                    {
                        l2 = 0L;
                    }
                    if (flag2)
                    {
                        l3 = g();
                    } else
                    {
                        l3 = 0L;
                    }
                    l2 = Math.max(l2, l3);
                    ViewCompat.postOnAnimationDelayed(((bi)arraylist.get(0)).a, ((Runnable) (obj)), l1 + l2);
                    return;
                } else
                {
                    ((Runnable) (obj)).run();
                    return;
                }
            }
        }
    }

    public final boolean a(bi bi1)
    {
        c(bi1);
        a.add(bi1);
        return true;
    }

    public final boolean a(bi bi1, int i1, int j1, int k1, int l1)
    {
        android.view.View view = bi1.a;
        i1 = (int)((float)i1 + ViewCompat.getTranslationX(bi1.a));
        j1 = (int)((float)j1 + ViewCompat.getTranslationY(bi1.a));
        c(bi1);
        int i2 = k1 - i1;
        int j2 = l1 - j1;
        if (i2 == 0 && j2 == 0)
        {
            e(bi1);
            return false;
        }
        if (i2 != 0)
        {
            ViewCompat.setTranslationX(view, -i2);
        }
        if (j2 != 0)
        {
            ViewCompat.setTranslationY(view, -j2);
        }
        c.add(new q(bi1, i1, j1, k1, l1, (byte)0));
        return true;
    }

    public final boolean a(bi bi1, bi bi2, int i1, int j1, int k1, int l1)
    {
        float f1 = ViewCompat.getTranslationX(bi1.a);
        float f2 = ViewCompat.getTranslationY(bi1.a);
        float f3 = ViewCompat.getAlpha(bi1.a);
        c(bi1);
        int i2 = (int)((float)(k1 - i1) - f1);
        int j2 = (int)((float)(l1 - j1) - f2);
        ViewCompat.setTranslationX(bi1.a, f1);
        ViewCompat.setTranslationY(bi1.a, f2);
        ViewCompat.setAlpha(bi1.a, f3);
        if (bi2 != null && bi2.a != null)
        {
            c(bi2);
            ViewCompat.setTranslationX(bi2.a, -i2);
            ViewCompat.setTranslationY(bi2.a, -j2);
            ViewCompat.setAlpha(bi2.a, 0.0F);
        }
        d.add(new p(bi1, bi2, i1, j1, k1, l1, (byte)0));
        return true;
    }

    public final boolean b()
    {
        return !b.isEmpty() || !d.isEmpty() || !c.isEmpty() || !a.isEmpty() || !i.isEmpty() || !j.isEmpty() || !h.isEmpty() || !k.isEmpty() || !f.isEmpty() || !e.isEmpty() || !g.isEmpty();
    }

    public final boolean b(bi bi1)
    {
        c(bi1);
        ViewCompat.setAlpha(bi1.a, 0.0F);
        b.add(bi1);
        return true;
    }

    public final void c()
    {
        for (int i1 = c.size() - 1; i1 >= 0; i1--)
        {
            q q1 = (q)c.get(i1);
            android.view.View view = q1.a.a;
            ViewCompat.setTranslationY(view, 0.0F);
            ViewCompat.setTranslationX(view, 0.0F);
            e(q1.a);
            c.remove(i1);
        }

        for (int j1 = a.size() - 1; j1 >= 0; j1--)
        {
            d((bi)a.get(j1));
            a.remove(j1);
        }

        for (int k1 = b.size() - 1; k1 >= 0; k1--)
        {
            bi bi1 = (bi)b.get(k1);
            ViewCompat.setAlpha(bi1.a, 1.0F);
            f(bi1);
            b.remove(k1);
        }

        for (int l1 = d.size() - 1; l1 >= 0; l1--)
        {
            a((p)d.get(l1));
        }

        d.clear();
        if (!b())
        {
            return;
        }
        for (int i2 = f.size() - 1; i2 >= 0; i2--)
        {
            ArrayList arraylist = (ArrayList)f.get(i2);
            for (int l2 = arraylist.size() - 1; l2 >= 0; l2--)
            {
                q q2 = (q)arraylist.get(l2);
                android.view.View view1 = q2.a.a;
                ViewCompat.setTranslationY(view1, 0.0F);
                ViewCompat.setTranslationX(view1, 0.0F);
                e(q2.a);
                arraylist.remove(l2);
                if (arraylist.isEmpty())
                {
                    f.remove(arraylist);
                }
            }

        }

        for (int j2 = e.size() - 1; j2 >= 0; j2--)
        {
            ArrayList arraylist1 = (ArrayList)e.get(j2);
            for (int i3 = arraylist1.size() - 1; i3 >= 0; i3--)
            {
                bi bi2 = (bi)arraylist1.get(i3);
                ViewCompat.setAlpha(bi2.a, 1.0F);
                f(bi2);
                arraylist1.remove(i3);
                if (arraylist1.isEmpty())
                {
                    e.remove(arraylist1);
                }
            }

        }

        for (int k2 = g.size() - 1; k2 >= 0; k2--)
        {
            ArrayList arraylist2 = (ArrayList)g.get(k2);
            for (int j3 = arraylist2.size() - 1; j3 >= 0; j3--)
            {
                a((p)arraylist2.get(j3));
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

    public final void c(bi bi1)
    {
        android.view.View view = bi1.a;
        ViewCompat.animate(view).cancel();
        for (int i1 = c.size() - 1; i1 >= 0; i1--)
        {
            if (((q)c.get(i1)).a == bi1)
            {
                ViewCompat.setTranslationY(view, 0.0F);
                ViewCompat.setTranslationX(view, 0.0F);
                e(bi1);
                c.remove(i1);
            }
        }

        a(d, bi1);
        if (a.remove(bi1))
        {
            ViewCompat.setAlpha(view, 1.0F);
            d(bi1);
        }
        if (b.remove(bi1))
        {
            ViewCompat.setAlpha(view, 1.0F);
            f(bi1);
        }
        for (int j1 = g.size() - 1; j1 >= 0; j1--)
        {
            ArrayList arraylist = (ArrayList)g.get(j1);
            a(arraylist, bi1);
            if (arraylist.isEmpty())
            {
                g.remove(j1);
            }
        }

        int k1 = f.size() - 1;
label0:
        do
        {
            if (k1 >= 0)
            {
                ArrayList arraylist1 = (ArrayList)f.get(k1);
                int i2 = arraylist1.size() - 1;
                do
                {
label1:
                    {
                        if (i2 >= 0)
                        {
                            if (((q)arraylist1.get(i2)).a != bi1)
                            {
                                break label1;
                            }
                            ViewCompat.setTranslationY(view, 0.0F);
                            ViewCompat.setTranslationX(view, 0.0F);
                            e(bi1);
                            arraylist1.remove(i2);
                            if (arraylist1.isEmpty())
                            {
                                f.remove(k1);
                            }
                        }
                        k1--;
                        continue label0;
                    }
                    i2--;
                } while (true);
            }
            for (int l1 = e.size() - 1; l1 >= 0; l1--)
            {
                ArrayList arraylist2 = (ArrayList)e.get(l1);
                if (!arraylist2.remove(bi1))
                {
                    continue;
                }
                ViewCompat.setAlpha(view, 1.0F);
                f(bi1);
                if (arraylist2.isEmpty())
                {
                    e.remove(l1);
                }
            }

            j.remove(bi1);
            h.remove(bi1);
            k.remove(bi1);
            i.remove(bi1);
            j();
            return;
        } while (true);
    }
}
