// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.logging;

import com.netflix.mediaclient.util.EventQueue;
import java.util.List;

// Referenced classes of package com.netflix.mediaclient.service.logging:
//            PresentationTrackingManager

private class this._cls0 extends EventQueue
{

    final PresentationTrackingManager this$0;

    protected void doFlush(List list)
    {
        PresentationTrackingManager.access$100(PresentationTrackingManager.this, list);
    }

    public (int i)
    {
        this$0 = PresentationTrackingManager.this;
        super("nf_pt_queue", i, 0x493e0L, true, true);
    }
}
