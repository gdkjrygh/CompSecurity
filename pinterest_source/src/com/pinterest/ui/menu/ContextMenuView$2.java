// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.ui.menu;


// Referenced classes of package com.pinterest.ui.menu:
//            ContextMenuView, ContextMenuItemView

class w
    implements .AnimListener
{

    final ContextMenuView this$0;
    final ContextMenuItemView val$view;

    public void onAnimationCancel()
    {
    }

    public void onAnimationComplete()
    {
        removeView(val$view);
    }

    w()
    {
        this$0 = final_contextmenuview;
        val$view = ContextMenuItemView.this;
        super();
    }
}
