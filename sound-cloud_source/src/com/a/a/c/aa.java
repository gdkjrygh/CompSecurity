// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.a.a.c;

import b.a.a.a.a.b.h;
import b.a.a.a.a.b.i;
import b.a.a.a.a.g.q;
import b.a.a.a.d;
import b.a.a.a.l;
import java.io.File;
import java.io.FilenameFilter;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

// Referenced classes of package com.a.a.c:
//            ab, g, ad, N, 
//            O, Z, x, m

final class aa
{
    private final class a extends i
    {

        final aa a;
        private final float b;

        public final void a()
        {
            float f1;
            b.a.a.a.d.a();
            (new StringBuilder("Starting report processing in ")).append(b).append(" second(s)...");
            f1 = b;
            if (f1 <= 0.0F)
            {
                break MISSING_BLOCK_LABEL_48;
            }
            Thread.sleep((long)(b * 1000F));
            Object obj;
            g g1 = g.f();
            x x1 = g1.b;
            obj = a.a();
            if (!x1.e.get())
            {
                if (((List) (obj)).isEmpty() || ((Boolean)b.a.a.a.a.g.q.a.a().a(new m(g1), Boolean.valueOf(true))).booleanValue())
                {
                    break MISSING_BLOCK_LABEL_380;
                }
                b.a.a.a.d.a();
                (new StringBuilder("User declined to send. Removing ")).append(((List) (obj)).size()).append(" Report(s).");
                for (obj = ((List) (obj)).iterator(); ((Iterator) (obj)).hasNext(); ((Z)((Iterator) (obj)).next()).a()) { }
            }
_L1:
            aa.a(a);
            return;
            obj;
            try
            {
                Thread.currentThread().interrupt();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                b.a.a.a.d.a();
            }
              goto _L1
_L4:
            if (((List) (obj)).isEmpty() || g.f().b.e.get()) goto _L1; else goto _L2
_L2:
            b.a.a.a.d.a();
            (new StringBuilder("Attempting to send ")).append(((List) (obj)).size()).append(" report(s)");
            Z z;
            for (obj = ((List) (obj)).iterator(); ((Iterator) (obj)).hasNext(); a.a(z))
            {
                z = (Z)((Iterator) (obj)).next();
            }

            List list = a.a();
            obj = list;
            if (list.isEmpty()) goto _L4; else goto _L3
_L3:
            int j;
            long l1;
            l1 = aa.b()[Math.min(j, aa.b().length - 1)];
            b.a.a.a.d.a();
            (new StringBuilder("Report submisson: scheduling delayed retry in ")).append(l1).append(" seconds");
            Thread.sleep(l1 * 1000L);
            j++;
            obj = list;
              goto _L4
            InterruptedException interruptedexception;
            interruptedexception;
            Thread.currentThread().interrupt();
              goto _L1
            j = 0;
              goto _L4
        }

        a(float f1)
        {
            a = aa.this;
            super();
            b = f1;
        }
    }


    static final Map a = Collections.singletonMap("X-CRASHLYTICS-INVALID-SESSION", "1");
    private static final FilenameFilter b = new ab();
    private static final short c[] = {
        10, 20, 30, 60, 120, 300
    };
    private final Object d = new Object();
    private final O e;
    private Thread f;

    public aa(O o)
    {
        if (o == null)
        {
            throw new IllegalArgumentException("createReportCall must not be null.");
        } else
        {
            e = o;
            return;
        }
    }

    static Thread a(aa aa1)
    {
        aa1.f = null;
        return null;
    }

    static short[] b()
    {
        return c;
    }

    final List a()
    {
        b.a.a.a.d.a();
        File afile[];
        synchronized (d)
        {
            afile = g.f().g().listFiles(b);
        }
        obj = new LinkedList();
        int j = afile.length;
        for (int i = 0; i < j; i++)
        {
            File file = afile[i];
            b.a.a.a.d.a();
            (new StringBuilder("Found crash report ")).append(file.getPath());
            ((List) (obj)).add(new ad(file));
        }

        break MISSING_BLOCK_LABEL_103;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
        if (((List) (obj)).isEmpty())
        {
            b.a.a.a.d.a();
        }
        return ((List) (obj));
    }

    public final void a(float f1)
    {
        this;
        JVM INSTR monitorenter ;
        if (f == null)
        {
            f = new Thread(new a(f1), "Crashlytics Report Uploader");
            f.start();
        }
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    final boolean a(Z z)
    {
        boolean flag1 = false;
        Object obj1 = d;
        obj1;
        JVM INSTR monitorenter ;
        StringBuilder stringbuilder;
        boolean flag2;
        Object obj = ((l) (g.f())).n;
        new h();
        obj = new N(h.a(((android.content.Context) (obj))), z);
        flag2 = e.a(((N) (obj)));
        b.a.a.a.d.a();
        stringbuilder = new StringBuilder("Crashlytics report upload ");
        String s;
        boolean flag;
        if (flag2)
        {
            s = "complete: ";
        } else
        {
            s = "FAILED: ";
        }
        stringbuilder.append(s).append(z.b());
        flag = flag1;
        if (!flag2)
        {
            break MISSING_BLOCK_LABEL_108;
        }
        z.a();
        flag = true;
_L2:
        obj1;
        JVM INSTR monitorexit ;
        return flag;
        Exception exception;
        exception;
        b.a.a.a.d.a();
        (new StringBuilder("Error occurred sending report ")).append(z);
        flag = flag1;
        if (true) goto _L2; else goto _L1
_L1:
        z;
        obj1;
        JVM INSTR monitorexit ;
        throw z;
    }

}
