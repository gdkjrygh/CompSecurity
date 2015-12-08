// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.util.Log;
import android.view.View;

// Referenced classes of package android.support.v7.widget:
//            be, RecyclerView, bf, au, 
//            bh

public abstract class bd
{

    private int a;
    private RecyclerView b;
    private au c;
    private boolean d;
    private boolean e;
    private View f;
    private final be g = new be();

    public bd()
    {
        a = -1;
    }

    static void a(bd bd1, int i, int j)
    {
        if (!bd1.e || bd1.a == -1)
        {
            bd1.c();
        }
        bd1.d = false;
        if (bd1.f != null)
        {
            if (RecyclerView.d(bd1.f) == bd1.a)
            {
                View view = bd1.f;
                bf bf2 = bd1.b.e;
                bd1.a(view, bd1.g);
                be.a(bd1.g, bd1.b);
                bd1.c();
            } else
            {
                Log.e("RecyclerView", "Passed over target position while smooth scrolling.");
                bd1.f = null;
            }
        }
        if (bd1.e)
        {
            bf bf1 = bd1.b.e;
            bd1.a(i, j, bd1.g);
            be.a(bd1.g, bd1.b);
        }
    }

    protected abstract void a();

    protected abstract void a(int i, int j, be be1);

    final void a(RecyclerView recyclerview, au au1)
    {
        b = recyclerview;
        c = au1;
        if (a == -1)
        {
            throw new IllegalArgumentException("Invalid target position");
        } else
        {
            bf.c(b.e, a);
            e = true;
            d = true;
            int i = a;
            f = RecyclerView.e(b).a(i);
            RecyclerView.w(b).a();
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

    protected abstract void a(View view, be be1);

    public final au b()
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
            bf.c(b.e, -1);
            f = null;
            a = -1;
            d = false;
            e = false;
            au.a(c, this);
            c = null;
            b = null;
            return;
        }
    }

    public final void c(int i)
    {
        b.a_(i);
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
        return RecyclerView.e(b).r();
    }
}
