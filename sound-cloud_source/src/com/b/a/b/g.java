// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.b.a.b;

import com.b.a.a.a.b;
import java.io.File;
import java.util.concurrent.Executor;

// Referenced classes of package com.b.a.b:
//            f, e, i

final class g
    implements Runnable
{

    final i a;
    final f b;

    g(f f1, i j)
    {
        b = f1;
        a = j;
        super();
    }

    public final void run()
    {
        File file = b.a.o.a(a.b);
        boolean flag;
        if (file != null && file.exists())
        {
            flag = true;
        } else
        {
            flag = false;
        }
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
