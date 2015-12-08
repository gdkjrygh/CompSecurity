// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.urbanairship.richpush;

import java.util.concurrent.atomic.AtomicInteger;

// Referenced classes of package com.urbanairship.richpush:
//            RichPushManager

class dateResultReceiver extends dateResultReceiver
{

    final RichPushManager this$0;
    final freshMessagesCallback val$callback;
    final int val$requestNumber;

    public void onUpdate(boolean flag)
    {
        if (RichPushManager.access$000(RichPushManager.this).compareAndSet(val$requestNumber, 0))
        {
            RichPushManager.access$100(RichPushManager.this, flag);
        }
        if (val$callback != null)
        {
            val$callback.onRefreshMessages(flag);
        }
    }

    freshMessagesCallback()
    {
        this$0 = final_richpushmanager;
        val$requestNumber = i;
        val$callback = freshMessagesCallback.this;
        super();
    }
}
