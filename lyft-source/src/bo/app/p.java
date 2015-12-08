// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package bo.app;

import com.appboy.events.IEventSubscriber;
import com.appboy.support.AppboyLogger;
import java.util.concurrent.ConcurrentHashMap;

// Referenced classes of package bo.app:
//            o, ab, be

final class p
    implements IEventSubscriber
{

    final be a;
    final o b;

    p(o o1, be be1)
    {
        b = o1;
        a = be1;
        super();
    }

    public final void trigger(Object obj)
    {
        boolean flag;
        if (!o.a(b).a.isEmpty())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_49;
        }
        if (!o.a(b).a())
        {
            b.a(o.b(b));
        }
        return;
        obj;
        AppboyLogger.e(o.b(), "Failed to create flush request.", ((Throwable) (obj)));
        try
        {
            a.a(obj, java/lang/Throwable);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            AppboyLogger.e(o.b(), "Failed to log throwable.", ((Throwable) (obj)));
        }
        return;
    }
}
