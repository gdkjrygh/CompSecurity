// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.signin;

import com.skype.android.analytics.EcsControllableEvent;
import com.skype.android.analytics.LogAttributeName;
import com.skype.android.analytics.LogEvent;
import com.skype.android.analytics.SkypeTelemetryEvent;

public class PromptManualSignInTelemetryEvent extends SkypeTelemetryEvent
{

    private static final String NO_LOGOUT_REASON = "None";

    protected PromptManualSignInTelemetryEvent(EcsControllableEvent ecscontrollableevent, com.skype.Account.LOGOUTREASON logoutreason)
    {
        super(ecscontrollableevent);
        LogAttributeName logattributename = LogAttributeName.z;
        ecscontrollableevent = logoutreason;
        if (logoutreason == null)
        {
            ecscontrollableevent = "None";
        }
        put(logattributename, ecscontrollableevent);
    }

    public PromptManualSignInTelemetryEvent(String s, com.skype.Account.LOGOUTREASON logoutreason)
    {
        this(((EcsControllableEvent) (LogEvent.t)), logoutreason);
        put(LogAttributeName.s, s);
    }
}
