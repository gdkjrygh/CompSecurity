// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.cast.internal;

import com.google.android.gms.common.ConnectionResult;

// Referenced classes of package com.google.android.gms.cast.internal:
//            zze

private class <init>
    implements com.google.android.gms.common.api.ApiClient.OnConnectionFailedListener
{

    final zze a;

    public void onConnectionFailed(ConnectionResult connectionresult)
    {
        zze.zzb(a);
    }

    private ult(zze zze1)
    {
        a = zze1;
        super();
    }

    a(zze zze1, a a1)
    {
        this(zze1);
    }
}
