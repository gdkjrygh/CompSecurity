// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.l;
import java.util.concurrent.locks.Lock;

// Referenced classes of package com.google.android.gms.internal:
//            uj, uu

final class un
    implements l
{

    final a a;
    final int b;
    final uj c;

    un(uj uj1, a a1, int i)
    {
        c = uj1;
        a = a1;
        b = i;
        super();
    }

    public final void onConnectionFailed(ConnectionResult connectionresult)
    {
        uj.b(c).lock();
        uj.c(c).a(connectionresult, a, b);
        uj.b(c).unlock();
        return;
        connectionresult;
        uj.b(c).unlock();
        throw connectionresult;
    }
}
