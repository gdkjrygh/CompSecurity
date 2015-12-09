// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.log4j;

import java.net.MalformedURLException;
import java.net.URL;
import org.apache.log4j.helpers.Loader;
import org.apache.log4j.helpers.LogLog;
import org.apache.log4j.helpers.OptionConverter;
import org.apache.log4j.spi.DefaultRepositorySelector;
import org.apache.log4j.spi.LoggerRepository;
import org.apache.log4j.spi.NOPLoggerRepository;
import org.apache.log4j.spi.RepositorySelector;
import org.apache.log4j.spi.RootLogger;

// Referenced classes of package org.apache.log4j:
//            Hierarchy, Level, Logger

public final class LogManager
{

    private static Object guard;
    private static RepositorySelector repositorySelector;

    public static Logger getLogger(String s)
    {
        return getLoggerRepository().getLogger(s);
    }

    private static LoggerRepository getLoggerRepository()
    {
        if (repositorySelector == null)
        {
            repositorySelector = new DefaultRepositorySelector(new NOPLoggerRepository());
            guard = null;
            LogLog.error("LogMananger.repositorySelector was null likely due to error in class reloading, using NOPLoggerRepository.");
        }
        return repositorySelector.getLoggerRepository();
    }

    static 
    {
        String s;
        guard = null;
        repositorySelector = new DefaultRepositorySelector(new Hierarchy(new RootLogger(Level.DEBUG)));
        Object obj = OptionConverter.getSystemProperty("log4j.defaultInitOverride", null);
        if (obj != null && !"false".equalsIgnoreCase(((String) (obj))))
        {
            break MISSING_BLOCK_LABEL_123;
        }
        s = OptionConverter.getSystemProperty("log4j.configuration", null);
        String s1 = OptionConverter.getSystemProperty("log4j.configuratorClass", null);
        if (s == null)
        {
            URL url = Loader.getResource("log4j.xml");
            obj = url;
            if (url == null)
            {
                obj = Loader.getResource("log4j.properties");
            }
        } else
        {
            try
            {
                obj = new URL(s);
            }
            catch (MalformedURLException malformedurlexception)
            {
                malformedurlexception = Loader.getResource(s);
            }
        }
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_153;
        }
        LogLog.debug("Using URL [" + obj + "] for automatic log4j configuration.");
        OptionConverter.selectAndConfigure(((URL) (obj)), s1, getLoggerRepository());
        return;
        NoClassDefFoundError noclassdeffounderror;
        noclassdeffounderror;
        LogLog.warn("Error during default initialization", noclassdeffounderror);
        break MISSING_BLOCK_LABEL_177;
        LogLog.debug("Could not find resource: [" + s + "].");
    }
}
