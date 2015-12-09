// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.app;

import android.support.v7.internal.view.menu.MenuBuilder;

// Referenced classes of package android.support.v7.internal.app:
//            ToolbarActionBar

private final class <init>
    implements android.support.v7.internal.view.menu.
{

    final ToolbarActionBar this$0;

    public final void onCloseMenu(MenuBuilder menubuilder, boolean flag)
    {
        if (mWindowCallback != null)
        {
            mWindowCallback.allback(0, menubuilder);
        }
    }

    public final boolean onOpenSubMenu(MenuBuilder menubuilder)
    {
        if (menubuilder == null && mWindowCallback != null)
        {
            mWindowCallback.allback(0, menubuilder);
        }
        return true;
    }

    private Q()
    {
        this$0 = ToolbarActionBar.this;
        super();
    }

    this._cls0(byte byte0)
    {
        this();
    }
}
