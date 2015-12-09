// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.v4.view.as;
import android.support.v4.view.n;
import android.support.v7.b.k;
import android.support.v7.internal.view.menu.j;
import android.support.v7.internal.view.menu.l;
import android.util.AttributeSet;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import java.lang.reflect.Constructor;

// Referenced classes of package android.support.v7.internal.view:
//            c, d

class e
{

    final c a;
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

    public e(c c1, Menu menu)
    {
        a = c1;
        super();
        b = menu;
        a();
    }

    private char a(String s1)
    {
        if (s1 == null)
        {
            return '\0';
        } else
        {
            return s1.charAt(0);
        }
    }

    static n a(e e1)
    {
        return e1.z;
    }

    private Object a(String s1, Class aclass[], Object aobj[])
    {
        try
        {
            aclass = android.support.v7.internal.view.c.a(a).getClassLoader().loadClass(s1).getConstructor(aclass);
            aclass.setAccessible(true);
            aclass = ((Class []) (aclass.newInstance(aobj)));
        }
        // Misplaced declaration of an exception variable
        catch (Class aclass[])
        {
            Log.w("SupportMenuInflater", (new StringBuilder()).append("Cannot instantiate class: ").append(s1).toString(), aclass);
            return null;
        }
        return aclass;
    }

    private void a(MenuItem menuitem)
    {
        boolean flag = true;
        Object obj = menuitem.setChecked(r).setVisible(s).setEnabled(t);
        boolean flag1;
        if (q >= 1)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        ((MenuItem) (obj)).setCheckable(flag1).setTitleCondensed(m).setIcon(n).setAlphabeticShortcut(o).setNumericShortcut(p);
        if (u >= 0)
        {
            as.a(menuitem, u);
        }
        if (y != null)
        {
            if (android.support.v7.internal.view.c.a(a).isRestricted())
            {
                throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
            }
            menuitem.setOnMenuItemClickListener(new d(android.support.v7.internal.view.c.c(a), y));
        }
        if (menuitem instanceof j)
        {
            obj = (j)menuitem;
        }
        if (q >= 2)
        {
            if (menuitem instanceof j)
            {
                ((j)menuitem).a(true);
            } else
            if (menuitem instanceof l)
            {
                ((l)menuitem).a(true);
            }
        }
        if (w != null)
        {
            as.a(menuitem, (View)a(w, android.support.v7.internal.view.c.b(), android.support.v7.internal.view.c.d(a)));
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

    public void a()
    {
        c = 0;
        d = 0;
        e = 0;
        f = 0;
        g = true;
        h = true;
    }

    public void a(AttributeSet attributeset)
    {
        attributeset = android.support.v7.internal.view.c.a(a).obtainStyledAttributes(attributeset, k.MenuGroup);
        c = attributeset.getResourceId(k.MenuGroup_android_id, 0);
        d = attributeset.getInt(k.MenuGroup_android_menuCategory, 0);
        e = attributeset.getInt(k.MenuGroup_android_orderInCategory, 0);
        f = attributeset.getInt(k.MenuGroup_android_checkableBehavior, 0);
        g = attributeset.getBoolean(k.MenuGroup_android_visible, true);
        h = attributeset.getBoolean(k.MenuGroup_android_enabled, true);
        attributeset.recycle();
    }

    public void b()
    {
        i = true;
        a(b.add(c, j, k, l));
    }

    public void b(AttributeSet attributeset)
    {
        boolean flag = true;
        attributeset = android.support.v7.internal.view.c.a(a).obtainStyledAttributes(attributeset, k.MenuItem);
        j = attributeset.getResourceId(k.MenuItem_android_id, 0);
        k = attributeset.getInt(k.MenuItem_android_menuCategory, d) & 0xffff0000 | attributeset.getInt(k.MenuItem_android_orderInCategory, e) & 0xffff;
        l = attributeset.getText(k.MenuItem_android_title);
        m = attributeset.getText(k.MenuItem_android_titleCondensed);
        n = attributeset.getResourceId(k.MenuItem_android_icon, 0);
        o = a(attributeset.getString(k.MenuItem_android_alphabeticShortcut));
        p = a(attributeset.getString(k.MenuItem_android_numericShortcut));
        int i1;
        if (attributeset.hasValue(k.MenuItem_android_checkable))
        {
            if (attributeset.getBoolean(k.MenuItem_android_checkable, false))
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
        r = attributeset.getBoolean(k.MenuItem_android_checked, false);
        s = attributeset.getBoolean(k.MenuItem_android_visible, g);
        t = attributeset.getBoolean(k.MenuItem_android_enabled, h);
        u = attributeset.getInt(k.MenuItem_showAsAction, -1);
        y = attributeset.getString(k.MenuItem_android_onClick);
        v = attributeset.getResourceId(k.MenuItem_actionLayout, 0);
        w = attributeset.getString(k.MenuItem_actionViewClass);
        x = attributeset.getString(k.MenuItem_actionProviderClass);
        if (x != null)
        {
            i1 = ((flag) ? 1 : 0);
        } else
        {
            i1 = 0;
        }
        if (i1 != 0 && v == 0 && w == null)
        {
            z = (n)a(x, android.support.v7.internal.view.c.a(), android.support.v7.internal.view.c.b(a));
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

    public SubMenu c()
    {
        i = true;
        SubMenu submenu = b.addSubMenu(c, j, k, l);
        a(submenu.getItem());
        return submenu;
    }

    public boolean d()
    {
        return i;
    }
}
