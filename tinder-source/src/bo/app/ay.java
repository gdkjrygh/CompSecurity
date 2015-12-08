// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package bo.app;

import com.appboy.events.IEventSubscriber;

// Referenced classes of package bo.app:
//            aw

final class ay
    implements Runnable
{

    final IEventSubscriber a;
    final Object b;
    final aw c;

    ay(aw aw, IEventSubscriber ieventsubscriber, Object obj)
    {
        c = aw;
        a = ieventsubscriber;
        b = obj;
        super();
    }

    public final void run()
    {
        a.trigger(b);
    }
}
