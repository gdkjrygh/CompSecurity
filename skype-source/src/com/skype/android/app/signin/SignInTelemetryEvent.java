// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.signin;

import com.skype.android.analytics.EcsControllableEvent;
import com.skype.android.analytics.LogAttributeName;
import com.skype.android.analytics.SkypeTelemetryEvent;

public class SignInTelemetryEvent extends SkypeTelemetryEvent
{

    public SignInTelemetryEvent(EcsControllableEvent ecscontrollableevent, SignInConstants.FlowType flowtype, boolean flag)
    {
        super(ecscontrollableevent);
        put(LogAttributeName.w, Boolean.valueOf(flag));
        put(LogAttributeName.v, flowtype);
    }

    public SignInTelemetryEvent(EcsControllableEvent ecscontrollableevent, SignInConstants.FlowType flowtype, boolean flag, SignInConstants.AccountType accounttype, String s)
    {
        this(ecscontrollableevent, flowtype, flag);
        put(LogAttributeName.q, accounttype);
        put(LogAttributeName.x, s);
    }
}
