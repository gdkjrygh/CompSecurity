// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.util.client.zzb;

// Referenced classes of package com.google.android.gms.internal:
//            rq, bs, bt, ho

final class hp
    implements rq
{

    final ho a;

    hp(ho ho)
    {
        a = ho;
        super();
    }

    public final void a(Object obj)
    {
        obj = (bs)obj;
        zzb.v("Ending javascript session.");
        ((bt)obj).a();
    }
}
