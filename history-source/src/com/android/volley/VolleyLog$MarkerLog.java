// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.volley;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.android.volley:
//            VolleyLog

static class mFinished
{
    private static class Marker
    {

        public final String name;
        public final long thread;
        public final long time;

        public Marker(String s, long l, long l1)
        {
            name = s;
            thread = l;
            time = l1;
        }
    }


    public static final boolean ENABLED;
    private static final long MIN_DURATION_FOR_LOGGING_MS = 0L;
    private boolean mFinished;
    private final List mMarkers = new ArrayList();

    private long getTotalDuration()
    {
        if (mMarkers.size() == 0)
        {
            return 0L;
        } else
        {
            long l = ((Marker)mMarkers.get(0)).time;
            return ((Marker)mMarkers.get(mMarkers.size() - 1)).time - l;
        }
    }

    public void add(String s, long l)
    {
        this;
        JVM INSTR monitorenter ;
        if (mFinished)
        {
            throw new IllegalStateException("Marker added to finished log");
        }
        break MISSING_BLOCK_LABEL_24;
        s;
        this;
        JVM INSTR monitorexit ;
        throw s;
        mMarkers.add(new Marker(s, l, SystemClock.elapsedRealtime()));
        this;
        JVM INSTR monitorexit ;
    }

    protected void finalize()
        throws Throwable
    {
        if (!mFinished)
        {
            finish("Request on the loose");
            VolleyLog.e("Marker log finalized without finish() - uncaught exit point for request", new Object[0]);
        }
    }

    public void finish(String s)
    {
        this;
        JVM INSTR monitorenter ;
        long l1;
        mFinished = true;
        l1 = getTotalDuration();
        if (l1 > 0L) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        long l;
        l = ((Marker)mMarkers.get(0)).time;
        VolleyLog.d("(%-4d ms) %s", new Object[] {
            Long.valueOf(l1), s
        });
        s = mMarkers.iterator();
_L4:
        if (!s.hasNext())
        {
            break; /* Loop/switch isn't completed */
        }
        Marker marker = (Marker)s.next();
        l1 = marker.time;
        VolleyLog.d("(+%-4d) [%2d] %s", new Object[] {
            Long.valueOf(l1 - l), Long.valueOf(marker.thread), marker.name
        });
        l = l1;
        if (true) goto _L4; else goto _L3
_L3:
        if (true) goto _L1; else goto _L5
_L5:
        s;
        throw s;
    }

    static 
    {
        ENABLED = VolleyLog.DEBUG;
    }

    Marker.time()
    {
        mFinished = false;
    }
}
