// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.fbwebrtc;

import com.facebook.c.s;
import com.facebook.e.c;
import com.facebook.inject.d;
import com.facebook.orca.annotations.IsVoipShowFreeCallDisclaimer;
import com.facebook.orca.annotations.IsVoipWifiCallingOnly;
import com.facebook.push.mqtt.v;

// Referenced classes of package com.facebook.orca.fbwebrtc:
//            i, ae, ag, ai, 
//            aj

class al extends d
{

    final ai a;

    private al(ai ai)
    {
        a = ai;
        super();
    }

    al(ai ai, aj aj)
    {
        this(ai);
    }

    public i a()
    {
        return new i((s)a(com/facebook/c/s), (com.facebook.prefs.shared.d)a(com/facebook/prefs/shared/d), (v)a(com/facebook/push/mqtt/v), (ae)a(com/facebook/orca/fbwebrtc/ae), (ag)a(com/facebook/orca/fbwebrtc/ag), (c)a(com/facebook/e/c), b(java/lang/Boolean, com/facebook/orca/annotations/IsVoipShowFreeCallDisclaimer), b(java/lang/Boolean, com/facebook/orca/annotations/IsVoipWifiCallingOnly));
    }

    public Object b()
    {
        return a();
    }
}
