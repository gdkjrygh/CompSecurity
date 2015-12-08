// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.urbanairship.richpush;

import java.util.Set;

// Referenced classes of package com.urbanairship.richpush:
//            RichPushInbox, RichPushResolver

class val.messageIds
    implements Runnable
{

    final RichPushInbox this$0;
    final Set val$messageIds;

    public void run()
    {
        RichPushInbox.access$000(RichPushInbox.this).markMessagesUnread(val$messageIds);
    }

    ()
    {
        this$0 = final_richpushinbox;
        val$messageIds = Set.this;
        super();
    }
}
