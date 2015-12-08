// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.ConditionVariable;
import org.chromium.net.HttpUrlRequest;
import org.chromium.net.HttpUrlRequestListener;

final class nmw
    implements HttpUrlRequestListener
{

    private nmv a;

    nmw(nmv nmv1)
    {
        a = nmv1;
        super();
    }

    public final void a(HttpUrlRequest httpurlrequest)
    {
        a.a(httpurlrequest);
    }

    public final void b(HttpUrlRequest httpurlrequest)
    {
        a.d = httpurlrequest.b();
        a.e = httpurlrequest.a();
        a.f = httpurlrequest.f();
        a.g = httpurlrequest.d();
        a.h = httpurlrequest.i();
        a.b.open();
        return;
        httpurlrequest;
        a.b.open();
        throw httpurlrequest;
    }
}
