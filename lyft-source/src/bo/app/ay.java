// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package bo.app;

import com.appboy.events.IEventSubscriber;

// Referenced classes of package bo.app:
//            bk, at, ch

public final class ay
    implements IEventSubscriber
{

    final at a;

    public ay(at at1)
    {
        a = at1;
        super();
    }

    public final void trigger(Object obj)
    {
        obj = (bk)obj;
        at.g(a).a(((bk) (obj)).a);
    }
}
