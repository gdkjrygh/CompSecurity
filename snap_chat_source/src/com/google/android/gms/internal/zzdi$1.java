// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.RemoteException;

// Referenced classes of package com.google.android.gms.internal:
//            zzdi, zzdo, zzds, zzhx

class zzsi
    implements Runnable
{

    final zzdo zzsi;
    final zzdi zzsj;

    public void run()
    {
        try
        {
            zzsi.zzsM.destroy();
            return;
        }
        catch (RemoteException remoteexception)
        {
            zzhx.zzd("Could not destroy mediation adapter.", remoteexception);
        }
    }

    (zzdi zzdi1, zzdo zzdo1)
    {
        zzsj = zzdi1;
        zzsi = zzdo1;
        super();
    }
}
