// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package a.a;

import java.io.File;
import java.util.concurrent.Executor;

// Referenced classes of package a.a:
//            hq, ho, ht, gv

public final class hr
    implements Runnable
{

    final ht a;
    final hq b;

    public hr(hq hq1, ht ht1)
    {
        b = hq1;
        a = ht1;
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
