// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.library.tve;

import android.content.Context;
import com.phunware.nbc.sochi.system.NBCSystem;
import rx.Subscriber;
import rx.subscriptions.CompositeSubscription;

// Referenced classes of package com.nbcsports.liveextra.library.tve:
//            PlaybackDelegate

class this._cls0 extends Subscriber
{

    final PlaybackDelegate this$0;

    public void onCompleted()
    {
    }

    public void onError(Throwable throwable)
    {
    }

    public void onNext(Boolean boolean1)
    {
        if (boolean1.booleanValue())
        {
            PlaybackDelegate.access$200(PlaybackDelegate.this).add(PlaybackDelegate.access$300(PlaybackDelegate.this));
            return;
        }
        if (!NBCSystem.IS_GEO_LOCATION_ENABLED)
        {
            PlaybackDelegate.access$400(PlaybackDelegate.this);
            return;
        } else
        {
            PlaybackDelegate.access$600(PlaybackDelegate.this, PlaybackDelegate.access$500(PlaybackDelegate.this).getString(0x7f07017a), PlaybackDelegate.access$500(PlaybackDelegate.this).getString(0x7f07006b));
            return;
        }
    }

    public volatile void onNext(Object obj)
    {
        onNext((Boolean)obj);
    }

    ()
    {
        this$0 = PlaybackDelegate.this;
        super();
    }
}
