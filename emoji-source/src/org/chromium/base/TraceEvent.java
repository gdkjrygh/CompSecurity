// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.chromium.base;

import android.os.Looper;
import android.os.MessageQueue;
import android.os.SystemClock;
import android.util.Log;
import android.util.Printer;

// Referenced classes of package org.chromium.base:
//            ThreadUtils, CommandLine

public class TraceEvent
{
    private static class BasicLooperMonitor
        implements Printer
    {

        static final boolean $assertionsDisabled;

        void beginHandling(String s)
        {
            if (TraceEvent.sEnabled)
            {
                TraceEvent.nativeBeginToplevel();
            }
        }

        void endHandling(String s)
        {
            if (TraceEvent.sEnabled)
            {
                TraceEvent.nativeEndToplevel();
            }
        }

        public void println(String s)
        {
            if (s.startsWith(">"))
            {
                beginHandling(s);
                return;
            }
            if (!$assertionsDisabled && !s.startsWith("<"))
            {
                throw new AssertionError();
            } else
            {
                endHandling(s);
                return;
            }
        }

        static 
        {
            boolean flag;
            if (!org/chromium/base/TraceEvent.desiredAssertionStatus())
            {
                flag = true;
            } else
            {
                flag = false;
            }
            $assertionsDisabled = flag;
        }

        private BasicLooperMonitor()
        {
        }

    }

    private static final class IdleTracingLooperMonitor extends BasicLooperMonitor
        implements android.os.MessageQueue.IdleHandler
    {

        private static final long FRAME_DURATION_MILLIS = 16L;
        private static final String IDLE_EVENT_NAME = "Looper.queueIdle";
        private static final long MIN_INTERESTING_BURST_DURATION_MILLIS = 48L;
        private static final long MIN_INTERESTING_DURATION_MILLIS = 16L;
        private static final String TAG = "TraceEvent.LooperMonitor";
        private boolean mIdleMonitorAttached;
        private long mLastIdleStartedAt;
        private long mLastWorkStartedAt;
        private int mNumIdlesSeen;
        private int mNumTasksSeen;
        private int mNumTasksSinceLastIdle;

        private final void syncIdleMonitoring()
        {
            if (TraceEvent.sEnabled && !mIdleMonitorAttached)
            {
                mLastIdleStartedAt = SystemClock.elapsedRealtime();
                Looper.myQueue().addIdleHandler(this);
                mIdleMonitorAttached = true;
                Log.v("TraceEvent.LooperMonitor", "attached idle handler");
            } else
            if (mIdleMonitorAttached && !TraceEvent.sEnabled)
            {
                Looper.myQueue().removeIdleHandler(this);
                mIdleMonitorAttached = false;
                Log.v("TraceEvent.LooperMonitor", "detached idle handler");
                return;
            }
        }

        private static void traceAndLog(int i, String s)
        {
            TraceEvent.instant("TraceEvent.LooperMonitor:IdleStats", s);
            Log.println(i, "TraceEvent.LooperMonitor", s);
        }

        final void beginHandling(String s)
        {
            if (mNumTasksSinceLastIdle == 0)
            {
                TraceEvent.end("Looper.queueIdle");
            }
            mLastWorkStartedAt = SystemClock.elapsedRealtime();
            syncIdleMonitoring();
            super.beginHandling(s);
        }

        final void endHandling(String s)
        {
            long l = SystemClock.elapsedRealtime() - mLastWorkStartedAt;
            if (l > 16L)
            {
                traceAndLog(5, (new StringBuilder()).append("observed a task that took ").append(l).append("ms: ").append(s).toString());
            }
            super.endHandling(s);
            syncIdleMonitoring();
            mNumTasksSeen = mNumTasksSeen + 1;
            mNumTasksSinceLastIdle = mNumTasksSinceLastIdle + 1;
        }

        public final boolean queueIdle()
        {
            long l = SystemClock.elapsedRealtime();
            if (mLastIdleStartedAt == 0L)
            {
                mLastIdleStartedAt = l;
            }
            long l1 = l - mLastIdleStartedAt;
            mNumIdlesSeen = mNumIdlesSeen + 1;
            TraceEvent.begin("Looper.queueIdle", (new StringBuilder()).append(mNumTasksSinceLastIdle).append(" tasks since last idle.").toString());
            if (l1 > 48L)
            {
                traceAndLog(3, (new StringBuilder()).append(mNumTasksSeen).append(" tasks and ").append(mNumIdlesSeen).append(" idles processed so far, ").append(mNumTasksSinceLastIdle).append(" tasks bursted and ").append(l1).append("ms elapsed since last idle").toString());
            }
            mLastIdleStartedAt = l;
            mNumTasksSinceLastIdle = 0;
            return true;
        }

        private IdleTracingLooperMonitor()
        {
            mLastIdleStartedAt = 0L;
            mLastWorkStartedAt = 0L;
            mNumTasksSeen = 0;
            mNumIdlesSeen = 0;
            mNumTasksSinceLastIdle = 0;
            mIdleMonitorAttached = false;
        }

    }

