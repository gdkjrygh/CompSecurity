// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.internal.events;

import android.os.Handler;
import android.os.Looper;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

public abstract class EventIncrementCache
{

    public Handler mEventHandler;
    public HashMap mEventIncrementCache;
    public final Object mEventIncrementLock = new Object();
    public int mFlushIntervalMillis;
    public boolean mFlushTimerOutstanding;

    public EventIncrementCache(Looper looper, int i)
    {
        mEventHandler = new Handler(looper);
        mEventIncrementCache = new HashMap();
        mFlushIntervalMillis = i;
    }

    public abstract void doIncrementEvent(String s, int i);

    public final void flush()
    {
        Object obj = mEventIncrementLock;
        obj;
        JVM INSTR monitorenter ;
        java.util.Map.Entry entry;
        for (Iterator iterator = mEventIncrementCache.entrySet().iterator(); iterator.hasNext(); doIncrementEvent((String)entry.getKey(), ((AtomicInteger)entry.getValue()).get()))
        {
            entry = (java.util.Map.Entry)iterator.next();
        }

        break MISSING_BLOCK_LABEL_72;
        Exception exception;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
        mEventIncrementCache.clear();
        obj;
        JVM INSTR monitorexit ;
    }

    // Unreferenced inner class com/google/android/gms/games/internal/events/EventIncrementCache$1

/* anonymous class */
    public final class _cls1
        implements Runnable
    {

        final EventIncrementCache this$0;

        public final void run()
        {
            EventIncrementCache eventincrementcache = EventIncrementCache.this;
            synchronized (eventincrementcache.mEventIncrementLock)
            {
                eventincrementcache.mFlushTimerOutstanding = false;
                eventincrementcache.flush();
            }
            return;
            exception;
            obj;
            JVM INSTR monitorexit ;
            throw exception;
        }

            public 
            {
                this$0 = EventIncrementCache.this;
                super();
            }
    }

}
