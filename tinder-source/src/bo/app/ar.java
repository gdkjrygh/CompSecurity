// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package bo.app;

import com.appboy.events.IEventSubscriber;

// Referenced classes of package bo.app:
//            ao, cb

public final class ar
    implements IEventSubscriber
{

    final ao a;

    public ar(ao ao1)
    {
        a = ao1;
        super();
    }

    public final void trigger(Object obj)
    {
        ao.g(a).a();
    }
}
