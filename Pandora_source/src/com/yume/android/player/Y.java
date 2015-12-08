// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.yume.android.player;


// Referenced classes of package com.yume.android.player:
//            YuMePlayerInterfaceImpl, J, Q, G, 
//            S, B

final class Y
    implements Runnable
{

    private S a;

    Y(S s)
    {
        a = s;
        super();
    }

    public final void run()
    {
        Q q;
        try
        {
            q = YuMePlayerInterfaceImpl.d.z();
        }
        catch (Exception exception)
        {
            a.a.c("Exception displaying Overlays at Base Asset Start.");
            exception.printStackTrace();
            return;
        }
        if (q == null)
        {
            break MISSING_BLOCK_LABEL_25;
        }
        if (q.d != null)
        {
            q.d.d();
        }
    }
}
