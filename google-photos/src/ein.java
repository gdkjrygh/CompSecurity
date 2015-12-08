// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.ConditionVariable;
import org.chromium.net.HttpUrlRequest;
import org.chromium.net.HttpUrlRequestListener;

final class ein
    implements HttpUrlRequestListener
{

    private eim a;

    ein(eim eim1)
    {
        a = eim1;
        super();
    }

    public final void a(HttpUrlRequest httpurlrequest)
    {
    }

    public final void b(HttpUrlRequest httpurlrequest)
    {
        a.b = httpurlrequest.b();
        a.c = httpurlrequest.a();
        a.a.open();
        return;
        httpurlrequest;
        a.a.open();
        throw httpurlrequest;
    }
}
