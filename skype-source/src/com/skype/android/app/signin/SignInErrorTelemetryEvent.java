// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.signin;

import com.microsoft.onlineid.b.a;
import com.microsoft.onlineid.i;
import com.skype.android.analytics.LogAttributeName;
import com.skype.android.analytics.LogEvent;
import com.skype.android.analytics.SkypeTelemetryEvent;

public class SignInErrorTelemetryEvent extends SkypeTelemetryEvent
{

    static final String AUTH_ERROR = "AUTH_ERROR : ";
    static final String EXCEPTION = "EXCEPTION : ";
    static final String UNKNOWN_TICKET_SCOPE = "UNKNOWN_TICKET_SCOPE : ";

    public SignInErrorTelemetryEvent(a a)
    {
        super(LogEvent.p);
        put(LogAttributeName.t, (new StringBuilder("EXCEPTION : ")).append(a.getClass().getSimpleName()).toString());
    }

    public SignInErrorTelemetryEvent(i j)
    {
        super(LogEvent.p);
        put(LogAttributeName.t, (new StringBuilder("UNKNOWN_TICKET_SCOPE : ")).append(j.a().toString()).toString());
    }

    public SignInErrorTelemetryEvent(com.skype.SkyLib.AUTH_RESULT auth_result)
    {
        super(LogEvent.p);
        put(LogAttributeName.t, (new StringBuilder("AUTH_ERROR : ")).append(auth_result.toString()).toString());
    }
}
