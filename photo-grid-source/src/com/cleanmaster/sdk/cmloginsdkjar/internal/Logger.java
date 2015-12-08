// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cleanmaster.sdk.cmloginsdkjar.internal;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

// Referenced classes of package com.cleanmaster.sdk.cmloginsdkjar.internal:
//            Validate

public class Logger
{

    public static final String LOG_TAG_BASE = "CmLoginSDK.";
    private static final HashMap stringsToReplace = new HashMap();
    private StringBuilder contents;
    private int priority;
    private final String tag;

    public Logger(String s)
    {
        priority = 3;
        Validate.notNullOrEmpty(s, "tag");
        tag = (new StringBuilder("CmLoginSDK.")).append(s).toString();
        contents = new StringBuilder();
    }

    public static void log(int i, String s, String s1)
    {
    }

    public static void log(String s, String s1)
    {
    }

    public static transient void log(String s, String s1, Object aobj[])
    {
    }

    private static String replaceStrings(String s)
    {
        com/cleanmaster/sdk/cmloginsdkjar/internal/Logger;
        JVM INSTR monitorenter ;
        for (Iterator iterator = stringsToReplace.entrySet().iterator(); iterator.hasNext();)
        {
            java.util.Map.Entry entry = (java.util.Map.Entry)iterator.next();
            s = s.replace((CharSequence)entry.getKey(), (CharSequence)entry.getValue());
        }

        com/cleanmaster/sdk/cmloginsdkjar/internal/Logger;
        JVM INSTR monitorexit ;
        return s;
        s;
        throw s;
    }

    private boolean shouldLog()
    {
        return false;
    }

    public void append(String s)
    {
        if (shouldLog())
        {
            contents.append(s);
        }
    }

    public transient void append(String s, Object aobj[])
    {
        if (shouldLog())
        {
            contents.append(String.format(s, aobj));
        }
    }

    public void appendKeyValue(String s, Object obj)
    {
        append("  %s:\t%s\n", new Object[] {
            s, obj
        });
    }

    public void log()
    {
        if (shouldLog())
        {
            logString(contents.toString());
            contents = new StringBuilder();
        }
    }

    public void logString(String s)
    {
        if (shouldLog())
        {
            log(priority, tag, s);
        }
    }

}
