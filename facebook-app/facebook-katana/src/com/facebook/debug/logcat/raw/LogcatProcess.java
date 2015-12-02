// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.debug.logcat.raw;

import android.util.Log;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

public class LogcatProcess
{

    private static final String a = com/facebook/debug/logcat/raw/LogcatProcess.getSimpleName();
    private Process b;
    private List c;
    private volatile State d;

    public LogcatProcess(List list)
    {
        c = list;
        d = State.BORN;
    }

    static State a(LogcatProcess logcatprocess, State state)
    {
        logcatprocess.d = state;
        return state;
    }

    static Process a(LogcatProcess logcatprocess)
    {
        return logcatprocess.b;
    }

    static State b(LogcatProcess logcatprocess)
    {
        return logcatprocess.d;
    }

    public final void a()
    {
        this;
        JVM INSTR monitorenter ;
        if (d != State.BORN)
        {
            throw new IllegalStateException("Cannot start logcat process twice");
        }
        break MISSING_BLOCK_LABEL_27;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
        d = State.RUNNING;
        this;
        JVM INSTR monitorexit ;
        ArrayList arraylist = new ArrayList();
        arraylist.add("logcat");
        arraylist.addAll(c);
        try
        {
            b = (new ProcessBuilder(new String[0])).command(arraylist).start();
        }
        catch (IOException ioexception)
        {
            throw new RuntimeException("unable to start logcat process", ioexception);
        }
        (new Thread(new _cls1())).start();
        return;
    }

    public final InputStream b()
    {
        return b.getInputStream();
    }

    public final void c()
    {
        this;
        JVM INSTR monitorenter ;
        if (d != State.RUNNING)
        {
            throw new IllegalStateException("Cannot stop non-running logcat process");
        }
        break MISSING_BLOCK_LABEL_27;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
        d = State.KILLED;
        this;
        JVM INSTR monitorexit ;
        b.destroy();
        return;
    }

    protected void finalize()
    {
        super.finalize();
        try
        {
            if (d == State.RUNNING)
            {
                c();
                Log.e(a, "child process still alive when finalize() called");
            }
            return;
        }
        catch (RuntimeException runtimeexception)
        {
            return;
        }
    }


    private class State extends Enum
    {

        private static final State $VALUES[];
        public static final State BORN;
        public static final State KILLED;
        public static final State RUNNING;

        public static State valueOf(String s)
        {
            return (State)Enum.valueOf(com/facebook/debug/logcat/raw/LogcatProcess$State, s);
        }

        public static State[] values()
        {
            return (State[])$VALUES.clone();
        }

        static 
        {
            BORN = new State("BORN", 0);
            RUNNING = new State("RUNNING", 1);
            KILLED = new State("KILLED", 2);
            $VALUES = (new State[] {
                BORN, RUNNING, KILLED
            });
        }

        private State(String s, int i)
        {
            super(s, i);
        }
    }


    private class _cls1
        implements Runnable
    {

        final LogcatProcess a;

        public void run()
        {
            InputStream inputstream;
            byte abyte0[];
            inputstream = LogcatProcess.a(a).getErrorStream();
            abyte0 = new byte[4096];
_L1:
            if (inputstream.read(abyte0) < 0)
            {
                break MISSING_BLOCK_LABEL_80;
            }
label0:
            {
                synchronized (a)
                {
                    if (LogcatProcess.b(a) == State.RUNNING)
                    {
                        break label0;
                    }
                }
                return;
            }
            logcatprocess;
            JVM INSTR monitorexit ;
              goto _L1
            exception;
            logcatprocess;
            JVM INSTR monitorexit ;
            try
            {
                throw exception;
            }
            catch (IOException ioexception)
            {
                LogcatProcess.a(a).destroy();
            }
            LogcatProcess.a(a, State.KILLED);
        }

        _cls1()
        {
            a = LogcatProcess.this;
            super();
        }
    }

}
