// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal;

import android.os.Handler;

// Referenced classes of package com.google.android.gms.ads.internal:
//            o

public static final class a
{

    private final Handler a;

    public final void a(Runnable runnable)
    {
        a.removeCallbacks(runnable);
    }

    public final boolean a(Runnable runnable, long l)
    {
        return a.postDelayed(runnable, l);
    }

    public (Handler handler)
    {
        a = handler;
    }
}
