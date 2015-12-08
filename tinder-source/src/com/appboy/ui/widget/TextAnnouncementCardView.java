// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.appboy.ui.widget;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.widget.TextView;
import com.appboy.models.cards.Card;
import com.appboy.models.cards.TextAnnouncementCard;
import com.appboy.ui.actions.ActionFactory;
import com.appboy.ui.actions.IAction;

// Referenced classes of package com.appboy.ui.widget:
//            BaseCardView

public class TextAnnouncementCardView extends BaseCardView
{

    private static final String TAG = String.format("%s.%s", new Object[] {
        "Appboy", com/appboy/ui/widget/TextAnnouncementCardView.getName()
    });
    private IAction mCardAction;
    private final TextView mDescription;
    private final TextView mDomain;
    private final TextView mTitle;

    public TextAnnouncementCardView(Context context)
    {
        this(context, null);
    }

    public TextAnnouncementCardView(Context context, TextAnnouncementCard textannouncementcard)
    {
        super(context);
        mTitle = (TextView)findViewById(com.appboy.ui.R.id.com_appboy_text_announcement_card_title);
        mDescription = (TextView)findViewById(com.appboy.ui.R.id.com_appboy_text_announcement_card_description);
        mDomain = (TextView)findViewById(com.appboy.ui.R.id.com_appboy_text_announcement_card_domain);
        if (textannouncementcard != null)
        {
            setCard(textannouncementcard);
        }
        safeSetBackground(getResources().getDrawable(com.appboy.ui.R.drawable.com_appboy_card_background));
    }

    protected int getLayoutResource()
    {
        return com.appboy.ui.R.layout.com_appboy_text_announcement_card;
    }

    public volatile void onSetCard(Card card)
    {
        onSetCard((TextAnnouncementCard)card);
    }

    public void onSetCard(final TextAnnouncementCard card)
    {
        mTitle.setText(card.getTitle());
        mDescription.setText(card.getDescription());
        setOptionalTextView(mDomain, card.getDomain());
        mCardAction = ActionFactory.createUriAction(getContext(), card.getUrl());
        setOnClickListener(new android.view.View.OnClickListener() {

            final TextAnnouncementCardView this$0;
            final TextAnnouncementCard val$card;

            public void onClick(View view)
            {
                BaseCardView.handleCardClick(mContext, card, mCardAction, TextAnnouncementCardView.TAG);
            }

            
            {
                this$0 = TextAnnouncementCardView.this;
                card = textannouncementcard;
                super();
            }
        });
    }



}
