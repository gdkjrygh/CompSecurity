// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.xbmc.kore.ui;

import android.view.View;
import org.xbmc.kore.host.HostManager;
import org.xbmc.kore.jsonrpc.ApiMethod;

// Referenced classes of package org.xbmc.kore.ui:
//            NowPlayingFragment

class val.action
    implements android.view.t._cls3
{

    final NowPlayingFragment this$0;
    final ApiMethod val$action;

    public void onClick(View view)
    {
        val$action.execute(NowPlayingFragment.access$000(NowPlayingFragment.this).getConnection(), NowPlayingFragment.access$100(NowPlayingFragment.this), NowPlayingFragment.access$200(NowPlayingFragment.this));
    }

    ()
    {
        this$0 = final_nowplayingfragment;
        val$action = ApiMethod.this;
        super();
    }
}
