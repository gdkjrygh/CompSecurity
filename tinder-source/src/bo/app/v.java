// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package bo.app;

import com.appboy.events.IEventSubscriber;

// Referenced classes of package bo.app:
//            ak, s

public final class v
    implements IEventSubscriber
{

    final s a;

    public v(s s1)
    {
        a = s1;
        super();
    }

    public final void trigger(Object obj)
    {
        s.a(a, ak.b);
        a.c();
    }
}
