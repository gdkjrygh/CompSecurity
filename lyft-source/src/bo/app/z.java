// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package bo.app;

import com.appboy.events.IEventSubscriber;

// Referenced classes of package bo.app:
//            ap, u

public final class z
    implements IEventSubscriber
{

    final u a;

    public z(u u1)
    {
        a = u1;
        super();
    }

    public final void trigger(Object obj)
    {
        u.a(a, ap.b);
        a.c();
    }
}
