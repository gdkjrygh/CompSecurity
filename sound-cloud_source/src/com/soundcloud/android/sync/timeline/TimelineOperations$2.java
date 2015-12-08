// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.sync.timeline;

import rx.b;
import rx.b.f;

// Referenced classes of package com.soundcloud.android.sync.timeline:
//            TimelineOperations

class val.currentTimestamp
    implements f
{

    final TimelineOperations this$0;
    final long val$currentTimestamp;

    public volatile Object call(Object obj)
    {
        return call((Boolean)obj);
    }

    public b call(Boolean boolean1)
    {
        (new StringBuilder("Sync finished; new items? => ")).append(boolean1);
        if (boolean1.booleanValue())
        {
            if (val$currentTimestamp == 0x7fffffffffffffffL)
            {
                return initialTimelineItems(true);
            } else
            {
                return TimelineOperations.access$200(TimelineOperations.this, val$currentTimestamp, true);
            }
        } else
        {
            return b.just(TimelineOperations.access$300(TimelineOperations.this));
        }
    }

    ()
    {
        this$0 = final_timelineoperations;
        val$currentTimestamp = J.this;
        super();
    }
}
