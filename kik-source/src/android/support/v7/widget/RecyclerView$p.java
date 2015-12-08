// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.util.Log;
import android.view.View;
import android.view.animation.Interpolator;

// Referenced classes of package android.support.v7.widget:
//            RecyclerView

public static abstract class a
{
    public static final class a
    {

        private int a;
        private int b;
        private int c;
        private int d;
        private Interpolator e;
        private boolean f;
        private int g;

        static void a(a a1, RecyclerView recyclerview)
        {
            if (a1.d >= 0)
            {
                int i = a1.d;
                a1.d = -1;
                RecyclerView.c(recyclerview, i);
                a1.f = false;
                return;
            }
            if (a1.f)
            {
                if (a1.e != null && a1.c <= 0)
                {
                    throw new IllegalStateException("If you provide an interpolator, you must set a positive duration");
                }
                if (a1.c <= 0)
                {
                    throw new IllegalStateException("Scroll duration must be a positive number");
                }
                if (a1.e == null)
                {
                    if (a1.c == 0x80000000)
                    {
                        RecyclerView.r(recyclerview).b(a1.a, a1.b);
                    } else
                    {
                        RecyclerView.r(recyclerview).a(a1.a, a1.b, a1.c);
                    }
                } else
                {
                    RecyclerView.r(recyclerview).a(a1.a, a1.b, a1.c, a1.e);
                }
                a1.g = a1.g + 1;
                if (a1.g > 10)
                {
                    Log.e("RecyclerView", "Smooth Scroll action is being updated too frequently. Make sure you are not changing it unless necessary");
                }
                a1.f = false;
                return;
            } else
            {
                a1.g = 0;
                return;
            }
        }

        public final void a(int i)
        {
            d = i;
        }

        public final void a(int i, int j, int k, Interpolator interpolator)
        {
            a = i;
            b = j;
            c = k;
            e = interpolator;
            f = true;
        }

        final boolean a()
        {
            return d >= 0;
        }

        public a()
        {
            this((byte)0);
        }

        private a(byte byte0)
        {
            d = -1;
            f = false;
            g = 0;
            a = 0;
            b = 0;
            c = 0x80000000;
            e = null;
        }
    }


    private int a;
    private RecyclerView b;
    private p c;
    private boolean d;
    private boolean e;
    private View f;
    private final a g = new a();

    static void a(a.d d1, int i, int j)
    {
label0:
        {
            RecyclerView recyclerview = d1.b;
            if (!d1.e || d1.a == -1 || recyclerview == null)
            {
                d1.c();
            }
            d1.d = false;
            if (d1.f != null)
            {
                if (RecyclerView.d(d1.f) == d1.a)
                {
                    View view = d1.f;
                    a a2 = recyclerview.e;
                    d1.a(view, d1.g);
                    a.a(d1.g, recyclerview);
                    d1.c();
                } else
                {
                    Log.e("RecyclerView", "Passed over target position while smooth scrolling.");
                    d1.f = null;
                }
            }
            if (d1.e)
            {
                a a1 = recyclerview.e;
                d1.a(i, j, d1.g);
                boolean flag = d1.g.a();
                a.a(d1.g, recyclerview);
                if (flag)
                {
                    if (!d1.e)
                    {
                        break label0;
                    }
                    d1.d = true;
                    RecyclerView.r(recyclerview).a();
                }
            }
            return;
        }
        d1.c();
    }

    protected abstract void a();

    protected abstract void a(int i, int j, a a1);

    final void a(RecyclerView recyclerview, a a1)
    {
        b = recyclerview;
        c = a1;
        if (a == -1)
        {
            throw new IllegalArgumentException("Invalid target position");
        } else
        {
            c(b.e, a);
            e = true;
            d = true;
            int i = a;
            f = RecyclerView.e(b).b(i);
            RecyclerView.r(b).a();
            return;
        }
    }

    protected final void a(View view)
    {
        if (RecyclerView.d(view) == a)
        {
            f = view;
        }
    }

    protected abstract void a(View view, a a1);

    public final a b()
    {
        return c;
    }

    public final void b(int i)
    {
        a = i;
    }

    protected final void c()
    {
        if (!e)
        {
            return;
        } else
        {
            a();
            c(b.e, -1);
            f = null;
            a = -1;
            d = false;
            e = false;
            a(c, this);
            c = null;
            b = null;
            return;
        }
    }

    public final boolean d()
    {
        return d;
    }

    public final boolean e()
    {
        return e;
    }

    public final int f()
    {
        return a;
    }

    public final int g()
    {
        return RecyclerView.e(b).p();
    }

    public a.e()
    {
        a = -1;
    }
}
