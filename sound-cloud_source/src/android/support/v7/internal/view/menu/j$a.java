// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.view.menu;

import android.content.Context;
import android.support.v4.view.ActionProvider;
import android.view.SubMenu;
import android.view.View;

// Referenced classes of package android.support.v7.internal.view.menu:
//            j

class a extends ActionProvider
{

    final android.view.ActionProvider a;
    final j b;

    public boolean hasSubMenu()
    {
        return a.hasSubMenu();
    }

    public View onCreateActionView()
    {
        return a.onCreateActionView();
    }

    public boolean onPerformDefaultAction()
    {
        return a.onPerformDefaultAction();
    }

    public void onPrepareSubMenu(SubMenu submenu)
    {
        a.onPrepareSubMenu(b.a(submenu));
    }

    public (j j1, Context context, android.view.ActionProvider actionprovider)
    {
        b = j1;
        super(context);
        a = actionprovider;
    }
}
