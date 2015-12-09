// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.formats.zze;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.internal.bu;

// Referenced classes of package com.google.android.gms.ads.internal:
//            zzn, zzq

class zzpv
    implements Runnable
{

    final zzn zzpt;
    final zze zzpv;

    public void run()
    {
        try
        {
            zzpt.zzos.zzqq.a(zzpv);
            return;
        }
        catch (RemoteException remoteexception)
        {
            zzb.zzd("Could not call OnContentAdLoadedListener.onContentAdLoaded().", remoteexception);
        }
    }

    s.zze(zzn zzn1, zze zze)
    {
        zzpt = zzn1;
        zzpv = zze;
        super();
    }
}
