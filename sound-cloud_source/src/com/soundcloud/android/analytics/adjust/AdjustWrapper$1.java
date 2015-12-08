// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.analytics.adjust;

import com.adjust.sdk.AdjustAttribution;
import com.adjust.sdk.OnAttributionChangedListener;

// Referenced classes of package com.soundcloud.android.analytics.adjust:
//            AdjustWrapper

class this._cls0
    implements OnAttributionChangedListener
{

    final AdjustWrapper this$0;

    public void onAttributionChanged(AdjustAttribution adjustattribution)
    {
        AdjustWrapper.access$000(AdjustWrapper.this, adjustattribution);
    }

    ()
    {
        this$0 = AdjustWrapper.this;
        super();
    }
}
