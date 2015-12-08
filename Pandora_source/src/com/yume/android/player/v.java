// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.yume.android.player;

import android.os.Handler;
import android.os.Message;

// Referenced classes of package com.yume.android.player:
//            YuMePlayerInterfaceImpl, t, B, m, 
//            G

final class v extends Handler
{

    private t a;

    v(t t1)
    {
        a = t1;
        super();
    }

    public final void handleMessage(Message message)
    {
        if (!YuMePlayerInterfaceImpl.b)
        {
            a.a.b("YuMe Player seems to be DeInitialized - Ignoring Overlay Download Response.");
            message.obj = null;
        } else
        {
            m m1 = (m)message.obj;
            if (m1 != null)
            {
                a.a(m1);
                if (m1.b != null)
                {
                    m1.b.a(message);
                    return;
                }
            }
        }
    }
}
