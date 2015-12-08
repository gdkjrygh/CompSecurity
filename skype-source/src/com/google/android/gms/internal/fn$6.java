// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.p;
import com.google.android.gms.ads.internal.request.AdRequestInfoParcel;
import com.google.android.gms.ads.internal.request.AdResponseParcel;
import com.google.android.gms.ads.internal.request.k;
import com.google.android.gms.ads.internal.util.client.b;

// Referenced classes of package com.google.android.gms.internal:
//            fn, gd

final class b
    implements Runnable
{

    final AdRequestInfoParcel a;
    final k b;
    final fn c;

    public final void run()
    {
        AdResponseParcel adresponseparcel;
        AdResponseParcel adresponseparcel1;
        try
        {
            adresponseparcel = c.a(a);
        }
        catch (Exception exception)
        {
            p.h().a(exception, true);
            com.google.android.gms.ads.internal.util.client.b.b("Could not fetch ad response due to an Exception.", exception);
            exception = null;
        }
        adresponseparcel1 = adresponseparcel;
        if (adresponseparcel == null)
        {
            adresponseparcel1 = new AdResponseParcel(0);
        }
        try
        {
            b.a(adresponseparcel1);
            return;
        }
        catch (RemoteException remoteexception)
        {
            com.google.android.gms.ads.internal.util.client.b.b("Fail to forward ad response.", remoteexception);
        }
    }

    equest.k(fn fn1, AdRequestInfoParcel adrequestinfoparcel, k k1)
    {
        c = fn1;
        a = adrequestinfoparcel;
        b = k1;
        super();
    }
}
