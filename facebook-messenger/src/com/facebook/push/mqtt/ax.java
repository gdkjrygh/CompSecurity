// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.push.mqtt;

import com.facebook.abtest.qe.f.b;
import com.facebook.analytics.f;
import com.facebook.common.init.NeedsLowPriorityInitOnUiThread;
import com.facebook.http.b.w;
import com.facebook.inject.a.g;
import com.facebook.inject.aj;
import com.facebook.inject.c;
import com.facebook.mqtt.q;
import com.facebook.push.a;
import com.facebook.push.annotations.HighestMqttPersistence;
import com.facebook.push.annotations.IsDeviceForegroundEnabled;
import com.facebook.push.annotations.IsMobileOnlineAvailabilityEnabled;
import com.facebook.push.annotations.KeepaliveDelayAdjustmentPercentage;
import com.facebook.push.annotations.MqttEndpointCapability;
import com.facebook.push.mqtt.abtest.d;

// Referenced classes of package com.facebook.push.mqtt:
//            v, bf, ci, bp, 
//            u, be, s, bd, 
//            ai, bg, aw, bk, 
//            ch, bo, ca, bn, 
//            o, bc, ar, g, 
//            n, bx, bl, as, 
//            f, a, az, bb, 
//            at, av, i, ck, 
//            ah, bj, bm, d, 
//            ba, ap, bi, an, 
//            bh

public class ax extends c
{

    public ax()
    {
    }

    protected void a()
    {
        e(com/facebook/http/b/w);
        e(com/facebook/analytics/f);
        e(com/facebook/push/a);
        a(((com.facebook.inject.ag) (new q())));
        a(com/facebook/push/mqtt/v).a(new bf(this, null)).a();
        a(com/facebook/push/mqtt/ci).a(new bp(this, null)).a();
        a(com/facebook/push/mqtt/u).a(new be(this, null)).a();
        a(com/facebook/push/mqtt/s).a(new bd(this, null)).a();
        a(com/facebook/push/mqtt/ai).a(new bg(this, null));
        a(com/facebook/push/mqtt/aw).a(new bk(this, null)).a();
        a(com/facebook/push/mqtt/ch).a(new bo(this, null)).a();
        a(com/facebook/push/mqtt/ca).a(new bn(this, null)).a();
        a(com/facebook/push/mqtt/o).a(new bc(this, null)).a();
        a(com/facebook/push/mqtt/ar).a(com/facebook/push/annotations/HighestMqttPersistence).c(com/facebook/push/mqtt/g);
        a(java/lang/Integer).a(com/facebook/push/annotations/KeepaliveDelayAdjustmentPercentage).c(com/facebook/push/mqtt/n);
        a(com/facebook/push/mqtt/bx).a(new bl(null)).d();
        c(com/facebook/push/mqtt/as).a(com/facebook/push/mqtt/f);
        a(com/facebook/push/mqtt/a).a(new az(this, null));
        a(com/facebook/push/mqtt/f).a(new bb(this, null));
        c(com/facebook/analytics/d/a).a(com/facebook/push/mqtt/at);
        a(com/facebook/base/c, com/facebook/common/init/NeedsLowPriorityInitOnUiThread).a(com/facebook/push/mqtt/ai).a(com/facebook/push/mqtt/s);
        c(com/facebook/push/mqtt/av);
        c(com/facebook/push/mqtt/i);
        c(com/facebook/push/f).a(com/facebook/push/mqtt/aw);
        b(java/lang/Boolean).a(com/facebook/push/annotations/IsMobileOnlineAvailabilityEnabled).a(Boolean.valueOf(false));
        b(java/lang/Boolean).a(com/facebook/push/annotations/IsDeviceForegroundEnabled).a(Boolean.valueOf(false));
        c(com/facebook/push/mqtt/ck);
        a(java/lang/Long).a(com/facebook/push/annotations/MqttEndpointCapability).c(com/facebook/push/mqtt/ah);
        a(com/facebook/push/mqtt/at).a(new bj(this, null)).a();
        c(com/facebook/abtest/qe/f/b).a(com/facebook/push/mqtt/abtest/d);
        a(com/facebook/push/mqtt/abtest/a).a(new bm(this, null)).a();
        a(com/facebook/push/mqtt/d).a(new ba(this, null));
        a(com/facebook/push/mqtt/ap).a(new bi(this, null));
        a(com/facebook/push/mqtt/an).a(new bh(this, null)).a();
    }
}
