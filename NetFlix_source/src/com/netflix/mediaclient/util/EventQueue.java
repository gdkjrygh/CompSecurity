// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.util;

import android.os.SystemClock;
import com.netflix.mediaclient.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

// Referenced classes of package com.netflix.mediaclient.util:
//            StringUtils

public abstract class EventQueue
{
    public static interface FlushCriterion
    {

        public abstract boolean shouldFlushQueue(int i, long l);
    }

    private class QueueSizeFlushCriterion
        implements FlushCriterion
    {

        final EventQueue this$0;

        public boolean shouldFlushQueue(int i, long l)
        {
            if (mEventQueue.size() >= mMaxNumberOfEvents)
            {
                if (Log.isLoggable(TAG, 3))
                {
                    Log.d(TAG, (new StringBuilder()).append("Posting events: Current number of events in outgoing queue is ").append(mEventQueue.size()).append(" and it is equal or higher than treshold of ").append(mMaxNumberOfEvents).toString());
                }
                return true;
            }
            if (Log.isLoggable(TAG, 3))
            {
                Log.d(TAG, (new StringBuilder()).append("Current number of events in outgoing queue is ").append(mEventQueue.size()).append(" and it is less than treshold of ").append(mMaxNumberOfEvents).toString());
            }
            return false;
        }

        private QueueSizeFlushCriterion()
        {
            this$0 = EventQueue.this;
            super();
        }

    }

    private class TimeInQueueFlushCriterion
        implements FlushCriterion
    {

        final EventQueue this$0;

        public boolean shouldFlushQueue(int i, long l)
        {
            long l1 = SystemClock.elapsedRealtime() - l;
            if (l > 0L && l1 > mMaxTimeToStayInQueueInMs)
            {
                if (Log.isLoggable(TAG, 3))
                {
                    Log.d(TAG, (new StringBuilder()).append("Posting events: older event in queue was posted [ms] ").append(l1).append(" and that triggers time of stay in queue criteria of ").append(mMaxTimeToStayInQueueInMs).toString());
                }
                return true;
            }
            if (Log.isLoggable(TAG, 3))
            {
                Log.d(TAG, (new StringBuilder()).append("Posting events: older event in queue was posted [ms] ").append(l1).append(" and that does NOT triggers time of stay in queue criteria of ").append(mMaxTimeToStayInQueueInMs).toString());
            }
            return false;
        }

        private TimeInQueueFlushCriterion()
        {
            this$0 = EventQueue.this;
            super();
        }

    }


    public static final int MAX_TIME_THAN_EVENT_CAN_STAY_IN_QUEUE_MS = 0x493e0;
    public static final int MIN_NUMBER_OF_EVENTS_TO_POST = 100;
    private String TAG;
    private List mEventQueue;
    private List mFlushCriteria;
    private long mLastTimeEventAddedInMs;
    private int mMaxNumberOfEvents;
    private long mMaxTimeToStayInQueueInMs;
    private AtomicBoolean mPaused;

    public EventQueue(String s)
    {
        this(s, true, true);
    }

    public EventQueue(String s, int i, long l, boolean flag, boolean flag1)
    {
        TAG = "nf_event";
        mMaxNumberOfEvents = 100;
        mMaxTimeToStayInQueueInMs = 0x493e0L;
        mEventQueue = Collections.synchronizedList(new ArrayList());
        mFlushCriteria = Collections.synchronizedList(new ArrayList());
        mPaused = new AtomicBoolean(false);
        if (StringUtils.isNotEmpty(s))
        {
            TAG = s;
        }
        if (i <= 0)
        {
            throw new IllegalArgumentException("Number of events must be higher than 0!");
        }
        if (l <= 0L)
        {
            throw new IllegalArgumentException("Stay time in queue must be higher than 0!");
        }
        mMaxNumberOfEvents = i;
        mMaxTimeToStayInQueueInMs = l;
        if (flag)
        {
            mFlushCriteria.add(new QueueSizeFlushCriterion());
        }
        if (flag1)
        {
            mFlushCriteria.add(new TimeInQueueFlushCriterion());
        }
    }

