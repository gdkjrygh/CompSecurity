// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.a.a.c;

import b.a.a.a.a.b.h;
import b.a.a.a.a.b.i;
import b.a.a.a.a.g.q;
import b.a.a.a.d;
import b.a.a.a.o;
import java.io.File;
import java.io.FilenameFilter;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

// Referenced classes of package com.a.a.c:
//            ax, g, az, am, 
//            an, av, x, m

final class aw
{
    private final class a extends i
    {

        final aw a;
        private final float b;

        public final void a()
        {
            float f1;
            b.a.a.a.d.c();
            (new StringBuilder("Starting report processing in ")).append(b).append(" second(s)...");
            f1 = b;
            if (f1 <= 0.0F)
            {
                break MISSING_BLOCK_LABEL_48;
            }
            Thread.sleep((long)(b * 1000F));
            Object obj;
            g g1 = g.f();
            x x1 = g1.l();
            obj = a.a();
            if (!x1.a())
            {
                if (((List) (obj)).isEmpty() || ((Boolean)q.a().a(new m(g1), Boolean.valueOf(true))).booleanValue())
                {
                    break MISSING_BLOCK_LABEL_383;
                }
                b.a.a.a.d.c();
                (new StringBuilder("User declined to send. Removing ")).append(((List) (obj)).size()).append(" Report(s).");
                for (obj = ((List) (obj)).iterator(); ((Iterator) (obj)).hasNext(); ((av)((Iterator) (obj)).next()).a()) { }
            }
_L1:
            aw.a(a);
            return;
            obj;
            try
            {
                Thread.currentThread().interrupt();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                b.a.a.a.d.c().b("Fabric", "An unexpected error occurred while attempting to upload crash reports.", ((Throwable) (obj)));
            }
              goto _L1
_L4:
            if (((List) (obj)).isEmpty() || g.f().l().a()) goto _L1; else goto _L2
_L2:
            b.a.a.a.d.c();
            (new StringBuilder("Attempting to send ")).append(((List) (obj)).size()).append(" report(s)");
            av av1;
            for (obj = ((List) (obj)).iterator(); ((Iterator) (obj)).hasNext(); a.a(av1))
            {
                av1 = (av)((Iterator) (obj)).next();
            }

            List list = a.a();
            obj = list;
            if (list.isEmpty()) goto _L4; else goto _L3
_L3:
            int j;
            long l;
            l = aw.b()[Math.min(j, aw.b().length - 1)];
            b.a.a.a.d.c();
            (new StringBuilder("Report submisson: scheduling delayed retry in ")).append(l).append(" seconds");
            Thread.sleep(l * 1000L);
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
            a = aw.this;
            super();
            b = f1;
        }
    }


    static final Map a = Collections.singletonMap("X-CRASHLYTICS-INVALID-SESSION", "1");
    private static final FilenameFilter b = new ax();
    private static final short c[] = {
        10, 20, 30, 60, 120, 300
    };
    private final Object d = new Object();
    private final an e;
    private Thread f;

    public aw(an an1)
    {
        if (an1 == null)
        {
            throw new IllegalArgumentException("createReportCall must not be null.");
        } else
        {
            e = an1;
            return;
        }
    }

    static Thread a(aw aw1)
    {
        aw1.f = null;
        return null;
    }

    static short[] b()
    {
        return c;
    }

    final List a()
    {
        b.a.a.a.d.c();
        File afile[];
        synchronized (d)
        {
            afile = g.f().q().listFiles(b);
        }
        obj = new LinkedList();
        int j = afile.length;
        for (int i = 0; i < j; i++)
        {
            File file = afile[i];
            b.a.a.a.d.c();
            (new StringBuilder("Found crash report ")).append(file.getPath());
            ((List) (obj)).add(new az(file));
        }

        break MISSING_BLOCK_LABEL_103;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
        if (((List) (obj)).isEmpty())
        {
            b.a.a.a.d.c();
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

    final boolean a(av av1)
    {
        boolean flag1 = false;
        Object obj1 = d;
        obj1;
        JVM INSTR monitorenter ;
        StringBuilder stringbuilder;
        boolean flag2;
        Object obj = g.f().v();
        new h();
        obj = new am(h.a(((android.content.Context) (obj))), av1);
        flag2 = e.a(((am) (obj)));
        b.a.a.a.d.c();
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
        stringbuilder.append(s).append(av1.b());
        flag = flag1;
        if (!flag2)
        {
            break MISSING_BLOCK_LABEL_108;
        }
        av1.a();
        flag = true;
_L2:
        obj1;
        JVM INSTR monitorexit ;
        return flag;
        Exception exception;
        exception;
        b.a.a.a.d.c().b("Fabric", (new StringBuilder("Error occurred sending report ")).append(av1).toString(), exception);
        flag = flag1;
        if (true) goto _L2; else goto _L1
_L1:
        av1;
        obj1;
        JVM INSTR monitorexit ;
        throw av1;
    }

}
