// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.xbmc.kore.host;

import android.os.Handler;
import java.util.List;
import org.xbmc.kore.jsonrpc.ApiCallback;

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
            (new org.xbmc.kore.jsonrpc.method.()).(HostConnectionObserver.access$300(HostConnectionObserver.this), new ApiCallback() {

                final HostConnectionObserver._cls2 this$1;

                public void onError(int i, String s)
                {
                    HostConnectionObserver.access$600(this$0, i, s, HostConnectionObserver.access$000(this$0));
                    HostConnectionObserver.access$200(this$0).postDelayed(HostConnectionObserver.access$500(this$0), 2000L);
                }

                public volatile void onSuccess(Object obj)
                {
                    onSuccess((String)obj);
                }

                public void onSuccess(String s)
                {
                    if (HostConnectionObserver.access$400(this$0) == 0 || HostConnectionObserver.access$400(this$0) == 1)
                    {
                        HostConnectionObserver.access$100(this$0);
                    }
                    HostConnectionObserver.access$200(this$0).postDelayed(HostConnectionObserver.access$500(this$0), 10000L);
                }

            
            {
                this$1 = HostConnectionObserver._cls2.this;
                super();
            }
            }, HostConnectionObserver.access$200(HostConnectionObserver.this));
            return;
        }
    }

    _cls1.this._cls1()
    {
        this$0 = HostConnectionObserver.this;
        super();
    }
}
