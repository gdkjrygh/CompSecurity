// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.appboy.ui.widget;

import android.content.Context;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.appboy.models.cards.Card;
import com.appboy.models.cards.CrossPromotionSmallCard;
import com.appboy.ui.actions.GooglePlayAppDetailsAction;
import com.appboy.ui.actions.IAction;
import com.appboy.ui.support.StringUtils;
import com.facebook.drawee.view.SimpleDraweeView;
import java.text.NumberFormat;
import java.util.Locale;

// Referenced classes of package com.appboy.ui.widget:
//            BaseCardView, StarRatingView

public class CrossPromotionSmallCardView extends BaseCardView
{

    private static final String TAG = String.format("%s.%s", new Object[] {
        "Appboy", com/appboy/ui/widget/CrossPromotionSmallCardView.getName()
    });
    private final float mAspectRatio;
    private final TextView mCaption;
    private SimpleDraweeView mDrawee;
    private ImageView mImage;
    private final Button mPrice;
    private IAction mPriceAction;
    private final TextView mReviewCount;
    private final StarRatingView mStarRating;
    private final TextView mSubtitle;
    private final TextView mTitle;

    public CrossPromotionSmallCardView(Context context)
    {
        this(context, null);
    }

    public CrossPromotionSmallCardView(Context context, CrossPromotionSmallCard crosspromotionsmallcard)
    {
        super(context);
        mAspectRatio = 1.0F;
        mTitle = (TextView)findViewById(com.appboy.ui.R.id.com_appboy_cross_promotion_small_card_title);
        mSubtitle = (TextView)findViewById(com.appboy.ui.R.id.com_appboy_cross_promotion_small_card_subtitle);
        mReviewCount = (TextView)findViewById(com.appboy.ui.R.id.com_appboy_cross_promotion_small_card_review_count);
        mCaption = (TextView)findViewById(com.appboy.ui.R.id.com_appboy_cross_promotion_small_card_recommendation_tab);
        mStarRating = (StarRatingView)findViewById(com.appboy.ui.R.id.com_appboy_cross_promotion_small_card_star_rating);
        mPrice = (Button)findViewById(com.appboy.ui.R.id.com_appboy_cross_promotion_small_card_price);
        if (canUseFresco())
        {
            mDrawee = (SimpleDraweeView)getProperViewFromInflatedStub(com.appboy.ui.R.id.com_appboy_cross_promotion_small_card_drawee_stub);
        } else
        {
            mImage = (ImageView)getProperViewFromInflatedStub(com.appboy.ui.R.id.com_appboy_cross_promotion_small_card_imageview_stub);
        }
        if (crosspromotionsmallcard != null)
        {
            setCard(crosspromotionsmallcard);
        }
    }

    private String getPriceString(double d)
    {
        if (d == 0.0D)
        {
            return mContext.getString(com.appboy.ui.R.string.com_appboy_recommendation_free);
        } else
        {
            return NumberFormat.getCurrencyInstance(Locale.US).format(d);
        }
    }

    protected int getLayoutResource()
    {
        return com.appboy.ui.R.layout.com_appboy_cross_promotion_small_card;
    }

    public volatile void onSetCard(Card card)
    {
        onSetCard((CrossPromotionSmallCard)card);
    }

    public void onSetCard(final CrossPromotionSmallCard card)
    {
        mTitle.setText(card.getTitle());
        if (card.getSubtitle() == null || card.getSubtitle().toUpperCase(Locale.getDefault()).equals("NULL"))
        {
            mSubtitle.setVisibility(8);
        } else
        {
            mSubtitle.setText(card.getSubtitle().toUpperCase(Locale.getDefault()));
        }
        mCaption.setText(card.getCaption().toUpperCase(Locale.getDefault()));
        if (card.getRating() <= 0.0D)
        {
            mReviewCount.setVisibility(8);
            mStarRating.setVisibility(8);
        } else
        {
            mReviewCount.setText(String.format("(%s)", new Object[] {
                NumberFormat.getInstance().format(card.getReviewCount())
            }));
            mStarRating.setRating((float)card.getRating());
        }
        if (!StringUtils.isNullOrBlank(card.getDisplayPrice()))
        {
            mPrice.setText(card.getDisplayPrice());
        } else
        {
            mPrice.setText(getPriceString(card.getPrice()));
        }
        mPriceAction = new GooglePlayAppDetailsAction(card.getPackage(), false, card.getAppStore(), card.getKindleId());
        mPrice.setOnClickListener(new android.view.View.OnClickListener() {

            final CrossPromotionSmallCardView this$0;
            final CrossPromotionSmallCard val$card;

            public void onClick(View view)
            {
                BaseCardView.handleCardClick(mContext, card, mPriceAction, CrossPromotionSmallCardView.TAG);
            }

            
            {
                this$0 = CrossPromotionSmallCardView.this;
                card = crosspromotionsmallcard;
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
