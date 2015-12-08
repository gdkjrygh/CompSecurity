// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.api2;

import AT;
import Bk;
import android.os.Handler;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import sX;

public abstract class LoadAllStorySnapsTask
{
    public static final class Status extends Enum
    {

        private static final Status $VALUES[];
        public static final Status FAILED_TO_LOAD;
        public static final Status INITIALIZED;
        public static final Status RUNNING;
        public static final Status SUCCESS;
        public static final Status TIMEOUT;

        public static Status valueOf(String s)
        {
            return (Status)Enum.valueOf(com/snapchat/android/api2/LoadAllStorySnapsTask$Status, s);
        }

        public static Status[] values()
        {
            return (Status[])$VALUES.clone();
        }

        static 
        {
            INITIALIZED = new Status("INITIALIZED", 0);
            RUNNING = new Status("RUNNING", 1);
            SUCCESS = new Status("SUCCESS", 2);
            FAILED_TO_LOAD = new Status("FAILED_TO_LOAD", 3);
            TIMEOUT = new Status("TIMEOUT", 4);
            $VALUES = (new Status[] {
                INITIALIZED, RUNNING, SUCCESS, FAILED_TO_LOAD, TIMEOUT
            });
        }

        private Status(String s, int i)
        {
            super(s, i);
        }
    }

    final class a
        implements AT.a
    {

        final LoadAllStorySnapsTask this$0;

        public final void a()
        {
            LoadAllStorySnapsTask.this.a(Status.FAILED_TO_LOAD);
        }

        public final void a(AT at)
        {
            synchronized (mMutex)
            {
                at.a(this);
                mStorySnapsLeftToLoad.remove(at);
            }
            d();
            return;
            at;
            obj;
            JVM INSTR monitorexit ;
            throw at;
        }

        private a()
        {
            this$0 = LoadAllStorySnapsTask.this;
            super();
        }

        a(byte byte0)
        {
            this();
        }
    }


    private static final long DEFAULT_POLL_FREQUENCY_MS = 1000L;
    private static final long DEFAULT_TIMEOUT_MS = 30000L;
    private final Handler mCallbackHandler;
    public Object mMutex;
    public final long mPollFrequencyMs;
    public TimerTask mPollingTask;
    public Timer mPollingTimer;
    private final a mSnapLoadedListener;
    public Status mStatus;
    private final sX mStoryLoader;
    private final Collection mStorySnaps;
    Set mStorySnapsLeftToLoad;
    public final ScheduledExecutorService mTimeoutExecutor;
    public ScheduledFuture mTimeoutFuture;
    public final long mTimeoutMs;

    public LoadAllStorySnapsTask(Collection collection)
    {
        this(collection, (byte)0);
    }

    private LoadAllStorySnapsTask(Collection collection, byte byte0)
    {
        this(collection, new Handler(), sX.a());
    }

    private LoadAllStorySnapsTask(Collection collection, Handler handler, sX sx)
    {
        mSnapLoadedListener = new a((byte)0);
        mTimeoutExecutor = Executors.newSingleThreadScheduledExecutor();
        mMutex = new Object();
        mStorySnapsLeftToLoad = new HashSet();
        mStatus = Status.INITIALIZED;
        if (30000L < 0L)
        {
            throw new IllegalArgumentException("timeoutMs < 0: 30000");
        }
        if (1000L < 0L)
        {
            throw new IllegalArgumentException("pollFrequencyMs < 0: 1000");
        }
        if (1000L > 30000L)
        {
            throw new IllegalArgumentException(String.format("pollFrequencyMs (%s) > timeoutMs (%s)", new Object[] {
                Long.valueOf(1000L), Long.valueOf(30000L)
            }));
        } else
        {
            mStorySnaps = collection;
            mTimeoutMs = 30000L;
            mPollFrequencyMs = 1000L;
            mCallbackHandler = handler;
            mStoryLoader = sx;
            return;
        }
    }

    public abstract void a();

