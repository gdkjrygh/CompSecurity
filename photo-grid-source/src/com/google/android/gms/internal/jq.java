// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.client.zzb;

// Referenced classes of package com.google.android.gms.internal:
//            jo, kb, iv

final class jq
    implements Runnable
{

    final com.google.ads.AdRequest.ErrorCode a;
    final jo b;

    jq(jo jo1, com.google.ads.AdRequest.ErrorCode errorcode)
    {
        b = jo1;
        a = errorcode;
        super();
    }

    public final void run()
    {
        try
        {
            jo.a(b).a(kb.a(a));
            return;
        }
        catch (RemoteException remoteexception)
        {
            zzb.zzd("Could not call onAdFailedToLoad.", remoteexception);
        }
    }
}
