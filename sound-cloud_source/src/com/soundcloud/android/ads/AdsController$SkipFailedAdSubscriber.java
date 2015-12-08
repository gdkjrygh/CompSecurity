// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.ads;

import com.soundcloud.android.rx.observers.DefaultSubscriber;
import java.util.concurrent.TimeUnit;
import rx.Y;
import rx.b;

// Referenced classes of package com.soundcloud.android.ads:
//            AdsController

private final class <init> extends DefaultSubscriber
{

    final AdsController this$0;

    public final void onNext(final com.soundcloud.android.playback.> state)
    {
        AdsController.access$300(AdsController.this).unsubscribe();
        class _cls1 extends DefaultSubscriber
        {

            final AdsController.SkipFailedAdSubscriber this$1;
            final com.soundcloud.android.playback.Player.StateTransition val$state;

            public void onNext(Long long1)
            {
                long1 = new AudioAdFailedToBufferEvent(state.getTrackUrn(), state.getProgress(), 6);
                AdsController.access$1500(this$0).publish(EventQueue.TRACKING, long1);
                AdsController.access$000(this$0).autoNextItem();
            }

            public volatile void onNext(Object obj)
            {
                onNext((Long)obj);
            }

            _cls1()
            {
                this$1 = AdsController.SkipFailedAdSubscriber.this;
                state = statetransition;
                super();
            }
        }

        AdsController.access$302(AdsController.this, b.timer(6L, TimeUnit.SECONDS, AdsController.access$1600(AdsController.this)).subscribe(new _cls1()));
    }

    public final volatile void onNext(Object obj)
    {
        onNext((com.soundcloud.android.playback.t)obj);
    }

    private _cls1()
    {
        this$0 = AdsController.this;
        super();
    }

    this._cls0(this._cls0 _pcls0)
    {
        this();
    }
}
