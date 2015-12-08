// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.playback.ui;

import android.view.View;
import com.soundcloud.android.rx.observers.DefaultSubscriber;

// Referenced classes of package com.soundcloud.android.playback.ui:
//            PlayerPagerPresenter, PlayerPagePresenter, PlayerItem

private static class pageView extends DefaultSubscriber
{

    private final View pageView;
    private final PlayerPagePresenter presenter;

    public void onNext(PlayerItem playeritem)
    {
        presenter.bindItemView(pageView, playeritem);
    }

    public volatile void onNext(Object obj)
    {
        onNext((PlayerItem)obj);
    }

    public (PlayerPagePresenter playerpagepresenter, View view)
    {
        presenter = playerpagepresenter;
        pageView = view;
    }
}
