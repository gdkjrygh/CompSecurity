// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.client.zzb;

// Referenced classes of package com.google.android.gms.internal:
//            zzci, zzco, zzcs

class a
    implements Runnable
{

    final zzco a;
    final zzci b;

    public void run()
    {
        try
        {
            a.zzuV.destroy();
            return;
        }
        catch (RemoteException remoteexception)
        {
            zzb.zzd("Could not destroy mediation adapter.", remoteexception);
        }
    }

    l.client.zzb(zzci zzci1, zzco zzco1)
    {
        b = zzci1;
        a = zzco1;
        super();
    }
}
