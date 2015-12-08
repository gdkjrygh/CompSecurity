// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package bo.app;

import com.appboy.events.IEventSubscriber;
import com.appboy.support.AppboyLogger;
import java.util.concurrent.Semaphore;

// Referenced classes of package bo.app:
//            ao, br

public final class au
    implements IEventSubscriber
{

    final Semaphore a = null;
    final ao b;

    public au(ao ao1)
    {
        b = ao1;
        super();
    }

    public final void trigger(Object obj)
    {
        obj = (Throwable)obj;
        ao.j(b).a(((Throwable) (obj)));
        if (a != null)
        {
            a.release();
        }
_L2:
        return;
        obj;
        AppboyLogger.e(ao.a(), "Failed to log error.", ((Throwable) (obj)));
        if (a == null) goto _L2; else goto _L1
_L1:
        a.release();
        return;
        obj;
        if (a != null)
        {
            a.release();
        }
        throw obj;
    }
}
