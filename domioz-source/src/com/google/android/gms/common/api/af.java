// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.api;

import com.google.android.gms.common.ConnectionResult;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.locks.Lock;

// Referenced classes of package com.google.android.gms.common.api:
//            aa, j, h

final class af
    implements Runnable
{

    final ConnectionResult a;
    final aa b;

    af(aa aa1, ConnectionResult connectionresult)
    {
        b = aa1;
        a = connectionresult;
        super();
    }

    public final void run()
    {
        aa.a(b).lock();
        if (!aa.d(b, a))
        {
            break MISSING_BLOCK_LABEL_186;
        }
        aa.c(b, false);
        Iterator iterator = aa.s(b).iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            j j1 = (j)iterator.next();
            h h1 = (h)aa.t(b).get(j1);
            if (h1.c())
            {
                h1.b();
            }
            if (!aa.o(b).containsKey(j1))
            {
                aa.o(b).put(j1, new ConnectionResult(17, null));
            }
        } while (true);
        break MISSING_BLOCK_LABEL_157;
        Exception exception;
        exception;
        aa.a(b).unlock();
        throw exception;
        aa.c(b, true);
        aa.u(b);
_L1:
        aa.a(b).unlock();
        return;
        aa.e(b, a);
          goto _L1
    }
}
