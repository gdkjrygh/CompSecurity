// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.a.a;

import b.a.a.a.a.b.j;
import b.a.a.a.f;
import b.a.a.a.q;
import java.io.File;
import java.io.FilenameFilter;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

// Referenced classes of package com.a.a:
//            bl, h, bo, bm, 
//            ap, aq, bj

final class bk
{

    static final Map a = Collections.singletonMap("X-CRASHLYTICS-INVALID-SESSION", "1");
    private static final FilenameFilter b = new bl();
    private static final short c[] = {
        10, 20, 30, 60, 120, 300
    };
    private final Object d = new Object();
    private final aq e;
    private Thread f;

    public bk(aq aq1)
    {
        if (aq1 == null)
        {
            throw new IllegalArgumentException("createReportCall must not be null.");
        } else
        {
            e = aq1;
            return;
        }
    }

    static Thread a(bk bk1)
    {
        bk1.f = null;
        return null;
    }

    static short[] b()
    {
        return c;
    }

    final List a()
    {
        b.a.a.a.f.c().a("Fabric", "Checking for crash reports...");
        File afile[];
        synchronized (d)
        {
            afile = com.a.a.h.f().q().listFiles(b);
        }
        obj = new LinkedList();
        int k = afile.length;
        for (int i = 0; i < k; i++)
        {
            File file = afile[i];
            b.a.a.a.f.c().a("Fabric", (new StringBuilder("Found crash report ")).append(file.getPath()).toString());
            ((List) (obj)).add(new bo(file));
        }

        break MISSING_BLOCK_LABEL_119;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
        if (((List) (obj)).isEmpty())
        {
            b.a.a.a.f.c().a("Fabric", "No reports found.");
        }
        return ((List) (obj));
    }

    public final void a(float f1)
    {
        this;
        JVM INSTR monitorenter ;
        if (f == null)
        {
            f = new Thread(new bm(this, f1), "Crashlytics Report Uploader");
            f.start();
        }
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    final boolean a(bj bj1)
    {
        boolean flag1 = false;
        Object obj1 = d;
        obj1;
        JVM INSTR monitorenter ;
        q q1;
        StringBuilder stringbuilder;
        boolean flag2;
        Object obj = com.a.a.h.f().w();
        new j();
        obj = new ap(j.a(((android.content.Context) (obj))), bj1);
        flag2 = e.a(((ap) (obj)));
        q1 = b.a.a.a.f.c();
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
        q1.b("Fabric", stringbuilder.append(s).append(bj1.b()).toString());
        flag = flag1;
        if (!flag2)
        {
            break MISSING_BLOCK_LABEL_120;
        }
        bj1.a();
        flag = true;
_L2:
        obj1;
        JVM INSTR monitorexit ;
        return flag;
        Exception exception;
        exception;
        b.a.a.a.f.c().c("Fabric", (new StringBuilder("Error occurred sending report ")).append(bj1).toString(), exception);
        flag = flag1;
        if (true) goto _L2; else goto _L1
_L1:
        bj1;
        obj1;
        JVM INSTR monitorexit ;
        throw bj1;
    }

}
