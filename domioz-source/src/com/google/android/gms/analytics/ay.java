// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics;

import android.content.Context;
import android.os.Process;
import com.google.android.gms.common.internal.ap;
import com.google.android.gms.internal.zzik;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

// Referenced classes of package com.google.android.gms.analytics:
//            w, h, aq, a, 
//            n, az, ba

final class ay extends Thread
    implements w
{

    private final LinkedBlockingQueue a = new LinkedBlockingQueue();
    private volatile boolean b;
    private volatile boolean c;
    private volatile String d;
    private volatile n e;
    private final a f;
    private final Lock g = new ReentrantLock();
    private final List h = new ArrayList();

    ay(a a1)
    {
        super("GAThread");
        ap.a(a1);
        f = a1;
        e = null;
        h.add(new zzik("appendVersion", "&_v".substring(1), "ma4.0.6"));
        start();
    }

    static n a(ay ay1)
    {
        return ay1.e;
    }

    private static String a(Context context)
    {
        FileInputStream fileinputstream = context.openFileInput("gaInstallData");
        Object obj = fileinputstream;
        byte abyte0[] = new byte[8192];
        obj = fileinputstream;
        int i = fileinputstream.read(abyte0, 0, 8192);
        obj = fileinputstream;
        if (fileinputstream.available() <= 0) goto _L2; else goto _L1
_L1:
        obj = fileinputstream;
        com.google.android.gms.analytics.h.a("Too much campaign data, ignoring it.");
        obj = fileinputstream;
        fileinputstream.close();
        context.deleteFile("gaInstallData");
_L6:
        return null;
_L2:
        obj = fileinputstream;
        fileinputstream.close();
        context.deleteFile("gaInstallData");
        if (i > 0) goto _L4; else goto _L3
_L3:
        com.google.android.gms.analytics.h.d("Campaign file is empty.");
        return null;
        context;
        fileinputstream = null;
_L11:
        obj = fileinputstream;
        com.google.android.gms.analytics.h.b("No campaign data found.");
        if (fileinputstream == null) goto _L6; else goto _L5
_L5:
        try
        {
            fileinputstream.close();
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            com.google.android.gms.analytics.h.a((new StringBuilder("Failed to close campaign data in stream: ")).append(context).toString());
            return null;
        }
        return null;
_L4:
        obj = new String(abyte0, 0, i);
        com.google.android.gms.analytics.h.b((new StringBuilder("Campaign found: ")).append(((String) (obj))).toString());
        return ((String) (obj));
        obj;
        fileinputstream = null;
_L10:
        obj = fileinputstream;
        com.google.android.gms.analytics.h.a("Error reading campaign data.");
        obj = fileinputstream;
        context.deleteFile("gaInstallData");
        if (fileinputstream == null) goto _L6; else goto _L7
_L7:
        try
        {
            fileinputstream.close();
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            com.google.android.gms.analytics.h.a((new StringBuilder("Failed to close campaign data in stream: ")).append(context).toString());
            return null;
        }
        return null;
        context;
        obj = null;
_L9:
        if (obj != null)
        {
            try
            {
                ((FileInputStream) (obj)).close();
            }
            catch (IOException ioexception)
            {
                com.google.android.gms.analytics.h.a((new StringBuilder("Failed to close campaign data in stream: ")).append(ioexception).toString());
            }
        }
        throw context;
        context;
        if (true) goto _L9; else goto _L8
_L8:
        IOException ioexception1;
        ioexception1;
          goto _L10
        context;
          goto _L11
    }

    private static String a(Throwable throwable)
    {
        ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream();
        PrintStream printstream = new PrintStream(bytearrayoutputstream);
        throwable.printStackTrace(printstream);
        printstream.flush();
        return new String(bytearrayoutputstream.toByteArray());
    }

    private void a(Runnable runnable)
    {
        a.add(runnable);
    }

    private void e()
    {
        this;
        JVM INSTR monitorenter ;
        n n1 = e;
        if (n1 == null) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        e = new aq(f.d(), this);
        e.c();
        if (true) goto _L1; else goto _L3
_L3:
        Exception exception;
        exception;
        throw exception;
    }

    public final void a()
    {
        a(((Runnable) (new az(this, (byte)0))));
    }

    public final void b()
    {
        a(new ba(this, (byte)0));
    }

    public final LinkedBlockingQueue c()
    {
        return a;
    }

    public final Thread d()
    {
        return this;
    }

    public final void run()
    {
        Process.setThreadPriority(10);
        Runnable runnable;
        Object obj;
        try
        {
            Thread.sleep(5000L);
        }
        catch (InterruptedException interruptedexception)
        {
            com.google.android.gms.analytics.h.d("sleep interrupted in GAThread initialize");
        }
        try
        {
            e();
            d = a(f.d());
            com.google.android.gms.analytics.h.c("Initialized GA Thread");
        }
        catch (Throwable throwable)
        {
            com.google.android.gms.analytics.h.a((new StringBuilder("Error initializing the GAThread: ")).append(a(throwable)).toString());
            com.google.android.gms.analytics.h.a("Google Analytics will not start up.");
            b = true;
        }
        if (c)
        {
            break; /* Loop/switch isn't completed */
        }
        runnable = (Runnable)a.take();
        g.lock();
        if (!b)
        {
            runnable.run();
        }
        g.unlock();
        continue; /* Loop/switch isn't completed */
        obj;
        try
        {
            com.google.android.gms.analytics.h.b(((InterruptedException) (obj)).toString());
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            com.google.android.gms.analytics.h.a((new StringBuilder("Error on GAThread: ")).append(a(((Throwable) (obj)))).toString());
            com.google.android.gms.analytics.h.a("Google Analytics is shutting down.");
            b = true;
        }
        if (true) goto _L2; else goto _L1
_L2:
        break MISSING_BLOCK_LABEL_34;
        Exception exception;
        exception;
        g.unlock();
        throw exception;
_L1:
    }
}
