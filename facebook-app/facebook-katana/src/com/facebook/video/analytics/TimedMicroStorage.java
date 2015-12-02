// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.video.analytics;

import com.facebook.common.errorreporting.FbErrorReporter;
import com.facebook.common.executors.ConstrainedExecutorService;
import com.facebook.debug.log.BLog;
import com.facebook.tools.dextr.runtime.detour.ExecutorDetour;
import com.google.common.base.Preconditions;
import com.google.common.io.Files;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

// Referenced classes of package com.facebook.video.analytics:
//            MicroStorage

public class TimedMicroStorage
    implements MicroStorage
{

    private static final String a = com/facebook/video/analytics/TimedMicroStorage.getName();
    private final File b;
    private final int c;
    private final ConstrainedExecutorService d;
    private final ScheduledExecutorService e;
    private final FbErrorReporter f;
    private AtomicBoolean g;
    private AtomicBoolean h;

    public TimedMicroStorage(File file, ScheduledExecutorService scheduledexecutorservice, int i, FbErrorReporter fberrorreporter)
    {
        b = file;
        e = scheduledexecutorservice;
        c = i;
        f = fberrorreporter;
        d = ConstrainedExecutorService.a("TimedMicroStorage", 1, 10, e);
        g = new AtomicBoolean(false);
        h = new AtomicBoolean(false);
    }

    static String a()
    {
        return a;
    }

    static AtomicBoolean a(TimedMicroStorage timedmicrostorage)
    {
        return timedmicrostorage.g;
    }

    static void a(TimedMicroStorage timedmicrostorage, MicroStorage.WriteCallback writecallback)
    {
        timedmicrostorage.c(writecallback);
    }

    static File b(TimedMicroStorage timedmicrostorage)
    {
        return timedmicrostorage.b;
    }

    private void b(MicroStorage.WriteCallback writecallback)
    {
        if (h.getAndSet(true))
        {
            writecallback.hashCode();
            return;
        } else
        {
            e.schedule(new _cls2(writecallback), c, TimeUnit.MILLISECONDS);
            return;
        }
    }

    static int c(TimedMicroStorage timedmicrostorage)
    {
        return timedmicrostorage.c;
    }

    private void c(MicroStorage.WriteCallback writecallback)
    {
        FileOutputStream fileoutputstream;
        h.set(false);
        fileoutputstream = new FileOutputStream(b);
        ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream();
        writecallback.hashCode();
        writecallback.a(new DataOutputStream(bytearrayoutputstream));
        Files.a(bytearrayoutputstream.toByteArray(), b);
        try
        {
            fileoutputstream.close();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (MicroStorage.WriteCallback writecallback)
        {
            BLog.a(a, writecallback, "Cannot write to storage", new Object[0]);
        }
        break MISSING_BLOCK_LABEL_84;
        writecallback;
        fileoutputstream.close();
        throw writecallback;
        f.a(a, "Cannot store video accumulated stats", writecallback);
        return;
    }

    static ConstrainedExecutorService d(TimedMicroStorage timedmicrostorage)
    {
        return timedmicrostorage.d;
    }

    public final void a(MicroStorage.ReadCallback readcallback)
    {
        readcallback.hashCode();
        ExecutorDetour.a(d, new _cls1(readcallback), 0xb67e78bf);
    }

    public final void a(MicroStorage.WriteCallback writecallback)
    {
        Preconditions.checkArgument(g.get(), "Calling write without having read info first!");
        b(writecallback);
    }


    private class _cls2
        implements Runnable
    {

        final MicroStorage.WriteCallback a;
        final TimedMicroStorage b;

        public void run()
        {
            TimedMicroStorage.a();
            TimedMicroStorage.c(b);
            a.hashCode();
            class _cls1
                implements Runnable
            {

                final _cls2 a;

                public void run()
                {
                    TimedMicroStorage.a(a.b, a.a);
                }

                _cls1()
                {
                    a = _cls2.this;
                    super();
                }
            }

            ExecutorDetour.a(TimedMicroStorage.d(b), new _cls1(), 0x6ecf514d);
        }

        _cls2(MicroStorage.WriteCallback writecallback)
        {
            b = TimedMicroStorage.this;
            a = writecallback;
            super();
        }
    }


    private class _cls1
        implements Runnable
    {

        final MicroStorage.ReadCallback a;
        final TimedMicroStorage b;

        public void run()
        {
            TimedMicroStorage.a(b).set(true);
            if (!TimedMicroStorage.b(b).exists())
            {
                TimedMicroStorage.a();
                a.a(new byte[0]);
                return;
            }
            Object obj = new FileInputStream(TimedMicroStorage.b(b));
            byte abyte0[] = ByteStreams.a(new BufferedInputStream(((java.io.InputStream) (obj))));
            TimedMicroStorage.a();
            a.hashCode();
            a.a(abyte0);
            try
            {
                ((FileInputStream) (obj)).close();
                return;
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                BLog.a(TimedMicroStorage.a(), ((Throwable) (obj)), "Cannot read from storage file", new Object[0]);
            }
            a.a(new byte[0]);
            return;
            Exception exception;
            exception;
            ((FileInputStream) (obj)).close();
            throw exception;
        }

        _cls1(MicroStorage.ReadCallback readcallback)
        {
            b = TimedMicroStorage.this;
            a = readcallback;
            super();
        }
    }

}
