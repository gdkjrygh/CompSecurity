// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.application.polling;

import me.lyft.android.domain.User;
import me.lyft.android.infrastructure.foreground.IAppForegroundDetector;
import rx.functions.Action1;

// Referenced classes of package me.lyft.android.application.polling:
//            PollingAppProcess

class this._cls0
    implements Action1
{

    final PollingAppProcess this$0;

    public volatile void call(Object obj)
    {
        call((User)obj);
    }

    public void call(User user)
    {
        boolean flag = PollingAppProcess.access$000(PollingAppProcess.this).isForegrounded();
        PollingAppProcess.access$100(PollingAppProcess.this, user, flag);
    }

    Detector()
    {
        this$0 = PollingAppProcess.this;
        super();
    }
}
