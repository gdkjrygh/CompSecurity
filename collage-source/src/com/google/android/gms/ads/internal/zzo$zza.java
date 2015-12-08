// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal;

import android.os.Handler;

// Referenced classes of package com.google.android.gms.ads.internal:
//            zzo

public static class mHandler
{

    private final Handler mHandler;

    public boolean postDelayed(Runnable runnable, long l)
    {
        return mHandler.postDelayed(runnable, l);
    }

    public void removeCallbacks(Runnable runnable)
    {
        mHandler.removeCallbacks(runnable);
    }

    public (Handler handler)
    {
        mHandler = handler;
    }
}
