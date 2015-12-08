// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal.overlay;


// Referenced classes of package com.google.android.gms.ads.internal.overlay:
//            zzc, zzh

final class e
    implements Runnable
{

    final zzc a;

    e(zzc zzc1)
    {
        a = zzc1;
        super();
    }

    public final void run()
    {
        if (zzc.a(a) != null)
        {
            zzc.a(a).onPaused();
            zzc.a(a).zzeU();
        }
    }
}
