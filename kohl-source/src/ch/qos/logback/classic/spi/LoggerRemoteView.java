// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ch.qos.logback.classic.spi;

import ch.qos.logback.classic.LoggerContext;
import java.io.Serializable;

// Referenced classes of package ch.qos.logback.classic.spi:
//            LoggerContextVO

public class LoggerRemoteView
    implements Serializable
{

    static final boolean $assertionsDisabled;
    final LoggerContextVO loggerContextView;
    final String name;

    public LoggerRemoteView(String s, LoggerContext loggercontext)
    {
        name = s;
        if (!$assertionsDisabled && loggercontext.getLoggerContextRemoteView() == null)
        {
            throw new AssertionError();
        } else
        {
            loggerContextView = loggercontext.getLoggerContextRemoteView();
            return;
        }
    }

    static 
    {
        boolean flag;
        if (!ch/qos/logback/classic/spi/LoggerRemoteView.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}
