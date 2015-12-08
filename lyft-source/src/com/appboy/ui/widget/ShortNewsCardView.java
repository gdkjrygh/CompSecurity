// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.appboy.ui.widget;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.appboy.models.cards.Card;
import com.appboy.models.cards.ShortNewsCard;
import com.appboy.ui.actions.ActionFactory;
import com.appboy.ui.actions.IAction;
import com.facebook.drawee.view.SimpleDraweeView;

// Referenced classes of package com.appboy.ui.widget:
//            BaseCardView

public class ShortNewsCardView extends BaseCardView
{

    private static final String TAG = String.format("%s.%s", new Object[] {
        "Appboy", com/appboy/ui/widget/ShortNewsCardView.getName()
    });
    private final float mAspectRatio;
    private IAction mCardAction;
    private final TextView mDescription;
    private final TextView mDomain;
    private SimpleDraweeView mDrawee;
    private ImageView mImage;
    private final TextView mTitle;

    public ShortNewsCardView(Context context)
    {
        this(context, null);
    }

    public ShortNewsCardView(Context context, ShortNewsCard shortnewscard)
    {
        super(context);
        mAspectRatio = 1.0F;
        mDescription = (TextView)findViewById(com.appboy.ui.R.id.com_appboy_short_news_card_description);
        mTitle = (TextView)findViewById(com.appboy.ui.R.id.com_appboy_short_news_card_title);
        mDomain = (TextView)findViewById(com.appboy.ui.R.id.com_appboy_short_news_card_domain);
        if (canUseFresco())
        {
            mDrawee = (SimpleDraweeView)getProperViewFromInflatedStub(com.appboy.ui.R.id.com_appboy_short_news_card_drawee_stub);
        } else
        {
            mImage = (ImageView)getProperViewFromInflatedStub(com.appboy.ui.R.id.com_appboy_short_news_card_imageview_stub);
        }
        if (shortnewscard != null)
        {
            setCard(shortnewscard);
        }
        safeSetBackground(getResources().getDrawable(com.appboy.ui.R.drawable.com_appboy_card_background));
    }

    protected int getLayoutResource()
    {
        return com.appboy.ui.R.layout.com_appboy_short_news_card;
    }

    public volatile void onSetCard(Card card)
    {
        onSetCard((ShortNewsCard)card);
    }

    public void onSetCard(final ShortNewsCard card)
    {
        mDescription.setText(card.getDescription());
        setOptionalTextView(mTitle, card.getTitle());
        setOptionalTextView(mDomain, card.getDomain());
        mCardAction = ActionFactory.createUriAction(getContext(), card.getUrl());
        setOnClickListener(new android.view.View.OnClickListener() {

            final ShortNewsCardView this$0;
            final ShortNewsCard val$card;

            public void onClick(View view)
            {
                BaseCardView.handleCardClick(mContext, card, mCardAction, ShortNewsCardView.TAG);
            }

            
            {
                this$0 = ShortNewsCardView.this;
                card = shortnewscard;
                super();
            }
        });
        if (canUseFresco())
        {
            setSimpleDraweeToUrl(mDrawee, card.getImageUrl(), 1.0F, true);
            return;
        } else
        {
            setImageViewToUrl(mImage, card.getImageUrl(), 1.0F);
            return;
        }
    }



}
