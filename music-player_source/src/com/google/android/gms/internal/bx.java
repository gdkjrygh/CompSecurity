// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Handler;

// Referenced classes of package com.google.android.gms.internal:
//            by, eh, bw

final class bx
{

    private final Runnable a;
    private volatile boolean b;

    public bx(bw bw)
    {
        b = false;
        a = new by(this, bw);
    }

    static boolean a(bx bx1)
    {
        return bx1.b;
    }

    public final void a()
    {
        b = true;
        eh.a.removeCallbacks(a);
    }

    public final void b()
    {
        eh.a.postDelayed(a, 250L);
    }
}
