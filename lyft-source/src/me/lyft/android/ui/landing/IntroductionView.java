// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.landing;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import butterknife.ButterKnife;
import com.lyft.scoop.Scoop;
import me.lyft.android.ILyftPreferences;
import me.lyft.android.analytics.studies.OnBoardingAnalytics;
import me.lyft.android.common.AppFlow;
import me.lyft.android.controls.MultiClickListener;
import me.lyft.android.development.DeveloperTools;
import me.lyft.android.persistence.landing.ISignUpUserRepository;
import me.lyft.android.rx.Binder;
import rx.functions.Action1;

// Referenced classes of package me.lyft.android.ui.landing:
//            LandingFlow

public class IntroductionView extends FrameLayout
{

    AppFlow appFlow;
    DeveloperTools developerTools;
    TextView developmentView;
    TextView environmentName;
    LandingFlow landingFlow;
    View loginView;
    View lyftLogo;
    ILyftPreferences lyftPreferences;
    private final Action1 onDeveloperModeChanged = new Action1() {

        final IntroductionView this$0;

        public void call(Boolean boolean1)
        {
            boolean flag = lyftPreferences.isProductionEnvironment();
            if (boolean1.booleanValue() || !flag)
            {
                environmentName.setText(lyftPreferences.getEnvironmentName().toUpperCase());
                environmentName.setVisibility(0);
                developmentView.setVisibility(0);
                return;
            } else
            {
                environmentName.setVisibility(8);
                developmentView.setVisibility(8);
                return;
            }
        }

        public volatile void call(Object obj)
        {
            call((Boolean)obj);
        }

            
            {
                this$0 = IntroductionView.this;
                super();
            }
    };
    private final LandingScreens.IntroductionScreen params;
    ISignUpUserRepository signUpUserRepository;
    View signupView;

    public IntroductionView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        context = Scoop.a(this);
        context.b(this);
        params = (LandingScreens.IntroductionScreen)context.a();
    }

    protected void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        if (isInEditMode())
        {
            return;
        } else
        {
            OnBoardingAnalytics.trackInitiateOnboarding(params.getSource());
            Binder.attach(this).bind(developerTools.observeDeveloperMode(), onDeveloperModeChanged);
            signUpUserRepository.reset();
            return;
        }
    }

    protected void onFinishInflate()
    {
        super.onFinishInflate();
        if (isInEditMode())
        {
            return;
        } else
        {
            ButterKnife.a(this);
            loginView.setOnClickListener(new android.view.View.OnClickListener() {

                final IntroductionView this$0;

                public void onClick(View view)
                {
                    OnBoardingAnalytics.trackInitiateLogin();
                    landingFlow.openLoginScreen();
                }

            
            {
                this$0 = IntroductionView.this;
                super();
            }
            });
            signupView.setOnClickListener(new android.view.View.OnClickListener() {

                final IntroductionView this$0;

                public void onClick(View view)
                {
                    OnBoardingAnalytics.trackInitiateSignup();
                    landingFlow.openSignupScreen();
                }

            
            {
                this$0 = IntroductionView.this;
                super();
            }
            });
            environmentName.setOnClickListener(new android.view.View.OnClickListener() {

                final IntroductionView this$0;

                public void onClick(View view)
                {
                    appFlow.goTo(new LandingScreens.EnvironmentSwitcherScreen());
                }

            
            {
                this$0 = IntroductionView.this;
                super();
            }
            });
            developmentView.setOnClickListener(new android.view.View.OnClickListener() {

                final IntroductionView this$0;

                public void onClick(View view)
                {
                    appFlow.goTo(new me.lyft.android.ui.development.DevelopmentScreens.DevelopmentScreen());
                }

            
            {
                this$0 = IntroductionView.this;
                super();
            }
            });
            lyftLogo.setSoundEffectsEnabled(false);
            lyftLogo.setOnClickListener(new MultiClickListener() {

                final IntroductionView this$0;

                public void onMultiClick()
                {
                    developerTools.toggleDeveloperMode();
                }

            
            {
                this$0 = IntroductionView.this;
                super();
            }
            });
            return;
        }
    }
}
