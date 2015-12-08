// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cleanmaster.sdk.cmloginsdkjar;


// Referenced classes of package com.cleanmaster.sdk.cmloginsdkjar:
//            ac

final class ad
    implements Runnable
{

    final Request.OnProgressCallback a;
    final long b;
    final long c;
    final ac d;

    ad(ac ac, Request.OnProgressCallback onprogresscallback, long l, long l1)
    {
        d = ac;
        a = onprogresscallback;
        b = l;
        c = l1;
        super();
    }

    public final void run()
    {
        a.onProgress(b, c);
    }
}
