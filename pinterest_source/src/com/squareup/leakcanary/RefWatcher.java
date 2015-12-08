// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.leakcanary;

import java.lang.ref.ReferenceQueue;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.Executor;

// Referenced classes of package com.squareup.leakcanary:
//            GcTrigger, Preconditions, DebuggerControl, HeapDumper

public final class RefWatcher
{

    public static final RefWatcher a;
    private final Executor b;
    private final DebuggerControl c;
    private final GcTrigger d;
    private final HeapDumper e;
    private final Set f = new CopyOnWriteArraySet();
    private final ReferenceQueue g = new ReferenceQueue();
    private final HeapDump.Listener h;

    private RefWatcher(Executor executor, DebuggerControl debuggercontrol, GcTrigger gctrigger, HeapDumper heapdumper, HeapDump.Listener listener)
    {
        b = (Executor)Preconditions.a(executor, "watchExecutor");
        c = (DebuggerControl)Preconditions.a(debuggercontrol, "debuggerControl");
        d = (GcTrigger)Preconditions.a(gctrigger, "gcTrigger");
        e = (HeapDumper)Preconditions.a(heapdumper, "heapDumper");
        h = (HeapDump.Listener)Preconditions.a(listener, "heapdumpListener");
    }

    static 
    {
        a = new RefWatcher(new _cls1(), new _cls2(), GcTrigger.DEFAULT, new _cls3(), new _cls4());
    }

    private class _cls1
        implements Executor
    {

        public final void execute(Runnable runnable)
        {
        }

        _cls1()
        {
        }
    }


    private class _cls2
        implements DebuggerControl
    {

        public final boolean isDebuggerAttached()
        {
            return true;
        }

        _cls2()
        {
        }
    }


    private class _cls3
        implements HeapDumper
    {

        public final File dumpHeap()
        {
            return null;
        }

        _cls3()
        {
        }
    }


    private class _cls4
        implements HeapDump.Listener
    {

        public final void analyze(HeapDump heapdump)
        {
        }

        _cls4()
        {
        }
    }

}
