// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.AdRequestParcel;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.b.d;

// Referenced classes of package com.google.android.gms.internal:
//            om, is, or

final class oo
    implements Runnable
{

    final is a;
    final AdRequestParcel b;
    final or c;
    final om d;

    oo(om om1, is is1, AdRequestParcel adrequestparcel, or or)
    {
        d = om1;
        a = is1;
        b = adrequestparcel;
        c = or;
        super();
    }

    public final void run()
    {
        try
        {
            a.a(com.google.android.gms.b.d.a(om.c(d)), b, com.google.android.gms.internal.om.d(d), c, om.a(d));
            return;
        }
        catch (RemoteException remoteexception)
        {
            zzb.zzd((new StringBuilder("Fail to initialize adapter ")).append(om.b(d)).toString(), remoteexception);
        }
        d.a(0);
    }
}
