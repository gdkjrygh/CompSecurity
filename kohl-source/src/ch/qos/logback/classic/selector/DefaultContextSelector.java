// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ch.qos.logback.classic.selector;

import ch.qos.logback.classic.LoggerContext;

// Referenced classes of package ch.qos.logback.classic.selector:
//            ContextSelector

public class DefaultContextSelector
    implements ContextSelector
{

    private LoggerContext defaultLoggerContext;

    public DefaultContextSelector(LoggerContext loggercontext)
    {
        defaultLoggerContext = loggercontext;
    }

    public LoggerContext getDefaultLoggerContext()
    {
        return defaultLoggerContext;
    }

    public LoggerContext getLoggerContext()
    {
        return getDefaultLoggerContext();
    }
}
