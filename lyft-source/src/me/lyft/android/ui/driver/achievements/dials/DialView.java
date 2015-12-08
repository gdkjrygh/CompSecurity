// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.driver.achievements.dials;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.ButterKnife;
import com.lyft.scoop.Scoop;
import me.lyft.android.controls.CircularProgressView;
import me.lyft.android.domain.driver.Dial;

// Referenced classes of package me.lyft.android.ui.driver.achievements.dials:
//            CountDialView, MoneyDialView, PercentageDialView, TimeDialView

public abstract class DialView extends FrameLayout
{

    private static final int ANIMATION_DURATION_MILLIS = 750;
    private static final int ANIMATION_START_DELAY_MILLIS = 200;
    private static final int PROGRESS_MULTIPLIER = 100;
    CircularProgressView circularProgress;
    ImageView goalMetIcon;
    private int maxValue;
    TextView progressText;
    TextView subtitleTextView;
    TextView titleTextView;

    public DialView(Context context)
    {
        super(context);
        initialize();
    }

    public static DialView create(Dial dial, Context context)
    {
        class _cls2
        {

            static final int $SwitchMap$me$lyft$android$domain$driver$Dial$Type[];

            static 
            {
                $SwitchMap$me$lyft$android$domain$driver$Dial$Type = new int[me.lyft.android.domain.driver.Dial.Type.values().length];
                try
                {
                    $SwitchMap$me$lyft$android$domain$driver$Dial$Type[me.lyft.android.domain.driver.Dial.Type.MONEY.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    $SwitchMap$me$lyft$android$domain$driver$Dial$Type[me.lyft.android.domain.driver.Dial.Type.PERCENTAGE.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    $SwitchMap$me$lyft$android$domain$driver$Dial$Type[me.lyft.android.domain.driver.Dial.Type.TIME.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    $SwitchMap$me$lyft$android$domain$driver$Dial$Type[me.lyft.android.domain.driver.Dial.Type.COUNT.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        _cls2..SwitchMap.me.lyft.android.domain.driver.Dial.Type[dial.getType().ordinal()];
        JVM INSTR tableswitch 1 3: default 36
    //                   1 79
    //                   2 91
    //                   3 103;
           goto _L1 _L2 _L3 _L4
_L1:
        context = new CountDialView(context);
_L6:
        context.setTitle(dial.getTitle());
        context.setSubtitle(dial.getSubtitle());
        context.animateProgress(dial.getValue(), dial.getMaxValue(), dial.isGoalMet());
        return context;
_L2:
        context = new MoneyDialView(context);
        continue; /* Loop/switch isn't completed */
_L3:
        context = new PercentageDialView(context);
        continue; /* Loop/switch isn't completed */
_L4:
        context = new TimeDialView(context);
        if (true) goto _L6; else goto _L5
_L5:
    }

    private int generateSmoothAnimationProgress(int i)
    {
        return i * 100;
    }

    private void initialize()
    {
        Scoop.a(this).a(getContext()).inflate(0x7f030054, this, true);
        ButterKnife.a(this);
    }

    public void animateProgress(final int value, int i, final boolean isGoalMet)
    {
        maxValue = i;
        final int animationProgressValue = Math.min(generateSmoothAnimationProgress(value), generateSmoothAnimationProgress(i));
        circularProgress.setMax(generateSmoothAnimationProgress(i));
        ValueAnimator valueanimator = ValueAnimator.ofInt(new int[] {
            0, animationProgressValue
        });
        valueanimator.setStartDelay(200L);
        valueanimator.addUpdateListener(new android.animation.ValueAnimator.AnimatorUpdateListener() {

            final DialView this$0;
            final int val$animationProgressValue;
            final boolean val$isGoalMet;
            final int val$value;

            public void onAnimationUpdate(ValueAnimator valueanimator1)
            {
                int j = ((Integer)valueanimator1.getAnimatedValue()).intValue();
                circularProgress.setProgress(j);
                int k = (int)(valueanimator1.getAnimatedFraction() * (float)value);
                progressText.setText(getProgressTextValue(k));
                if (isGoalMet && animationProgressValue == j)
                {
                    goalMetIcon.setVisibility(0);
                }
            }

            
            {
                this$0 = DialView.this;
                value = i;
                isGoalMet = flag;
                animationProgressValue = j;
                super();
            }
        });
        valueanimator.setDuration(750L);
        valueanimator.setInterpolator(new DecelerateInterpolator(1.5F));
        valueanimator.start();
    }

    protected int getMaxValue()
    {
        return maxValue;
    }

    abstract String getProgressTextValue(int i);

    protected void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        circularProgress.setLineThickness(getResources().getDimension(0x7f080060));
    }

    public void setBackgroundProgressColor(int i)
    {
        circularProgress.setBackgroundColor(i);
    }

    public void setGoalMetIcon(Drawable drawable)
    {
        goalMetIcon.setBackgroundDrawable(drawable);
    }

    public void setGradientProgressColors(int i, int j)
    {
        circularProgress.setGradientProgressColors(i, j);
    }

    public void setProgressColor(int i)
    {
        circularProgress.setProgressColor(i);
    }

    public void setProgressTextColor(int i)
    {
        progressText.setTextColor(i);
    }

    public void setSubtitle(String s)
    {
        subtitleTextView.setVisibility(0);
        subtitleTextView.setText(s);
    }

    public void setSubtitleTextColor(int i)
    {
        subtitleTextView.setTextColor(i);
    }

    public void setTitle(String s)
    {
        titleTextView.setText(s);
    }

    public void setTitleTextColor(int i)
    {
        titleTextView.setTextColor(i);
    }
}
