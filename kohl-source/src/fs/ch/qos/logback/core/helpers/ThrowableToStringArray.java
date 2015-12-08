// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package fs.ch.qos.logback.core.helpers;

import java.util.LinkedList;
import java.util.List;

public class ThrowableToStringArray
{

    public static String[] convert(Throwable throwable)
    {
        LinkedList linkedlist = new LinkedList();
        extract(linkedlist, throwable, null);
        return (String[])linkedlist.toArray(new String[0]);
    }

    private static void extract(List list, Throwable throwable, StackTraceElement astacktraceelement[])
    {
        StackTraceElement astacktraceelement1[] = throwable.getStackTrace();
        int j = findNumberOfCommonFrames(astacktraceelement1, astacktraceelement);
        list.add(formatFirstLine(throwable, astacktraceelement));
        for (int i = 0; i < astacktraceelement1.length - j; i++)
        {
            list.add((new StringBuilder()).append("\tat ").append(astacktraceelement1[i].toString()).toString());
        }

        if (j != 0)
        {
            list.add((new StringBuilder()).append("\t... ").append(j).append(" common frames omitted").toString());
        }
        throwable = throwable.getCause();
        if (throwable != null)
        {
            extract(list, throwable, astacktraceelement1);
        }
    }

    private static int findNumberOfCommonFrames(StackTraceElement astacktraceelement[], StackTraceElement astacktraceelement1[])
    {
        int i;
        int l;
        i = 0;
        l = 0;
        if (astacktraceelement1 != null) goto _L2; else goto _L1
_L1:
        return l;
_L2:
        int j;
        int k;
        k = astacktraceelement.length - 1;
        j = astacktraceelement1.length - 1;
_L6:
        l = i;
        if (k < 0) goto _L1; else goto _L3
_L3:
        l = i;
        if (j < 0) goto _L1; else goto _L4
_L4:
        l = i;
        if (!astacktraceelement[k].equals(astacktraceelement1[j])) goto _L1; else goto _L5
_L5:
        i++;
        k--;
        j--;
          goto _L6
    }

    private static String formatFirstLine(Throwable throwable, StackTraceElement astacktraceelement[])
    {
        String s = "";
        if (astacktraceelement != null)
        {
            s = "Caused by: ";
        }
        s = (new StringBuilder()).append(s).append(throwable.getClass().getName()).toString();
        astacktraceelement = s;
        if (throwable.getMessage() != null)
        {
            astacktraceelement = (new StringBuilder()).append(s).append(": ").append(throwable.getMessage()).toString();
        }
        return astacktraceelement;
    }
}
