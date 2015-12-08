// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fsr.tracker.state;

import fs.org.slf4j.Logger;

// Referenced classes of package com.fsr.tracker.state:
//            TrackingState, ITrackerStateContext, ITrackerState

private class <init>
    implements <init>
{

    final TrackingState this$0;

    public void execute(ITrackerStateContext itrackerstatecontext, ITrackerState itrackerstate)
    {
        logger.warn("Can only perform one eligibility check at a time.");
    }

    private ()
    {
        this$0 = TrackingState.this;
        super();
    }

    this._cls0(this._cls0 _pcls0)
    {
        this();
    }
}
