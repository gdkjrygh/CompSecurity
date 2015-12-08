// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.threatmetrix.TrustDefenderMobile;

import android.net.http.AndroidHttpClient;
import android.util.Log;
import java.util.Map;
import org.apache.http.HttpResponse;
import org.apache.http.StatusLine;

// Referenced classes of package com.threatmetrix.TrustDefenderMobile:
//            an, m, k, ag, 
//            ak

class l
    implements Runnable
{

    private static final String f = com/threatmetrix/TrustDefenderMobile/l.getName();
    private final m a;
    final an b;
    final String c;
    final k d;
    private final ag e;

    public l(AndroidHttpClient androidhttpclient, m m1, String s, k k1, Map map, ag ag1)
    {
        b = new an(androidhttpclient);
        b.a(map);
        a = m1;
        c = s;
        d = k1;
        e = ag1;
    }

    public ak a()
    {
        return b.f();
    }

    public final int b()
    {
        if (b.d() != null)
        {
            return b.d().getStatusLine().getStatusCode();
        } else
        {
            return 0;
        }
    }

    public final void c()
    {
        b.c();
    }

    public void run()
    {
        long l1;
        String s = f;
        (new StringBuilder("starting retrieval: ")).append(c);
        l1 = -1L;
        if (a != m.a && a != m.b) goto _L2; else goto _L1
_L1:
        l1 = b.a((new StringBuilder()).append(c).append("?").append(d.a()).toString());
_L8:
        if (l1 >= 0L) goto _L4; else goto _L3
_L3:
        Log.w(f, (new StringBuilder("failed to retrieve from ")).append(b.b()).toString());
        if (e != null)
        {
            e.a(b.f());
        }
_L6:
        return;
_L2:
        if (a == m.c || a == m.d)
        {
            l1 = b.a(c, d.b());
        }
        continue; /* Loop/switch isn't completed */
_L4:
        String s1 = f;
        (new StringBuilder("retrieved: ")).append(b.a());
        if (l1 != 200L)
        {
            Log.w(f, (new StringBuilder("error (")).append(l1).append(") status on request to ").append(b.b()).toString());
            return;
        }
        if (a != m.b && a != m.d) goto _L6; else goto _L5
_L5:
        String s2 = f;
        b.e();
        return;
        if (true) goto _L8; else goto _L7
_L7:
    }

}
