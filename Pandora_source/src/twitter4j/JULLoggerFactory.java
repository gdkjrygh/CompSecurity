// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package twitter4j;

import java.util.logging.Logger;

// Referenced classes of package twitter4j:
//            LoggerFactory, JULLogger, Logger

final class JULLoggerFactory extends LoggerFactory
{

    JULLoggerFactory()
    {
    }

    public twitter4j.Logger getLogger(Class class1)
    {
        return new JULLogger(Logger.getLogger(class1.getName()));
    }
}
