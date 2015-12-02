// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.service;

import com.qihoo.security.malware.vo.MaliciousInfo;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.qihoo.security.service:
//            PackageMonitorService

class a
    implements com.qihoo.security.malware.a
{

    final PackageMonitorService a;

    public void a(com.qihoo.security.malware.a a1)
    {
    }

    public void a(com.qihoo.security.malware.a a1)
    {
        a1 = (MaliciousInfo)a1.a.get(0);
        if (((MaliciousInfo) (a1)).state == 127)
        {
            PackageMonitorService.a(a, a1);
        }
    }

    public void b(com.qihoo.security.malware.a a1)
    {
        a1 = a1.a.iterator();
        do
        {
            if (!a1.hasNext())
            {
                break;
            }
            MaliciousInfo maliciousinfo = (MaliciousInfo)a1.next();
            if (maliciousinfo != null && maliciousinfo.state == 127)
            {
                PackageMonitorService.a(a, maliciousinfo);
            }
        } while (true);
    }

    (PackageMonitorService packagemonitorservice)
    {
        a = packagemonitorservice;
        super();
    }
}
