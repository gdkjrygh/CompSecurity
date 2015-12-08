// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.view.menu;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.v4.internal.view.SupportSubMenu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

// Referenced classes of package android.support.v7.internal.view.menu:
//            MenuWrapperICS

final class SubMenuWrapperICS extends MenuWrapperICS
    implements SubMenu
{

    SubMenuWrapperICS(Context context, SupportSubMenu supportsubmenu)
    {
        super(context, supportsubmenu);
    }

    public final void clearHeader()
    {
        ((SupportSubMenu)mWrappedObject).clearHeader();
    }

    public final MenuItem getItem()
    {
        return getMenuItemWrapper(((SupportSubMenu)mWrappedObject).getItem());
    }

    public final SubMenu setHeaderIcon(int i)
    {
        ((SupportSubMenu)mWrappedObject).setHeaderIcon(i);
        return this;
    }

    public final SubMenu setHeaderIcon(Drawable drawable)
    {
        ((SupportSubMenu)mWrappedObject).setHeaderIcon(drawable);
        return this;
    }

    public final SubMenu setHeaderTitle(int i)
    {
        ((SupportSubMenu)mWrappedObject).setHeaderTitle(i);
        return this;
    }

    public final SubMenu setHeaderTitle(CharSequence charsequence)
    {
        ((SupportSubMenu)mWrappedObject).setHeaderTitle(charsequence);
        return this;
    }

    public final SubMenu setHeaderView(View view)
    {
        ((SupportSubMenu)mWrappedObject).setHeaderView(view);
        return this;
    }

    public final SubMenu setIcon(int i)
    {
        ((SupportSubMenu)mWrappedObject).setIcon(i);
        return this;
    }

    public final SubMenu setIcon(Drawable drawable)
    {
        ((SupportSubMenu)mWrappedObject).setIcon(drawable);
        return this;
    }
}
