// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.adjust.sdk;


// Referenced classes of package com.adjust.sdk:
//            LogLevel

public interface ILogger
{

    public transient abstract void Assert(String s, Object aobj[]);

    public transient abstract void debug(String s, Object aobj[]);

    public transient abstract void error(String s, Object aobj[]);

    public transient abstract void info(String s, Object aobj[]);

    public abstract void setLogLevel(LogLevel loglevel);

    public abstract void setLogLevelString(String s);

    public transient abstract void verbose(String s, Object aobj[]);

    public transient abstract void warn(String s, Object aobj[]);
}
