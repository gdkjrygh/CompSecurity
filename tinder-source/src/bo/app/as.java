// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package bo.app;

import android.content.Context;
import com.appboy.events.IEventSubscriber;

// Referenced classes of package bo.app:
//            bf, ao, z

public final class as
    implements IEventSubscriber
{

    final ao a;

    public as(ao ao1)
    {
        a = ao1;
        super();
    }

    public final void trigger(Object obj)
    {
        obj = (bf)obj;
        ao.f(a).a(((bf) (obj)).a);
        ao.i(a).sendBroadcast(ao.h(a));
    }
}
