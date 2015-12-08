// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat;

import com.kik.android.a;
import com.kik.d.f;
import kik.a.h.j;
import kik.android.a.b;

// Referenced classes of package kik.android.chat:
//            z, KikApplication

final class aa
    implements Runnable
{

    final long a;
    final kik.a.b.a.a.c b;
    final z c;

    aa(z z1, long l, kik.a.b.a.a.c c1)
    {
        c = z1;
        a = l;
        b = c1;
        super();
    }

    public final void run()
    {
        long l = j.b();
        long l1 = j.c();
        long l2 = a - b.b;
        if (Long.valueOf(l1).longValue() == -1L)
        {
            KikApplication.c(c.a).c().a(com.kik.d.b.a.f.a, b.a, "t", l2, "ctime", "true", Long.valueOf(l).longValue());
            return;
        } else
        {
            KikApplication.c(c.a).c().a(com.kik.d.b.a.f.a, b.a, "t", l2, j.b());
            c.a.b.a("95% Message Send Time", (float)l2 / 1000F, 0.95F);
            c.a.b.a("50% Message Send Time", (float)l2 / 1000F, 0.5F);
            return;
        }
    }
}
