// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.api;

import com.google.android.gms.common.ConnectionResult;

// Referenced classes of package com.google.android.gms.common.api:
//            zzg, zzh, Api

class b
    implements ApiClient.OnConnectionFailedListener
{

    final Api a;
    final int b;
    final zzg c;

    public void onConnectionFailed(ConnectionResult connectionresult)
    {
        zzg.a(c).zza(connectionresult, a, b);
    }

    Result(zzg zzg1, Api api, int i)
    {
        c = zzg1;
        a = api;
        b = i;
        super();
    }
}
