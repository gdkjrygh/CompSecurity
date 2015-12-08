// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.actionbarsherlock.view;

import android.graphics.drawable.Drawable;
import android.view.View;

// Referenced classes of package com.actionbarsherlock.view:
//            Menu, MenuItem

public interface SubMenu
    extends Menu
{

    public abstract void clearHeader();

    public abstract MenuItem getItem();

    public abstract SubMenu setHeaderIcon(int i);

    public abstract SubMenu setHeaderIcon(Drawable drawable);

    public abstract SubMenu setHeaderTitle(int i);

    public abstract SubMenu setHeaderTitle(CharSequence charsequence);

    public abstract SubMenu setHeaderView(View view);

    public abstract SubMenu setIcon(int i);

    public abstract SubMenu setIcon(Drawable drawable);
}
