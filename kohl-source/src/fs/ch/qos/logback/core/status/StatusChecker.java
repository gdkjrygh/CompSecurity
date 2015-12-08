// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package fs.ch.qos.logback.core.status;

import fs.ch.qos.logback.core.Context;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Referenced classes of package fs.ch.qos.logback.core.status:
//            StatusManager, StatusUtil, Status

public class StatusChecker
{

    StatusManager sm;

    public StatusChecker(Context context)
    {
        sm = context.getStatusManager();
    }

    public boolean containsMatch(long l, int i, String s)
    {
        Object obj = StatusUtil.filterStatusListByTimeThreshold(sm.getCopyOfStatusList(), l);
        s = Pattern.compile(s);
        for (obj = ((List) (obj)).iterator(); ((Iterator) (obj)).hasNext();)
        {
            Status status = (Status)((Iterator) (obj)).next();
            if (i == status.getLevel() && s.matcher(status.getMessage()).lookingAt())
            {
                return true;
            }
        }

        return false;
    }

    public int getHighestLevel(long l)
    {
        Iterator iterator = StatusUtil.filterStatusListByTimeThreshold(sm.getCopyOfStatusList(), l).iterator();
        int i = 0;
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            Status status = (Status)iterator.next();
            if (status.getLevel() > i)
            {
                i = status.getLevel();
            }
        } while (true);
        return i;
    }

    public boolean hasXMLParsingErrors(long l)
    {
        return containsMatch(l, 2, "XML_PARSING");
    }

    public boolean noXMLParsingErrorsOccurred(long l)
    {
        return !hasXMLParsingErrors(l);
    }
}
