// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.view.View;
import android.view.animation.Interpolator;

// Referenced classes of package android.support.v7.widget:
//            RecyclerView

public static abstract class a
{
    public static final class a
    {

        public int a;
        private int b;
        private int c;
        private int d;
        private Interpolator e;
        private boolean f;
        private int g;

        static void a(a a1, RecyclerView recyclerview)
        {
            if (a1.a >= 0)
            {
                int i = a1.a;
                a1.a = -1;
                RecyclerView.c(recyclerview, i);
                a1.f = false;
                return;
            }
            if (a1.f)
            {
                if (a1.e != null && a1.d <= 0)
                {
                    throw new IllegalStateException("If you provide an interpolator, you must set a positive duration");
                }
                if (a1.d <= 0)
                {
                    throw new IllegalStateException("Scroll duration must be a positive number");
                }
                if (a1.e == null)
                {
                    if (a1.d == 0x80000000)
                    {
                        RecyclerView.w(recyclerview).a(a1.b, a1.c);
                    } else
                    {
                        RecyclerView.w(recyclerview).a(a1.b, a1.c, a1.d);
                    }
                } else
                {
                    RecyclerView.w(recyclerview).a(a1.b, a1.c, a1.d, a1.e);
                }
                a1.g = a1.g + 1;
                a1.f = false;
                return;
            } else
            {
                a1.g = 0;
                return;
            }
        }

        public final void a(int i, int j, int k, Interpolator interpolator)
        {
            b = i;
            c = j;
            d = k;
            e = interpolator;
            f = true;
        }

        public a()
        {
            this((byte)0);
        }

        private a(byte byte0)
        {
            a = -1;
            f = false;
            g = 0;
            b = 0;
            c = 0;
            d = 0x80000000;
            e = null;
        }
    }


    public int a;
    public RecyclerView b;
    public b c;
    boolean d;
    boolean e;
    View f;
    private final a g = new a();

    static void a(a.f f1, int i, int j)
    {
label0:
        {
            boolean flag = false;
            RecyclerView recyclerview = f1.b;
            if (!f1.e || f1.a == -1 || recyclerview == null)
            {
                f1.b();
            }
            f1.d = false;
            if (f1.f != null)
            {
                if (RecyclerView.d(f1.f) == f1.a)
                {
                    View view = f1.f;
                    a a2 = recyclerview.o;
                    f1.a(view, f1.g);
                    a.a(f1.g, recyclerview);
                    f1.b();
                } else
                {
                    f1.f = null;
                }
            }
            if (f1.e)
            {
                a a1 = recyclerview.o;
                f1.a(i, j, f1.g);
                i = ((flag) ? 1 : 0);
                if (f1.g.a >= 0)
                {
                    i = 1;
                }
                a.a(f1.g, recyclerview);
                if (i != 0)
                {
                    if (!f1.e)
                    {
                        break label0;
                    }
                    f1.d = true;
                    RecyclerView.w(recyclerview).a();
                }
            }
            return;
        }
        f1.b();
    }

    public abstract void a();

    public abstract void a(int i, int j, a a1);

    public abstract void a(View view, a a1);

    public final void b()
    {
        if (!e)
        {
            return;
        } else
        {
            a();
            b.o.a = -1;
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

    public a.e()
    {
        a = -1;
    }
}
