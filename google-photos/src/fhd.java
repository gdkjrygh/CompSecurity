// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.ConditionVariable;
import java.nio.ByteBuffer;
import org.chromium.net.ResponseInfo;
import org.chromium.net.UrlRequest;
import org.chromium.net.UrlRequestException;
import org.chromium.net.UrlRequestListener;

final class fhd extends UrlRequestListener
{

    private final ConditionVariable a = new ConditionVariable();
    private String b;
    private UrlRequestException c;

    fhd()
    {
    }

    static ConditionVariable a(fhd fhd1)
    {
        return fhd1.a;
    }

    static UrlRequestException b(fhd fhd1)
    {
        return fhd1.c;
    }

    static String c(fhd fhd1)
    {
        return fhd1.b;
    }

    public final void a(UrlRequest urlrequest, ByteBuffer bytebuffer)
    {
    }

    public final void a(UrlRequest urlrequest, ResponseInfo responseinfo)
    {
    }

    public final void a(UrlRequest urlrequest, ResponseInfo responseinfo, String s)
    {
        b = s;
        a.open();
        return;
        urlrequest;
        a.open();
        throw urlrequest;
    }

    public final void a(UrlRequest urlrequest, UrlRequestException urlrequestexception)
    {
        c = urlrequestexception;
        a.open();
        return;
        urlrequest;
        a.open();
        throw urlrequest;
    }
}
