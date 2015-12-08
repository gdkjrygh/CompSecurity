// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.appboy.ui.widget;

import android.view.View;
import com.appboy.models.cards.ShortNewsCard;

// Referenced classes of package com.appboy.ui.widget:
//            ShortNewsCardView, BaseCardView

class val.card
    implements android.view.
{

    final ShortNewsCardView this$0;
    final ShortNewsCard val$card;

    public void onClick(View view)
    {
        BaseCardView.handleCardClick(mContext, val$card, ShortNewsCardView.access$000(ShortNewsCardView.this), ShortNewsCardView.access$100());
    }

    ()
    {
        this$0 = final_shortnewscardview;
        val$card = ShortNewsCard.this;
        super();
    }
}
