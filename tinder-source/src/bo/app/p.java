// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package bo.app;

import com.appboy.support.AppboyLogger;

// Referenced classes of package bo.app:
//            o, x, dm, do, 
//            dn

final class p
    implements Runnable
{

    final o a;

    private p(o o1)
    {
        a = o1;
        super();
    }

    p(o o1, byte byte0)
    {
        this(o1);
    }

    public final void run()
    {
_L2:
        if (!o.a(a))
        {
            break; /* Loop/switch isn't completed */
        }
        Object obj = o.b(a).a();
        if (((dm) (obj)).b() || o.c(a))
        {
            o.d(a).c(((dm) (obj)));
            continue; /* Loop/switch isn't completed */
        }
        try
        {
            o.e(a).a(((dm) (obj)));
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            AppboyLogger.w(o.a(), String.format("Automatic thread interrupted! [%s]", new Object[] {
                ((InterruptedException) (obj)).getMessage()
            }));
        }
        if (true) goto _L2; else goto _L1
_L1:
    }
}
