// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.worklight.common.internal;

import com.worklight.common.Logger;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.LogRecord;

public class JULHandler extends Handler
{

    public JULHandler()
    {
    }

    public void close()
        throws SecurityException
    {
    }

    public void flush()
    {
    }

    public void publish(LogRecord logrecord)
    {
        Logger logger = Logger.getInstance(logrecord.getLoggerName());
        if (logrecord.getLevel().equals(Level.SEVERE))
        {
            logger.error(logrecord.getMessage(), logrecord.getThrown());
            return;
        }
        if (logrecord.getLevel().equals(Level.WARNING))
        {
            logger.warn(logrecord.getMessage());
            return;
        }
        if (logrecord.getLevel().equals(Level.INFO))
        {
            logger.info(logrecord.getMessage());
            return;
        }
        if (logrecord.getLevel().equals(Level.CONFIG))
        {
            logger.log(logrecord.getMessage());
            return;
        }
        if (logrecord.getLevel().equals(Level.FINE))
        {
            logger.debug(logrecord.getMessage());
            return;
        } else
        {
            logger.trace(logrecord.getMessage());
            return;
        }
    }
}
