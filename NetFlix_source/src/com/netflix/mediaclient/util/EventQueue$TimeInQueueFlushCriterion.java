// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.util;

import android.os.SystemClock;
import com.netflix.mediaclient.Log;

// Referenced classes of package com.netflix.mediaclient.util:
//            EventQueue

private class <init>
    implements <init>
{

    final EventQueue this$0;

    public boolean shouldFlushQueue(int i, long l)
    {
        long l1 = SystemClock.elapsedRealtime() - l;
        if (l > 0L && l1 > EventQueue.access$500(EventQueue.this))
        {
            if (Log.isLoggable(EventQueue.access$400(EventQueue.this), 3))
            {
                Log.d(EventQueue.access$400(EventQueue.this), (new StringBuilder()).append("Posting events: older event in queue was posted [ms] ").append(l1).append(" and that triggers time of stay in queue criteria of ").append(EventQueue.access$500(EventQueue.this)).toString());
            }
            return true;
        }
        if (Log.isLoggable(EventQueue.access$400(EventQueue.this), 3))
        {
            Log.d(EventQueue.access$400(EventQueue.this), (new StringBuilder()).append("Posting events: older event in queue was posted [ms] ").append(l1).append(" and that does NOT triggers time of stay in queue criteria of ").append(EventQueue.access$500(EventQueue.this)).toString());
        }
        return false;
    }

    private ()
    {
        this$0 = EventQueue.this;
        super();
    }

    this._cls0(this._cls0 _pcls0)
    {
        this();
    }
}
