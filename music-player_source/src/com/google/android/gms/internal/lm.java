// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Handler;

// Referenced classes of package com.google.android.gms.internal:
//            ln, eh, ek, z, 
//            lk

public final class lm
{

    private final Runnable a;
    private z b;
    private boolean c;

    public lm(lk lk)
    {
        c = false;
        a = new ln(this, lk);
    }

    static boolean a(lm lm1)
    {
        lm1.c = false;
        return false;
    }

    static z b(lm lm1)
    {
        return lm1.b;
    }

    public final void a()
    {
        eh.a.removeCallbacks(a);
    }

    public final void a(z z)
    {
        a(z, 60000L);
    }

    public final void a(z z, long l)
    {
        if (c)
        {
            ek.d("An ad refresh is already scheduled.");
            return;
        } else
        {
            ek.b((new StringBuilder("Scheduling ad refresh ")).append(l).append(" milliseconds from now.").toString());
            b = z;
            c = true;
            eh.a.postDelayed(a, l);
            return;
        }
    }
}
