// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import android.location.Location;
import android.os.Looper;

// Referenced classes of package com.google.android.gms.internal:
//            zzow, zzpe, zzot

public class zzpf extends zzow
{

    private final zzpe zzamX;
    private final zzot zzamY;

    public zzpf(Context context, Looper looper, String s, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener, String s1, String s2)
    {
        this(context, looper, s, connectioncallbacks, onconnectionfailedlistener, s1, s2, null);
    }

    public zzpf(Context context, Looper looper, String s, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener, String s1, String s2, 
            String s3)
    {
        super(context, looper, connectioncallbacks, onconnectionfailedlistener, s1);
        zzamX = new zzpe(context, zzamz);
        zzamY = zzot.zza(context, s2, s3, zzamz);
    }

    public void disconnect()
    {
        zzpe zzpe1 = zzamX;
        zzpe1;
        JVM INSTR monitorenter ;
        boolean flag = isConnected();
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_30;
        }
        Exception exception;
        try
        {
            zzamX.removeAllListeners();
            zzamX.zzpy();
        }
        catch (Exception exception1) { }
        super.disconnect();
        zzpe1;
        JVM INSTR monitorexit ;
        return;
        exception;
        zzpe1;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public Location zzpx()
    {
        return zzamX.zzpx();
    }
}
