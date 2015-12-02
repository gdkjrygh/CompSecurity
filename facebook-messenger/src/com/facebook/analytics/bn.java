// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.analytics;

import android.telephony.TelephonyManager;
import com.facebook.analytics.c.g;
import com.facebook.analytics.service.u;
import com.facebook.analytics.service.v;
import com.facebook.common.hardware.k;
import com.facebook.config.a.c;
import com.facebook.config.b.a;
import com.facebook.device_id.l;
import com.facebook.http.protocol.aq;
import com.facebook.inject.ab;
import com.facebook.inject.d;

// Referenced classes of package com.facebook.analytics:
//            ay, az

class bn extends d
{

    final ay a;

    private bn(ay ay)
    {
        a = ay;
        super();
    }

    bn(ay ay, az az)
    {
        this(ay);
    }

    public u a()
    {
        return new u((a)a(com/facebook/config/b/a), (c)a(com/facebook/config/a/c), (g)a(com/facebook/analytics/c/g), (TelephonyManager)e().a(android/telephony/TelephonyManager), (l)a(com/facebook/device_id/l), (k)a(com/facebook/common/hardware/k), (aq)a(com/facebook/http/protocol/aq), (v)a(com/facebook/analytics/service/v), (com.facebook.common.time.a)a(com/facebook/common/time/a));
    }

    public Object b()
    {
        return a();
    }
}
