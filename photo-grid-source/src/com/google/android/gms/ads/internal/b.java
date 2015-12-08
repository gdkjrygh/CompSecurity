// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal;

import com.google.android.gms.internal.pa;
import com.google.android.gms.internal.pb;

// Referenced classes of package com.google.android.gms.ads.internal:
//            zzc

final class b
    implements Runnable
{

    final pb a;
    final zzc b;

    b(zzc zzc1, pb pb)
    {
        b = zzc1;
        a = pb;
        super();
    }

    public final void run()
    {
        b.zzb(new pa(a));
    }
}
