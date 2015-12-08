// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.commands;

import rx.X;

// Referenced classes of package com.soundcloud.android.commands:
//            Command

class val.input
    implements rx.ect
{

    final Command this$0;
    final Object val$input;

    public volatile void call(Object obj)
    {
        call((X)obj);
    }

    public void call(X x)
    {
        try
        {
            x.onNext(Command.this.call(val$input));
            x.onCompleted();
            return;
        }
        catch (Throwable throwable)
        {
            x.onError(throwable);
        }
    }

    ()
    {
        this$0 = final_command;
        val$input = Object.this;
        super();
    }
}
