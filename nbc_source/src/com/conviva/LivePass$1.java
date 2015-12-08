// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.conviva;

import com.conviva.monitor.PlayerStates;
import com.conviva.session.SessionFactory;
import com.conviva.utils.PlatformUtils;
import com.conviva.utils.Settings;
import java.util.concurrent.Callable;

// Referenced classes of package com.conviva:
//            LivePass

static final class sionFactory
    implements Callable
{

    public volatile Object call()
        throws Exception
    {
        return call();
    }

    public Void call()
        throws Exception
    {
        if (LivePass.access$000())
        {
            LivePass.access$100().enableLogging = LivePass.access$200();
        }
        LivePass.access$300().log((new StringBuilder()).append("LivePass.init url=").append(LivePass.access$100().gatewayUrl).append(", customerKey=").append(LivePass.access$100().customerKey).toString());
        PlayerStates.init();
        SessionFactory _tmp = LivePass.access$402(new SessionFactory());
        boolean _tmp1 = LivePass.access$502(true);
        return null;
    }

    sionFactory()
    {
    }
}
