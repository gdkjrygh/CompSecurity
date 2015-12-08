// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

public final class vm
    implements fr
{

    private final int a = 0x102002c;
    private final int b = 0;
    private final int c = 0;
    private CharSequence d;
    private CharSequence e;
    private Intent f;
    private char g;
    private char h;
    private Drawable i;
    private Context j;
    private int k;

    public vm(Context context, int l, int i1, int j1, int k1, CharSequence charsequence)
    {
        k = 16;
        j = context;
        d = charsequence;
    }

    public final fr a(km km)
    {
        throw new UnsupportedOperationException();
    }

    public final fr a(ls ls)
    {
        return this;
    }

    public final km a()
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
        return h;
    }

    public final int getGroupId()
    {
        return b;
    }

    public final Drawable getIcon()
    {
        return i;
    }

    public final Intent getIntent()
    {
        return f;
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
        return g;
    }

    public final int getOrder()
    {
        return c;
    }

    public final SubMenu getSubMenu()
    {
        return null;
    }

    public final CharSequence getTitle()
    {
        return d;
    }

    public final CharSequence getTitleCondensed()
    {
        if (e != null)
        {
            return e;
        } else
        {
            return d;
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
        return (k & 1) != 0;
    }

    public final boolean isChecked()
    {
        return (k & 2) != 0;
    }

    public final boolean isEnabled()
    {
        return (k & 0x10) != 0;
    }

    public final boolean isVisible()
    {
        return (k & 8) == 0;
    }

    public final MenuItem setActionProvider(ActionProvider actionprovider)
    {
        throw new UnsupportedOperationException();
    }

    public final MenuItem setActionView(int l)
    {
        throw new UnsupportedOperationException();
    }

    public final MenuItem setActionView(View view)
    {
        throw new UnsupportedOperationException();
    }

    public final MenuItem setAlphabeticShortcut(char c1)
    {
        h = c1;
        return this;
    }

    public final MenuItem setCheckable(boolean flag)
    {
        int l = k;
        boolean flag1;
        if (flag)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        k = flag1 | l & -2;
        return this;
    }

    public final MenuItem setChecked(boolean flag)
    {
        int l = k;
        byte byte0;
        if (flag)
        {
            byte0 = 2;
        } else
        {
            byte0 = 0;
        }
        k = byte0 | l & -3;
        return this;
    }

    public final MenuItem setEnabled(boolean flag)
    {
        int l = k;
        byte byte0;
        if (flag)
        {
            byte0 = 16;
        } else
        {
            byte0 = 0;
        }
        k = byte0 | l & 0xffffffef;
        return this;
    }

    public final MenuItem setIcon(int l)
    {
        i = ed.a(j, l);
        return this;
    }

    public final MenuItem setIcon(Drawable drawable)
    {
        i = drawable;
        return this;
    }

    public final MenuItem setIntent(Intent intent)
    {
        f = intent;
        return this;
    }

    public final MenuItem setNumericShortcut(char c1)
    {
        g = c1;
        return this;
    }

    public final MenuItem setOnActionExpandListener(android.view.MenuItem.OnActionExpandListener onactionexpandlistener)
    {
        throw new UnsupportedOperationException();
    }

    public final MenuItem setOnMenuItemClickListener(android.view.MenuItem.OnMenuItemClickListener onmenuitemclicklistener)
    {
        return this;
    }

    public final MenuItem setShortcut(char c1, char c2)
    {
        g = c1;
        h = c2;
        return this;
    }

    public final void setShowAsAction(int l)
    {
    }

    public final MenuItem setShowAsActionFlags(int l)
    {
        setShowAsAction(l);
        return this;
    }

    public final MenuItem setTitle(int l)
    {
        d = j.getResources().getString(l);
        return this;
    }

    public final MenuItem setTitle(CharSequence charsequence)
    {
        d = charsequence;
        return this;
    }

    public final MenuItem setTitleCondensed(CharSequence charsequence)
    {
        e = charsequence;
        return this;
    }

    public final MenuItem setVisible(boolean flag)
    {
        int l = k;
        byte byte0;
        if (flag)
        {
            byte0 = 0;
        } else
        {
            byte0 = 8;
        }
        k = byte0 | l & 8;
        return this;
    }
}
