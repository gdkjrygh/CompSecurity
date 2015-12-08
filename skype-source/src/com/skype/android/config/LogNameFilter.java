// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.config;

import java.util.Iterator;
import java.util.List;
import java.util.logging.Filter;
import java.util.logging.Level;
import java.util.logging.LogRecord;

public class LogNameFilter
    implements Filter
{

    private Level level;
    private List names;

    public LogNameFilter(List list)
    {
        this(list, Level.FINE);
    }

    public LogNameFilter(List list, Level level1)
    {
        names = list;
        level = level1;
    }

    public boolean isLoggable(LogRecord logrecord)
    {
label0:
        {
            Level level1 = level;
            Object obj = level1;
            if (level1 == null)
            {
                obj = Level.ALL;
            }
            if (logrecord.getLevel().intValue() < ((Level) (obj)).intValue())
            {
                break label0;
            }
            logrecord = logrecord.getLoggerName();
            obj = names.iterator();
            do
            {
                if (!((Iterator) (obj)).hasNext())
                {
                    break label0;
                }
            } while (!logrecord.contains((String)((Iterator) (obj)).next()));
            return true;
        }
        return false;
    }
}
