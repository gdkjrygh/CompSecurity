// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.engine.b;

import android.os.Handler;
import com.qihoo.security.services.ScanProgress;
import com.qihoo.security.services.ScanResult;
import java.util.ArrayList;
import java.util.concurrent.ConcurrentLinkedQueue;

// Referenced classes of package com.qihoo.security.engine.b:
//            d, c

class a
    implements Runnable
{

    final d a;

    private void a(int i, int j)
    {
        ScanResult scanresult1 = (ScanResult)a.m.poll();
        ScanResult scanresult = scanresult1;
        if (scanresult1 == null)
        {
            scanresult = (ScanResult)a.l.poll();
        }
        if (scanresult != null)
        {
            a.b.a(new ScanProgress(scanresult, a.g(), i, j), false);
        }
    }

    public void run()
    {
        if (a.o)
        {
            a.d();
        } else
        {
            int i = a.i();
            int j = a.h();
            if (a.n)
            {
                ArrayList arraylist = new ArrayList();
                arraylist.addAll(a.m);
                a.b.b(arraylist);
                a.d();
                return;
            }
            if (!a.p)
            {
                a(j, i);
                a.j.postDelayed(a.k, Math.max(a.g, 200L));
                return;
            }
        }
    }

    Progress(d d1)
    {
        a = d1;
        super();
    }
}
