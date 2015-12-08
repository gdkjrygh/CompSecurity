// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.auditude.ads.util.log.targets;

import android.util.Log;
import com.auditude.ads.util.log.ILogger;
import com.auditude.ads.util.log.LogEvent;
import com.auditude.ads.util.log.LogLevel;
import java.util.Calendar;
import java.util.Date;

// Referenced classes of package com.auditude.ads.util.log.targets:
//            AbstractTarget

public class TraceTarget extends AbstractTarget
{

    public String fieldSeparator;
    public Boolean includeCategory;
    public Boolean includeDate;
    public Boolean includeLevel;
    public Boolean includeTime;

    public TraceTarget(Boolean boolean1, Boolean boolean2, Boolean boolean3, Boolean boolean4)
    {
        fieldSeparator = " ";
        includeTime = boolean1;
        includeDate = boolean2;
        includeCategory = boolean3;
        includeLevel = boolean4;
    }

    private String padTime(int i, Boolean boolean1)
    {
        if (boolean1.booleanValue())
        {
            if (i < 10)
            {
                return (new StringBuilder("00")).append(String.valueOf(i)).toString();
            }
            if (i < 100)
            {
                return (new StringBuilder("0")).append(String.valueOf(i)).toString();
            } else
            {
                return String.valueOf(i);
            }
        }
        if (i > 9)
        {
            return String.valueOf(i);
        } else
        {
            return (new StringBuilder("0")).append(String.valueOf(i)).toString();
        }
    }

    public void logEvent(LogEvent logevent)
    {
        String s;
label0:
        {
            String s1 = "";
            if (!includeDate.booleanValue())
            {
                s = s1;
                if (!includeTime.booleanValue())
                {
                    break label0;
                }
            }
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(new Date());
            if (includeDate.booleanValue())
            {
                s1 = (new StringBuilder(String.valueOf(Integer.toString(calendar.get(2) + 1)))).append("/").append(Integer.toString(calendar.get(5))).append("/").append(Integer.toString(calendar.get(1))).append(fieldSeparator).toString();
            }
            s = s1;
            if (includeTime.booleanValue())
            {
                s = (new StringBuilder(String.valueOf(s1))).append(padTime(calendar.get(11), Boolean.valueOf(false))).append(":").append(padTime(calendar.get(12), Boolean.valueOf(false))).append(":").append(padTime(calendar.get(13), Boolean.valueOf(false))).append(".").append(padTime(calendar.get(14), Boolean.valueOf(true))).append(fieldSeparator).toString();
            }
        }
        String s2 = ((ILogger)logevent.getOwner()).getCategory();
        s = (new StringBuilder(String.valueOf(s))).append(logevent.data).toString();
        int i = logevent.level.getVerbosity();
        if (i == LogLevel.ERROR.getVerbosity())
        {
            Log.e(s2, s);
            return;
        }
        if (i == LogLevel.WARN.getVerbosity())
        {
            Log.w(s2, s);
            return;
        }
        if (i == LogLevel.INFO.getVerbosity())
        {
            Log.i(s2, s);
            return;
        }
        if (i == LogLevel.DEBUG.getVerbosity())
        {
            Log.d(s2, s);
            return;
        }
        if (i == LogLevel.FATAL.getVerbosity())
        {
            Log.e(s2, s);
            return;
        } else
        {
            Log.i(s2, s);
            return;
        }
    }
}
