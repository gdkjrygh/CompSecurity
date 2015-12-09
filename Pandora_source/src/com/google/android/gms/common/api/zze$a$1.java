// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.api;

import com.google.android.gms.common.ConnectionResult;

// Referenced classes of package com.google.android.gms.common.api:
//            zze

class b
    implements Runnable
{

    final zze a;
    final ConnectionResult b;
    final sult c;

    public void run()
    {
        zze.zzc(a, b);
    }

    sult(sult sult, zze zze1, ConnectionResult connectionresult)
    {
        c = sult;
        a = zze1;
        b = connectionresult;
        super();
    }
}
