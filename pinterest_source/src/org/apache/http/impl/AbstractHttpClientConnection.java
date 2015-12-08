// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.http.impl;

import java.io.IOException;
import java.net.SocketTimeoutException;
import org.apache.http.HttpClientConnection;
import org.apache.http.HttpConnectionMetrics;
import org.apache.http.HttpEntityEnclosingRequest;
import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;
import org.apache.http.HttpResponseFactory;
import org.apache.http.StatusLine;
import org.apache.http.impl.entity.EntityDeserializer;
import org.apache.http.impl.entity.EntitySerializer;
import org.apache.http.impl.entity.LaxContentLengthStrategy;
import org.apache.http.impl.entity.StrictContentLengthStrategy;
import org.apache.http.impl.io.DefaultHttpResponseParser;
import org.apache.http.impl.io.HttpRequestWriter;
import org.apache.http.io.EofSensor;
import org.apache.http.io.HttpMessageParser;
import org.apache.http.io.HttpMessageWriter;
import org.apache.http.io.HttpTransportMetrics;
import org.apache.http.io.SessionInputBuffer;
import org.apache.http.io.SessionOutputBuffer;
import org.apache.http.params.HttpParams;

// Referenced classes of package org.apache.http.impl:
//            HttpConnectionMetricsImpl, DefaultHttpResponseFactory

public abstract class AbstractHttpClientConnection
    implements HttpClientConnection
{

    private final EntityDeserializer entitydeserializer = createEntityDeserializer();
    private final EntitySerializer entityserializer = createEntitySerializer();
    private EofSensor eofSensor;
    private SessionInputBuffer inbuffer;
    private HttpConnectionMetricsImpl metrics;
    private SessionOutputBuffer outbuffer;
    private HttpMessageWriter requestWriter;
    private HttpMessageParser responseParser;

    public AbstractHttpClientConnection()
    {
        inbuffer = null;
        outbuffer = null;
        eofSensor = null;
        responseParser = null;
        requestWriter = null;
        metrics = null;
    }

    protected abstract void assertOpen();

    protected HttpConnectionMetricsImpl createConnectionMetrics(HttpTransportMetrics httptransportmetrics, HttpTransportMetrics httptransportmetrics1)
    {
        return new HttpConnectionMetricsImpl(httptransportmetrics, httptransportmetrics1);
    }

    protected EntityDeserializer createEntityDeserializer()
    {
        return new EntityDeserializer(new LaxContentLengthStrategy());
    }

    protected EntitySerializer createEntitySerializer()
    {
        return new EntitySerializer(new StrictContentLengthStrategy());
    }

    protected HttpResponseFactory createHttpResponseFactory()
    {
        return new DefaultHttpResponseFactory();
    }

    protected HttpMessageWriter createRequestWriter(SessionOutputBuffer sessionoutputbuffer, HttpParams httpparams)
    {
        return new HttpRequestWriter(sessionoutputbuffer, null, httpparams);
    }

    protected HttpMessageParser createResponseParser(SessionInputBuffer sessioninputbuffer, HttpResponseFactory httpresponsefactory, HttpParams httpparams)
    {
        return new DefaultHttpResponseParser(sessioninputbuffer, null, httpresponsefactory, httpparams);
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
        responseParser = createResponseParser(sessioninputbuffer, createHttpResponseFactory(), httpparams);
        requestWriter = createRequestWriter(sessionoutputbuffer, httpparams);
        metrics = createConnectionMetrics(sessioninputbuffer.getMetrics(), sessionoutputbuffer.getMetrics());
    }

    protected boolean isEof()
    {
        return eofSensor != null && eofSensor.isEof();
    }

    public boolean isResponseAvailable(int i)
    {
        assertOpen();
        boolean flag;
        try
        {
            flag = inbuffer.isDataAvailable(i);
        }
        catch (SocketTimeoutException sockettimeoutexception)
        {
            return false;
        }
        return flag;
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
        catch (SocketTimeoutException sockettimeoutexception)
        {
            return false;
        }
        catch (IOException ioexception)
        {
            return true;
        }
        return flag;
    }

    public void receiveResponseEntity(HttpResponse httpresponse)
    {
        if (httpresponse == null)
        {
            throw new IllegalArgumentException("HTTP response may not be null");
        } else
        {
            assertOpen();
            httpresponse.setEntity(entitydeserializer.deserialize(inbuffer, httpresponse));
            return;
        }
    }

    public HttpResponse receiveResponseHeader()
    {
        assertOpen();
        HttpResponse httpresponse = (HttpResponse)responseParser.parse();
        if (httpresponse.getStatusLine().getStatusCode() >= 200)
        {
            metrics.incrementResponseCount();
        }
        return httpresponse;
    }

    public void sendRequestEntity(HttpEntityEnclosingRequest httpentityenclosingrequest)
    {
        if (httpentityenclosingrequest == null)
        {
            throw new IllegalArgumentException("HTTP request may not be null");
        }
        assertOpen();
        if (httpentityenclosingrequest.getEntity() == null)
        {
            return;
        } else
        {
            entityserializer.serialize(outbuffer, httpentityenclosingrequest, httpentityenclosingrequest.getEntity());
            return;
        }
    }

    public void sendRequestHeader(HttpRequest httprequest)
    {
        if (httprequest == null)
        {
            throw new IllegalArgumentException("HTTP request may not be null");
        } else
        {
            assertOpen();
            requestWriter.write(httprequest);
            metrics.incrementRequestCount();
            return;
        }
    }
}
