// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.design.internal;

import android.support.v7.internal.view.menu.MenuItemImpl;

// Referenced classes of package android.support.design.internal:
//            NavigationMenuPresenter

private static class mPaddingBottom
{

    private final MenuItemImpl mMenuItem;
    private final int mPaddingBottom;
    private final int mPaddingTop;

    public static mPaddingBottom of(MenuItemImpl menuitemimpl)
    {
        return new <init>(menuitemimpl, 0, 0);
    }

    public static <init> separator(int i, int j)
    {
        return new <init>(null, i, j);
    }

    public MenuItemImpl getMenuItem()
    {
        return mMenuItem;
    }

    public int getPaddingBottom()
    {
        return mPaddingBottom;
    }

    public int getPaddingTop()
    {
        return mPaddingTop;
    }

    public boolean isEnabled()
    {
        return mMenuItem != null && !mMenuItem.hasSubMenu() && mMenuItem.isEnabled();
    }

    public boolean isSeparator()
    {
        return mMenuItem == null;
    }

    private (MenuItemImpl menuitemimpl, int i, int j)
    {
        mMenuItem = menuitemimpl;
        mPaddingTop = i;
        mPaddingBottom = j;
    }
}
