// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package bo.app;

import java.io.File;
import java.util.concurrent.Executor;

// Referenced classes of package bo.app:
//            iy, iw, jb, ie

public final class iz
    implements Runnable
{

    final jb a;
    final iy b;

    public iz(iy iy1, jb jb1)
    {
        b = iy1;
        a = jb1;
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
