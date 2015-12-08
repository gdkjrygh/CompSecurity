// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.bind.logging;

import java.util.HashMap;
import java.util.Map;

// Referenced classes of package com.google.android.libraries.bind.logging:
//            SystemLogHandler, LogHandler

public final class Logd
{

    protected static Map existingClassLoggers = new HashMap();
    protected static LogHandler sysLogHandler = new SystemLogHandler();
    protected String tag;

    private Logd(String s)
    {
        tag = s;
    }

    public static Logd get(Class class1)
    {
        class1 = class1.getSimpleName();
        if (existingClassLoggers.containsKey(class1))
        {
            return (Logd)existingClassLoggers.get(class1);
        } else
        {
            Logd logd = new Logd(class1);
            existingClassLoggers.put(class1, logd);
            return logd;
        }
    }

    public final transient void e(String s, Object aobj[])
    {
        LogHandler loghandler = sysLogHandler;
        String s1 = tag;
        if (s != null && aobj != null && aobj.length != 0)
        {
            s = String.format(s, aobj);
        }
        aobj = s;
        if (s == null)
        {
            aobj = "";
        }
        loghandler.log(6, s1, ((String) (aobj)));
    }

}
