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

public final class uk
    implements eg
{

    final int a;
    public int b;
    public ie c;
    private final int d;
    private final int e;
    private final int f;
    private CharSequence g;
    private CharSequence h;
    private Intent i;
    private char j;
    private char k;
    private Drawable l;
    private int m;
    private ug n;
    private va o;
    private android.view.MenuItem.OnMenuItemClickListener p;
    private int q;
    private View r;
    private jn s;
    private boolean t;

    uk(ug ug1, int i1, int j1, int k1, int l1, CharSequence charsequence, int i2)
    {
        m = 0;
        q = 16;
        b = 0;
        t = false;
        n = ug1;
        d = j1;
        e = i1;
        f = k1;
        a = l1;
        g = charsequence;
        b = i2;
    }

    private eg a(View view)
    {
        r = view;
        c = null;
        if (view != null && view.getId() == -1 && d > 0)
        {
            view.setId(d);
        }
        n.g();
        return this;
    }

    static ug a(uk uk1)
    {
        return uk1.n;
    }

    private void e(boolean flag)
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
            n.b(false);
        }
    }

    public final eg a(ie ie1)
    {
        if (c != null)
        {
            c.a = null;
        }
        r = null;
        c = ie1;
        n.b(true);
        if (c != null)
        {
            c.a(new _cls1());
        }
        return this;
    }

    public final eg a(jn jn1)
    {
        s = jn1;
        return this;
    }

    public final ie a()
    {
        return c;
    }

    public final CharSequence a(ux ux1)
    {
        if (ux1 != null && ux1.b())
        {
            return getTitleCondensed();
        } else
        {
            return getTitle();
        }
    }

    public final void a(va va1)
    {
        o = va1;
        va1.setHeaderTitle(getTitle());
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

    public final boolean b()
    {
_L2:
        return true;
        if (p != null && p.onMenuItemClick(this) || n.a(n.k(), this)) goto _L2; else goto _L1
_L1:
        if (i == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        n.a.startActivity(i);
        return true;
        ActivityNotFoundException activitynotfoundexception;
        activitynotfoundexception;
        Log.e("MenuItemImpl", "Can't find activity to handle intent; ignoring", activitynotfoundexception);
        if (c != null && c.d()) goto _L2; else goto _L3
_L3:
        return false;
    }

    final boolean b(boolean flag)
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

    public final char c()
    {
        if (n.b())
        {
            return k;
        } else
        {
            return j;
        }
    }

    public final void c(boolean flag)
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

    public final boolean collapseActionView()
    {
        if ((b & 8) != 0)
        {
            if (r == null)
            {
                return true;
            }
            if (s == null || s.b(this))
            {
                return n.b(this);
            }
        }
        return false;
    }

    public final void d(boolean flag)
    {
        t = flag;
        n.b(false);
    }

    public final boolean d()
    {
        return n.c() && c() != 0;
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
        return n.a(this);
    }

    public final boolean f()
    {
        return (q & 0x20) == 32;
    }

    public final boolean g()
    {
        return (b & 1) == 1;
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
        if (c != null)
        {
            r = c.a(this);
            return r;
        } else
        {
            return null;
        }
    }

    public final char getAlphabeticShortcut()
    {
        return k;
    }

    public final int getGroupId()
    {
        return e;
    }

    public final Drawable getIcon()
    {
        if (l != null)
        {
            return l;
        }
        if (m != 0)
        {
            Drawable drawable = wa.a(n.a, m);
            m = 0;
            l = drawable;
            return drawable;
        } else
        {
            return null;
        }
    }

    public final Intent getIntent()
    {
        return i;
    }

    public final int getItemId()
    {
        return d;
    }

    public final android.view.ContextMenu.ContextMenuInfo getMenuInfo()
    {
        return null;
    }

    public final char getNumericShortcut()
    {
        return j;
    }

    public final int getOrder()
    {
        return f;
    }

    public final SubMenu getSubMenu()
    {
        return o;
    }

    public final CharSequence getTitle()
    {
        return g;
    }

    public final CharSequence getTitleCondensed()
    {
        CharSequence charsequence;
        Object obj;
        if (h != null)
        {
            charsequence = h;
        } else
        {
            charsequence = g;
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
        return (b & 2) == 2;
    }

    public final boolean hasSubMenu()
    {
        return o != null;
    }

    public final boolean i()
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if ((b & 8) != 0)
        {
            if (r == null && c != null)
            {
                r = c.a(this);
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
        if (c == null || !c.b()) goto _L2; else goto _L1
_L1:
        if ((q & 8) != 0 || !c.c()) goto _L4; else goto _L3
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
        Context context = n.a;
        a(LayoutInflater.from(context).inflate(i1, new LinearLayout(context), false));
        return this;
    }

    public final MenuItem setActionView(View view)
    {
        return a(view);
    }

    public final MenuItem setAlphabeticShortcut(char c1)
    {
        if (k == c1)
        {
            return this;
        } else
        {
            k = Character.toLowerCase(c1);
            n.b(false);
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
            n.b(false);
        }
        return this;
    }

    public final MenuItem setChecked(boolean flag)
    {
        if ((q & 4) != 0)
        {
            ug ug1 = n;
            int j1 = getGroupId();
            int k1 = ug1.c.size();
            int i1 = 0;
            while (i1 < k1) 
            {
                uk uk1 = (uk)ug1.c.get(i1);
                if (uk1.getGroupId() == j1 && uk1.e() && uk1.isCheckable())
                {
                    if (uk1 == this)
                    {
                        flag = true;
                    } else
                    {
                        flag = false;
                    }
                    uk1.e(flag);
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
            q = q | 0x10;
        } else
        {
            q = q & 0xffffffef;
        }
        n.b(false);
        return this;
    }

    public final MenuItem setIcon(int i1)
    {
        l = null;
        m = i1;
        n.b(false);
        return this;
    }

    public final MenuItem setIcon(Drawable drawable)
    {
        m = 0;
        l = drawable;
        n.b(false);
        return this;
    }

    public final MenuItem setIntent(Intent intent)
    {
        i = intent;
        return this;
    }

    public final MenuItem setNumericShortcut(char c1)
    {
        if (j == c1)
        {
            return this;
        } else
        {
            j = c1;
            n.b(false);
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
        j = c1;
        k = Character.toLowerCase(c2);
        n.b(false);
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
            b = i1;
            break;
        }
        n.g();
    }

    public final MenuItem setShowAsActionFlags(int i1)
    {
        setShowAsAction(i1);
        return this;
    }

    public final MenuItem setTitle(int i1)
    {
        return setTitle(((CharSequence) (n.a.getString(i1))));
    }

    public final MenuItem setTitle(CharSequence charsequence)
    {
        g = charsequence;
        n.b(false);
        if (o != null)
        {
            o.setHeaderTitle(charsequence);
        }
        return this;
    }

    public final MenuItem setTitleCondensed(CharSequence charsequence)
    {
        h = charsequence;
        n.b(false);
        return this;
    }

    public final MenuItem setVisible(boolean flag)
    {
        if (b(flag))
        {
            n.f();
        }
        return this;
    }

    public final String toString()
    {
        if (g != null)
        {
            return g.toString();
        } else
        {
            return null;
        }
    }

    /* member class not found */
    class _cls1 {}

}
