// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook;

import android.os.Handler;

// Referenced classes of package com.facebook:
//            s, GraphRequest, R

final class Q
{

    final long a = s.g();
    long b;
    long c;
    long d;
    private final GraphRequest e;
    private final Handler f;

    Q(Handler handler, GraphRequest graphrequest)
    {
        e = graphrequest;
        f = handler;
    }

    final void a()
    {
        if (b > c)
        {
            Object obj = e.e;
            if (d > 0L && (obj instanceof GraphRequest.d))
            {
                long l = b;
                long l1 = d;
                obj = (GraphRequest.d)obj;
                if (f != null)
                {
                    f.post(new R(this, ((GraphRequest.d) (obj)), l, l1));
                }
                c = b;
            }
        }
    }
}
