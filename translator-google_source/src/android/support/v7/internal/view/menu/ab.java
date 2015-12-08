// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.support.v4.content.g;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

// Referenced classes of package android.support.v7.internal.view.menu:
//            i, m, j

public final class ab extends i
    implements SubMenu
{

    public i l;
    private m m;

    public ab(Context context, i j, m m1)
    {
        super(context);
        l = j;
        m = m1;
    }

    public final String a()
    {
        int j;
        if (m != null)
        {
            j = m.getItemId();
        } else
        {
            j = 0;
        }
        if (j == 0)
        {
            return null;
        } else
        {
            return (new StringBuilder()).append(super.a()).append(":").append(j).toString();
        }
    }

    public final void a(j j)
    {
        l.a(j);
    }

    final boolean a(i j, MenuItem menuitem)
    {
        return super.a(j, menuitem) || l.a(j, menuitem);
    }

    public final boolean a(m m1)
    {
        return l.a(m1);
    }

    public final boolean b()
    {
        return l.b();
    }

    public final boolean b(m m1)
    {
        return l.b(m1);
    }

    public final boolean c()
    {
        return l.c();
    }

    public final MenuItem getItem()
    {
        return m;
    }

    public final i k()
    {
        return l;
    }

    public final SubMenu setHeaderIcon(int j)
    {
        super.a(g.a(super.a, j));
        return this;
    }

    public final SubMenu setHeaderIcon(Drawable drawable)
    {
        super.a(drawable);
        return this;
    }

    public final SubMenu setHeaderTitle(int j)
    {
        super.a(super.a.getResources().getString(j));
        return this;
    }

    public final SubMenu setHeaderTitle(CharSequence charsequence)
    {
        super.a(charsequence);
        return this;
    }

    public final SubMenu setHeaderView(View view)
    {
        super.a(null, null, view);
        return this;
    }

    public final SubMenu setIcon(int j)
    {
        m.setIcon(j);
        return this;
    }

    public final SubMenu setIcon(Drawable drawable)
    {
        m.setIcon(drawable);
        return this;
    }

    public final void setQwertyMode(boolean flag)
    {
        l.setQwertyMode(flag);
    }
}
