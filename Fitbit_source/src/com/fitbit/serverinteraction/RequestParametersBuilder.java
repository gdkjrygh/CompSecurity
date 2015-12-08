// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.serverinteraction;

import com.fitbit.serverinteraction.b.g;
import com.fitbit.serverinteraction.validators.a;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.zip.GZIPOutputStream;
import oauth.signpost.OAuthConsumer;

public class RequestParametersBuilder
{
    static class RequestParameters
    {

        private boolean a;
        private boolean b;
        private boolean c;
        private boolean d;
        private boolean e;
        private boolean f;
        private long g;
        private String h;
        private c i;
        private ServerGateway.HttpMethods j;
        private ContentType k;
        private ContentType l;
        private List m;
        private d n;
        private com.fitbit.serverinteraction.validators.a o;
        private g p;
        private boolean q;

        static long a(RequestParameters requestparameters, long l1)
        {
            requestparameters.g = l1;
            return l1;
        }

        static ContentType a(RequestParameters requestparameters, ContentType contenttype)
        {
            requestparameters.k = contenttype;
            return contenttype;
        }

        static c a(RequestParameters requestparameters, c c1)
        {
            requestparameters.i = c1;
            return c1;
        }

        static d a(RequestParameters requestparameters, d d1)
        {
            requestparameters.n = d1;
            return d1;
        }

        static ServerGateway.HttpMethods a(RequestParameters requestparameters, ServerGateway.HttpMethods httpmethods)
        {
            requestparameters.j = httpmethods;
            return httpmethods;
        }

        static g a(RequestParameters requestparameters, g g1)
        {
            requestparameters.p = g1;
            return g1;
        }

        static com.fitbit.serverinteraction.validators.a a(RequestParameters requestparameters, com.fitbit.serverinteraction.validators.a a1)
        {
            requestparameters.o = a1;
            return a1;
        }

        static String a(RequestParameters requestparameters, String s)
        {
            requestparameters.h = s;
            return s;
        }

        static List a(RequestParameters requestparameters, List list)
        {
            requestparameters.m = list;
            return list;
        }

        static boolean a(RequestParameters requestparameters, boolean flag)
        {
            requestparameters.a = flag;
            return flag;
        }

        static ContentType b(RequestParameters requestparameters, ContentType contenttype)
        {
            requestparameters.l = contenttype;
            return contenttype;
        }

        static boolean b(RequestParameters requestparameters, boolean flag)
        {
            requestparameters.c = flag;
            return flag;
        }

        static boolean c(RequestParameters requestparameters, boolean flag)
        {
            requestparameters.e = flag;
            return flag;
        }

        static boolean d(RequestParameters requestparameters, boolean flag)
        {
            requestparameters.d = flag;
            return flag;
        }

        static boolean e(RequestParameters requestparameters, boolean flag)
        {
            requestparameters.f = flag;
            return flag;
        }

        static boolean f(RequestParameters requestparameters, boolean flag)
        {
            requestparameters.b = flag;
            return flag;
        }

        static boolean g(RequestParameters requestparameters, boolean flag)
        {
            requestparameters.q = flag;
            return flag;
        }

        public ContentType a()
        {
            return k;
        }

        public String b()
        {
            return h;
        }

        public c c()
        {
            return i;
        }

        public ServerGateway.HttpMethods d()
        {
            return j;
        }

        public List e()
        {
            return m;
        }

        public d f()
        {
            return n;
        }

        public boolean g()
        {
            return a;
        }

        public boolean h()
        {
            return b;
        }

        public com.fitbit.serverinteraction.validators.a i()
        {
            return o;
        }

        public g j()
        {
            return p;
        }

        public boolean k()
        {
            return c;
        }

        public boolean l()
        {
            return d;
        }

        public long m()
        {
            return g;
        }

        public boolean n()
        {
            return f;
        }

        public boolean o()
        {
            return e;
        }

        public ContentType p()
        {
            return l;
        }

        public boolean q()
        {
            return q;
        }

        RequestParameters()
        {
            a = false;
            b = true;
            c = false;
            d = false;
            e = false;
            f = false;
            g = 0x1d4c0L;
            h = "";
            i = null;
            j = ServerGateway.HttpMethods.b;
            k = com.fitbit.serverinteraction.ContentType.a;
            l = ContentType.b;
            m = Collections.emptyList();
            n = com.fitbit.serverinteraction.d.a();
            q = true;
        }
    }

    public static final class RequestParameters.ContentType extends Enum
    {

        public static final RequestParameters.ContentType a;
        public static final RequestParameters.ContentType b;
        public static final RequestParameters.ContentType c;
        public static final RequestParameters.ContentType d;
        private static final RequestParameters.ContentType e[];
        final String contentType;

        public static RequestParameters.ContentType valueOf(String s)
        {
            return (RequestParameters.ContentType)Enum.valueOf(com/fitbit/serverinteraction/RequestParametersBuilder$RequestParameters$ContentType, s);
        }

