// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal.overlay;

import java.lang.ref.WeakReference;

// Referenced classes of package com.google.android.gms.ads.internal.overlay:
//            zzg

class a
    implements Runnable
{

    final zzg a;
    final b b;
    private final WeakReference c;

    public void run()
    {
        zzg zzg1 = (zzg)c.get();
        if (!c(b) && zzg1 != null)
        {
            zzg1.zzdI();
            b.b();
        }
    }

    _cls9(_cls9 _pcls9, zzg zzg1)
    {
        b = _pcls9;
        a = zzg1;
        super();
        c = new WeakReference(a);
    }
}
