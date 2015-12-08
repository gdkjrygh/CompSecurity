// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.application.polling;

import me.lyft.android.application.IUserProvider;
import rx.functions.Action1;

// Referenced classes of package me.lyft.android.application.polling:
//            BackgroundLocationAppProcess

class this._cls0
    implements Action1
{

    final BackgroundLocationAppProcess this$0;

    public void call(Boolean boolean1)
    {
        me.lyft.android.domain.User user = BackgroundLocationAppProcess.access$200(BackgroundLocationAppProcess.this).getUser();
        BackgroundLocationAppProcess.access$100(BackgroundLocationAppProcess.this, user, boolean1.booleanValue());
    }

    public volatile void call(Object obj)
    {
        call((Boolean)obj);
    }

    ()
    {
        this$0 = BackgroundLocationAppProcess.this;
        super();
    }
}
