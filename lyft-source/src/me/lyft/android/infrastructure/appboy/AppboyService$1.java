// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.infrastructure.appboy;

import me.lyft.android.domain.User;
import rx.functions.Action1;

// Referenced classes of package me.lyft.android.infrastructure.appboy:
//            AppboyService

class this._cls0
    implements Action1
{

    final AppboyService this$0;

    public volatile void call(Object obj)
    {
        call((User)obj);
    }

    public void call(User user)
    {
        AppboyService.access$000(AppboyService.this, user);
        AppboyService.access$100(AppboyService.this);
    }

    ()
    {
        this$0 = AppboyService.this;
        super();
    }
}
