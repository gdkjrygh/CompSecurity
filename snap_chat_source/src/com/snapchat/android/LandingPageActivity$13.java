// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android;

import Br;
import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;

// Referenced classes of package com.snapchat.android:
//            LandingPageActivity

final class a
    implements ServiceConnection
{

    private LandingPageActivity a;

    public final void onServiceConnected(ComponentName componentname, IBinder ibinder)
    {
        if (ibinder instanceof com.snapchat.android.util.chat.)
        {
            LandingPageActivity.c = ((com.snapchat.android.util.chat.)ibinder)._fld0;
            LandingPageActivity.a(a, true);
            if (a.mUser == null)
            {
                LandingPageActivity.b(a, true);
            } else
            if (a.g() && a.mUser.mMessagingGatewayInfo != null)
            {
                LandingPageActivity.o();
                return;
            }
        }
    }

    public final void onServiceDisconnected(ComponentName componentname)
    {
        LandingPageActivity.c = null;
        LandingPageActivity.a(a, false);
        LandingPageActivity.b(a, false);
    }

    vice.a(LandingPageActivity landingpageactivity)
    {
        a = landingpageactivity;
        super();
    }
}
