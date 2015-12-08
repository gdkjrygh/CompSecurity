// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.fordsync.interactions;

import com.dominos.App;
import com.dominos.utils.AnalyticsUtil;

// Referenced classes of package com.dominos.fordsync.interactions:
//            ErrorHandler, HowMayIHelpYou_

public class RestartInteraction extends ErrorHandler
{

    AnalyticsUtil mAnalyticsUtil;

    public RestartInteraction()
    {
    }

    protected void yes()
    {
        mAnalyticsUtil.postFordSyncRestartInteractionError();
        HowMayIHelpYou_.getInstance_(app.getBaseContext()).start();
    }
}
