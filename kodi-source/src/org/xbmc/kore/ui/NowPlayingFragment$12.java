// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.xbmc.kore.ui;

import org.xbmc.kore.jsonrpc.ApiCallback;
import org.xbmc.kore.utils.LogUtils;

// Referenced classes of package org.xbmc.kore.ui:
//            NowPlayingFragment

class this._cls0
    implements ApiCallback
{

    final NowPlayingFragment this$0;

    public void onError(int i, String s)
    {
        LogUtils.LOGD(NowPlayingFragment.access$1100(), (new StringBuilder()).append("Got an error activating subtitles window. Error: ").append(s).toString());
    }

    public volatile void onSuccess(Object obj)
    {
        onSuccess((String)obj);
    }

    public void onSuccess(String s)
    {
        LogUtils.LOGD(NowPlayingFragment.access$1100(), "Sucessfully activated subtitles window.");
    }

    ()
    {
        this$0 = NowPlayingFragment.this;
        super();
    }
}
