// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.concurrent.CountDownLatch;
import org.chromium.net.HttpUrlRequest;
import org.chromium.net.HttpUrlRequestListener;

final class okl
    implements HttpUrlRequestListener
{

    private okk a;

    okl(okk okk1)
    {
        a = okk1;
        super();
    }

    private void c(HttpUrlRequest httpurlrequest)
    {
        if (httpurlrequest.b() != 200 || httpurlrequest.d() != null)
        {
            okk.a(a, new okm(httpurlrequest.b(), httpurlrequest.d()));
        }
    }

    public final void a(HttpUrlRequest httpurlrequest)
    {
        if (httpurlrequest == okk.a(a))
        {
            c(httpurlrequest);
            okk.a(a, true);
            okk.b(a).countDown();
        }
    }

    public final void b(HttpUrlRequest httpurlrequest)
    {
        if (httpurlrequest == okk.a(a))
        {
            c(httpurlrequest);
            okk.a(a, true);
            okk.b(a).countDown();
        }
    }
}
