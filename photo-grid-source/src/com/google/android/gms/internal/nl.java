// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.util.client.zzb;

// Referenced classes of package com.google.android.gms.internal:
//            rq, bs, nk, dm, 
//            nt, dk

final class nl
    implements rq
{

    final dk a;
    final nk b;

    nl(nk nk1, dk dk)
    {
        b = nk1;
        a = dk;
        super();
    }

    public final void a(Object obj)
    {
        obj = (bs)obj;
        b.c.a(a, new String[] {
            "jsf"
        });
        b.c.b();
        ((bs) (obj)).a("/invalidRequest", b.b.c);
        ((bs) (obj)).a("/loadAdURL", b.b.d);
        try
        {
            ((bs) (obj)).a("AFMA_buildAdURL", b.e);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            zzb.zzb("Error requesting an ad url", ((Throwable) (obj)));
        }
    }
}
