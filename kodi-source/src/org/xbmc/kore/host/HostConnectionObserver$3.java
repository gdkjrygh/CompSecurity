// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.xbmc.kore.host;

import java.util.ArrayList;
import org.xbmc.kore.jsonrpc.ApiCallback;
import org.xbmc.kore.utils.LogUtils;

// Referenced classes of package org.xbmc.kore.host:
//            HostConnectionObserver

class this._cls0
    implements ApiCallback
{

    final HostConnectionObserver this$0;

    public void onError(int i, String s)
    {
        LogUtils.LOGD(HostConnectionObserver.TAG, "Notifying error");
        HostConnectionObserver.access$600(HostConnectionObserver.this, i, s, HostConnectionObserver.access$000(HostConnectionObserver.this));
    }

    public volatile void onSuccess(Object obj)
    {
        onSuccess((ArrayList)obj);
    }

    public void onSuccess(ArrayList arraylist)
    {
        if (arraylist.isEmpty())
        {
            LogUtils.LOGD(HostConnectionObserver.TAG, "Nothing is playing");
            HostConnectionObserver.access$700(HostConnectionObserver.this, HostConnectionObserver.access$000(HostConnectionObserver.this));
            return;
        } else
        {
            HostConnectionObserver.access$800(HostConnectionObserver.this, (org.xbmc.kore.jsonrpc.type.rsReturnType)arraylist.get(0));
            return;
        }
    }

    ivePlayersReturnType()
    {
        this$0 = HostConnectionObserver.this;
        super();
    }
}
