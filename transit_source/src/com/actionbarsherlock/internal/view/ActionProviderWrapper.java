// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.actionbarsherlock.internal.view;

import android.view.ActionProvider;
import android.view.SubMenu;
import android.view.View;
import com.actionbarsherlock.internal.view.menu.SubMenuWrapper;

public class ActionProviderWrapper extends ActionProvider
{

    private final com.actionbarsherlock.view.ActionProvider mProvider;

    public ActionProviderWrapper(com.actionbarsherlock.view.ActionProvider actionprovider)
    {
        super(null);
        mProvider = actionprovider;
    }

    public boolean hasSubMenu()
    {
        return mProvider.hasSubMenu();
    }

    public View onCreateActionView()
    {
        return mProvider.onCreateActionView();
    }

    public boolean onPerformDefaultAction()
    {
        return mProvider.onPerformDefaultAction();
    }

    public void onPrepareSubMenu(SubMenu submenu)
    {
        mProvider.onPrepareSubMenu(new SubMenuWrapper(submenu));
    }

    public com.actionbarsherlock.view.ActionProvider unwrap()
    {
        return mProvider;
    }
}
