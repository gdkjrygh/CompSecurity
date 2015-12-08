// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.adobe.mobile;

import java.util.HashMap;

// Referenced classes of package com.adobe.mobile:
//            AnalyticsTrackTimedAction, AnalyticsTrackAction

class val.contextData
    implements Runnable
{

    final AnalyticsTrackTimedAction this$0;
    final HashMap val$contextData;
    final String val$timedActionName;

    public void run()
    {
        AnalyticsTrackAction.trackAction(val$timedActionName, val$contextData);
    }

    ()
    {
        this$0 = final_analyticstracktimedaction;
        val$timedActionName = s;
        val$contextData = HashMap.this;
        super();
    }
}
