// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.okhttp;

import java.io.IOException;
import java.net.HttpURLConnection;

// Referenced classes of package com.squareup.okhttp:
//            Request, Dispatcher, Response

final class Job
    implements Runnable
{

    final HttpURLConnection connection;
    final Dispatcher dispatcher;
    final Request request;
    final Response.Receiver responseReceiver;

    public Job(Dispatcher dispatcher1, HttpURLConnection httpurlconnection, Request request1, Response.Receiver receiver)
    {
        dispatcher = dispatcher1;
        connection = httpurlconnection;
        request = request1;
        responseReceiver = receiver;
    }

    private Response readResponse()
        throws IOException
    {
        int i = connection.getResponseCode();
        Response.Builder builder = new Response.Builder(request, i);
        i = 0;
        do
        {
            String s = connection.getHeaderFieldKey(i);
            if (s == null)
            {
                builder.body(new Dispatcher.RealResponseBody(connection, connection.getInputStream()));
                return builder.build();
            }
            builder.addHeader(s, connection.getHeaderField(i));
            i++;
        } while (true);
    }

    private HttpURLConnection sendRequest()
        throws IOException
    {
        for (int i = 0; i < request.headerCount(); i++)
        {
            connection.addRequestProperty(request.headerName(i), request.headerValue(i));
        }

        Request.Body body = request.body();
        if (body != null)
        {
            connection.setDoOutput(true);
            long l = body.contentLength();
            if (l == -1L || l > 0x7fffffffL)
            {
                connection.setChunkedStreamingMode(0);
            } else
            {
                connection.setFixedLengthStreamingMode((int)l);
            }
            body.writeTo(connection.getOutputStream());
        }
        return connection;
    }

    public void run()
    {
        sendRequest();
        Response response = readResponse();
        responseReceiver.onResponse(response);
        connection.disconnect();
        dispatcher.finished(this);
        return;
        Object obj;
        obj;
        responseReceiver.onFailure((new Failure.Builder()).request(request).exception(((Throwable) (obj))).build());
        connection.disconnect();
        dispatcher.finished(this);
        return;
        obj;
        connection.disconnect();
        dispatcher.finished(this);
        throw obj;
    }
}
