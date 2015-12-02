// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.chatheads.a;

import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import com.actionbarsherlock.a.d;

// Referenced classes of package com.facebook.orca.chatheads.a:
//            b, a

public class c extends b
    implements SubMenu
{

    private final d a;
    private MenuItem b;

    public c(d d1)
    {
        super(d1);
        b = null;
        a = d1;
    }

    public void clearHeader()
    {
        a.m();
    }

    public MenuItem getItem()
    {
        if (b == null)
        {
            b = new a(a.q());
        }
        return b;
    }

    public SubMenu setHeaderIcon(int i)
    {
        a.l(i);
        return this;
    }

    public SubMenu setHeaderIcon(Drawable drawable)
    {
        a.c(drawable);
        return this;
    }

    public SubMenu setHeaderTitle(int i)
    {
        a.m(i);
        return this;
    }

    public SubMenu setHeaderTitle(CharSequence charsequence)
    {
        a.d(charsequence);
        return this;
    }

    public SubMenu setHeaderView(View view)
    {
        a.b(view);
        return this;
    }

    public SubMenu setIcon(int i)
    {
        a.k(i);
        return this;
    }

    public SubMenu setIcon(Drawable drawable)
    {
        a.b(drawable);
        return this;
    }
}
