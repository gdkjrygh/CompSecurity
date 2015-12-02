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
    implements Runnable
{

    final a a;

    public void run()
    {
        VirusListActivity.o(a.a);
    }

    ( )
    {
        a = ;
        super();
    }

    // Unreferenced inner class com/qihoo/security/ui/antivirus/list/VirusListActivity$9

/* anonymous class */
    class VirusListActivity._cls9
        implements com.qihoo.security.malware.a.a.a
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

                VirusListActivity.p(a).postDelayed(new VirusListActivity._cls9._cls1(this), 400L);
            }
        }

        public void a(MaliciousInfo maliciousinfo, int j, int k)
        {
        }

        public void b()
        {
        }

            
            {
                a = viruslistactivity;
                super();
            }
    }

}
