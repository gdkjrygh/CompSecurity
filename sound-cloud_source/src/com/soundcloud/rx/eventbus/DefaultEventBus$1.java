// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.rx.eventbus;

import rx.b.a;

// Referenced classes of package com.soundcloud.rx.eventbus:
//            DefaultEventBus, Queue

class val.event
    implements a
{

    final DefaultEventBus this$0;
    final Object val$event;
    final Queue val$queue;

    public void call()
    {
        publish(val$queue, val$event);
    }

    ()
    {
        this$0 = final_defaulteventbus;
        val$queue = queue1;
        val$event = Object.this;
        super();
    }
}