    public EventQueue(String s, boolean flag, boolean flag1)
    {
        TAG = "nf_event";
        mMaxNumberOfEvents = 100;
        mMaxTimeToStayInQueueInMs = 0x493e0L;
        mEventQueue = Collections.synchronizedList(new ArrayList());
        mFlushCriteria = Collections.synchronizedList(new ArrayList());
        mPaused = new AtomicBoolean(false);
        if (StringUtils.isNotEmpty(s))
        {
            TAG = s;
        }
        if (flag)
        {
            mFlushCriteria.add(new QueueSizeFlushCriterion());
        }
        if (flag1)
        {
            mFlushCriteria.add(new TimeInQueueFlushCriterion());
        }
    }

    public void addFlushCriterion(FlushCriterion flushcriterion)
    {
        if (flushcriterion == null)
        {
            return;
        } else
        {
            mFlushCriteria.add(flushcriterion);
            return;
        }
    }

    protected abstract void doFlush(List list);

    public void flushEvents()
    {
        this;
        JVM INSTR monitorenter ;
        ArrayList arraylist = new ArrayList();
        synchronized (mEventQueue)
        {
            arraylist.addAll(mEventQueue);
            mEventQueue.clear();
            mLastTimeEventAddedInMs = 0L;
        }
        doFlush(arraylist);
        this;
        JVM INSTR monitorexit ;
        return;
        exception1;
        list;
        JVM INSTR monitorexit ;
        throw exception1;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public boolean flushIfCriteriaIsFulfilled()
    {
        boolean flag = false;
        if (shouldFlushQueue())
        {
            flag = true;
            flushEvents();
        }
        return flag;
    }

    public void pauseDelivery()
    {
        mPaused.set(true);
    }

    public final void post(Object obj)
    {
        this;
        JVM INSTR monitorenter ;
        if (obj != null) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        synchronized (mEventQueue)
        {
            if (mEventQueue.isEmpty())
            {
                mLastTimeEventAddedInMs = SystemClock.elapsedRealtime();
            }
            mEventQueue.add(obj);
        }
        if (!shouldFlushQueue()) goto _L1; else goto _L3
_L3:
        flushEvents();
          goto _L1
        obj;
        throw obj;
        obj;
        list;
        JVM INSTR monitorexit ;
        throw obj;
    }

    public boolean removeFlushCriterion(FlushCriterion flushcriterion)
    {
        if (flushcriterion == null)
        {
            return false;
        } else
        {
            return mFlushCriteria.remove(flushcriterion);
        }
    }

    public void resumeDelivery(boolean flag)
    {
        mPaused.set(false);
        if (flag)
        {
            flushEvents();
        }
    }

    public boolean shouldFlushQueue()
    {
        if (!mPaused.get()) goto _L2; else goto _L1
_L1:
        Log.d(TAG, "Paused state:: we can not flash events");
_L4:
        return false;
_L2:
        Iterator iterator;
        if (mFlushCriteria.size() <= 0)
        {
            break MISSING_BLOCK_LABEL_131;
        }
        if (Log.isLoggable(TAG, 3))
        {
            Log.d(TAG, (new StringBuilder()).append("Custom rules to flush queue found: ").append(mFlushCriteria.size()).toString());
        }
        iterator = mFlushCriteria.iterator();
_L6:
        if (!iterator.hasNext()) goto _L4; else goto _L3
_L3:
        if (!((FlushCriterion)iterator.next()).shouldFlushQueue(mEventQueue.size(), mLastTimeEventAddedInMs)) goto _L6; else goto _L5
_L5:
        return true;
        Log.d(TAG, "No rules to flush queue, go and flush queue");
        return true;
    }




}
