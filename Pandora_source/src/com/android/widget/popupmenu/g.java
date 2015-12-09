// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.widget.popupmenu;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

// Referenced classes of package com.android.widget.popupmenu:
//            a, b

public class g extends a
    implements SubMenu
{

    private a d;
    private b e;

    public g(Context context, a a1, b b1)
    {
        super(context);
        d = a1;
        e = b1;
    }

    public void a(a.a a1)
    {
        d.a(a1);
    }

    public boolean a()
    {
        return d.a();
    }

    public boolean a(a a1, MenuItem menuitem)
    {
        return super.a(a1, menuitem) || d.a(a1, menuitem);
    }

    public boolean b()
    {
        return d.b();
    }

    public boolean c(b b1)
    {
        return d.c(b1);
    }

    public void clearHeader()
    {
    }

    public boolean d(b b1)
    {
        return d.d(b1);
    }

    public MenuItem getItem()
    {
        return e;
    }

    public a j()
    {
        return d;
    }

    public SubMenu setHeaderIcon(int i)
    {
        super.a(d().getResources().getDrawable(i));
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