        public static RequestParameters.ContentType[] values()
        {
            return (RequestParameters.ContentType[])e.clone();
        }

        static 
        {
            a = new RequestParameters.ContentType("DEFAULT", 0, "application/x-www-form-urlencoded;charset=UTF-8");
            b = new RequestParameters.ContentType("TEXT_PLAIN", 1, "text/plain");
            c = new RequestParameters.ContentType("XML", 2, "text/xml");
            d = new RequestParameters.ContentType("BINARY_CONTENT_TYPE", 3, "application/octet-stream;charset=UTF-8");
            e = (new RequestParameters.ContentType[] {
                a, b, c, d
            });
        }

        private RequestParameters.ContentType(String s, int i, String s1)
        {
            super(s, i);
            contentType = s1;
        }
    }

    private static class RequestParameters.a extends RequestParameters.c
    {

        private byte a[];

        InputStream a()
        {
            return new ByteArrayInputStream(a);
        }

        public int b()
        {
            return a.length;
        }

        public String toString()
        {
            if (a.length > 2048)
            {
                return (new StringBuilder()).append("<< Content lenght: ").append(a.length).append(" >>").toString();
            } else
            {
                return Arrays.toString(a);
            }
        }

        public RequestParameters.a(byte abyte0[])
        {
            a = abyte0;
        }
    }

    private static final class RequestParameters.b extends RequestParameters.c
    {

        private static final String a = com/fitbit/serverinteraction/RequestParametersBuilder$RequestParameters$b.getSimpleName();
        private final RequestParameters.c b;
        private final int c;

        public InputStream a()
        {
            InputStream inputstream = b.a();
            ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream(1024);
            byte abyte0[];
            GZIPOutputStream gzipoutputstream;
            byte abyte1[];
            int i;
            int j;
            try
            {
                gzipoutputstream = new GZIPOutputStream(bytearrayoutputstream);
                abyte1 = new byte[1024];
            }
            catch (IOException ioexception)
            {
                com.fitbit.e.a.f(a, "Gzip failed for entity", ioexception, new Object[0]);
                throw new RuntimeException("compression failed", ioexception);
            }
            i = 0;
            j = inputstream.read(abyte1);
            if (j == -1)
            {
                break; /* Loop/switch isn't completed */
            }
            gzipoutputstream.write(abyte1, 0, j);
            i += j;
            if (true) goto _L2; else goto _L1
_L2:
            break MISSING_BLOCK_LABEL_38;
_L1:
            gzipoutputstream.finish();
            gzipoutputstream.close();
            abyte0 = bytearrayoutputstream.toByteArray();
            com.fitbit.e.a.d(a, String.format("Http Request Compressed from %s to %s", new Object[] {
                Integer.valueOf(i), Integer.valueOf(abyte0.length)
            }), new Object[0]);
            return new ByteArrayInputStream(abyte0);
        }

        public int b()
        {
            return c;
        }

        public String c()
        {
            return "gzip";
        }

        public RequestParameters.c d()
        {
            return b;
        }

        public String toString()
        {
            Object obj;
            ByteArrayOutputStream bytearrayoutputstream;
            byte abyte0[];
            obj = b.a();
            bytearrayoutputstream = new ByteArrayOutputStream();
            abyte0 = new byte[1024];
_L1:
            int i;
            try
            {
                i = ((InputStream) (obj)).read(abyte0);
            }
            catch (IOException ioexception)
            {
                return "Zipped Payload";
            }
            if (i == -1)
            {
                break MISSING_BLOCK_LABEL_50;
            }
            bytearrayoutputstream.write(abyte0, 0, i);
              goto _L1
            ioexception = String.format("zipped(%s)", new Object[] {
                new String(bytearrayoutputstream.toByteArray())
            });
            return ioexception;
        }


        public RequestParameters.b(RequestParameters.c c1)
        {
            b = c1;
            c1 = a();
            if (c1 instanceof ByteArrayInputStream)
            {
                c = ((ByteArrayInputStream)c1).available();
                return;
            } else
            {
                c = -1;
                return;
            }
        }
    }

    static abstract class RequestParameters.c
    {

        abstract InputStream a();

        public void a(OutputStream outputstream)
            throws IOException
        {
            InputStream inputstream = a();
            byte abyte0[] = new byte[1024];
            do
            {
                int i = inputstream.read(abyte0);
                if (i != -1)
                {
                    outputstream.write(abyte0, 0, i);
                } else
                {
                    outputstream.flush();
                    return;
                }
            } while (true);
        }

        public abstract int b();

        public String c()
        {
            return null;
        }

        public RequestParameters.c d()
        {
            return this;
        }

        RequestParameters.c()
        {
        }
    }

    static class RequestParameters.d
    {

        private static final RequestParameters.d a = new RequestParameters.d();

        static RequestParameters.d a()
        {
            return a;
        }

        void a(HttpURLConnection httpurlconnection)
        {
        }

