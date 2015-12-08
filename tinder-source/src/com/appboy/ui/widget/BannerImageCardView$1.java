// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.appboy.ui.widget;

import android.view.View;
import com.appboy.models.cards.BannerImageCard;
import com.appboy.support.AppboyLogger;
import com.appboy.ui.actions.IAction;

// Referenced classes of package com.appboy.ui.widget:
//            BannerImageCardView

class val.card
    implements android.view.dView._cls1
{

    final BannerImageCardView this$0;
    final BannerImageCard val$card;

    public void onClick(View view)
    {
        if (BannerImageCardView.access$000(BannerImageCardView.this) != null)
        {
            AppboyLogger.d(BannerImageCardView.access$100(), String.format("Logged click for card %s", new Object[] {
                val$card.getId()
            }));
            val$card.logClick();
            BannerImageCardView.access$000(BannerImageCardView.this).execute(mContext);
        }
    }

    ()
    {
        this$0 = final_bannerimagecardview;
        val$card = BannerImageCard.this;
        super();
    }
}
