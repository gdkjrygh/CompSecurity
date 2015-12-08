// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jirbo.adcolony;

import android.os.Handler;
import android.os.Message;

// Referenced classes of package com.jirbo.adcolony:
//            a, AdColonyAd, ADCVideo, ae, 
//            d, u, b

class lonyAd extends Handler
{

    AdColonyAd a;

    public void a(AdColonyAd adcolonyad)
    {
        if (adcolonyad == null)
        {
            a = a.J;
        } else
        {
            a = adcolonyad;
        }
        sendMessage(obtainMessage(1));
    }

    public void b(AdColonyAd adcolonyad)
    {
        if (adcolonyad == null)
        {
            a = a.J;
        } else
        {
            a = adcolonyad;
        }
        sendMessage(obtainMessage(0));
    }

    public void handleMessage(Message message)
    {
        message.what;
        JVM INSTR tableswitch 0 1: default 28
    //                   0 29
    //                   1 58;
           goto _L1 _L2 _L3
_L1:
        return;
_L2:
        com.jirbo.adcolony.a.a("skip", a);
        if (a.J != null)
        {
            a.J.f = 1;
            a.J.a();
            return;
        }
        continue; /* Loop/switch isn't completed */
_L3:
        message = new ata.g();
        if (a.L.F.Q)
        {
            message.b("html5_endcard_loading_started", a.L.k);
        }
        if (a.L.F.Q)
        {
            message.b("html5_endcard_loading_finished", a.L.l);
        }
        if (a.L.F.Q)
        {
            message.b("html5_endcard_loading_time", a.L.p);
        }
        if (a.L.F.Q)
        {
            message.b("html5_endcard_loading_timeout", a.L.m);
        }
        if (a.L.q < 60000D)
        {
            message.b("endcard_time_spent", a.L.q);
        }
        message.b("endcard_dissolved", a.L.n);
        ADCVideo adcvideo = a.L;
        message.b("replay", ADCVideo.e);
        message.b("reward", a.L.o);
        a.l.d.a("continue", message, a);
        a.l.b.e();
        if (a.J != null)
        {
            a.J.f = 4;
            a.J.a();
            return;
        }
        if (true) goto _L1; else goto _L4
_L4:
    }

    lonyAd()
    {
    }
}
