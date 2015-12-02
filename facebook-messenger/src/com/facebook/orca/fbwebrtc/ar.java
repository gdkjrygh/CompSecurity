// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.fbwebrtc;

import android.support.v4.a.e;
import android.telephony.TelephonyManager;
import com.facebook.breakpad.BreakpadManager;
import com.facebook.common.executors.ForUiThread;
import com.facebook.e.c;
import com.facebook.inject.d;
import com.facebook.orca.annotations.IsVoipEnabledForUser;
import com.facebook.orca.annotations.IsVoipWifiCallingOnly;
import com.facebook.push.mqtt.v;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.concurrent.ScheduledExecutorService;

// Referenced classes of package com.facebook.orca.fbwebrtc:
//            ag, az, bb, n, 
//            ae, ai, aj

class ar extends d
{

    final ai a;

    private ar(ai ai)
    {
        a = ai;
        super();
    }

    ar(ai ai, aj aj)
    {
        this(ai);
    }

    public ag a()
    {
        return new ag((TelephonyManager)a(android/telephony/TelephonyManager), (e)a(android/support/v4/a/e), (ScheduledExecutorService)a(java/util/concurrent/ScheduledExecutorService, com/facebook/common/executors/ForUiThread), (BreakpadManager)a(com/facebook/breakpad/BreakpadManager), (v)a(com/facebook/push/mqtt/v), b(java/lang/Boolean, com/facebook/orca/annotations/IsVoipEnabledForUser), b(java/lang/Boolean, com/facebook/orca/annotations/IsVoipWifiCallingOnly), (az)a(com/facebook/orca/fbwebrtc/az), (bb)a(com/facebook/orca/fbwebrtc/bb), (n)a(com/facebook/orca/fbwebrtc/n), (ae)a(com/facebook/orca/fbwebrtc/ae), (c)a(com/facebook/e/c), (ObjectMapper)a(com/fasterxml/jackson/databind/ObjectMapper));
    }

    public Object b()
    {
        return a();
    }
}
