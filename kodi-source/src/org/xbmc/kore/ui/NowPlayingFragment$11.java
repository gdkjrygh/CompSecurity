// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.xbmc.kore.ui;

import android.widget.Toast;
import org.xbmc.kore.jsonrpc.ApiCallback;

// Referenced classes of package org.xbmc.kore.ui:
//            NowPlayingFragment

class this._cls0
    implements ApiCallback
{

    final NowPlayingFragment this$0;

    public void onError(int i, String s)
    {
        if (!isAdded())
        {
            return;
        } else
        {
            Toast.makeText(getActivity(), String.format(getString(0x7f07003d), new Object[] {
                s
            }), 0).show();
            return;
        }
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
            NowPlayingFragment.access$800(NowPlayingFragment.this).SwitchToRemotePanel();
            return;
        }
    }

    PlayingListener()
    {
        this$0 = NowPlayingFragment.this;
        super();
    }
}
