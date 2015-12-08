// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.xbmc.kore.host;

import android.os.Handler;
import java.util.List;

// Referenced classes of package org.xbmc.kore.host:
//            HostConnectionObserver

class this._cls0
    implements Runnable
{

    final HostConnectionObserver this$0;

    public void run()
    {
        if (HostConnectionObserver.access$000(HostConnectionObserver.this).size() == 0)
        {
            return;
        } else
        {
            HostConnectionObserver.access$100(HostConnectionObserver.this);
            HostConnectionObserver.access$200(HostConnectionObserver.this).postDelayed(this, 3000L);
            return;
        }
    }

    ()
    {
        this$0 = HostConnectionObserver.this;
        super();
    }
}
