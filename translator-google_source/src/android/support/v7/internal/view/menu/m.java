// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.view.menu;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.support.v4.b.a.b;
import android.support.v4.view.as;
import android.support.v4.view.n;
import android.support.v7.internal.widget.al;
import android.view.ActionProvider;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.widget.LinearLayout;
import java.util.ArrayList;

// Referenced classes of package android.support.v7.internal.view.menu:
//            i, n, y, ab

public final class m
    implements b
{

    static String f;
    static String g;
    static String h;
    static String i;
    final int a;
    i b;
    int c;
    public n d;
    android.view.ContextMenu.ContextMenuInfo e;
    private final int j;
    private final int k;
    private final int l;
    private CharSequence m;
    private CharSequence n;
    private Intent o;
    private char p;
    private char q;
    private Drawable r;
    private int s;
    private ab t;
    private Runnable u;
    private android.view.MenuItem.OnMenuItemClickListener v;
    private int w;
    private View x;
    private as y;
    private boolean z;

    m(i i1, int j1, int k1, int l1, int i2, CharSequence charsequence, int j2)
    {
        s = 0;
        w = 16;
        c = 0;
        z = false;
        b = i1;
        j = k1;
        k = j1;
        l = l1;
        a = i2;
        m = charsequence;
        c = j2;
    }

    private b a(View view)
    {
        x = view;
        d = null;
        if (view != null && view.getId() == -1 && j > 0)
        {
            view.setId(j);
        }
        b.g();
        return this;
    }

    static i a(m m1)
    {
        return m1.b;
    }

    private void e(boolean flag)
    {
        int i1 = w;
        int j1 = w;
        byte byte0;
        if (flag)
        {
            byte0 = 2;
        } else
        {
            byte0 = 0;
        }
        w = byte0 | j1 & -3;
        if (i1 != w)
        {
            b.b(false);
        }
    }

    public final b a(as as1)
    {
        y = as1;
        return this;
    }

    public final b a(n n1)
    {
        if (d != null)
        {
            n n2 = d;
            n2.b = null;
            n2.a = null;
        }
        x = null;
        d = n1;
        b.b(true);
        if (d != null)
        {
            d.a(new android.support.v7.internal.view.menu.n(this));
        }
        return this;
    }

    public final n a()
    {
        return d;
    }

    final CharSequence a(y y1)
    {
        if (y1 != null && y1.a())
        {
            return getTitleCondensed();
        } else
        {
            return getTitle();
        }
    }

    public final void a(ab ab1)
    {
        t = ab1;
        ab1.setHeaderTitle(getTitle());
    }

    public final void a(boolean flag)
    {
        int i1 = w;
        byte byte0;
        if (flag)
        {
            byte0 = 4;
        } else
        {
            byte0 = 0;
        }
        w = byte0 | i1 & -5;
    }

    public final boolean b()
    {
_L2:
        return true;
        if (v != null && v.onMenuItemClick(this) || b.a(b.k(), this)) goto _L2; else goto _L1
_L1:
        if (u != null)
        {
            u.run();
            return true;
        }
        if (o == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        b.a.startActivity(o);
        return true;
        ActivityNotFoundException activitynotfoundexception;
        activitynotfoundexception;
        if (d != null && d.d()) goto _L2; else goto _L3
_L3:
        return false;
    }

    final boolean b(boolean flag)
    {
        boolean flag1 = false;
        int i1 = w;
        int j1 = w;
        byte byte0;
        if (flag)
        {
            byte0 = 0;
        } else
        {
            byte0 = 8;
        }
        w = byte0 | j1 & -9;
        flag = flag1;
        if (i1 != w)
        {
            flag = true;
        }
        return flag;
    }

    final char c()
    {
        if (b.b())
        {
            return q;
        } else
        {
            return p;
        }
    }

    public final void c(boolean flag)
    {
        if (flag)
        {
            w = w | 0x20;
            return;
        } else
        {
            w = w & 0xffffffdf;
            return;
        }
    }

    public final boolean collapseActionView()
    {
        if ((c & 8) != 0)
        {
            if (x == null)
            {
                return true;
            }
            if (y == null || y.b(this))
            {
                return b.b(this);
            }
        }
        return false;
    }

    public final void d(boolean flag)
    {
        z = flag;
        b.b(false);
    }

    final boolean d()
    {
        return b.c() && c() != 0;
    }

    public final boolean e()
    {
        return (w & 4) != 0;
    }

    public final boolean expandActionView()
    {
        while (!i() || y != null && !y.a(this)) 
        {
            return false;
        }
        return b.a(this);
    }

    public final boolean f()
    {
        return (w & 0x20) == 32;
    }

    public final boolean g()
    {
        return (c & 1) == 1;
    }

    public final ActionProvider getActionProvider()
    {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    public final View getActionView()
    {
        if (x != null)
        {
            return x;
        }
        if (d != null)
        {
            x = d.a(this);
            return x;
        } else
        {
            return null;
        }
    }

    public final char getAlphabeticShortcut()
    {
        return q;
    }

    public final int getGroupId()
    {
        return k;
    }

    public final Drawable getIcon()
    {
        if (r != null)
        {
            return r;
        }
        if (s != 0)
        {
            Drawable drawable = al.a(b.a, s);
            s = 0;
            r = drawable;
            return drawable;
        } else
        {
            return null;
        }
    }

    public final Intent getIntent()
    {
        return o;
    }

    public final int getItemId()
    {
        return j;
    }

    public final android.view.ContextMenu.ContextMenuInfo getMenuInfo()
    {
        return e;
    }

    public final char getNumericShortcut()
    {
        return p;
    }

    public final int getOrder()
    {
        return l;
    }

    public final SubMenu getSubMenu()
    {
        return t;
    }

    public final CharSequence getTitle()
    {
        return m;
    }

    public final CharSequence getTitleCondensed()
    {
        CharSequence charsequence;
        Object obj;
        if (n != null)
        {
            charsequence = n;
        } else
        {
            charsequence = m;
        }
        obj = charsequence;
        if (android.os.Build.VERSION.SDK_INT < 18)
        {
            obj = charsequence;
            if (charsequence != null)
            {
                obj = charsequence;
                if (!(charsequence instanceof String))
                {
                    obj = charsequence.toString();
                }
            }
        }
        return ((CharSequence) (obj));
    }

    public final boolean h()
    {
        return (c & 2) == 2;
    }

    public final boolean hasSubMenu()
    {
        return t != null;
    }

    public final boolean i()
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if ((c & 8) != 0)
        {
            if (x == null && d != null)
            {
                x = d.a(this);
            }
            flag = flag1;
            if (x != null)
            {
                flag = true;
            }
        }
        return flag;
    }

    public final boolean isActionViewExpanded()
    {
        return z;
    }

    public final boolean isCheckable()
    {
        return (w & 1) == 1;
    }

    public final boolean isChecked()
    {
        return (w & 2) == 2;
    }

    public final boolean isEnabled()
    {
        return (w & 0x10) != 0;
    }

    public final boolean isVisible()
    {
        if (d == null || !d.b()) goto _L2; else goto _L1
_L1:
        if ((w & 8) != 0 || !d.c()) goto _L4; else goto _L3
_L3:
        return true;
_L4:
        return false;
_L2:
        if ((w & 8) != 0)
        {
            return false;
        }
        if (true) goto _L3; else goto _L5
_L5:
    }

    public final MenuItem setActionProvider(ActionProvider actionprovider)
    {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
    }

    public final MenuItem setActionView(int i1)
    {
        Context context = b.a;
        a(LayoutInflater.from(context).inflate(i1, new LinearLayout(context), false));
        return this;
    }

    public final MenuItem setActionView(View view)
    {
        return a(view);
    }

    public final MenuItem setAlphabeticShortcut(char c1)
    {
        if (q == c1)
        {
            return this;
        } else
        {
            q = Character.toLowerCase(c1);
            b.b(false);
            return this;
        }
    }

    public final MenuItem setCheckable(boolean flag)
    {
        int i1 = w;
        int j1 = w;
        boolean flag1;
        if (flag)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        w = flag1 | j1 & -2;
        if (i1 != w)
        {
            b.b(false);
        }
        return this;
    }

    public final MenuItem setChecked(boolean flag)
    {
        if ((w & 4) != 0)
        {
            i i1 = b;
            int k1 = getGroupId();
            int l1 = i1.c.size();
            int j1 = 0;
            while (j1 < l1) 
            {
                m m1 = (m)i1.c.get(j1);
                if (m1.getGroupId() == k1 && m1.e() && m1.isCheckable())
                {
                    if (m1 == this)
                    {
                        flag = true;
                    } else
                    {
                        flag = false;
                    }
                    m1.e(flag);
                }
                j1++;
            }
        } else
        {
            e(flag);
        }
        return this;
    }

    public final MenuItem setEnabled(boolean flag)
    {
        if (flag)
        {
            w = w | 0x10;
        } else
        {
            w = w & 0xffffffef;
        }
        b.b(false);
        return this;
    }

    public final MenuItem setIcon(int i1)
    {
        r = null;
        s = i1;
        b.b(false);
        return this;
    }

    public final MenuItem setIcon(Drawable drawable)
    {
        s = 0;
        r = drawable;
        b.b(false);
        return this;
    }

    public final MenuItem setIntent(Intent intent)
    {
        o = intent;
        return this;
    }

    public final MenuItem setNumericShortcut(char c1)
    {
        if (p == c1)
        {
            return this;
        } else
        {
            p = c1;
            b.b(false);
            return this;
        }
    }

    public final MenuItem setOnActionExpandListener(android.view.MenuItem.OnActionExpandListener onactionexpandlistener)
    {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setOnActionExpandListener()");
    }

    public final MenuItem setOnMenuItemClickListener(android.view.MenuItem.OnMenuItemClickListener onmenuitemclicklistener)
    {
        v = onmenuitemclicklistener;
        return this;
    }

    public final MenuItem setShortcut(char c1, char c2)
    {
        p = c1;
        q = Character.toLowerCase(c2);
        b.b(false);
        return this;
    }

    public final void setShowAsAction(int i1)
    {
        switch (i1 & 3)
        {
        default:
            throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");

        case 0: // '\0'
        case 1: // '\001'
        case 2: // '\002'
            c = i1;
            break;
        }
        b.g();
    }

    public final MenuItem setShowAsActionFlags(int i1)
    {
        setShowAsAction(i1);
        return this;
    }

    public final MenuItem setTitle(int i1)
    {
        return setTitle(((CharSequence) (b.a.getString(i1))));
    }

    public final MenuItem setTitle(CharSequence charsequence)
    {
        m = charsequence;
        b.b(false);
        if (t != null)
        {
            t.setHeaderTitle(charsequence);
        }
        return this;
    }

    public final MenuItem setTitleCondensed(CharSequence charsequence)
    {
        n = charsequence;
        b.b(false);
        return this;
    }

    public final MenuItem setVisible(boolean flag)
    {
        if (b(flag))
        {
            b.f();
        }
        return this;
    }

    public final String toString()
    {
        return m.toString();
    }
}
