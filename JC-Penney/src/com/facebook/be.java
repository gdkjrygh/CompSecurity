// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook;

import android.os.Handler;

// Referenced classes of package com.facebook:
//            s, GraphRequest, ag, bf

class be
{

    private final GraphRequest a;
    private final Handler b;
    private final long c = s.g();
    private long d;
    private long e;
    private long f;

    be(Handler handler, GraphRequest graphrequest)
    {
        a = graphrequest;
        b = handler;
    }

    void a()
    {
        if (d > e)
        {
            Object obj = a.e();
            if (f > 0L && (obj instanceof ag))
            {
                long l = d;
                long l1 = f;
                obj = (ag)obj;
                if (b == null)
                {
                    ((ag) (obj)).a(l, l1);
                } else
                {
                    b.post(new bf(this, ((ag) (obj)), l, l1));
                }
                e = d;
            }
        }
    }

    void a(long l)
    {
        d = d + l;
        if (d >= e + c || d >= f)
        {
            a();
        }
    }

    void b(long l)
    {
        f = f + l;
    }
}
