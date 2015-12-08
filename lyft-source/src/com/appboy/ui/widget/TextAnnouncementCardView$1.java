// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.appboy.ui.widget;

import android.view.View;
import com.appboy.models.cards.TextAnnouncementCard;

// Referenced classes of package com.appboy.ui.widget:
//            TextAnnouncementCardView, BaseCardView

class val.card
    implements android.view.dView._cls1
{

    final TextAnnouncementCardView this$0;
    final TextAnnouncementCard val$card;

    public void onClick(View view)
    {
        BaseCardView.handleCardClick(mContext, val$card, TextAnnouncementCardView.access$000(TextAnnouncementCardView.this), TextAnnouncementCardView.access$100());
    }

    ()
    {
        this$0 = final_textannouncementcardview;
        val$card = TextAnnouncementCard.this;
        super();
    }
}
