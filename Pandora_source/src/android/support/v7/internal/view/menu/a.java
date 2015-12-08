// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.view.menu;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.support.v4.view.d;
import android.view.ActionProvider;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import p.c.b;

public class a
    implements b
{

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
    private Context l;
    private android.view.MenuItem.OnMenuItemClickListener m;
    private int n;

    public a(Context context, int i1, int j1, int k1, int l1, CharSequence charsequence)
    {
        k = 0;
        n = 16;
        l = context;
        a = j1;
        b = i1;
        c = k1;
        d = l1;
        e = charsequence;
    }

    public b a(int i1)
    {
        throw new UnsupportedOperationException();
    }

    public b a(d d1)
    {
        throw new UnsupportedOperationException();
    }

    public b a(View view)
    {
        throw new UnsupportedOperationException();
    }

    public b b(int i1)
    {
        setShowAsAction(i1);
        return this;
    }

    public boolean collapseActionView()
    {
        return false;
    }

    public boolean expandActionView()
    {
        return false;
    }

    public ActionProvider getActionProvider()
    {
        throw new UnsupportedOperationException();
    }

    public View getActionView()
    {
        return null;
    }

    public char getAlphabeticShortcut()
    {
        return i;
    }

    public int getGroupId()
    {
        return b;
    }

    public Drawable getIcon()
    {
        return j;
    }

    public Intent getIntent()
    {
        return g;
    }

    public int getItemId()
    {
        return a;
    }

    public android.view.ContextMenu.ContextMenuInfo getMenuInfo()
    {
        return null;
    }

    public char getNumericShortcut()
    {
        return h;
    }

    public int getOrder()
    {
        return d;
    }

    public SubMenu getSubMenu()
    {
        return null;
    }

    public CharSequence getTitle()
    {
        return e;
    }

    public CharSequence getTitleCondensed()
    {
        return f;
    }

    public boolean hasSubMenu()
    {
        return false;
    }

    public boolean isActionViewExpanded()
    {
        return false;
    }

    public boolean isCheckable()
    {
        return (n & 1) != 0;
    }

    public boolean isChecked()
    {
        return (n & 2) != 0;
    }

    public boolean isEnabled()
    {
        return (n & 0x10) != 0;
    }

    public boolean isVisible()
    {
        return (n & 8) == 0;
    }

    public MenuItem setActionProvider(ActionProvider actionprovider)
    {
        throw new UnsupportedOperationException();
    }

    public MenuItem setActionView(int i1)
    {
        return a(i1);
    }

    public MenuItem setActionView(View view)
    {
        return a(view);
    }

    public MenuItem setAlphabeticShortcut(char c1)
    {
        i = c1;
        return this;
    }

    public MenuItem setCheckable(boolean flag)
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

    public MenuItem setChecked(boolean flag)
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

    public MenuItem setEnabled(boolean flag)
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

    public MenuItem setIcon(int i1)
    {
        k = i1;
        j = l.getResources().getDrawable(i1);
        return this;
    }

    public MenuItem setIcon(Drawable drawable)
    {
        j = drawable;
        k = 0;
        return this;
    }

    public MenuItem setIntent(Intent intent)
    {
        g = intent;
        return this;
    }

    public MenuItem setNumericShortcut(char c1)
    {
        h = c1;
        return this;
    }

    public MenuItem setOnActionExpandListener(android.view.MenuItem.OnActionExpandListener onactionexpandlistener)
    {
        throw new UnsupportedOperationException();
    }

    public MenuItem setOnMenuItemClickListener(android.view.MenuItem.OnMenuItemClickListener onmenuitemclicklistener)
    {
        m = onmenuitemclicklistener;
        return this;
    }

    public MenuItem setShortcut(char c1, char c2)
    {
        h = c1;
        i = c2;
        return this;
    }

    public void setShowAsAction(int i1)
    {
    }

    public MenuItem setShowAsActionFlags(int i1)
    {
        return b(i1);
    }

    public MenuItem setTitle(int i1)
    {
        e = l.getResources().getString(i1);
        return this;
    }

    public MenuItem setTitle(CharSequence charsequence)
    {
        e = charsequence;
        return this;
    }

    public MenuItem setTitleCondensed(CharSequence charsequence)
    {
        f = charsequence;
        return this;
    }

    public MenuItem setVisible(boolean flag)
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
