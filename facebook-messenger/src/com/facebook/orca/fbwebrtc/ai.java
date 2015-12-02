// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.fbwebrtc;

import com.facebook.auth.f.b;
import com.facebook.common.init.NeedsLowPriorityInitOnBackgroundThread;
import com.facebook.inject.a.a;
import com.facebook.inject.a.g;
import com.facebook.inject.aj;
import com.facebook.inject.c;
import com.facebook.orca.annotations.IsVoipEnabledForUser;
import com.facebook.orca.annotations.IsVoipP2PDisabledForUser;
import com.facebook.orca.annotations.IsVoipShowFreeCallDisclaimer;
import com.facebook.orca.annotations.IsVoipWifiCallingOnly;
import com.facebook.orca.annotations.ShouldSendIceAfterAnswer;
import com.facebook.push.mqtt.i;

// Referenced classes of package com.facebook.orca.fbwebrtc:
//            b, c, d, e, 
//            h, ag, ar, bb, 
//            av, az, au, n, 
//            ao, ae, ap, ax, 
//            at, i, al, l, 
//            am, aw, as, a, 
//            ak, m, an, af, 
//            aq

public class ai extends c
{

    public ai()
    {
    }

    protected void a()
    {
        a(java/lang/Boolean).a(com/facebook/orca/annotations/IsVoipEnabledForUser).c(com/facebook/orca/fbwebrtc/b);
        a(java/lang/Boolean).a(com/facebook/orca/annotations/IsVoipP2PDisabledForUser).c(com/facebook/orca/fbwebrtc/c);
        a(java/lang/Boolean).a(com/facebook/orca/annotations/IsVoipShowFreeCallDisclaimer).c(com/facebook/orca/fbwebrtc/d);
        a(java/lang/Boolean).a(com/facebook/orca/annotations/IsVoipWifiCallingOnly).c(com/facebook/orca/fbwebrtc/e);
        a(java/lang/Boolean).a(com/facebook/orca/annotations/ShouldSendIceAfterAnswer).c(com/facebook/orca/fbwebrtc/h);
        a(com/facebook/orca/fbwebrtc/ag).a(new ar(this, null)).a();
        a(com/facebook/base/c, com/facebook/common/init/NeedsLowPriorityInitOnBackgroundThread).a(com/facebook/orca/fbwebrtc/ag);
        a(com/facebook/orca/fbwebrtc/bb).a(new av(this, null)).a();
        a(com/facebook/orca/fbwebrtc/az).a(new au(this, null)).a();
        a(com/facebook/orca/fbwebrtc/n).a(new ao(this, null)).a();
        a(com/facebook/orca/fbwebrtc/ae).a(new ap(this, null)).a();
        a(com/facebook/orca/fbwebrtc/ax).a(new at(this, null)).a();
        a(com/facebook/orca/fbwebrtc/i).a(new al(this, null)).a();
        a(com/facebook/orca/fbwebrtc/l).a(new am(this, null)).a();
        a(com/facebook/orca/fbwebrtc/aw).a(new as(this, null));
        c(com/facebook/push/mqtt/i).a(com/facebook/orca/fbwebrtc/aw);
        a(com/facebook/orca/fbwebrtc/a).a(new ak(this, null)).a();
        a(com/facebook/orca/fbwebrtc/m).a(new an(this, null)).a();
        a(com/facebook/orca/fbwebrtc/af).a(new aq(this, null));
        c(com/facebook/auth/f/b).a(com/facebook/orca/fbwebrtc/af);
    }
}
