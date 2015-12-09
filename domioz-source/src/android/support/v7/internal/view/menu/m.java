// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.view.menu;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.support.v4.b.a.b;
import android.support.v4.view.ax;
import android.support.v4.view.n;
import android.util.Log;
import android.view.ActionProvider;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.widget.LinearLayout;

// Referenced classes of package android.support.v7.internal.view.menu:
//            i, n, aa, ad

public final class m
    implements b
{

    private static String w;
    private static String x;
    private static String y;
    private static String z;
    private final int a;
    private final int b;
    private final int c;
    private final int d;
    private CharSequence e;
    private CharSequence f;
    private Intent g;
    private char h;
    private char i;
    private Drawable j;
    private int k;
    private i l;
    private ad m;
    private Runnable n;
    private android.view.MenuItem.OnMenuItemClickListener o;
    private int p;
    private int q;
    private View r;
    private n s;
    private ax t;
    private boolean u;
    private android.view.ContextMenu.ContextMenuInfo v;

    m(i i1, int j1, int k1, int l1, int i2, CharSequence charsequence, int j2)
    {
        k = 0;
        p = 16;
        q = 0;
        u = false;
        l = i1;
        a = k1;
        b = j1;
        c = l1;
        d = i2;
        e = charsequence;
        q = j2;
    }

    private b a(View view)
    {
        r = view;
        s = null;
        if (view != null && view.getId() == -1 && a > 0)
        {
            view.setId(a);
        }
        l.j();
        return this;
    }

    static i a(m m1)
    {
        return m1.l;
    }

    public final b a(ax ax1)
    {
        t = ax1;
        return this;
    }

    public final b a(n n1)
    {
        if (s != null)
        {
            s.a(null);
        }
        r = null;
        s = n1;
        l.b(true);
        if (s != null)
        {
            s.a(new android.support.v7.internal.view.menu.n(this));
        }
        return this;
    }

    public final n a()
    {
        return s;
    }

    final CharSequence a(aa aa1)
    {
        if (aa1 != null && aa1.b())
        {
            return getTitleCondensed();
        } else
        {
            return getTitle();
        }
    }

    final void a(ad ad1)
    {
        m = ad1;
        ad1.setHeaderTitle(getTitle());
    }

    final void a(android.view.ContextMenu.ContextMenuInfo contextmenuinfo)
    {
        v = contextmenuinfo;
    }

    public final void a(boolean flag)
    {
        int i1 = p;
        byte byte0;
        if (flag)
        {
            byte0 = 4;
        } else
        {
            byte0 = 0;
        }
        p = byte0 | i1 & -5;
    }

    final void b(boolean flag)
    {
        int i1 = p;
        int j1 = p;
        byte byte0;
        if (flag)
        {
            byte0 = 2;
        } else
        {
            byte0 = 0;
        }
        p = byte0 | j1 & -3;
        if (i1 != p)
        {
            l.b(false);
        }
    }

    public final boolean b()
    {
_L2:
        return true;
        if (o != null && o.onMenuItemClick(this) || l.a(l.o(), this)) goto _L2; else goto _L1
_L1:
        if (n != null)
        {
            n.run();
            return true;
        }
        if (g == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        l.e().startActivity(g);
        return true;
        ActivityNotFoundException activitynotfoundexception;
        activitynotfoundexception;
        Log.e("MenuItemImpl", "Can't find activity to handle intent; ignoring", activitynotfoundexception);
        if (s != null && s.d()) goto _L2; else goto _L3
_L3:
        return false;
    }

    public final int c()
    {
        return d;
    }

    final boolean c(boolean flag)
    {
        boolean flag1 = false;
        int i1 = p;
        int j1 = p;
        byte byte0;
        if (flag)
        {
            byte0 = 0;
        } else
        {
            byte0 = 8;
        }
        p = byte0 | j1 & -9;
        flag = flag1;
        if (i1 != p)
        {
            flag = true;
        }
        return flag;
    }

    public final boolean collapseActionView()
    {
        if ((q & 8) != 0)
        {
            if (r == null)
            {
                return true;
            }
            if (t == null || t.b(this))
            {
                return l.b(this);
            }
        }
        return false;
    }

    final char d()
    {
        if (l.c())
        {
            return i;
        } else
        {
            return h;
        }
    }

    public final void d(boolean flag)
    {
        if (flag)
        {
            p = p | 0x20;
            return;
        } else
        {
            p = p & 0xffffffdf;
            return;
        }
    }

    final String e()
    {
        char c1;
        StringBuilder stringbuilder;
        c1 = d();
        if (c1 == 0)
        {
            return "";
        }
        stringbuilder = new StringBuilder(w);
        c1;
        JVM INSTR lookupswitch 3: default 60
    //                   8: 82
    //                   10: 71
    //                   32: 93;
           goto _L1 _L2 _L3 _L4
_L1:
        stringbuilder.append(c1);
_L6:
        return stringbuilder.toString();
_L3:
        stringbuilder.append(x);
        continue; /* Loop/switch isn't completed */
_L2:
        stringbuilder.append(y);
        continue; /* Loop/switch isn't completed */
_L4:
        stringbuilder.append(z);
        if (true) goto _L6; else goto _L5
_L5:
    }

    public final void e(boolean flag)
    {
        u = flag;
        l.b(false);
    }

    public final boolean expandActionView()
    {
        while (!m() || t != null && !t.a(this)) 
        {
            return false;
        }
        return l.a(this);
    }

    final boolean f()
    {
        return l.d() && d() != 0;
    }

    public final boolean g()
    {
        return (p & 4) != 0;
    }

    public final ActionProvider getActionProvider()
    {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    public final View getActionView()
    {
        if (r != null)
        {
            return r;
        }
        if (s != null)
        {
            r = s.a(this);
            return r;
        } else
        {
            return null;
        }
    }

    public final char getAlphabeticShortcut()
    {
        return i;
    }

    public final int getGroupId()
    {
        return b;
    }

    public final Drawable getIcon()
    {
        if (j != null)
        {
            return j;
        }
        if (k != 0)
        {
            Drawable drawable = android.support.v7.internal.widget.ax.a(l.e(), k);
            k = 0;
            j = drawable;
            return drawable;
        } else
        {
            return null;
        }
    }

    public final Intent getIntent()
    {
        return g;
    }

    public final int getItemId()
    {
        return a;
    }

    public final android.view.ContextMenu.ContextMenuInfo getMenuInfo()
    {
        return v;
    }

    public final char getNumericShortcut()
    {
        return h;
    }

    public final int getOrder()
    {
        return c;
    }

    public final SubMenu getSubMenu()
    {
        return m;
    }

    public final CharSequence getTitle()
    {
        return e;
    }

    public final CharSequence getTitleCondensed()
    {
        CharSequence charsequence;
        Object obj;
        if (f != null)
        {
            charsequence = f;
        } else
        {
            charsequence = e;
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
        return l.p();
    }

    public final boolean hasSubMenu()
    {
        return m != null;
    }

    public final boolean i()
    {
        return (p & 0x20) == 32;
    }

    public final boolean isActionViewExpanded()
    {
        return u;
    }

    public final boolean isCheckable()
    {
        return (p & 1) == 1;
    }

    public final boolean isChecked()
    {
        return (p & 2) == 2;
    }

    public final boolean isEnabled()
    {
        return (p & 0x10) != 0;
    }

    public final boolean isVisible()
    {
        if (s == null || !s.b()) goto _L2; else goto _L1
_L1:
        if ((p & 8) != 0 || !s.c()) goto _L4; else goto _L3
_L3:
        return true;
_L4:
        return false;
_L2:
        if ((p & 8) != 0)
        {
            return false;
        }
        if (true) goto _L3; else goto _L5
_L5:
    }

    public final boolean j()
    {
        return (q & 1) == 1;
    }

    public final boolean k()
    {
        return (q & 2) == 2;
    }

    public final boolean l()
    {
        return (q & 4) == 4;
    }

    public final boolean m()
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if ((q & 8) != 0)
        {
            if (r == null && s != null)
            {
                r = s.a(this);
            }
            flag = flag1;
            if (r != null)
            {
                flag = true;
            }
        }
        return flag;
    }

    public final MenuItem setActionProvider(ActionProvider actionprovider)
    {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
    }

    public final MenuItem setActionView(int i1)
    {
        Context context = l.e();
        a(LayoutInflater.from(context).inflate(i1, new LinearLayout(context), false));
        return this;
    }

    public final MenuItem setActionView(View view)
    {
        return a(view);
    }

    public final MenuItem setAlphabeticShortcut(char c1)
    {
        if (i == c1)
        {
            return this;
        } else
        {
            i = Character.toLowerCase(c1);
            l.b(false);
            return this;
        }
    }

    public final MenuItem setCheckable(boolean flag)
    {
        int i1 = p;
        int j1 = p;
        boolean flag1;
        if (flag)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        p = flag1 | j1 & -2;
        if (i1 != p)
        {
            l.b(false);
        }
        return this;
    }

    public final MenuItem setChecked(boolean flag)
    {
        if ((p & 4) != 0)
        {
            l.a(this);
            return this;
        } else
        {
            b(flag);
            return this;
        }
    }

    public final MenuItem setEnabled(boolean flag)
    {
        if (flag)
        {
            p = p | 0x10;
        } else
        {
            p = p & 0xffffffef;
        }
        l.b(false);
        return this;
    }

    public final MenuItem setIcon(int i1)
    {
        j = null;
        k = i1;
        l.b(false);
        return this;
    }

    public final MenuItem setIcon(Drawable drawable)
    {
        k = 0;
        j = drawable;
        l.b(false);
        return this;
    }

    public final MenuItem setIntent(Intent intent)
    {
        g = intent;
        return this;
    }

    public final MenuItem setNumericShortcut(char c1)
    {
        if (h == c1)
        {
            return this;
        } else
        {
            h = c1;
            l.b(false);
            return this;
        }
    }

    public final MenuItem setOnActionExpandListener(android.view.MenuItem.OnActionExpandListener onactionexpandlistener)
    {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setOnActionExpandListener()");
    }

    public final MenuItem setOnMenuItemClickListener(android.view.MenuItem.OnMenuItemClickListener onmenuitemclicklistener)
    {
        o = onmenuitemclicklistener;
        return this;
    }

    public final MenuItem setShortcut(char c1, char c2)
    {
        h = c1;
        i = Character.toLowerCase(c2);
        l.b(false);
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
            q = i1;
            break;
        }
        l.j();
    }

    public final MenuItem setShowAsActionFlags(int i1)
    {
        setShowAsAction(i1);
        return this;
    }

    public final MenuItem setTitle(int i1)
    {
        return setTitle(((CharSequence) (l.e().getString(i1))));
    }

    public final MenuItem setTitle(CharSequence charsequence)
    {
        e = charsequence;
        l.b(false);
        if (m != null)
        {
            m.setHeaderTitle(charsequence);
        }
        return this;
    }

    public final MenuItem setTitleCondensed(CharSequence charsequence)
    {
        f = charsequence;
        l.b(false);
        return this;
    }

    public final MenuItem setVisible(boolean flag)
    {
        if (c(flag))
        {
            l.i();
        }
        return this;
    }

    public final String toString()
    {
        return e.toString();
    }
}
