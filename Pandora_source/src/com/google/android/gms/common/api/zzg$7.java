// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.api;


// Referenced classes of package com.google.android.gms.common.api:
//            ResultCallback, zzg, Status, zzk, 
//            GoogleApiClient, Result

class c
    implements ResultCallback
{

    final zzk a;
    final boolean b;
    final GoogleApiClient c;
    final zzg d;

    public void a(Status status)
    {
        if (status.isSuccess() && d.isConnected())
        {
            d.reconnect();
        }
        a.setResult(status);
        if (b)
        {
            c.disconnect();
        }
    }

    public void onResult(Result result)
    {
        a((Status)result);
    }

    ApiClient(zzg zzg1, zzk zzk1, boolean flag, GoogleApiClient googleapiclient)
    {
        d = zzg1;
        a = zzk1;
        b = flag;
        c = googleapiclient;
        super();
    }
}
