// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.loom.logger;

import android.os.Process;
import com.facebook.fbtrace.utils.FbTraceId;
import com.facebook.tools.dextr.bridge.constants.FilterType;
import java.io.File;
import java.util.EnumSet;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.facebook.loom.logger:
//            LogEntry, FileLogWriter, FilteringLogWriter, Trace, 
//            LogWriter, Closeables, NativeRingBuffer

class LoggerWorkerThread extends Thread
{

    private final File a;
    private volatile boolean b;
    private volatile NativeRingBuffer c;
    private final LogEntry d = new LogEntry();
    private final Trace.ClosedListener e;
    private final BlockingQueue f;

    LoggerWorkerThread(NativeRingBuffer nativeringbuffer, File file, Trace.ClosedListener closedlistener, BlockingQueue blockingqueue)
    {
        super("dextr-worker");
        setUncaughtExceptionHandler(new _cls1());
        b = true;
        c = nativeringbuffer;
        e = closedlistener;
        a = file;
        f = blockingqueue;
    }

    private static LogWriter a(String s, File file, int i)
    {
        s = new FileLogWriter(s, file.getAbsolutePath(), null);
        if ((i & 2) == 2)
        {
            return new FilteringLogWriter(s, EnumSet.of(FilterType.ASYNC));
        } else
        {
            return s;
        }
    }

    private Trace a(long l, File file, int i)
    {
        String s = FbTraceId.a(l);
        file = new File(file, Trace.a(s.replaceAll("[^\\p{Alnum}]", "_")));
        return new Trace(file, a(s, file, i), i, e);
    }

    private void a(LogWriter logwriter, NativeRingBuffer.Cursor cursor)
    {
        for (cursor = (NativeRingBuffer.Cursor)cursor.clone(); cursor.tryReadBackward(d); logwriter.a(d)) { }
    }

    private static void a(Trace trace)
    {
        if (trace != null)
        {
            trace.a(true);
            Closeables.a(trace);
        }
    }

    final void a()
    {
        b = false;
        c = null;
    }

    public void run()
    {
        Process.setThreadPriority(10);
        if (c != null && b) goto _L2; else goto _L1
_L1:
        a();
_L4:
        return;
_L2:
        Object obj2 = null;
        long l = 0L;
        BlockingQueue blockingqueue = f;
        do
        {
            if (!b)
            {
                continue; /* Loop/switch isn't completed */
            }
            Object obj1;
            Object obj3;
            NativeRingBuffer.Cursor cursor;
            long l1;
            boolean flag;
            try
            {
                cursor = (NativeRingBuffer.Cursor)blockingqueue.take();
            }
            catch (InterruptedException interruptedexception)
            {
                throw new LoggerException("Interrupted take() call");
            }
label0:
            do
            {
                Object obj;
                LogEntry.EntryType entrytype;
label1:
                {
                    flag = cursor.waitAndTryReadForward(d);
                    obj3 = obj2;
                    l1 = l;
                    if (!flag)
                    {
                        break label0;
                    }
                    entrytype = d.b();
                    if (entrytype != LogEntry.EntryType.TRACE_START)
                    {
                        obj = obj2;
                        if (entrytype != LogEntry.EntryType.TRACE_BACKWARDS)
                        {
                            break label1;
                        }
                    }
                    a(((Trace) (obj2)));
                    l1 = d.g();
                    int i = d.f();
                    int j = d.e();
                    l = d.c();
                    l = TimeUnit.MILLISECONDS.toNanos(j) + l;
                    obj = a(l1, a, i);
                }
label2:
                {
                    obj3 = obj;
                    l1 = l;
                    if (obj == null)
                    {
                        break label0;
                    }
                    obj2 = ((Trace) (obj)).a();
                    ((LogWriter) (obj2)).a(d);
                    if (entrytype == LogEntry.EntryType.TRACE_BACKWARDS)
                    {
                        a(((LogWriter) (obj2)), cursor);
                    }
                    if (entrytype != LogEntry.EntryType.TRACE_ABORT)
                    {
                        obj2 = obj;
                        l1 = l;
                        if (d.c() <= l)
                        {
                            break label2;
                        }
                    }
                    a(((Trace) (obj)));
                    l1 = 0L;
                    obj2 = null;
                }
                obj = obj2;
                if (entrytype == LogEntry.EntryType.TRACE_END)
                {
                    Closeables.a(((java.io.Closeable) (obj2)));
                    obj = null;
                    l1 = 0L;
                }
                obj2 = obj;
                l = l1;
                if (obj != null)
                {
                    continue;
                }
                obj3 = obj;
                break;
            } while (true);
            l = l1;
            obj1 = obj3;
            if (!flag)
            {
                a(((Trace) (obj3)));
                obj1 = null;
                l = 0L;
            }
            obj2 = obj1;
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
    }

    private class _cls1
        implements Thread.UncaughtExceptionHandler
    {

        final LoggerWorkerThread a;

        public void uncaughtException(Thread thread, Throwable throwable)
        {
            Log.e("Dextr", "Unhandled exception -- Dextr disabled", throwable);
            ErrorReporter.getInstance().handleException(throwable);
            a.a();
        }

        _cls1()
        {
            a = LoggerWorkerThread.this;
            super();
        }
    }


    private class LoggerException extends IllegalStateException
    {

        public LoggerException(String s)
        {
            super(s);
        }
    }

}
