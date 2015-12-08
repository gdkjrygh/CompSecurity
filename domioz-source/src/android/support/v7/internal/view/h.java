// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.v4.view.as;
import android.support.v4.view.n;
import android.support.v7.a.l;
import android.support.v7.internal.view.menu.m;
import android.support.v7.internal.view.menu.o;
import android.util.AttributeSet;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import java.lang.reflect.Constructor;

// Referenced classes of package android.support.v7.internal.view:
//            f, g

final class h
{

    final f a;
    private Menu b;
    private int c;
    private int d;
    private int e;
    private int f;
    private boolean g;
    private boolean h;
    private boolean i;
    private int j;
    private int k;
    private CharSequence l;
    private CharSequence m;
    private int n;
    private char o;
    private char p;
    private int q;
    private boolean r;
    private boolean s;
    private boolean t;
    private int u;
    private int v;
    private String w;
    private String x;
    private String y;
    private n z;

    public h(f f1, Menu menu)
    {
        a = f1;
        super();
        b = menu;
        a();
    }

    private static char a(String s1)
    {
        if (s1 == null)
        {
            return '\0';
        } else
        {
            return s1.charAt(0);
        }
    }

    static n a(h h1)
    {
        return h1.z;
    }

    private Object a(String s1, Class aclass[], Object aobj[])
    {
        try
        {
            aclass = ((Class []) (android.support.v7.internal.view.f.a(a).getClassLoader().loadClass(s1).getConstructor(aclass).newInstance(aobj)));
        }
        // Misplaced declaration of an exception variable
        catch (Class aclass[])
        {
            Log.w("SupportMenuInflater", (new StringBuilder("Cannot instantiate class: ")).append(s1).toString(), aclass);
            return null;
        }
        return aclass;
    }

    private void a(MenuItem menuitem)
    {
        boolean flag = true;
        MenuItem menuitem1 = menuitem.setChecked(r).setVisible(s).setEnabled(t);
        boolean flag1;
        if (q > 0)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        menuitem1.setCheckable(flag1).setTitleCondensed(m).setIcon(n).setAlphabeticShortcut(o).setNumericShortcut(p);
        if (u >= 0)
        {
            as.a(menuitem, u);
        }
        if (y != null)
        {
            if (android.support.v7.internal.view.f.a(a).isRestricted())
            {
                throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
            }
            menuitem.setOnMenuItemClickListener(new g(android.support.v7.internal.view.f.c(a), y));
        }
        if (q >= 2)
        {
            if (menuitem instanceof m)
            {
                ((m)menuitem).a(true);
            } else
            if (menuitem instanceof o)
            {
                ((o)menuitem).b();
            }
        }
        if (w != null)
        {
            as.a(menuitem, (View)a(w, android.support.v7.internal.view.f.b(), android.support.v7.internal.view.f.d(a)));
        } else
        {
            flag = false;
        }
        if (v > 0)
        {
            if (!flag)
            {
                as.b(menuitem, v);
            } else
            {
                Log.w("SupportMenuInflater", "Ignoring attribute 'itemActionViewLayout'. Action view already specified.");
            }
        }
        if (z != null)
        {
            as.a(menuitem, z);
        }
    }

    public final void a()
    {
        c = 0;
        d = 0;
        e = 0;
        f = 0;
        g = true;
        h = true;
    }

    public final void a(AttributeSet attributeset)
    {
        attributeset = android.support.v7.internal.view.f.a(a).obtainStyledAttributes(attributeset, l.ah);
        c = attributeset.getResourceId(l.ak, 0);
        d = attributeset.getInt(l.al, 0);
        e = attributeset.getInt(l.am, 0);
        f = attributeset.getInt(l.ai, 0);
        g = attributeset.getBoolean(l.an, true);
        h = attributeset.getBoolean(l.aj, true);
        attributeset.recycle();
    }

    public final void b()
    {
        i = true;
        a(b.add(c, j, k, l));
    }

    public final void b(AttributeSet attributeset)
    {
        boolean flag = true;
        attributeset = android.support.v7.internal.view.f.a(a).obtainStyledAttributes(attributeset, l.ao);
        j = attributeset.getResourceId(l.ax, 0);
        k = attributeset.getInt(l.ay, d) & 0xffff0000 | attributeset.getInt(l.aB, e) & 0xffff;
        l = attributeset.getText(l.aC);
        m = attributeset.getText(l.aD);
        n = attributeset.getResourceId(l.aw, 0);
        o = a(attributeset.getString(l.as));
        p = a(attributeset.getString(l.az));
        int i1;
        if (attributeset.hasValue(l.at))
        {
            if (attributeset.getBoolean(l.at, false))
            {
                i1 = 1;
            } else
            {
                i1 = 0;
            }
            q = i1;
        } else
        {
            q = f;
        }
        r = attributeset.getBoolean(l.au, false);
        s = attributeset.getBoolean(l.aE, g);
        t = attributeset.getBoolean(l.av, h);
        u = attributeset.getInt(l.aF, -1);
        y = attributeset.getString(l.aA);
        v = attributeset.getResourceId(l.ap, 0);
        w = attributeset.getString(l.ar);
        x = attributeset.getString(l.aq);
        if (x != null)
        {
            i1 = ((flag) ? 1 : 0);
        } else
        {
            i1 = 0;
        }
        if (i1 != 0 && v == 0 && w == null)
        {
            z = (n)a(x, android.support.v7.internal.view.f.a(), android.support.v7.internal.view.f.b(a));
        } else
        {
            if (i1 != 0)
            {
                Log.w("SupportMenuInflater", "Ignoring attribute 'actionProviderClass'. Action view already specified.");
            }
            z = null;
        }
        attributeset.recycle();
        i = false;
    }

    public final SubMenu c()
    {
        i = true;
        SubMenu submenu = b.addSubMenu(c, j, k, l);
        a(submenu.getItem());
        return submenu;
    }

    public final boolean d()
    {
        return i;
    }
}
