// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class gsa
    implements Closeable
{

    private static Pattern a = Pattern.compile("[a-z0-9_-]{1,120}");
    private static final hcv r = new hcv() {

        public final hcx T_()
        {
            return hcx.b;
        }

        public final void a_(hch hch1, long l1)
        {
            hch1.f(l1);
        }

        public final void close()
        {
        }

        public final void flush()
        {
        }

    };
    private static boolean s;
    private final guw b;
    private final File c;
    private final File d;
    private final File e;
    private final File f;
    private long g;
    private long h;
    private hci i;
    private final LinkedHashMap j = new LinkedHashMap(0, 0.75F, true);
    private int k;
    private boolean l;
    private boolean m;
    private boolean n;
    private long o;
    private final Executor p;
    private final Runnable q = new Runnable() {

        private gsa a;

        public final void run()
        {
            gsa gsa1 = a;
            gsa1;
            JVM INSTR monitorenter ;
            boolean flag;
            if (!gsa.a(a))
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (!(flag | gsa.b(a)))
            {
                break MISSING_BLOCK_LABEL_39;
            }
            gsa1;
            JVM INSTR monitorexit ;
            return;
            gsa.c(a);
            if (gsa.d(a))
            {
                gsa.e(a);
                gsa.f(a);
            }
            gsa1;
            JVM INSTR monitorexit ;
            return;
            Object obj;
            obj;
            gsa1;
            JVM INSTR monitorexit ;
            throw obj;
            obj;
            throw new RuntimeException(((Throwable) (obj)));
        }

            
            {
                a = gsa.this;
                super();
            }
    };

    private gsa(guw guw1, File file, long l1, Executor executor)
    {
        h = 0L;
        o = 0L;
        b = guw1;
        c = file;
        d = new File(file, "journal");
        e = new File(file, "journal.tmp");
        f = new File(file, "journal.bkp");
        g = l1;
        p = executor;
    }

    static int a()
    {
        return 2;
    }

    public static gsa a(guw guw1, File file, long l1)
    {
        if (l1 <= 0L)
        {
            throw new IllegalArgumentException("maxSize <= 0");
        } else
        {
            return new gsa(guw1, file, l1, new ThreadPoolExecutor(0, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), gsp.a("OkHttp DiskLruCache", true)));
        }
    }

    public static gsb a(gsa gsa1, String s1, long l1)
    {
        return gsa1.a(s1, l1);
    }

    static void a(gsa gsa1, gsb gsb1, boolean flag)
    {
        gsa1.a(gsb1, flag);
    }

    private void a(gsb gsb1, boolean flag)
    {
        boolean flag1 = false;
        this;
        JVM INSTR monitorenter ;
        gsc gsc1;
        gsc1 = gsb1.a;
        if (gsc1.f != gsb1)
        {
            throw new IllegalStateException();
        }
        break MISSING_BLOCK_LABEL_31;
        gsb1;
        this;
        JVM INSTR monitorexit ;
        throw gsb1;
        int j1 = ((flag1) ? 1 : 0);
        if (!flag) goto _L2; else goto _L1
_L1:
        j1 = ((flag1) ? 1 : 0);
        if (gsc1.e) goto _L2; else goto _L3
_L3:
        int i1 = 0;
_L7:
        j1 = ((flag1) ? 1 : 0);
        if (i1 >= 2) goto _L2; else goto _L4
_L4:
        if (!gsb1.b[i1])
        {
            gsb1.b();
            throw new IllegalStateException((new StringBuilder("Newly created entry didn't create value for index ")).append(i1).toString());
        }
        if (b.e(gsc1.d[i1])) goto _L6; else goto _L5
_L5:
        gsb1.b();
_L8:
        this;
        JVM INSTR monitorexit ;
        return;
_L6:
        i1++;
          goto _L7
_L2:
        File file;
        long l1;
        long l2;
        for (; j1 >= 2; j1++)
        {
            break MISSING_BLOCK_LABEL_250;
        }

        gsb1 = gsc1.d[j1];
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_237;
        }
        if (b.e(gsb1))
        {
            file = gsc1.c[j1];
            b.a(gsb1, file);
            l1 = gsc1.b[j1];
            l2 = b.f(file);
            gsc1.b[j1] = l2;
            h = (h - l1) + l2;
        }
        break MISSING_BLOCK_LABEL_460;
        b.d(gsb1);
        break MISSING_BLOCK_LABEL_460;
        k = k + 1;
        gsc1.f = null;
        if (!(gsc1.e | flag))
        {
            break MISSING_BLOCK_LABEL_400;
        }
        gsc1.e = true;
        i.b("CLEAN").h(32);
        i.b(gsc1.a);
        gsc1.a(i);
        i.h(10);
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_356;
        }
        l1 = o;
        o = 1L + l1;
        gsc1.g = l1;
