// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal;

import java.lang.ref.WeakReference;

// Referenced classes of package com.google.android.gms.ads.internal:
//            zzo, zza

final class p
    implements Runnable
{

    final WeakReference a;
    final zzo b;

    p(zzo zzo1, WeakReference weakreference)
    {
        b = zzo1;
        a = weakreference;
        super();
    }

    public final void run()
    {
        zzo.a(b);
        zza zza1 = (zza)a.get();
        if (zza1 != null)
        {
            zza1.zzd(zzo.b(b));
        }
    }
}
