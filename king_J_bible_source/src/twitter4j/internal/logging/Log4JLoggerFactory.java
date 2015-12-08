// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package twitter4j.internal.logging;

import org.apache.log4j.Logger;

// Referenced classes of package twitter4j.internal.logging:
//            LoggerFactory, Log4JLogger, Logger

final class Log4JLoggerFactory extends LoggerFactory
{

    Log4JLoggerFactory()
    {
    }

    public twitter4j.internal.logging.Logger getLogger(Class class1)
    {
        return new Log4JLogger(Logger.getLogger(class1));
    }
}
