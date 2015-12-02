// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.ui.antivirus;

import com.qihoo.security.malware.db.a;
import com.qihoo.security.malware.vo.MaliciousInfo;
import com.qihoo.security.support.b;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.qihoo.security.ui.antivirus:
//            VirusScanFragmentV3

class a
    implements Runnable
{

    final VirusScanFragmentV3 a;

    public void run()
    {
        Object obj = com.qihoo.security.malware.db.a.a(VirusScanFragmentV3.h(a));
        if (obj != null && ((List) (obj)).size() > 0)
        {
            System.currentTimeMillis();
            obj = ((List) (obj)).iterator();
            do
            {
                if (!((Iterator) (obj)).hasNext())
                {
                    break;
                }
                MaliciousInfo maliciousinfo = (MaliciousInfo)((Iterator) (obj)).next();
                long l = maliciousinfo.getDangerousPermissionList(VirusScanFragmentV3.h(a));
                if (l != 0L)
                {
                    b.a(14318, maliciousinfo.getMfsha1HexString(), (new StringBuilder()).append(maliciousinfo.packageName).append("|").append(maliciousinfo.getVersionCode(VirusScanFragmentV3.h(a))).append("|").append(maliciousinfo.getSignHash(VirusScanFragmentV3.h(a))).append("|").append(l).toString());
                }
            } while (true);
        }
    }

    (VirusScanFragmentV3 virusscanfragmentv3)
    {
        a = virusscanfragmentv3;
        super();
    }
}
