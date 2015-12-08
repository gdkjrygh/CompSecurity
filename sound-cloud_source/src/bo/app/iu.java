// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package bo.app;

import java.io.File;
import java.util.concurrent.Executor;

// Referenced classes of package bo.app:
//            it, ir, iw, hz

public final class iu
    implements Runnable
{

    final iw a;
    final it b;

    public iu(it it1, iw iw1)
    {
        b = it1;
        a = iw1;
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
