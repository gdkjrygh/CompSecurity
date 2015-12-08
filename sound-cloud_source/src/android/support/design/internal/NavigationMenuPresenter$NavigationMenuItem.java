// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.design.internal;

import android.support.v7.internal.view.menu.h;

// Referenced classes of package android.support.design.internal:
//            NavigationMenuPresenter

private static class mPaddingBottom
{

    private final h mMenuItem;
    private final int mPaddingBottom;
    private final int mPaddingTop;

    public static mPaddingBottom of(h h1)
    {
        return new <init>(h1, 0, 0);
    }

    public static <init> separator(int i, int j)
    {
        return new <init>(null, i, j);
    }

    public h getMenuItem()
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

    private (h h1, int i, int j)
    {
        mMenuItem = h1;
        mPaddingTop = i;
        mPaddingBottom = j;
    }
}
