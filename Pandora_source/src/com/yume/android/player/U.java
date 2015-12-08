// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.yume.android.player;

import java.util.ArrayList;

// Referenced classes of package com.yume.android.player:
//            S, YuMePlayerInterfaceImpl, J, Q, 
//            G, B

final class U
    implements Runnable
{

    private S a;

    U(S s)
    {
        a = s;
        super();
    }

    public final void run()
    {
        int i = 0;
_L1:
        if (i >= a.b.size())
        {
            return;
        }
        Q q;
        int j;
        if (a.d)
        {
            break MISSING_BLOCK_LABEL_107;
        }
        j = ((Integer)a.b.get(i)).intValue();
        q = YuMePlayerInterfaceImpl.d.z();
        if (q == null)
        {
            break MISSING_BLOCK_LABEL_71;
        }
        if (q.d != null)
        {
            q.d.a(j);
        }
        a.b.remove(i);
        i++;
          goto _L1
        Exception exception;
        exception;
        a.a.c("Exception displaying Overlay.");
        exception.printStackTrace();
    }
}
