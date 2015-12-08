// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.ui.c;

import android.view.ContextMenu;
import android.view.Menu;
import android.view.View;

public class a
{

    private ContextMenu a;
    private View b;
    private android.view.ContextMenu.ContextMenuInfo c;

    public a()
    {
        a = null;
        b = null;
        c = null;
    }

    public ContextMenu a()
    {
        return a;
    }

    public void a(ContextMenu contextmenu, View view, android.view.ContextMenu.ContextMenuInfo contextmenuinfo)
    {
        if (contextmenu.hasVisibleItems())
        {
            a = contextmenu;
            b = view;
            c = contextmenuinfo;
        }
    }

    public void a(Menu menu)
    {
        a = null;
        b = null;
        c = null;
    }

    public View b()
    {
        return b;
    }

    public android.view.ContextMenu.ContextMenuInfo c()
    {
        return c;
    }
}
