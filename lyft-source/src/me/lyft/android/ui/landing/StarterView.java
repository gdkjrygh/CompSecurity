// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.landing;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import butterknife.ButterKnife;
import com.lyft.scoop.Scoop;
import me.lyft.android.ILyftPreferences;
import me.lyft.android.analytics.AsyncActionAnalytics;
import me.lyft.android.analytics.studies.RegistrationAnalytics;
import me.lyft.android.application.IAppInfoService;
import me.lyft.android.application.landing.ILandingService;
import me.lyft.android.common.AppFlow;
import me.lyft.android.common.DialogFlow;
import me.lyft.android.common.Strings;
import me.lyft.android.common.Unit;
import me.lyft.android.events.GeneralErrorDialogResultEvent;
import me.lyft.android.infrastructure.assets.IAssetPackagingService;
import me.lyft.android.infrastructure.facebook.IFacebookService;
import me.lyft.android.rx.AsyncCall;
import me.lyft.android.rx.Binder;
import me.lyft.android.rx.MessageBus;
import me.lyft.android.rx.SimpleSubscriber;
import me.lyft.android.ui.IViewErrorHandler;
import me.lyft.android.ui.dialogs.DialogResult;
import me.lyft.android.utils.VersionUtils;
import rx.Observable;
import rx.functions.Action1;

// Referenced classes of package me.lyft.android.ui.landing:
//            LandingFlow

public class StarterView extends FrameLayout
{

    AppFlow appFlow;
    IAppInfoService appInfoService;
    IAssetPackagingService assetPackagingService;
    private Binder binder;
    MessageBus bus;
    DialogFlow dialogFlow;
    IFacebookService facebookService;
    LandingFlow landingFlow;
    ILandingService landingService;
    View lyftLogo;
    ILyftPreferences lyftPreferences;
    Action1 onGenericErrorHappened;
    private final LandingScreens.StarterScreen params;
    View splashView;
    IViewErrorHandler viewErrorHandler;

    public StarterView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        onGenericErrorHappened = new Action1() {

            final StarterView this$0;

            public volatile void call(Object obj)
            {
                call((DialogResult)obj);
            }

            public void call(DialogResult dialogresult)
            {
                loadDataAndLaunchApp();
            }

            
            {
                this$0 = StarterView.this;
                super();
            }
        };
        context = Scoop.a(this);
        context.b(this);
        params = (LandingScreens.StarterScreen)context.a();
    }

    private void launchApp()
    {
        showLoadingAnimation();
        landingFlow.launchFirstScreen();
    }

    private void loadAppInfoAndStartLogin()
    {
        String s = Strings.nullToEmpty(lyftPreferences.getInstallReferrer());
        final AsyncActionAnalytics loadExperimentsAnalytics = RegistrationAnalytics.createLoadExperimentsAnalytics();
        loadExperimentsAnalytics.trackRequest();
        binder.bind(appInfoService.loadAppInfo(s), new AsyncCall() {

            final StarterView this$0;
            final AsyncActionAnalytics val$loadExperimentsAnalytics;

            public void onFail(Throwable throwable)
            {
                super.onFail(throwable);
                loadExperimentsAnalytics.trackResponseFailure(throwable);
            }

            public volatile void onSuccess(Object obj)
            {
                onSuccess((Unit)obj);
            }

            public void onSuccess(Unit unit)
            {
                loadExperimentsAnalytics.trackResponseSuccess();
            }

            public void onUnsubscribe()
            {
                super.onUnsubscribe();
                showLoadingAnimation();
                appFlow.resetTo(new LandingScreens.IntroductionScreen("new_user"));
            }

            
            {
                this$0 = StarterView.this;
                loadExperimentsAnalytics = asyncactionanalytics;
                super();
            }
        });
    }

    private void loadDataAndLaunchApp()
    {
        final AsyncActionAnalytics startAppAction = RegistrationAnalytics.createStartAppAnalytics();
        startAppAction.trackRequest();
        binder.bind(landingService.loadUser(), new AsyncCall() {

            final StarterView this$0;
            final AsyncActionAnalytics val$startAppAction;

            public void onFail(Throwable throwable)
            {
                super.onFail(throwable);
                startAppAction.trackResponseFailure(throwable);
                viewErrorHandler.handle(throwable);
            }

            public volatile void onSuccess(Object obj)
            {
                onSuccess((Unit)obj);
            }

            public void onSuccess(Unit unit)
            {
                super.onSuccess(unit);
                launchApp();
                startAppAction.trackResponseSuccess();
            }

            public void onUnsubscribe()
            {
                super.onUnsubscribe();
            }

            
            {
                this$0 = StarterView.this;
                startAppAction = asyncactionanalytics;
                super();
            }
        });
    }

    private void showLoadingAnimation()
    {
        if (VersionUtils.hasKitKat() && params.isLoadingAnimationEnabled() && !dialogFlow.hasActiveDialog())
        {
            dialogFlow.show(new LandingDialogs.AppLoadingDialog());
        }
    }

    protected void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        assetPackagingService.unpackEmbededZipResources().subscribe(new SimpleSubscriber());
        binder = Binder.attach(this);
        binder.bind(bus.observe(me/lyft/android/events/GeneralErrorDialogResultEvent), onGenericErrorHappened);
        if (Strings.isNullOrEmpty(lyftPreferences.getLyftToken()) && Strings.isNullOrEmpty(facebookService.getFacebookToken()))
        {
            loadAppInfoAndStartLogin();
            return;
        } else
        {
            loadDataAndLaunchApp();
            return;
        }
    }

    protected void onFinishInflate()
    {
        super.onFinishInflate();
        ButterKnife.a(this);
        if (params.isLoadingAnimationEnabled())
        {
            lyftLogo.setVisibility(8);
            splashView.setVisibility(0);
            return;
        } else
        {
            lyftLogo.setVisibility(0);
            splashView.setVisibility(8);
            return;
        }
    }



}
