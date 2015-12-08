// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.client.zzb;

// Referenced classes of package com.google.android.gms.internal:
//            ij, is, im

final class in
    implements Runnable
{

    final ij a;
    final im b;

    in(im im, ij ij1)
    {
        b = im;
        a = ij1;
        super();
    }

    public final void run()
    {
        try
        {
            a.c.c();
            return;
        }
        catch (RemoteException remoteexception)
        {
            zzb.zzd("Could not destroy mediation adapter.", remoteexception);
        }
    }
}
