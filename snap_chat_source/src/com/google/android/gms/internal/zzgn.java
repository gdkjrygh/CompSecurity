// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.common.internal.zzk;

// Referenced classes of package com.google.android.gms.internal:
//            zzgs

public class zzgn extends zzk
{

    final int zzrQ;

    public zzgn(Context context, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener, int i)
    {
        super(context, context.getMainLooper(), 8, connectioncallbacks, onconnectionfailedlistener);
        zzrQ = i;
    }

    protected zzgs zzF(IBinder ibinder)
    {
        return zzgs.zza.zzG(ibinder);
    }

    protected String zzcF()
    {
        return "com.google.android.gms.ads.service.START";
    }

    protected String zzcG()
    {
        return "com.google.android.gms.ads.internal.request.IAdRequestService";
    }

    public zzgs zzdL()
    {
        return (zzgs)super.zzjb();
    }

    protected IInterface zzp(IBinder ibinder)
    {
        return zzF(ibinder);
    }
}
