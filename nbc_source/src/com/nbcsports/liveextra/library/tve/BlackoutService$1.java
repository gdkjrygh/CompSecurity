// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.library.tve;

import rx.Subscriber;

// Referenced classes of package com.nbcsports.liveextra.library.tve:
//            BlackoutService

class val.blackoutId
    implements rx.ribe
{

    final BlackoutService this$0;
    final String val$blackoutId;

    public volatile void call(Object obj)
    {
        call((Subscriber)obj);
    }

    public void call(Subscriber subscriber)
    {
        BlackoutService.access$002(BlackoutService.this, subscriber);
        BlackoutService.access$100(BlackoutService.this, val$blackoutId);
    }

    ()
    {
        this$0 = final_blackoutservice;
        val$blackoutId = String.this;
        super();
    }
}
