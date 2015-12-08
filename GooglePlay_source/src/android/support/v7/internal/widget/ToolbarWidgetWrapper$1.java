// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.widget;

import android.support.v7.internal.view.menu.ActionMenuItem;
import android.support.v7.widget.Toolbar;
import android.view.View;

// Referenced classes of package android.support.v7.internal.widget:
//            ToolbarWidgetWrapper

final class itle
    implements android.view.oolbarWidgetWrapper._cls1
{

    final ActionMenuItem mNavItem;
    final ToolbarWidgetWrapper this$0;

    public final void onClick(View view)
    {
        if (mWindowCallback != null && mMenuPrepared)
        {
            mWindowCallback.temSelected(0, mNavItem);
        }
    }

    ()
    {
        this$0 = ToolbarWidgetWrapper.this;
        super();
        mNavItem = new ActionMenuItem(mToolbar.getContext(), mTitle);
    }
}
