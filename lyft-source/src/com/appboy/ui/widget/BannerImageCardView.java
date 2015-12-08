// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.appboy.ui.widget;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.widget.ImageView;
import com.appboy.models.cards.BannerImageCard;
import com.appboy.models.cards.Card;
import com.appboy.support.AppboyLogger;
import com.appboy.ui.actions.ActionFactory;
import com.appboy.ui.actions.IAction;
import com.facebook.drawee.view.SimpleDraweeView;

// Referenced classes of package com.appboy.ui.widget:
//            BaseCardView

public class BannerImageCardView extends BaseCardView
{

    private static final String TAG = String.format("%s.%s", new Object[] {
        "Appboy", com/appboy/ui/widget/BannerImageCardView.getName()
    });
    private float mAspectRatio;
    private IAction mCardAction;
    private SimpleDraweeView mDrawee;
    private ImageView mImage;

    public BannerImageCardView(Context context)
    {
        this(context, null);
    }

    public BannerImageCardView(Context context, BannerImageCard bannerimagecard)
    {
        super(context);
        mAspectRatio = 6F;
        if (canUseFresco())
        {
            mDrawee = (SimpleDraweeView)getProperViewFromInflatedStub(com.appboy.ui.R.id.com_appboy_banner_image_card_drawee_stub);
        } else
        {
            mImage = (ImageView)getProperViewFromInflatedStub(com.appboy.ui.R.id.com_appboy_banner_image_card_imageview_stub);
            mImage.setScaleType(android.widget.ImageView.ScaleType.CENTER_CROP);
            mImage.setAdjustViewBounds(true);
        }
        if (bannerimagecard != null)
        {
            setCard(bannerimagecard);
        }
        safeSetBackground(getResources().getDrawable(com.appboy.ui.R.drawable.com_appboy_card_background));
    }

    protected int getLayoutResource()
    {
        return com.appboy.ui.R.layout.com_appboy_banner_image_card;
    }

    public void onSetCard(final BannerImageCard card)
    {
        boolean flag = false;
        if (card.getAspectRatio() != 0.0F)
        {
            mAspectRatio = card.getAspectRatio();
            flag = true;
        }
        if (canUseFresco())
        {
            setSimpleDraweeToUrl(mDrawee, card.getImageUrl(), mAspectRatio, flag);
        } else
        {
            setImageViewToUrl(mImage, card.getImageUrl(), mAspectRatio, flag);
        }
        mCardAction = ActionFactory.createUriAction(getContext(), card.getUrl());
        setOnClickListener(new android.view.View.OnClickListener() {

            final BannerImageCardView this$0;
            final BannerImageCard val$card;

            public void onClick(View view)
            {
                if (mCardAction != null)
                {
                    AppboyLogger.d(BannerImageCardView.TAG, String.format("Logged click for card %s", new Object[] {
                        card.getId()
                    }));
                    card.logClick();
                    mCardAction.execute(mContext);
                }
            }

            
            {
                this$0 = BannerImageCardView.this;
                card = bannerimagecard;
                super();
            }
        });
    }

    public volatile void onSetCard(Card card)
    {
        onSetCard((BannerImageCard)card);
    }



}
