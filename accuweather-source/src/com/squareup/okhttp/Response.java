// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.okhttp;

import com.squareup.okhttp.internal.Util;
import com.squareup.okhttp.internal.http.RawHeaders;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.List;
import java.util.Set;

// Referenced classes of package com.squareup.okhttp:
//            Request, Failure

final class Response
{
    public static abstract class Body
    {

        public abstract InputStream byteStream()
            throws IOException;

        public byte[] bytes()
            throws IOException
        {
            long l = contentLength();
            if (l > 0x7fffffffL)
            {
                throw new IOException((new StringBuilder()).append("Cannot buffer entire body for content length: ").append(l).toString());
            }
            byte abyte0[];
            if (l != -1L)
            {
                abyte0 = new byte[(int)l];
                InputStream inputstream = byteStream();
                Util.readFully(inputstream, abyte0);
                if (inputstream.read() != -1)
                {
                    throw new IOException("Content-Length and stream length disagree");
                }
            } else
            {
                abyte0 = new ByteArrayOutputStream();
                Util.copy(byteStream(), abyte0);
                abyte0 = abyte0.toByteArray();
            }
            return abyte0;
        }

        public Reader charStream()
            throws IOException
        {
            return new InputStreamReader(byteStream(), "UTF-8");
        }

        public long contentLength()
        {
            return -1L;
        }

        public String contentType()
        {
            return null;
        }

        public String string()
            throws IOException
        {
            return new String(bytes(), "UTF-8");
        }

        public Body()
        {
        }
    }

    public static class Builder
    {

        private Body body;
        private final int code;
        private final RawHeaders headers = new RawHeaders();
        private Response redirectedBy;
        private final Request request;

        public Builder addHeader(String s, String s1)
        {
            headers.add(s, s1);
            return this;
        }

        public Builder body(Body body1)
        {
            body = body1;
            return this;
        }

        public Response build()
        {
            if (request == null)
            {
                throw new IllegalStateException("Response has no request.");
            }
            if (code == -1)
            {
                throw new IllegalStateException("Response has no code.");
            } else
            {
                return new Response(this);
            }
        }

        public Builder header(String s, String s1)
        {
            headers.set(s, s1);
            return this;
        }

        public Builder redirectedBy(Response response)
        {
            redirectedBy = response;
            return this;
        }






        public Builder(Request request1, int i)
        {
            if (request1 == null)
            {
                throw new IllegalArgumentException("request == null");
            }
            if (i <= 0)
            {
                throw new IllegalArgumentException("code <= 0");
            } else
            {
                request = request1;
                code = i;
                return;
            }
        }
    }

    public static interface Receiver
    {

        public abstract void onFailure(Failure failure);

        public abstract void onResponse(Response response)
            throws IOException;
    }


    private final Body body;
    private final int code;
    private final RawHeaders headers;
    private final Response redirectedBy;
    private final Request request;

    private Response(Builder builder)
    {
        request = builder.request;
        code = builder.code;
        headers = new RawHeaders(builder.headers);
        body = builder.body;
        redirectedBy = builder.redirectedBy;
    }


    public Body body()
    {
        return body;
    }

    public int code()
    {
        return code;
    }

    public String header(String s)
    {
        return header(s, null);
    }

    public String header(String s, String s1)
    {
        s = headers.get(s);
        if (s != null)
        {
            return s;
        } else
        {
            return s1;
        }
    }

    public int headerCount()
    {
        return headers.length();
    }

    public String headerName(int i)
    {
        return headers.getFieldName(i);
    }

    public Set headerNames()
    {
        return headers.names();
    }

    public String headerValue(int i)
    {
        return headers.getValue(i);
    }

    public List headers(String s)
    {
        return headers.values(s);
    }

    public Response redirectedBy()
    {
        return redirectedBy;
    }

    public Request request()
    {
        return request;
    }
}
