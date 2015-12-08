// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.chromium.net;

import java.nio.ByteBuffer;

// Referenced classes of package org.chromium.net:
//            UrlRequest, UrlResponseInfo, UrlRequestException

public abstract class UrlRequestListener
{

    public UrlRequestListener()
    {
    }

    public abstract void a();

    public abstract void a(UrlRequest urlrequest, String s);

    public abstract void a(UrlRequest urlrequest, ByteBuffer bytebuffer);

    public abstract void a(UrlRequest urlrequest, UrlResponseInfo urlresponseinfo);

    public abstract void a(UrlResponseInfo urlresponseinfo, UrlRequestException urlrequestexception);
}
