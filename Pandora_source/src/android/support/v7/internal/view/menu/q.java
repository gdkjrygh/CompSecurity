// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.view.menu;

import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import p.c.c;

// Referenced classes of package android.support.v7.internal.view.menu:
//            o

class q extends o
    implements c
{

    q(SubMenu submenu)
    {
        super(submenu);
    }

    public void clearHeader()
    {
        ((SubMenu)a).clearHeader();
    }

    public MenuItem getItem()
    {
        return a(((SubMenu)a).getItem());
    }

    public SubMenu setHeaderIcon(int i)
    {
        ((SubMenu)a).setHeaderIcon(i);
        return this;
    }

    public SubMenu setHeaderIcon(Drawable drawable)
    {
        ((SubMenu)a).setHeaderIcon(drawable);
        return this;
    }

    public SubMenu setHeaderTitle(int i)
    {
        ((SubMenu)a).setHeaderTitle(i);
        return this;
    }

    public SubMenu setHeaderTitle(CharSequence charsequence)
    {
        ((SubMenu)a).setHeaderTitle(charsequence);
        return this;
    }

    public SubMenu setHeaderView(View view)
    {
        ((SubMenu)a).setHeaderView(view);
        return this;
    }

    public SubMenu setIcon(int i)
    {
        ((SubMenu)a).setIcon(i);
        return this;
    }

    public SubMenu setIcon(Drawable drawable)
    {
        ((SubMenu)a).setIcon(drawable);
        return this;
    }
}
