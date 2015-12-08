// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal.overlay;

import android.os.Handler;
import com.google.android.gms.internal.qa;

// Referenced classes of package com.google.android.gms.ads.internal.overlay:
//            zzk

final class m
    implements Runnable
{

    private zzk a;
    private boolean b;

    m(zzk zzk1)
    {
        b = false;
        a = zzk1;
    }

    public final void a()
    {
        b = true;
        qa.a.removeCallbacks(this);
    }

    public final void b()
    {
        qa.a.postDelayed(this, 250L);
    }

    public final void run()
    {
        if (!b)
        {
            a.a();
            b();
        }
    }
}
