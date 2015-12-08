// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package fs.org.slf4j.helpers;

import fs.org.slf4j.ILoggerFactory;
import fs.org.slf4j.Logger;

// Referenced classes of package fs.org.slf4j.helpers:
//            NOPLogger

public class NOPLoggerFactory
    implements ILoggerFactory
{

    public NOPLoggerFactory()
    {
    }

    public Logger getLogger(String s)
    {
        return NOPLogger.NOP_LOGGER;
    }
}
