// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.design.internal;

import android.content.Context;
import android.support.v7.view.menu.MenuBuilder;
import android.support.v7.view.menu.MenuItemImpl;
import android.support.v7.view.menu.SubMenuBuilder;

// Referenced classes of package android.support.design.internal:
//            NavigationMenu

public class NavigationSubMenu extends SubMenuBuilder
{

    public NavigationSubMenu(Context context, NavigationMenu navigationmenu, MenuItemImpl menuitemimpl)
    {
        super(context, navigationmenu, menuitemimpl);
    }

    public void onItemsChanged(boolean flag)
    {
        super.onItemsChanged(flag);
        ((MenuBuilder)getParentMenu()).onItemsChanged(flag);
    }
}
