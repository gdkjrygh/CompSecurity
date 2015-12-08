// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.okhttp.internal.http;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.CacheRequest;

// Referenced classes of package com.squareup.okhttp.internal.http:
//            ResponseHeaders, RetryableOutputStream

interface Transport
{

    public abstract OutputStream createRequestBody()
        throws IOException;

    public abstract void flushRequest()
        throws IOException;

    public abstract InputStream getTransferStream(CacheRequest cacherequest)
        throws IOException;

    public abstract boolean makeReusable(boolean flag, OutputStream outputstream, InputStream inputstream);

    public abstract ResponseHeaders readResponseHeaders()
        throws IOException;

    public abstract void writeRequestBody(RetryableOutputStream retryableoutputstream)
        throws IOException;

    public abstract void writeRequestHeaders()
        throws IOException;
}
