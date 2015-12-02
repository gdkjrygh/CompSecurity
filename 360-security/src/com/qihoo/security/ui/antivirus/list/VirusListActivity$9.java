// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.ui.antivirus.list;

import com.qihoo.security.malware.vo.MaliciousInfo;
import com.qihoo.security.opti.trashclear.ui.i;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.qihoo.security.ui.antivirus.list:
//            VirusListActivity

class a
    implements com.qihoo.security.malware.a.ivity._cls9
{

    final VirusListActivity a;

    public void a()
    {
        VirusListActivity.b(a, false);
        if (VirusListActivity.k(a).size() > 0)
        {
            VirusListActivity.l(a);
        }
        if (VirusListActivity.m(a))
        {
            i j;
            for (Iterator iterator = VirusListActivity.n(a).iterator(); iterator.hasNext(); VirusListActivity.b(a, j))
            {
                j = (i)iterator.next();
            }

            VirusListActivity.p(a).elayed(new Runnable() {

                final VirusListActivity._cls9 a;

                public void run()
                {
                    VirusListActivity.o(a.a);
                }

            
            {
                a = VirusListActivity._cls9.this;
                super();
            }
            }, 400L);
        }
    }

    public void a(MaliciousInfo maliciousinfo, int j, int k)
    {
    }

    public void b()
    {
    }

    _cls1.a(VirusListActivity viruslistactivity)
    {
        a = viruslistactivity;
        super();
    }
}
