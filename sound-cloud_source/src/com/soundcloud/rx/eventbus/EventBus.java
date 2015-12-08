// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.rx.eventbus;

import rx.P;
import rx.Y;
import rx.b.a;
import rx.b.b;
import rx.g.m;

// Referenced classes of package com.soundcloud.rx.eventbus:
//            Queue

public interface EventBus
{

    public abstract void publish(Queue queue1, Object obj);

    public abstract a publishAction0(Queue queue1, Object obj);

    public abstract b publishAction1(Queue queue1, Object obj);

    public abstract m queue(Queue queue1);

    public abstract Y subscribe(Queue queue1, P p);

    public abstract Y subscribeImmediate(Queue queue1, P p);
}
