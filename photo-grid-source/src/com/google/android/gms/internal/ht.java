// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.util.client.zzb;

// Referenced classes of package com.google.android.gms.internal:
//            rq, bg, ho, hs

final class ht
    implements rq
{

    final ho a;
    final hs b;

    ht(hs hs, ho ho1)
    {
        b = hs;
        a = ho1;
        super();
    }

    public final void a(Object obj)
    {
        obj = (bg)obj;
        zzb.v("Getting a new session for JS Engine.");
        a.a(((bg) (obj)).b());
    }
}
