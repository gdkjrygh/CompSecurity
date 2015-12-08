// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.likes;

import com.soundcloud.android.configuration.FeatureOperations;
import com.soundcloud.android.offline.OfflineState;
import com.soundcloud.android.rx.observers.DefaultSubscriber;

// Referenced classes of package com.soundcloud.android.likes:
//            TrackLikesHeaderPresenter, TrackLikesHeaderView

private class <init> extends DefaultSubscriber
{

    final TrackLikesHeaderPresenter this$0;

    public void onNext(OfflineState offlinestate)
    {
        if (TrackLikesHeaderPresenter.access$600(TrackLikesHeaderPresenter.this).isOfflineContentEnabled())
        {
            TrackLikesHeaderPresenter.access$700(TrackLikesHeaderPresenter.this).show(offlinestate);
        }
    }

    public volatile void onNext(Object obj)
    {
        onNext((OfflineState)obj);
    }

    private ()
    {
        this$0 = TrackLikesHeaderPresenter.this;
        super();
    }

    this._cls0(this._cls0 _pcls0)
    {
        this();
    }
}
