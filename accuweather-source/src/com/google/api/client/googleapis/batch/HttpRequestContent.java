// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.api.client.googleapis.batch;

import com.google.api.client.http.AbstractHttpContent;
import com.google.api.client.http.GenericUrl;
import com.google.api.client.http.HttpContent;
import com.google.api.client.http.HttpHeaders;
import com.google.api.client.http.HttpRequest;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

class HttpRequestContent extends AbstractHttpContent
{

    static final String NEWLINE = "\r\n";
    private final HttpRequest request;

    HttpRequestContent(HttpRequest httprequest)
    {
        super("application/http");
        request = httprequest;
    }

    public void writeTo(OutputStream outputstream)
        throws IOException
    {
        OutputStreamWriter outputstreamwriter = new OutputStreamWriter(outputstream, getCharset());
        outputstreamwriter.write(request.getRequestMethod());
        outputstreamwriter.write(" ");
        outputstreamwriter.write(request.getUrl().build());
        outputstreamwriter.write("\r\n");
        HttpHeaders httpheaders = new HttpHeaders();
        httpheaders.fromHttpHeaders(request.getHeaders());
        httpheaders.setAcceptEncoding(null).setUserAgent(null).setContentEncoding(null).setContentType(null).setContentLength(null);
        HttpContent httpcontent = request.getContent();
        if (httpcontent != null)
        {
            httpheaders.setContentType(httpcontent.getType());
            long l = httpcontent.getLength();
            if (l != -1L)
            {
                httpheaders.setContentLength(Long.valueOf(l));
            }
        }
        HttpHeaders.serializeHeadersForMultipartRequests(httpheaders, null, null, outputstreamwriter);
        if (httpcontent != null)
        {
            outputstreamwriter.write("\r\n");
            outputstreamwriter.flush();
            httpcontent.writeTo(outputstream);
        }
    }
}
