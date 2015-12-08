// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.internal.zzi;

// Referenced classes of package com.google.android.gms.internal:
//            zzgq

public class zzgt extends zzi
{

    public zzgt(Context context, Looper looper, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener)
    {
        super(context, looper, 19, connectioncallbacks, onconnectionfailedlistener);
    }

    protected IInterface zzD(IBinder ibinder)
    {
        return zzJ(ibinder);
    }

    protected zzgq zzJ(IBinder ibinder)
    {
        return zzgq.zza.zzH(ibinder);
    }

    protected String zzeq()
    {
        return "com.google.android.gms.icing.LIGHTWEIGHT_INDEX_SERVICE";
    }

    protected String zzer()
    {
        return "com.google.android.gms.appdatasearch.internal.ILightweightAppDataSearch";
    }

    public zzgq zzjI()
        throws DeadObjectException
    {
        return (zzgq)zzlX();
    }
}
