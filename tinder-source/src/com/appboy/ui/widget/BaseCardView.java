// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.appboy.ui.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewStub;
import android.view.ViewTreeObserver;
import android.widget.ImageSwitcher;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.appboy.Appboy;
import com.appboy.Constants;
import com.appboy.models.cards.Card;
import com.appboy.support.AppboyLogger;
import com.appboy.support.PackageUtils;
import com.appboy.ui.actions.IAction;
import com.appboy.ui.support.FrescoLibraryUtils;
import com.facebook.drawee.view.SimpleDraweeView;
import java.util.Observable;
import java.util.Observer;

public abstract class BaseCardView extends RelativeLayout
    implements Observer
{

    private static final String COM_APPBOY_NEWSFEED_UNREAD_VISUAL_INDICATOR_ON = "com_appboy_newsfeed_unread_visual_indicator_on";
    private static final float SQUARE_ASPECT_RATIO = 1F;
    private static final String TAG;
    private static Boolean unreadCardVisualIndicatorOn;
    private final boolean mCanUseFresco;
    protected Card mCard;
    protected final Context mContext;
    protected ImageSwitcher mImageSwitcher;

    public BaseCardView(Context context)
    {
        super(context);
        mCanUseFresco = FrescoLibraryUtils.canUseFresco(context);
        mContext = context;
        ((LayoutInflater)context.getSystemService("layout_inflater")).inflate(getLayoutResource(), this);
        mImageSwitcher = (ImageSwitcher)findViewById(com.appboy.ui.R.id.com_appboy_newsfeed_item_read_indicator_image_switcher);
        if (mImageSwitcher != null)
        {
            mImageSwitcher.setFactory(new android.widget.ViewSwitcher.ViewFactory() {

                final BaseCardView this$0;

                public View makeView()
                {
                    return new ImageView(mContext.getApplicationContext());
                }

            
            {
                this$0 = BaseCardView.this;
                super();
            }
            });
        }
        if (unreadCardVisualIndicatorOn == null)
        {
            int i = mContext.getResources().getIdentifier("com_appboy_newsfeed_unread_visual_indicator_on", "bool", PackageUtils.getResourcePackageName(context));
            if (i != 0)
            {
                unreadCardVisualIndicatorOn = Boolean.valueOf(context.getResources().getBoolean(i));
            } else
            {
                unreadCardVisualIndicatorOn = Boolean.valueOf(true);
            }
        }
        if (!unreadCardVisualIndicatorOn.booleanValue() && mImageSwitcher != null)
        {
            mImageSwitcher.setVisibility(8);
        }
    }

    protected static void handleCardClick(Context context, Card card, IAction iaction, String s)
    {
        card.setIsRead(true);
        if (iaction != null)
        {
            AppboyLogger.d(s, String.format("Logged click for card %s", new Object[] {
                card.getId()
            }));
            card.logClick();
            iaction.execute(context);
        }
    }

    public static void removeOnGlobalLayoutListenerSafe(ViewTreeObserver viewtreeobserver, android.view.ViewTreeObserver.OnGlobalLayoutListener ongloballayoutlistener)
    {
        if (android.os.Build.VERSION.SDK_INT < 16)
        {
            viewtreeobserver.removeGlobalOnLayoutListener(ongloballayoutlistener);
            return;
        } else
        {
            viewtreeobserver.removeOnGlobalLayoutListener(ongloballayoutlistener);
            return;
        }
    }

    private void setBackgroundNew(Drawable drawable)
    {
        setBackground(drawable);
    }

    private void setCardViewedIndicator()
    {
        if (getCard() != null)
        {
            if (mImageSwitcher != null)
            {
                int i;
                if (getCard().isRead())
                {
                    i = com.appboy.ui.R.drawable.icon_read;
                } else
                {
                    i = com.appboy.ui.R.drawable.icon_unread;
                }
                mImageSwitcher.setImageResource(i);
                mImageSwitcher.setTag(String.valueOf(i));
                return;
            } else
            {
                AppboyLogger.d(TAG, "The imageSwitcher for the read/unread feature is null. Did you include it in your xml?");
                return;
            }
        } else
        {
            AppboyLogger.d(TAG, "The card is null.");
            return;
        }
    }

    boolean canUseFresco()
    {
        return mCanUseFresco;
    }

    public Card getCard()
    {
        return mCard;
    }

    protected abstract int getLayoutResource();

    View getProperViewFromInflatedStub(int i)
    {
        ((ViewStub)findViewById(i)).inflate();
        if (mCanUseFresco)
        {
            return findViewById(com.appboy.ui.R.id.com_appboy_stubbed_feed_drawee_view);
        } else
        {
            return findViewById(com.appboy.ui.R.id.com_appboy_stubbed_feed_image_view);
        }
    }

    protected abstract void onSetCard(Card card);

    void safeSetBackground(Drawable drawable)
    {
        if (android.os.Build.VERSION.SDK_INT < 16)
        {
            setBackgroundDrawable(drawable);
            return;
        } else
        {
            setBackgroundNew(drawable);
            return;
        }
    }

    public void setCard(Card card)
    {
        mCard = card;
        onSetCard(card);
        card.addObserver(this);
        setCardViewedIndicator();
    }

    void setImageViewToUrl(ImageView imageview, String s)
    {
        setImageViewToUrl(imageview, s, 1.0F, false);
    }

    void setImageViewToUrl(ImageView imageview, String s, float f)
    {
        setImageViewToUrl(imageview, s, f, true);
    }

    void setImageViewToUrl(final ImageView imageView, String s, final float aspectRatio, boolean flag)
    {
        if (s == null)
        {
            AppboyLogger.w(TAG, "The image url to render is null. Not setting the card image.");
        } else
        {
            if (aspectRatio == 0.0F)
            {
                AppboyLogger.w(TAG, "The image aspect ratio is 0. Not setting the card image.");
                return;
            }
            if (!s.equals(imageView.getTag()))
            {
                if (aspectRatio != 1.0F)
                {
                    ViewTreeObserver viewtreeobserver = imageView.getViewTreeObserver();
                    if (viewtreeobserver.isAlive())
                    {
                        viewtreeobserver.addOnGlobalLayoutListener(new android.view.ViewTreeObserver.OnGlobalLayoutListener() {

                            final BaseCardView this$0;
                            final float val$aspectRatio;
                            final ImageView val$imageView;

                            public void onGlobalLayout()
                            {
                                int i = imageView.getWidth();
                                imageView.setLayoutParams(new android.widget.RelativeLayout.LayoutParams(i, (int)((float)i / aspectRatio)));
                                BaseCardView.removeOnGlobalLayoutListenerSafe(imageView.getViewTreeObserver(), this);
                            }

            
            {
                this$0 = BaseCardView.this;
                imageView = imageview;
                aspectRatio = f;
                super();
            }
                        });
                    }
                }
                imageView.setImageResource(0x106000d);
                Appboy.getInstance(getContext()).fetchAndRenderImage(s, imageView, flag);
                imageView.setTag(s);
                return;
            }
        }
    }

    void setOptionalTextView(TextView textview, String s)
    {
        if (s != null && !s.trim().equals(""))
        {
            textview.setText(s);
            textview.setVisibility(0);
            return;
        } else
        {
            textview.setText("");
            textview.setVisibility(8);
            return;
        }
    }

    void setSimpleDraweeToUrl(SimpleDraweeView simpledraweeview, String s, float f, boolean flag)
    {
        if (s == null)
        {
            AppboyLogger.w(TAG, "The image url to render is null. Not setting the card image.");
            return;
        } else
        {
            FrescoLibraryUtils.setDraweeControllerHelper(simpledraweeview, s, f, flag);
            return;
        }
    }

    public void update(Observable observable, Object obj)
    {
        setCardViewedIndicator();
    }

    static 
    {
        TAG = String.format("%s.%s", new Object[] {
            Constants.APPBOY_LOG_TAG_PREFIX, com/appboy/ui/widget/BaseCardView.getName()
        });
    }
}
