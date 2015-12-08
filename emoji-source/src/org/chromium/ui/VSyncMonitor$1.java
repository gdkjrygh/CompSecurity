// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.chromium.ui;

import org.chromium.base.TraceEvent;

// Referenced classes of package org.chromium.ui:
//            VSyncMonitor

class this._cls0
    implements android.view.rameCallback
{

    final VSyncMonitor this$0;

    public void doFrame(long l)
    {
        TraceEvent.begin("VSync");
        VSyncMonitor.access$002(VSyncMonitor.this, l);
        VSyncMonitor.access$200(VSyncMonitor.this, l, VSyncMonitor.access$100(VSyncMonitor.this));
        TraceEvent.end("VSync");
    }

    eCallback()
    {
        this$0 = VSyncMonitor.this;
        super();
    }
}
