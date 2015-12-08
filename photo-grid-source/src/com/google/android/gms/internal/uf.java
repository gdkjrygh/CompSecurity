// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.k;
import com.google.android.gms.common.api.l;
import java.util.concurrent.locks.Lock;

// Referenced classes of package com.google.android.gms.internal:
//            tu, ty, xi

final class uf
    implements k, l
{

    final tu a;

    private uf(tu tu1)
    {
        a = tu1;
        super();
    }

    uf(tu tu1, byte byte0)
    {
        this(tu1);
    }

    public final void onConnected(Bundle bundle)
    {
        tu.e(a).a(new ty(a));
    }

    public final void onConnectionFailed(ConnectionResult connectionresult)
    {
        tu.b(a).lock();
        if (!tu.b(a, connectionresult)) goto _L2; else goto _L1
_L1:
        tu.h(a);
        tu.i(a);
_L4:
        tu.b(a).unlock();
        return;
_L2:
        tu.a(a, connectionresult);
        if (true) goto _L4; else goto _L3
_L3:
        connectionresult;
        tu.b(a).unlock();
        throw connectionresult;
    }

    public final void onConnectionSuspended(int i)
    {
    }
}
