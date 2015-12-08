// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.api;

import com.google.android.gms.common.ConnectionResult;
import java.util.Map;
import java.util.concurrent.locks.Lock;

// Referenced classes of package com.google.android.gms.common.api:
//            o, aa, c

final class ak
    implements o
{

    final int a;
    final c b;
    final aa c;

    ak(aa aa1, int i, c c1)
    {
        c = aa1;
        a = i;
        b = c1;
        super();
    }

    public final void onConnectionFailed(ConnectionResult connectionresult)
    {
        aa.a(c).lock();
        boolean flag = c.g();
        if (!flag)
        {
            aa.a(c).unlock();
            return;
        }
        if (a != 2 && aa.a(c, a, connectionresult))
        {
            aa.a(c, connectionresult);
            aa.n(c);
        }
        aa.o(c).put(b.c(), connectionresult);
        aa.c(c);
        aa.a(c).unlock();
        return;
        connectionresult;
        aa.a(c).unlock();
        throw connectionresult;
    }
}
