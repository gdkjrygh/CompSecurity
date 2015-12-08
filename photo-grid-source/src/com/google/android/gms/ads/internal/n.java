// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.formats.zze;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.internal.ev;

// Referenced classes of package com.google.android.gms.ads.internal:
//            zzn, zzq

final class n
    implements Runnable
{

    final zze a;
    final zzn b;

    n(zzn zzn1, zze zze)
    {
        b = zzn1;
        a = zze;
        super();
    }

    public final void run()
    {
        try
        {
            b.f.k.a(a);
            return;
        }
        catch (RemoteException remoteexception)
        {
            zzb.zzd("Could not call OnContentAdLoadedListener.onContentAdLoaded().", remoteexception);
        }
    }
}
