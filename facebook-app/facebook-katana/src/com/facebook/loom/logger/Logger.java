// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.loom.logger;

import android.os.Process;
import com.facebook.loom.core.TraceEvents;
import java.io.File;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;

// Referenced classes of package com.facebook.loom.logger:
//            NativeRingBuffer, LogEntry, LoggerWorkerThread

public final class Logger
{

    static final BlockingQueue a = new LinkedBlockingQueue();
    private static final AtomicInteger b = new AtomicInteger(1);
    private static volatile boolean c;
    private static NativeRingBuffer d = new NativeRingBuffer(1000);
    private static volatile LoggerWorkerThread e;
    private static final ThreadLocal f = new _cls1();

    public Logger()
    {
    }

    public static int a(int i, LogEntry.EntryType entrytype, int j)
    {
        return a(i, null, entrytype, j, 0, 0L);
    }

    public static int a(int i, LogEntry.EntryType entrytype, int j, int k)
    {
        if (k == 0)
        {
            throw new IllegalArgumentException("writeEntry called with mMatchID = NO_MATCH");
        } else
        {
            return a(i, null, entrytype, j, k, 0L);
        }
    }

    public static int a(int i, LogEntry.EntryType entrytype, int j, int k, long l)
    {
        if (k == 0)
        {
            throw new IllegalArgumentException("writeEntry called with mMatchID = NO_MATCH");
        } else
        {
            return a(i, null, entrytype, j, k, l);
        }
    }

    public static int a(int i, LogEntry.EntryType entrytype, int j, long l)
    {
        return a(i, null, entrytype, j, 0, l);
    }

    private static int a(int i, NativeRingBuffer.Cursor cursor, LogEntry.EntryType entrytype, int j, int k, long l)
    {
        LoggerWorkerThread loggerworkerthread = e;
        if (c || loggerworkerthread == null)
        {
            return -1;
        }
        boolean flag = LogEntry.EntryType.isControlEntry(entrytype);
        if (!TraceEvents.a(i) && !flag)
        {
            return -1;
        }
        do
        {
            i = b.getAndIncrement();
        } while (i == 0 || i == -1);
        long l1 = System.nanoTime();
        int i1 = Process.myTid();
        ((LogEntry)f.get()).a(i, entrytype, l1, i1, j, k, l);
        a(cursor, i, entrytype.ordinal(), i1, j, k, l1, l);
        return i;
    }

    public static void a()
    {
        a(-1, null, LogEntry.EntryType.TRACE_END, 0, 0, 0L);
    }

    public static void a(long l, int i)
    {
        b(-1, LogEntry.EntryType.TRACE_BACKWARDS, i, 0, l);
    }

    public static void a(long l, int i, int j)
    {
        b(-1, LogEntry.EntryType.TRACE_START, j, i, l);
    }

    private static void a(NativeRingBuffer.Cursor cursor, int i, int j, int k, int l, int i1, long l1, 
            long l2)
    {
        NativeRingBuffer nativeringbuffer = d;
        if (nativeringbuffer == null)
        {
            return;
        }
        if (cursor == null)
        {
            nativeringbuffer.a(i, j, k, l, i1, l1, l2);
            return;
        } else
        {
            nativeringbuffer.a(cursor, i, j, k, l, i1, l1, l2);
            return;
        }
    }

    public static void a(File file, Trace.ClosedListener closedlistener)
    {
        NativeRingBuffer nativeringbuffer = d;
        if (c || nativeringbuffer == null)
        {
            return;
        }
        if (e != null)
        {
            throw new IllegalStateException("Trying to start a second worker thread!");
        } else
        {
            file = new LoggerWorkerThread(nativeringbuffer, file, closedlistener, a);
            e = file;
            file.start();
            return;
        }
    }

    private static int b(int i, LogEntry.EntryType entrytype, int j, int k, long l)
    {
        if (c)
        {
            return -1;
        }
        Object obj = d;
        if (obj == null)
        {
            throw new IllegalStateException("Logger enabled but buffer is null");
        } else
        {
            obj = ((NativeRingBuffer) (obj)).a();
            i = a(i, ((NativeRingBuffer.Cursor) (obj)), entrytype, j, k, l);
            a.add(obj);
            return i;
        }
    }

    public static void b()
    {
        a(-1, null, LogEntry.EntryType.TRACE_ABORT, 0, 0, 0L);
    }


    private class _cls1 extends ThreadLocal
    {

        private static LogEntry a()
        {
            return new LogEntry();
        }

        protected final Object initialValue()
        {
            return a();
        }

        _cls1()
        {
        }
    }

}
