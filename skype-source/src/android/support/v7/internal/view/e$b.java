// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.v4.view.d;
import android.support.v4.view.k;
import android.support.v7.internal.view.menu.h;
import android.support.v7.internal.view.menu.i;
import android.util.AttributeSet;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import java.lang.reflect.Constructor;

// Referenced classes of package android.support.v7.internal.view:
//            e

private final class a
{

    final e a;
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
    private d z;

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

    static d a(a a1)
    {
        return a1.z;
    }

    private Object a(String s1, Class aclass[], Object aobj[])
    {
        try
        {
            aclass = android.support.v7.internal.view.e.a(a).getClassLoader().loadClass(s1).getConstructor(aclass);
            aclass.setAccessible(true);
            aclass = ((Class []) (aclass.newInstance(aobj)));
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
            android.support.v4.view.k.a(menuitem, u);
        }
        if (y != null)
        {
            if (android.support.v7.internal.view.e.a(a).isRestricted())
            {
                throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
            }
            menuitem.setOnMenuItemClickListener(new <init>(android.support.v7.internal.view.e.c(a), y));
        }
        boolean flag;
        if (q >= 2)
        {
            if (menuitem instanceof h)
            {
                ((h)menuitem).a(true);
            } else
            if (menuitem instanceof i)
            {
                ((i)menuitem).b();
            }
        }
        flag = false;
        if (w != null)
        {
            android.support.v4.view.k.a(menuitem, (View)a(w, android.support.v7.internal.view.e.b(), android.support.v7.internal.view.e.d(a)));
            flag = true;
        }
        if (v > 0)
        {
            if (!flag)
            {
                android.support.v4.view.k.b(menuitem, v);
            } else
            {
                Log.w("SupportMenuInflater", "Ignoring attribute 'itemActionViewLayout'. Action view already specified.");
            }
        }
        if (z != null)
        {
            android.support.v4.view.k.a(menuitem, z);
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
        attributeset = android.support.v7.internal.view.e.a(a).obtainStyledAttributes(attributeset, android.support.v7.appcompat.MenuGroup);
        c = attributeset.getResourceId(android.support.v7.appcompat.MenuGroup_android_id, 0);
        d = attributeset.getInt(android.support.v7.appcompat.MenuGroup_android_menuCategory, 0);
        e = attributeset.getInt(android.support.v7.appcompat.MenuGroup_android_orderInCategory, 0);
        f = attributeset.getInt(android.support.v7.appcompat.MenuGroup_android_checkableBehavior, 0);
        g = attributeset.getBoolean(android.support.v7.appcompat.MenuGroup_android_visible, true);
        h = attributeset.getBoolean(android.support.v7.appcompat.MenuGroup_android_enabled, true);
        attributeset.recycle();
    }

    public final void b()
    {
        i = true;
        a(b.add(c, j, k, l));
    }

    public final void b(AttributeSet attributeset)
    {
        attributeset = android.support.v7.internal.view.e.a(a).obtainStyledAttributes(attributeset, android.support.v7.appcompat.MenuItem);
        j = attributeset.getResourceId(android.support.v7.appcompat.MenuItem_android_id, 0);
        k = 0xffff0000 & attributeset.getInt(android.support.v7.appcompat.MenuItem_android_menuCategory, d) | 0xffff & attributeset.getInt(android.support.v7.appcompat.MenuItem_android_orderInCategory, e);
        l = attributeset.getText(android.support.v7.appcompat.MenuItem_android_title);
        m = attributeset.getText(android.support.v7.appcompat.MenuItem_android_titleCondensed);
        n = attributeset.getResourceId(android.support.v7.appcompat.MenuItem_android_icon, 0);
        o = a(attributeset.getString(android.support.v7.appcompat.MenuItem_android_alphabeticShortcut));
        p = a(attributeset.getString(android.support.v7.appcompat.MenuItem_android_numericShortcut));
        int i1;
        if (attributeset.hasValue(android.support.v7.appcompat.MenuItem_android_checkable))
        {
            if (attributeset.getBoolean(android.support.v7.appcompat.MenuItem_android_checkable, false))
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
        r = attributeset.getBoolean(android.support.v7.appcompat.MenuItem_android_checked, false);
        s = attributeset.getBoolean(android.support.v7.appcompat.MenuItem_android_visible, g);
        t = attributeset.getBoolean(android.support.v7.appcompat.MenuItem_android_enabled, h);
        u = attributeset.getInt(android.support.v7.appcompat.MenuItem_showAsAction, -1);
        y = attributeset.getString(android.support.v7.appcompat.MenuItem_android_onClick);
        v = attributeset.getResourceId(android.support.v7.appcompat.MenuItem_actionLayout, 0);
        w = attributeset.getString(android.support.v7.appcompat.MenuItem_actionViewClass);
        x = attributeset.getString(android.support.v7.appcompat.MenuItem_actionProviderClass);
        if (x != null)
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        if (i1 != 0 && v == 0 && w == null)
        {
            z = (d)a(x, android.support.v7.internal.view.e.a(), android.support.v7.internal.view.e.b(a));
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

    public .i(e e1, Menu menu)
    {
        a = e1;
        super();
        b = menu;
        a();
    }
}
