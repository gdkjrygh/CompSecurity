// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.view.menu;

import android.graphics.drawable.Drawable;

// Referenced classes of package android.support.v7.view.menu:
//            MenuView, MenuItemImpl

public static interface 
{

    public abstract MenuItemImpl getItemData();

    public abstract void initialize(MenuItemImpl menuitemimpl, int i);

    public abstract boolean prefersCondensedTitle();

    public abstract void setCheckable(boolean flag);

    public abstract void setChecked(boolean flag);

    public abstract void setEnabled(boolean flag);

    public abstract void setIcon(Drawable drawable);

    public abstract void setShortcut(boolean flag, char c);

    public abstract void setTitle(CharSequence charsequence);

    public abstract boolean showsIcon();
}
