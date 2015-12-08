// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.driver.achievements.card;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.CardView;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.ButterKnife;
import com.lyft.scoop.Scoop;
import java.util.Iterator;
import java.util.List;
import me.lyft.android.domain.driver.Card;
import me.lyft.android.domain.driver.Dial;
import me.lyft.android.domain.driver.ExpressPayCard;
import me.lyft.android.rx.Binder;
import me.lyft.android.ui.driver.achievements.dials.DialView;
import me.lyft.android.utils.WebBrowser;

// Referenced classes of package me.lyft.android.ui.driver.achievements.card:
//            LightAchievementCardView, GlowstacheAchievementCard, ExpressPayAchievementCard, DarkAchievementCardView

public abstract class AchievementCardView extends FrameLayout
{

    Binder binder;
    CardView cardView;
    LinearLayout dialsLayoutView;
    ImageView infoImageView;
    TextView subtitleTextView;
    TextView titleTextView;

    public AchievementCardView(Context context)
    {
        super(context);
        initialize();
    }

    public AchievementCardView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        initialize();
    }

    public static AchievementCardView create(Card card, Context context)
    {
        class _cls2
        {

            static final int $SwitchMap$me$lyft$android$domain$driver$Card$Style[];

            static 
            {
                $SwitchMap$me$lyft$android$domain$driver$Card$Style = new int[me.lyft.android.domain.driver.Card.Style.values().length];
                try
                {
                    $SwitchMap$me$lyft$android$domain$driver$Card$Style[me.lyft.android.domain.driver.Card.Style.GLOWSTACHE.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    $SwitchMap$me$lyft$android$domain$driver$Card$Style[me.lyft.android.domain.driver.Card.Style.EXPRESSPAY.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    $SwitchMap$me$lyft$android$domain$driver$Card$Style[me.lyft.android.domain.driver.Card.Style.DARK.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    $SwitchMap$me$lyft$android$domain$driver$Card$Style[me.lyft.android.domain.driver.Card.Style.LIGHT.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        _cls2..SwitchMap.me.lyft.android.domain.driver.Card.Style[card.getStyle().ordinal()];
        JVM INSTR tableswitch 1 3: default 36
    //                   1 79
    //                   2 91
    //                   3 117;
           goto _L1 _L2 _L3 _L4
_L1:
        context = new LightAchievementCardView(context);
_L6:
        context.setDials(card.getDials());
        context.setTitle(card.getTitle());
        context.setSubtitle(card.getSubTitle());
        context.setInfoUrl(card.getInfoUrl());
        return context;
_L2:
        context = new GlowstacheAchievementCard(context);
        continue; /* Loop/switch isn't completed */
_L3:
        if (card.isExpressPayCard())
        {
            context = new ExpressPayAchievementCard(context, ((ExpressPayCard)card).getButtonText());
            continue; /* Loop/switch isn't completed */
        }
_L4:
        context = new DarkAchievementCardView(context);
        if (true) goto _L6; else goto _L5
_L5:
    }

    private void initialize()
    {
        Scoop scoop = Scoop.a(this);
        scoop.b(this);
        scoop.a(getContext()).inflate(getLayout(), this, true);
        ButterKnife.a(this);
        cardView.setCardBackgroundColor(getBackgroundColor());
        titleTextView.setTextColor(getTitleColor());
        subtitleTextView.setTextColor(getSubtitleColor());
        infoImageView.setImageDrawable(getInfoIcon());
    }

    private void openDriverStatsWebPage(String s)
    {
        WebBrowser.open(getContext(), s);
    }

    abstract int getBackgroundColor();

    abstract int getBackgroundDialColor();

    abstract int getDialColor();

    abstract Drawable getGoalMetIcon();

    public int getGradientEndColor()
    {
        return -1;
    }

    public int getGradientStartColor()
    {
        return -1;
    }

    abstract Drawable getInfoIcon();

    protected int getLayout()
    {
        return 0x7f030001;
    }

    abstract int getSubtitleColor();

    abstract int getTitleColor();

    protected void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        binder = Binder.attach(this);
    }

    public void setDials(List list)
    {
        DialView dialview;
        for (list = list.iterator(); list.hasNext(); dialsLayoutView.addView(dialview))
        {
            dialview = DialView.create((Dial)list.next(), getContext());
            dialview.setProgressTextColor(getTitleColor());
            dialview.setTitleTextColor(getTitleColor());
            dialview.setSubtitleTextColor(getSubtitleColor());
            dialview.setProgressColor(getDialColor());
            dialview.setBackgroundProgressColor(getBackgroundDialColor());
            dialview.setGradientProgressColors(getGradientStartColor(), getGradientEndColor());
            dialview.setGoalMetIcon(getGoalMetIcon());
            android.widget.LinearLayout.LayoutParams layoutparams = new android.widget.LinearLayout.LayoutParams(0, -1, 1.0F);
            layoutparams.gravity = 1;
            dialview.setLayoutParams(layoutparams);
        }

    }

    public void setInfoUrl(final String infoUrl)
    {
        infoImageView.setOnClickListener(new android.view.View.OnClickListener() {

            final AchievementCardView this$0;
            final String val$infoUrl;

            public void onClick(View view)
            {
                openDriverStatsWebPage(infoUrl);
            }

            
            {
                this$0 = AchievementCardView.this;
                infoUrl = s;
                super();
            }
        });
    }

    public void setSubtitle(String s)
    {
        subtitleTextView.setVisibility(0);
        subtitleTextView.setText(s);
    }

    public void setTitle(String s)
    {
        titleTextView.setText(s);
    }

}
