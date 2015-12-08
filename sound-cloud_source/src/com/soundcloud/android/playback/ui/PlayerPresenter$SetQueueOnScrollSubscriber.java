// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.playback.ui;

import com.soundcloud.android.ads.AdsOperations;
import com.soundcloud.android.rx.observers.DefaultSubscriber;

// Referenced classes of package com.soundcloud.android.playback.ui:
//            PlayerPresenter

private final class <init> extends DefaultSubscriber
{

    final PlayerPresenter this$0;

    public final void onNext(Integer integer)
    {
label0:
        {
            if (PlayerPresenter.access$500(PlayerPresenter.this))
            {
                if (!PlayerPresenter.access$000(PlayerPresenter.this).isCurrentItemAudioAd())
                {
                    break label0;
                }
                PlayerPresenter.access$1600(PlayerPresenter.this);
            }
            return;
        }
        PlayerPresenter.access$1500(PlayerPresenter.this);
    }

    public final volatile void onNext(Object obj)
    {
        onNext((Integer)obj);
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
