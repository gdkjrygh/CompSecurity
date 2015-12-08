// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.api;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.signin.d;
import java.util.concurrent.locks.Lock;

// Referenced classes of package com.google.android.gms.common.api:
//            zzg

private class <init>
    implements <init>, <init>
{

    final zzg a;

    public void onConnected(Bundle bundle)
    {
        zzg.f(a).a(new <init>(a));
    }

    public void onConnectionFailed(ConnectionResult connectionresult)
    {
        zzg.c(a).lock();
        if (!zzg.b(a, connectionresult)) goto _L2; else goto _L1
_L1:
        zzg.i(a);
        zzg.j(a);
_L4:
        zzg.c(a).unlock();
        return;
_L2:
        zzg.a(a, connectionresult);
        if (true) goto _L4; else goto _L3
_L3:
        connectionresult;
        zzg.c(a).unlock();
        throw connectionresult;
    }

    public void onConnectionSuspended(int i)
    {
    }

    private Result(zzg zzg1)
    {
        a = zzg1;
        super();
    }

    a(zzg zzg1, a a1)
    {
        this(zzg1);
    }
}
