// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.b.a.c;

import a.a.a.a.a.b.j;
import a.a.a.a.f;
import a.a.a.a.s;
import java.io.File;
import java.io.FilenameFilter;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

// Referenced classes of package com.b.a.c:
//            bs, h, bv, bt, 
//            aq, ar, bq

final class br
{

    static final Map a = Collections.singletonMap("X-CRASHLYTICS-INVALID-SESSION", "1");
    private static final FilenameFilter b = new bs();
    private static final short c[] = {
        10, 20, 30, 60, 120, 300
    };
    private final Object d = new Object();
    private final ar e;
    private Thread f;

    public br(ar ar1)
    {
        if (ar1 == null)
        {
            throw new IllegalArgumentException("createReportCall must not be null.");
        } else
        {
            e = ar1;
            return;
        }
    }

    static Thread a(br br1)
    {
        br1.f = null;
        return null;
    }

    static short[] b()
    {
        return c;
    }

    final List a()
    {
        a.a.a.a.f.d();
        File afile[];
        synchronized (d)
        {
            afile = com.b.a.c.h.f().q().listFiles(b);
        }
        obj = new LinkedList();
        int k = afile.length;
        for (int i = 0; i < k; i++)
        {
            File file = afile[i];
            a.a.a.a.f.d();
            (new StringBuilder("Found crash report ")).append(file.getPath());
            ((List) (obj)).add(new bv(file));
        }

        break MISSING_BLOCK_LABEL_103;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
        if (((List) (obj)).isEmpty())
        {
            a.a.a.a.f.d();
        }
        return ((List) (obj));
    }

    public final void a(float f1)
    {
        this;
        JVM INSTR monitorenter ;
        if (f == null)
        {
            f = new Thread(new bt(this, f1), "Crashlytics Report Uploader");
            f.start();
        }
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    final boolean a(bq bq1)
    {
        boolean flag1 = false;
        Object obj1 = d;
        obj1;
        JVM INSTR monitorenter ;
        s s2;
        StringBuilder stringbuilder;
        boolean flag2;
        Object obj = com.b.a.c.h.f().v();
        new j();
        obj = new aq(j.a(((android.content.Context) (obj))), bq1);
        flag2 = e.a(((aq) (obj)));
        s2 = a.a.a.a.f.d();
        stringbuilder = new StringBuilder("Crashlytics report upload ");
        String s1;
        boolean flag;
        if (flag2)
        {
            s1 = "complete: ";
        } else
        {
            s1 = "FAILED: ";
        }
        s2.a("CrashlyticsCore", stringbuilder.append(s1).append(bq1.b()).toString());
        flag = flag1;
        if (!flag2)
        {
            break MISSING_BLOCK_LABEL_120;
        }
        bq1.a();
        flag = true;
_L2:
        obj1;
        JVM INSTR monitorexit ;
        return flag;
        Exception exception;
        exception;
        a.a.a.a.f.d().b("CrashlyticsCore", (new StringBuilder("Error occurred sending report ")).append(bq1).toString(), exception);
        flag = flag1;
        if (true) goto _L2; else goto _L1
_L1:
        bq1;
        obj1;
        JVM INSTR monitorexit ;
        throw bq1;
    }

}
