// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.internal.zzk;

// Referenced classes of package com.google.android.gms.internal:
//            zzpm, zzpc

public class zzow extends zzk
{

    private final String zzamE;
    protected final zzpm zzamz = new zzpm() {

        final zzow zzamF;

        public void zzfc()
        {
            zzow.zza(zzamF);
        }

        public IInterface zzjb()
        {
            return zzpu();
        }

        public zzpc zzpu()
        {
            return (zzpc)zzamF.zzjb();
        }

            
            {
                zzamF = zzow.this;
                super();
            }
    };

    public zzow(Context context, Looper looper, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener, String s)
    {
        super(context, looper, 23, connectioncallbacks, onconnectionfailedlistener);
        zzamE = s;
    }

    static void zza(zzow zzow1)
    {
        zzow1.zzfc();
    }

    protected zzpc zzbi(IBinder ibinder)
    {
        return zzpc.zza.zzbk(ibinder);
    }

    protected String zzcF()
    {
        return "com.google.android.location.internal.GoogleLocationManagerService.START";
    }

    protected String zzcG()
    {
        return "com.google.android.gms.location.internal.IGoogleLocationManagerService";
    }

    protected Bundle zzhq()
    {
        Bundle bundle = new Bundle();
        bundle.putString("client_name", zzamE);
        return bundle;
    }

    protected IInterface zzp(IBinder ibinder)
    {
        return zzbi(ibinder);
    }
}
