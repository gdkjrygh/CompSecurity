// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.app;

import android.support.v7.view.menu.MenuBuilder;

// Referenced classes of package android.support.v7.app:
//            ToolbarActionBar

private final class <init>
    implements android.support.v7.view.menu.
{

    final ToolbarActionBar this$0;

    public void onCloseMenu(MenuBuilder menubuilder, boolean flag)
    {
        if (ToolbarActionBar.access$000(ToolbarActionBar.this) != null)
        {
            ToolbarActionBar.access$000(ToolbarActionBar.this)._mth0(0, menubuilder);
        }
    }

    public boolean onOpenSubMenu(MenuBuilder menubuilder)
    {
        if (menubuilder == null && ToolbarActionBar.access$000(ToolbarActionBar.this) != null)
        {
            ToolbarActionBar.access$000(ToolbarActionBar.this)._mth0(0, menubuilder);
        }
        return true;
    }

    private ()
    {
        this$0 = ToolbarActionBar.this;
        super();
    }

    this._cls0(this._cls0 _pcls0)
    {
        this();
    }
}
