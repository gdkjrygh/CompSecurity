// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.ads;

import rx.b.f;

// Referenced classes of package com.soundcloud.android.ads:
//            AdsController, AdsOperations

class this._cls0
    implements f
{

    final AdsController this$0;

    public Boolean call(com.soundcloud.android.playback.sition sition)
    {
        boolean flag;
        if (sition.isBuffering() && AdsController.access$100(AdsController.this).isCurrentItemAudioAd())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        return Boolean.valueOf(flag);
    }

    public volatile Object call(Object obj)
    {
        return call((com.soundcloud.android.playback.sition)obj);
    }

    eTransition()
    {
        this$0 = AdsController.this;
        super();
    }
}
