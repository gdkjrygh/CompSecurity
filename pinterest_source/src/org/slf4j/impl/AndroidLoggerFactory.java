// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.slf4j.impl;

import android.util.Log;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;
import org.slf4j.ILoggerFactory;
import org.slf4j.Logger;

// Referenced classes of package org.slf4j.impl:
//            AndroidLogger

public class AndroidLoggerFactory
    implements ILoggerFactory
{

    static final int TAG_MAX_LENGTH = 23;
    private final Map loggerMap = new HashMap();

    public AndroidLoggerFactory()
    {
    }

    private final String forceValidName(String s)
    {
        Object obj = s;
        if (s != null)
        {
            obj = s;
            if (s.length() > 23)
            {
                obj = new StringTokenizer(s, ".");
                if (((StringTokenizer) (obj)).hasMoreTokens())
                {
                    s = new StringBuilder();
                    do
                    {
                        String s1 = ((StringTokenizer) (obj)).nextToken();
                        if (s1.length() == 1)
                        {
                            s.append(s1);
                            s.append('.');
                        } else
                        if (((StringTokenizer) (obj)).hasMoreTokens())
                        {
                            s.append(s1.charAt(0));
                            s.append("*.");
                        } else
                        {
                            s.append(s1);
                        }
                    } while (((StringTokenizer) (obj)).hasMoreTokens());
                    s = s.toString();
                }
                obj = s;
                if (s.length() > 23)
                {
                    obj = (new StringBuilder()).append(s.substring(0, 22)).append('*').toString();
                }
            }
        }
        return ((String) (obj));
    }

    public volatile Logger getLogger(String s)
    {
        return getLogger(s);
    }

    public AndroidLogger getLogger(String s)
    {
        String s1 = forceValidName(s);
        this;
        JVM INSTR monitorenter ;
        AndroidLogger androidlogger1 = (AndroidLogger)loggerMap.get(s1);
        AndroidLogger androidlogger;
        androidlogger = androidlogger1;
        if (androidlogger1 != null)
        {
            break MISSING_BLOCK_LABEL_102;
        }
        if (!s1.equals(s))
        {
            Log.i(org/slf4j/impl/AndroidLoggerFactory.getSimpleName(), (new StringBuilder("Logger name '")).append(s).append("' exceeds maximum length of 23 characters, using '").append(s1).append("' instead.").toString());
        }
        androidlogger = new AndroidLogger(s1);
        loggerMap.put(s1, androidlogger);
        this;
        JVM INSTR monitorexit ;
        return androidlogger;
        s;
        this;
        JVM INSTR monitorexit ;
        throw s;
    }
}
