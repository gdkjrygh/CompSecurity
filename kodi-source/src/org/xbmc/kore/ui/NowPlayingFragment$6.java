// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.xbmc.kore.ui;

import org.xbmc.kore.host.HostConnectionObserver;
import org.xbmc.kore.jsonrpc.ApiCallback;

// Referenced classes of package org.xbmc.kore.ui:
//            NowPlayingFragment

class this._cls0
    implements ApiCallback
{

    final NowPlayingFragment this$0;

    public void onError(int i, String s)
    {
    }

    public volatile void onSuccess(Object obj)
    {
        onSuccess((String)obj);
    }

    public void onSuccess(String s)
    {
        if (!isAdded())
        {
            return;
        } else
        {
            NowPlayingFragment.access$300(NowPlayingFragment.this).forceRefreshResults();
            return;
        }
    }

    ver()
    {
        this$0 = NowPlayingFragment.this;
        super();
    }
}
