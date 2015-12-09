// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.yume.android.player;

import java.util.TimerTask;

// Referenced classes of package com.yume.android.player:
//            J

final class M extends TimerTask
{

    private J a;

    M(J j)
    {
        a = j;
        super();
    }

    public final void run()
    {
        if (a.l())
        {
            a.m();
            a.n();
        }
    }
}
