// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.okhttp;

import com.squareup.okhttp.internal.Util;
import com.squareup.okhttp.internal.http.RawHeaders;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.List;
import java.util.Set;

// Referenced classes of package com.squareup.okhttp:
//            MediaType

final class Request
{
    public static abstract class Body
    {

        public static Body create(MediaType mediatype, File file)
        {
            if (mediatype == null)
            {
                throw new NullPointerException("contentType == null");
            }
            if (file == null)
            {
                throw new NullPointerException("content == null");
            } else
            {
                return new Body(mediatype, file) {

                    final MediaType val$contentType;
                    final File val$file;

                    public long contentLength()
                    {
                        return file.length();
                    }

                    public MediaType contentType()
                    {
                        return contentType;
                    }

                    public void writeTo(OutputStream outputstream)
                        throws IOException
                    {
                        Object obj1;
                        long l;
                        l = contentLength();
                        if (l == 0L)
                        {
                            return;
                        }
                        obj1 = null;
                        Object obj = new FileInputStream(file);
                        obj1 = new byte[(int)Math.min(8192L, l)];
_L3:
                        int i = ((InputStream) (obj)).read(((byte []) (obj1)));
                        if (i == -1) goto _L2; else goto _L1
_L1:
                        outputstream.write(((byte []) (obj1)), 0, i);
                          goto _L3
                        obj1;
                        outputstream = ((OutputStream) (obj));
                        obj = obj1;
_L5:
                        Util.closeQuietly(outputstream);
                        throw obj;
_L2:
                        Util.closeQuietly(((java.io.Closeable) (obj)));
                        return;
                        obj;
                        outputstream = ((OutputStream) (obj1));
                        if (true) goto _L5; else goto _L4
_L4:
                    }

            
            {
                contentType = mediatype;
                file = file1;
                super();
            }
                };
            }
        }

        public static Body create(MediaType mediatype, String s)
        {
            if (mediatype.charset() == null)
            {
                mediatype = MediaType.parse((new StringBuilder()).append(mediatype).append("; charset=utf-8").toString());
            }
            try
            {
                mediatype = create(mediatype, s.getBytes(mediatype.charset().name()));
            }
            // Misplaced declaration of an exception variable
            catch (MediaType mediatype)
            {
                throw new AssertionError();
            }
            return mediatype;
        }

        public static Body create(MediaType mediatype, byte abyte0[])
        {
            if (mediatype == null)
            {
                throw new NullPointerException("contentType == null");
            }
            if (abyte0 == null)
            {
                throw new NullPointerException("content == null");
            } else
            {
                return new Body(mediatype, abyte0) {

                    final byte val$content[];
                    final MediaType val$contentType;

                    public long contentLength()
                    {
                        return (long)content.length;
                    }

                    public MediaType contentType()
                    {
                        return contentType;
                    }

                    public void writeTo(OutputStream outputstream)
                        throws IOException
                    {
                        outputstream.write(content);
                    }

            
            {
                contentType = mediatype;
                content = abyte0;
                super();
            }
                };
            }
        }

        public long contentLength()
        {
            return -1L;
        }

        public abstract MediaType contentType();

        public abstract void writeTo(OutputStream outputstream)
            throws IOException;

        public Body()
        {
        }
    }

    public static class Builder
    {

        private Body body;
        private RawHeaders headers;
        private String method;
        private Object tag;
        private URL url;

        public Builder addHeader(String s, String s1)
        {
            headers.add(s, s1);
            return this;
        }

        public Request build()
        {
            return new Request(this);
        }

        public Builder get()
        {
            return method("GET", null);
        }

        public Builder head()
        {
            return method("HEAD", null);
        }

        public Builder header(String s, String s1)
        {
            headers.set(s, s1);
            return this;
        }

        public Builder method(String s, Body body1)
        {
            if (s == null || s.length() == 0)
            {
                throw new IllegalArgumentException("method == null || method.length() == 0");
            } else
            {
                method = s;
                body = body1;
                return this;
            }
        }

        public Builder post(Body body1)
        {
            return method("POST", body1);
        }

        public Builder put(Body body1)
        {
            return method("PUT", body1);
        }

        Builder rawHeaders(RawHeaders rawheaders)
        {
            headers = new RawHeaders(rawheaders);
            return this;
        }

        public Builder tag(Object obj)
        {
            tag = obj;
            return this;
        }

        public Builder url(String s)
        {
            try
            {
                url = new URL(s);
            }
            catch (MalformedURLException malformedurlexception)
            {
                throw new IllegalArgumentException((new StringBuilder()).append("Malformed URL: ").append(s).toString());
            }
            return this;
        }

        public Builder url(URL url1)
        {
            if (url1 == null)
            {
                throw new IllegalStateException("url == null");
            } else
            {
                url = url1;
                return this;
            }
        }






        public Builder(String s)
        {
            method = "GET";
            headers = new RawHeaders();
            url(s);
        }

        public Builder(URL url1)
        {
            method = "GET";
            headers = new RawHeaders();
            url(url1);
        }
    }


    private final Body body;
    private final RawHeaders headers;
    private final String method;
    private final Object tag;
    private final URL url;

    private Request(Builder builder)
    {
        url = builder.url;
        method = builder.method;
        headers = new RawHeaders(builder.headers);
        body = builder.body;
        if (builder.tag != null)
        {
            builder = ((Builder) (builder.tag));
        } else
        {
            builder = this;
        }
        tag = builder;
    }


    public Body body()
    {
        return body;
    }

    public String header(String s)
    {
        return headers.get(s);
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

    public String method()
    {
        return method;
    }

    Builder newBuilder()
    {
        return (new Builder(url)).method(method, body).rawHeaders(headers).tag(tag);
    }

    RawHeaders rawHeaders()
    {
        return new RawHeaders(headers);
    }

    public Object tag()
    {
        return tag;
    }

    public URL url()
    {
        return url;
    }

    public String urlString()
    {
        return url.toString();
    }
}
