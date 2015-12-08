// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package retrofit.client;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URI;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.apache.http.Header;
import org.apache.http.HttpResponse;
import org.apache.http.StatusLine;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpEntityEnclosingRequestBase;
import org.apache.http.client.methods.HttpRequestBase;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.entity.AbstractHttpEntity;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.message.BasicHeader;
import org.apache.http.params.BasicHttpParams;
import org.apache.http.params.HttpConnectionParams;
import org.apache.http.util.EntityUtils;
import retrofit.mime.TypedByteArray;
import retrofit.mime.TypedOutput;

// Referenced classes of package retrofit.client:
//            Client, Request, Header, Response

public class ApacheClient
    implements Client
{
    private static class GenericEntityHttpRequest extends HttpEntityEnclosingRequestBase
    {

        private final String method;

        public String getMethod()
        {
            return method;
        }

        GenericEntityHttpRequest(Request request)
        {
            method = request.getMethod();
            setURI(URI.create(request.getUrl()));
            retrofit.client.Header header;
            for (Iterator iterator = request.getHeaders().iterator(); iterator.hasNext(); addHeader(new BasicHeader(header.getName(), header.getValue())))
            {
                header = (retrofit.client.Header)iterator.next();
            }

            setEntity(new TypedOutputEntity(request.getBody()));
        }
    }

    private static class GenericHttpRequest extends HttpRequestBase
    {

        private final String method;

        public String getMethod()
        {
            return method;
        }

        public GenericHttpRequest(Request request)
        {
            method = request.getMethod();
            setURI(URI.create(request.getUrl()));
            retrofit.client.Header header;
            for (request = request.getHeaders().iterator(); request.hasNext(); addHeader(new BasicHeader(header.getName(), header.getValue())))
            {
                header = (retrofit.client.Header)request.next();
            }

        }
    }

    static class TypedOutputEntity extends AbstractHttpEntity
    {

        final TypedOutput typedOutput;

        public InputStream getContent()
            throws IOException
        {
            ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream();
            typedOutput.writeTo(bytearrayoutputstream);
            return new ByteArrayInputStream(bytearrayoutputstream.toByteArray());
        }

        public long getContentLength()
        {
            return typedOutput.length();
        }

        public boolean isRepeatable()
        {
            return true;
        }

        public boolean isStreaming()
        {
            return false;
        }

        public void writeTo(OutputStream outputstream)
            throws IOException
        {
            typedOutput.writeTo(outputstream);
        }

        TypedOutputEntity(TypedOutput typedoutput)
        {
            typedOutput = typedoutput;
            setContentType(typedoutput.mimeType());
        }
    }


    private final HttpClient client;

    public ApacheClient()
    {
        this(createDefaultClient());
    }

    public ApacheClient(HttpClient httpclient)
    {
        client = httpclient;
    }

    private static HttpClient createDefaultClient()
    {
        BasicHttpParams basichttpparams = new BasicHttpParams();
        HttpConnectionParams.setConnectionTimeout(basichttpparams, 15000);
        HttpConnectionParams.setSoTimeout(basichttpparams, 20000);
        return new DefaultHttpClient(basichttpparams);
    }

    static HttpUriRequest createRequest(Request request)
    {
        if (request.getBody() != null)
        {
            return new GenericEntityHttpRequest(request);
        } else
        {
            return new GenericHttpRequest(request);
        }
    }

    static Response parseResponse(String s, HttpResponse httpresponse)
        throws IOException
    {
        Object obj = httpresponse.getStatusLine();
        int j = ((StatusLine) (obj)).getStatusCode();
        String s1 = ((StatusLine) (obj)).getReasonPhrase();
        ArrayList arraylist = new ArrayList();
        obj = "application/octet-stream";
        Header aheader[] = httpresponse.getAllHeaders();
        int k = aheader.length;
        for (int i = 0; i < k; i++)
        {
            Object obj1 = aheader[i];
            String s2 = ((Header) (obj1)).getName();
            obj1 = ((Header) (obj1)).getValue();
            if ("Content-Type".equalsIgnoreCase(s2))
            {
                obj = obj1;
            }
            arraylist.add(new retrofit.client.Header(s2, ((String) (obj1))));
        }

        Object obj2 = null;
        org.apache.http.HttpEntity httpentity = httpresponse.getEntity();
        httpresponse = obj2;
        if (httpentity != null)
        {
            httpresponse = new TypedByteArray(((String) (obj)), EntityUtils.toByteArray(httpentity));
        }
        return new Response(s, j, s1, arraylist, httpresponse);
    }

    protected HttpResponse execute(HttpClient httpclient, HttpUriRequest httpurirequest)
        throws IOException
    {
        return httpclient.execute(httpurirequest);
    }

    public Response execute(Request request)
        throws IOException
    {
        Object obj = createRequest(request);
        obj = execute(client, ((HttpUriRequest) (obj)));
        return parseResponse(request.getUrl(), ((HttpResponse) (obj)));
    }
}
