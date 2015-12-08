// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.view.menu;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.support.v4.d.a.b;
import android.support.v4.view.d;
import android.support.v7.internal.widget.TintManager;
import android.util.Log;
import android.view.ActionProvider;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.widget.LinearLayout;
import java.util.ArrayList;

// Referenced classes of package android.support.v7.internal.view.menu:
//            f, p

public final class h
    implements b
{

    static String f;
    static String g;
    static String h;
    static String i;
    final int a;
    f b;
    int c;
    public d d;
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
    private p t;
    private Runnable u;
    private android.view.MenuItem.OnMenuItemClickListener v;
    private int w;
    private View x;
    private android.support.v4.view.m.e y;
    private boolean z;

    h(f f1, int i1, int j1, int k1, int l1, CharSequence charsequence, int i2)
    {
        s = 0;
        w = 16;
        c = 0;
        z = false;
        b = f1;
        j = j1;
        k = i1;
        l = k1;
        a = l1;
        m = charsequence;
        c = i2;
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

    static f a(h h1)
    {
        return h1.b;
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

    public final b a(d d1)
    {
        if (d != null)
        {
            d.reset();
        }
        x = null;
        d = d1;
        b.b(true);
        if (d != null)
        {
            d.setVisibilityListener(new android.support.v4.view.d.b() {

                final h a;

                public final void a()
                {
                    h.a(a).f();
                }

            
            {
                a = h.this;
                super();
            }
            });
        }
        return this;
    }

    public final b a(android.support.v4.view.m.e e1)
    {
        y = e1;
        return this;
    }

    public final d a()
    {
        return d;
    }

    final CharSequence a(m.a a1)
    {
        if (a1 != null && a1.a())
        {
            return getTitleCondensed();
        } else
        {
            return getTitle();
        }
    }

    public final void a(p p1)
    {
        t = p1;
        p1.setHeaderTitle(getTitle());
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
        Log.e("MenuItemImpl", "Can't find activity to handle intent; ignoring", activitynotfoundexception);
        if (d != null && d.onPerformDefaultAction()) goto _L2; else goto _L3
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
            x = d.onCreateActionView(this);
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
            Drawable drawable = TintManager.getDrawable(b.a, s);
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
                x = d.onCreateActionView(this);
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
        if (d == null || !d.overridesItemVisibility()) goto _L2; else goto _L1
_L1:
        if ((w & 8) != 0 || !d.isVisible()) goto _L4; else goto _L3
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
            f f1 = b;
            int j1 = getGroupId();
            int k1 = f1.c.size();
            int i1 = 0;
            while (i1 < k1) 
            {
                h h1 = (h)f1.c.get(i1);
                if (h1.getGroupId() == j1 && h1.e() && h1.isCheckable())
                {
                    if (h1 == this)
                    {
                        flag = true;
                    } else
                    {
                        flag = false;
                    }
                    h1.e(flag);
                }
                i1++;
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
