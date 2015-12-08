// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.view.menu;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.v4.internal.view.c;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

// Referenced classes of package android.support.v7.internal.view.menu:
//            n

final class p extends n
    implements SubMenu
{

    p(Context context, c c1)
    {
        super(context, c1);
    }

    public final void clearHeader()
    {
        ((c)b).clearHeader();
    }

    public final MenuItem getItem()
    {
        return a(((c)b).getItem());
    }

    public final SubMenu setHeaderIcon(int i)
    {
        ((c)b).setHeaderIcon(i);
        return this;
    }

    public final SubMenu setHeaderIcon(Drawable drawable)
    {
        ((c)b).setHeaderIcon(drawable);
        return this;
    }

    public final SubMenu setHeaderTitle(int i)
    {
        ((c)b).setHeaderTitle(i);
        return this;
    }

    public final SubMenu setHeaderTitle(CharSequence charsequence)
    {
        ((c)b).setHeaderTitle(charsequence);
        return this;
    }

    public final SubMenu setHeaderView(View view)
    {
        ((c)b).setHeaderView(view);
        return this;
    }

    public final SubMenu setIcon(int i)
    {
        ((c)b).setIcon(i);
        return this;
    }

    public final SubMenu setIcon(Drawable drawable)
    {
        ((c)b).setIcon(drawable);
        return this;
    }
}
