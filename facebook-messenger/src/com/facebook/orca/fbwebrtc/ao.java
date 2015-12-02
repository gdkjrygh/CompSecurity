// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.fbwebrtc;

import com.facebook.auth.credentials.UserTokenCredentials;
import com.facebook.e.c;
import com.facebook.inject.d;
import com.facebook.orca.annotations.IsVoipP2PDisabledForUser;
import com.facebook.orca.annotations.IsVoipWifiCallingOnly;
import com.facebook.orca.annotations.ShouldSendIceAfterAnswer;

// Referenced classes of package com.facebook.orca.fbwebrtc:
//            n, m, ai, aj

class ao extends d
{

    final ai a;

    private ao(ai ai)
    {
        a = ai;
        super();
    }

    ao(ai ai, aj aj)
    {
        this(ai);
    }

    public n a()
    {
        return new n(b(com/facebook/auth/credentials/UserTokenCredentials), b(java/lang/Boolean, com/facebook/orca/annotations/IsVoipWifiCallingOnly), b(java/lang/Boolean, com/facebook/orca/annotations/IsVoipP2PDisabledForUser), b(java/lang/Boolean, com/facebook/orca/annotations/ShouldSendIceAfterAnswer), (m)a(com/facebook/orca/fbwebrtc/m), (c)a(com/facebook/e/c));
    }

    public Object b()
    {
        return a();
    }
}
