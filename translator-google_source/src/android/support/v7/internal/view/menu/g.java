// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.view.menu;

import android.content.Context;
import android.support.v7.a.i;
import android.support.v7.app.d;
import android.support.v7.app.f;
import android.support.v7.app.h;
import android.support.v7.app.j;
import android.support.v7.app.l;
import android.support.v7.app.m;
import android.support.v7.app.n;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.SimpleCursorAdapter;
import android.widget.TextView;

// Referenced classes of package android.support.v7.internal.view.menu:
//            v, h, w, ab, 
//            l, i, ExpandedMenuView, m

public final class g
    implements v, android.widget.AdapterView.OnItemClickListener
{

    Context a;
    public LayoutInflater b;
    android.support.v7.internal.view.menu.i c;
    public ExpandedMenuView d;
    int e;
    int f;
    public w g;
    public android.support.v7.internal.view.menu.h h;
    private int i;

    private g(int k)
    {
        f = k;
        e = 0;
    }

    public g(Context context, int k)
    {
        this(k);
        a = context;
        b = LayoutInflater.from(a);
    }

    static int a(g g1)
    {
        return g1.i;
    }

    public final void a(Context context, android.support.v7.internal.view.menu.i k)
    {
        if (e == 0) goto _L2; else goto _L1
_L1:
        a = new ContextThemeWrapper(context, e);
        b = LayoutInflater.from(a);
_L4:
        c = k;
        if (h != null)
        {
            h.notifyDataSetChanged();
        }
        return;
_L2:
        if (a != null)
        {
            a = context;
            if (b == null)
            {
                b = LayoutInflater.from(a);
            }
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public final void a(android.support.v7.internal.view.menu.i k, boolean flag)
    {
        if (g != null)
        {
            g.a(k, flag);
        }
    }

    public final boolean a()
    {
        return false;
    }

    public final boolean a(ab ab1)
    {
        if (!ab1.hasVisibleItems())
        {
            return false;
        }
        android.support.v7.internal.view.menu.l l1 = new android.support.v7.internal.view.menu.l(ab1);
        Object obj = l1.a;
        n n1 = new n(((android.support.v7.internal.view.menu.i) (obj)).a);
        l1.c = new g(n1.a.a, i.abc_list_menu_item_layout);
        l1.c.g = l1;
        l1.a.a(l1.c);
        Object obj1 = l1.c.b();
        n1.a.t = ((ListAdapter) (obj1));
        n1.a.u = l1;
        obj1 = ((android.support.v7.internal.view.menu.i) (obj)).h;
        f f1;
        d d1;
        if (obj1 != null)
        {
            n1.a.g = ((View) (obj1));
        } else
        {
            android.graphics.drawable.Drawable drawable = ((android.support.v7.internal.view.menu.i) (obj)).g;
            n1.a.d = drawable;
            obj = ((android.support.v7.internal.view.menu.i) (obj)).f;
            n1.a.f = ((CharSequence) (obj));
        }
        n1.a.r = l1;
        obj1 = new m(n1.a.a, n1.b);
        f1 = n1.a;
        d1 = m.a(((m) (obj1)));
        if (f1.g != null)
        {
            d1.C = f1.g;
        } else
        {
            if (f1.f != null)
            {
                d1.a(f1.f);
            }
            if (f1.d != null)
            {
                obj = f1.d;
                d1.y = ((android.graphics.drawable.Drawable) (obj));
                d1.x = 0;
                int i1;
                if (d1.z != null)
                {
                    if (obj != null)
                    {
                        d1.z.setImageDrawable(((android.graphics.drawable.Drawable) (obj)));
                    } else
                    {
                        d1.z.setVisibility(8);
                    }
                }
            }
            if (f1.c != 0)
            {
                d1.a(f1.c);
            }
            if (f1.e != 0)
            {
                i1 = f1.e;
                obj = new TypedValue();
                d1.a.getTheme().resolveAttribute(i1, ((TypedValue) (obj)), true);
                d1.a(((TypedValue) (obj)).resourceId);
            }
        }
        if (f1.h != null)
        {
            obj = f1.h;
            d1.e = ((CharSequence) (obj));
            if (d1.B != null)
            {
                d1.B.setText(((CharSequence) (obj)));
            }
        }
        if (f1.i != null)
        {
            d1.a(-1, f1.i, f1.j, null);
        }
        if (f1.k != null)
        {
            d1.a(-2, f1.k, f1.l, null);
        }
        if (f1.m != null)
        {
            d1.a(-3, f1.m, f1.n, null);
        }
        if (f1.s != null || f1.H != null || f1.t != null)
        {
            ListView listview = (ListView)f1.b.inflate(d1.H, null);
            int k;
            int i2;
            int j2;
            int k2;
            if (f1.D)
            {
                if (f1.H == null)
                {
                    obj = new android.support.v7.app.g(f1, f1.a, d1.I, f1.s, listview);
                } else
                {
                    obj = new h(f1, f1.a, f1.H, listview, d1);
                }
            } else
            {
                int j1;
                if (f1.E)
                {
                    j1 = d1.J;
                } else
                {
                    j1 = d1.K;
                }
                if (f1.H == null)
                {
                    if (f1.t != null)
                    {
                        obj = f1.t;
                    } else
                    {
                        obj = new l(f1.a, j1, f1.s);
                    }
                } else
                {
                    obj = new SimpleCursorAdapter(f1.a, j1, f1.H, new String[] {
                        f1.I
                    }, new int[] {
                        0x1020014
                    });
                }
            }
            d1.D = ((ListAdapter) (obj));
            d1.E = f1.F;
            if (f1.u != null)
            {
                listview.setOnItemClickListener(new android.support.v7.app.i(f1, d1));
            } else
            if (f1.G != null)
            {
                listview.setOnItemClickListener(new j(f1, listview, d1));
            }
            if (f1.K != null)
            {
                listview.setOnItemSelectedListener(f1.K);
            }
            if (f1.E)
            {
                listview.setChoiceMode(1);
            } else
            if (f1.D)
            {
                listview.setChoiceMode(2);
            }
            d1.f = listview;
        }
        if (f1.w != null)
        {
            if (f1.B)
            {
                obj = f1.w;
                k = f1.x;
                i2 = f1.y;
                j2 = f1.z;
                k2 = f1.A;
                d1.g = ((View) (obj));
                d1.h = 0;
                d1.m = true;
                d1.i = k;
                d1.j = i2;
                d1.k = j2;
                d1.l = k2;
            } else
            {
                d1.g = f1.w;
                d1.h = 0;
                d1.m = false;
            }
        } else
        if (f1.v != 0)
        {
            int k1 = f1.v;
            d1.g = null;
            d1.h = k1;
            d1.m = false;
        }
        ((m) (obj1)).setCancelable(n1.a.o);
        if (n1.a.o)
        {
            ((m) (obj1)).setCanceledOnTouchOutside(true);
        }
        ((m) (obj1)).setOnCancelListener(n1.a.p);
        ((m) (obj1)).setOnDismissListener(n1.a.q);
        if (n1.a.r != null)
        {
            ((m) (obj1)).setOnKeyListener(n1.a.r);
        }
        l1.b = ((m) (obj1));
        l1.b.setOnDismissListener(l1);
        obj = l1.b.getWindow().getAttributes();
        obj.type = 1003;
        obj.flags = ((android.view.WindowManager.LayoutParams) (obj)).flags | 0x20000;
        l1.b.show();
        if (g != null)
        {
            g.a_(ab1);
        }
        return true;
    }

    public final ListAdapter b()
    {
        if (h == null)
        {
            h = new android.support.v7.internal.view.menu.h(this);
        }
        return h;
    }

    public final void b(boolean flag)
    {
        if (h != null)
        {
            h.notifyDataSetChanged();
        }
    }

    public final boolean b(android.support.v7.internal.view.menu.m m1)
    {
        return false;
    }

    public final boolean c(android.support.v7.internal.view.menu.m m1)
    {
        return false;
    }

    public final void onItemClick(AdapterView adapterview, View view, int k, long l1)
    {
        c.a(h.a(k), this, 0);
    }
}
