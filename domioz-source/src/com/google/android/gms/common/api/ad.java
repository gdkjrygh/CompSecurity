// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.api;

import com.google.android.gms.common.ConnectionResult;
import java.util.concurrent.locks.Lock;

// Referenced classes of package com.google.android.gms.common.api:
//            o, aa

final class ad
    implements o
{

    final aa a;

    ad(aa aa1)
    {
        a = aa1;
        super();
    }

    public final void onConnectionFailed(ConnectionResult connectionresult)
    {
        aa.a(a).lock();
        aa.b(a, new ConnectionResult(8, null));
        aa.a(a).unlock();
        return;
        connectionresult;
        aa.a(a).unlock();
        throw connectionresult;
    }
}