        void a(HttpURLConnection httpurlconnection, OAuthConsumer oauthconsumer)
        {
        }


        RequestParameters.d()
        {
        }
    }

    private static class RequestParameters.e extends RequestParameters.c
    {

        private final String a;

        InputStream a()
        {
            if (a == null)
            {
                return null;
            } else
            {
                return new ByteArrayInputStream(a.getBytes());
            }
        }

        public int b()
        {
            if (a == null)
            {
                return 0;
            } else
            {
                return a.getBytes().length;
            }
        }

        public String toString()
        {
            return a;
        }

        public RequestParameters.e(String s)
        {
            a = s;
        }
    }

    public static class a extends RequestParametersBuilder
    {

        public a()
        {
        }
    }

    public static class b extends RequestParametersBuilder
    {

        public b()
        {
        }
    }

    public static class c extends RequestParametersBuilder
    {

        public c()
        {
        }
    }


    private static final boolean a = true;
    private static final int b = 512;
    private RequestParameters c;

    public RequestParametersBuilder()
    {
        c = new RequestParameters();
    }

    public RequestParametersBuilder(RequestParameters requestparameters)
    {
        c = requestparameters;
    }

    public RequestParameters a()
    {
        return c;
    }

    public RequestParametersBuilder a(long l)
    {
        com.fitbit.serverinteraction.RequestParameters.a(c, l);
        return this;
    }

    public RequestParametersBuilder a(RequestParameters.ContentType contenttype)
    {
        com.fitbit.serverinteraction.RequestParameters.a(c, contenttype);
        return this;
    }

    public RequestParametersBuilder a(RequestParameters.d d1)
    {
        com.fitbit.serverinteraction.RequestParameters.a(c, d1);
        return this;
    }

    public RequestParametersBuilder a(ServerGateway.HttpMethods httpmethods)
    {
        com.fitbit.serverinteraction.RequestParameters.a(c, httpmethods);
        return this;
    }

    public RequestParametersBuilder a(g g1)
    {
        com.fitbit.serverinteraction.RequestParameters.a(c, g1);
        return this;
    }

    public RequestParametersBuilder a(com.fitbit.serverinteraction.validators.a a1)
    {
        com.fitbit.serverinteraction.RequestParameters.a(c, a1);
        return this;
    }

    public RequestParametersBuilder a(String s)
    {
        com.fitbit.serverinteraction.RequestParameters.a(c, s);
        return this;
    }

    public RequestParametersBuilder a(String s, boolean flag)
    {
        RequestParameters.e e1;
        if (s != null)
        {
            if ((e1 = new RequestParameters.e(s)).a() != null)
            {
                if (flag && s.length() > 512)
                {
                    s = new RequestParameters.b(e1);
                } else
                {
                    s = e1;
                }
                com.fitbit.serverinteraction.RequestParameters.a(c, s);
                return this;
            }
        }
        return this;
    }

    public RequestParametersBuilder a(List list)
    {
        if (list == null)
        {
            com.fitbit.serverinteraction.RequestParameters.a(c, Collections.emptyList());
            return this;
        } else
        {
            com.fitbit.serverinteraction.RequestParameters.a(c, list);
            return this;
        }
    }

    public RequestParametersBuilder a(boolean flag)
    {
        com.fitbit.serverinteraction.RequestParameters.a(c, flag);
        return this;
    }

    public RequestParametersBuilder a(byte abyte0[])
    {
        return a(abyte0, true);
    }

    public RequestParametersBuilder a(byte abyte0[], boolean flag)
    {
        RequestParameters.a a1 = new RequestParameters.a(abyte0);
        if (a1.a() == null)
        {
            return this;
        }
        if (flag && abyte0.length > 512)
        {
            abyte0 = new RequestParameters.b(a1);
        } else
        {
            abyte0 = a1;
        }
        com.fitbit.serverinteraction.RequestParameters.a(c, abyte0);
        return this;
    }

    public RequestParametersBuilder b(RequestParameters.ContentType contenttype)
    {
        RequestParameters.b(c, contenttype);
        return this;
    }

    public RequestParametersBuilder b(String s)
    {
        return a(s, true);
    }

    public RequestParametersBuilder b(boolean flag)
    {
        RequestParameters.b(c, flag);
        return this;
    }

    public RequestParametersBuilder c(boolean flag)
    {
        RequestParameters.c(c, flag);
        return this;
    }

    public RequestParametersBuilder d(boolean flag)
    {
        RequestParameters.d(c, flag);
        return this;
    }

    public RequestParametersBuilder e(boolean flag)
    {
        RequestParameters.e(c, flag);
        return this;
    }

    public RequestParametersBuilder f(boolean flag)
    {
        RequestParameters.f(c, flag);
        return this;
    }

    public RequestParametersBuilder g(boolean flag)
    {
        com.fitbit.serverinteraction.RequestParameters.g(c, flag);
        return this;
    }
}
