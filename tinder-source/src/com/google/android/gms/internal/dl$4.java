// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.a;
import java.util.concurrent.locks.Lock;

// Referenced classes of package com.google.android.gms.internal:
//            dl, dm

final class b
    implements com.google.android.gms.common.api.nResult
{

    final a a;
    final int b;
    final dl c;

    public final void a(ConnectionResult connectionresult)
    {
        dl.b(c).lock();
        dl.c(c).a(connectionresult, a, b);
        dl.b(c).unlock();
        return;
        connectionresult;
        dl.b(c).unlock();
        throw connectionresult;
    }

    ionResult(dl dl1, a a1, int i)
    {
        c = dl1;
        a = a1;
        b = i;
        super();
    }
}
