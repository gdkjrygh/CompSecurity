// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cmcm.adsdk.nativead;

import com.cmcm.adsdk.b.c.b;
import java.util.TimerTask;

// Referenced classes of package com.cmcm.adsdk.nativead:
//            aa

final class af extends TimerTask
{

    final aa a;

    af(aa aa1)
    {
        a = aa1;
        super();
    }

    public final void run()
    {
        b.a("CMCMADSDK", "timeout, to check this load finish");
        aa.g(a);
        aa.h(a);
    }
}
