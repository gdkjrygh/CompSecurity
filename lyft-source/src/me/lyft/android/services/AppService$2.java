// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.services;

import me.lyft.android.domain.User;
import rx.functions.Action1;

// Referenced classes of package me.lyft.android.services:
//            AppService

class this._cls0
    implements Action1
{

    final AppService this$0;

    public volatile void call(Object obj)
    {
        call((User)obj);
    }

    public void call(User user)
    {
        if (user.isInDriverMode())
        {
            AppService.access$000(AppService.this);
            return;
        } else
        {
            AppService.access$100(AppService.this);
            return;
        }
    }

    ()
    {
        this$0 = AppService.this;
        super();
    }
}
