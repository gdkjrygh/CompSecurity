// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.usersetup;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.graphics.Point;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.view.Display;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.WindowManager;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import com.google.android.apps.wallet.analytics.AnalyticsCustomDimension;
import com.google.android.apps.wallet.analytics.AnalyticsUtil;
import com.google.android.apps.wallet.api.UriRegistry;
import com.google.android.apps.wallet.base.activity.OrientationController;
import com.google.android.apps.wallet.base.activity.WalletActivity;
import com.google.android.apps.wallet.config.sharedpreferences.SharedPreference;
import com.google.android.apps.wallet.util.view.Views;
import com.google.android.libraries.view.pagingindicator.PagingIndicator;
import java.util.concurrent.Callable;

// Referenced classes of package com.google.android.apps.wallet.usersetup:
//            WarmWelcomeAdapter, DragFinishableViewPager, WarmWelcomeScreens

public class WarmWelcomeActivity extends WalletActivity
{

    private View activityContainer;
    WarmWelcomeAdapter adapter;
    AnalyticsUtil analyticsUtil;
    private final ArgbEvaluator colorEvaluator = new ArgbEvaluator();
    private int colors[];
    private View continueButton;
    private int currentPage;
    private View doneButton;
    SharedPreferences globalPreferences;
    private PagingIndicator pagingIndicator;
    private View skipButton;
    private View splash;
    private boolean splashFinished;
    UriRegistry uriRegistry;
    private DragFinishableViewPager viewPager;
    private View warmWelcomeScreen;

    public WarmWelcomeActivity()
    {
        super(com.google.android.apps.walletnfcrel.R.layout.wallet_container);
        currentPage = -1;
        splashFinished = false;
    }

    private android.support.v4.view.ViewPager.OnPageChangeListener createPageChangeListener()
    {
        return new android.support.v4.view.ViewPager.SimpleOnPageChangeListener() {

            final WarmWelcomeActivity this$0;

            public final void onPageScrolled(int i, float f, int j)
            {
                if (!splashFinished)
                {
                    return;
                }
                if (f != 0.0F)
                {
                    handleScrolling(i, f);
                    return;
                } else
                {
                    handleScrollingStopped(i);
                    return;
                }
            }

            public final void onPageSelected(int i)
            {
                analyticsUtil.sendScreen(WarmWelcomeScreens.screens[i], new AnalyticsCustomDimension[0]);
            }

            
            {
                this$0 = WarmWelcomeActivity.this;
                super();
            }
        };
    }

    private void fadeViewPagerComponentsTo(float f)
    {
        setComponentAlphaWithDuration(f, 0L);
    }

    private void finishWarmWelcome()
    {
        SharedPreference.WARM_WELCOME_VIEWED.put(globalPreferences, Boolean.valueOf(true));
        startActivity(uriRegistry.createIntent(2, new Object[0]));
        finish();
    }

    private int getLastPageIndex()
    {
        return adapter.getCount() - 1;
    }

    private int getScreenHeight()
    {
        Point point = new Point();
        getWindowManager().getDefaultDisplay().getSize(point);
        return point.y;
    }

    private void handleScrolling(int i, float f)
    {
        int j = ((Integer)colorEvaluator.evaluate(f, Integer.valueOf(colors[i]), Integer.valueOf(colors[i + 1]))).intValue();
        activityContainer.setBackgroundColor(j);
        if (i == getLastPageIndex() - 1)
        {
            doneButton.setVisibility(0);
            continueButton.setVisibility(0);
            skipButton.setVisibility(0);
            float f1 = interpolateAlpha(f);
            f = interpolateAlpha(1.0F - f);
            doneButton.animate().alpha(f1).setDuration(0L);
            continueButton.animate().alpha(f).setDuration(0L);
            skipButton.animate().alpha(f).setDuration(0L);
        } else
        if (i == getLastPageIndex())
        {
            skipButton.setVisibility(4);
            continueButton.setVisibility(4);
            fadeViewPagerComponentsTo(Math.max(0.0F, 1.0F - 2.0F * f));
            return;
        }
    }

    private void handleScrollingStopped(int i)
    {
        currentPage = i;
        activityContainer.setBackgroundColor(colors[i]);
        if (i == getLastPageIndex())
        {
            doneButton.setVisibility(0);
            skipButton.setVisibility(4);
            continueButton.setVisibility(8);
            unfadeViewPagerComponents();
            return;
        } else
        {
            doneButton.setVisibility(8);
            skipButton.setVisibility(0);
            continueButton.setVisibility(0);
            return;
        }
    }

    private static float interpolateAlpha(float f)
    {
        return (float)Math.pow(f, 3D);
    }

    private void setComponentAlphaWithDuration(float f, long l)
    {
        viewPager.animate().alpha(f).setDuration(l);
        doneButton.animate().alpha(f).setDuration(l);
        skipButton.animate().alpha(f).setDuration(l);
        continueButton.animate().alpha(f).setDuration(l);
        pagingIndicator.animate().alpha(f).setDuration(l);
    }

    private void setupProgressBar()
    {
        android.view.View.OnClickListener onclicklistener = new android.view.View.OnClickListener() {

            final WarmWelcomeActivity this$0;

            public final void onClick(View view)
            {
                finishWarmWelcome();
            }

            
            {
                this$0 = WarmWelcomeActivity.this;
                super();
            }
        };
        skipButton.setOnClickListener(onclicklistener);
        doneButton.setOnClickListener(onclicklistener);
        continueButton.setOnClickListener(new android.view.View.OnClickListener() {

            final WarmWelcomeActivity this$0;

            public final void onClick(View view)
            {
                viewPager.setCurrentItem(viewPager.getCurrentItem() + 1);
            }

            
            {
                this$0 = WarmWelcomeActivity.this;
                super();
            }
        });
    }

