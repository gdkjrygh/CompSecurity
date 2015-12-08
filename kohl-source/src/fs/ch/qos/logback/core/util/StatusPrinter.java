// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package fs.ch.qos.logback.core.util;

import fs.ch.qos.logback.core.Context;
import fs.ch.qos.logback.core.CoreConstants;
import fs.ch.qos.logback.core.helpers.ThrowableToStringArray;
import fs.ch.qos.logback.core.status.Status;
import fs.ch.qos.logback.core.status.StatusChecker;
import fs.ch.qos.logback.core.status.StatusManager;
import fs.ch.qos.logback.core.status.StatusUtil;
import java.io.PrintStream;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package fs.ch.qos.logback.core.util:
//            CachingDateFormatter

public class StatusPrinter
{

    static CachingDateFormatter cachingDateFormat = new CachingDateFormatter("HH:mm:ss,SSS");
    private static PrintStream ps;

    private static void appendThrowable(StringBuilder stringbuilder, Throwable throwable)
    {
        throwable = ThrowableToStringArray.convert(throwable);
        int j = throwable.length;
        int i = 0;
        while (i < j) 
        {
            String s = throwable[i];
            if (!s.startsWith("Caused by: "))
            {
                if (Character.isDigit(s.charAt(0)))
                {
                    stringbuilder.append("\t... ");
                } else
                {
                    stringbuilder.append("\tat ");
                }
            }
            stringbuilder.append(s).append(CoreConstants.LINE_SEPARATOR);
            i++;
        }
    }

    public static void buildStr(StringBuilder stringbuilder, String s, Status status)
    {
        Object obj;
        if (status.hasChildren())
        {
            obj = (new StringBuilder()).append(s).append("+ ").toString();
        } else
        {
            obj = (new StringBuilder()).append(s).append("|-").toString();
        }
        if (cachingDateFormat != null)
        {
            stringbuilder.append(cachingDateFormat.format(status.getDate().longValue())).append(" ");
        }
        stringbuilder.append(((String) (obj))).append(status).append(CoreConstants.LINE_SEPARATOR);
        if (status.getThrowable() != null)
        {
            appendThrowable(stringbuilder, status.getThrowable());
        }
        if (status.hasChildren())
        {
            for (status = status.iterator(); status.hasNext(); buildStr(stringbuilder, (new StringBuilder()).append(s).append("  ").toString(), ((Status) (obj))))
            {
                obj = (Status)status.next();
            }

        }
    }

    private static void buildStrFromStatusList(StringBuilder stringbuilder, List list)
    {
        if (list != null)
        {
            list = list.iterator();
            while (list.hasNext()) 
            {
                buildStr(stringbuilder, "", (Status)list.next());
            }
        }
    }

    public static void print(StatusManager statusmanager, long l)
    {
        StringBuilder stringbuilder = new StringBuilder();
        buildStrFromStatusList(stringbuilder, StatusUtil.filterStatusListByTimeThreshold(statusmanager.getCopyOfStatusList(), l));
        ps.println(stringbuilder.toString());
    }

    public static void printInCaseOfErrorsOrWarnings(Context context)
    {
        printInCaseOfErrorsOrWarnings(context, 0L);
    }

    public static void printInCaseOfErrorsOrWarnings(Context context, long l)
    {
        if (context == null)
        {
            throw new IllegalArgumentException("Context argument cannot be null");
        }
        StatusManager statusmanager = context.getStatusManager();
        if (statusmanager == null)
        {
            ps.println((new StringBuilder()).append("WARN: Context named \"").append(context.getName()).append("\" has no status manager").toString());
        } else
        if ((new StatusChecker(context)).getHighestLevel(l) >= 1)
        {
            print(statusmanager, l);
            return;
        }
    }

    static 
    {
        ps = System.out;
    }
}
