// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.urbanairship.richpush;

import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.urbanairship.richpush:
//            RichPushInbox

class this._cls0
    implements Runnable
{

    final RichPushInbox this$0;

    public void run()
    {
        List list = RichPushInbox.access$200(RichPushInbox.this);
        list;
        JVM INSTR monitorenter ;
        for (Iterator iterator = RichPushInbox.access$200(RichPushInbox.this).iterator(); iterator.hasNext(); ((stener)iterator.next()).onUpdateInbox()) { }
        break MISSING_BLOCK_LABEL_54;
        Exception exception;
        exception;
        list;
        JVM INSTR monitorexit ;
        throw exception;
        list;
        JVM INSTR monitorexit ;
    }

    stener()
    {
        this$0 = RichPushInbox.this;
        super();
    }
}
