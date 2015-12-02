// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.utils.notice;

import com.qihoo360.mobilesafe.b.s;
import com.qihoo360.mobilesafe.service.ProcessInfo;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

// Referenced classes of package com.qihoo.utils.notice:
//            b

class a
    implements com.qihoo.security.app.a
{

    final b a;

    public void a(int i, int j)
    {
    }

    public void a(List list, Map map)
    {
label0:
        {
            b.a(a).set(false);
            b.b(a);
            if (list != null && list.size() > 0)
            {
                b.a(a, 0L);
                map = new ArrayList();
                list = list.iterator();
                do
                {
                    if (!list.hasNext())
                    {
                        break;
                    }
                    ProcessInfo processinfo = (ProcessInfo)list.next();
                    if (processinfo.flag == 0)
                    {
                        map.add(processinfo);
                        b.b(a, processinfo.useMemory);
                    }
                } while (true);
                b.a(a, map.size());
                Collections.sort(map, b.c(a));
                list = (ProcessInfo)map.get(0);
                long l = ((ProcessInfo) (list)).useMemory;
                if ("com.qihoo.security.lite".equals(((ProcessInfo) (list)).packageName) || l / 25L <= s.c() / 100L)
                {
                    break label0;
                }
                b.a(a, ((ProcessInfo) (list)).packageName);
            }
            return;
        }
        b.a(a, "");
    }

    (b b1)
    {
        a = b1;
        super();
    }
}
