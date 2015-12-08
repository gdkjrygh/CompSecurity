// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cleanmaster.sdk.cmloginsdkjar;

import android.os.Handler;

// Referenced classes of package com.cleanmaster.sdk.cmloginsdkjar:
//            Settings, Request, ad

final class ac
{

    private final Request a;
    private final Handler b;
    private final long c = Settings.getOnProgressThreshold();
    private long d;
    private long e;
    private long f;

    ac(Handler handler, Request request)
    {
        a = request;
        b = handler;
    }

    final void a()
    {
        if (d > e)
        {
            Object obj = a.getCallback();
            if (f > 0L && (obj instanceof Request.OnProgressCallback))
            {
                long l = d;
                long l1 = f;
                obj = (Request.OnProgressCallback)obj;
                if (b == null)
                {
                    ((Request.OnProgressCallback) (obj)).onProgress(l, l1);
                } else
                {
                    b.post(new ad(this, ((Request.OnProgressCallback) (obj)), l, l1));
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
