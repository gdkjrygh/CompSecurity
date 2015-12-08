// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.http.impl;

import java.io.IOException;
import org.apache.http.HttpConnectionMetrics;
import org.apache.http.HttpEntityEnclosingRequest;
import org.apache.http.HttpRequest;
import org.apache.http.HttpRequestFactory;
import org.apache.http.HttpResponse;
import org.apache.http.HttpServerConnection;
import org.apache.http.StatusLine;
import org.apache.http.impl.entity.DisallowIdentityContentLengthStrategy;
import org.apache.http.impl.entity.EntityDeserializer;
import org.apache.http.impl.entity.EntitySerializer;
import org.apache.http.impl.entity.LaxContentLengthStrategy;
import org.apache.http.impl.entity.StrictContentLengthStrategy;
import org.apache.http.impl.io.DefaultHttpRequestParser;
import org.apache.http.impl.io.HttpResponseWriter;
import org.apache.http.io.EofSensor;
import org.apache.http.io.HttpMessageParser;
import org.apache.http.io.HttpMessageWriter;
import org.apache.http.io.HttpTransportMetrics;
import org.apache.http.io.SessionInputBuffer;
import org.apache.http.io.SessionOutputBuffer;
import org.apache.http.params.HttpParams;

// Referenced classes of package org.apache.http.impl:
//            HttpConnectionMetricsImpl, DefaultHttpRequestFactory

public abstract class AbstractHttpServerConnection
    implements HttpServerConnection
{

    private final EntityDeserializer entitydeserializer = createEntityDeserializer();
    private final EntitySerializer entityserializer = createEntitySerializer();
    private EofSensor eofSensor;
    private SessionInputBuffer inbuffer;
    private HttpConnectionMetricsImpl metrics;
    private SessionOutputBuffer outbuffer;
    private HttpMessageParser requestParser;
    private HttpMessageWriter responseWriter;

    public AbstractHttpServerConnection()
    {
        inbuffer = null;
        outbuffer = null;
        eofSensor = null;
        requestParser = null;
        responseWriter = null;
        metrics = null;
    }

    protected abstract void assertOpen();

    protected HttpConnectionMetricsImpl createConnectionMetrics(HttpTransportMetrics httptransportmetrics, HttpTransportMetrics httptransportmetrics1)
    {
        return new HttpConnectionMetricsImpl(httptransportmetrics, httptransportmetrics1);
    }

    protected EntityDeserializer createEntityDeserializer()
    {
        return new EntityDeserializer(new DisallowIdentityContentLengthStrategy(new LaxContentLengthStrategy(0)));
    }

    protected EntitySerializer createEntitySerializer()
    {
        return new EntitySerializer(new StrictContentLengthStrategy());
    }

    protected HttpRequestFactory createHttpRequestFactory()
    {
        return new DefaultHttpRequestFactory();
    }

    protected HttpMessageParser createRequestParser(SessionInputBuffer sessioninputbuffer, HttpRequestFactory httprequestfactory, HttpParams httpparams)
    {
        return new DefaultHttpRequestParser(sessioninputbuffer, null, httprequestfactory, httpparams);
    }

    protected HttpMessageWriter createResponseWriter(SessionOutputBuffer sessionoutputbuffer, HttpParams httpparams)
    {
        return new HttpResponseWriter(sessionoutputbuffer, null, httpparams);
    }

    protected void doFlush()
    {
        outbuffer.flush();
    }

    public void flush()
    {
        assertOpen();
        doFlush();
    }

    public HttpConnectionMetrics getMetrics()
    {
        return metrics;
    }

    protected void init(SessionInputBuffer sessioninputbuffer, SessionOutputBuffer sessionoutputbuffer, HttpParams httpparams)
    {
        if (sessioninputbuffer == null)
        {
            throw new IllegalArgumentException("Input session buffer may not be null");
        }
        if (sessionoutputbuffer == null)
        {
            throw new IllegalArgumentException("Output session buffer may not be null");
        }
        inbuffer = sessioninputbuffer;
        outbuffer = sessionoutputbuffer;
        if (sessioninputbuffer instanceof EofSensor)
        {
            eofSensor = (EofSensor)sessioninputbuffer;
        }
        requestParser = createRequestParser(sessioninputbuffer, createHttpRequestFactory(), httpparams);
        responseWriter = createResponseWriter(sessionoutputbuffer, httpparams);
        metrics = createConnectionMetrics(sessioninputbuffer.getMetrics(), sessionoutputbuffer.getMetrics());
    }

    protected boolean isEof()
    {
        return eofSensor != null && eofSensor.isEof();
    }

    public boolean isStale()
    {
        while (!isOpen() || isEof()) 
        {
            return true;
        }
        boolean flag;
        try
        {
            inbuffer.isDataAvailable(1);
            flag = isEof();
        }
        catch (IOException ioexception)
        {
            return true;
        }
        return flag;
    }

    public void receiveRequestEntity(HttpEntityEnclosingRequest httpentityenclosingrequest)
    {
        if (httpentityenclosingrequest == null)
        {
            throw new IllegalArgumentException("HTTP request may not be null");
        } else
        {
            assertOpen();
            httpentityenclosingrequest.setEntity(entitydeserializer.deserialize(inbuffer, httpentityenclosingrequest));
            return;
        }
    }

    public HttpRequest receiveRequestHeader()
    {
        assertOpen();
        HttpRequest httprequest = (HttpRequest)requestParser.parse();
        metrics.incrementRequestCount();
        return httprequest;
    }

    public void sendResponseEntity(HttpResponse httpresponse)
    {
        if (httpresponse.getEntity() == null)
        {
            return;
        } else
        {
            entityserializer.serialize(outbuffer, httpresponse, httpresponse.getEntity());
            return;
        }
    }

    public void sendResponseHeader(HttpResponse httpresponse)
    {
        if (httpresponse == null)
        {
            throw new IllegalArgumentException("HTTP response may not be null");
        }
        assertOpen();
        responseWriter.write(httpresponse);
        if (httpresponse.getStatusLine().getStatusCode() >= 200)
        {
            metrics.incrementResponseCount();
        }
    }
}
