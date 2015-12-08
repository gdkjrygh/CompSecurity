// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.appboy.ui.widget;

import android.view.View;
import com.appboy.models.cards.CrossPromotionSmallCard;

// Referenced classes of package com.appboy.ui.widget:
//            CrossPromotionSmallCardView, BaseCardView

class val.card
    implements android.view.dView._cls1
{

    final CrossPromotionSmallCardView this$0;
    final CrossPromotionSmallCard val$card;

    public void onClick(View view)
    {
        BaseCardView.handleCardClick(mContext, val$card, CrossPromotionSmallCardView.access$000(CrossPromotionSmallCardView.this), CrossPromotionSmallCardView.access$100());
    }

    ()
    {
        this$0 = final_crosspromotionsmallcardview;
        val$card = CrossPromotionSmallCard.this;
        super();
    }
}
