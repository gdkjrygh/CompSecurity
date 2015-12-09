// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nuance.b.b;

import android.content.Context;
import android.os.PowerManager;
import android.os.SystemClock;
import com.nuance.b.b.a.p;
import com.nuance.b.b.a.q;
import com.nuance.b.c.b;
import com.nuance.dragon.toolkit.audio.k;

// Referenced classes of package com.nuance.b.b:
//            bm, v

public final class bo
    implements k
{

    float a;
    private final bm b;
    private long c;

    public bo(bm bm1)
    {
        c = 0L;
        a = 40F;
        b = bm1;
    }

    public final void a(float f)
    {
        long l;
        if (!b.e())
        {
            if ((l = SystemClock.elapsedRealtime()) >= c + 50L)
            {
                c = l;
                b.n().d(new p(b.n().b(), q.a, f));
                if (bm.o() && com.nuance.b.b.bm.p() && f > a)
                {
                    ((PowerManager)v.r().c.getSystemService("power")).newWakeLock(0x3000001a, "NinaWake").acquire(1L);
                    return;
                }
            }
        }
    }
}
