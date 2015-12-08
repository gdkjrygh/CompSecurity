// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.adobe.mediacore.logging;


// Referenced classes of package com.adobe.mediacore.logging:
//            DefaultLogFactory, LogFactory, Logger

public final class Log
{

    private static LogFactory _logFactory = new DefaultLogFactory();

    public Log()
    {
    }

    public static LogFactory getLogFactory()
    {
        return _logFactory;
    }

    public static Logger getLogger(String s)
    {
        return _logFactory.getLogger(s);
    }

    public static void setLogFactory(LogFactory logfactory)
    {
        _logFactory = logfactory;
    }

}
