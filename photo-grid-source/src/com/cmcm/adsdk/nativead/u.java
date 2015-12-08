// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cmcm.adsdk.nativead;

import com.cmcm.adsdk.b.c.b;
import java.util.TimerTask;

// Referenced classes of package com.cmcm.adsdk.nativead:
//            s

final class u extends TimerTask
{

    final s a;

    u(s s1)
    {
        a = s1;
        super();
    }

    public final void run()
    {
        b.a("FBNativeLoader", "request timeOut, set loading finish ");
        s.a(a);
    }
}
