// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.slf4j.helpers;

import java.util.ArrayList;
import java.util.List;
import org.slf4j.ILoggerFactory;
import org.slf4j.Logger;

// Referenced classes of package org.slf4j.helpers:
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
