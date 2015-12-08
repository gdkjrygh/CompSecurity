// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.aviary.android.feather.sdk.panels;

import java.util.concurrent.LinkedBlockingQueue;

// Referenced classes of package com.aviary.android.feather.sdk.panels:
//            TiltShiftPanel

static class b extends LinkedBlockingQueue
{

    private com.aviary.android.feather.headless.filters.c a;
    private volatile boolean b;

    static com.aviary.android.feather.headless.filters.c a(b b1)
    {
        return b1.a;
    }

    public void a()
    {
        b = true;
    }

    public boolean b()
    {
        return b;
    }

    public ilter.c(com.aviary.android.feather.headless.filters.c c)
    {
        a = c;
        b = false;
    }
}
