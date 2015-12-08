// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal.request;

import com.google.android.gms.internal.ho;

// Referenced classes of package com.google.android.gms.ads.internal.request:
//            zzm

final class l
    implements Runnable
{

    final zzm a;

    l(zzm zzm1)
    {
        a = zzm1;
        super();
    }

    public final void run()
    {
        if (zzm.b(a) != null)
        {
            zzm.b(a).a();
            zzm.a(a, null);
        }
    }
}
