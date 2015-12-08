// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.appboy.ui.widget;

import android.view.View;
import com.appboy.models.cards.CaptionedImageCard;

// Referenced classes of package com.appboy.ui.widget:
//            CaptionedImageCardView, BaseCardView

class val.card
    implements android.view.dView._cls1
{

    final CaptionedImageCardView this$0;
    final CaptionedImageCard val$card;

    public void onClick(View view)
    {
        BaseCardView.handleCardClick(mContext, val$card, CaptionedImageCardView.access$000(CaptionedImageCardView.this), CaptionedImageCardView.access$100());
    }

    ()
    {
        this$0 = final_captionedimagecardview;
        val$card = CaptionedImageCard.this;
        super();
    }
}
