// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.view.menu;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.v4.c.a.c;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

// Referenced classes of package android.support.v7.internal.view.menu:
//            z

class ab extends z
    implements SubMenu
{

    ab(Context context, c c1)
    {
        super(context, c1);
    }

    public c b()
    {
        return (c)b;
    }

    public void clearHeader()
    {
        b().clearHeader();
    }

    public MenuItem getItem()
    {
        return a(b().getItem());
    }

    public SubMenu setHeaderIcon(int i)
    {
        b().setHeaderIcon(i);
        return this;
    }

    public SubMenu setHeaderIcon(Drawable drawable)
    {
        b().setHeaderIcon(drawable);
        return this;
    }

    public SubMenu setHeaderTitle(int i)
    {
        b().setHeaderTitle(i);
        return this;
    }

    public SubMenu setHeaderTitle(CharSequence charsequence)
    {
        b().setHeaderTitle(charsequence);
        return this;
    }

    public SubMenu setHeaderView(View view)
    {
        b().setHeaderView(view);
        return this;
    }

    public SubMenu setIcon(int i)
    {
        b().setIcon(i);
        return this;
    }

    public SubMenu setIcon(Drawable drawable)
    {
        b().setIcon(drawable);
        return this;
    }
}
