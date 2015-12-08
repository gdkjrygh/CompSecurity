// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.likes;

import android.view.View;
import com.soundcloud.android.main.Screen;
import com.soundcloud.android.offline.OfflinePlaybackOperations;
import com.soundcloud.android.playback.PlaySessionSource;
import javax.inject.Provider;
import rx.X;
import rx.b;

// Referenced classes of package com.soundcloud.android.likes:
//            TrackLikesHeaderPresenter

class this._cls0
    implements android.view.aderPresenter._cls2
{

    final TrackLikesHeaderPresenter this$0;

    public void onClick(View view)
    {
        TrackLikesHeaderPresenter.access$300(TrackLikesHeaderPresenter.this).playLikedTracksShuffled(new PlaySessionSource(Screen.LIKES)).doOnCompleted(TrackLikesHeaderPresenter.access$200(TrackLikesHeaderPresenter.this)).subscribe((X)TrackLikesHeaderPresenter.access$100(TrackLikesHeaderPresenter.this).get());
    }

    ()
    {
        this$0 = TrackLikesHeaderPresenter.this;
        super();
    }
}
