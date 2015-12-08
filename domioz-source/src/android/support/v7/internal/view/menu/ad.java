// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.support.v4.content.a;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

// Referenced classes of package android.support.v7.internal.view.menu:
//            i, m, j

public final class ad extends i
    implements SubMenu
{

    private i d;
    private m e;

    public ad(Context context, i j, m m1)
    {
        super(context);
        d = j;
        e = m1;
    }

    public final void a(j j)
    {
        d.a(j);
    }

    final boolean a(i j, MenuItem menuitem)
    {
        return super.a(j, menuitem) || d.a(j, menuitem);
    }

    public final boolean a(m m1)
    {
        return d.a(m1);
    }

    public final String b()
    {
        int j;
        if (e != null)
        {
            j = e.getItemId();
        } else
        {
            j = 0;
        }
        if (j == 0)
        {
            return null;
        } else
        {
            return (new StringBuilder()).append(super.b()).append(":").append(j).toString();
        }
    }

    public final boolean b(m m1)
    {
        return d.b(m1);
    }

    public final boolean c()
    {
        return d.c();
    }

    public final boolean d()
    {
        return d.d();
    }

    public final MenuItem getItem()
    {
        return e;
    }

    public final i o()
    {
        return d;
    }

    public final Menu r()
    {
        return d;
    }

    public final SubMenu setHeaderIcon(int j)
    {
        super.a(android.support.v4.content.a.a(e(), j));
        return this;
    }

    public final SubMenu setHeaderIcon(Drawable drawable)
    {
        super.a(drawable);
        return this;
    }

    public final SubMenu setHeaderTitle(int j)
    {
        super.a(e().getResources().getString(j));
        return this;
    }

    public final SubMenu setHeaderTitle(CharSequence charsequence)
    {
        super.a(charsequence);
        return this;
    }

    public final SubMenu setHeaderView(View view)
    {
        super.a(view);
        return this;
    }

    public final SubMenu setIcon(int j)
    {
        e.setIcon(j);
        return this;
    }

    public final SubMenu setIcon(Drawable drawable)
    {
        e.setIcon(drawable);
        return this;
    }

    public final void setQwertyMode(boolean flag)
    {
        d.setQwertyMode(flag);
    }
}
