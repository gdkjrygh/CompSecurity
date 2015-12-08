// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.http.impl.io;

import org.apache.http.HttpMessage;
import org.apache.http.HttpRequest;
import org.apache.http.io.SessionOutputBuffer;
import org.apache.http.message.LineFormatter;
import org.apache.http.params.HttpParams;

// Referenced classes of package org.apache.http.impl.io:
//            AbstractMessageWriter

public class HttpRequestWriter extends AbstractMessageWriter
{

    public HttpRequestWriter(SessionOutputBuffer sessionoutputbuffer, LineFormatter lineformatter, HttpParams httpparams)
    {
        super(sessionoutputbuffer, lineformatter, httpparams);
    }

    protected volatile void writeHeadLine(HttpMessage httpmessage)
    {
        writeHeadLine((HttpRequest)httpmessage);
    }

    protected void writeHeadLine(HttpRequest httprequest)
    {
        lineFormatter.formatRequestLine(lineBuf, httprequest.getRequestLine());
        sessionBuffer.writeLine(lineBuf);
    }
}
