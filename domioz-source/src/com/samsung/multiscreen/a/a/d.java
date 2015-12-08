// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.samsung.multiscreen.a.a;

import com.samsung.multiscreen.a.c;
import com.samsung.multiscreen.a.e;
import java.util.logging.Logger;

// Referenced classes of package com.samsung.multiscreen.a.a:
//            c

final class d
    implements com.samsung.multiscreen.a.d
{

    final long a;
    final com.samsung.multiscreen.a.a.c b;

    d(com.samsung.multiscreen.a.a.c c1, long l)
    {
        b = c1;
        a = l;
        super();
    }

    public final void onError(e e)
    {
        c.a(b).onError(e);
    }

    public final void onResult(Object obj)
    {
        obj = (c)obj;
        c.b().info((new StringBuilder("Poll status result: ")).append(((c) (obj)).toString()).toString());
        if (obj == c.b)
        {
            c.a(b).onResult(Boolean.TRUE);
            return;
        }
        long l = System.currentTimeMillis();
        c.a(b, l - a);
        c.b().info((new StringBuilder("Remaining state polling timeout: ")).append(c.b(b)).toString());
        if (c.b(b) > 0L)
        {
            try
            {
                Thread.sleep(com.samsung.multiscreen.a.a.c.c(b));
                b.a();
                return;
            }
            // Misplaced declaration of an exception variable
            catch (Object obj) { }
        }
        c.a(b).onResult(Boolean.FALSE);
    }
}
