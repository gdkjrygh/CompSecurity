// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.xbmc.kore.host;

import android.os.Handler;
import java.util.List;
import org.xbmc.kore.jsonrpc.ApiCallback;

// Referenced classes of package org.xbmc.kore.host:
//            HostConnectionObserver

class this._cls1
    implements ApiCallback
{

    final is._cls0 this$1;

    public void onError(int i, String s)
    {
        HostConnectionObserver.access$600(_fld0, i, s, HostConnectionObserver.access$000(_fld0));
        HostConnectionObserver.access$200(_fld0).postDelayed(HostConnectionObserver.access$500(_fld0), 2000L);
    }

    public volatile void onSuccess(Object obj)
    {
        onSuccess((String)obj);
    }

    public void onSuccess(String s)
    {
        if (HostConnectionObserver.access$400(_fld0) == 0 || HostConnectionObserver.access$400(_fld0) == 1)
        {
            HostConnectionObserver.access$100(_fld0);
        }
        HostConnectionObserver.access$200(_fld0).postDelayed(HostConnectionObserver.access$500(_fld0), 10000L);
    }

    is._cls0()
    {
        this$1 = this._cls1.this;
        super();
    }

    // Unreferenced inner class org/xbmc/kore/host/HostConnectionObserver$2

/* anonymous class */
    class HostConnectionObserver._cls2
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
                (new org.xbmc.kore.jsonrpc.method.JSONRPC.Ping()).execute(HostConnectionObserver.access$300(HostConnectionObserver.this), new HostConnectionObserver._cls2._cls1(), HostConnectionObserver.access$200(HostConnectionObserver.this));
                return;
            }
        }

            
            {
                this$0 = HostConnectionObserver.this;
                super();
            }
    }

}
