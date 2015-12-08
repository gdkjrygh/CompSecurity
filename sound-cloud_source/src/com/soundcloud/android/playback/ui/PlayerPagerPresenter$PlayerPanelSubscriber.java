// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.playback.ui;

import android.view.View;
import com.soundcloud.android.events.PlayerUIEvent;
import com.soundcloud.android.rx.observers.DefaultSubscriber;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.soundcloud.android.playback.ui:
//            PlayerPagerPresenter, PlayerPageData

private final class <init> extends DefaultSubscriber
{

    final PlayerPagerPresenter this$0;

    public final void onNext(PlayerUIEvent playeruievent)
    {
        PlayerPagerPresenter.access$1102(PlayerPagerPresenter.this, playeruievent);
        PlayerPagePresenter playerpagepresenter;
        Object obj;
        for (Iterator iterator = PlayerPagerPresenter.access$1200(PlayerPagerPresenter.this).entrySet().iterator(); iterator.hasNext(); PlayerPagerPresenter.access$1400(PlayerPagerPresenter.this, playeruievent, playerpagepresenter, ((View) (obj))))
        {
            obj = (java.util.r)iterator.next();
            playerpagepresenter = PlayerPagerPresenter.access$1300(PlayerPagerPresenter.this, (PlayerPageData)((java.util.er) (obj)).er());
            obj = (View)((java.util.er) (obj)).er();
        }

    }

    public final volatile void onNext(Object obj)
    {
        onNext((PlayerUIEvent)obj);
    }

    private ()
    {
        this$0 = PlayerPagerPresenter.this;
        super();
    }

    this._cls0(this._cls0 _pcls0)
    {
        this();
    }
}
