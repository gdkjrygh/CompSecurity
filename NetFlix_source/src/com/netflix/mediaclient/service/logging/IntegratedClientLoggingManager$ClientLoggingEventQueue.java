// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.logging;

import com.netflix.mediaclient.util.EventQueue;
import java.util.List;

// Referenced classes of package com.netflix.mediaclient.service.logging:
//            IntegratedClientLoggingManager

private class this._cls0 extends EventQueue
{

    final IntegratedClientLoggingManager this$0;

    protected void doFlush(List list)
    {
        IntegratedClientLoggingManager.access$200(IntegratedClientLoggingManager.this, list);
    }

    public ()
    {
        this$0 = IntegratedClientLoggingManager.this;
        super("nf_icl_queue", 30, 60000L, true, true);
    }
}
