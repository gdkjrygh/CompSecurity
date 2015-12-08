// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.view.menu;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.support.v4.internal.view.SupportMenuItem;
import android.support.v4.view.ActionProvider;
import android.support.v7.internal.widget.TintManager;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.widget.LinearLayout;
import java.util.ArrayList;

// Referenced classes of package android.support.v7.internal.view.menu:
//            f, q, i

public final class h
    implements SupportMenuItem
{

    static String e;
    static String f;
    static String g;
    static String h;
    final int a;
    f b;
    int c;
    android.view.ContextMenu.ContextMenuInfo d;
    private final int i;
    private final int j;
    private final int k;
    private CharSequence l;
    private CharSequence m;
    private Intent n;
    private char o;
    private char p;
    private Drawable q;
    private int r;
    private q s;
    private Runnable t;
    private android.view.MenuItem.OnMenuItemClickListener u;
    private int v;
    private View w;
    private ActionProvider x;
    private android.support.v4.view.MenuItemCompat.OnActionExpandListener y;
    private boolean z;

    h(f f1, int i1, int j1, int k1, int l1, CharSequence charsequence, int i2)
    {
        r = 0;
        v = 16;
        c = 0;
        z = false;
        b = f1;
        i = j1;
        j = i1;
        k = k1;
        a = l1;
        l = charsequence;
        c = i2;
    }

    private SupportMenuItem a(View view)
    {
        w = view;
        x = null;
        if (view != null && view.getId() == -1 && i > 0)
        {
            view.setId(i);
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
        int i1 = v;
        int j1 = v;
        byte byte0;
        if (flag)
        {
            byte0 = 2;
        } else
        {
            byte0 = 0;
        }
        v = byte0 | j1 & -3;
        if (i1 != v)
        {
            b.b(false);
        }
    }

    final CharSequence a(n.a a1)
    {
        if (a1 != null && a1.prefersCondensedTitle())
        {
            return getTitleCondensed();
        } else
        {
            return getTitle();
        }
    }

    final void a(q q1)
    {
        s = q1;
        q1.setHeaderTitle(getTitle());
    }

    public final void a(boolean flag)
    {
        int i1 = v;
        byte byte0;
        if (flag)
        {
            byte0 = 4;
        } else
        {
            byte0 = 0;
        }
        v = byte0 | i1 & -5;
    }

    public final boolean a()
    {
_L2:
        return true;
        if (u != null && u.onMenuItemClick(this) || b.a(b.k(), this)) goto _L2; else goto _L1
_L1:
        if (t != null)
        {
            t.run();
            return true;
        }
        if (n == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        b.a.startActivity(n);
        return true;
        ActivityNotFoundException activitynotfoundexception;
        activitynotfoundexception;
        if (x != null && x.onPerformDefaultAction()) goto _L2; else goto _L3
_L3:
        return false;
    }

    final char b()
    {
        if (b.b())
        {
            return p;
        } else
        {
            return o;
        }
    }

    final boolean b(boolean flag)
    {
        boolean flag1 = false;
        int i1 = v;
        int j1 = v;
        byte byte0;
        if (flag)
        {
            byte0 = 0;
        } else
        {
            byte0 = 8;
        }
        v = byte0 | j1 & -9;
        flag = flag1;
        if (i1 != v)
        {
            flag = true;
        }
        return flag;
    }

    public final void c(boolean flag)
    {
        if (flag)
        {
            v = v | 0x20;
            return;
        } else
        {
            v = v & 0xffffffdf;
            return;
        }
    }

    final boolean c()
    {
        return b.c() && b() != 0;
    }

    public final boolean collapseActionView()
    {
        if ((c & 8) != 0)
        {
            if (w == null)
            {
                return true;
            }
            if (y == null || y.onMenuItemActionCollapse(this))
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

    public final boolean d()
    {
        return (v & 4) != 0;
    }

    public final boolean e()
    {
        return (v & 0x20) == 32;
    }

    public final boolean expandActionView()
    {
        while (!h() || y != null && !y.onMenuItemActionExpand(this)) 
        {
            return false;
        }
        return b.a(this);
    }

    public final boolean f()
    {
        return (c & 1) == 1;
    }

    public final boolean g()
    {
        return (c & 2) == 2;
    }

    public final android.view.ActionProvider getActionProvider()
    {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    public final View getActionView()
    {
        if (w != null)
        {
            return w;
        }
        if (x != null)
        {
            w = x.onCreateActionView(this);
            return w;
        } else
        {
            return null;
        }
    }

    public final char getAlphabeticShortcut()
    {
        return p;
    }

    public final int getGroupId()
    {
        return j;
    }

    public final Drawable getIcon()
    {
        if (q != null)
        {
            return q;
        }
        if (r != 0)
        {
            Drawable drawable = TintManager.getDrawable(b.a, r);
            r = 0;
            q = drawable;
            return drawable;
        } else
        {
            return null;
        }
    }

    public final Intent getIntent()
    {
        return n;
    }

    public final int getItemId()
    {
        return i;
    }

    public final android.view.ContextMenu.ContextMenuInfo getMenuInfo()
    {
        return d;
    }

    public final char getNumericShortcut()
    {
        return o;
    }

    public final int getOrder()
    {
        return k;
    }

    public final SubMenu getSubMenu()
    {
        return s;
    }

    public final ActionProvider getSupportActionProvider()
    {
        return x;
    }

    public final CharSequence getTitle()
    {
        return l;
    }

    public final CharSequence getTitleCondensed()
    {
        CharSequence charsequence;
        Object obj;
        if (m != null)
        {
            charsequence = m;
        } else
        {
            charsequence = l;
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
        boolean flag1 = false;
        boolean flag = flag1;
        if ((c & 8) != 0)
        {
            if (w == null && x != null)
            {
                w = x.onCreateActionView(this);
            }
            flag = flag1;
            if (w != null)
            {
                flag = true;
            }
        }
        return flag;
    }

    public final boolean hasSubMenu()
    {
        return s != null;
    }

    public final boolean isActionViewExpanded()
    {
        return z;
    }

    public final boolean isCheckable()
    {
        return (v & 1) == 1;
    }

    public final boolean isChecked()
    {
        return (v & 2) == 2;
    }

    public final boolean isEnabled()
    {
        return (v & 0x10) != 0;
    }

    public final boolean isVisible()
    {
        if (x == null || !x.overridesItemVisibility()) goto _L2; else goto _L1
_L1:
        if ((v & 8) != 0 || !x.isVisible()) goto _L4; else goto _L3
_L3:
        return true;
_L4:
        return false;
_L2:
        if ((v & 8) != 0)
        {
            return false;
        }
        if (true) goto _L3; else goto _L5
_L5:
    }

    public final MenuItem setActionProvider(android.view.ActionProvider actionprovider)
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
        if (p == c1)
        {
            return this;
        } else
        {
            p = Character.toLowerCase(c1);
            b.b(false);
            return this;
        }
    }

    public final MenuItem setCheckable(boolean flag)
    {
        int i1 = v;
        int j1 = v;
        boolean flag1;
        if (flag)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        v = flag1 | j1 & -2;
        if (i1 != v)
        {
            b.b(false);
        }
        return this;
    }

    public final MenuItem setChecked(boolean flag)
    {
        if ((v & 4) != 0)
        {
            f f1 = b;
            int j1 = getGroupId();
            int k1 = f1.c.size();
            int i1 = 0;
            while (i1 < k1) 
            {
                h h1 = (h)f1.c.get(i1);
                if (h1.getGroupId() == j1 && h1.d() && h1.isCheckable())
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
            v = v | 0x10;
        } else
        {
            v = v & 0xffffffef;
        }
        b.b(false);
        return this;
    }

    public final MenuItem setIcon(int i1)
    {
        q = null;
        r = i1;
        b.b(false);
        return this;
    }

    public final MenuItem setIcon(Drawable drawable)
    {
        r = 0;
        q = drawable;
        b.b(false);
        return this;
    }

    public final MenuItem setIntent(Intent intent)
    {
        n = intent;
        return this;
    }

    public final MenuItem setNumericShortcut(char c1)
    {
        if (o == c1)
        {
            return this;
        } else
        {
            o = c1;
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
        u = onmenuitemclicklistener;
        return this;
    }

    public final MenuItem setShortcut(char c1, char c2)
    {
        o = c1;
        p = Character.toLowerCase(c2);
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

    public final SupportMenuItem setSupportActionProvider(ActionProvider actionprovider)
    {
        if (x != null)
        {
            x.setVisibilityListener(null);
        }
        w = null;
        x = actionprovider;
        b.b(true);
        if (x != null)
        {
            x.setVisibilityListener(new i(this));
        }
        return this;
    }

    public final SupportMenuItem setSupportOnActionExpandListener(android.support.v4.view.MenuItemCompat.OnActionExpandListener onactionexpandlistener)
    {
        y = onactionexpandlistener;
        return this;
    }

    public final MenuItem setTitle(int i1)
    {
        return setTitle(((CharSequence) (b.a.getString(i1))));
    }

    public final MenuItem setTitle(CharSequence charsequence)
    {
        l = charsequence;
        b.b(false);
        if (s != null)
        {
            s.setHeaderTitle(charsequence);
        }
        return this;
    }

    public final MenuItem setTitleCondensed(CharSequence charsequence)
    {
        m = charsequence;
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
        return l.toString();
    }
}
