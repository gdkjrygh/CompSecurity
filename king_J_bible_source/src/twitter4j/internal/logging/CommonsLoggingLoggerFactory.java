// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package twitter4j.internal.logging;

import org.apache.commons.logging.LogFactory;

// Referenced classes of package twitter4j.internal.logging:
//            LoggerFactory, CommonsLoggingLogger, Logger

final class CommonsLoggingLoggerFactory extends LoggerFactory
{

    CommonsLoggingLoggerFactory()
    {
    }

    public Logger getLogger(Class class1)
    {
        return new CommonsLoggingLogger(LogFactory.getLog(class1));
    }
}
