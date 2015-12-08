// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package fs.ch.qos.logback.core.status;

import fs.ch.qos.logback.core.Context;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package fs.ch.qos.logback.core.status:
//            StatusManager, Status

public class StatusUtil
{

    public static boolean contextHasStatusListener(Context context)
    {
        context = context.getStatusManager();
        if (context != null)
        {
            if ((context = context.getCopyOfStatusListenerList()) != null && context.size() != 0)
            {
                return true;
            }
        }
        return false;
    }

    public static List filterStatusListByTimeThreshold(List list, long l)
    {
        ArrayList arraylist = new ArrayList();
        list = list.iterator();
        do
        {
            if (!list.hasNext())
            {
                break;
            }
            Status status = (Status)list.next();
            if (status.getDate().longValue() >= l)
            {
                arraylist.add(status);
            }
        } while (true);
        return arraylist;
    }
}
