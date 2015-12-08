// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.skippy;

import java.net.Proxy;
import java.util.TimerTask;

// Referenced classes of package com.soundcloud.android.skippy:
//            ServiceAvailability, ProxyUtils

class is._cls0 extends TimerTask
{

    is._cls0 httpHealthChecker;
    final is._cls0 this$1;

    public boolean cancel()
    {
        httpHealthChecker.ncel(false);
        return super.cancel();
    }

    public void run()
    {
        httpHealthChecker.ecute(new Proxy[] {
            ServiceAvailability.access$300(_fld0).getSystemProxy()
        });
    }

    ()
    {
        this$1 = this._cls1.this;
        super();
        httpHealthChecker = new nit>(_fld0, null);
    }
}
