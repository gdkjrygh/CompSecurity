// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.design.internal;

import android.content.Context;
import android.support.v7.view.menu.MenuBuilder;
import android.support.v7.view.menu.MenuItemImpl;
import android.view.SubMenu;

// Referenced classes of package android.support.design.internal:
//            NavigationSubMenu

public class NavigationMenu extends MenuBuilder
{

    public NavigationMenu(Context context)
    {
        super(context);
    }

    public SubMenu addSubMenu(int i, int j, int k, CharSequence charsequence)
    {
        charsequence = (MenuItemImpl)addInternal(i, j, k, charsequence);
        NavigationSubMenu navigationsubmenu = new NavigationSubMenu(getContext(), this, charsequence);
        charsequence.setSubMenu(navigationsubmenu);
        return navigationsubmenu;
    }
}
