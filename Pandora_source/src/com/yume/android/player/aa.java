// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.yume.android.player;


// Referenced classes of package com.yume.android.player:
//            YuMePlayerInterfaceImpl, J, Q, G, 
//            S, B

final class aa
    implements Runnable
{

    private S a;
    private final boolean b;

    aa(S s, boolean flag)
    {
        a = s;
        b = flag;
        super();
    }

    public final void run()
    {
        Q q;
        boolean flag;
        try
        {
            q = YuMePlayerInterfaceImpl.d.z();
        }
        catch (Exception exception)
        {
            a.a.c("Exception setting Overlays Visibility.");
            exception.printStackTrace();
            return;
        }
        if (q == null)
        {
            break MISSING_BLOCK_LABEL_31;
        }
        flag = b;
        if (q.d != null)
        {
            q.d.a(flag);
        }
    }
}
