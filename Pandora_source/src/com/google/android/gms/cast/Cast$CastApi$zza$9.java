// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.cast;

import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.cast.internal.zze;
import com.google.android.gms.cast.internal.zzh;
import com.google.android.gms.common.api.GoogleApiClient;

// Referenced classes of package com.google.android.gms.cast:
//            Cast

class nt extends zzh
{

    final String a;
    final a b;

    protected void a(zze zze1)
        throws RemoteException
    {
        if (TextUtils.isEmpty(a))
        {
            zzd(2001, "IllegalArgument: sessionId cannot be null or empty");
            return;
        }
        try
        {
            zze1.zza(a, this);
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

    nt(nt nt, GoogleApiClient googleapiclient, String s)
    {
        b = nt;
        a = s;
        super(googleapiclient);
    }
}