    private void startIntroAnimation()
    {
        int i = getScreenHeight();
        AnimatorSet animatorset = new AnimatorSet();
        ObjectAnimator objectanimator = ObjectAnimator.ofFloat(splash, "translationY", new float[] {
            (float)i, 0.0F
        });
        objectanimator.setDuration(getResources().getInteger(0x10e0001));
        i = getResources().getInteger(0x10e0000);
        AnimatorSet animatorset1 = new AnimatorSet();
        ObjectAnimator objectanimator1 = ObjectAnimator.ofFloat(splash, "alpha", new float[] {
            1.0F, 0.0F
        }).setDuration(i);
        objectanimator1.setInterpolator(new DecelerateInterpolator());
        ObjectAnimator objectanimator2 = ObjectAnimator.ofFloat(warmWelcomeScreen, "alpha", new float[] {
            0.0F, 1.0F
        }).setDuration(i);
        objectanimator2.setInterpolator(new AccelerateInterpolator());
        ObjectAnimator objectanimator3 = ObjectAnimator.ofInt(activityContainer, "backgroundColor", new int[] {
            getResources().getColor(com.google.android.apps.walletnfcrel.R.color.application_background), colors[0]
        });
        objectanimator3.setEvaluator(colorEvaluator);
        objectanimator3.setDuration(i);
        animatorset1.playTogether(new Animator[] {
            objectanimator1, objectanimator2, objectanimator3
        });
        animatorset1.addListener(new AnimatorListenerAdapter() {

            final WarmWelcomeActivity this$0;

            public final void onAnimationEnd(Animator animator)
            {
                splashFinished = true;
                startWarmWelcome(0);
            }

            public final void onAnimationStart(Animator animator)
            {
                analyticsUtil.sendScreen("Warm Welcome Intro", new AnalyticsCustomDimension[0]);
                warmWelcomeScreen.setVisibility(0);
            }

            
            {
                this$0 = WarmWelcomeActivity.this;
                super();
            }
        });
        animatorset1.setStartDelay(getResources().getInteger(com.google.android.apps.walletnfcrel.R.integer.welcome_intro_delay_millis));
        animatorset.playSequentially(new Animator[] {
            objectanimator, animatorset1
        });
        animatorset.start();
    }

    private void startWarmWelcome(int i)
    {
        splash.setVisibility(8);
        warmWelcomeScreen.setVisibility(0);
        handleScrollingStopped(i);
        analyticsUtil.sendScreen(WarmWelcomeScreens.screens[i], new AnalyticsCustomDimension[0]);
    }

    private void unfadeViewPagerComponents()
    {
        setComponentAlphaWithDuration(1.0F, 400L);
    }

    protected final void doOnCreate(Bundle bundle)
    {
        getSupportActionBar().hide();
        setContentView(com.google.android.apps.walletnfcrel.R.layout.warm_welcome_activity);
        pagingIndicator = (PagingIndicator)Views.findViewById(this, com.google.android.apps.walletnfcrel.R.id.PagingIndicator);
        activityContainer = Views.findViewById(this, com.google.android.apps.walletnfcrel.R.id.ChildActivityContainer);
        warmWelcomeScreen = Views.findViewById(this, com.google.android.apps.walletnfcrel.R.id.WarmWelcomeScreen);
        skipButton = Views.findViewById(this, com.google.android.apps.walletnfcrel.R.id.SkipWarmWelcome);
        continueButton = Views.findViewById(this, com.google.android.apps.walletnfcrel.R.id.ContinueWarmWelcome);
        doneButton = Views.findViewById(this, com.google.android.apps.walletnfcrel.R.id.DoneWarmWelcome);
        splash = Views.findViewById(this, com.google.android.apps.walletnfcrel.R.id.WarmWelcomeSplash);
        activityContainer.setFitsSystemWindows(true);
        if (bundle != null)
        {
            splashFinished = bundle.getBoolean("SPLASH_FINISHED", false);
            currentPage = bundle.getInt("CURRENT_PAGE", 0);
        }
        viewPager = (DragFinishableViewPager)Views.findViewById(this, com.google.android.apps.walletnfcrel.R.id.Pager);
        viewPager.setAdapter(adapter);
        viewPager.setFinishListener(new Callable() {

            final WarmWelcomeActivity this$0;

            private Void call()
                throws Exception
            {
                finishWarmWelcome();
                return null;
            }

            public final volatile Object call()
                throws Exception
            {
                return call();
            }

            
            {
                this$0 = WarmWelcomeActivity.this;
                super();
            }
        });
        viewPager.setCurrentItem(currentPage, false);
        pagingIndicator.setViewPager(viewPager);
        pagingIndicator.setOnPageChangeListener(createPageChangeListener());
        colors = new int[WarmWelcomeScreens.length() + 1];
        for (int i = 0; i < WarmWelcomeScreens.length(); i++)
        {
            colors[i] = getResources().getColor(WarmWelcomeScreens.colors[i]);
        }

        colors[colors.length - 1] = colors[colors.length - 2];
        setupProgressBar();
        if (!splashFinished)
        {
            startIntroAnimation();
        } else
        {
            startWarmWelcome(currentPage);
        }
        OrientationController.setRequestedOrientationIfAllowed(this);
    }

    protected final boolean isWidthLimited()
    {
        return false;
    }

    protected void onSaveInstanceState(Bundle bundle)
    {
        bundle.putBoolean("SPLASH_FINISHED", splashFinished);
        bundle.putInt("CURRENT_PAGE", currentPage);
    }




/*
    static boolean access$102(WarmWelcomeActivity warmwelcomeactivity, boolean flag)
    {
        warmwelcomeactivity.splashFinished = flag;
        return flag;
    }

*/





}
