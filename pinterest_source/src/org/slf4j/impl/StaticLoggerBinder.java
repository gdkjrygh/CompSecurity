// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.slf4j.impl;

import org.slf4j.ILoggerFactory;
import org.slf4j.spi.LoggerFactoryBinder;

// Referenced classes of package org.slf4j.impl:
//            AndroidLoggerFactory

public class StaticLoggerBinder
    implements LoggerFactoryBinder
{

    public static String REQUESTED_API_VERSION = "1.6";
    private static final StaticLoggerBinder SINGLETON = new StaticLoggerBinder();
    private static final String loggerFactoryClassStr = org/slf4j/impl/AndroidLoggerFactory.getName();
    private final ILoggerFactory loggerFactory = new AndroidLoggerFactory();

    private StaticLoggerBinder()
    {
    }

    public static final StaticLoggerBinder getSingleton()
    {
        return SINGLETON;
    }

    public ILoggerFactory getLoggerFactory()
    {
        return loggerFactory;
    }

    public String getLoggerFactoryClassStr()
    {
        return loggerFactoryClassStr;
    }

}
