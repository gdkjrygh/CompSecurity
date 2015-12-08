// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class dhk extends abs
{

    ArrayList a;
    ArrayList b;
    ArrayList c;
    private ArrayList d;
    private ArrayList e;

    public dhk()
    {
        d = new ArrayList();
        e = new ArrayList();
        a = new ArrayList();
        b = new ArrayList();
        c = new ArrayList();
    }

    private static void a(List list)
    {
        for (int i = list.size() - 1; i >= 0; i--)
        {
            km.q(((abo)list.get(i)).a).c();
        }

    }

    private static boolean g(abo abo1)
    {
        abo1 = (dgz)abo1.a.getTag(0x7f1100e1);
        return abo1 != null && ((dgz) (abo1)).a;
    }

    public final void a()
    {
        boolean flag;
        boolean flag1;
        if (!d.isEmpty())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (!e.isEmpty())
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        if (flag || flag1)
        {
            abo abo1;
            me me1;
            for (Iterator iterator = d.iterator(); iterator.hasNext(); me1.a(120L).a(0.0F).a(new dhm(abo1, me1) {

        private abo a;
        private me b;
        private dhk c;

        private void d(View view)
        {
            b.a(null);
            km.c(view, 1.0F);
            km.a(view, 0.0F);
            c.e(a);
            c.c.remove(a);
            c.c();
        }

        public final void a(View view)
        {
        }

        public final void b(View view)
        {
            d(view);
        }

        public final void c(View view)
        {
            d(view);
        }

            
            {
                c = dhk.this;
                a = abo1;
                b = me1;
                super((byte)0);
            }
    }).d())
            {
                abo1 = (abo)iterator.next();
                Object obj = abo1.a;
                me1 = km.q(((View) (obj)));
                obj = (dgz)((View) (obj)).getTag(0x7f1100e1);
                if (obj != null)
                {
                    if (((dgz) (obj)).c == -1)
                    {
                        me1.d(-((dgz) (obj)).d);
                    }
                    if (((dgz) (obj)).c == 1)
                    {
                        me1.d(((dgz) (obj)).d);
                    }
                }
                c.add(abo1);
            }

            d.clear();
            if (flag1)
            {
                ArrayList arraylist = new ArrayList();
                arraylist.addAll(e);
                a.add(arraylist);
                e.clear();
                Runnable runnable = new Runnable(arraylist) {

                    private ArrayList a;
                    private dhk b;

                    public final void run()
                    {
                        float f1;
                        abo abo2;
                        dhk dhk1;
                        me me2;
                        for (Iterator iterator1 = a.iterator(); iterator1.hasNext(); me2.a(f1).b(0.0F).a(300L).a(dhk1. new dhm(abo2, me2) {

                    private abo a;
                    private me b;
                    private dhk c;

                    public final void a(View view)
                    {
                    }

                    public final void b(View view)
                    {
                        view.setTag(0x7f1100e0, null);
                        b.a(null);
                        c.e(a);
                        c.b.remove(a);
                        c.c();
                    }

                    public final void c(View view)
                    {
                        km.c(view, 1.0F);
                        km.a(view, 0.0F);
                    }

            
            {
                c = dhk.this;
                a = abo1;
                b = me1;
                super((byte)0);
            }
                }).d())
                        {
                            abo2 = (abo)iterator1.next();
                            dhk1 = b;
                            me2 = km.q(abo2.a);
                            dhk1.b.add(abo2);
                            f1 = 1.0F;
                            Object obj1 = (dhl)abo2.a.getTag(0x7f1100e0);
                            if (obj1 != null)
                            {
                                f1 = ((dhl) (obj1)).a;
                            }
                            obj1 = (dgz)abo2.a.getTag(0x7f1100e1);
                            if (obj1 == null)
                            {
                                continue;
                            }
                            if (((dgz) (obj1)).c == -1)
                            {
                                km.a(abo2.a, -((dgz) (obj1)).d);
                            }
                            if (((dgz) (obj1)).c == 1)
                            {
                                km.a(abo2.a, ((dgz) (obj1)).d);
                            }
                        }

                        a.clear();
                        b.a.remove(a);
                    }

            
            {
                b = dhk.this;
                a = arraylist;
                super();
            }
                };
                if (flag)
                {
                    km.a(((abo)arraylist.get(0)).a, runnable, 120L);
                    return;
                } else
                {
                    runnable.run();
                    return;
                }
            }
        }
    }

    public final boolean a(abo abo1)
    {
        c(abo1);
        if (g(abo1))
        {
            return false;
        } else
        {
            d.add(abo1);
            return true;
        }
    }

    public final boolean a(abo abo1, int i, int j, int k, int l)
    {
        if (abo1 != null)
        {
            e(abo1);
        }
        return false;
    }

    public final boolean a(abo abo1, abo abo2, int i, int j, int k, int l)
    {
        if (abo1 != null)
        {
            e(abo1);
        }
        if (abo2 != null)
        {
            e(abo2);
        }
        return false;
    }

    public final boolean a(abo abo1, abo abo2, aba aba, aba aba1)
    {
        e(abo1);
        e(abo2);
        return false;
    }

    public final boolean b()
    {
        return !e.isEmpty() || !d.isEmpty() || !c.isEmpty() || !b.isEmpty() || !a.isEmpty();
    }

    public final boolean b(abo abo1)
    {
        c(abo1);
        if (g(abo1))
        {
            return false;
        } else
        {
            km.c(abo1.a, 0.0F);
            dhl dhl1 = new dhl();
            dhl1.a = 1.0F;
            abo1.a.setTag(0x7f1100e0, dhl1);
            e.add(abo1);
            return true;
        }
    }

    final void c()
    {
        if (!b())
        {
            g();
        }
    }

    public final void c(abo abo1)
    {
        View view = abo1.a;
        km.q(view).c();
        if (d.remove(abo1))
        {
            km.c(view, 1.0F);
            e(abo1);
        }
        if (e.remove(abo1))
        {
            Object obj = (dhl)abo1.a.getTag(0x7f1100e0);
            float f1;
            int i;
            if (obj != null)
            {
                f1 = ((dhl) (obj)).a;
            } else
            {
                f1 = 1.0F;
            }
            km.c(view, f1);
            e(abo1);
        }
        for (i = a.size() - 1; i >= 0; i--)
        {
            obj = (ArrayList)a.get(i);
            if (!((ArrayList) (obj)).remove(abo1))
            {
                continue;
            }
            km.c(view, 1.0F);
            e(abo1);
            if (((ArrayList) (obj)).isEmpty())
            {
                a.remove(i);
            }
        }

        c();
    }

    public final void d()
    {
        for (int i = d.size() - 1; i >= 0; i--)
        {
            e((abo)d.get(i));
            d.remove(i);
        }

        for (int j = e.size() - 1; j >= 0; j--)
        {
            abo abo1 = (abo)e.get(j);
            km.c(abo1.a, 1.0F);
            e(abo1);
            e.remove(j);
        }

        if (!b())
        {
            return;
        }
        for (int k = a.size() - 1; k >= 0; k--)
        {
            ArrayList arraylist = (ArrayList)a.get(k);
            for (int l = arraylist.size() - 1; l >= 0; l--)
            {
                abo abo2 = (abo)arraylist.get(l);
                km.c(abo2.a, 1.0F);
                e(abo2);
                arraylist.remove(l);
                if (arraylist.isEmpty())
                {
                    a.remove(arraylist);
                }
            }

        }

        a(c);
        a(b);
        g();
    }

    public final long e()
    {
        return 300L;
    }

    public final long f()
    {
        return 120L;
    }
}
