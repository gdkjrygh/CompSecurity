// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.ads;

import com.soundcloud.android.model.Urn;
import rx.b.b;

// Referenced classes of package com.soundcloud.android.ads:
//            AdPlayerController

class this._cls0
    implements b
{

    final AdPlayerController this$0;

    private boolean isDifferentTrack(ate ate)
    {
        return AdPlayerController.access$200(AdPlayerController.this).equals(ate.access._mth100(ate));
    }

    private boolean isPlayerExpandedWithAd(ate ate)
    {
        return ate.access._mth300(ate) == 0 && ate.access._mth000(ate);
    }

    public void call(ate ate)
    {
        if (isPlayerExpandedWithAd(ate))
        {
            AdPlayerController.access$202(AdPlayerController.this, ate.access._mth100(ate));
        } else
        if (!isDifferentTrack(ate))
        {
            AdPlayerController.access$202(AdPlayerController.this, Urn.NOT_SET);
            return;
        }
    }

    public volatile void call(Object obj)
    {
        call((ate)obj);
    }

    ate()
    {
        this$0 = AdPlayerController.this;
        super();
    }
}
