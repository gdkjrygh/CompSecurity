// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Handler;

// Referenced classes of package com.google.android.gms.internal:
//            cy, fi, cw

final class cx
{

    private final Runnable a;
    private volatile boolean b;

    public cx(cw cw)
    {
        b = false;
        a = new cy(this, cw);
    }

    static boolean a(cx cx1)
    {
        return cx1.b;
    }

    public final void a()
    {
        b = true;
        fi.a.removeCallbacks(a);
    }

    public final void b()
    {
        fi.a.postDelayed(a, 250L);
    }
}
