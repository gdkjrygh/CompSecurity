// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.okhttp;

import com.squareup.okhttp.internal.a.a;
import com.squareup.okhttp.internal.b;
import com.squareup.okhttp.internal.http.i;
import com.squareup.okhttp.internal.http.p;
import com.squareup.okhttp.internal.k;
import java.io.File;
import java.io.IOException;
import java.security.cert.Certificate;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import okio.ByteString;
import okio.d;
import okio.e;
import okio.g;
import okio.h;
import okio.l;
import okio.q;
import okio.r;

// Referenced classes of package com.squareup.okhttp:
//            t, p, v, o, 
//            w, r, n, Protocol

public final class com.squareup.okhttp.c
{
    private final class a
        implements com.squareup.okhttp.internal.http.b
    {

        boolean a;
        final com.squareup.okhttp.c b;
        private final com.squareup.okhttp.internal.b.a c;
        private q d;
        private q e;

        public final void a()
        {
label0:
            {
                synchronized (b)
                {
                    if (!a)
                    {
                        break label0;
                    }
                }
                return;
            }
            a = true;
            com.squareup.okhttp.c c1 = b;
            c1.d = c1.d + 1;
            obj;
            JVM INSTR monitorexit ;
            k.a(d);
            try
            {
                c.b();
                return;
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                return;
            }
            exception;
            obj;
            JVM INSTR monitorexit ;
            throw exception;
        }

        public final q b()
        {
            return e;
        }

        public a(com.squareup.okhttp.internal.b.a a1)
            throws IOException
        {
            b = com.squareup.okhttp.c.this;
            super();
            c = a1;
            d = a1.a(1);
            e = new _cls1(this, d, com.squareup.okhttp.c.this, a1);
        }
    }

    private static final class b extends w
    {

        private final com.squareup.okhttp.internal.b.c a;
        private final e b;
        private final String c;
        private final String d;

        static com.squareup.okhttp.internal.b.c a(b b1)
        {
            return b1.a;
        }

        public final com.squareup.okhttp.r a()
        {
            if (c != null)
            {
                return com.squareup.okhttp.r.a(c);
            } else
            {
                return null;
            }
        }

        public final long b()
        {
            long l1 = -1L;
            try
            {
                if (d != null)
                {
                    l1 = Long.parseLong(d);
                }
            }
            catch (NumberFormatException numberformatexception)
            {
                return -1L;
            }
            return l1;
        }

        public final e c()
        {
            return b;
        }

        public b(com.squareup.okhttp.internal.b.c c1, String s, String s1)
        {
            a = c1;
            c = s;
            d = s1;
            b = l.a(new _cls1(this, c1.c[1], c1));
        }
    }

    private static final class c
    {

        final String a;
        final o b;
        final String c;
        final Protocol d;
        final int e;
        final String f;
        final o g;
        final n h;

        private static List a(e e1)
            throws IOException
        {
            int i1 = com.squareup.okhttp.c.a(e1);
            if (i1 != -1) goto _L2; else goto _L1
_L1:
            Object obj = Collections.emptyList();
_L4:
            return ((List) (obj));
_L2:
            ArrayList arraylist;
            CertificateFactory certificatefactory;
            okio.c c1;
            int j;
            try
            {
                certificatefactory = CertificateFactory.getInstance("X.509");
                arraylist = new ArrayList(i1);
            }
            // Misplaced declaration of an exception variable
            catch (e e1)
            {
                throw new IOException(e1.getMessage());
            }
            j = 0;
            obj = arraylist;
            if (j >= i1) goto _L4; else goto _L3
_L3:
            obj = e1.p();
            c1 = new okio.c();
            c1.a(ByteString.b(((String) (obj))));
            arraylist.add(certificatefactory.generateCertificate(c1.e()));
            j++;
            break MISSING_BLOCK_LABEL_37;
        }

