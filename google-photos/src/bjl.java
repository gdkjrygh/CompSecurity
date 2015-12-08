// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.net.Uri;
import java.util.concurrent.CountDownLatch;

public final class bjl
    implements bjw
{

    private final bjw c;
    private final chq d;
    private final ckx e;

    public bjl(bjw bjw1, chq chq1, ckx ckx1)
    {
        c = (bjw)b.a(bjw1, "delegate", null);
        d = (chq)b.a(chq1, "renderContext", null);
        e = (ckx)b.a(ckx1, "decoderPool", null);
    }

    static ckx a(bjl bjl1)
    {
        return bjl1.e;
    }

    private void a(Uri uri, bim bim, bii bii, cmf cmf, boolean flag)
    {
        CountDownLatch countdownlatch = new CountDownLatch(1);
        CountDownLatch countdownlatch1 = new CountDownLatch(1);
        d.b(new bjm(this, countdownlatch1, countdownlatch));
        countdownlatch1.await();
        if (!flag) goto _L2; else goto _L1
_L1:
        c.a(uri, bim, cmf, bii);
_L4:
        countdownlatch.countDown();
        return;
_L2:
        c.a(uri, bim, bii);
        if (true) goto _L4; else goto _L3
_L3:
        uri;
        throw c.a("render context not initialized for analysis", uri);
        uri;
        countdownlatch.countDown();
        throw uri;
        uri;
        Thread.currentThread().interrupt();
        countdownlatch.countDown();
        return;
    }

    public final void a()
    {
        c.a();
    }

    public final void a(Uri uri, bim bim, bii bii)
    {
        a(uri, bim, bii, null, false);
    }

    public final void a(Uri uri, bim bim, cmf cmf, bii bii)
    {
        a(uri, bim, bii, cmf, true);
    }
}
