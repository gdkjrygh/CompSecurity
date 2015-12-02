// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.chatheads.a;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import com.actionbarsherlock.a.b;
import com.actionbarsherlock.a.c;

// Referenced classes of package com.facebook.orca.chatheads.a:
//            c

public class a
    implements MenuItem, c
{

    private final b a;
    private SubMenu b;
    private android.view.MenuItem.OnMenuItemClickListener c;

    public a(b b1)
    {
        b = null;
        c = null;
        if (b1 == null)
        {
            throw new IllegalStateException("Wrapped menu item cannot be null.");
        } else
        {
            a = b1;
            return;
        }
    }

    public boolean a(b b1)
    {
        if (c != null)
        {
            return c.onMenuItemClick(this);
        } else
        {
            return false;
        }
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
        return null;
    }

    public View getActionView()
    {
        return null;
    }

    public char getAlphabeticShortcut()
    {
        return a.h();
    }

    public int getGroupId()
    {
        return a.c();
    }

    public Drawable getIcon()
    {
        return a.q();
    }

    public Intent getIntent()
    {
        return a.g();
    }

    public int getItemId()
    {
        return a.d();
    }

    public android.view.ContextMenu.ContextMenuInfo getMenuInfo()
    {
        return a.v();
    }

    public char getNumericShortcut()
    {
        return a.i();
    }

    public int getOrder()
    {
        return a.e();
    }

    public SubMenu getSubMenu()
    {
        if (hasSubMenu() && b == null)
        {
            b = new com.facebook.orca.chatheads.a.c(a.m());
        }
        return b;
    }

    public CharSequence getTitle()
    {
        return a.o();
    }

    public CharSequence getTitleCondensed()
    {
        return a.p();
    }

    public boolean hasSubMenu()
    {
        return a.n();
    }

    public boolean isActionViewExpanded()
    {
        return false;
    }

    public boolean isCheckable()
    {
        return a.r();
    }

    public boolean isChecked()
    {
        return a.t();
    }

    public boolean isEnabled()
    {
        return a.b();
    }

    public boolean isVisible()
    {
        return a.u();
    }

    public MenuItem setActionProvider(ActionProvider actionprovider)
    {
        return null;
    }

    public MenuItem setActionView(int i)
    {
        return null;
    }

    public MenuItem setActionView(View view)
    {
        return null;
    }

    public MenuItem setAlphabeticShortcut(char c1)
    {
        a.a(c1);
        return this;
    }

    public MenuItem setCheckable(boolean flag)
    {
        a.b(flag);
        return this;
    }

    public MenuItem setChecked(boolean flag)
    {
        a.d(flag);
        return this;
    }

    public MenuItem setEnabled(boolean flag)
    {
        a.a(flag);
        return this;
    }

    public MenuItem setIcon(int i)
    {
        a.b(i);
        return this;
    }

    public MenuItem setIcon(Drawable drawable)
    {
        a.a(drawable);
        return this;
    }

    public MenuItem setIntent(Intent intent)
    {
        a.a(intent);
        return this;
    }

    public MenuItem setNumericShortcut(char c1)
    {
        a.b(c1);
        return this;
    }

    public MenuItem setOnActionExpandListener(android.view.MenuItem.OnActionExpandListener onactionexpandlistener)
    {
        return null;
    }

    public MenuItem setOnMenuItemClickListener(android.view.MenuItem.OnMenuItemClickListener onmenuitemclicklistener)
    {
        c = onmenuitemclicklistener;
        a.a(this);
        return this;
    }

    public MenuItem setShortcut(char c1, char c2)
    {
        a.a(c1, c2);
        return this;
    }

    public void setShowAsAction(int i)
    {
    }

    public MenuItem setShowAsActionFlags(int i)
    {
        return null;
    }

    public MenuItem setTitle(int i)
    {
        a.a(i);
        return this;
    }

    public MenuItem setTitle(CharSequence charsequence)
    {
        a.a(charsequence);
        return this;
    }

    public MenuItem setTitleCondensed(CharSequence charsequence)
    {
        a.b(charsequence);
        return this;
    }

    public MenuItem setVisible(boolean flag)
    {
        a.g(flag);
        return this;
    }
}