        private static void a(d d1, List list)
            throws IOException
        {
            int j;
            int i1;
            try
            {
                d1.k(list.size());
                d1.h(10);
                i1 = list.size();
            }
            // Misplaced declaration of an exception variable
            catch (d d1)
            {
                throw new IOException(d1.getMessage());
            }
            j = 0;
            if (j >= i1)
            {
                break; /* Loop/switch isn't completed */
            }
            d1.b(okio.b.a(ByteString.a(((Certificate)list.get(j)).getEncoded()).c));
            d1.h(10);
            j++;
            if (true) goto _L2; else goto _L1
_L2:
            break MISSING_BLOCK_LABEL_32;
_L1:
        }

        private boolean a()
        {
            return a.startsWith("https://");
        }

        public final void a(com.squareup.okhttp.internal.b.a a1)
            throws IOException
        {
            boolean flag = false;
            a1 = l.a(a1.a(0));
            a1.b(a);
            a1.h(10);
            a1.b(c);
            a1.h(10);
            a1.k(b.a.length / 2);
            a1.h(10);
            int j1 = b.a.length / 2;
            for (int j = 0; j < j1; j++)
            {
                a1.b(b.a(j));
                a1.b(": ");
                a1.b(b.b(j));
                a1.h(10);
            }

            a1.b((new p(d, e, f)).toString());
            a1.h(10);
            a1.k(g.a.length / 2);
            a1.h(10);
            j1 = g.a.length / 2;
            for (int i1 = ((flag) ? 1 : 0); i1 < j1; i1++)
            {
                a1.b(g.a(i1));
                a1.b(": ");
                a1.b(g.b(i1));
                a1.h(10);
            }

            if (a())
            {
                a1.h(10);
                a1.b(h.a);
                a1.h(10);
                a(((d) (a1)), h.b);
                a(((d) (a1)), h.c);
            }
            a1.close();
        }

        public c(v v1)
        {
            a = v1.a.a.toString();
            b = com.squareup.okhttp.internal.http.k.c(v1);
            c = v1.a.b;
            d = v1.b;
            e = v1.c;
            f = v1.d;
            g = v1.f;
            h = v1.e;
        }

        public c(r r1)
            throws IOException
        {
            boolean flag;
            flag = false;
            super();
            Object obj;
            Object obj1;
            int i1;
            obj = l.a(r1);
            a = ((e) (obj)).p();
            c = ((e) (obj)).p();
            obj1 = new o.a();
            i1 = com.squareup.okhttp.c.a(((e) (obj)));
            int j = 0;
_L2:
            if (j >= i1)
            {
                break; /* Loop/switch isn't completed */
            }
            ((o.a) (obj1)).a(((e) (obj)).p());
            j++;
            if (true) goto _L2; else goto _L1
_L1:
            b = ((o.a) (obj1)).a();
            obj1 = p.a(((e) (obj)).p());
            d = ((p) (obj1)).a;
            e = ((p) (obj1)).b;
            f = ((p) (obj1)).c;
            obj1 = new o.a();
            i1 = com.squareup.okhttp.c.a(((e) (obj)));
            j = ((flag) ? 1 : 0);
_L4:
            if (j >= i1)
            {
                break; /* Loop/switch isn't completed */
            }
            ((o.a) (obj1)).a(((e) (obj)).p());
            j++;
            if (true) goto _L4; else goto _L3
_L3:
            g = ((o.a) (obj1)).a();
            if (!a())
            {
                break MISSING_BLOCK_LABEL_290;
            }
            obj1 = ((e) (obj)).p();
            if (((String) (obj1)).length() > 0)
            {
                throw new IOException((new StringBuilder("expected \"\" but was \"")).append(((String) (obj1))).append("\"").toString());
            }
            break MISSING_BLOCK_LABEL_230;
            obj;
            r1.close();
            throw obj;
            List list;
            obj1 = ((e) (obj)).p();
            list = a(((e) (obj)));
            obj = a(((e) (obj)));
            if (obj1 != null)
            {
                break MISSING_BLOCK_LABEL_262;
            }
            throw new IllegalArgumentException("cipherSuite == null");
            h = new n(((String) (obj1)), k.a(list), k.a(((List) (obj))));
_L5:
            r1.close();
            return;
            h = null;
              goto _L5
        }
    }


