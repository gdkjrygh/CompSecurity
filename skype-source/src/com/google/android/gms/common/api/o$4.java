// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.api;

import com.google.android.gms.common.ConnectionResult;
import java.util.concurrent.locks.Lock;

// Referenced classes of package com.google.android.gms.common.api:
//            o, p, a

final class b
    implements b
{

    final a a;
    final int b;
    final o c;

    public final void onConnectionFailed(ConnectionResult connectionresult)
    {
        o.a(c).lock();
        o.b(c).a(connectionresult, a, b);
        o.a(c).unlock();
        return;
        connectionresult;
        o.a(c).unlock();
        throw connectionresult;
    }

    onResult(o o1, a a1, int i)
    {
        c = o1;
        a = a1;
        b = i;
        super();
    }
}
