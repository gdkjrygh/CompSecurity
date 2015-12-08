// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.ads;

import rx.b.f;

// Referenced classes of package com.soundcloud.android.ads:
//            AdOverlayImpressionOperations

class this._cls0
    implements f
{

    final AdOverlayImpressionOperations this$0;

    public Boolean call(sualImpressionState sualimpressionstate)
    {
        boolean flag;
        if (!AdOverlayImpressionOperations.access$400(AdOverlayImpressionOperations.this) && sualImpressionState.access._mth500(sualimpressionstate) && sualImpressionState.access._mth600(sualimpressionstate) && sualImpressionState.access._mth700(sualimpressionstate))
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
        return call((sualImpressionState)obj);
    }

    sualImpressionState()
    {
        this$0 = AdOverlayImpressionOperations.this;
        super();
    }
}
