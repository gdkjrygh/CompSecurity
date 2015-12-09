// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package twitter4j;

import org.slf4j.LoggerFactory;

// Referenced classes of package twitter4j:
//            LoggerFactory, SLF4JLogger, Logger

final class SLF4JLoggerFactory extends twitter4j.LoggerFactory
{

    SLF4JLoggerFactory()
    {
    }

    public Logger getLogger(Class class1)
    {
        return new SLF4JLogger(LoggerFactory.getLogger(class1));
    }
}
