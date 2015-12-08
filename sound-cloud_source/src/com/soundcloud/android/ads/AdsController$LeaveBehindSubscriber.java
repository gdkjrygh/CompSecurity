// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.ads;

import com.soundcloud.android.rx.observers.DefaultSubscriber;
import com.soundcloud.java.collections.PropertySet;

// Referenced classes of package com.soundcloud.android.ads:
//            AdsController, AdsOperations, LeaveBehindProperty

private class <init> extends DefaultSubscriber
{

    final AdsController this$0;

    public void onNext(com.soundcloud.android.playback.> >)
    {
        if (AdsController.access$100(AdsController.this).isCurrentItemAudioAd() && >._mth0())
        {
            AdsController.access$100(AdsController.this).getMonetizableTrackMetaData().put(LeaveBehindProperty.META_AD_COMPLETED, Boolean.valueOf(true));
        }
    }

    public volatile void onNext(Object obj)
    {
        onNext((com.soundcloud.android.playback.t)obj);
    }

    private ()
    {
        this$0 = AdsController.this;
        super();
    }

    this._cls0(this._cls0 _pcls0)
    {
        this();
    }
}
