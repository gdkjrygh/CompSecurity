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

// Referenced classes of package com.fitbit.serverinteraction:
//            RequestParametersBuilder

static class q
{
    public static final class ContentType extends Enum
    {

        public static final ContentType a;
        public static final ContentType b;
        public static final ContentType c;
        public static final ContentType d;
        private static final ContentType e[];
        final String contentType;

        public static ContentType valueOf(String s)
        {
            return (ContentType)Enum.valueOf(com/fitbit/serverinteraction/RequestParametersBuilder$RequestParameters$ContentType, s);
        }

        public static ContentType[] values()
        {
            return (ContentType[])e.clone();
        }

        static 
        {
            a = new ContentType("DEFAULT", 0, "application/x-www-form-urlencoded;charset=UTF-8");
            b = new ContentType("TEXT_PLAIN", 1, "text/plain");
            c = new ContentType("XML", 2, "text/xml");
            d = new ContentType("BINARY_CONTENT_TYPE", 3, "application/octet-stream;charset=UTF-8");
            e = (new ContentType[] {
                a, b, c, d
            });
        }

        private ContentType(String s, int i1, String s1)
        {
            super(s, i1);
            contentType = s1;
        }
    }

    private static class a extends c
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

        public a(byte abyte0[])
        {
            a = abyte0;
        }
    }

    private static final class b extends c
    {

        private static final String a = com/fitbit/serverinteraction/RequestParametersBuilder$RequestParameters$b.getSimpleName();
        private final c b;
        private final int c;

        public InputStream a()
        {
            InputStream inputstream = b.a();
            ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream(1024);
            byte abyte0[];
            GZIPOutputStream gzipoutputstream;
            byte abyte1[];
            int i1;
            int j1;
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
            i1 = 0;
            j1 = inputstream.read(abyte1);
            if (j1 == -1)
            {
                break; /* Loop/switch isn't completed */
            }
            gzipoutputstream.write(abyte1, 0, j1);
            i1 += j1;
            if (true) goto _L2; else goto _L1
_L2:
            break MISSING_BLOCK_LABEL_38;
_L1:
            gzipoutputstream.finish();
            gzipoutputstream.close();
            abyte0 = bytearrayoutputstream.toByteArray();
            com.fitbit.e.a.d(a, String.format("Http Request Compressed from %s to %s", new Object[] {
                Integer.valueOf(i1), Integer.valueOf(abyte0.length)
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

        public c d()
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
            int i1;
            try
            {
                i1 = ((InputStream) (obj)).read(abyte0);
            }
            catch (IOException ioexception)
            {
                return "Zipped Payload";
            }
            if (i1 == -1)
            {
                break MISSING_BLOCK_LABEL_50;
            }
            bytearrayoutputstream.write(abyte0, 0, i1);
              goto _L1
            ioexception = String.format("zipped(%s)", new Object[] {
                new String(bytearrayoutputstream.toByteArray())
            });
            return ioexception;
        }


        public b(c c1)
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

    static abstract class c
    {

        abstract InputStream a();

        public void a(OutputStream outputstream)
            throws IOException
        {
            InputStream inputstream = a();
            byte abyte0[] = new byte[1024];
            do
            {
                int i1 = inputstream.read(abyte0);
                if (i1 != -1)
                {
                    outputstream.write(abyte0, 0, i1);
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

        public c d()
        {
            return this;
        }

        c()
        {
        }
    }

    static class d
    {

        private static final d a = new d();

        static d a()
        {
            return a;
        }

        void a(HttpURLConnection httpurlconnection)
        {
        }

        void a(HttpURLConnection httpurlconnection, OAuthConsumer oauthconsumer)
        {
        }


        d()
        {
        }
    }

    private static class e extends c
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

        public e(String s)
        {
            a = s;
        }
    }


    private boolean a;
    private boolean b;
    private boolean c;
    private boolean d;
    private boolean e;
    private boolean f;
    private long g;
    private String h;
    private c i;
    private c j;
    private ContentType k;
    private ContentType l;
    private List m;
    private d n;
    private com.fitbit.serverinteraction.validators.a o;
    private g p;
    private boolean q;

    static long a(e.a a1, long l1)
    {
        a1.g = l1;
        return l1;
    }

    static ContentType a(ContentType contenttype, ContentType contenttype1)
    {
        contenttype.k = contenttype1;
        return contenttype1;
    }

    static c a(c c1, c c2)
    {
        c1.i = c2;
        return c2;
    }

    static d a(d d1, d d2)
    {
        d1.n = d2;
        return d2;
    }

    static n a(n n1, n n2)
    {
        n1.j = n2;
        return n2;
    }

    static g a(j j1, g g1)
    {
        j1.p = g1;
        return g1;
    }

    static com.fitbit.serverinteraction.validators.a a(p p1, com.fitbit.serverinteraction.validators.a a1)
    {
        p1.o = a1;
        return a1;
    }

    static String a(o o1, String s)
    {
        o1.h = s;
        return s;
    }

    static List a(h h1, List list)
    {
        h1.m = list;
        return list;
    }

    static boolean a(m m1, boolean flag)
    {
        m1.a = flag;
        return flag;
    }

    static ContentType b(ContentType contenttype, ContentType contenttype1)
    {
        contenttype.l = contenttype1;
        return contenttype1;
    }

    static boolean b(l l1, boolean flag)
    {
        l1.c = flag;
        return flag;
    }

    static boolean c(c c1, boolean flag)
    {
        c1.e = flag;
        return flag;
    }

    static boolean d(e e1, boolean flag)
    {
        e1.d = flag;
        return flag;
    }

    static boolean e(d d1, boolean flag)
    {
        d1.f = flag;
        return flag;
    }

    static boolean f(f f1, boolean flag)
    {
        f1.b = flag;
        return flag;
    }

    static boolean g(b b1, boolean flag)
    {
        b1.q = flag;
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

    public i d()
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

    e.a()
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
        j = j;
        k = com.fitbit.serverinteraction.ContentType.a;
        l = ContentType.b;
        m = Collections.emptyList();
        n = com.fitbit.serverinteraction.d.a();
        q = true;
    }
}
