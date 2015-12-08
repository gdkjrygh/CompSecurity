// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.playback.ui;

import com.soundcloud.android.events.PlayQueueEvent;
import com.soundcloud.android.playback.ui.view.PlayerTrackPager;
import com.soundcloud.android.rx.observers.DefaultSubscriber;

// Referenced classes of package com.soundcloud.android.playback.ui:
//            PlayerPresenter

private final class <init> extends DefaultSubscriber
{

    final PlayerPresenter this$0;

    public final void onNext(PlayQueueEvent playqueueevent)
    {
        if (playqueueevent.audioAdRemoved() && PlayerPresenter.access$1300(PlayerPresenter.this))
        {
            PlayerPresenter.access$502(PlayerPresenter.this, true);
            PlayerPresenter.access$1400(PlayerPresenter.this).setCurrentItem(PlayerPresenter.access$1400(PlayerPresenter.this).getCurrentItem() + 1, true);
        } else
        if (!PlayerPresenter.access$500(PlayerPresenter.this))
        {
            PlayerPresenter.access$1500(PlayerPresenter.this);
            return;
        }
    }

    public final volatile void onNext(Object obj)
    {
        onNext((PlayQueueEvent)obj);
    }

    private ()
    {
        this$0 = PlayerPresenter.this;
        super();
    }

    this._cls0(this._cls0 _pcls0)
    {
        this();
    }
}
