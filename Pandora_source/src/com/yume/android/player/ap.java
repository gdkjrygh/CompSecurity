// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.yume.android.player;

import java.util.TimerTask;

// Referenced classes of package com.yume.android.player:
//            ai

final class ap extends TimerTask
{

    private ai a;

    ap(ai ai1)
    {
        a = ai1;
        super();
    }

    public final void run()
    {
        a.g = System.currentTimeMillis();
        a.c();
    }
}
