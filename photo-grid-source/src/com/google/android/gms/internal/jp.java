// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.client.zzb;

// Referenced classes of package com.google.android.gms.internal:
//            jo, iv

final class jp
    implements Runnable
{

    final jo a;

    jp(jo jo1)
    {
        a = jo1;
        super();
    }

    public final void run()
    {
        try
        {
            jo.a(a).a();
            return;
        }
        catch (RemoteException remoteexception)
        {
            zzb.zzd("Could not call onAdClicked.", remoteexception);
        }
    }
}
