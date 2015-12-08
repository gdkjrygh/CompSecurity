// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.auditude.ads.util.log.targets;

import com.auditude.ads.util.log.ILogger;
import com.auditude.ads.util.log.LogLevel;

public interface ILoggingTarget
{

    public abstract ILogger addLogger(ILogger ilogger);

    public abstract LogLevel getLevel();

    public abstract void removeLogger(ILogger ilogger);

    public abstract void setLevel(LogLevel loglevel);
}
