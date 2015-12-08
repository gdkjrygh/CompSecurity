// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.client.zzb;

// Referenced classes of package com.google.android.gms.internal:
//            zzcy, zzct

class a
    implements Runnable
{

    final zzcy a;

    public void run()
    {
        try
        {
            zzcy.zza(a).onAdClosed();
            return;
        }
        catch (RemoteException remoteexception)
        {
            zzb.zzd("Could not call onAdClosed.", remoteexception);
        }
    }

    l.client.zzb(zzcy zzcy1)
    {
        a = zzcy1;
        super();
    }
}
