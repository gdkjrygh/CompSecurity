// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui;

import rx.functions.Action1;

// Referenced classes of package me.lyft.android.ui:
//            MenuView, SlideMenuController

class this._cls0
    implements Action1
{

    final MenuView this$0;

    public void call(Boolean boolean1)
    {
        slideMenuController.close();
        MenuView.access$000(MenuView.this);
    }

    public volatile void call(Object obj)
    {
        call((Boolean)obj);
    }

    ntroller()
    {
        this$0 = MenuView.this;
        super();
    }
}
