// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.ui.antivirus.list;

import com.qihoo.security.malware.a.b;
import com.qihoo.security.malware.vo.MaliciousInfo;
import com.qihoo.security.opti.trashclear.ui.i;
import com.qihoo360.mobilesafe.b.a;
import java.util.List;

// Referenced classes of package com.qihoo.security.ui.antivirus.list:
//            VirusListActivity, b

class a
    implements a
{

    final VirusListActivity a;

    public void a(i j)
    {
label0:
        {
            VirusListActivity.d(a, false);
            VirusListActivity.c(a, j);
            if (VirusListActivity.q(a) != null && VirusListActivity.r(a))
            {
                VirusListActivity.q(a).c();
                if (VirusListActivity.s(a) < VirusListActivity.n(a).size())
                {
                    VirusListActivity.t(a).a();
                }
            }
            if (VirusListActivity.u(a))
            {
                if (VirusListActivity.s(a) >= VirusListActivity.k(a).size())
                {
                    break label0;
                }
                j = ((MaliciousInfo)((i)VirusListActivity.k(a).get(VirusListActivity.s(a))).c()).packageName;
                com.qihoo360.mobilesafe.b.a.a(a.p, j);
                VirusListActivity.t(a).b();
            }
            return;
        }
        VirusListActivity.c(a, false);
    }

    (VirusListActivity viruslistactivity)
    {
        a = viruslistactivity;
        super();
    }
}
