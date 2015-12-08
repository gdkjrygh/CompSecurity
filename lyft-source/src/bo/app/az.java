// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package bo.app;

import com.appboy.events.IEventSubscriber;
import com.appboy.support.AppboyLogger;
import java.util.concurrent.Semaphore;

// Referenced classes of package bo.app:
//            at, bx

public final class az
    implements IEventSubscriber
{

    final Semaphore a = null;
    final at b;

    public az(at at1)
    {
        b = at1;
        super();
    }

    public final void trigger(Object obj)
    {
        obj = (Throwable)obj;
        at.j(b).a(((Throwable) (obj)));
        if (a != null)
        {
            a.release();
        }
_L2:
        return;
        obj;
        AppboyLogger.e(at.a(), "Failed to log error.", ((Throwable) (obj)));
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
