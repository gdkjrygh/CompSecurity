// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.ui.player.premierleague.playbyplay;

import java.util.List;
import org.apache.commons.collections4.CollectionUtils;
import rx.Subscriber;
import timber.log.Timber;

// Referenced classes of package com.nbcsports.liveextra.ui.player.premierleague.playbyplay:
//            PlayByPlayPresenter, PlayByPlayView

class this._cls0 extends Subscriber
{

    final PlayByPlayPresenter this$0;

    public void onCompleted()
    {
    }

    public void onError(Throwable throwable)
    {
        Timber.w(throwable, "Error updating play by play", new Object[0]);
    }

    public volatile void onNext(Object obj)
    {
        onNext((List)obj);
    }

    public void onNext(List list)
    {
        while (!hasView() || CollectionUtils.isEmpty(list)) 
        {
            return;
        }
        ((PlayByPlayView)PlayByPlayPresenter.access$000(PlayByPlayPresenter.this)).bind(list);
    }

    ()
    {
        this$0 = PlayByPlayPresenter.this;
        super();
    }
}
