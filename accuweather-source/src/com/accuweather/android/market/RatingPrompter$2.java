// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.accuweather.android.market;

import android.content.DialogInterface;

// Referenced classes of package com.accuweather.android.market:
//            RatingPrompter, MarketUtils

class this._cls0
    implements android.content.nClickListener
{

    final RatingPrompter this$0;

    public void onClick(DialogInterface dialoginterface, int i)
    {
        MarketUtils.rateThisApp(RatingPrompter.access$100(RatingPrompter.this));
        RatingPrompter.access$000(RatingPrompter.this);
    }

    ()
    {
        this$0 = RatingPrompter.this;
        super();
    }
}
