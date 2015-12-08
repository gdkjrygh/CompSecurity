// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.likes;

import android.support.v4.app.Fragment;
import com.soundcloud.android.configuration.FeatureOperations;
import com.soundcloud.android.rx.observers.DefaultSubscriber;
import java.util.List;

// Referenced classes of package com.soundcloud.android.likes:
//            TrackLikesPresenter, TrackLikesHeaderPresenter

private class <init> extends DefaultSubscriber
{

    final TrackLikesPresenter this$0;

    public volatile void onNext(Object obj)
    {
        onNext((List)obj);
    }

    public void onNext(List list)
    {
        headerPresenter.updateTrackCount(list.size());
        Fragment fragment = TrackLikesPresenter.access$200(TrackLikesPresenter.this);
        boolean flag;
        if (!list.isEmpty() && TrackLikesPresenter.access$100(TrackLikesPresenter.this).isOfflineContentOrUpsellEnabled())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        fragment.setMenuVisibility(flag);
    }

    private ()
    {
        this$0 = TrackLikesPresenter.this;
        super();
    }

    this._cls0(this._cls0 _pcls0)
    {
        this();
    }
}
