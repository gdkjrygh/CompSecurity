// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook;

import android.os.Handler;

// Referenced classes of package com.facebook:
//            q, GraphRequest, ac, bb

final class ba
{

    private final GraphRequest a;
    private final Handler b;
    private final long c = q.g();
    private long d;
    private long e;
    private long f;

    ba(Handler handler, GraphRequest graphrequest)
    {
        a = graphrequest;
        b = handler;
    }

    final void a()
    {
        if (d > e)
        {
            Object obj = a.e();
            if (f > 0L && (obj instanceof ac))
            {
                long l = d;
                long l1 = f;
                obj = (ac)obj;
                if (b != null)
                {
                    b.post(new bb(this, ((ac) (obj)), l, l1));
                }
                e = d;
            }
        }
    }

    final void a(long l)
    {
        d = d + l;
        if (d >= e + c || d >= f)
        {
            a();
        }
    }

    final void b(long l)
    {
        f = f + l;
    }
}
