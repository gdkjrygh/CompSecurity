// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package fs.org.slf4j.helpers;

import fs.org.slf4j.ILoggerFactory;
import fs.org.slf4j.Logger;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package fs.org.slf4j.helpers:
//            NOPLogger

public class SubstituteLoggerFactory
    implements ILoggerFactory
{

    final List loggerNameList = new ArrayList();

    public SubstituteLoggerFactory()
    {
    }

    public Logger getLogger(String s)
    {
        synchronized (loggerNameList)
        {
            loggerNameList.add(s);
        }
        return NOPLogger.NOP_LOGGER;
        s;
        list;
        JVM INSTR monitorexit ;
        throw s;
    }

    public List getLoggerNameList()
    {
        ArrayList arraylist = new ArrayList();
        synchronized (loggerNameList)
        {
            arraylist.addAll(loggerNameList);
        }
        return arraylist;
        exception;
        list;
        JVM INSTR monitorexit ;
        throw exception;
    }
}
