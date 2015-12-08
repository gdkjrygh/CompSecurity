// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.view.menu;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.support.v4.d.a.b;
import android.support.v4.view.d;
import android.view.ActionProvider;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

public final class a
    implements b
{

    private final int a = 0x102002c;
    private final int b = 0;
    private final int c = 0;
    private final int d = 0;
    private CharSequence e;
    private CharSequence f;
    private Intent g;
    private char h;
    private char i;
    private Drawable j;
    private int k;
    private Context l;
    private android.view.MenuItem.OnMenuItemClickListener m;
    private int n;

    public a(Context context, CharSequence charsequence)
    {
        k = 0;
        n = 16;
        l = context;
        e = charsequence;
    }

    public final b a(d d1)
    {
        throw new UnsupportedOperationException();
    }

    public final b a(android.support.v4.view.m.e e1)
    {
        return this;
    }

    public final d a()
    {
        return null;
    }

    public final boolean collapseActionView()
    {
        return false;
    }

    public final boolean expandActionView()
    {
        return false;
    }

    public final ActionProvider getActionProvider()
    {
        throw new UnsupportedOperationException();
    }

    public final View getActionView()
    {
        return null;
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
        return j;
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
        return null;
    }

    public final char getNumericShortcut()
    {
        return h;
    }

    public final int getOrder()
    {
        return d;
    }

    public final SubMenu getSubMenu()
    {
        return null;
    }

    public final CharSequence getTitle()
    {
        return e;
    }

    public final CharSequence getTitleCondensed()
    {
        if (f != null)
        {
            return f;
        } else
        {
            return e;
        }
    }

    public final boolean hasSubMenu()
    {
        return false;
    }

    public final boolean isActionViewExpanded()
    {
        return false;
    }

    public final boolean isCheckable()
    {
        return (n & 1) != 0;
    }

    public final boolean isChecked()
    {
        return (n & 2) != 0;
    }

    public final boolean isEnabled()
    {
        return (n & 0x10) != 0;
    }

    public final boolean isVisible()
    {
        return (n & 8) == 0;
    }

    public final MenuItem setActionProvider(ActionProvider actionprovider)
    {
        throw new UnsupportedOperationException();
    }

    public final MenuItem setActionView(int i1)
    {
        throw new UnsupportedOperationException();
    }

    public final MenuItem setActionView(View view)
    {
        throw new UnsupportedOperationException();
    }

    public final MenuItem setAlphabeticShortcut(char c1)
    {
        i = c1;
        return this;
    }

    public final MenuItem setCheckable(boolean flag)
    {
        int i1 = n;
        boolean flag1;
        if (flag)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        n = flag1 | i1 & -2;
        return this;
    }

    public final MenuItem setChecked(boolean flag)
    {
        int i1 = n;
        byte byte0;
        if (flag)
        {
            byte0 = 2;
        } else
        {
            byte0 = 0;
        }
        n = byte0 | i1 & -3;
        return this;
    }

    public final MenuItem setEnabled(boolean flag)
    {
        int i1 = n;
        byte byte0;
        if (flag)
        {
            byte0 = 16;
        } else
        {
            byte0 = 0;
        }
        n = byte0 | i1 & 0xffffffef;
        return this;
    }

    public final MenuItem setIcon(int i1)
    {
        k = i1;
        j = android.support.v4.b.a.a(l, i1);
        return this;
    }

    public final MenuItem setIcon(Drawable drawable)
    {
        j = drawable;
        k = 0;
        return this;
    }

    public final MenuItem setIntent(Intent intent)
    {
        g = intent;
        return this;
    }

    public final MenuItem setNumericShortcut(char c1)
    {
        h = c1;
        return this;
    }

    public final MenuItem setOnActionExpandListener(android.view.MenuItem.OnActionExpandListener onactionexpandlistener)
    {
        throw new UnsupportedOperationException();
    }

    public final MenuItem setOnMenuItemClickListener(android.view.MenuItem.OnMenuItemClickListener onmenuitemclicklistener)
    {
        m = onmenuitemclicklistener;
        return this;
    }

    public final MenuItem setShortcut(char c1, char c2)
    {
        h = c1;
        i = c2;
        return this;
    }

    public final void setShowAsAction(int i1)
    {
    }

    public final MenuItem setShowAsActionFlags(int i1)
    {
        setShowAsAction(i1);
        return this;
    }

    public final MenuItem setTitle(int i1)
    {
        e = l.getResources().getString(i1);
        return this;
    }

    public final MenuItem setTitle(CharSequence charsequence)
    {
        e = charsequence;
        return this;
    }

    public final MenuItem setTitleCondensed(CharSequence charsequence)
    {
        f = charsequence;
        return this;
    }

    public final MenuItem setVisible(boolean flag)
    {
        int i1 = n;
        byte byte0;
        if (flag)
        {
            byte0 = 0;
        } else
        {
            byte0 = 8;
        }
        n = byte0 | i1 & 8;
        return this;
    }
}
