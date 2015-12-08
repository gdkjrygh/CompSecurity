// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.zzp;

// Referenced classes of package com.google.android.gms.internal:
//            gs, gq

final class gr
    implements Runnable
{

    final gq a;

    gr(gq gq)
    {
        a = gq;
        super();
    }

    public final void run()
    {
        zzp.zzbI().b(a);
    }
}
