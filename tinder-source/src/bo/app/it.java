// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package bo.app;

import java.io.File;
import java.util.concurrent.Executor;

// Referenced classes of package bo.app:
//            is, iq, iv, hy

public final class it
    implements Runnable
{

    final iv a;
    final is b;

    public it(is is1, iv iv1)
    {
        b = is1;
        a = iv1;
        super();
    }

    public final void run()
    {
        boolean flag = b.a.q.a(a.b).exists();
        b.a();
        if (flag)
        {
            b.c.execute(a);
            return;
        } else
        {
            b.b.execute(a);
            return;
        }
    }
}
