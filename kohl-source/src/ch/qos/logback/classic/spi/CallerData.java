// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ch.qos.logback.classic.spi;

import fs.ch.qos.logback.core.CoreConstants;
import java.util.Iterator;
import java.util.List;

public class CallerData
{

    public static final String CALLER_DATA_NA;
    public static final StackTraceElement EMPTY_CALLER_DATA_ARRAY[] = new StackTraceElement[0];

    public static StackTraceElement[] extract(Throwable throwable, String s, int i, List list)
    {
        boolean flag = false;
        if (throwable != null) goto _L2; else goto _L1
_L1:
        throwable = null;
_L10:
        return throwable;
_L2:
        StackTraceElement astacktraceelement[];
        int j;
        int k;
        astacktraceelement = throwable.getStackTrace();
        k = 0;
        j = -1;
_L7:
        if (k >= astacktraceelement.length) goto _L4; else goto _L3
_L3:
        if (!isInFrameworkSpace(astacktraceelement[k].getClassName(), s, list)) goto _L6; else goto _L5
_L5:
        int i1 = k + 1;
_L8:
        k++;
        j = i1;
          goto _L7
_L6:
        i1 = j;
        if (j == -1) goto _L8; else goto _L4
_L4:
        if (j == -1)
        {
            return EMPTY_CALLER_DATA_ARRAY;
        }
        int l = astacktraceelement.length - j;
        if (i >= l)
        {
            i = l;
        }
        s = new StackTraceElement[i];
        l = ((flag) ? 1 : 0);
        throwable = s;
        if (l < i)
        {
            s[l] = astacktraceelement[j + l];
            l++;
            break MISSING_BLOCK_LABEL_109;
        }
        continue; /* Loop/switch isn't completed */
        if (true) goto _L10; else goto _L9
_L9:
    }

    static boolean isInFrameworkSpace(String s, String s1, List list)
    {
        return s.equals(s1) || s.equals("org.apache.log4j.Category") || s.startsWith("fs.org.slf4j.Logger") || isInFrameworkSpaceList(s, list);
    }

    private static boolean isInFrameworkSpaceList(String s, List list)
    {
        if (list == null)
        {
            return false;
        }
        for (list = list.iterator(); list.hasNext();)
        {
            if (s.startsWith((String)list.next()))
            {
                return true;
            }
        }

        return false;
    }

    static 
    {
        CALLER_DATA_NA = (new StringBuilder()).append("?#?:?").append(CoreConstants.LINE_SEPARATOR).toString();
    }
}
