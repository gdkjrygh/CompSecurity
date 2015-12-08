// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cmcm.adsdk.nativead;

import android.os.Handler;
import com.cmcm.adsdk.b.c.b;
import java.util.Map;

// Referenced classes of package com.cmcm.adsdk.nativead:
//            aa

final class ad
    implements Runnable
{

    final aa a;

    ad(aa aa1)
    {
        a = aa1;
        super();
    }

    public final void run()
    {
        Map map = aa.i(a);
        map;
        JVM INSTR monitorenter ;
        if (!aa.i(a).isEmpty())
        {
            break MISSING_BLOCK_LABEL_57;
        }
        aa.j(a).postDelayed(this, 4000L);
        b.a("CMCMADSDK", "now load no callback , to issue next ");
        aa.k(a);
_L2:
        return;
        b.a("CMCMADSDK", "has callback,remove no callback task");
        aa.j(a).removeCallbacks(this);
        if (true) goto _L2; else goto _L1
_L1:
        Exception exception;
        exception;
        map;
        JVM INSTR monitorexit ;
        throw exception;
    }
}
