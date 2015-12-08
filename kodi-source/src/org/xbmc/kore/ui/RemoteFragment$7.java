// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.xbmc.kore.ui;

import org.xbmc.kore.jsonrpc.ApiCallback;
import org.xbmc.kore.utils.UIUtils;

// Referenced classes of package org.xbmc.kore.ui:
//            RemoteFragment

class this._cls0
    implements ApiCallback
{

    final RemoteFragment this$0;

    public void onError(int i, String s)
    {
    }

    public void onSuccess(Integer integer)
    {
        if (!isAdded())
        {
            return;
        } else
        {
            UIUtils.setPlayPauseButtonIcon(getActivity(), playButton, integer.intValue());
            return;
        }
    }

    public volatile void onSuccess(Object obj)
    {
        onSuccess((Integer)obj);
    }

    ()
    {
        this$0 = RemoteFragment.this;
        super();
    }
}
