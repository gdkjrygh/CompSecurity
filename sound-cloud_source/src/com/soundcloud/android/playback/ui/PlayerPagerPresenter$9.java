// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.playback.ui;

import android.view.View;
import rx.b.f;

// Referenced classes of package com.soundcloud.android.playback.ui:
//            PlayerPagerPresenter, PlayerItem

class val.pageView
    implements f
{

    final PlayerPagerPresenter this$0;
    final View val$pageView;

    public Boolean call(PlayerItem playeritem)
    {
        return PlayerPagerPresenter.access$1000(PlayerPagerPresenter.this, val$pageView, playeritem);
    }

    public volatile Object call(Object obj)
    {
        return call((PlayerItem)obj);
    }

    ()
    {
        this$0 = final_playerpagerpresenter;
        val$pageView = View.this;
        super();
    }
}
