// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.sync.timeline;

import java.util.List;
import rx.b;
import rx.b.f;

// Referenced classes of package com.soundcloud.android.sync.timeline:
//            TimelineOperations

class val.syncCompleted
    implements f
{

    final TimelineOperations this$0;
    final boolean val$syncCompleted;
    final long val$timestamp;

    public volatile Object call(Object obj)
    {
        return call((List)obj);
    }

    public b call(List list)
    {
        if (isEmptyResult(list))
        {
            return TimelineOperations.access$000(TimelineOperations.this, val$timestamp, val$syncCompleted);
        } else
        {
            TimelineOperations.access$100(TimelineOperations.this, list);
            return b.just(list);
        }
    }

    ()
    {
        this$0 = final_timelineoperations;
        val$timestamp = l;
        val$syncCompleted = Z.this;
        super();
    }
}
