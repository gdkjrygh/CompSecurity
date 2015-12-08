// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.chromium.ui;

import org.chromium.base.TraceEvent;

// Referenced classes of package org.chromium.ui:
//            VSyncMonitor

class this._cls0
    implements Runnable
{

    final VSyncMonitor this$0;

    public void run()
    {
        TraceEvent.begin("VSyncTimer");
        long l = VSyncMonitor.access$100(VSyncMonitor.this);
        VSyncMonitor.access$200(VSyncMonitor.this, l, l);
        TraceEvent.end("VSyncTimer");
    }

    ()
    {
        this$0 = VSyncMonitor.this;
        super();
    }
}
