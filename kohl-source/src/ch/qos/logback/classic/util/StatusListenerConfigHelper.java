// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ch.qos.logback.classic.util;

import ch.qos.logback.classic.LoggerContext;
import fs.ch.qos.logback.core.spi.ContextAware;
import fs.ch.qos.logback.core.spi.LifeCycle;
import fs.ch.qos.logback.core.status.StatusListener;
import fs.ch.qos.logback.core.status.StatusManager;
import fs.ch.qos.logback.core.util.OptionHelper;

public class StatusListenerConfigHelper
{

    static void addStatusListener(LoggerContext loggercontext, String s)
    {
        try
        {
            s = (StatusListener)OptionHelper.instantiateByClassName(s, fs/ch/qos/logback/core/status/StatusListener, loggercontext);
            if (s instanceof ContextAware)
            {
                ((ContextAware)s).setContext(loggercontext);
            }
            if (s instanceof LifeCycle)
            {
                ((LifeCycle)s).start();
            }
        }
        // Misplaced declaration of an exception variable
        catch (LoggerContext loggercontext)
        {
            loggercontext.printStackTrace();
            return;
        }
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_58;
        }
        loggercontext.getStatusManager().add(s);
    }

    static void installIfAsked(LoggerContext loggercontext)
    {
        String s = OptionHelper.getSystemProperty("logback.statusListenerClass");
        if (!OptionHelper.isEmpty(s))
        {
            addStatusListener(loggercontext, s);
        }
    }
}
