// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.application.polling;

import me.lyft.android.application.IUserProvider;
import rx.functions.Action1;

// Referenced classes of package me.lyft.android.application.polling:
//            PollingAppProcess

class this._cls0
    implements Action1
{

    final PollingAppProcess this$0;

    public void call(Boolean boolean1)
    {
        me.lyft.android.domain.User user = PollingAppProcess.access$200(PollingAppProcess.this).getUser();
        PollingAppProcess.access$100(PollingAppProcess.this, user, boolean1.booleanValue());
    }

    public volatile void call(Object obj)
    {
        call((Boolean)obj);
    }

    ()
    {
        this$0 = PollingAppProcess.this;
        super();
    }
}
