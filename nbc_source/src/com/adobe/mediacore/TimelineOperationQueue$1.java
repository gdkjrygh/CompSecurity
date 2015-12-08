// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.adobe.mediacore;


// Referenced classes of package com.adobe.mediacore:
//            TimelineOperationQueue, VideoEngineTimeline

class this._cls0
    implements Runnable
{

    final TimelineOperationQueue this$0;

    public void run()
    {
        if (TimelineOperationQueue.access$000(TimelineOperationQueue.this) != null && TimelineOperationQueue.access$100(TimelineOperationQueue.this) != null)
        {
            TimelineOperationQueue.access$000(TimelineOperationQueue.this).execute(TimelineOperationQueue.access$100(TimelineOperationQueue.this));
            return;
        } else
        {
            TimelineOperationQueue.access$102(TimelineOperationQueue.this, null);
            TimelineOperationQueue.access$200(TimelineOperationQueue.this);
            return;
        }
    }

    ()
    {
        this$0 = TimelineOperationQueue.this;
        super();
    }
}
