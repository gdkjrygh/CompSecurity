// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal;

import android.content.Intent;
import com.google.android.gms.ads.internal.overlay.zzd;
import com.google.android.gms.ads.internal.purchase.zzi;
import com.google.android.gms.internal.pa;
import com.google.android.gms.internal.ry;

// Referenced classes of package com.google.android.gms.ads.internal:
//            zzp, zzb, zzq

final class a
    implements Runnable
{

    final Intent a;
    final zzb b;

    a(zzb zzb1, Intent intent)
    {
        b = zzb1;
        a = intent;
        super();
    }

    public final void run()
    {
        int i = zzp.zzbF().zzd(a);
        zzp.zzbF();
        if (i == 0 && b.f.zzqo != null && b.f.zzqo.b != null && b.f.zzqo.b.h() != null)
        {
            b.f.zzqo.b.h().close();
        }
        b.f.s = false;
    }
}
