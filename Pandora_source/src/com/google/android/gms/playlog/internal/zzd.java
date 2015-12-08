// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.playlog.internal;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;

// Referenced classes of package com.google.android.gms.playlog.internal:
//            zzf

public class zzd
    implements com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener
{

    private boolean zzayA;
    private zzf zzayp;
    private final com.google.android.gms.internal.zzlk.zza zzayz;

    public zzd(com.google.android.gms.internal.zzlk.zza zza1)
    {
        zzayz = zza1;
        zzayp = null;
        zzayA = true;
    }

    public void onConnected(Bundle bundle)
    {
        zzayp.zzaf(false);
        if (zzayA && zzayz != null)
        {
            zzayz.zzvp();
        }
        zzayA = false;
    }

    public void onConnectionFailed(ConnectionResult connectionresult)
    {
        zzayp.zzaf(true);
        if (zzayA && zzayz != null)
        {
            if (connectionresult.hasResolution())
            {
                zzayz.zzf(connectionresult.getResolution());
            } else
            {
                zzayz.zzvq();
            }
        }
        zzayA = false;
    }

    public void onConnectionSuspended(int i)
    {
        zzayp.zzaf(true);
    }

    public void zza(zzf zzf1)
    {
        zzayp = zzf1;
    }

    public void zzae(boolean flag)
    {
        zzayA = flag;
    }
}
