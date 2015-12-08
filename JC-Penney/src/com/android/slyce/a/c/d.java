// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.slyce.a.c;

import com.android.slyce.a.ag;
import com.android.slyce.a.b.a;
import java.util.concurrent.TimeoutException;

// Referenced classes of package com.android.slyce.a.c:
//            r, a, i, u

class d
    implements Runnable
{

    final r a;
    final i b;
    final u c;
    final com.android.slyce.a.c.b.a d;
    final com.android.slyce.a.c.a e;

    d(com.android.slyce.a.c.a a1, r r1, i i, u u, com.android.slyce.a.c.b.a a2)
    {
        e = a1;
        a = r1;
        b = i;
        c = u;
        d = a2;
        super();
    }

    public void run()
    {
        if (a.b != null)
        {
            a.b.b();
            if (a.e != null)
            {
                a.e.d();
            }
        }
        com.android.slyce.a.c.a.a(e, b, new TimeoutException(), null, c, d);
    }
}
