// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.bg;

import com.google.android.m4b.maps.ay.a;
import com.google.android.m4b.maps.ay.k;
import com.google.android.m4b.maps.ay.m;
import com.google.android.m4b.maps.ay.n;
import com.google.android.m4b.maps.ay.t;
import com.google.android.m4b.maps.be.b;
import com.google.android.m4b.maps.bw.e;
import com.google.android.m4b.maps.cq.ae;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.File;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.google.android.m4b.maps.bg:
//            a, b

public final class c extends com.google.android.m4b.maps.ay.a
{
    final class a extends n
    {

        com.google.android.m4b.maps.bg.a a;
        private com.google.android.m4b.maps.ac.a b;
        private c c;

        public final void a(DataOutput dataoutput)
        {
            byte abyte0[] = b.c();
            dataoutput.writeInt(abyte0.length);
            dataoutput.write(abyte0);
        }

        public final boolean a(DataInput datainput)
        {
            datainput = com.google.android.m4b.maps.ac.c.a(ae.b, datainput);
            if (datainput.j(1) == 0)
            {
                return false;
            }
            datainput = datainput.c(1, 0);
            boolean flag = a.a(datainput);
            if (com.google.android.m4b.maps.bg.c.a(c) != null && flag && a.c)
            {
                com.google.android.m4b.maps.bg.c.a(c).a(datainput);
            }
            return true;
        }

        public final int g()
        {
            return 39;
        }

        private a(com.google.android.m4b.maps.ac.a a1, com.google.android.m4b.maps.bg.a a2)
        {
            c = c.this;
            super();
            b = a1;
            a = a2;
        }

        a(com.google.android.m4b.maps.ac.a a1, com.google.android.m4b.maps.bg.a a2, byte byte0)
        {
            this(a1, a2);
        }
    }


    private static c a;
    private static long h;
    private final m b;
    private final k c;
    private final e d;
    private final e e;
    private volatile b f;
    private final CountDownLatch g;

    c()
    {
        b = null;
        c = null;
        d = null;
        e = null;
        f = null;
        g = null;
    }

    private c(m m1)
    {
        b = m1;
        if (b != null)
        {
            b.a(this);
        }
        c = k.a();
        d = new e(64);
        e = new e(32);
        f = null;
        g = new CountDownLatch(1);
    }

    static b a(c c1)
    {
        return c1.f;
    }

    public static c a()
    {
        return a;
    }

    public static c a(m m1, File file, com.google.android.m4b.maps.bs.e e1)
    {
        if (a != null)
        {
            return a;
        } else
        {
            a = new c(m1);
            (new Thread(new Runnable(file, e1) {

                private File a;
                private com.google.android.m4b.maps.bs.e b;

                public final void run()
                {
                    com.google.android.m4b.maps.bg.c.a(com.google.android.m4b.maps.bg.c.a(), a, b);
                }

            
            {
                a = file;
                b = e1;
                super();
            }
            })).start();
            return a;
        }
    }

    static void a(c c1, File file, com.google.android.m4b.maps.bs.e e1)
    {
        c1.f = com.google.android.m4b.maps.be.b.a(file, e1);
        c1.g.countDown();
    }

    public final com.google.android.m4b.maps.bg.a a(String s, com.google.android.m4b.maps.bg.b b1)
    {
        e e1 = d;
        e1;
        JVM INSTR monitorenter ;
        com.google.android.m4b.maps.bg.a a2 = (com.google.android.m4b.maps.bg.a)d.c(s);
        com.google.android.m4b.maps.bg.a a1;
        a1 = a2;
        if (a2 != null)
        {
            break MISSING_BLOCK_LABEL_49;
        }
        a1 = a2;
        if (f != null)
        {
            a1 = f.a(s);
        }
        if (a1 != null)
        {
            break MISSING_BLOCK_LABEL_66;
        }
        a1 = new com.google.android.m4b.maps.bg.a();
        a1.c = true;
        d.b(s, a1);
        e1;
        JVM INSTR monitorexit ;
        a1;
        JVM INSTR monitorenter ;
        long l = k.b();
        if (a1.g + h < l)
        {
            com.google.android.m4b.maps.ac.a a3 = new com.google.android.m4b.maps.ac.a(ae.a);
            a3.b(4, s);
            if (a1.a())
            {
                a3.a(2, a1.f);
            }
            s = new a(a3, a1, (byte)0);
            b.c(s);
            a1.g = l;
        }
        a1;
        JVM INSTR monitorexit ;
        if (b1 != null && !a1.a())
        {
            synchronized (a1.a)
            {
                a1.a.add(b1);
            }
        }
        return a1;
        s;
        e1;
        JVM INSTR monitorexit ;
        throw s;
        s;
        a1;
        JVM INSTR monitorexit ;
        throw s;
        b1;
        s;
        JVM INSTR monitorexit ;
        throw b1;
    }

    public final void a(t t)
    {
        com.google.android.m4b.maps.bg.a a1;
        if (!(t instanceof a))
        {
            break MISSING_BLOCK_LABEL_75;
        }
        a1 = ((a)t).a;
        t = a1.a;
        t;
        JVM INSTR monitorenter ;
        int i = 0;
_L2:
        if (i >= a1.a.size())
        {
            break; /* Loop/switch isn't completed */
        }
        ((com.google.android.m4b.maps.bg.b)a1.a.get(i)).a(a1);
        i++;
        if (true) goto _L2; else goto _L1
_L1:
        a1.a.clear();
        t;
        JVM INSTR monitorexit ;
        a1.e.countDown();
        return;
        Exception exception;
        exception;
        t;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final void a(boolean flag)
    {
        synchronized (e)
        {
            e.a(0);
        }
        synchronized (d)
        {
            d.a(0);
        }
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_76;
        }
        while (f == null) 
        {
            try
            {
                g.await();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj) { }
        }
        break MISSING_BLOCK_LABEL_69;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
        exception1;
        obj;
        JVM INSTR monitorexit ;
        throw exception1;
        f.a();
    }

    static 
    {
        h = TimeUnit.DAYS.toMillis(1L);
    }
}
