// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.inject.internal;

import com.google.inject.Guice;
import com.google.inject.spi.Message;
import java.util.logging.Level;
import java.util.logging.Logger;

// Referenced classes of package com.google.inject.internal:
//            AbstractProcessor, Errors

final class MessageProcessor extends AbstractProcessor
{

    private static final Logger logger = Logger.getLogger(com/google/inject/Guice.getName());

    MessageProcessor(Errors errors)
    {
        super(errors);
    }

    public static String getRootMessage(Throwable throwable)
    {
        Throwable throwable1 = throwable.getCause();
        if (throwable1 == null)
        {
            return throwable.toString();
        } else
        {
            return getRootMessage(throwable1);
        }
    }

    public Boolean visit(Message message)
    {
        if (message.getCause() != null)
        {
            String s = getRootMessage(message.getCause());
            logger.log(Level.INFO, (new StringBuilder()).append("An exception was caught and reported. Message: ").append(s).toString(), message.getCause());
        }
        errors.addMessage(message);
        return Boolean.valueOf(true);
    }

    public volatile Object visit(Message message)
    {
        return visit(message);
    }

}
