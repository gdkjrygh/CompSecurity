// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.auditude.ads.util.log;

import com.auditude.ads.util.log.targets.ILoggingTarget;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

// Referenced classes of package com.auditude.ads.util.log:
//            LogLevel, ILogger, LogLogger

public class Log
{

    public static final String ALL_LOGGER = "log.all";
    private static int NONE;
    private static HashMap loggers;
    private static int targetLevel;
    private static ArrayList targets;

    public Log()
    {
    }

    public static void addLogger(String s, ILogger ilogger)
    {
        if (ilogger != null)
        {
            if (loggers == null)
            {
                loggers = new HashMap();
            }
            loggers.put(s, ilogger);
            int i = 0;
            while (i < targets.size()) 
            {
                ((ILoggingTarget)targets.get(i)).addLogger(ilogger);
                i++;
            }
        }
    }

    public static void addTarget(ILoggingTarget iloggingtarget)
    {
        if (iloggingtarget == null) goto _L2; else goto _L1
_L1:
        Iterator iterator = loggers.keySet().iterator();
_L9:
        if (iterator.hasNext()) goto _L4; else goto _L3
_L3:
        targets.add(iloggingtarget);
        if (targetLevel != NONE) goto _L6; else goto _L5
_L5:
        targetLevel = iloggingtarget.getLevel().getVerbosity();
_L2:
        return;
_L4:
        String s = (String)iterator.next();
        iloggingtarget.addLogger((ILogger)loggers.get(s));
        continue; /* Loop/switch isn't completed */
_L6:
        if (iloggingtarget.getLevel().getVerbosity() >= targetLevel) goto _L2; else goto _L7
_L7:
        targetLevel = iloggingtarget.getLevel().getVerbosity();
        return;
        if (true) goto _L9; else goto _L8
_L8:
    }

    public static void flush()
    {
        loggers = new HashMap();
        targets = new ArrayList();
        targetLevel = NONE;
    }

    public static ILogger getLogger()
    {
        return getLogger(null);
    }

    public static ILogger getLogger(String s)
    {
        if (loggers == null)
        {
            loggers = new HashMap();
        }
        String s1 = s;
        if (s == null)
        {
            s1 = "log.all";
        }
        ILogger ilogger = (ILogger)loggers.get(s1);
        s = ilogger;
        if (ilogger == null)
        {
            s = new LogLogger(s1);
            addLogger(s1, s);
        }
        return s;
    }

    public static void removeTarget(ILoggingTarget iloggingtarget)
    {
        if (iloggingtarget == null) goto _L2; else goto _L1
_L1:
        Iterator iterator = loggers.keySet().iterator();
_L5:
        if (iterator.hasNext()) goto _L4; else goto _L3
_L3:
        int i = targets.size() - 1;
_L6:
        if (i >= 0)
        {
            break MISSING_BLOCK_LABEL_71;
        }
        resetTargetLevel();
_L2:
        return;
_L4:
        String s = (String)iterator.next();
        iloggingtarget.removeLogger((ILogger)loggers.get(s));
          goto _L5
        if (iloggingtarget == targets.get(i))
        {
            targets.remove(i);
        }
        i--;
          goto _L6
    }

    private static void resetTargetLevel()
    {
        int j = NONE;
        int i = 0;
        do
        {
            int k;
label0:
            {
                if (i >= targets.size())
                {
                    targetLevel = j;
                    return;
                }
                if (j != NONE)
                {
                    k = j;
                    if (((ILoggingTarget)targets.get(i)).getLevel().getVerbosity() >= j)
                    {
                        break label0;
                    }
                }
                k = ((ILoggingTarget)targets.get(i)).getLevel().getVerbosity();
            }
            i++;
            j = k;
        } while (true);
    }

    static 
    {
        NONE = 0x7fffffff;
        targetLevel = NONE;
    }
}
