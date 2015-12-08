// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package fs.org.slf4j.impl;

import ch.qos.logback.classic.LoggerContext;
import ch.qos.logback.classic.selector.ContextSelector;
import ch.qos.logback.classic.util.ContextInitializer;
import ch.qos.logback.classic.util.ContextSelectorStaticBinder;
import fs.ch.qos.logback.core.joran.spi.JoranException;
import fs.ch.qos.logback.core.status.StatusUtil;
import fs.ch.qos.logback.core.util.StatusPrinter;
import fs.org.slf4j.ILoggerFactory;
import fs.org.slf4j.helpers.Util;

public class StaticLoggerBinder
{

    private static Object KEY = new Object();
    public static String REQUESTED_API_VERSION = "1.6";
    private static StaticLoggerBinder SINGLETON;
    private final ContextSelectorStaticBinder contextSelectorBinder = ContextSelectorStaticBinder.getSingleton();
    private LoggerContext defaultLoggerContext;
    private boolean initialized;

    private StaticLoggerBinder()
    {
        initialized = false;
        defaultLoggerContext = new LoggerContext();
        defaultLoggerContext.setName("default");
    }

    public static StaticLoggerBinder getSingleton()
    {
        return SINGLETON;
    }

    public ILoggerFactory getLoggerFactory()
    {
        if (!initialized)
        {
            return defaultLoggerContext;
        }
        if (contextSelectorBinder.getContextSelector() == null)
        {
            throw new IllegalStateException("contextSelector cannot be null. See also http://logback.qos.ch/codes.html#null_CS");
        } else
        {
            return contextSelectorBinder.getContextSelector().getLoggerContext();
        }
    }

    void init()
    {
        try
        {
            (new ContextInitializer(defaultLoggerContext)).autoConfig();
        }
        catch (JoranException joranexception)
        {
            try
            {
                Util.report("Failed to auto configure default logger context", joranexception);
            }
            catch (Throwable throwable)
            {
                Util.report((new StringBuilder()).append("Failed to instantiate [").append(ch/qos/logback/classic/LoggerContext.getName()).append("]").toString(), throwable);
                return;
            }
        }
        if (!StatusUtil.contextHasStatusListener(defaultLoggerContext))
        {
            StatusPrinter.printInCaseOfErrorsOrWarnings(defaultLoggerContext);
        }
        contextSelectorBinder.init(defaultLoggerContext, KEY);
        initialized = true;
        return;
    }

    static 
    {
        SINGLETON = new StaticLoggerBinder();
        SINGLETON.init();
    }
}
