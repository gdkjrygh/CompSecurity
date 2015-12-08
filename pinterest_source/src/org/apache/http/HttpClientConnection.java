// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.http;


// Referenced classes of package org.apache.http:
//            HttpConnection, HttpResponse, HttpEntityEnclosingRequest, HttpRequest

public interface HttpClientConnection
    extends HttpConnection
{

    public abstract void flush();

    public abstract boolean isResponseAvailable(int i);

    public abstract void receiveResponseEntity(HttpResponse httpresponse);

    public abstract HttpResponse receiveResponseHeader();

    public abstract void sendRequestEntity(HttpEntityEnclosingRequest httpentityenclosingrequest);

    public abstract void sendRequestHeader(HttpRequest httprequest);
}
