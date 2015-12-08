// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package twitter4j.internal.logging;

import java.util.logging.Logger;

// Referenced classes of package twitter4j.internal.logging:
//            LoggerFactory, JULLogger, Logger

final class JULLoggerFactory extends LoggerFactory
{

    JULLoggerFactory()
    {
    }

    public final twitter4j.internal.logging.Logger getLogger(Class class1)
    {
        return new JULLogger(Logger.getLogger(class1.getName()));
    }
}
