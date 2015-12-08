// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.appboy.ui.widget;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.appboy.models.cards.CaptionedImageCard;
import com.appboy.models.cards.Card;
import com.appboy.ui.actions.ActionFactory;
import com.appboy.ui.actions.IAction;
import com.facebook.drawee.view.SimpleDraweeView;

// Referenced classes of package com.appboy.ui.widget:
//            BaseCardView

public class CaptionedImageCardView extends BaseCardView
{

    private static final String TAG = String.format("%s.%s", new Object[] {
        "Appboy", com/appboy/ui/widget/CaptionedImageCardView.getName()
    });
    private float mAspectRatio;
    private IAction mCardAction;
    private final TextView mDescription;
    private final TextView mDomain;
    private SimpleDraweeView mDrawee;
    private ImageView mImage;
    private final TextView mTitle;

    public CaptionedImageCardView(Context context)
    {
        this(context, null);
    }

    public CaptionedImageCardView(Context context, CaptionedImageCard captionedimagecard)
    {
        super(context);
        mAspectRatio = 1.333333F;
        if (canUseFresco())
        {
            mDrawee = (SimpleDraweeView)getProperViewFromInflatedStub(com.appboy.ui.R.id.com_appboy_captioned_image_card_drawee_stub);
        } else
        {
            mImage = (ImageView)getProperViewFromInflatedStub(com.appboy.ui.R.id.com_appboy_captioned_image_card_imageview_stub);
            mImage.setScaleType(android.widget.ImageView.ScaleType.CENTER_CROP);
            mImage.setAdjustViewBounds(true);
        }
        mTitle = (TextView)findViewById(com.appboy.ui.R.id.com_appboy_captioned_image_title);
        mDescription = (TextView)findViewById(com.appboy.ui.R.id.com_appboy_captioned_image_description);
        mDomain = (TextView)findViewById(com.appboy.ui.R.id.com_appboy_captioned_image_card_domain);
        if (captionedimagecard != null)
        {
            setCard(captionedimagecard);
        }
        safeSetBackground(getResources().getDrawable(com.appboy.ui.R.drawable.com_appboy_card_background));
    }

    protected int getLayoutResource()
    {
        return com.appboy.ui.R.layout.com_appboy_captioned_image_card;
    }

    public void onSetCard(final CaptionedImageCard card)
    {
        mTitle.setText(card.getTitle());
        mDescription.setText(card.getDescription());
        setOptionalTextView(mDomain, card.getDomain());
        mCardAction = ActionFactory.createUriAction(getContext(), card.getUrl());
        boolean flag = false;
        if (card.getAspectRatio() != 0.0F)
        {
            mAspectRatio = card.getAspectRatio();
            flag = true;
        }
        setOnClickListener(new android.view.View.OnClickListener() {

            final CaptionedImageCardView this$0;
            final CaptionedImageCard val$card;

            public void onClick(View view)
            {
                BaseCardView.handleCardClick(mContext, card, mCardAction, CaptionedImageCardView.TAG);
            }

            
            {
                this$0 = CaptionedImageCardView.this;
                card = captionedimagecard;
                super();
            }
        });
        if (canUseFresco())
        {
            setSimpleDraweeToUrl(mDrawee, card.getImageUrl(), mAspectRatio, flag);
            return;
        } else
        {
            setImageViewToUrl(mImage, card.getImageUrl(), mAspectRatio, flag);
            return;
        }
    }

    public volatile void onSetCard(Card card)
    {
        onSetCard((CaptionedImageCard)card);
    }



}
