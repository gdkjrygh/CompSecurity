// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.bq;

import android.os.Process;
import android.util.Log;
import com.google.android.m4b.maps.ay.ab;
import com.google.android.m4b.maps.be.c;
import com.google.android.m4b.maps.bx.o;

// Referenced classes of package com.google.android.m4b.maps.bq:
//            b, k

final class start extends Thread
{

    volatile boolean a;
    volatile boolean b;
    private b c;

    public final void run()
    {
        Process.setThreadPriority(o.c() + 1);
_L2:
        Object obj;
        obj = c.a.a();
        if (obj == null)
        {
            return;
        }
        break; /* Loop/switch isn't completed */
        obj;
        if (ab.a("DashServerTileStore", 6))
        {
            Log.e("DashServerTileStore", "Could not set thread priority", ((Throwable) (obj)));
        }
        if (true) goto _L2; else goto _L1
_L1:
        if (a || !com.google.android.m4b.maps.bq.b.e(c)) goto _L4; else goto _L3
_L3:
        com.google.android.m4b.maps.bq.b.f(c);
        ((c) (obj)).k_();
_L8:
        b = true;
        com.google.android.m4b.maps.bq.b.g(c);
        return;
_L4:
        a = false;
        int i;
        try
        {
            i = com.google.android.m4b.maps.bq.b.d(c);
        }
        catch (InterruptedException interruptedexception)
        {
            return;
        }
_L6:
        if (i <= 0)
        {
            break; /* Loop/switch isn't completed */
        }
        sleep(1000L);
        if (com.google.android.m4b.maps.bq.b.e(c))
        {
            break; /* Loop/switch isn't completed */
        }
        i -= 1000;
        if (true) goto _L6; else goto _L5
_L5:
        if (a) goto _L4; else goto _L7
_L7:
        com.google.android.m4b.maps.bq.b.f(c);
        ((c) (obj)).k_();
          goto _L8
    }

    (b b1)
    {
        c = b1;
        String s = String.valueOf(b1.getName());
        if (s.length() != 0)
        {
            s = "CacheCommitter:".concat(s);
        } else
        {
            s = new String("CacheCommitter:");
        }
        super(s);
        if (com.google.android.m4b.maps.bq.b.d(b1) < 0)
        {
            b = true;
            return;
        } else
        {
            start();
            return;
        }
    }
}
