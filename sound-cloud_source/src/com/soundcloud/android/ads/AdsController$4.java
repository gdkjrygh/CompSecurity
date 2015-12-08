// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.ads;

import com.soundcloud.android.playback.PlayQueueManager;
import rx.b.f;

// Referenced classes of package com.soundcloud.android.ads:
//            AdsController, AdsOperations

class this._cls0
    implements f
{

    final AdsController this$0;

    public Boolean call(Object obj)
    {
        boolean flag;
        if (!AdsController.access$100(AdsController.this).isCurrentItemAd() && !AdsController.access$200(AdsController.this, AdsController.access$000(AdsController.this).getCurrentPlayQueueItem()))
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
        return call(obj);
    }

    nager()
    {
        this$0 = AdsController.this;
        super();
    }
}
