// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.playlists;

import com.soundcloud.android.offline.OfflineState;
import com.soundcloud.android.rx.observers.DefaultSubscriber;
import com.soundcloud.java.collections.PropertySet;

// Referenced classes of package com.soundcloud.android.playlists:
//            PlaylistEngagementsPresenter, PlaylistEngagementsView

private class <init> extends DefaultSubscriber
{

    final PlaylistEngagementsPresenter this$0;

    public void onNext(PropertySet propertyset)
    {
        if (!((Boolean)propertyset.get(com.soundcloud.android.offline.r)).booleanValue())
        {
            PlaylistEngagementsPresenter.access$600(PlaylistEngagementsPresenter.this).showOfflineState(OfflineState.NO_OFFLINE);
        }
    }

    public volatile void onNext(Object obj)
    {
        onNext((PropertySet)obj);
    }

    private ()
    {
        this$0 = PlaylistEngagementsPresenter.this;
        super();
    }

    this._cls0(this._cls0 _pcls0)
    {
        this();
    }
}
