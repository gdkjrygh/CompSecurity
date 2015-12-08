// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.crashlytics.android;

import io.fabric.sdk.android.Fabric;
import io.fabric.sdk.android.Logger;
import io.fabric.sdk.android.services.common.ApiKey;
import java.io.File;
import java.io.FilenameFilter;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

// Referenced classes of package com.crashlytics.android:
//            Crashlytics, SessionReport, CreateReportRequest, CreateReportSpiCall, 
//            Report

class ReportUploader
{

    static final Map a = Collections.singletonMap("X-CRASHLYTICS-INVALID-SESSION", "1");
    private static final FilenameFilter b = new FilenameFilter() {

        public boolean accept(File file, String s)
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

    static Thread a(ReportUploader reportuploader, Thread thread)
    {
        reportuploader.f = thread;
        return thread;
    }

    static short[] b()
    {
        return c;
    }

    List a()
    {
        Fabric.g().a("Fabric", "Checking for crash reports...");
        File afile[];
        synchronized (d)
        {
            afile = Crashlytics.f().u().listFiles(b);
        }
        obj = new LinkedList();
        int j = afile.length;
        for (int i = 0; i < j; i++)
        {
            File file = afile[i];
            Fabric.g().a("Fabric", (new StringBuilder()).append("Found crash report ").append(file.getPath()).toString());
            ((List) (obj)).add(new SessionReport(file));
        }

        break MISSING_BLOCK_LABEL_122;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
        if (((List) (obj)).isEmpty())
        {
            Fabric.g().a("Fabric", "No reports found.");
        }
        return ((List) (obj));
    }

    public void a(float f1)
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

    boolean a(Report report)
    {
        boolean flag1 = false;
        Object obj1 = d;
        obj1;
        JVM INSTR monitorenter ;
        Logger logger;
        StringBuilder stringbuilder;
        boolean flag2;
        Object obj = Crashlytics.f().C();
        obj = new CreateReportRequest((new ApiKey()).a(((android.content.Context) (obj))), report);
        flag2 = e.a(((CreateReportRequest) (obj)));
        logger = Fabric.g();
        stringbuilder = (new StringBuilder()).append("Crashlytics report upload ");
        String s;
        boolean flag;
        if (flag2)
        {
            s = "complete: ";
        } else
        {
            s = "FAILED: ";
        }
        logger.b("Fabric", stringbuilder.append(s).append(report.b()).toString());
        flag = flag1;
        if (!flag2)
        {
            break MISSING_BLOCK_LABEL_122;
        }
        report.a();
        flag = true;
_L2:
        obj1;
        JVM INSTR monitorexit ;
        return flag;
        Exception exception;
        exception;
        Fabric.g().d("Fabric", (new StringBuilder()).append("Error occurred sending report ").append(report).toString(), exception);
        flag = flag1;
        if (true) goto _L2; else goto _L1
_L1:
        report;
        obj1;
        JVM INSTR monitorexit ;
        throw report;
    }


    private class Worker extends BackgroundPriorityRunnable
    {

        final ReportUploader a;
        private final float b;

        private void b()
        {
            Object obj;
            Crashlytics crashlytics;
            Fabric.g().a("Fabric", (new StringBuilder()).append("Starting report processing in ").append(b).append(" second(s)...").toString());
            CrashlyticsUncaughtExceptionHandler crashlyticsuncaughtexceptionhandler;
            if (b > 0.0F)
            {
                try
                {
                    Thread.sleep((long)(b * 1000F));
                }
                // Misplaced declaration of an exception variable
                catch (Object obj)
                {
                    Thread.currentThread().interrupt();
                    return;
                }
            }
            crashlytics = Crashlytics.f();
            crashlyticsuncaughtexceptionhandler = crashlytics.m();
            obj = a.a();
            if (!crashlyticsuncaughtexceptionhandler.a()) goto _L2; else goto _L1
_L1:
            return;
_L2:
            if (((List) (obj)).isEmpty() || crashlytics.x())
            {
                break; /* Loop/switch isn't completed */
            }
            Fabric.g().a("Fabric", (new StringBuilder()).append("User declined to send. Removing ").append(((List) (obj)).size()).append(" Report(s).").toString());
            obj = ((List) (obj)).iterator();
            while (((Iterator) (obj)).hasNext()) 
            {
                ((Report)((Iterator) (obj)).next()).a();
            }
            if (true) goto _L1; else goto _L3
_L3:
            int i = 0;
            while (!((List) (obj)).isEmpty() && !Crashlytics.f().m().a()) 
            {
                Fabric.g().a("Fabric", (new StringBuilder()).append("Attempting to send ").append(((List) (obj)).size()).append(" report(s)").toString());
                Report report;
                for (obj = ((List) (obj)).iterator(); ((Iterator) (obj)).hasNext(); a.a(report))
                {
                    report = (Report)((Iterator) (obj)).next();
                }

                obj = a.a();
                if (!((List) (obj)).isEmpty())
                {
                    long l = ReportUploader.b()[Math.min(i, ReportUploader.b().length - 1)];
                    Fabric.g().a("Fabric", (new StringBuilder()).append("Report submisson: scheduling delayed retry in ").append(l).append(" seconds").toString());
                    try
                    {
                        Thread.sleep(l * 1000L);
                    }
                    catch (InterruptedException interruptedexception)
                    {
                        Thread.currentThread().interrupt();
                        return;
                    }
                    i++;
                }
            }
            if (true) goto _L1; else goto _L4
_L4:
        }

        public void a()
        {
            try
            {
                b();
            }
            catch (Exception exception)
            {
                Fabric.g().d("Fabric", "An unexpected error occurred while attempting to upload crash reports.", exception);
            }
            ReportUploader.a(a, null);
        }

        Worker(float f1)
        {
            a = ReportUploader.this;
            super();
            b = f1;
        }
    }

}
