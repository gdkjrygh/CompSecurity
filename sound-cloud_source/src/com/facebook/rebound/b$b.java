// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.rebound;

import android.os.Handler;

// Referenced classes of package com.facebook.rebound:
//            m, b, d

private static final class a extends m
{

    final Handler a;
    final Runnable b = new d(this);
    boolean c;

    public final void a()
    {
        c = true;
        a.removeCallbacks(b);
        a.post(b);
    }

    public final void b()
    {
        c = false;
        a.removeCallbacks(b);
    }

    public (Handler handler)
    {
        a = handler;
    }
}
