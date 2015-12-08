// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.app;

import android.support.v7.internal.view.menu.f;
import android.support.v7.internal.widget.DecorToolbar;

// Referenced classes of package android.support.v7.internal.app:
//            ToolbarActionBar

private final class <init>
    implements android.support.v7.internal.view.menu.
{

    private boolean mClosingActionMenu;
    final ToolbarActionBar this$0;

    public final void onCloseMenu(f f, boolean flag)
    {
        if (mClosingActionMenu)
        {
            return;
        }
        mClosingActionMenu = true;
        ToolbarActionBar.access$300(ToolbarActionBar.this).dismissPopupMenus();
        if (ToolbarActionBar.access$000(ToolbarActionBar.this) != null)
        {
            ToolbarActionBar.access$000(ToolbarActionBar.this)._mth0(8, f);
        }
        mClosingActionMenu = false;
    }

    public final boolean onOpenSubMenu(f f)
    {
        if (ToolbarActionBar.access$000(ToolbarActionBar.this) != null)
        {
            ToolbarActionBar.access$000(ToolbarActionBar.this)._mth0(8, f);
            return true;
        } else
        {
            return false;
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
