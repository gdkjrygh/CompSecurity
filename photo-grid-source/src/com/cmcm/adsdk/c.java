// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cmcm.adsdk;

import android.content.Context;
import android.content.IntentFilter;
import com.cmcm.adsdk.b.c.b;
import com.cmcm.adsdk.b.d;

// Referenced classes of package com.cmcm.adsdk:
//            b, d, j

final class c
    implements d
{

    c()
    {
    }

    public final void a()
    {
        IntentFilter intentfilter;
        com.cmcm.adsdk.b.c.b.a("CMCMADSDK", "request config fail,the reqeust complete");
        com.cmcm.adsdk.b.o();
        if (com.cmcm.adsdk.b.p())
        {
            break MISSING_BLOCK_LABEL_90;
        }
        com.cmcm.adsdk.b.a(new com.cmcm.adsdk.d());
        j.a("CMCMADSDK", (new StringBuilder(" request config onFail ")).append(com.cmcm.adsdk.b.p()).toString());
        intentfilter = new IntentFilter();
        intentfilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        com.cmcm.adsdk.b.q().getApplicationContext().registerReceiver(com.cmcm.adsdk.b.l(), intentfilter);
        com.cmcm.adsdk.b.r();
_L1:
        return;
        Exception exception;
        exception;
        exception.printStackTrace();
        return;
        if (com.cmcm.adsdk.b.l() != null)
        {
            try
            {
                j.a("CMCMADSDK", (new StringBuilder(" request config onFail but not is first request ")).append(com.cmcm.adsdk.b.p()).toString());
                com.cmcm.adsdk.b.q().getApplicationContext().unregisterReceiver(com.cmcm.adsdk.b.l());
                com.cmcm.adsdk.b.a(null);
                return;
            }
            catch (Exception exception1)
            {
                exception1.printStackTrace();
            }
            return;
        }
          goto _L1
    }

    public final void b()
    {
        com.cmcm.adsdk.b.o();
        j.a("CMCMADSDK", (new StringBuilder("request config onSucess ")).append(com.cmcm.adsdk.b.p()).toString());
        if (!com.cmcm.adsdk.b.p() || com.cmcm.adsdk.b.l() == null)
        {
            break MISSING_BLOCK_LABEL_56;
        }
        com.cmcm.adsdk.b.q().getApplicationContext().unregisterReceiver(com.cmcm.adsdk.b.l());
        com.cmcm.adsdk.b.a(null);
        return;
        Exception exception;
        exception;
        exception.printStackTrace();
        return;
    }
}
