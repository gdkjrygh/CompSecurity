// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.urbanairship.richpush;

import java.util.List;
import java.util.Set;

// Referenced classes of package com.urbanairship.richpush:
//            RichPushInbox, RichPushManager, RichPushResolver

class val.messageIds
    implements Runnable
{

    final RichPushInbox this$0;
    final Set val$messageIds;

    public void run()
    {
        RichPushManager.resolver.markMessagesDeleted(val$messageIds);
        RichPushInbox.access$000(RichPushInbox.this).removeAll(val$messageIds);
    }

    ()
    {
        this$0 = final_richpushinbox;
        val$messageIds = Set.this;
        super();
    }
}
