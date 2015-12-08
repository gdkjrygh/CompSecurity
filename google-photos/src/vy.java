// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.ActionProvider;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.widget.LinearLayout;
import java.util.ArrayList;

public final class vy
    implements fr
{

    final int a;
    public vu b;
    public int c;
    public km d;
    private final int e;
    private final int f;
    private final int g;
    private CharSequence h;
    private CharSequence i;
    private Intent j;
    private char k;
    private char l;
    private Drawable m;
    private int n;
    private wo o;
    private android.view.MenuItem.OnMenuItemClickListener p;
    private int q;
    private View r;
    private ls s;
    private boolean t;
    private android.view.ContextMenu.ContextMenuInfo u;

    vy(vu vu1, int i1, int j1, int k1, int l1, CharSequence charsequence, int i2)
    {
        n = 0;
        q = 16;
        c = 0;
        t = false;
        b = vu1;
        e = j1;
        f = i1;
        g = k1;
        a = l1;
        h = charsequence;
        c = i2;
    }

    private fr a(View view)
    {
        r = view;
        d = null;
        if (view != null && view.getId() == -1 && e > 0)
        {
            view.setId(e);
        }
        b.g();
        return this;
    }

    static vu a(vy vy1)
    {
        return vy1.b;
    }

    public final fr a(km km1)
    {
        if (d != null)
        {
            km km2 = d;
            km2.c = null;
            km2.b = null;
        }
        r = null;
        d = km1;
        b.b(true);
        if (d != null)
        {
            d.a(new vz(this));
        }
        return this;
    }

    public final fr a(ls ls1)
    {
        s = ls1;
        return this;
    }

    public final CharSequence a(wm wm1)
    {
        if (wm1 != null && wm1.b())
        {
            return getTitleCondensed();
        } else
        {
            return getTitle();
        }
    }

    public final km a()
    {
        return d;
    }

    public final void a(wo wo1)
    {
        o = wo1;
        wo1.setHeaderTitle(getTitle());
    }

    public final void a(boolean flag)
    {
        int i1 = q;
        byte byte0;
        if (flag)
        {
            byte0 = 4;
        } else
        {
            byte0 = 0;
        }
        q = byte0 | i1 & -5;
    }

    final void b(boolean flag)
    {
        int i1 = q;
        int j1 = q;
        byte byte0;
        if (flag)
        {
            byte0 = 2;
        } else
        {
            byte0 = 0;
        }
        q = byte0 | j1 & -3;
        if (i1 != q)
        {
            b.b(false);
        }
    }

    public final boolean b()
    {
_L2:
        return true;
        if (p != null && p.onMenuItemClick(this) || b.a(b.k(), this)) goto _L2; else goto _L1
_L1:
        if (j == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        b.a.startActivity(j);
        return true;
        ActivityNotFoundException activitynotfoundexception;
        activitynotfoundexception;
        Log.e("MenuItemImpl", "Can't find activity to handle intent; ignoring", activitynotfoundexception);
        if (d != null && d.e()) goto _L2; else goto _L3
_L3:
        return false;
    }

    public final char c()
    {
        if (b.b())
        {
            return l;
        } else
        {
            return k;
        }
    }

    final boolean c(boolean flag)
    {
        boolean flag1 = false;
        int i1 = q;
        int j1 = q;
        byte byte0;
        if (flag)
        {
            byte0 = 0;
        } else
        {
            byte0 = 8;
        }
        q = byte0 | j1 & -9;
        flag = flag1;
        if (i1 != q)
        {
            flag = true;
        }
        return flag;
    }

    public final boolean collapseActionView()
    {
        if ((c & 8) != 0)
        {
            if (r == null)
            {
                return true;
            }
            if (s == null || s.b(this))
            {
                return b.b(this);
            }
        }
        return false;
    }

    public final void d(boolean flag)
    {
        if (flag)
        {
            q = q | 0x20;
            return;
        } else
        {
            q = q & 0xffffffdf;
            return;
        }
    }

    public final boolean d()
    {
        return b.c() && c() != 0;
    }

    public final void e(boolean flag)
    {
        t = flag;
        b.b(false);
    }

    public final boolean e()
    {
        return (q & 4) != 0;
    }

    public final boolean expandActionView()
    {
        while (!i() || s != null && !s.a(this)) 
        {
            return false;
        }
        return b.a(this);
    }

    public final boolean f()
    {
        return (q & 0x20) == 32;
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
        if (r != null)
        {
            return r;
        }
        if (d != null)
        {
            r = d.a(this);
            return r;
        } else
        {
            return null;
        }
    }

    public final char getAlphabeticShortcut()
    {
        return l;
    }

    public final int getGroupId()
    {
        return f;
    }

    public final Drawable getIcon()
    {
        if (m != null)
        {
            return m;
        }
        if (n != 0)
        {
            Drawable drawable = yh.a(b.a, n);
            n = 0;
            m = drawable;
            return drawable;
        } else
        {
            return null;
        }
    }

    public final Intent getIntent()
    {
        return j;
    }

    public final int getItemId()
    {
        return e;
    }

    public final android.view.ContextMenu.ContextMenuInfo getMenuInfo()
    {
        return u;
    }

    public final char getNumericShortcut()
    {
        return k;
    }

    public final int getOrder()
    {
        return g;
    }

    public final SubMenu getSubMenu()
    {
        return o;
    }

    public final CharSequence getTitle()
    {
        return h;
    }

    public final CharSequence getTitleCondensed()
    {
        CharSequence charsequence;
        Object obj;
        if (i != null)
        {
            charsequence = i;
        } else
        {
            charsequence = h;
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
        return o != null;
    }

    public final boolean i()
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if ((c & 8) != 0)
        {
            if (r == null && d != null)
            {
                r = d.a(this);
            }
            flag = flag1;
            if (r != null)
            {
                flag = true;
            }
        }
        return flag;
    }

    public final boolean isActionViewExpanded()
    {
        return t;
    }

    public final boolean isCheckable()
    {
        return (q & 1) == 1;
    }

    public final boolean isChecked()
    {
        return (q & 2) == 2;
    }

    public final boolean isEnabled()
    {
        return (q & 0x10) != 0;
    }

    public final boolean isVisible()
    {
        if (d == null || !d.b()) goto _L2; else goto _L1
_L1:
        if ((q & 8) != 0 || !d.c()) goto _L4; else goto _L3
_L3:
        return true;
_L4:
        return false;
_L2:
        if ((q & 8) != 0)
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
        if (l == c1)
        {
            return this;
        } else
        {
            l = Character.toLowerCase(c1);
            b.b(false);
            return this;
        }
    }

    public final MenuItem setCheckable(boolean flag)
    {
        int i1 = q;
        int j1 = q;
        boolean flag1;
        if (flag)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        q = flag1 | j1 & -2;
        if (i1 != q)
        {
            b.b(false);
        }
        return this;
    }

    public final MenuItem setChecked(boolean flag)
    {
        if ((q & 4) != 0)
        {
            vu vu1 = b;
            int j1 = getGroupId();
            int k1 = vu1.c.size();
            int i1 = 0;
            while (i1 < k1) 
            {
                vy vy1 = (vy)vu1.c.get(i1);
                if (vy1.getGroupId() == j1 && vy1.e() && vy1.isCheckable())
                {
                    if (vy1 == this)
                    {
                        flag = true;
                    } else
                    {
                        flag = false;
                    }
                    vy1.b(flag);
                }
                i1++;
            }
        } else
        {
            b(flag);
        }
        return this;
    }

    public final MenuItem setEnabled(boolean flag)
    {
        if (flag)
        {
            q = q | 0x10;
        } else
        {
            q = q & 0xffffffef;
        }
        b.b(false);
        return this;
    }

    public final MenuItem setIcon(int i1)
    {
        m = null;
        n = i1;
        b.b(false);
        return this;
    }

    public final MenuItem setIcon(Drawable drawable)
    {
        n = 0;
        m = drawable;
        b.b(false);
        return this;
    }

    public final MenuItem setIntent(Intent intent)
    {
        j = intent;
        return this;
    }

    public final MenuItem setNumericShortcut(char c1)
    {
        if (k == c1)
        {
            return this;
        } else
        {
            k = c1;
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
        p = onmenuitemclicklistener;
        return this;
    }

    public final MenuItem setShortcut(char c1, char c2)
    {
        k = c1;
        l = Character.toLowerCase(c2);
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
        h = charsequence;
        b.b(false);
        if (o != null)
        {
            o.setHeaderTitle(charsequence);
        }
        return this;
    }

    public final MenuItem setTitleCondensed(CharSequence charsequence)
    {
        i = charsequence;
        b.b(false);
        return this;
    }

    public final MenuItem setVisible(boolean flag)
    {
        if (c(flag))
        {
            b.f();
        }
        return this;
    }

    public final String toString()
    {
        return h.toString();
    }
}
