// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.tracks;

import com.soundcloud.android.rx.observers.DefaultSubscriber;
import com.soundcloud.java.collections.PropertySet;

// Referenced classes of package com.soundcloud.android.tracks:
//            TrackItemMenuPresenter

class init> extends DefaultSubscriber
{

    final TrackItemMenuPresenter this$0;

    public void onNext(PropertySet propertyset)
    {
        TrackItemMenuPresenter.access$100(TrackItemMenuPresenter.this).onPlaylistTrackRemoved(TrackItemMenuPresenter.access$000(TrackItemMenuPresenter.this));
    }

    public volatile void onNext(Object obj)
    {
        onNext((PropertySet)obj);
    }

    moveTrackListener()
    {
        this$0 = TrackItemMenuPresenter.this;
        super();
    }
}
