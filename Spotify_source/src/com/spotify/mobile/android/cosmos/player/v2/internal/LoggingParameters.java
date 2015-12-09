// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.cosmos.player.v2.internal;

import com.spotify.mobile.android.cosmos.JacksonModel;

public class LoggingParameters
    implements JacksonModel
{

    public long commandInitiatedTime;

    private LoggingParameters()
    {
    }

    public static LoggingParameters createWithCurrentTimestamp()
    {
        LoggingParameters loggingparameters = new LoggingParameters();
        loggingparameters.commandInitiatedTime = System.currentTimeMillis();
        return loggingparameters;
    }

    public static LoggingParameters createWithCustomTimestamp(long l)
    {
        LoggingParameters loggingparameters = new LoggingParameters();
        loggingparameters.commandInitiatedTime = l;
        return loggingparameters;
    }
}
