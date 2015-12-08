// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.api;

import com.google.android.gms.common.ConnectionResult;
import java.util.concurrent.locks.Lock;

// Referenced classes of package com.google.android.gms.common.api:
//            b

class Jr
    implements leApiClient.OnConnectionFailedListener
{

    final b Jq;
    final b Jr;

    public void onConnectionFailed(ConnectionResult connectionresult)
    {
        b.a(Jq).lock();
        if (b.i(Jq) == null || Jr.getPriority() < b.j(Jq))
        {
            b.a(Jq, connectionresult);
            b.c(Jq, Jr.getPriority());
        }
        b.d(Jq);
        b.a(Jq).unlock();
        return;
        connectionresult;
        b.a(Jq).unlock();
        throw connectionresult;
    }

    b(b b1, b b2)
    {
        Jq = b1;
        Jr = b2;
        super();
    }
}
