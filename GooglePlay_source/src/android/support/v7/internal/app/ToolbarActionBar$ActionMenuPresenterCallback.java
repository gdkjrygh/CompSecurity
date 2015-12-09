// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.app;

import android.support.v7.internal.view.menu.MenuBuilder;
import android.support.v7.internal.widget.DecorToolbar;

// Referenced classes of package android.support.v7.internal.app:
//            ToolbarActionBar

private final class <init>
    implements android.support.v7.internal.view.menu.
{

    private boolean mClosingActionMenu;
    final ToolbarActionBar this$0;

    public final void onCloseMenu(MenuBuilder menubuilder, boolean flag)
    {
        if (mClosingActionMenu)
        {
            return;
        }
        mClosingActionMenu = true;
        mDecorToolbar.dismissPopupMenus();
        if (mWindowCallback != null)
        {
            mWindowCallback.llback(8, menubuilder);
        }
        mClosingActionMenu = false;
    }

    public final boolean onOpenSubMenu(MenuBuilder menubuilder)
    {
        if (mWindowCallback != null)
        {
            mWindowCallback.llback(8, menubuilder);
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

    this._cls0(byte byte0)
    {
        this();
    }
}
