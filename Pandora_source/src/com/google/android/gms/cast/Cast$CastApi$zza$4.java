// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.cast;

import android.os.RemoteException;
import com.google.android.gms.cast.internal.zze;
import com.google.android.gms.common.api.GoogleApiClient;

// Referenced classes of package com.google.android.gms.cast:
//            Cast

class nt extends nt
{

    final String a;
    final String b;
    final a c;

    protected void a(zze zze1)
        throws RemoteException
    {
        try
        {
            zze1.zzb(a, b, this);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (zze zze1)
        {
            zzal(2001);
        }
    }

    protected void zza(com.google.android.gms.common.api. )
        throws RemoteException
    {
        a((zze));
    }

    nt(nt nt, GoogleApiClient googleapiclient, String s, String s1)
    {
        c = nt;
        a = s;
        b = s1;
        super(googleapiclient);
    }
}
