// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.support.v4.a.a;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

// Referenced classes of package android.support.v7.internal.view.menu:
//            g, j, h

public class aa extends g
    implements SubMenu
{

    private g d;
    private j e;

    public aa(Context context, g g1, j j1)
    {
        super(context);
        d = g1;
        e = j1;
    }

    public void a(h h)
    {
        d.a(h);
    }

    public boolean a()
    {
        return d.a();
    }

    boolean a(g g1, MenuItem menuitem)
    {
        return super.a(g1, menuitem) || d.a(g1, menuitem);
    }

    public boolean b()
    {
        return d.b();
    }

    public boolean c(j j1)
    {
        return d.c(j1);
    }

    public boolean d(j j1)
    {
        return d.d(j1);
    }

    public MenuItem getItem()
    {
        return e;
    }

    public g l()
    {
        return d;
    }

    public Menu o()
    {
        return d;
    }

    public SubMenu setHeaderIcon(int i)
    {
        super.a(android.support.v4.a.a.a(d(), i));
        return this;
    }

    public SubMenu setHeaderIcon(Drawable drawable)
    {
        super.a(drawable);
        return this;
    }

    public SubMenu setHeaderTitle(int i)
    {
        super.a(d().getResources().getString(i));
        return this;
    }

    public SubMenu setHeaderTitle(CharSequence charsequence)
    {
        super.a(charsequence);
        return this;
    }

    public SubMenu setHeaderView(View view)
    {
        super.a(view);
        return this;
    }

    public SubMenu setIcon(int i)
    {
        e.setIcon(i);
        return this;
    }

    public SubMenu setIcon(Drawable drawable)
    {
        e.setIcon(drawable);
        return this;
    }

    public void setQwertyMode(boolean flag)
    {
        d.setQwertyMode(flag);
    }
}
