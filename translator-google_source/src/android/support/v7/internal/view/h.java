// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.view;

import android.content.Context;
import android.support.v4.b.a.b;
import android.support.v4.view.an;
import android.support.v4.view.n;
import android.support.v7.internal.view.menu.MenuItemWrapperICS;
import android.support.v7.internal.view.menu.m;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

// Referenced classes of package android.support.v7.internal.view:
//            f, g

final class h
{

    Menu a;
    int b;
    int c;
    int d;
    int e;
    boolean f;
    boolean g;
    boolean h;
    int i;
    int j;
    CharSequence k;
    CharSequence l;
    int m;
    char n;
    char o;
    int p;
    boolean q;
    boolean r;
    boolean s;
    int t;
    int u;
    String v;
    String w;
    String x;
    n y;
    final f z;

    public h(f f1, Menu menu)
    {
        z = f1;
        super();
        a = menu;
        a();
    }

    static char a(String s1)
    {
        if (s1 == null)
        {
            return '\0';
        } else
        {
            return s1.charAt(0);
        }
    }

    final Object a(String s1, Class aclass[], Object aobj[])
    {
        try
        {
            s1 = android.support.v7.internal.view.f.a(z).getClassLoader().loadClass(s1).getConstructor(aclass);
            s1.setAccessible(true);
            s1 = ((String) (s1.newInstance(aobj)));
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            return null;
        }
        return s1;
    }

    public final void a()
    {
        b = 0;
        c = 0;
        d = 0;
        e = 0;
        f = true;
        g = true;
    }

    final void a(MenuItem menuitem)
    {
        boolean flag = true;
        MenuItem menuitem1 = menuitem.setChecked(q).setVisible(r).setEnabled(s);
        boolean flag1;
        if (p > 0)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        menuitem1.setCheckable(flag1).setTitleCondensed(l).setIcon(m).setAlphabeticShortcut(n).setNumericShortcut(o);
        if (t >= 0)
        {
            an.a(menuitem, t);
        }
        if (x != null)
        {
            if (android.support.v7.internal.view.f.a(z).isRestricted())
            {
                throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
            }
            menuitem.setOnMenuItemClickListener(new g(android.support.v7.internal.view.f.b(z), x));
        }
        if (p >= 2)
        {
            if (menuitem instanceof m)
            {
                ((m)menuitem).a(true);
            } else
            if (menuitem instanceof MenuItemWrapperICS)
            {
                MenuItemWrapperICS menuitemwrapperics = (MenuItemWrapperICS)menuitem;
                try
                {
                    if (menuitemwrapperics.e == null)
                    {
                        menuitemwrapperics.e = ((b)menuitemwrapperics.d).getClass().getDeclaredMethod("setExclusiveCheckable", new Class[] {
                            Boolean.TYPE
                        });
                    }
                    menuitemwrapperics.e.invoke(menuitemwrapperics.d, new Object[] {
                        Boolean.valueOf(true)
                    });
                }
                catch (Exception exception) { }
            }
        }
        if (v != null)
        {
            an.a(menuitem, (View)a(v, android.support.v7.internal.view.f.a(), android.support.v7.internal.view.f.c(z)));
        } else
        {
            flag = false;
        }
        if (u > 0 && !flag)
        {
            an.b(menuitem, u);
        }
        if (y != null)
        {
            an.a(menuitem, y);
        }
    }

    public final SubMenu b()
    {
        h = true;
        SubMenu submenu = a.addSubMenu(b, i, j, k);
        a(submenu.getItem());
        return submenu;
    }
}
