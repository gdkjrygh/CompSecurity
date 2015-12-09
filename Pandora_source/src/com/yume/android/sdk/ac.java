// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.yume.android.sdk;

import java.util.TimerTask;

// Referenced classes of package com.yume.android.sdk:
//            YuMePlayerException, Z, YuMePlayerInterface

final class ac extends TimerTask
{

    private Z a;

    ac(Z z)
    {
        a = z;
        super();
    }

    public final void run()
    {
        a.j();
        a.e = false;
        try
        {
            a.c.YuMePlayer_ReplayAdVideo();
            return;
        }
        catch (YuMePlayerException yumeplayerexception)
        {
            yumeplayerexception.printStackTrace();
        }
    }
}
