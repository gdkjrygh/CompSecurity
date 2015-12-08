// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.signin;

import com.skype.android.analytics.LogAttributeName;
import com.skype.android.analytics.LogEvent;

// Referenced classes of package com.skype.android.app.signin:
//            PromptManualSignInTelemetryEvent

public class PromptManualSignInFromAgentTelemetryEvent extends PromptManualSignInTelemetryEvent
{

    public PromptManualSignInFromAgentTelemetryEvent(com.skype.Account.LOGOUTREASON logoutreason, boolean flag)
    {
        super(LogEvent.v, logoutreason);
        put(LogAttributeName.A, Boolean.valueOf(flag));
    }
}
