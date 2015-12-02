// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.ui.antivirus;

import android.widget.ProgressBar;
import com.qihoo.security.malware.db.c;
import com.qihoo.security.malware.vo.MaliciousInfo;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.qihoo.security.ui.antivirus:
//            VirusIgnoreListActivity

class a
    implements Runnable
{

    final List a;
    final b b;

    public void run()
    {
        VirusIgnoreListActivity.a(b.b).setVisibility(8);
        VirusIgnoreListActivity.a(b.b, true);
        VirusIgnoreListActivity.a(b.b, a);
        com.qihoo.security.ui.antivirus.VirusIgnoreListActivity.c(b.b).b(VirusIgnoreListActivity.b(b.b));
    }

    A(A a1, List list)
    {
        b = a1;
        a = list;
        super();
    }

    // Unreferenced inner class com/qihoo/security/ui/antivirus/VirusIgnoreListActivity$1

/* anonymous class */
    class VirusIgnoreListActivity._cls1 extends Thread
    {

        final VirusIgnoreListActivity a;

        public void run()
        {
            List list = c.a(a.p);
            Iterator iterator = list.iterator();
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                MaliciousInfo maliciousinfo = (MaliciousInfo)iterator.next();
                if (maliciousinfo.isUninstall(a.p))
                {
                    iterator.remove();
                    c.a(a.p, maliciousinfo._id);
                } else
                if (maliciousinfo.isInMonitorList)
                {
                    iterator.remove();
                }
            } while (true);
            a.runOnUiThread(new VirusIgnoreListActivity._cls1._cls1(this, list));
        }

            
            {
                a = virusignorelistactivity;
                super();
            }
    }

}
