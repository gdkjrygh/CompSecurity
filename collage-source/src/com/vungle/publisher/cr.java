// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vungle.publisher;

import com.vungle.publisher.async.ScheduledPriorityExecutor;
import com.vungle.publisher.db.model.Ad;
import com.vungle.publisher.net.http.TrackEventHttpTransactionFactory;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.vungle.publisher:
//            cs

public class cr extends cs
{

    public TrackEventHttpTransactionFactory a;
    public ScheduledPriorityExecutor b;

    public cr()
    {
    }

    static String a(String s, Map map)
    {
        Object obj;
label0:
        {
            obj = s;
            if (map == null)
            {
                break label0;
            }
            obj = new StringBuilder(s);
            map = map.entrySet().iterator();
            do
            {
                if (!map.hasNext())
                {
                    break;
                }
                java.util.Map.Entry entry = (java.util.Map.Entry)map.next();
                String s1 = (String)entry.getKey();
                int i = -1;
                do
                {
                    i = ((StringBuilder) (obj)).indexOf(s1, i);
                    if (i <= 0)
                    {
                        break;
                    }
                    if (entry.getValue() == null)
                    {
                        s = "";
                    } else
                    {
                        s = (String)entry.getValue();
                    }
                    ((StringBuilder) (obj)).replace(i, s1.length() + i, s);
                } while (true);
            } while (true);
            obj = ((StringBuilder) (obj)).toString();
        }
        return ((String) (obj));
    }

    public final transient void a(Ad ad, com.vungle.publisher.db.model.EventTracking.a a1, Map map, String as[])
    {
        if (as != null)
        {
            int j = as.length;
            for (int i = 0; i < j; i++)
            {
                String s = as[i];
                if (s != null)
                {
                    b.a(new _cls1(ad, a1, s, map), com.vungle.publisher.async.ScheduledPriorityExecutor.b.q);
                }
            }

        }
    }

    /* member class not found */
    class _cls1 {}

}
