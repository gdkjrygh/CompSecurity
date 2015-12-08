// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal.formats;

import android.widget.FrameLayout;
import com.google.android.gms.internal.ry;

// Referenced classes of package com.google.android.gms.ads.internal.formats:
//            zzh, zzj

final class h
    implements Runnable
{

    final zzh a;
    final zzj b;

    h(zzj zzj1, zzh zzh1)
    {
        b = zzj1;
        a = zzh1;
        super();
    }

    public final void run()
    {
        ry ry1 = a.zzdC();
        if (ry1 != null)
        {
            zzj.a(b).addView(ry1.b());
        }
    }
}