_L9:
        i.flush();
        if (h > g || h())
        {
            p.execute(q);
        }
          goto _L8
        j.remove(gsc1.a);
        i.b("REMOVE").h(32);
        i.b(gsc1.a);
        i.h(10);
          goto _L9
    }

    static boolean a(gsa gsa1)
    {
        return gsa1.m;
    }

    static boolean a(gsa gsa1, gsc gsc1)
    {
        return gsa1.a(gsc1);
    }

    private boolean a(gsc gsc1)
    {
        if (gsc1.f != null)
        {
            gsc1.f.c = true;
        }
        for (int i1 = 0; i1 < 2; i1++)
        {
            b.d(gsc1.c[i1]);
            h = h - gsc1.b[i1];
            gsc1.b[i1] = 0L;
        }

        k = k + 1;
        i.b("REMOVE").h(32).b(gsc1.a).h(10);
        j.remove(gsc1.a);
        if (h())
        {
            p.execute(q);
        }
        return true;
    }

    static hcv b()
    {
        return r;
    }

    static boolean b(gsa gsa1)
    {
        return gsa1.n;
    }

    private void c()
    {
        this;
        JVM INSTR monitorenter ;
        if (!s && !Thread.holdsLock(this))
        {
            throw new AssertionError();
        }
        break MISSING_BLOCK_LABEL_28;
        Object obj;
        obj;
        this;
        JVM INSTR monitorexit ;
        throw obj;
        boolean flag = m;
        if (!flag) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        if (b.e(f))
        {
            if (!b.e(d))
            {
                break MISSING_BLOCK_LABEL_200;
            }
            b.d(f);
        }
_L3:
        flag = b.e(d);
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_188;
        }
        d();
        f();
        m = true;
          goto _L1
        obj;
        gsk.a();
        gsk.a((new StringBuilder("DiskLruCache ")).append(c).append(" is corrupt: ").append(((IOException) (obj)).getMessage()).append(", removing").toString());
        close();
        b.g(c);
        n = false;
        g();
        m = true;
          goto _L1
        b.a(f, d);
          goto _L3
    }

    static void c(gsa gsa1)
    {
        gsa1.k();
    }

    private static void c(String s1)
    {
        if (!a.matcher(s1).matches())
        {
            throw new IllegalArgumentException((new StringBuilder("keys must match regex [a-z0-9_-]{1,120}: \"")).append(s1).append("\"").toString());
        } else
        {
            return;
        }
    }

    private void d()
    {
        hcj hcj1 = hcq.a(b.a(d));
        Exception exception;
        String s1 = hcj1.q();
        String s3 = hcj1.q();
        String s4 = hcj1.q();
        String s5 = hcj1.q();
        String s7 = hcj1.q();
        if (!"libcore.io.DiskLruCache".equals(s1) || !"1".equals(s3) || !Integer.toString(0x31191).equals(s4) || !Integer.toString(2).equals(s5) || !"".equals(s7))
        {
            throw new IOException((new StringBuilder("unexpected journal header: [")).append(s1).append(", ").append(s3).append(", ").append(s5).append(", ").append(s7).append("]").toString());
        }
        int i1 = 0;
_L8:
        String s6;
        int j1;
        s6 = hcj1.q();
        j1 = s6.indexOf(' ');
        if (j1 != -1) goto _L2; else goto _L1
_L1:
        try
        {
            throw new IOException((new StringBuilder("unexpected journal line: ")).append(s6).toString());
        }
        catch (EOFException eofexception) { }
        finally
        {
            gsp.a(hcj1);
            throw exception;
        }
        k = i1 - j.size();
        if (hcj1.e()) goto _L4; else goto _L3
_L3:
        g();
_L6:
        gsp.a(hcj1);
        return;
_L2:
        int k1 = j1 + 1;
        int l1 = s6.indexOf(' ', k1);
        if (l1 != -1)
        {
            break MISSING_BLOCK_LABEL_335;
        }
        String s2 = s6.substring(k1);
        if (j1 != 6)
        {
            break MISSING_BLOCK_LABEL_345;
        }
        if (s6.startsWith("REMOVE"))
        {
            j.remove(s2);
            break; /* Loop/switch isn't completed */
        }
        break MISSING_BLOCK_LABEL_345;
        s2 = s6.substring(k1, l1);
        gsc gsc2 = (gsc)j.get(s2);
        gsc gsc1;
        gsc1 = gsc2;
        if (gsc2 != null)
        {
            break MISSING_BLOCK_LABEL_384;
        }
        gsc1 = new gsc(this, s2, (byte)0);
        j.put(s2, gsc1);
        if (l1 == -1 || j1 != 5)
        {
            break MISSING_BLOCK_LABEL_440;
        }
        if (s6.startsWith("CLEAN"))
        {
            String as[] = s6.substring(l1 + 1).split(" ");
            gsc1.e = true;
            gsc1.f = null;
            gsc1.a(as);
            break; /* Loop/switch isn't completed */
        }
        if (l1 != -1 || j1 != 5)
        {
            break MISSING_BLOCK_LABEL_480;
        }
        if (s6.startsWith("DIRTY"))
        {
            gsc1.f = new gsb(this, gsc1, (byte)0);
            break; /* Loop/switch isn't completed */
        }
        if (l1 != -1 || j1 != 4)
        {
            break MISSING_BLOCK_LABEL_503;
        }
        if (s6.startsWith("READ"))
        {
            break; /* Loop/switch isn't completed */
        }
        throw new IOException((new StringBuilder("unexpected journal line: ")).append(s6).toString());
_L4:
        i = e();
        if (true) goto _L6; else goto _L5
_L5:
        i1++;
        if (true) goto _L8; else goto _L7
_L7:
    }

    static boolean d(gsa gsa1)
    {
        return gsa1.h();
    }

    private hci e()
    {
        return hcq.a(new gse(b.c(d)) {

            private static boolean a;
            private gsa b;

            protected final void a()
            {
                if (!a && !Thread.holdsLock(b))
                {
                    throw new AssertionError();
                } else
                {
                    gsa.g(b);
                    return;
                }
            }

            static 
            {
                boolean flag;
                if (!gsa.desiredAssertionStatus())
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                a = flag;
            }

            
            {
                b = gsa.this;
                super(hcv);
            }
        });
    }

    static void e(gsa gsa1)
    {
        gsa1.g();
    }

    static int f(gsa gsa1)
    {
        gsa1.k = 0;
        return 0;
    }

    private void f()
    {
        b.d(e);
        for (Iterator iterator = j.values().iterator(); iterator.hasNext();)
        {
            gsc gsc1 = (gsc)iterator.next();
            if (gsc1.f == null)
            {
                int i1 = 0;
                while (i1 < 2) 
                {
                    h = h + gsc1.b[i1];
                    i1++;
                }
            } else
            {
                gsc1.f = null;
                for (int j1 = 0; j1 < 2; j1++)
                {
                    b.d(gsc1.c[j1]);
                    b.d(gsc1.d[j1]);
                }

                iterator.remove();
            }
        }

    }

    private void g()
    {
        this;
        JVM INSTR monitorenter ;
        Object obj;
        if (i != null)
        {
            i.close();
        }
        obj = hcq.a(b.b(e));
        Iterator iterator;
        ((hci) (obj)).b("libcore.io.DiskLruCache").h(10);
        ((hci) (obj)).b("1").h(10);
        ((hci) (obj)).j(0x31191L).h(10);
        ((hci) (obj)).j(2L).h(10);
        ((hci) (obj)).h(10);
        iterator = j.values().iterator();
_L1:
        gsc gsc1;
        do
        {
            if (!iterator.hasNext())
            {
                break MISSING_BLOCK_LABEL_249;
            }
            gsc1 = (gsc)iterator.next();
            if (gsc1.f == null)
            {
                break MISSING_BLOCK_LABEL_205;
            }
            ((hci) (obj)).b("DIRTY").h(32);
            ((hci) (obj)).b(gsc1.a);
            ((hci) (obj)).h(10);
        } while (true);
        Exception exception;
        exception;
        ((hci) (obj)).close();
        throw exception;
        obj;
        this;
        JVM INSTR monitorexit ;
        throw obj;
        ((hci) (obj)).b("CLEAN").h(32);
        ((hci) (obj)).b(gsc1.a);
        gsc1.a(((hci) (obj)));
        ((hci) (obj)).h(10);
          goto _L1
        ((hci) (obj)).close();
        if (b.e(d))
        {
            b.a(d, f);
        }
        b.a(e, d);
        b.d(f);
        i = e();
        l = false;
        this;
        JVM INSTR monitorexit ;
    }

    static boolean g(gsa gsa1)
    {
        gsa1.l = true;
        return true;
    }

    static guw h(gsa gsa1)
    {
        return gsa1.b;
    }

    private boolean h()
    {
        return k >= 2000 && k >= j.size();
    }

    static File i(gsa gsa1)
    {
        return gsa1.c;
    }

    private boolean i()
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag = n;
        this;
        JVM INSTR monitorexit ;
        return flag;
        Exception exception;
        exception;
        throw exception;
    }

    private void j()
    {
        this;
        JVM INSTR monitorenter ;
        if (i())
        {
            throw new IllegalStateException("cache is closed");
        }
        break MISSING_BLOCK_LABEL_25;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
        this;
        JVM INSTR monitorexit ;
    }

    private void k()
    {
        while (h > g) 
        {
            a((gsc)j.values().iterator().next());
        }
    }

    public final gsb a(String s1, long l1)
    {
        this;
        JVM INSTR monitorenter ;
        Object obj;
        c();
        j();
        c(s1);
        obj = (gsc)j.get(s1);
        if (l1 == -1L) goto _L2; else goto _L1
_L1:
        if (obj == null) goto _L4; else goto _L3
_L3:
        long l2 = ((gsc) (obj)).g;
        if (l2 == l1) goto _L2; else goto _L4
_L4:
        s1 = null;
_L5:
        this;
        JVM INSTR monitorexit ;
        return s1;
_L2:
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_78;
        }
        if (((gsc) (obj)).f == null)
        {
            break MISSING_BLOCK_LABEL_78;
        }
        s1 = null;
          goto _L5
        i.b("DIRTY").h(32).b(s1).h(10);
        i.flush();
        if (!l)
        {
            break MISSING_BLOCK_LABEL_132;
        }
        s1 = null;
          goto _L5
        if (obj != null)
        {
            break MISSING_BLOCK_LABEL_192;
        }
        obj = new gsc(this, s1, (byte)0);
        j.put(s1, obj);
        s1 = ((String) (obj));
