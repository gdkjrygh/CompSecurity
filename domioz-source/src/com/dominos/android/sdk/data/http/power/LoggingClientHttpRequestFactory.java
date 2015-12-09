// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.android.sdk.data.http.power;

import java.net.URI;
import org.c.c.a.e;
import org.c.c.a.r;
import org.c.c.i;

class LoggingClientHttpRequestFactory extends r
{

    private static final String TAG = "LoggingClientHttpRequestFactory";

    LoggingClientHttpRequestFactory()
    {
    }

    public e createRequest(URI uri, i j)
    {
        uri = openConnection(uri.toURL(), null);
        prepareConnection(uri, j.name());
        return new LoggingClientHttpRequest(uri);
    }

    private class LoggingClientHttpRequest extends b
    {

        private ByteArrayOutputStream bufferedOutput;
        private HttpURLConnection connection;
        final LoggingClientHttpRequestFactory this$0;

        private org.c.c.a.i executeInternal(f f1, byte abyte0[])
        {
            for (f1 = f1.entrySet().iterator(); f1.hasNext();)
            {
                Object obj = (java.util.Map.Entry)f1.next();
                String s = (String)((java.util.Map.Entry) (obj)).getKey();
                obj = ((List)((java.util.Map.Entry) (obj)).getValue()).iterator();
                while (((Iterator) (obj)).hasNext()) 
                {
                    String s1 = (String)((Iterator) (obj)).next();
                    connection.addRequestProperty(s, s1);
                }
            }

            if (connection.getDoOutput())
            {
                connection.setFixedLengthStreamingMode(abyte0.length);
            }
            connection.connect();
            if (connection.getDoOutput())
            {
                g.copy(abyte0, connection.getOutputStream());
            }
            return new LoggingClientHttpResponse(connection);
        }

        protected org.c.c.a.i executeInternal(f f1)
        {
            byte abyte0[] = bufferedOutput.toByteArray();
            if (f1.getContentLength() == -1L)
            {
                f1.setContentLength(abyte0.length);
            }
            Log.v("LoggingClientHttpRequestFactory", String.format(">>RQST [%s]\nheaders=[%s]\nbody=[%s]", new Object[] {
                connection.getURL().toExternalForm(), w.a(":").c("=").a(f1), new String(abyte0)
            }));
            f1 = executeInternal(f1, abyte0);
            bufferedOutput = null;
            return f1;
        }

        protected OutputStream getBodyInternal(f f1)
        {
            return bufferedOutput;
        }

        public i getMethod()
        {
            return i.valueOf(connection.getRequestMethod());
        }

        public URI getURI()
        {
            URI uri;
            try
            {
                uri = connection.getURL().toURI();
            }
            catch (URISyntaxException urisyntaxexception)
            {
                throw new IllegalStateException((new StringBuilder("Could not get HttpURLConnection URI: ")).append(urisyntaxexception.getMessage()).toString(), urisyntaxexception);
            }
            return uri;
        }

        public LoggingClientHttpRequest(HttpURLConnection httpurlconnection)
        {
            this$0 = LoggingClientHttpRequestFactory.this;
            super();
            bufferedOutput = new ByteArrayOutputStream();
            connection = httpurlconnection;
        }

        private class LoggingClientHttpResponse extends d
        {

            private static final String AUTH_ERROR = "Received authentication challenge is null";
            private static final String AUTH_ERROR_JELLY_BEAN = "No authentication challenges found";
            private static final String PROXY_AUTH_ERROR = "Received HTTP_PROXY_AUTH (407) code while not using proxy";
            private HttpURLConnection connection;
            private f headers;
            final LoggingClientHttpRequestFactory this$0;

            private int handleIOException(IOException ioexception)
            {
                if ("Received authentication challenge is null".equals(ioexception.getMessage()) || "No authentication challenges found".equals(ioexception.getMessage()))
                {
                    return l.UNAUTHORIZED.value();
                }
                if ("Received HTTP_PROXY_AUTH (407) code while not using proxy".equals(ioexception.getMessage()))
                {
                    return l.PROXY_AUTHENTICATION_REQUIRED.value();
                } else
                {
                    throw ioexception;
                }
            }

            protected void closeInternal()
            {
                connection.disconnect();
            }

            protected InputStream getBodyInternal()
            {
                Object obj = connection.getErrorStream();
                ByteArrayOutputStream bytearrayoutputstream;
                if (obj == null)
                {
                    obj = connection.getInputStream();
                }
                bytearrayoutputstream = new ByteArrayOutputStream();
                g.copy(((InputStream) (obj)), bytearrayoutputstream);
                obj = bytearrayoutputstream.toByteArray();
                Log.v("LoggingClientHttpRequestFactory", String.format("<<RESP [%s]\nheaders=[%s]\nbody=[%s]", new Object[] {
                    connection.getURL().toExternalForm(), w.a(":").c("=").a(headers), new String(((byte []) (obj)))
                }));
                return new ByteArrayInputStream(((byte []) (obj)));
            }

            public f getHeaders()
            {
                if (headers == null)
                {
                    headers = new f();
                    String s = connection.getHeaderFieldKey(0);
                    if (StringHelper.isNotEmpty(s))
                    {
                        headers.add(s, connection.getHeaderField(0));
                    }
                    int j = 1;
                    do
                    {
                        String s1 = connection.getHeaderFieldKey(j);
                        if (!StringHelper.isNotEmpty(s1))
                        {
                            break;
                        }
                        headers.add(s1, connection.getHeaderField(j));
                        j++;
                    } while (true);
                }
                return headers;
            }

            public int getRawStatusCode()
            {
                int j;
                try
                {
                    j = connection.getResponseCode();
                }
                catch (IOException ioexception)
                {
                    return handleIOException(ioexception);
                }
                return j;
            }

            public String getStatusText()
            {
                String s;
                try
                {
                    s = connection.getResponseMessage();
                }
                catch (IOException ioexception)
                {
                    return l.valueOf(handleIOException(ioexception)).getReasonPhrase();
                }
                return s;
            }

            public LoggingClientHttpResponse(HttpURLConnection httpurlconnection)
            {
                this$0 = LoggingClientHttpRequestFactory.this;
                super();
                connection = httpurlconnection;
            }
        }

    }

}
