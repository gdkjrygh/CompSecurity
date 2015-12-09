// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package b.a;

import org.json.JSONArray;

// Referenced classes of package b.a:
//            q, eu, ei, em, 
//            et, au, el, ds, 
//            bd, ec, eb, ab

public final class p
    implements Thread.UncaughtExceptionHandler
{

    private Thread.UncaughtExceptionHandler a;
    private final q b;

    public p(q q1, Thread.UncaughtExceptionHandler uncaughtexceptionhandler)
    {
        b = q1;
        a = uncaughtexceptionhandler;
    }

    public final void uncaughtException(Thread thread, Throwable throwable)
    {
        thread = b;
        if (((q) (thread)).r != null) goto _L2; else goto _L1
_L1:
        eu.b("Unable to handle application crash. Crittercism not yet initialized");
_L6:
        if (a != null && !(a instanceof p))
        {
            a.uncaughtException(Thread.currentThread(), throwable);
        }
_L4:
        return;
_L2:
        ((q) (thread)).r.b();
        em.a(((q) (thread)).c, true);
        if (((q) (thread)).g.b())
        {
            continue; /* Loop/switch isn't completed */
        }
        if (((q) (thread)).x)
        {
            Object obj = new au(throwable, Thread.currentThread().getId());
            obj = (new JSONArray()).put(((au) (obj)).a());
            (new el((new ds(thread)).a(bd.e.f(), ((JSONArray) (obj))), new ec((new eb(((q) (thread)).z.k(), "/android_v2/handle_crashes")).a()), null)).run();
            continue; /* Loop/switch isn't completed */
        }
        break MISSING_BLOCK_LABEL_204;
        thread;
        throw thread;
        thread;
        if (a != null && !(a instanceof p))
        {
            a.uncaughtException(Thread.currentThread(), throwable);
        }
        throw thread;
        thread.a(throwable);
        continue; /* Loop/switch isn't completed */
        thread;
        eu.a("Unable to send crash", thread);
        if (a == null || (a instanceof p)) goto _L4; else goto _L3
_L3:
        a.uncaughtException(Thread.currentThread(), throwable);
        return;
        if (true) goto _L6; else goto _L5
_L5:
    }
}
