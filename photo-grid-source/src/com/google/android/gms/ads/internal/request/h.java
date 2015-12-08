// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal.request;

import com.google.android.gms.internal.ho;
import com.google.android.gms.internal.pb;

// Referenced classes of package com.google.android.gms.ads.internal.request:
//            zzm

final class h
    implements Runnable
{

    final pb a;
    final zzm b;

    h(zzm zzm1, pb pb)
    {
        b = zzm1;
        a = pb;
        super();
    }

    public final void run()
    {
        zzm.a(b).zza(a);
        if (zzm.b(b) != null)
        {
            zzm.b(b).a();
            zzm.a(b, null);
        }
    }
}
