// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.crashlytics.android.core;

import io.fabric.sdk.android.c;
import io.fabric.sdk.android.h;
import io.fabric.sdk.android.k;
import io.fabric.sdk.android.services.common.g;
import io.fabric.sdk.android.services.settings.q;
import java.io.File;
import java.io.FilenameFilter;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

// Referenced classes of package com.crashlytics.android.core:
//            CrashlyticsCore, SessionReport, CreateReportRequest, CreateReportSpiCall, 
//            Report, CrashlyticsUncaughtExceptionHandler

class ReportUploader
{
    private class Worker extends io.fabric.sdk.android.services.common.h
    {

        final ReportUploader a;
        private final float b;

        public final void a()
        {
            float f1;
            io.fabric.sdk.android.c.a().a("CrashlyticsCore", (new StringBuilder("Starting report processing in ")).append(b).append(" second(s)...").toString());
            f1 = b;
            if (f1 <= 0.0F)
            {
                break MISSING_BLOCK_LABEL_56;
            }
            Thread.sleep((long)(b * 1000F));
            Object obj;
            CrashlyticsCore crashlyticscore = CrashlyticsCore.f();
            CrashlyticsUncaughtExceptionHandler crashlyticsuncaughtexceptionhandler = crashlyticscore.b;
            obj = a.a();
            if (!crashlyticsuncaughtexceptionhandler.e.get())
            {
                if (((List) (obj)).isEmpty() || ((Boolean)io.fabric.sdk.android.services.settings.q.a.a().a(new CrashlyticsCore._cls6(crashlyticscore), Boolean.valueOf(true))).booleanValue())
                {
                    break MISSING_BLOCK_LABEL_421;
                }
                io.fabric.sdk.android.c.a().a("CrashlyticsCore", (new StringBuilder("User declined to send. Removing ")).append(((List) (obj)).size()).append(" Report(s).").toString());
                for (obj = ((List) (obj)).iterator(); ((Iterator) (obj)).hasNext(); ((Report)((Iterator) (obj)).next()).a()) { }
            }
_L1:
            ReportUploader.a(a);
            return;
            obj;
            try
            {
                Thread.currentThread().interrupt();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                io.fabric.sdk.android.c.a().c("CrashlyticsCore", "An unexpected error occurred while attempting to upload crash reports.", ((Throwable) (obj)));
            }
              goto _L1
_L4:
            if (((List) (obj)).isEmpty() || CrashlyticsCore.f().b.e.get()) goto _L1; else goto _L2
_L2:
            io.fabric.sdk.android.c.a().a("CrashlyticsCore", (new StringBuilder("Attempting to send ")).append(((List) (obj)).size()).append(" report(s)").toString());
            Report report;
            for (obj = ((List) (obj)).iterator(); ((Iterator) (obj)).hasNext(); a.a(report))
            {
                report = (Report)((Iterator) (obj)).next();
            }

            List list = a.a();
            obj = list;
            if (list.isEmpty()) goto _L4; else goto _L3
_L3:
            int i;
            long l;
            l = ReportUploader.b()[Math.min(i, ReportUploader.b().length - 1)];
            io.fabric.sdk.android.c.a().a("CrashlyticsCore", (new StringBuilder("Report submisson: scheduling delayed retry in ")).append(l).append(" seconds").toString());
            Thread.sleep(l * 1000L);
            i++;
            obj = list;
              goto _L4
            InterruptedException interruptedexception;
            interruptedexception;
            Thread.currentThread().interrupt();
              goto _L1
            i = 0;
              goto _L4
        }

        Worker(float f1)
        {
            a = ReportUploader.this;
            super();
            b = f1;
        }
    }


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
    private final CreateReportSpiCall e;
    private Thread f;

    public ReportUploader(CreateReportSpiCall createreportspicall)
    {
        if (createreportspicall == null)
        {
            throw new IllegalArgumentException("createReportCall must not be null.");
        } else
        {
            e = createreportspicall;
            return;
        }
    }

    static Thread a(ReportUploader reportuploader)
    {
        reportuploader.f = null;
        return null;
    }

    static short[] b()
    {
        return c;
    }

    final List a()
    {
        io.fabric.sdk.android.c.a().a("CrashlyticsCore", "Checking for crash reports...");
        File afile[];
        synchronized (d)
        {
            afile = CrashlyticsCore.f().g().listFiles(b);
        }
        obj = new LinkedList();
        int j = afile.length;
        for (int i = 0; i < j; i++)
        {
            File file = afile[i];
            io.fabric.sdk.android.c.a().a("CrashlyticsCore", (new StringBuilder("Found crash report ")).append(file.getPath()).toString());
            ((List) (obj)).add(new SessionReport(file));
        }

        break MISSING_BLOCK_LABEL_119;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
        if (((List) (obj)).isEmpty())
        {
            io.fabric.sdk.android.c.a().a("CrashlyticsCore", "No reports found.");
        }
        return ((List) (obj));
    }

    public final void a(float f1)
    {
        this;
        JVM INSTR monitorenter ;
        if (f == null)
        {
            f = new Thread(new Worker(f1), "Crashlytics Report Uploader");
            f.start();
        }
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    final boolean a(Report report)
    {
        boolean flag1 = false;
        Object obj1 = d;
        obj1;
        JVM INSTR monitorenter ;
        k k1;
        StringBuilder stringbuilder;
        boolean flag2;
        Object obj = ((h) (CrashlyticsCore.f())).n;
        new g();
        obj = new CreateReportRequest(g.a(((android.content.Context) (obj))), report);
        flag2 = e.a(((CreateReportRequest) (obj)));
        k1 = io.fabric.sdk.android.c.a();
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
        k1.c("CrashlyticsCore", stringbuilder.append(s).append(report.b()).toString());
        flag = flag1;
        if (!flag2)
        {
            break MISSING_BLOCK_LABEL_120;
        }
        report.a();
        flag = true;
_L2:
        obj1;
        JVM INSTR monitorexit ;
        return flag;
        Exception exception;
        exception;
        io.fabric.sdk.android.c.a().c("CrashlyticsCore", (new StringBuilder("Error occurred sending report ")).append(report).toString(), exception);
        flag = flag1;
        if (true) goto _L2; else goto _L1
_L1:
        report;
        obj1;
        JVM INSTR monitorexit ;
        throw report;
    }

}
