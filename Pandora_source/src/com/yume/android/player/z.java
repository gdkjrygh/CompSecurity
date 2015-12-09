// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.yume.android.player;

import com.yume.android.sdk.YuMePlaybackStatus;
import java.util.TimerTask;

// Referenced classes of package com.yume.android.player:
//            x, Q, B, A, 
//            J

final class z extends TimerTask
{

    private x a;

    z(x x1)
    {
        a = x1;
        super();
    }

    public final void run()
    {
        int i;
        a.h = System.currentTimeMillis();
        if (a.d == 0)
        {
            a.b.a(0);
        }
        i = Math.round(((float)a.d / (float)a.e) * 100F);
        if (i < 75) goto _L2; else goto _L1
_L1:
        a.b.a(75);
_L4:
        a.b.b(a.d);
        x x1 = a;
        x1.d = x1.d + 1;
        if (a.d == a.e + 1)
        {
            a.a.b("Image Ad Display Completed.");
            a.b.a(100);
            a.b(false);
            a.i = A.e;
            J.a(YuMePlaybackStatus.COMPLETED);
            a.c.j();
        }
        return;
_L2:
        if (i >= 50)
        {
            a.b.a(50);
        } else
        if (i >= 25)
        {
            a.b.a(25);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }
}