_L6:
        obj = new gsb(this, s1, (byte)0);
        s1.f = ((gsb) (obj));
        s1 = ((String) (obj));
          goto _L5
        s1;
        throw s1;
        s1 = ((String) (obj));
          goto _L6
    }

    public final gsd a(String s1)
    {
        this;
        JVM INSTR monitorenter ;
        Object obj;
        c();
        j();
        c(s1);
        obj = (gsc)j.get(s1);
        if (obj == null) goto _L2; else goto _L1
_L1:
        boolean flag = ((gsc) (obj)).e;
        if (flag) goto _L3; else goto _L2
_L2:
        s1 = null;
_L5:
        this;
        JVM INSTR monitorexit ;
        return s1;
_L3:
        obj = ((gsc) (obj)).a();
        if (obj == null)
        {
            s1 = null;
            continue; /* Loop/switch isn't completed */
        }
        k = k + 1;
        i.b("READ").h(32).b(s1).h(10);
        s1 = ((String) (obj));
        if (!h())
        {
            continue; /* Loop/switch isn't completed */
        }
        p.execute(q);
        s1 = ((String) (obj));
        if (true) goto _L5; else goto _L4
_L4:
        s1;
        throw s1;
    }

    public final boolean b(String s1)
    {
        this;
        JVM INSTR monitorenter ;
        c();
        j();
        c(s1);
        s1 = (gsc)j.get(s1);
        if (s1 != null) goto _L2; else goto _L1
_L1:
        boolean flag = false;
_L4:
        this;
        JVM INSTR monitorexit ;
        return flag;
_L2:
        flag = a(s1);
        if (true) goto _L4; else goto _L3
_L3:
        s1;
        throw s1;
    }

    public final void close()
    {
        this;
        JVM INSTR monitorenter ;
        if (m && !n) goto _L2; else goto _L1
_L1:
        n = true;
_L4:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        gsc agsc[];
        int j1;
        agsc = (gsc[])j.values().toArray(new gsc[j.size()]);
        j1 = agsc.length;
        Exception exception;
        gsc gsc1;
        for (int i1 = 0; i1 >= j1; i1++)
        {
            break MISSING_BLOCK_LABEL_83;
        }

        gsc1 = agsc[i1];
        if (gsc1.f != null)
        {
            gsc1.f.b();
        }
        break MISSING_BLOCK_LABEL_114;
        k();
        i.close();
        i = null;
        n = true;
        if (true) goto _L4; else goto _L3
_L3:
        exception;
        throw exception;
    }

    static 
    {
        boolean flag;
        if (!gsa.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        s = flag;
    }
}
