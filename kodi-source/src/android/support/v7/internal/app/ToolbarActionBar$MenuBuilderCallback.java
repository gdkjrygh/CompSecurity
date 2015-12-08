// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.app;

import android.support.v7.internal.view.menu.MenuBuilder;
import android.support.v7.internal.widget.DecorToolbar;
import android.view.MenuItem;

// Referenced classes of package android.support.v7.internal.app:
//            ToolbarActionBar

private final class <init>
    implements android.support.v7.internal.view.menu.
{

    final ToolbarActionBar this$0;

    public boolean onMenuItemSelected(MenuBuilder menubuilder, MenuItem menuitem)
    {
        return false;
    }

    public void onMenuModeChange(MenuBuilder menubuilder)
    {
        if (ToolbarActionBar.access$000(ToolbarActionBar.this) != null)
        {
            if (ToolbarActionBar.access$300(ToolbarActionBar.this).isOverflowMenuShowing())
            {
                ToolbarActionBar.access$000(ToolbarActionBar.this)._mth0(8, menubuilder);
            } else
            if (ToolbarActionBar.access$000(ToolbarActionBar.this)._mth0(0, null, menubuilder))
            {
                ToolbarActionBar.access$000(ToolbarActionBar.this)._mth0(8, menubuilder);
                return;
            }
        }
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
