// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android;

import Bc;
import Br;
import Mf;
import NV;
import com.snapchat.android.util.eventbus.SnapCaptureContext;
import com.squareup.otto.Bus;

// Referenced classes of package com.snapchat.android:
//            LandingPageActivity

final class a
    implements Runnable
{

    private Bc a;
    private LandingPageActivity b;

    public final void run()
    {
        b.mUser = Br.a(b);
        Mf.a().a(new NV(a, SnapCaptureContext.SHARE_EXTENSION));
    }

    ureContext(LandingPageActivity landingpageactivity, Bc bc)
    {
        b = landingpageactivity;
        a = bc;
        super();
    }
}
