// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package bo.app;

import com.appboy.events.IEventSubscriber;

// Referenced classes of package bo.app:
//            bb

final class bd
    implements Runnable
{

    final IEventSubscriber a;
    final Object b;
    final bb c;

    bd(bb bb, IEventSubscriber ieventsubscriber, Object obj)
    {
        c = bb;
        a = ieventsubscriber;
        b = obj;
        super();
    }

    public final void run()
    {
        a.trigger(b);
    }
}
