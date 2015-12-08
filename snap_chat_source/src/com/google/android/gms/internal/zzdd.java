// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.common.internal.zzk;

// Referenced classes of package com.google.android.gms.internal:
//            zzde

public class zzdd extends zzk
{

    final int zzrQ;

    public zzdd(Context context, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener, int i)
    {
        super(context, context.getMainLooper(), 46, connectioncallbacks, onconnectionfailedlistener);
        zzrQ = i;
    }

    protected String zzcF()
    {
        return "com.google.android.gms.ads.gservice.START";
    }

    protected String zzcG()
    {
        return "com.google.android.gms.ads.internal.gservice.IGservicesValueService";
    }

    public zzde zzcH()
    {
        return (zzde)super.zzjb();
    }

    protected zzde zzo(IBinder ibinder)
    {
        return zzde.zza.zzq(ibinder);
    }

    protected IInterface zzp(IBinder ibinder)
    {
        return zzo(ibinder);
    }
}
