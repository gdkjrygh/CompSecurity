// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.internal.zzk;

// Referenced classes of package com.google.android.gms.internal:
//            zzul, zzuk

public class zzun extends zzk
{

    public zzun(Context context, Looper looper, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener)
    {
        super(context, looper, 45, connectioncallbacks, onconnectionfailedlistener);
    }

    public void zza(zzuk zzuk, byte abyte0[])
    {
        ((zzul)zzjb()).zza(zzuk, abyte0);
    }

    protected zzul zzcD(IBinder ibinder)
    {
        return zzul.zza.zzcC(ibinder);
    }

    protected String zzcF()
    {
        return "com.google.android.gms.safetynet.service.START";
    }

    protected String zzcG()
    {
        return "com.google.android.gms.safetynet.internal.ISafetyNetService";
    }

    protected IInterface zzp(IBinder ibinder)
    {
        return zzcD(ibinder);
    }
}
