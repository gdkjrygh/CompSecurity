// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package twitter4j.internal.logging;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import twitter4j.conf.Configuration;
import twitter4j.conf.ConfigurationContext;

// Referenced classes of package twitter4j.internal.logging:
//            StdOutLoggerFactory, LoggerFactory

public abstract class Logger
{

    private static final LoggerFactory LOGGER_FACTORY;
    private static final String LOGGER_FACTORY_IMPLEMENTATION = "twitter4j.loggerFactory";

    public Logger()
    {
    }

    public static Logger getLogger(Class class1)
    {
        return LOGGER_FACTORY.getLogger(class1);
    }

    private static LoggerFactory getLoggerFactoryIfAvailable(String s, String s1)
    {
        Class.forName(s);
        s = (LoggerFactory)Class.forName(s1).newInstance();
        return s;
        s;
        throw new AssertionError(s);
        s;
        throw new AssertionError(s);
        s;
_L2:
        return null;
        s;
        if (true) goto _L2; else goto _L1
_L1:
    }

    public abstract void debug(String s);

    public abstract void debug(String s, String s1);

    public abstract void error(String s);

    public abstract void error(String s, Throwable throwable);

    public abstract void info(String s);

    public abstract void info(String s, String s1);

    public abstract boolean isDebugEnabled();

    public abstract boolean isErrorEnabled();

    public abstract boolean isInfoEnabled();

    public abstract boolean isWarnEnabled();

    public abstract void warn(String s);

    public abstract void warn(String s, String s1);

    static 
    {
        LoggerFactory loggerfactory = null;
        Object obj = System.getProperty("twitter4j.loggerFactory");
        if (obj != null)
        {
            loggerfactory = getLoggerFactoryIfAvailable(((String) (obj)), ((String) (obj)));
        }
        Configuration configuration = ConfigurationContext.getInstance();
        obj = configuration.getLoggerFactory();
        if (obj != null)
        {
            loggerfactory = getLoggerFactoryIfAvailable(((String) (obj)), ((String) (obj)));
        }
        obj = loggerfactory;
        if (loggerfactory == null)
        {
            obj = getLoggerFactoryIfAvailable("org.slf4j.impl.StaticLoggerBinder", "twitter4j.internal.logging.SLF4JLoggerFactory");
        }
        loggerfactory = ((LoggerFactory) (obj));
        if (obj == null)
        {
            loggerfactory = getLoggerFactoryIfAvailable("org.apache.commons.logging.Log", "twitter4j.internal.logging.CommonsLoggingLoggerFactory");
        }
        obj = loggerfactory;
        if (loggerfactory == null)
        {
            obj = getLoggerFactoryIfAvailable("org.apache.log4j.Logger", "twitter4j.internal.logging.Log4JLoggerFactory");
        }
        loggerfactory = ((LoggerFactory) (obj));
        if (obj == null)
        {
            loggerfactory = getLoggerFactoryIfAvailable("com.google.appengine.api.urlfetch.URLFetchService", "twitter4j.internal.logging.JULLoggerFactory");
        }
        obj = loggerfactory;
        if (loggerfactory == null)
        {
            obj = new StdOutLoggerFactory();
        }
        LOGGER_FACTORY = ((LoggerFactory) (obj));
        try
        {
            Method method = configuration.getClass().getMethod("dumpConfiguration", new Class[0]);
            method.setAccessible(true);
            method.invoke(configuration, new Object[0]);
        }
        catch (IllegalAccessException illegalaccessexception) { }
        catch (InvocationTargetException invocationtargetexception) { }
        catch (NoSuchMethodException nosuchmethodexception) { }
    }
}
