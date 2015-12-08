// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.facades;

import me.lyft.android.ui.IViewErrorHandler;
import rx.functions.Action1;

// Referenced classes of package me.lyft.android.facades:
//            UserModeSwitchFacade

class this._cls0
    implements Action1
{

    final UserModeSwitchFacade this$0;

    public volatile void call(Object obj)
    {
        call((Throwable)obj);
    }

    public void call(Throwable throwable)
    {
        UserModeSwitchFacade.access$200(UserModeSwitchFacade.this).handle(throwable);
    }

    ()
    {
        this$0 = UserModeSwitchFacade.this;
        super();
    }
}
