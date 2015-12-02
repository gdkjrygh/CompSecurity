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

class a extends Thread
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
        a.runOnUiThread(new Runnable(list) {

            final List a;
            final VirusIgnoreListActivity._cls1 b;

            public void run()
            {
                VirusIgnoreListActivity.a(b.a).setVisibility(8);
                VirusIgnoreListActivity.a(b.a, true);
                VirusIgnoreListActivity.a(b.a, a);
                com.qihoo.security.ui.antivirus.VirusIgnoreListActivity.c(b.a).a(VirusIgnoreListActivity.b(b.a));
            }

            
            {
                b = VirusIgnoreListActivity._cls1.this;
                a = list;
                super();
            }
        });
    }

    _cls1.a(VirusIgnoreListActivity virusignorelistactivity)
    {
        a = virusignorelistactivity;
        super();
    }
}
