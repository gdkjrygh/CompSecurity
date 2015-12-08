// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.AdRequestParcel;
import com.google.android.gms.ads.internal.util.client.zzb;

// Referenced classes of package com.google.android.gms.internal:
//            om, is

final class on
    implements Runnable
{

    final is a;
    final AdRequestParcel b;
    final om c;

    on(om om1, is is1, AdRequestParcel adrequestparcel)
    {
        c = om1;
        a = is1;
        b = adrequestparcel;
        super();
    }

    public final void run()
    {
        try
        {
            a.a(b, om.a(c));
            return;
        }
        catch (RemoteException remoteexception)
        {
            zzb.zzd("Fail to load ad from adapter.", remoteexception);
        }
        c.a(0);
    }
}
