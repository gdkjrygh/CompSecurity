// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal;

import android.os.Handler;

public class a
{

    private final Handler a;

    public boolean postDelayed(Runnable runnable, long l)
    {
        return a.postDelayed(runnable, l);
    }

    public void removeCallbacks(Runnable runnable)
    {
        a.removeCallbacks(runnable);
    }

    public (Handler handler)
    {
        a = handler;
    }
}
