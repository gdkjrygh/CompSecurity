// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.app;

import android.support.v7.internal.view.menu.MenuBuilder;
import android.view.Menu;

// Referenced classes of package android.support.v7.internal.app:
//            ToolbarActionBar

final class this._cls0
    implements Runnable
{

    final ToolbarActionBar this$0;

    public final void run()
    {
        MenuBuilder menubuilder;
        ToolbarActionBar toolbaractionbar = ToolbarActionBar.this;
        Menu menu = toolbaractionbar.getMenu();
        if (menu instanceof MenuBuilder)
        {
            menubuilder = (MenuBuilder)menu;
        } else
        {
            menubuilder = null;
        }
        if (menubuilder != null)
        {
            menubuilder.stopDispatchingItemsChanged();
        }
        menu.clear();
        if (!toolbaractionbar.mWindowCallback.reatePanelMenu(0, menu) || !toolbaractionbar.mWindowCallback.reparePanel(0, null, menu))
        {
            menu.clear();
        }
        if (menubuilder != null)
        {
            menubuilder.startDispatchingItemsChanged();
        }
        return;
        Exception exception;
        exception;
        if (menubuilder != null)
        {
            menubuilder.startDispatchingItemsChanged();
        }
        throw exception;
    }

    ()
    {
        this$0 = ToolbarActionBar.this;
        super();
    }
}