    private static final class LooperMonitorHolder
    {

        private static final BasicLooperMonitor sInstance;

        static 
        {
            Object obj;
            if (CommandLine.getInstance().hasSwitch("enable-idle-tracing"))
            {
                obj = new IdleTracingLooperMonitor();
            } else
            {
                obj = new BasicLooperMonitor();
            }
            sInstance = ((BasicLooperMonitor) (obj));
        }


        private LooperMonitorHolder()
        {
        }
    }


    private static volatile boolean sEnabled = false;

    public TraceEvent()
    {
    }

    public static void begin()
    {
        if (sEnabled)
        {
            nativeBegin(getCallerName(), null);
        }
    }

    public static void begin(String s)
    {
        if (sEnabled)
        {
            nativeBegin(s, null);
        }
    }

    public static void begin(String s, String s1)
    {
        if (sEnabled)
        {
            nativeBegin(s, s1);
        }
    }

    public static boolean enabled()
    {
        return sEnabled;
    }

    public static void end()
    {
        if (sEnabled)
        {
            nativeEnd(getCallerName(), null);
        }
    }

    public static void end(String s)
    {
        if (sEnabled)
        {
            nativeEnd(s, null);
        }
    }

    public static void end(String s, String s1)
    {
        if (sEnabled)
        {
            nativeEnd(s, s1);
        }
    }

    public static void finishAsync(long l)
    {
        if (sEnabled)
        {
            nativeFinishAsync(getCallerName(), l, null);
        }
    }

    public static void finishAsync(String s, long l)
    {
        if (sEnabled)
        {
            nativeFinishAsync(s, l, null);
        }
    }

    public static void finishAsync(String s, long l, String s1)
    {
        if (sEnabled)
        {
            nativeFinishAsync(s, l, s1);
        }
    }

    private static String getCallerName()
    {
        StackTraceElement astacktraceelement[] = Thread.currentThread().getStackTrace();
        return (new StringBuilder()).append(astacktraceelement[4].getClassName()).append(".").append(astacktraceelement[4].getMethodName()).toString();
    }

    public static void instant(String s)
    {
        if (sEnabled)
        {
            nativeInstant(s, null);
        }
    }

    public static void instant(String s, String s1)
    {
        if (sEnabled)
        {
            nativeInstant(s, s1);
        }
    }

    private static native void nativeBegin(String s, String s1);

    private static native void nativeBeginToplevel();

    private static native void nativeEnd(String s, String s1);

    private static native void nativeEndToplevel();

    private static native void nativeFinishAsync(String s, long l, String s1);

    private static native void nativeInstant(String s, String s1);

    private static native void nativeRegisterEnabledObserver();

    private static native void nativeStartATrace();

    private static native void nativeStartAsync(String s, long l, String s1);

    private static native void nativeStopATrace();

    public static void registerNativeEnabledObserver()
    {
        nativeRegisterEnabledObserver();
    }

    public static void setATraceEnabled(boolean flag)
    {
        if (sEnabled == flag)
        {
            return;
        }
        if (flag)
        {
            nativeStartATrace();
            return;
        } else
        {
            nativeStopATrace();
            return;
        }
    }

    public static void setEnabled(boolean flag)
    {
        sEnabled = flag;
        Looper looper = ThreadUtils.getUiThreadLooper();
        BasicLooperMonitor basicloopermonitor;
        if (flag)
        {
            basicloopermonitor = LooperMonitorHolder.sInstance;
        } else
        {
            basicloopermonitor = null;
        }
        looper.setMessageLogging(basicloopermonitor);
    }

    public static void startAsync(long l)
    {
        if (sEnabled)
        {
            nativeStartAsync(getCallerName(), l, null);
        }
    }

    public static void startAsync(String s, long l)
    {
        if (sEnabled)
        {
            nativeStartAsync(s, l, null);
        }
    }

    public static void startAsync(String s, long l, String s1)
    {
        if (sEnabled)
        {
            nativeStartAsync(s, l, s1);
        }
    }




}
