// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.main;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.animation.AnticipateOvershootInterpolator;
import android.widget.ImageView;
import com.skype.Account;
import com.skype.SkyLib;
import com.skype.android.SkypeActivity;
import com.skype.android.SkypeActivityComponent;
import com.skype.android.SkypeConstants;
import com.skype.android.SkypeIntentHandler;
import com.skype.android.analytics.Analytics;
import com.skype.android.analytics.AnalyticsPersistentStorage;
import com.skype.android.app.Navigation;
import com.skype.android.app.settings.UserPreferences;
import com.skype.android.app.signin.PromptManualSignInFromSplashTelemetryEvent;
import com.skype.android.config.ecs.EcsConfiguration;
import com.skype.android.util.PerformanceLog;
import com.skype.android.util.StartupTimeReporter;
import com.skype.android.util.ViewStateManager;

// Referenced classes of package com.skype.android.app.main:
//            HubMaterialActivity, HubActivity

public class SplashActivity extends SkypeActivity
    implements SkypeConstants
{

    private static final int DISPLAY_TIME = 3000;
    private static final int SLIDE_UP_DISPLAY_TIME = 1200;
    Account account;
    Analytics analytics;
    AnalyticsPersistentStorage analyticsPersistentStorage;
    EcsConfiguration configuraton;
    SkypeIntentHandler intentHandler;
    SkyLib lib;
    private ImageView logo;
    Navigation navigation;
    ViewStateManager stateManager;
    UserPreferences userPreferences;

    public SplashActivity()
    {
    }

    private boolean autoLoginDefaultAccount()
    {
        String s = lib.getDefaultAccountName();
        if (!isFinishing() && !TextUtils.isEmpty(s) && account.getStatusProp() == com.skype.Account.STATUS.LOGGED_OUT_AND_PWD_SAVED)
        {
            Intent intent;
            boolean flag;
            if (userPreferences.getAccountLogoutReason() == com.skype.Account.LOGOUTREASON.LOGOUT_CALLED)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (flag)
            {
                intent = navigation.intentForLandingPageForUserWithPwdSaved();
            } else
            {
                intent = new Intent(this, getHomeActivity());
            }
            intent.setAction(getIntent().getAction());
            intent.setData(getIntent().getData());
            if (getIntent().getExtras() != null)
            {
                intent.putExtras(getIntent().getExtras());
            }
            intent.putExtra("autoSignIn", true);
            startActivity(intent);
            overridePendingTransition(0, 0);
            finish();
            if (flag)
            {
                recordPromptOfManualSignInFromSplashToTelemetry();
            }
            return true;
        } else
        {
            return false;
        }
    }

    private Class getHomeActivity()
    {
        if (!isMultipane())
        {
            return com/skype/android/app/main/HubMaterialActivity;
        } else
        {
            return com/skype/android/app/main/HubActivity;
        }
    }

    private boolean isMultipane()
    {
        return getResources().getBoolean(0x7f0d0003);
    }

    private void recordPromptOfManualSignInFromSplashToTelemetry()
    {
        analytics.a(new PromptManualSignInFromSplashTelemetryEvent(analyticsPersistentStorage.c()));
    }

    private boolean skipToNextActivity()
    {
        com.skype.Account.STATUS status = account.getStatusProp();
        if (status == com.skype.Account.STATUS.LOGGED_IN || status == com.skype.Account.STATUS.LOGGED_IN_PARTIALLY)
        {
            startActivityForIntent();
            overridePendingTransition(0, 0);
            finish();
            return true;
        } else
        {
            return autoLoginDefaultAccount();
        }
    }

    private void startActivityForIntent()
    {
        if (SkypeIntentHandler.a(getIntent().getAction()))
        {
            intentHandler.a(getIntent());
            return;
        }
        Intent intent = new Intent(this, getHomeActivity());
        if (getIntent().hasExtra("com.skype.index"))
        {
            intent.putExtra("com.skype.index", getIntent().getIntExtra("com.skype.index", 0));
        }
        intent.putExtra("coldSignIn", true);
        intent.setFlags(0x4000000);
        startActivity(intent);
    }

    private void startLandingPageActivity()
    {
        if (getIntent().getData() != null)
        {
            stateManager.a(getIntent());
        }
        navigation.toLandingPage(account, false);
        recordPromptOfManualSignInFromSplashToTelemetry();
        overridePendingTransition(0, 0);
        finish();
    }

    private void startLogin()
    {
        final ObjectAnimator animator = (ImageView)findViewById(0x7f100516);
        if (animator != null)
        {
            int i = getResources().getDimensionPixelSize(0x7f0c0047);
            animator = ObjectAnimator.ofFloat(logo, "y", new float[] {
                animator.getY() + (float)i
            });
            animator.setDuration(1200L);
            animator.setInterpolator(new AnticipateOvershootInterpolator());
            animator.addListener(new AnimatorListenerAdapter() {

                final SplashActivity this$0;

                public final void onAnimationEnd(Animator animator1)
                {
                    startLandingPageActivity();
                }

            
            {
                this$0 = SplashActivity.this;
                super();
            }
            });
            runOnUiThread(new Runnable() {

                final SplashActivity this$0;
                final ObjectAnimator val$animator;

                public final void run()
                {
                    animator.start();
                }

            
            {
                this$0 = SplashActivity.this;
                animator = objectanimator;
                super();
            }
            });
            return;
        } else
        {
            startLandingPageActivity();
            return;
        }
    }

    private void startLogoAnimation()
    {
        final AnimationDrawable animation = (AnimationDrawable)logo.getDrawable();
        logo.post(new Runnable() {

            final SplashActivity this$0;
            final AnimationDrawable val$animation;

            public final void run()
            {
                if (!animation.isRunning())
                {
                    animation.stop();
                }
                animation.start();
            }

            
            {
                this$0 = SplashActivity.this;
                animation = animationdrawable;
                super();
            }
        });
    }

    public void onCreate(Bundle bundle)
    {
        StartupTimeReporter.a().b();
        getComponent().inject(this);
        PerformanceLog.e.a("APP ACTION: start splash screen");
        Bundle bundle1 = getIntent().getExtras();
        if (bundle1 != null)
        {
            configuraton.setOverrides(bundle1);
        }
        if (skipToNextActivity())
        {
            setTheme(0x1030055);
            super.onCreate(bundle);
            return;
        } else
        {
            setTheme(0x7f0901a8);
            super.onCreate(bundle);
            setContentView(0x7f030111);
            ((ImageView)findViewById(0x7f100516)).setVisibility(4);
            logo = (ImageView)findViewById(0x7f10037c);
            logo.postDelayed(new Runnable() {

                final SplashActivity this$0;

                public final void run()
                {
                    startNextActivity();
                }

            
            {
                this$0 = SplashActivity.this;
                super();
            }
            }, 3000L);
            return;
        }
    }

    public void onResume()
    {
        super.onResume();
        PerformanceLog.e.a("APP ACTION: splash screen displayed");
    }

    public void onStart()
    {
        super.onStart();
        if (logo != null)
        {
            startLogoAnimation();
        }
    }

    protected void startNextActivity()
    {
        if (isFinishing()) goto _L2; else goto _L1
_L1:
        com.skype.Account.STATUS status;
        com.skype.Account.STATUS status1 = account.getStatusProp();
        status = status1;
        if (status1 == null)
        {
            status = com.skype.Account.STATUS.LOGGED_OUT;
        }
        static final class _cls5
        {

            static final int $SwitchMap$com$skype$Account$STATUS[];

            static 
            {
                $SwitchMap$com$skype$Account$STATUS = new int[com.skype.Account.STATUS.values().length];
                try
                {
                    $SwitchMap$com$skype$Account$STATUS[com.skype.Account.STATUS.LOGGED_IN.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror4) { }
                try
                {
                    $SwitchMap$com$skype$Account$STATUS[com.skype.Account.STATUS.LOGGED_IN_PARTIALLY.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    $SwitchMap$com$skype$Account$STATUS[com.skype.Account.STATUS.LOGGED_OUT.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    $SwitchMap$com$skype$Account$STATUS[com.skype.Account.STATUS.LOGGED_OUT_AND_PWD_SAVED.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    $SwitchMap$com$skype$Account$STATUS[com.skype.Account.STATUS.LOGGING_IN.ordinal()] = 5;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        _cls5..SwitchMap.com.skype.Account.STATUS[status.ordinal()];
        JVM INSTR tableswitch 1 4: default 64
    //                   1 65
    //                   2 65
    //                   3 70
    //                   4 70;
           goto _L2 _L3 _L3 _L4 _L4
_L2:
        return;
_L3:
        startActivityForIntent();
        return;
_L4:
        startLogin();
        return;
    }

}
