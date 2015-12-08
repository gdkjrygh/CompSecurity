// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.application.polling;

import me.lyft.android.domain.User;
import me.lyft.android.infrastructure.foreground.IAppForegroundDetector;
import rx.functions.Action1;

// Referenced classes of package me.lyft.android.application.polling:
//            BackgroundLocationAppProcess

class this._cls0
    implements Action1
{

    final BackgroundLocationAppProcess this$0;

    public volatile void call(Object obj)
    {
        call((User)obj);
    }

    public void call(User user)
    {
        boolean flag = BackgroundLocationAppProcess.access$000(BackgroundLocationAppProcess.this).isForegrounded();
        BackgroundLocationAppProcess.access$100(BackgroundLocationAppProcess.this, user, flag);
    }

    ()
    {
        this$0 = BackgroundLocationAppProcess.this;
        super();
    }
}
