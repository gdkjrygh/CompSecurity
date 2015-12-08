// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package twitter4j.internal.logging;


// Referenced classes of package twitter4j.internal.logging:
//            LoggerFactory, StdOutLogger, Logger

final class StdOutLoggerFactory extends LoggerFactory
{

    private static final Logger SINGLETON = new StdOutLogger();

    StdOutLoggerFactory()
    {
    }

    public Logger getLogger(Class class1)
    {
        return SINGLETON;
    }

}
