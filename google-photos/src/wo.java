// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

public final class wo extends vu
    implements SubMenu
{

    public vu k;
    private vy l;

    public wo(Context context, vu vu1, vy vy1)
    {
        super(context);
        k = vu1;
        l = vy1;
    }

    public final String a()
    {
        int i;
        if (l != null)
        {
            i = l.getItemId();
        } else
        {
            i = 0;
        }
        if (i == 0)
        {
            return null;
        } else
        {
            return (new StringBuilder()).append(super.a()).append(":").append(i).toString();
        }
    }

    public final void a(vv vv)
    {
        k.a(vv);
    }

    final boolean a(vu vu1, MenuItem menuitem)
    {
        return super.a(vu1, menuitem) || k.a(vu1, menuitem);
    }

    public final boolean a(vy vy1)
    {
        return k.a(vy1);
    }

    public final boolean b()
    {
        return k.b();
    }

    public final boolean b(vy vy1)
    {
        return k.b(vy1);
    }

    public final boolean c()
    {
        return k.c();
    }

    public final MenuItem getItem()
    {
        return l;
    }

    public final vu k()
    {
        return k;
    }

    public final SubMenu setHeaderIcon(int i)
    {
        super.a(ed.a(super.a, i));
        return this;
    }

    public final SubMenu setHeaderIcon(Drawable drawable)
    {
        super.a(drawable);
        return this;
    }

    public final SubMenu setHeaderTitle(int i)
    {
        super.a(super.a.getResources().getString(i));
        return this;
    }

    public final SubMenu setHeaderTitle(CharSequence charsequence)
    {
        super.a(charsequence);
        return this;
    }

    public final SubMenu setHeaderView(View view)
    {
        super.a(0, null, 0, null, view);
        return this;
    }

    public final SubMenu setIcon(int i)
    {
        l.setIcon(i);
        return this;
    }

    public final SubMenu setIcon(Drawable drawable)
    {
        l.setIcon(drawable);
        return this;
    }

    public final void setQwertyMode(boolean flag)
    {
        k.setQwertyMode(flag);
    }
}
