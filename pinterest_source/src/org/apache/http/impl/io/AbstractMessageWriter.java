// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.http.impl.io;

import org.apache.http.HeaderIterator;
import org.apache.http.HttpMessage;
import org.apache.http.io.HttpMessageWriter;
import org.apache.http.io.SessionOutputBuffer;
import org.apache.http.message.BasicLineFormatter;
import org.apache.http.message.LineFormatter;
import org.apache.http.params.HttpParams;
import org.apache.http.util.CharArrayBuffer;

public abstract class AbstractMessageWriter
    implements HttpMessageWriter
{

    protected final CharArrayBuffer lineBuf = new CharArrayBuffer(128);
    protected final LineFormatter lineFormatter;
    protected final SessionOutputBuffer sessionBuffer;

    public AbstractMessageWriter(SessionOutputBuffer sessionoutputbuffer, LineFormatter lineformatter, HttpParams httpparams)
    {
        if (sessionoutputbuffer == null)
        {
            throw new IllegalArgumentException("Session input buffer may not be null");
        }
        sessionBuffer = sessionoutputbuffer;
        if (lineformatter == null)
        {
            lineformatter = BasicLineFormatter.DEFAULT;
        }
        lineFormatter = lineformatter;
    }

    public void write(HttpMessage httpmessage)
    {
        if (httpmessage == null)
        {
            throw new IllegalArgumentException("HTTP message may not be null");
        }
        writeHeadLine(httpmessage);
        org.apache.http.Header header;
        for (httpmessage = httpmessage.headerIterator(); httpmessage.hasNext(); sessionBuffer.writeLine(lineFormatter.formatHeader(lineBuf, header)))
        {
            header = httpmessage.nextHeader();
        }

        lineBuf.clear();
        sessionBuffer.writeLine(lineBuf);
    }

    protected abstract void writeHeadLine(HttpMessage httpmessage);
}
