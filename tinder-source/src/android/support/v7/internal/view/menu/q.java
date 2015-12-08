// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.view.menu;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.v4.d.a.c;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

// Referenced classes of package android.support.v7.internal.view.menu:
//            o

final class q extends o
    implements SubMenu
{

    q(Context context, c c1)
    {
        super(context, c1);
    }

    public final void clearHeader()
    {
        ((c)d).clearHeader();
    }

    public final MenuItem getItem()
    {
        return a(((c)d).getItem());
    }

    public final SubMenu setHeaderIcon(int i)
    {
        ((c)d).setHeaderIcon(i);
        return this;
    }

    public final SubMenu setHeaderIcon(Drawable drawable)
    {
        ((c)d).setHeaderIcon(drawable);
        return this;
    }

    public final SubMenu setHeaderTitle(int i)
    {
        ((c)d).setHeaderTitle(i);
        return this;
    }

    public final SubMenu setHeaderTitle(CharSequence charsequence)
    {
        ((c)d).setHeaderTitle(charsequence);
        return this;
    }

    public final SubMenu setHeaderView(View view)
    {
        ((c)d).setHeaderView(view);
        return this;
    }

    public final SubMenu setIcon(int i)
    {
        ((c)d).setIcon(i);
        return this;
    }

    public final SubMenu setIcon(Drawable drawable)
    {
        ((c)d).setIcon(drawable);
        return this;
    }
}
