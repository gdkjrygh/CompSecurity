// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal.request;

import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.internal.bs;
import com.google.android.gms.internal.gk;
import com.google.android.gms.internal.rq;

// Referenced classes of package com.google.android.gms.ads.internal.request:
//            i, zzm

final class j
    implements rq
{

    final i a;

    j(i k)
    {
        a = k;
        super();
    }

    public final void a(Object obj)
    {
        obj = (bs)obj;
        try
        {
            ((bs) (obj)).a("AFMA_getAdapterLessMediationAd", a.a);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            zzb.zzb("Error requesting an ad url", ((Throwable) (obj)));
        }
        zzm.a().b(a.b);
    }
}