    final void a(final Status status)
    {
        boolean flag1;
label0:
        {
            flag1 = true;
            synchronized (mMutex)
            {
                if (mStatus != Status.SUCCESS && mStatus != Status.FAILED_TO_LOAD && mStatus != Status.TIMEOUT)
                {
                    break label0;
                }
            }
            return;
        }
        mStatus = status;
        obj;
        JVM INSTR monitorexit ;
        boolean flag;
        if (status == Status.TIMEOUT)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        obj = mMutex;
        obj;
        JVM INSTR monitorenter ;
        for (Iterator iterator = mStorySnapsLeftToLoad.iterator(); iterator.hasNext(); ((Bk)iterator.next()).a(mSnapLoadedListener)) { }
        break MISSING_BLOCK_LABEL_121;
        status;
        obj;
        JVM INSTR monitorexit ;
        throw status;
        status;
        obj;
        JVM INSTR monitorexit ;
        throw status;
        mStorySnapsLeftToLoad.clear();
        if (mTimeoutFuture == null || flag)
        {
            break MISSING_BLOCK_LABEL_153;
        }
        mTimeoutFuture.cancel(true);
        if (mPollingTask != null)
        {
            mPollingTask.cancel();
        }
        if (mPollingTimer != null)
        {
            mPollingTimer.cancel();
            mPollingTimer.purge();
        }
        obj;
        JVM INSTR monitorexit ;
        if (mCallbackHandler != null)
        {
            mCallbackHandler.post(new Runnable() {

                final LoadAllStorySnapsTask this$0;
                final Status val$status;

                public final void run()
                {
                    LoadAllStorySnapsTask loadallstorysnapstask = LoadAllStorySnapsTask.this;
                    boolean flag2;
                    if (status == Status.SUCCESS)
                    {
                        flag2 = true;
                    } else
                    {
                        flag2 = false;
                    }
                    loadallstorysnapstask.a(flag2);
                }

            
            {
                this$0 = LoadAllStorySnapsTask.this;
                status = status1;
                super();
            }
            });
            return;
        }
        if (status != Status.SUCCESS)
        {
            flag1 = false;
        }
        a(flag1);
        return;
    }

    final void a(boolean flag)
    {
        if (flag)
        {
            a();
            return;
        } else
        {
            b();
            return;
        }
    }

    public abstract void b();

    public final void c()
    {
        Object obj = mMutex;
        obj;
        JVM INSTR monitorenter ;
        Iterator iterator = mStorySnaps.iterator();
_L2:
        Bk bk;
        a a1;
        do
        {
            if (!iterator.hasNext())
            {
                break MISSING_BLOCK_LABEL_130;
            }
            bk = (Bk)iterator.next();
        } while (bk.O());
        mStorySnapsLeftToLoad.add(bk);
        a1 = mSnapLoadedListener;
        if (a1 != null)
        {
            break MISSING_BLOCK_LABEL_81;
        }
        throw new NullPointerException();
        Exception exception;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
        synchronized (((AT) (bk)).mLoadEventListeners)
        {
            ((AT) (bk)).mLoadEventListeners.add(a1);
        }
        if (bk.U()) goto _L2; else goto _L1
_L1:
        mStoryLoader.a(bk);
          goto _L2
        exception1;
        set;
        JVM INSTR monitorexit ;
        throw exception1;
        obj;
        JVM INSTR monitorexit ;
    }

    public final void d()
    {
        Object obj = mMutex;
        obj;
        JVM INSTR monitorenter ;
        if (!mStorySnapsLeftToLoad.isEmpty()) goto _L2; else goto _L1
_L1:
        a(Status.SUCCESS);
_L4:
        return;
_L2:
        if (e())
        {
            a(Status.SUCCESS);
        }
        if (true) goto _L4; else goto _L3
_L3:
        Exception exception;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    final boolean e()
    {
label0:
        {
            synchronized (mMutex)
            {
                Iterator iterator = mStorySnapsLeftToLoad.iterator();
                do
                {
                    if (!iterator.hasNext())
                    {
                        break label0;
                    }
                } while (((Bk)iterator.next()).O());
            }
            return false;
        }
        obj;
        JVM INSTR monitorexit ;
        return true;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    // Unreferenced inner class com/snapchat/android/api2/LoadAllStorySnapsTask$1

/* anonymous class */
    public final class _cls1
        implements Runnable
    {

        final LoadAllStorySnapsTask this$0;

        public final void run()
        {
            a(Status.TIMEOUT);
        }

            public 
            {
                this$0 = LoadAllStorySnapsTask.this;
                super();
            }
    }


    // Unreferenced inner class com/snapchat/android/api2/LoadAllStorySnapsTask$2

/* anonymous class */
    public final class _cls2 extends TimerTask
    {

        final LoadAllStorySnapsTask this$0;

        public final void run()
        {
            if (e())
            {
                a(Status.SUCCESS);
            }
        }

            public 
            {
                this$0 = LoadAllStorySnapsTask.this;
                super();
            }
    }

}
