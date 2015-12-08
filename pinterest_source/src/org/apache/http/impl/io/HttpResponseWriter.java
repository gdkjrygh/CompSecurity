// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.http.impl.io;

import org.apache.http.HttpMessage;
import org.apache.http.HttpResponse;
import org.apache.http.io.SessionOutputBuffer;
import org.apache.http.message.LineFormatter;
import org.apache.http.params.HttpParams;

// Referenced classes of package org.apache.http.impl.io:
//            AbstractMessageWriter

public class HttpResponseWriter extends AbstractMessageWriter
{

    public HttpResponseWriter(SessionOutputBuffer sessionoutputbuffer, LineFormatter lineformatter, HttpParams httpparams)
    {
        super(sessionoutputbuffer, lineformatter, httpparams);
    }

    protected volatile void writeHeadLine(HttpMessage httpmessage)
    {
        writeHeadLine((HttpResponse)httpmessage);
    }

    protected void writeHeadLine(HttpResponse httpresponse)
    {
        lineFormatter.formatStatusLine(lineBuf, httpresponse.getStatusLine());
        sessionBuffer.writeLine(lineBuf);
    }
}
