// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.support.v4.b.a;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

// Referenced classes of package android.support.v7.internal.view.menu:
//            f, h

public final class p extends f
    implements SubMenu
{

    public f l;
    private h m;

    public p(Context context, f f1, h h1)
    {
        super(context);
        l = f1;
        m = h1;
    }

    public final String a()
    {
        int i;
        if (m != null)
        {
            i = m.getItemId();
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

    public final void a(f.a a1)
    {
        l.a(a1);
    }

    final boolean a(f f1, MenuItem menuitem)
    {
        return super.a(f1, menuitem) || l.a(f1, menuitem);
    }

    public final boolean a(h h1)
    {
        return l.a(h1);
    }

    public final boolean b()
    {
        return l.b();
    }

    public final boolean b(h h1)
    {
        return l.b(h1);
    }

    public final boolean c()
    {
        return l.c();
    }

    public final MenuItem getItem()
    {
        return m;
    }

    public final f k()
    {
        return l;
    }

    public final SubMenu setHeaderIcon(int i)
    {
        super.a(android.support.v4.b.a.a(super.a, i));
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
        super.a(null, null, view);
        return this;
    }

    public final SubMenu setIcon(int i)
    {
        m.setIcon(i);
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
