// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.app;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.SimpleCursorAdapter;

// Referenced classes of package android.support.v7.app:
//            k, d, b, e, 
//            g, f, j, h

public final class l
{

    private final d a;
    private int b;

    public l(Context context)
    {
        this(context, k.a(context, 0));
    }

    private l(Context context, int i)
    {
        a = new d(new ContextThemeWrapper(context, k.a(context, i)));
        b = i;
    }

    public final Context a()
    {
        return a.a;
    }

    public final l a(android.content.DialogInterface.OnKeyListener onkeylistener)
    {
        a.r = onkeylistener;
        return this;
    }

    public final l a(Drawable drawable)
    {
        a.d = drawable;
        return this;
    }

    public final l a(View view)
    {
        a.g = view;
        return this;
    }

    public final l a(ListAdapter listadapter, android.content.DialogInterface.OnClickListener onclicklistener)
    {
        a.t = listadapter;
        a.u = onclicklistener;
        return this;
    }

    public final l a(CharSequence charsequence)
    {
        a.f = charsequence;
        return this;
    }

    public final k b()
    {
        k k1 = new k(a.a, b);
        d d1 = a;
        b b1 = k.a(k1);
        if (d1.g != null)
        {
            b1.a(d1.g);
        } else
        {
            if (d1.f != null)
            {
                b1.a(d1.f);
            }
            if (d1.d != null)
            {
                b1.a(d1.d);
            }
            if (d1.c != 0)
            {
                b1.b(d1.c);
            }
            if (d1.e != 0)
            {
                b1.b(b1.c(d1.e));
            }
        }
        if (d1.h != null)
        {
            b1.b(d1.h);
        }
        if (d1.i != null)
        {
            b1.a(-1, d1.i, d1.j, null);
        }
        if (d1.k != null)
        {
            b1.a(-2, d1.k, d1.l, null);
        }
        if (d1.m != null)
        {
            b1.a(-3, d1.m, d1.n, null);
        }
        if (d1.s != null || d1.H != null || d1.t != null)
        {
            ListView listview = (ListView)d1.b.inflate(android.support.v7.app.b.i(b1), null);
            Object obj;
            if (d1.D)
            {
                if (d1.H == null)
                {
                    obj = new e(d1, d1.a, android.support.v7.app.b.j(b1), d1.s, listview);
                } else
                {
                    obj = new f(d1, d1.a, d1.H, listview, b1);
                }
            } else
            {
                int i;
                if (d1.E)
                {
                    i = android.support.v7.app.b.k(b1);
                } else
                {
                    i = android.support.v7.app.b.l(b1);
                }
                if (d1.H == null)
                {
                    if (d1.t != null)
                    {
                        obj = d1.t;
                    } else
                    {
                        obj = new j(d1.a, i, d1.s);
                    }
                } else
                {
                    obj = new SimpleCursorAdapter(d1.a, i, d1.H, new String[] {
                        d1.I
                    }, new int[] {
                        0x1020014
                    });
                }
            }
            android.support.v7.app.b.a(b1, ((ListAdapter) (obj)));
            android.support.v7.app.b.a(b1, d1.F);
            if (d1.u != null)
            {
                listview.setOnItemClickListener(new g(d1, b1));
            } else
            if (d1.G != null)
            {
                listview.setOnItemClickListener(new h(d1, listview, b1));
            }
            if (d1.K != null)
            {
                listview.setOnItemSelectedListener(d1.K);
            }
            if (d1.E)
            {
                listview.setChoiceMode(1);
            } else
            if (d1.D)
            {
                listview.setChoiceMode(2);
            }
            android.support.v7.app.b.a(b1, listview);
        }
        if (d1.w != null)
        {
            if (d1.B)
            {
                b1.a(d1.w, d1.x, d1.y, d1.z, d1.A);
            } else
            {
                b1.b(d1.w);
            }
        } else
        if (d1.v != 0)
        {
            b1.a(d1.v);
        }
        k1.setCancelable(a.o);
        if (a.o)
        {
            k1.setCanceledOnTouchOutside(true);
        }
        k1.setOnCancelListener(a.p);
        k1.setOnDismissListener(a.q);
        if (a.r != null)
        {
            k1.setOnKeyListener(a.r);
        }
        return k1;
    }
}
