// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cleanmaster.sdk.cmloginsdkjar;


// Referenced classes of package com.cleanmaster.sdk.cmloginsdkjar:
//            c

final class d
    implements Runnable
{

    final RequestBatch.OnProgressCallback a;
    final c b;

    d(c c1, RequestBatch.OnProgressCallback onprogresscallback)
    {
        b = c1;
        a = onprogresscallback;
        super();
    }

    public final void run()
    {
        a.onBatchProgress(c.a(b), c.b(b), c.c(b));
    }
}