    final com.squareup.okhttp.internal.e a;
    public final com.squareup.okhttp.internal.b b;
    int c;
    int d;
    private int e;
    private int f;
    private int g;

    public com.squareup.okhttp.c(File file, long l)
    {
        this(file, l, com.squareup.okhttp.internal.a.a.a);
    }

    private com.squareup.okhttp.c(File file, long l, com.squareup.okhttp.internal.a.a a1)
    {
        a = new com.squareup.okhttp.internal.e() {

            final com.squareup.okhttp.c a;

            public final com.squareup.okhttp.internal.http.b a(v v1)
                throws IOException
            {
                return a.a(v1);
            }

            public final v a(t t1)
                throws IOException
            {
                return a.a(t1);
            }

            public final void a()
            {
                a.a();
            }

            public final void a(com.squareup.okhttp.internal.http.c c1)
            {
                a.a(c1);
            }

            public final void a(v v1, v v2)
                throws IOException
            {
                c c1 = new c(v2);
                v2 = com.squareup.okhttp.b.a((b)v1.g);
                v1 = null;
                try
                {
                    v2 = com.squareup.okhttp.internal.b.a(((com.squareup.okhttp.internal.b.c) (v2)).d, ((com.squareup.okhttp.internal.b.c) (v2)).a, ((com.squareup.okhttp.internal.b.c) (v2)).b);
                }
                // Misplaced declaration of an exception variable
                catch (v v2)
                {
                    com.squareup.okhttp.c.a(v1);
                    return;
                }
                if (v2 == null)
                {
                    break MISSING_BLOCK_LABEL_55;
                }
                v1 = v2;
                c1.a(v2);
                v1 = v2;
                v2.a();
            }

            public final void b(t t1)
                throws IOException
            {
                a.b(t1);
            }

            
            {
                a = com.squareup.okhttp.c.this;
                super();
            }
        };
        b = com.squareup.okhttp.internal.b.a(a1, file, l);
    }

    static int a(e e1)
        throws IOException
    {
        long l;
        try
        {
            l = e1.l();
            e1 = e1.p();
        }
        // Misplaced declaration of an exception variable
        catch (e e1)
        {
            throw new IOException(e1.getMessage());
        }
        if (l < 0L || l > 0x7fffffffL)
        {
            break MISSING_BLOCK_LABEL_35;
        }
        if (e1.isEmpty())
        {
            break MISSING_BLOCK_LABEL_81;
        }
        throw new IOException((new StringBuilder("expected an int but was \"")).append(l).append(e1).append("\"").toString());
        return (int)l;
    }

    static void a(com.squareup.okhttp.internal.b.a a1)
    {
        if (a1 == null)
        {
            break MISSING_BLOCK_LABEL_8;
        }
        a1.b();
        return;
        a1;
    }

    private static String c(t t1)
    {
        return k.a(t1.a.toString());
    }

    final com.squareup.okhttp.internal.http.b a(v v1)
        throws IOException
    {
label0:
        {
            {
                Object obj = v1.a.b;
                if (!i.a(v1.a.b))
                {
                    break label0;
                }
                IOException ioexception;
                try
                {
                    b(v1.a);
                }
                // Misplaced declaration of an exception variable
                catch (v v1)
                {
                    return null;
                }
            }
            return null;
        }
        if (!((String) (obj)).equals("GET") || com.squareup.okhttp.internal.http.k.b(v1))
        {
            break MISSING_BLOCK_LABEL_29;
        }
        obj = new c(v1);
        v1 = b.a(c(v1.a), -1L);
        if (v1 == null)
        {
            break MISSING_BLOCK_LABEL_29;
        }
        ((c) (obj)).a(v1);
        obj = new a(v1);
        return ((com.squareup.okhttp.internal.http.b) (obj));
        v1;
        v1 = null;
_L2:
        a(((com.squareup.okhttp.internal.b.a) (v1)));
        return null;
        ioexception;
        if (true) goto _L2; else goto _L1
_L1:
    }

