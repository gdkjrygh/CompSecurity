// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.File;
import java.io.FilenameFilter;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

final class anb
{

    static final Map a = Collections.singletonMap("X-CRASHLYTICS-INVALID-SESSION", "1");
    private static final FilenameFilter b = new FilenameFilter() {

        public final boolean accept(File file, String s)
        {
            return s.endsWith(".cls") && !s.contains("Session");
        }

    };
    private static final short c[] = {
        10, 20, 30, 60, 120, 300
    };
    private final Object d = new Object();
    private final amd e;
    private Thread f;

    public anb(amd amd1)
    {
        if (amd1 == null)
        {
            throw new IllegalArgumentException("createReportCall must not be null.");
        } else
        {
            e = amd1;
            return;
        }
    }

    static Thread a(anb anb1)
    {
        anb1.f = null;
        return null;
    }

    static short[] b()
    {
        return c;
    }

    final List a()
    {
        gya.a().a("CrashlyticsCore", "Checking for crash reports...");
        File afile[];
        synchronized (d)
        {
            afile = alu.f().g().listFiles(b);
        }
        obj = new LinkedList();
        int j = afile.length;
        for (int i = 0; i < j; i++)
        {
            File file = afile[i];
            gya.a().a("CrashlyticsCore", (new StringBuilder("Found crash report ")).append(file.getPath()).toString());
            ((List) (obj)).add(new ane(file));
        }

        break MISSING_BLOCK_LABEL_119;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
        if (((List) (obj)).isEmpty())
        {
            gya.a().a("CrashlyticsCore", "No reports found.");
        }
        return ((List) (obj));
    }

    public final void a(float f1)
    {
        this;
        JVM INSTR monitorenter ;
        if (f == null)
        {
            f = new Thread(new anc(this, f1), "Crashlytics Report Uploader");
            f.start();
        }
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    final boolean a(ana ana1)
    {
        boolean flag1 = false;
        Object obj1 = d;
        obj1;
        JVM INSTR monitorenter ;
        gyk gyk1;
        StringBuilder stringbuilder;
        boolean flag2;
        Object obj = ((gyh) (alu.f())).k;
        new gyx();
        obj = new amc(gyx.a(((android.content.Context) (obj))), ana1);
        flag2 = e.a(((amc) (obj)));
        gyk1 = gya.a();
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
        gyk1.c("CrashlyticsCore", stringbuilder.append(s).append(ana1.b()).toString());
        flag = flag1;
        if (!flag2)
        {
            break MISSING_BLOCK_LABEL_120;
        }
        ana1.a();
        flag = true;
_L2:
        obj1;
        JVM INSTR monitorexit ;
        return flag;
        Exception exception;
        exception;
        gya.a().c("CrashlyticsCore", (new StringBuilder("Error occurred sending report ")).append(ana1).toString(), exception);
        flag = flag1;
        if (true) goto _L2; else goto _L1
_L1:
        ana1;
        obj1;
        JVM INSTR monitorexit ;
        throw ana1;
    }

}
