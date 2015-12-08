// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package bo.app;

import com.appboy.support.AppboyLogger;

// Referenced classes of package bo.app:
//            o, ab, ds, du, 
//            dt

final class q
    implements Runnable
{

    final o a;

    private q(o o1)
    {
        a = o1;
        super();
    }

    q(o o1, byte byte0)
    {
        this(o1);
    }

    public final void run()
    {
_L2:
        if (!o.c(a))
        {
            break; /* Loop/switch isn't completed */
        }
        Object obj = o.a(a).b();
        if (((ds) (obj)).b() || o.d(a))
        {
            o.e(a).c(((ds) (obj)));
            continue; /* Loop/switch isn't completed */
        }
        try
        {
            o.f(a).a(((ds) (obj)));
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            AppboyLogger.w(o.b(), String.format("Automatic thread interrupted! [%s]", new Object[] {
                ((InterruptedException) (obj)).getMessage()
            }));
        }
        if (true) goto _L2; else goto _L1
_L1:
    }
}