    final v a(t t1)
    {
        boolean flag1 = false;
        Object obj = c(t1);
        c c1;
        String s;
        String s1;
        Object obj1;
        v.a a1;
        boolean flag;
        try
        {
            obj = b.a(((String) (obj)));
        }
        // Misplaced declaration of an exception variable
        catch (t t1)
        {
            return null;
        }
        if (obj == null)
        {
            return null;
        }
        try
        {
            c1 = new c(((com.squareup.okhttp.internal.b.c) (obj)).c[0]);
        }
        // Misplaced declaration of an exception variable
        catch (t t1)
        {
            k.a(((java.io.Closeable) (obj)));
            return null;
        }
        s = c1.g.a("Content-Type");
        s1 = c1.g.a("Content-Length");
        obj1 = (new t.a()).a(c1.a).a(c1.c, null);
        obj1.c = c1.b.a();
        obj1 = ((t.a) (obj1)).a();
        a1 = new v.a();
        a1.a = ((t) (obj1));
        a1.b = c1.d;
        a1.c = c1.e;
        a1.d = c1.f;
        obj1 = a1.a(c1.g);
        obj1.g = new b(((com.squareup.okhttp.internal.b.c) (obj)), s, s1);
        obj1.e = c1.h;
        obj = ((v.a) (obj1)).a();
        flag = flag1;
        if (c1.a.equals(t1.a.toString()))
        {
            flag = flag1;
            if (c1.c.equals(t1.b))
            {
                flag = flag1;
                if (com.squareup.okhttp.internal.http.k.a(((v) (obj)), c1.b, t1))
                {
                    flag = true;
                }
            }
        }
        if (!flag)
        {
            k.a(((v) (obj)).g);
            return null;
        } else
        {
            return ((v) (obj));
        }
    }

    final void a()
    {
        this;
        JVM INSTR monitorenter ;
        f = f + 1;
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    final void a(com.squareup.okhttp.internal.http.c c1)
    {
        this;
        JVM INSTR monitorenter ;
        g = g + 1;
        if (c1.a == null) goto _L2; else goto _L1
_L1:
        e = e + 1;
_L4:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        if (c1.b != null)
        {
            f = f + 1;
        }
        if (true) goto _L4; else goto _L3
_L3:
        c1;
        throw c1;
    }

    final void b(t t1)
        throws IOException
    {
        b.b(c(t1));
    }

    // Unreferenced inner class com/squareup/okhttp/c$a$1

/* anonymous class */
    final class a._cls1 extends g
    {

        final com.squareup.okhttp.c a;
        final com.squareup.okhttp.internal.b.a b;
        final a c;

        public final void close()
            throws IOException
        {
label0:
            {
                synchronized (c.b)
                {
                    if (!c.a)
                    {
                        break label0;
                    }
                }
                return;
            }
            c.a = true;
            com.squareup.okhttp.c c2 = c.b;
            c2.c = c2.c + 1;
            c1;
            JVM INSTR monitorexit ;
            super.close();
            b.a();
            return;
            exception;
            c1;
            JVM INSTR monitorexit ;
            throw exception;
        }

            
            {
                c = a1;
                a = c1;
                b = a2;
                super(q);
            }
    }


    // Unreferenced inner class com/squareup/okhttp/c$b$1

/* anonymous class */
    final class b._cls1 extends h
    {

        final com.squareup.okhttp.internal.b.c a;
        final b b;

        public final void close()
            throws IOException
        {
            a.close();
            super.close();
        }

            
            {
                b = b1;
                a = c1;
                super(r);
            }
    }

}
