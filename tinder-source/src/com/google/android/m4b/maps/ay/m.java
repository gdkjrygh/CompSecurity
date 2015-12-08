// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.ay;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Looper;
import android.util.Log;
import android.widget.Toast;
import com.google.android.m4b.maps.a.h;
import com.google.android.m4b.maps.a.k;
import com.google.android.m4b.maps.a.l;
import com.google.android.m4b.maps.a.r;
import com.google.android.m4b.maps.ac.a;
import com.google.android.m4b.maps.y.g;
import com.google.android.m4b.maps.y.i;
import com.google.android.m4b.maps.y.j;
import com.google.android.m4b.maps.y.p;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Vector;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.google.android.m4b.maps.ay:
//            u, ag, ab, g, 
//            k, v, af, l, 
//            r, ac, t, n, 
//            q, w, z, x

public class m
    implements l.a, u
{
    final class a extends n
    {

        private m a;

        public final void a(DataOutput dataoutput)
        {
        }

        public final boolean a(DataInput datainput)
        {
            this;
            JVM INSTR monitorenter ;
            com.google.android.m4b.maps.ay.m.a(a, Long.valueOf(datainput.readLong()));
            if (!com.google.android.m4b.maps.ay.ab.a(com.google.android.m4b.maps.ay.m.i(), 4)) goto _L2; else goto _L1
_L1:
            String s1;
            s1 = com.google.android.m4b.maps.ay.m.i();
            datainput = String.valueOf(Long.toHexString(m.m(a).longValue()));
            if (datainput.length() == 0)
            {
                break MISSING_BLOCK_LABEL_91;
            }
            datainput = "GMM Server Cookie: ".concat(datainput);
_L3:
            Log.i(s1, datainput);
_L2:
            com.google.android.m4b.maps.ay.m.a(a, m.m(a).longValue());
            this;
            JVM INSTR monitorexit ;
            return true;
            datainput = new String("GMM Server Cookie: ");
              goto _L3
            datainput;
            throw datainput;
        }

        public final boolean c()
        {
            return false;
        }

        public final int g()
        {
            return 15;
        }

        private a()
        {
            a = m.this;
            super();
        }

        a(byte byte0)
        {
            this();
        }
    }

    public final class b
    {

        volatile String a;
        private m b;

        static void a(b b1)
        {
            b1.b.h = false;
            b1.b.a(0);
        }

        static void b(b b1)
        {
            b1.b();
        }

        final void a()
        {
            this;
            JVM INSTR monitorenter ;
            boolean flag = m.n(b);
            if (flag) goto _L2; else goto _L1
_L1:
            this;
            JVM INSTR monitorexit ;
            return;
_L2:
            c c1 = b.f.a();
            if (c1 == null)
            {
                continue; /* Loop/switch isn't completed */
            }
            m.b(c1.a);
            (new Thread(c1, "DataRequestDispatcher")).start();
            if (true) goto _L1; else goto _L3
_L3:
            Exception exception;
            exception;
            throw exception;
        }

        final void b()
        {
            boolean flag;
            if (!b.a() && b.f.a)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (flag)
            {
                a();
            }
        }

        final long c()
        {
            this;
            JVM INSTR monitorenter ;
            m.o(b);
            JVM INSTR tableswitch 4 4: default 89
        //                       4 40;
               goto _L1 _L2
_L1:
            long l1 = com.google.android.m4b.maps.ay.m.p(b);
_L4:
            this;
            JVM INSTR monitorexit ;
            return l1;
_L2:
            long l2;
            long l3;
            l1 = com.google.android.m4b.maps.ay.m.p(b);
            l2 = m.q(b).nextLong();
            l3 = com.google.android.m4b.maps.ay.m.p(b);
            l1 = l1 + 800L + l2 % l3;
            if (true) goto _L4; else goto _L3
_L3:
            Exception exception;
            exception;
            throw exception;
        }

        private b(String s1)
        {
            b = m.this;
            super();
            a = s1;
        }

        b(String s1, byte byte0)
        {
            this(s1);
        }
    }

    final class c
        implements Runnable
    {

        final m a;
        private final Vector b;
        private final com.google.android.m4b.maps.ay.r c;

        private String a()
        {
            StringBuilder stringbuilder = new StringBuilder();
            Iterator iterator = b.iterator();
            String s1 = "";
            t t1;
            for (; iterator.hasNext(); stringbuilder.append(t1.g()))
            {
                t1 = (t)iterator.next();
                stringbuilder.append(s1);
                s1 = ",";
            }

            return stringbuilder.toString();
        }

        static Map a(c c1, byte abyte0[])
        {
            HashMap hashmap = new HashMap();
            hashmap.put("Content-Type", "application/binary");
            hashmap.put("Content-Length", String.valueOf(abyte0.length));
            if (!com.google.android.m4b.maps.y.p.b(com.google.android.m4b.maps.ay.m.h(c1.a)))
            {
                abyte0 = String.valueOf(com.google.android.m4b.maps.ay.m.h(c1.a));
                String s1;
                String s2;
                g g1;
                Object aobj[];
                if (abyte0.length() != 0)
                {
                    abyte0 = "Bearer ".concat(abyte0);
                } else
                {
                    abyte0 = new String("Bearer ");
                }
                hashmap.put("Authorization", abyte0);
            }
            if (com.google.android.m4b.maps.ay.m.g(c1.a))
            {
                abyte0 = c1.a.h();
                s1 = c1.c.a.g(39);
                s2 = c1.c.a.g(40);
                boolean flag;
                if (s1 != null)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                com.google.android.m4b.maps.y.j.b(flag, "app version not set");
                if (s2 != null)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                com.google.android.m4b.maps.y.j.b(flag, "gmm version not set");
                g1 = com.google.android.m4b.maps.y.g.a(',');
                aobj = new Object[3];
                aobj[0] = c1.a.b;
                aobj[1] = s2;
                aobj[2] = c1.a.a;
                com.google.android.m4b.maps.y.j.a(((Object) (aobj)));
                hashmap.put("X-Google-Maps-Mobile-API", g1.a(new com.google.android.m4b.maps.y.g._cls2(aobj, abyte0, s1)));
            }
            return hashmap;
        }

        static void a(c c1, int i1, String s1)
        {
            if (i1 == 200) goto _L2; else goto _L1
_L1:
            if (com.google.android.m4b.maps.ay.ab.a(com.google.android.m4b.maps.ay.m.i(), 5))
            {
                Log.w(com.google.android.m4b.maps.ay.m.i(), (new StringBuilder(35)).append("Bad HTTP response code: ").append(i1).toString());
            }
            if (i1 == 500)
            {
                for (s1 = c1.b.iterator(); s1.hasNext(); ((t)s1.next()).e()) { }
                if (c1.a.c)
                {
                    m m1 = c1.a;
                    s1 = String.valueOf(c1.a());
                    if (s1.length() != 0)
                    {
                        s1 = "Server 500 for request types: ".concat(s1);
                    } else
                    {
                        s1 = new String("Server 500 for request types: ");
                    }
                    m1.a(7, s1);
                }
                c1 = c1.a();
                throw new d((new StringBuilder(String.valueOf(c1).length() + 41)).append("Serverside failure (HTTP").append(i1).append(") for ").append(c1).toString());
            }
            if (i1 != 403 || !com.google.android.m4b.maps.ay.m.g(c1.a)) goto _L4; else goto _L3
_L3:
            if (com.google.android.m4b.maps.ay.m.a(c1.a) != null)
            {
                com.google.android.m4b.maps.ay.m.a(c1.a).d();
                com.google.android.m4b.maps.ay.m.a(c1.a).a(c1.a);
            }
_L5:
            c1 = c1.a();
            throw new IOException((new StringBuilder(String.valueOf(c1).length() + 40)).append("Bad HTTP response code: ").append(i1).append(" for ").append(c1).toString());
_L4:
            if (i1 == 501)
            {
                c1.a.a(2);
                throw new IOException("Server side HTTP not implemented");
            }
            if (i1 == 400 && com.google.android.m4b.maps.ay.m.g(c1.a))
            {
                c1.a.d();
            }
            if (true) goto _L5; else goto _L2
_L2:
            if (!"application/binary".equals(s1))
            {
                if (com.google.android.m4b.maps.ay.ab.a(com.google.android.m4b.maps.ay.m.i(), 6))
                {
                    String s3 = com.google.android.m4b.maps.ay.m.i();
                    String s2 = String.valueOf(s1);
                    if (s2.length() != 0)
                    {
                        s2 = "Bad HTTP content type: ".concat(s2);
                    } else
                    {
                        s2 = new String("Bad HTTP content type: ");
                    }
                    Log.e(s3, s2);
                }
                c1 = c1.a();
                throw new IOException((new StringBuilder(String.valueOf(s1).length() + 28 + String.valueOf(c1).length())).append("Bad HTTP content type: ").append(s1).append(" for ").append(c1).toString());
            } else
            {
                return;
            }
        }

        private void a(DataInput datainput)
        {
            Object obj;
            ArrayList arraylist;
            int i1;
            arraylist = new ArrayList();
            obj = null;
            i1 = 0;
_L4:
            if (i1 >= b.size()) goto _L2; else goto _L1
_L1:
            Object obj1 = (t)b.get(i1);
            if (com.google.android.m4b.maps.ay.ab.a(com.google.android.m4b.maps.ay.m.i(), 3))
            {
                obj = com.google.android.m4b.maps.ay.m.i();
                String s2 = String.valueOf(obj1);
                Log.d(((String) (obj)), (new StringBuilder(String.valueOf(s2).length() + 24)).append("Processing DataRequest: ").append(s2).toString());
            }
            int j1 = datainput.readUnsignedByte();
            if (j1 != ((t) (obj1)).g())
            {
                if (com.google.android.m4b.maps.ay.ab.a(com.google.android.m4b.maps.ay.m.i(), 3))
                {
                    datainput = com.google.android.m4b.maps.ay.m.i();
                    int j2 = ((t) (obj1)).g();
                    Log.d(datainput, (new StringBuilder(64)).append("Expecting request type: ").append(j2).append(" got: ").append(j1).append(".  ABORTING!").toString());
                }
                int k2 = ((t) (obj1)).g();
                throw new IOException((new StringBuilder(30)).append("RT: ").append(j1).append(" != ").append(k2).toString());
            }
              goto _L3
            datainput;
            obj = obj1;
_L7:
            if (com.google.android.m4b.maps.ay.ab.a(com.google.android.m4b.maps.ay.m.i(), 6))
            {
                obj1 = com.google.android.m4b.maps.ay.m.i();
                int k1 = ((t) (obj)).g();
                Log.e(((String) (obj1)), (new StringBuilder(24)).append("IOException: ").append(k1).toString());
            }
            if (datainput instanceof EOFException)
            {
                ((t) (obj)).e();
                if (a.c)
                {
                    int l1 = ((t) (obj)).g();
                    obj = (new StringBuilder(47)).append("No server support for data request: ").append(l1).toString();
                    a.a(7, ((String) (obj)));
                }
            }
            throw datainput;
            datainput;
            if (i1 < b.size())
            {
                arraylist.addAll(b.subList(i1, b.size()));
            }
            b.clear();
            b.addAll(arraylist);
            throw datainput;
_L3:
            if (!((t) (obj1)).a(datainput))
            {
                break MISSING_BLOCK_LABEL_454;
            }
            a.a(((t) (obj1)));
            for (boolean flag = true; flag; flag = false)
            {
                break MISSING_BLOCK_LABEL_443;
            }

            arraylist.add(obj1);
            i1++;
            obj = obj1;
              goto _L4
_L2:
            if (i1 < b.size())
            {
                arraylist.addAll(b.subList(i1, b.size()));
            }
            b.clear();
            b.addAll(arraylist);
            return;
              goto _L4
            datainput;
            obj = obj1;
_L6:
            if (com.google.android.m4b.maps.ay.ab.a(com.google.android.m4b.maps.ay.m.i(), 6))
            {
                String s1 = com.google.android.m4b.maps.ay.m.i();
                int i2 = ((t) (obj)).g();
                Log.e(s1, (new StringBuilder(29)).append("RunTimeException: ").append(i2).toString());
            }
            throw datainput;
            datainput;
            if (true) goto _L6; else goto _L5
_L5:
            datainput;
              goto _L7
        }

        public final void run()
        {
_L5:
            if (!m.c(a) || b.size() <= 0) goto _L2; else goto _L1
_L1:
            this;
            JVM INSTR monitorenter ;
            long l2 = a.e.c();
            if (l2 <= 0L)
            {
                break MISSING_BLOCK_LABEL_47;
            }
            Object obj;
            Object obj1;
            Object obj2;
            Object obj3;
            Object obj4;
            Object obj5;
            Object obj6;
            int i1;
            int j1;
            int k1;
            int l1;
            try
            {
                wait(l2);
            }
            // Misplaced declaration of an exception variable
            catch (Object obj1) { }
            this;
            JVM INSTR monitorexit ;
            i1 = b.size();
            obj = new ByteArrayOutputStream();
            obj2 = new DataOutputStream(((java.io.OutputStream) (obj)));
            obj3 = new q(c, a);
            if (b.size() <= 0)
            {
                break MISSING_BLOCK_LABEL_300;
            }
            if (!((t)b.elementAt(0) instanceof q)) goto _L4; else goto _L3
_L3:
            b.setElementAt(obj3, 0);
_L6:
            ((DataOutputStream) (obj2)).writeShort(23);
            ((DataOutputStream) (obj2)).writeLong(com.google.android.m4b.maps.ay.m.k(a));
            ((DataOutputStream) (obj2)).writeUTF(com.google.android.m4b.maps.ay.w.h.a);
            ((DataOutputStream) (obj2)).writeUTF(a.a);
            ((DataOutputStream) (obj2)).writeUTF(a.b);
            ((DataOutputStream) (obj2)).writeUTF(com.google.android.m4b.maps.ay.m.l(a));
            t t1;
            for (obj3 = b.iterator(); ((Iterator) (obj3)).hasNext(); t1.a(((DataOutput) (obj2))))
            {
                t1 = (t)((Iterator) (obj3)).next();
                ((DataOutputStream) (obj2)).writeByte(t1.g());
            }

            break MISSING_BLOCK_LABEL_324;
            obj;
            com.google.android.m4b.maps.ay.b.a(a.e);
              goto _L5
            obj;
            m.f(a);
            b.b(a.e);
            throw obj;
            obj;
            this;
            JVM INSTR monitorexit ;
            throw obj;
_L4:
            b.insertElementAt(obj3, 0);
              goto _L6
            obj;
            com.google.android.m4b.maps.ay.m.a(a, 4);
              goto _L5
            b.insertElementAt(obj3, 0);
              goto _L6
            obj;
            com.google.android.m4b.maps.ay.m.a(a, 3);
              goto _L5
            ((DataOutputStream) (obj2)).flush();
            obj5 = ((ByteArrayOutputStream) (obj)).toByteArray();
            obj4 = new x(b, com.google.android.m4b.maps.ay.m.i(a));
            obj = com.google.android.m4b.maps.am.i.a();
            obj2 = new k(this, a.e.a, ((com.google.android.m4b.maps.a.a) (obj)), ((byte []) (obj5)), ((com.google.android.m4b.maps.am.i) (obj)), ((x) (obj4))) {

                private byte l[];
                private com.google.android.m4b.maps.am.i m;
                private x n;
                private c o;

                protected final com.google.android.m4b.maps.a.m a(h h1)
                {
                    String s1 = (String)h1.c.get("Content-Type");
                    com.google.android.m4b.maps.ay.c.a(o, h1.a, s1);
                    x x1 = n;
                    x1.f = com.google.android.m4b.maps.ay.k.c() - x1.e;
                    x1.d.append(", ");
                    if (x1.f < 1000L)
                    {
                        x1.d.append("<1s");
                    } else
                    {
                        x1.d.append(x1.f / 1000L).append("s");
                    }
                    return com.google.android.m4b.maps.a.m.a(h1.b, null);
                    h1;
_L2:
                    return com.google.android.m4b.maps.a.m.a(new r(h1));
                    h1;
                    if (true) goto _L2; else goto _L1
_L1:
                }

                public final Map a()
                {
                    return com.google.android.m4b.maps.ay.c.a(o, l);
                }

                protected final void a(Object obj)
                {
                    obj = (byte[])obj;
                    m.a(obj);
                }

                public final String b()
                {
                    return "application/binary";
                }

                public final byte[] c()
                {
                    return l;
                }

            
            {
                o = c1;
                l = abyte0;
                m = i1;
                n = x1;
                super(1, s1, a1);
            }
            };
            obj2.g = false;
            com.google.android.m4b.maps.ay.m.j(a).a(((k) (obj2)));
            obj3 = null;
            obj6 = (byte[])((com.google.android.m4b.maps.am.i) (obj)).get();
            obj2 = new DataInputStream(new ByteArrayInputStream(((byte []) (obj6))));
            obj = obj2;
            if (((DataInputStream) (obj2)).readUnsignedShort() == 23) goto _L8; else goto _L7
_L7:
            obj = obj2;
            a.a(1);
            obj = obj2;
            throw new IOException("Protocol version mismatch with the server");
            obj3;
_L28:
            obj = obj2;
            obj3 = (r)((ExecutionException) (obj3)).getCause();
            obj = obj2;
            if (!com.google.android.m4b.maps.ay.ab.a(com.google.android.m4b.maps.ay.m.i(), 5))
            {
                break MISSING_BLOCK_LABEL_501;
            }
            obj = obj2;
            Log.w(com.google.android.m4b.maps.ay.m.i(), "Exception when executing the requests", ((r) (obj3)).getCause());
            obj = obj2;
            throw ((r) (obj3)).getCause();
            obj2;
            obj3 = obj;
            obj = obj2;
_L26:
            if (obj3 == null)
            {
                break MISSING_BLOCK_LABEL_521;
            }
            ((DataInputStream) (obj3)).close();
_L25:
            obj2 = new ArrayList();
            obj3 = b.iterator();
_L13:
            if (!((Iterator) (obj3)).hasNext()) goto _L10; else goto _L9
_L9:
            obj4 = (t)((Iterator) (obj3)).next();
            if (((t) (obj4)).d()) goto _L12; else goto _L11
_L11:
            if (com.google.android.m4b.maps.ay.ab.a(com.google.android.m4b.maps.ay.m.i(), 3))
            {
                obj5 = com.google.android.m4b.maps.ay.m.i();
                obj6 = String.valueOf(obj4);
                Log.d(((String) (obj5)), (new StringBuilder(String.valueOf(obj6).length() + 31)).append("Error processing: ").append(((String) (obj6))).append(" not retrying").toString());
            }
            a.b(((t) (obj4)));
              goto _L13
            obj;
            com.google.android.m4b.maps.ay.m.a(a, 5);
              goto _L5
_L8:
            obj = obj2;
            a(((DataInput) (obj2)));
            obj = obj2;
            j1 = obj5.length;
            obj = obj2;
            k1 = obj6.length;
            obj = obj2;
            l1 = (int)(com.google.android.m4b.maps.ay.k.c() - ((x) (obj4)).e);
            if (k1 < 8192)
            {
                break MISSING_BLOCK_LABEL_812;
            }
            obj = obj2;
            if ((long)l1 > x.b)
            {
                break MISSING_BLOCK_LABEL_812;
            }
            obj = obj2;
            obj4.c = (int)(TimeUnit.SECONDS.toMillis(k1) / (long)l1);
            obj = obj2;
            if (!com.google.android.m4b.maps.ay.ab.a(com.google.android.m4b.maps.ay.x.a, 3))
            {
                break MISSING_BLOCK_LABEL_812;
            }
            obj = obj2;
            obj3 = com.google.android.m4b.maps.ay.x.a;
            obj = obj2;
            l1 = ((x) (obj4)).c;
            obj = obj2;
            Log.d(((String) (obj3)), (new StringBuilder(67)).append("Sent ").append(j1).append(", Loaded ").append(k1).append(" bytes.  Byte/Sec = ").append(l1).toString());
            obj = obj2;
            ((x) (obj4)).d.append(", ");
            if (k1 >= 1000) goto _L15; else goto _L14
_L14:
            obj = obj2;
            ((x) (obj4)).d.append("<1kb");
_L21:
            obj = obj2;
            if (!com.google.android.m4b.maps.ay.ab.a(com.google.android.m4b.maps.ay.x.a, 3))
            {
                break MISSING_BLOCK_LABEL_877;
            }
            obj = obj2;
            Log.d(com.google.android.m4b.maps.ay.x.a, ((x) (obj4)).d.toString());
            ((DataInputStream) (obj2)).close();
_L23:
            obj = new ArrayList();
            obj2 = b.iterator();
_L20:
            if (!((Iterator) (obj2)).hasNext()) goto _L17; else goto _L16
_L16:
            obj3 = (t)((Iterator) (obj2)).next();
            if (((t) (obj3)).d()) goto _L19; else goto _L18
_L18:
            if (com.google.android.m4b.maps.ay.ab.a(com.google.android.m4b.maps.ay.m.i(), 3))
            {
                obj4 = com.google.android.m4b.maps.ay.m.i();
                String s1 = String.valueOf(obj3);
                Log.d(((String) (obj4)), (new StringBuilder(String.valueOf(s1).length() + 31)).append("Error processing: ").append(s1).append(" not retrying").toString());
            }
            a.b(((t) (obj3)));
              goto _L20
_L15:
            obj = obj2;
            ((x) (obj4)).d.append(k1 / 1000).append("kb");
              goto _L21
            obj3;
_L27:
            obj = obj2;
            if (!com.google.android.m4b.maps.ay.ab.a(com.google.android.m4b.maps.ay.m.i(), 5))
            {
                break MISSING_BLOCK_LABEL_1053;
            }
            obj = obj2;
            Log.w(com.google.android.m4b.maps.ay.m.i(), "Exception when processing the responses", ((Throwable) (obj3)));
            obj = obj2;
            throw obj3;
            obj2;
            if (!com.google.android.m4b.maps.ay.ab.a(com.google.android.m4b.maps.ay.m.i(), 3)) goto _L23; else goto _L22
_L22:
            obj = com.google.android.m4b.maps.ay.m.i();
            obj2 = String.valueOf(obj2);
            Log.d(((String) (obj)), (new StringBuilder(String.valueOf(obj2).length() + 12)).append("Closing is: ").append(((String) (obj2))).toString());
              goto _L23
_L19:
            if (com.google.android.m4b.maps.ay.ab.a(com.google.android.m4b.maps.ay.m.i(), 3))
            {
                obj4 = com.google.android.m4b.maps.ay.m.i();
                String s2 = String.valueOf(obj3);
                Log.d(((String) (obj4)), (new StringBuilder(String.valueOf(s2).length() + 10)).append("Retrying: ").append(s2).toString());
            }
            ((List) (obj)).add(obj3);
              goto _L20
_L17:
            b.removeAllElements();
            b.addAll(((java.util.Collection) (obj)));
            m.d(a);
            m.e(a);
            if (i1 == b.size())
            {
                throw new IOException("No requests are processed");
            }
              goto _L5
            obj3;
            if (!com.google.android.m4b.maps.ay.ab.a(com.google.android.m4b.maps.ay.m.i(), 3)) goto _L25; else goto _L24
_L24:
            obj2 = com.google.android.m4b.maps.ay.m.i();
            obj3 = String.valueOf(obj3);
            Log.d(((String) (obj2)), (new StringBuilder(String.valueOf(obj3).length() + 12)).append("Closing is: ").append(((String) (obj3))).toString());
              goto _L25
_L12:
            if (com.google.android.m4b.maps.ay.ab.a(com.google.android.m4b.maps.ay.m.i(), 3))
            {
                String s3 = com.google.android.m4b.maps.ay.m.i();
                String s4 = String.valueOf(obj4);
                Log.d(s3, (new StringBuilder(String.valueOf(s4).length() + 10)).append("Retrying: ").append(s4).toString());
            }
            ((List) (obj2)).add(obj4);
              goto _L13
_L10:
            b.removeAllElements();
            b.addAll(((java.util.Collection) (obj2)));
            throw obj1;
_L2:
            m.f(a);
            b.b(a.e);
            return;
            obj1;
              goto _L26
            obj3;
            obj2 = null;
              goto _L27
            obj3;
            obj2 = null;
              goto _L28
        }

        c(Vector vector, com.google.android.m4b.maps.ay.r r1)
        {
            a = m.this;
            super();
            b = vector;
            c = r1;
        }
    }

    static final class d extends Exception
    {

        d(String s1)
        {
            super(s1);
        }
    }

    public final class e
    {

        boolean a;
        final com.google.android.m4b.maps.ay.r b;
        private Vector c;
        private m d;

        final c a()
        {
            this;
            JVM INSTR monitorenter ;
            if (c.size() != 0)
            {
                break MISSING_BLOCK_LABEL_16;
            }
            this;
            JVM INSTR monitorexit ;
            return null;
            if (a)
            {
                break MISSING_BLOCK_LABEL_32;
            }
            this;
            JVM INSTR monitorexit ;
            return null;
            Exception exception;
            exception;
            this;
            JVM INSTR monitorexit ;
            throw exception;
            String s1;
            if (com.google.android.m4b.maps.ay.m.a(d) == null)
            {
                break MISSING_BLOCK_LABEL_88;
            }
            s1 = com.google.android.m4b.maps.ay.m.a(d).c();
            if (s1 == null)
            {
                break MISSING_BLOCK_LABEL_88;
            }
            synchronized (d.f.b)
            {
                d.f.b.a(s1);
            }
            obj = d. new c(c, b);
            c = new Vector();
            a = false;
            this;
            JVM INSTR monitorexit ;
            return ((c) (obj));
            exception1;
            obj;
            JVM INSTR monitorexit ;
            throw exception1;
        }

        public final void a(t t1)
        {
            t1.f();
            if (com.google.android.m4b.maps.ay.ab.a(com.google.android.m4b.maps.ay.m.i(), 3))
            {
                String s1 = com.google.android.m4b.maps.ay.m.i();
                int i1 = t1.g();
                Log.d(s1, (new StringBuilder(29)).append("Add Data Request: ").append(i1).toString());
            }
            boolean flag = d.g;
            this;
            JVM INSTR monitorenter ;
            if (t1.c())
            {
                a = true;
            }
            c.add(t1);
            this;
            JVM INSTR monitorexit ;
            if (t1.c() && !d.a())
            {
                d.e.a();
            }
            return;
            t1;
            this;
            JVM INSTR monitorexit ;
            throw t1;
        }

        private e(com.google.android.m4b.maps.ay.r r1)
        {
            d = m.this;
            super();
            c = new Vector();
            a = false;
            b = r1;
        }

        e(com.google.android.m4b.maps.ay.r r1, byte byte0)
        {
            this(r1);
        }
    }


    private static final String m = com/google/android/m4b/maps/ay/m.getSimpleName();
    private static final long s;
    private static final long t;
    private static final long u;
    private boolean A;
    private final com.google.android.m4b.maps.ay.k B;
    private int C;
    private l D;
    protected final String a;
    protected final String b;
    protected final boolean c;
    public volatile boolean d;
    protected final b e;
    protected e f;
    protected volatile boolean g;
    public volatile boolean h;
    public volatile String i;
    ac j;
    public volatile com.google.android.m4b.maps.ay.l k;
    final SharedPreferences l;
    private String n;
    private final String o;
    private Long p;
    private final List q;
    private final Random r;
    private volatile int v;
    private volatile boolean w;
    private long x;
    private long y;
    private volatile int z;

    private m(Context context, String s1, String s2, com.google.android.m4b.maps.ay.r r1, l l1)
    {
        String s4;
        q = new ArrayList();
        r = new Random();
        h = false;
        x = 0L;
        y = 0x8000000000000000L;
        z = 0;
        A = false;
        C = -1;
        s4 = (String)com.google.android.m4b.maps.ay.ag.a("debug.mapview.gmmserver").a("");
        if (!s4.startsWith("http")) goto _L2; else goto _L1
_L1:
        String s3;
        s3 = Uri.parse(s4).getHost();
        String s5;
        boolean flag;
        if (s3.endsWith(".google.com") || s3.equals("localhost"))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (!flag) goto _L2; else goto _L3
_L3:
        if (com.google.android.m4b.maps.ay.ab.a(m, 4))
        {
            s5 = m;
            s3 = String.valueOf(s4);
            if (s3.length() != 0)
            {
                s3 = "Hitting custom GMM server: ".concat(s3);
            } else
            {
                s3 = new String("Hitting custom GMM server: ");
            }
            Log.i(s5, s3);
        }
        s3 = s4;
        if (Looper.myLooper() == Looper.getMainLooper())
        {
            s3 = String.valueOf(s4);
            if (s3.length() != 0)
            {
                s3 = "Hitting custom GMM server: ".concat(s3);
            } else
            {
                s3 = new String("Hitting custom GMM server: ");
            }
            Toast.makeText(context, s3, 1).show();
            s3 = s4;
        }
_L5:
        s4 = s3;
        if (!s3.endsWith("/api"))
        {
            s4 = String.valueOf(s3).concat("/api");
        }
        n = s4;
        b = s2;
        a = s1;
        o = com.google.android.m4b.maps.ay.g.b(context);
        l = context.getSharedPreferences("com.google.maps.api.android.lib6.drd.PREFERENCES_FILE", 0);
        c = false;
        B = new com.google.android.m4b.maps.ay.k();
        D = l1;
        e = new b(n, (byte)0);
        f = new e(r1, (byte)0);
        if (com.google.android.m4b.maps.ay.ab.a(m, 3))
        {
            s1 = m;
            context = String.valueOf(n);
            if (context.length() != 0)
            {
                context = "Using server: ".concat(context);
            } else
            {
                context = new String("Using server: ");
            }
            Log.d(s1, context);
        }
        return;
_L2:
        s3 = "https://clients4.google.com/glm/mmap";
        if (true) goto _L5; else goto _L4
_L4:
    }

    static com.google.android.m4b.maps.ay.l a(m m1)
    {
        return m1.k;
    }

    public static m a(Context context, String s1, String s2, com.google.android.m4b.maps.ay.r r1, l l1)
    {
        return new m(context, s1, s2, r1, l1);
    }

    static Long a(m m1, Long long1)
    {
        m1.p = long1;
        return long1;
    }

    static void a(m m1, int i1)
    {
        boolean flag1 = false;
        m1;
        JVM INSTR monitorenter ;
        m1.C = i1;
        if (i1 != 4) goto _L2; else goto _L1
_L1:
        if (m1.x != 0L && !m1.w) goto _L4; else goto _L3
_L3:
        m1.m();
        m1.C = i1;
        m1.x = 200L;
        boolean flag = flag1;
_L6:
        m1;
        JVM INSTR monitorexit ;
        if (flag)
        {
            m1.a(i1);
        }
        return;
_L4:
        flag = flag1;
        if (m1.x >= u) goto _L6; else goto _L5
_L5:
        m1.x = m1.x * 2L;
        flag = flag1;
          goto _L6
        Exception exception;
        exception;
        m1;
        JVM INSTR monitorexit ;
        throw exception;
_L2:
        if (m1.w)
        {
            break MISSING_BLOCK_LABEL_160;
        }
        m1.x = 200L;
        if (m1.y != 0x8000000000000000L)
        {
            break MISSING_BLOCK_LABEL_137;
        }
        m1.y = com.google.android.m4b.maps.ay.k.c();
        flag = flag1;
          goto _L6
        flag = flag1;
        if (m1.y + s >= com.google.android.m4b.maps.ay.k.c()) goto _L6; else goto _L7
_L7:
        flag = true;
          goto _L6
        if (m1.x >= t)
        {
            break MISSING_BLOCK_LABEL_205;
        }
        m1.x = t;
_L9:
        flag = flag1;
        if (m1.x <= u) goto _L6; else goto _L8
_L8:
        m1.x = u;
        flag = flag1;
          goto _L6
        m1.x = (m1.x * 5L) / 4L;
          goto _L9
    }

    static void a(m m1, long l1)
    {
        m1 = m1.l.edit();
        m1.putLong("SessionID", l1);
        m1.commit();
    }

    static void b(m m1)
    {
        m1.j();
    }

    static boolean c(m m1)
    {
        return m1.h;
    }

    static boolean d(m m1)
    {
        m1.A = true;
        return true;
    }

    static void e(m m1)
    {
        m1.m();
    }

    static void f(m m1)
    {
        m1.k();
    }

    static boolean g(m m1)
    {
        return m1.d;
    }

    static String h(m m1)
    {
        return m1.i;
    }

    static com.google.android.m4b.maps.ay.k i(m m1)
    {
        return m1.B;
    }

    static String i()
    {
        return m;
    }

    static l j(m m1)
    {
        return m1.D;
    }

    private void j()
    {
        this;
        JVM INSTR monitorenter ;
        z = z + 1;
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    static long k(m m1)
    {
        return m1.n();
    }

    private void k()
    {
        this;
        JVM INSTR monitorenter ;
        z = z - 1;
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    static String l(m m1)
    {
        return m1.o;
    }

    private boolean l()
    {
        this;
        JVM INSTR monitorenter ;
        if (!h || z >= 10) goto _L2; else goto _L1
_L1:
        if (A) goto _L4; else goto _L3
_L3:
        int i1 = z;
        if (i1 != 0) goto _L2; else goto _L4
_L4:
        boolean flag = true;
_L6:
        this;
        JVM INSTR monitorexit ;
        return flag;
_L2:
        flag = false;
        if (true) goto _L6; else goto _L5
_L5:
        Exception exception;
        exception;
        throw exception;
    }

    static Long m(m m1)
    {
        return m1.p;
    }

    private void m()
    {
        this;
        JVM INSTR monitorenter ;
        y = 0x8000000000000000L;
        w = false;
        x = 0L;
        C = -1;
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    private long n()
    {
        this;
        JVM INSTR monitorenter ;
        if (p != null) goto _L2; else goto _L1
_L1:
        long l1 = l.getLong("SessionID", 0L);
        if (l1 != 0L) goto _L4; else goto _L3
_L3:
        f.a(new a((byte)0));
_L6:
        p = Long.valueOf(l1);
_L2:
        l1 = p.longValue();
        this;
        JVM INSTR monitorexit ;
        return l1;
_L4:
        if (!com.google.android.m4b.maps.ay.ab.a(m, 4)) goto _L6; else goto _L5
_L5:
        Object obj;
        String s1;
        s1 = m;
        obj = String.valueOf(Long.toHexString(l1));
        if (((String) (obj)).length() == 0)
        {
            break MISSING_BLOCK_LABEL_116;
        }
        obj = "GMM Server Cookie (cached): ".concat(((String) (obj)));
_L7:
        Log.i(s1, ((String) (obj)));
          goto _L6
        obj;
        throw obj;
        obj = new String("GMM Server Cookie (cached): ");
          goto _L7
    }

    static boolean n(m m1)
    {
        return m1.l();
    }

    static int o(m m1)
    {
        return m1.C;
    }

    static long p(m m1)
    {
        return m1.x;
    }

    static Random q(m m1)
    {
        return m1.r;
    }

    public final String a(String s1)
    {
        return l.getString(s1, null);
    }

    protected final void a(int i1)
    {
        boolean flag = true;
        this;
        JVM INSTR monitorenter ;
        if (w)
        {
            break MISSING_BLOCK_LABEL_62;
        }
        if (com.google.android.m4b.maps.ay.ab.a(m, 6))
        {
            Log.e(m, "In Error Mode");
        }
        w = true;
        y = 0x8000000000000000L;
_L1:
        this;
        JVM INSTR monitorexit ;
        if (flag)
        {
            a(i1, ((String) (null)));
        }
        return;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
        flag = false;
          goto _L1
    }

    protected final void a(int i1, String s1)
    {
        v av[] = d();
        int k1 = av.length;
        for (int j1 = 0; j1 < k1; j1++)
        {
            av[j1].a(i1, s1);
        }

    }

    public final void a(int i1, byte abyte0[], boolean flag, boolean flag1, boolean flag2)
    {
        f.a(new af(i1, abyte0, flag));
    }

    public final void a(com.google.android.m4b.maps.ay.l l1)
    {
        synchronized (f.b)
        {
            f.b.a(l1.c());
        }
        e.a();
        return;
        l1;
        r1;
        JVM INSTR monitorexit ;
        throw l1;
    }

    protected final void a(t t1)
    {
        v av[] = d();
        int j1 = av.length;
        for (int i1 = 0; i1 < j1; i1++)
        {
            av[i1].a(t1);
        }

    }

    public final void a(v v1)
    {
        this;
        JVM INSTR monitorenter ;
        if (!q.contains(v1))
        {
            q.add(v1);
        }
        this;
        JVM INSTR monitorexit ;
        return;
        v1;
        throw v1;
    }

    final void a(String s1, String s2)
    {
        android.content.SharedPreferences.Editor editor = l.edit();
        editor.putString(s1, s2);
        editor.commit();
    }

    public final boolean a()
    {
        this;
        JVM INSTR monitorenter ;
        int i1 = v;
        boolean flag;
        if (i1 > 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        this;
        JVM INSTR monitorexit ;
        return flag;
        Exception exception;
        exception;
        throw exception;
    }

    public final void b()
    {
        this;
        JVM INSTR monitorenter ;
        v = v + 1;
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    protected final void b(t t1)
    {
        v av[] = d();
        int j1 = av.length;
        for (int i1 = 0; i1 < j1; i1++)
        {
            av[i1].b(t1);
        }

    }

    public final void b(v v1)
    {
        this;
        JVM INSTR monitorenter ;
        q.remove(v1);
        this;
        JVM INSTR monitorexit ;
        return;
        v1;
        throw v1;
    }

    public final void c()
    {
        this;
        JVM INSTR monitorenter ;
        v = v - 1;
        if (!a())
        {
            break MISSING_BLOCK_LABEL_22;
        }
        this;
        JVM INSTR monitorexit ;
        return;
        this;
        JVM INSTR monitorexit ;
        b.b(e);
        return;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final void c(t t1)
    {
        f.a(t1);
    }

    final v[] d()
    {
        this;
        JVM INSTR monitorenter ;
        v av[];
        av = new v[q.size()];
        q.toArray(av);
        this;
        JVM INSTR monitorexit ;
        return av;
        Exception exception;
        exception;
        throw exception;
    }

    public final boolean e()
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag = w;
        this;
        JVM INSTR monitorexit ;
        return flag;
        Exception exception;
        exception;
        throw exception;
    }

    public final void f()
    {
        h = false;
    }

    public final void g()
    {
        h = true;
        e.b();
    }

    public final String h()
    {
        return f.b.a.g(5);
    }

    static 
    {
        s = TimeUnit.SECONDS.toMillis(15L);
        t = TimeUnit.SECONDS.toMillis(2L);
        u = TimeUnit.SECONDS.toMillis(30L);
    }
}
