// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.googlecode.mp4parser.util;

import java.util.logging.Level;
import java.util.logging.Logger;

// Referenced classes of package com.googlecode.mp4parser.util:
//            Logger

public class JuliLogger extends com.googlecode.mp4parser.util.Logger
{

    Logger logger;

    public JuliLogger(String s)
    {
        logger = Logger.getLogger(s);
    }

    public void logDebug(String s)
    {
        logger.log(Level.FINE, s);
    }

    public void logError(String s)
    {
        logger.log(Level.SEVERE, s);
    }

    public void logWarn(String s)
    {
        logger.log(Level.WARNING, s);
    }
}
