// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.api;

import com.google.android.gms.common.ConnectionResult;

// Referenced classes of package com.google.android.gms.common.api:
//            zzg, Status, zzk

class a
    implements ApiClient.OnConnectionFailedListener
{

    final zzk a;
    final zzg b;

    public void onConnectionFailed(ConnectionResult connectionresult)
    {
        a.setResult(new Status(8));
    }

    Result(zzg zzg1, zzk zzk1)
    {
        b = zzg1;
        a = zzk1;
        super();
    }
}
