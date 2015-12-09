// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.api;

import com.google.android.gms.common.ConnectionResult;
import java.util.concurrent.locks.Lock;

// Referenced classes of package com.google.android.gms.common.api:
//            n, o, a

class b
    implements b
{

    final a a;
    final int b;
    final n c;

    public void onConnectionFailed(ConnectionResult connectionresult)
    {
        n.a(c).lock();
        n.b(c).a(connectionresult, a, b);
        n.a(c).unlock();
        return;
        connectionresult;
        n.a(c).unlock();
        throw connectionresult;
    }

    onResult(n n1, a a1, int i)
    {
        c = n1;
        a = a1;
        b = i;
        super();
    }
}
