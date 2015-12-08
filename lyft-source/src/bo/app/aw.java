// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package bo.app;

import com.appboy.events.IEventSubscriber;

// Referenced classes of package bo.app:
//            at, ch

public final class aw
    implements IEventSubscriber
{

    final at a;

    public aw(at at1)
    {
        a = at1;
        super();
    }

    public final void trigger(Object obj)
    {
        at.g(a).a();
    }
}
