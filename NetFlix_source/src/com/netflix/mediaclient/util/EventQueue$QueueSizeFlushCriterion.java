// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.util;

import com.netflix.mediaclient.Log;
import java.util.List;

// Referenced classes of package com.netflix.mediaclient.util:
//            EventQueue

private class <init>
    implements <init>
{

    final EventQueue this$0;

    public boolean shouldFlushQueue(int i, long l)
    {
        if (EventQueue.access$200(EventQueue.this).size() >= EventQueue.access$300(EventQueue.this))
        {
            if (Log.isLoggable(EventQueue.access$400(EventQueue.this), 3))
            {
                Log.d(EventQueue.access$400(EventQueue.this), (new StringBuilder()).append("Posting events: Current number of events in outgoing queue is ").append(EventQueue.access$200(EventQueue.this).size()).append(" and it is equal or higher than treshold of ").append(EventQueue.access$300(EventQueue.this)).toString());
            }
            return true;
        }
        if (Log.isLoggable(EventQueue.access$400(EventQueue.this), 3))
        {
            Log.d(EventQueue.access$400(EventQueue.this), (new StringBuilder()).append("Current number of events in outgoing queue is ").append(EventQueue.access$200(EventQueue.this).size()).append(" and it is less than treshold of ").append(EventQueue.access$300(EventQueue.this)).toString());
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
